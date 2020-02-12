package com.lv.gmall.user.mapper;

import com.lv.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface    UserMapper extends Mapper<UmsMember> {
     List<UmsMember> getuserList();
}
