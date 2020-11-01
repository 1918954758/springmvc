package com.consumer.service.test;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.api.service.QueryRelationInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName QueryRelationInfoTest
 * @Discription 查询关系人测试类
 * @Author 子辰
 * @Date 2020/11/1 12:38
 */
public class QueryRelationInfoTest {
    private static final Logger logger = LoggerFactory.getLogger(QueryRelationInfo.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        QueryRelationInfo queryRelationInfo = (QueryRelationInfo) context.getBean("queryRelationInfo");
        logger.debug("Relation查询start ...");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("deptId", "999999");
        params.put("relationId", "123456");
        String result = queryRelationInfo.queryRelation(params);
        logger.info(result);
        logger.debug("Relation查询end ...");

        try {
            System.in.read();
        } catch (IOException e) {
            logger.debug("Dubbo query end ...");
        }
    }

}
