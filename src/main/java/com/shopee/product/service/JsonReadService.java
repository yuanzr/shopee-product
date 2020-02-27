package com.shopee.product.service;


import com.alibaba.fastjson.JSONObject;
import com.shopee.product.param.ShopeeCatParam;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class JsonReadService {


    public ShopeeCatParam getJsonObj(){
        String jsonText = getDatafromFile("shopee-category-th");
        ShopeeCatParam shopeeCatParam = JSONObject.parseObject(jsonText, ShopeeCatParam.class);
        return shopeeCatParam;
    }

    /**
     * shopee-category-th
     * @param fileName
     * @return
     */
    public String getDatafromFile(String fileName) {

        String Path="E:\\workplace\\shopee-product\\src\\main\\resources\\json\\" + fileName+ ".json";
        BufferedReader reader = null;
        String laststr = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(Path);
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
