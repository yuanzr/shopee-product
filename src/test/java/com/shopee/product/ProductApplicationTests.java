package com.shopee.product;

import com.shopee.product.model.ShopeeCat;
import com.shopee.product.service.ShopeeCatService;
import com.shopee.product.service.ShopeeCatStatService;
import com.shopee.product.service.ShopeeCommentCountService;
import com.shopee.product.service.ShopeeItemsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    private ShopeeCatService shopeeCatService;

    @Autowired
    private ShopeeItemsService shopeeItemsService;

    @Autowired
    private ShopeeCatStatService shopeeCatStatService;
    @Autowired
    private ShopeeCommentCountService shopeeCommentCountService;

    @Test
    void contextLoads() {
        shopeeCatService.insertList();
    }


    @Test
    void insertShopeeItems() {
        shopeeItemsService.insertList();
    }


    @Test
    void updateItemCat() {
        shopeeItemsService.updateItemCat();
    }



    @Test
    void genCatStatData() {
        shopeeCatStatService.genCatStatData(2083L);
    }




    @Test
    void importJsonData() {
        Integer parentId = 14278;
        Integer regionNo = 886;
        shopeeCatStatService.importJsonData(parentId.longValue(),regionNo);
    }


    @Test
    void getJsonShopeeCatData() {
        List<String> firstCatList  = new ArrayList<>();//一级分类
        Map<String,List<String>> firstCatMap = new HashMap<>();//一级类目中的二级分类
        Map<String,List<String>> secondCatMap = new HashMap<>();//二级类目中的三级级分类
        List<ShopeeCat> allCatSimple = shopeeCatService.getAllCatSimple();
        for (ShopeeCat shopeeCat : allCatSimple) {
            firstCatList.add(shopeeCat.getDisplayName());
            List<ShopeeCat> subList = shopeeCat.getSubList();
            List<String> secondCatList  = new ArrayList<>();//二级分类
            for (ShopeeCat sencondCat : subList) {
                secondCatList.add(sencondCat.getDisplayName());
                List<String> thirdCatList  = new ArrayList<>();//三级分类
                List<ShopeeCat> subSubList = sencondCat.getSubList();
                for (ShopeeCat thirdCat : subSubList) {
                    thirdCatList.add(thirdCat.getDisplayName());
                }
                secondCatMap.put(sencondCat.getDisplayName(),thirdCatList);
            }
            firstCatMap.put(shopeeCat.getDisplayName(),secondCatList);
        }
        //1.先打印所有一级类
//        for (String first : firstCatList) {
//            System.out.println(first);
//        }
//        System.out.println("=================================");
        //2.再依次打印所有一级类目中的二级类目
        int i = 1;
        for (String first : firstCatList) {
            List<String> secondList = firstCatMap.get(first);
            for (String second : secondList) {
                List<String> thirdList = secondCatMap.get(second);
                System.out.println(i+">"+first+">"+second+">"+thirdList.size());
                for (String third : thirdList) {
                    System.out.println(third);
                }
            }
            System.out.println("=================================");
            i++;
        }

        //3.打印一个二级类目,再打印二级类目下的所有三级类目
    }

    @Test
    void importItemCommment() {
        shopeeCommentCountService.insert();
    }

    public static void main(String[] args) {
        String str ="2ef195d3358b44db943a8d59c0d8b468\n" +
                "2ef8d1c89962432595561ca6697ff8d8\n" +
                "30b870d8392b43b1b389d367567eda17\n" +
                "30da4194cf554aa3b9c0db43ba53421f\n" +
                "315369ba22424ab89b4331185ef05ad7\n" +
                "32ba3ff30e7f417d98f8abe03993703d\n" +
                "32e48928408648fa99639a0bf84032e1\n" +
                "332efdc2fc124c8db2174a8393b6ea08\n" +
                "348a21b039a14d4591f52ff521a8ab96\n" +
                "34a5d3dfde5344dd91eff5de64584880\n" +
                "34bb2c7bfdd945f28f09034bbd35a3dc\n" +
                "350df5f858d94a07aeae4a57eac2c997\n" +
                "380149b2c5aa4e3eb2d6c76f6493db8a";
        String[] split = str.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String tr : split) {
            sb.append("\"").append(tr).append("\"").append(",");
        }
        System.out.println(sb.toString());
    }
}
