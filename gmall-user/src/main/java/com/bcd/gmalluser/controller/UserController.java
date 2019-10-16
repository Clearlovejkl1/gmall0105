package com.bcd.gmalluser.controller;

import com.bcd.gmallapi.bean.UmsMember;
import com.bcd.gmallapi.bean.UmsMemberReceiveAddress;
import com.bcd.gmallapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "hello Message";
    }
    /**
     * 搜索全部用户信息  ums_member 表全部信息
     */
    @ResponseBody
    @RequestMapping("/getAllUser")
        public List<UmsMember> getAllUser(){
       List<UmsMember> umsMembers =  userService.getAllUser();
        return umsMembers;
    }
    /**
     * 根据用户id查询收货地址
     */
    @ResponseBody
    @RequestMapping("/getAddressById")
    public List<UmsMemberReceiveAddress> getAddressById(String memberId){
        List<UmsMemberReceiveAddress> receiveAddresses =  userService.getAddressById(memberId);
        return receiveAddresses;
    }

}
