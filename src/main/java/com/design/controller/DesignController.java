package com.design.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DesignController
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 10:36
 */
@RestController
@RequestMapping("design/")
public class DesignController {

    @ResponseBody
    @RequestMapping("/hello")
    public Object sayHello() {
        return "hello world";
    }
}
