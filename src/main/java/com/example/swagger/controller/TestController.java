package com.example.swagger.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@Api(value = "测试Controller")
public class TestController {

    @RequestMapping(value = "api",method = RequestMethod.GET)
    @ApiOperation(value = "第一个接口测试方法")
    public String api(@RequestParam(name = "name")String name){

        return "Success";
    }


}
