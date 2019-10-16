package com.bcd.gmallapi.service;


import com.bcd.gmallapi.bean.UmsMember;
import com.bcd.gmallapi.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    /**
     * 根据用户ID 查询出所有用户收货地址
     * @return
     * @param memberId
     */
    List<UmsMemberReceiveAddress> getAddressById(String memberId);
}
