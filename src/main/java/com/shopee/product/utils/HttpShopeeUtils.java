package com.shopee.product.utils;

import com.alibaba.fastjson.JSONObject;
import com.shopee.product.param.ShopeeItemParam;
import com.shopee.product.param.ShopeeItemsParam;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 虾皮数据接口
 */
public class HttpShopeeUtils {

    private static final Logger logger = LoggerFactory.getLogger(HttpShopeeUtils.class);



   private static final Integer pageSize = 50;

    /**
     * 商品信息列表,按照月销量排序
     * @return
     * @throws Exception
     */
    public static String executeShopeeGet(String catName,Long catId,Integer pageNum) throws Exception {
        String url ="https://shopee.co.th/api/v2/search_items/?by=sales&"+
                    "limit="+ pageSize +
                    "&match_id="+ catId +
                    "&newest="+(pageNum*pageSize) +"&order=desc&page_type=search&version=2";

        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 设置超时时间
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(50000).setConnectionRequestTimeout(5000)
                .setSocketTimeout(30000).build();

        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);




        httpGet.setHeader("User-Agent", "PostmanRuntime/7.22.0");
        httpGet.setHeader("Accept", MediaType.ALL_VALUE);
        httpGet.setHeader("accept", MediaType.ALL_VALUE);
        httpGet.setHeader("Cache-Control","no-cache");
        httpGet.setHeader("Postman-Token","6b8f5b38-3890-4eb3-b4b3-28aa8008b5f3");
        httpGet.setHeader("Host","shopee.co.th");
        httpGet.setHeader("Accept-Encoding","gzip, deflate, br");
        httpGet.setHeader("Connection","keep-alive");
        //设置cookie
        httpGet.setHeader("cookie","_gcl_au=1.1.731384262.1582508487; SPC_IA=-1; SPC_EC=-; SPC_U=-; SPC_F=fedKVQGPeTPQLX7WlQw4IoRo21RcsCpZ; REC_T_ID=5f46e4c2-56a7-11ea-b422-5254000679ca; language=th; _ga=GA1.3.2056303631.1582508503; SPC_SI=m77x7sefu94rd23wxz9swo30auquipc7; _gid=GA1.3.1605026183.1582770567; __utma=212512342.2056303631.1582508503.1582773347.1582773347.1; __utmc=212512342; __utmz=212512342.1582773347.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); csrftoken=gLB8JsmcGDPx3WwALUR8V32cwTWrrgNr; _dc_gtm_UA-61914165-6=1; _gali=main; SPC_R_T_ID=\"KkWB/QoV55wyCJUSb3KKHXNmPV7nwxeuTQDPcR9kr2D6EAOjT5qBZUcwLfhfHvPgy0I8R5CO8FtrpFBXagNdj5rd1yehK7V1UuPu+VSUTwE=\"; SPC_T_IV=\"JwejYUOLBgmrqanbnRPZIA==\"; SPC_R_T_IV=\"JwejYUOLBgmrqanbnRPZIA==\"; SPC_T_ID=\"KkWB/QoV55wyCJUSb3KKHXNmPV7nwxeuTQDPcR9kr2D6EAOjT5qBZUcwLfhfHvPgy0I8R5CO8FtrpFBXagNdj5rd1yehK7V1UuPu+VSUTwE=\"");
        //referer规则:https://shopee.co.th/分类名称-cat.分类ID,?page=0&sortBy=sales
        httpGet.setHeader("referer","https://shopee.co.th/%E0%B8%AA%E0%B8%B1%E0%B8%95%E0%B8%A7%E0%B9%8C%E0%B9%80%E0%B8%A5%E0%B8%B5%E0%B9%89%E0%B8%A2%E0%B8%87-cat.2083?page=20&sortBy=sales");

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


    public static void main(String[] args) throws Exception {
        String result = executeShopeeGet("สัตว์เลี้ยง", 17116L, 0);
        ShopeeItemsParam shopeeItemParam = JSONObject.parseObject(result, ShopeeItemsParam.class);

        if (shopeeItemParam!=null){
            System.out.println("success");
        }



    }

}
