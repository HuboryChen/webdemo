package com.xtlh.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @作者 陈坤
 * @创建日期 2018/4/20
 * @功能描述 首页控制器
 */
@Controller
public class HomeController
{
    @RequestMapping("/")
    public String index()
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        return "index";
    }
}
