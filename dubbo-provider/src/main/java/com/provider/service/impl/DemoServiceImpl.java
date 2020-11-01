package com.provider.service.impl;

import com.api.service.DemoService;

/**
 * @ClassName DemoServiceImpl
 * @Discription 接口实现类
 * @Author 子辰
 * @Date 2020/11/1 10:55
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
        return "你好 " + name;
    }
}
