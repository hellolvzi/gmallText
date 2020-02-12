package com.lv.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.lv.gmall.bean.UmsMember;
import com.lv.gmall.service.UserService;
import com.lv.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


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
