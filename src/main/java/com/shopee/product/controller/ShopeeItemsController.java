package com.shopee.product.controller;


import com.alibaba.fastjson.JSONObject;
import com.shopee.product.model.ShopeeItems;
import com.shopee.product.service.ShopeeItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/shopee/items")
public class ShopeeItemsController {

    @Autowired
    private ShopeeItemsService shopeeItemsService;


    /**
     * 跳转上传图片页面
     * @return
     */
    @GetMapping("/")
    public String charts(ShopeeItems entity, Integer page, Integer pageNum){
        return "main/shopee-items-datatables";
    }



    /**
     * 分页查询接口
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public String pageList(ShopeeItems entity, Integer page, Integer pageNum){
        JSONObject object = new JSONObject();
        List<ShopeeItems> list = shopeeItemsService.list(entity, page, pageNum);
        object.put("list",list);
        return object.toJSONString();
    }
}
