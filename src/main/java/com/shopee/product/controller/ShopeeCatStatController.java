package com.shopee.product.controller;

import com.alibaba.fastjson.JSONObject;
import com.shopee.product.model.ShopeeItems;
import com.shopee.product.service.ShopeeCatStatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ShopeeCatStatController
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2020/2/27/14:35
 */
@RestController
public class ShopeeCatStatController {


    @Autowired
    private ShopeeCatStatService shopeeCatStatService;


    /**
     * 分页查询接口
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public String pageList(Long catId){
        JSONObject object = new JSONObject();
        shopeeCatStatService.genCatStatData(catId);
        object.put("result","success");
        object.put("code","200");
        return object.toJSONString();
    }

}
