package com.consumer.service.test;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName DemoConsumerTest
 * @Discription 消费者测试类
 * @Author 子辰
 * @Date 2020/11/1 11:13
 */
public class DemoConsumerTest {
    private static final Logger logger = LoggerFactory.getLogger(DemoConsumerTest.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        logger.debug("Dubbo consumer start ...");
        DemoService demoService = (DemoService) context.getBean("demoService");
        String returnStr = demoService.hello("子辰！");
        logger.info("调用provider返回信息： " + returnStr);
        try {
            System.in.read();
        } catch (IOException e) {
            logger.error("Dubbo consumer end ...");
        }
    }
}
