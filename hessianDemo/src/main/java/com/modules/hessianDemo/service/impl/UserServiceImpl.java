package com.modules.hessianDemo.service.impl;

import com.modules.hessianDemo.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2019/1/22 9:43
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService {

    @Override
    public String getDataFromServer(String param) {

        System.out.println("获取的数据是："+param);
        return "200";
    }

    @Override
    public String getDataFromClient(String param) {

        System.out.println("获取的数据是："+param);
        return "200";
    }
}
