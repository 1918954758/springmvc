package com.provider.service.test;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName DemoServiceTest
 * @Discription 提供者测试类
 * @Author 子辰
 * @Date 2020/11/1 11:07
 */
public class DemoProviderTest {
    private static final Logger logger = LoggerFactory.getLogger(DemoProviderTest.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        logger.debug("Dubbo provider start ...");

        try {
            System.in.read();
        } catch (IOException e) {
            logger.error("Dubbo provider end ...", e);
        }
    }
}
