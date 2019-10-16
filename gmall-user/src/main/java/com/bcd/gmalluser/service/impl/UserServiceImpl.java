package com.bcd.gmalluser.service.impl;

import com.bcd.gmallapi.bean.UmsMember;
import com.bcd.gmallapi.bean.UmsMemberReceiveAddress;
import com.bcd.gmalluser.mapper.UmsMemberReceiveAddressMapper;
import com.bcd.gmallapi.service.UserService;
import com.bcd.gmalluser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
 /*   @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;*/

    /**
     * 获取所有用户信息
     * @return
     */
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = null; //userMapper.selectAllUser();
        umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    /**
     * 根据用户ID 查询出所有用户收货地址
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> getAddressById(String receive) {
        //UmsMemberReceiveAddress 里面放的是泛型
      /*  Example e = new Example(UmsMemberReceiveAddress.class);
        //第一个代表实体类属性，第二个代表参数值
        UmsMemberReceiveAddress ums = new UmsMemberReceiveAddress();
        ums.setMemberId(receive);
        ums.setName("大gou");
        e.createCriteria().andEqualTo(ums);
        List<UmsMemberReceiveAddress> addressList = umsMemberReceiveAddressMapper.selectByExample(e);*/
        return null;
    }
}
