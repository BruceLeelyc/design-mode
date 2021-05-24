package com.design.example.proxy.dynamic.jdk;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/24 18:20
 */
public class UserServiceImpl implements UserService {
    @Override
    public void getUser() {
        System.out.println("用户信息:名称:明亮,年龄:16,性别:男");
    }
}
