package com.bcd.gmalluser.mapper;


import com.bcd.gmallapi.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    /**
     * 查询所有用户信息
     * @return
     */
    List<UmsMember> selectAllUser();
}
