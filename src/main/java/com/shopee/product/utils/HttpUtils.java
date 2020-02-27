package com.shopee.product.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by liuguofu on 2017/7/10.
 */
public class HttpUtils {
    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);
    private static PoolingHttpClientConnectionManager cm;
    private static String EMPTY_STR = "";
    private static String CONTENT_TYPE_UTF_8 = "UTF-8";
    private static String CONTENT_TYPE_GBK = "GBK";
    private static String CONTENT_TYPE_JSON = "application/json";
    private static final int CONNECTION_TIMEOUT_MS = 60000;
    private static final int SO_TIMEOUT_MS = 60000;

    private static final String proxy_host = "127.0.0.1";
    private static final int proxy_port = 1080;

    public  static final String cookie = "SPC_IA=-1; SPC_EC=-; SPC_F=AkMLMfR3WOnh9LwvVoQ99EYtgsGGZPwI; REC_T_ID=c4735858-5611-11ea-a4db-9c7da3191b3f; SPC_SI=cspqu5wrpe75u69o2cudnppnwmswtzli; SPC_U=-; SPC_R_T_ID=\"vYvrzPrZeCEW9/cm+fnUR9TsO0WmMY1CRu6bZfJuUacCpLvZ6hnhPmMRmrt9W0D0kGgUsR5Rw9XImV9vzMxLxmHb05HqrPzohQE9afRueWs=\"; SPC_T_IV=\"ohQ/+WgeYLh3vnm1HPtBgA==\"; SPC_R_T_IV=\"ohQ/+WgeYLh3vnm1HPtBgA==\"; SPC_T_ID=\"vYvrzPrZeCEW9/cm+fnUR9TsO0WmMY1CRu6bZfJuUacCpLvZ6hnhPmMRmrt9W0D0kGgUsR5Rw9XImV9vzMxLxmHb05HqrPzohQE9afRueWs=\"";



    private static void init() {
        if (cm == null) {
            cm = new PoolingHttpClientConnectionManager();
            cm.setMaxTotal(50);// 整个连接池最大连接数
            cm.setDefaultMaxPerRoute(5);// 每路由最大连接数,默认值是2
            SocketConfig sc = SocketConfig.custom().setSoTimeout(SO_TIMEOUT_MS).build();
            cm.setDefaultSocketConfig(sc);
        }
    }


    public static String executeGet(String url) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 设置超时时间
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(50000).setConnectionRequestTimeout(5000)
                .setSocketTimeout(30000).build();

        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        httpGet.setHeader("User-Agent",cookie);
        httpGet.setHeader("Accept","*/*");
        httpGet.setHeader("Cache-Control","no-cache");
        httpGet.setHeader("Postman-Token","3cfe87af-603f-499b-bbb0-0c01453f25b5");
        httpGet.setHeader("Host","shopee.co.th");
        httpGet.setHeader("Accept-Encoding","gzip, deflate, br");



        HttpResponse response = httpClient.execute(httpGet);
        InputStream is = response.getEntity().getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            logger.error("executeGet error..." + httpGet.getURI());
        } finally {
            if (httpGet != null) {
                httpGet.releaseConnection();
            }

            if (httpClient != null) {
                httpClient.close();
            }

            try {
                is.close();
            } catch (IOException e) {
                logger.error("executeGet close is error..." + httpGet.getURI());
            }
        }
        return sb.toString();
    }

    /**
     * Post发送请求
     *
     * @param url    请求地址
     * @param params map对象
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String executePost(String url, Map<String, Object> params, boolean proxy) throws UnsupportedEncodingException {
        HttpPost httpPost = new HttpPost(url);
        ArrayList pairs = covertParams2NVPS(params);
        httpPost.setEntity(new UrlEncodedFormEntity(pairs, CONTENT_TYPE_UTF_8));
        if (proxy) {
            return getProxyResult(httpPost);
        } else {
            return getResult(httpPost);
        }
    }

    private static ArrayList covertParams2NVPS(Map<String, Object> params) {
        ArrayList pairs = new ArrayList<>();
        for (Map.Entry param : params.entrySet()) {
            pairs.add(new BasicNameValuePair((String) param.getKey(), (String) param.getValue()));
        }

        return pairs;
    }


    /**
     * 处理Http请求
     *
     * @param request
     * @return
     */
    private static String getResult(HttpRequestBase request) {
        RequestConfig.Builder config = RequestConfig.copy(RequestConfig.DEFAULT);
        config.setConnectionRequestTimeout(CONNECTION_TIMEOUT_MS);
        config.setSocketTimeout(SO_TIMEOUT_MS);
        request.setConfig(config.build());
        /// CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpClient httpClient = getHttpClient();
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(request);
            /// response.getStatusLine().getStatusCode();
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // long len = entity.getContentLength();// -1 表示长度未知
                return EntityUtils.toString(entity);
            }
        } catch (IOException e) {
            logger.error("execute getResult error..." + request.getURI());
        } finally {
            try {
                // 释放Socket流
                assert response != null;
                response.close();
                // 释放Connection
                /// httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return EMPTY_STR;
    }

    /**
     * 获取设置代理请求的结果
     *
     * @param request
     * @return
     */
    private static String getProxyResult(HttpRequestBase request) {
        HttpHost httpHost = new HttpHost(proxy_host, proxy_port);

        RequestConfig.Builder config = RequestConfig.copy(RequestConfig.DEFAULT);
        config.setConnectionRequestTimeout(CONNECTION_TIMEOUT_MS);
        config.setSocketTimeout(SO_TIMEOUT_MS);
        config.setProxy(httpHost);

        request.setConfig(config.build());

        CloseableHttpClient httpClient = getHttpClient();
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                return EntityUtils.toString(entity);
            }
        } catch (IOException e) {
            logger.error("execute getProxyResult error..." + request.getURI());
        } finally {
            try {
                assert response != null;
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return EMPTY_STR;
    }

    /**
     * 通过连接池获取HttpClient
     *
     * @return
     */
    private static CloseableHttpClient getHttpClient() {
        init();
        return HttpClients.custom().setConnectionManager(cm).setConnectionManagerShared(true).build();
    }

    public static boolean isSuccess(int code) {
        return code == 200;
    }


    /**
     * 泰文翻译英文
     * @param key
     * @return
     */
    public static String translate(String key){
//        http://translate.google.cn/translate_a/single?client=gtx&dt=t&dj=1&ie=UTF-8&sl=th&tl=en&q=เสื้อเชิ้ต
        try {
            String result = executeGet("http://translate.google.cn/translate_a/single?client=gtx&dt=t&dj=1&ie=UTF-8&sl=th&tl=en&q=" + key);
            JSONObject jsonObject = JSONObject.parseObject(result);
            JSONArray sentences = jsonObject.getJSONArray("sentences");
            JSONObject jsonObject1 = sentences.getJSONObject(0);
            String trans = jsonObject1.get("trans").toString();
            return trans;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }





    public static void main(String args[]){
        try {
            String result = executeGet("https://shopee.co.th/api/v2/item/get?itemid=2902440663&shopid=138020609");
            JSONObject jsonObject = JSONObject.parseObject(result);
            String json = jsonObject.toJSONString();
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
