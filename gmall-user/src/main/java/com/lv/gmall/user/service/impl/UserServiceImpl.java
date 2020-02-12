package com.lv.gmall.user.service.impl;


import com.lv.gmall.bean.UmsMember;
import com.lv.gmall.service.UserService;
import com.lv.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getuserList() {

        List<UmsMember> usetList = userMapper.selectAll();

            return usetList;


    }
}
