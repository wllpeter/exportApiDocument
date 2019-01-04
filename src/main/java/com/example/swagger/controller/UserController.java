package com.example.swagger.controller;

import com.example.swagger.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user", produces =  MediaType.APPLICATION_JSON_VALUE)
@Api(value = "用户信息查询", description = "用户基本信息操作API", tags = "UserApi", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @ApiOperation(value = "/getUser", notes = "根据姓名查询用户信息")
    @RequestMapping(value = "getUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User getUser(@RequestParam("name") String name){
        User user = new User();
        user.setId(123456);
        user.setName(name);
        user.setAge(25);
        user.setAddress("河南郑州");
        user.setSex("男");
        return user;
    }
    @ApiOperation(value = "/addUser", notes = "添加一个用户")
    @RequestMapping(value = "addUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User addUser(@RequestBody User user){
        return user;
    }
}
