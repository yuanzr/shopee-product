package com.shopee.product.service;


import com.alibaba.fastjson.JSONObject;
import com.shopee.product.param.ShopeeCatParam;
import java.net.URL;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class JsonReadService {


    public ShopeeCatParam getJsonObj(String fileName) {
        String jsonText = getDatafromFile(fileName);
        ShopeeCatParam shopeeCatParam = JSONObject.parseObject(jsonText, ShopeeCatParam.class);
        return shopeeCatParam;
    }

    /**
     * shopee-category-th
     */
    public static String getDatafromFile(String fileName) {
        URL url = ClassLoader.getSystemResource("json/category/" + fileName + ".json");
        BufferedReader reader = null;
        String laststr = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(url.getPath());
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            reader = new BufferedReader(inputStreamReader);
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                laststr += tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return laststr;
    }


    //    <!--产品详情连接-->
//    https://shopee.co.th/产品title-i.shopid.itemid
    public static void main(String[] args) {


    }

}
