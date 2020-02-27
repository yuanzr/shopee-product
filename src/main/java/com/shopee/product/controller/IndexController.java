package com.shopee.product.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    /**
     * 跳转上传图片页面
     * @return
     */
    @GetMapping("/")
    public String login(){
        return "main/login";
    }

    /**
     * 跳转上传图片页面
     * @return
     */
    @GetMapping("/tables")
    public String tables(){
        return "main/tables";
    }


    /**
     * 跳转上传图片页面
     * @return
     */
    @GetMapping("/forms")
    public String forms(){
        return "main/forms";
    }


    /**
     * 跳转上传图片页面
     * @return
     */
    @GetMapping("/register")
    public String register(){
        return "main/register";
    }

    /**
     * 跳转上传图片页面
     * @return
     */
    @GetMapping("/charts")
    public String charts(){
        return "main/charts";
    }

}
