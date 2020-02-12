package com.lv.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lv.gmall.bean.UmsMember;
import com.lv.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
    UserService userService;

    @RequestMapping("getuserList")
    @ResponseBody
    public List<UmsMember> getuserList(){
        List<UmsMember> usetList = userService.getuserList();
        return usetList;
    }

}
