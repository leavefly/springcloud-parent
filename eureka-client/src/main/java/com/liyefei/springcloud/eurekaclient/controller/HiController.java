package com.liyefei.springcloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author liyefei
 * @Description
 * @Since 2020/8/18 22:54
 **/
@RestController
public class HiController {

    @RequestMapping("hi")
    public String hi() {
        return "hi...";
    }
}
