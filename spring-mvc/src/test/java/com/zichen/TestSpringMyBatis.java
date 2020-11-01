package com.zichen;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.zichen.ssm.bean.Media;
import com.zichen.ssm.mapper.MediaMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName TestSpringMyBatis
 * @Discription 测试类
 * @Author 子辰
 * @Date 2020/11/1 14:14
 */
public class TestSpringMyBatis {
    private static final Logger logger = LoggerFactory.getLogger(TestSpringMyBatis.class);

    @Test
    public void saveMedia() {
        logger.debug("start--------------------");
        //初始化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //获取bean
        MediaMapper mediaMapper = context.getBean(MediaMapper.class);
        //访问数据库
        Media media = new Media();
        //media.setCreated_time("202-11-01 14:18:06");
        media.setMedia_id("123457");
        media.setStatus("1");
        media.setType("2");

        mediaMapper.saveMedia(media);
        logger.debug("end--------------------");
    }

    @Test
    public void selectAll() {
        logger.debug("start--------------------");
        //初始化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //获取bean
        MediaMapper mediaMapper = context.getBean(MediaMapper.class);
        List<Media> mediaList = mediaMapper.queryAll();
        Iterator<Media> it = mediaList.iterator();
        while (it.hasNext()) {
            Media next = it.next();
            String created_time = next.getCreated_time();
            String media_id = next.getMedia_id();
            String status = next.getStatus();
            String type = next.getType();
            logger.info("数据：【" +  created_time + ", " + media_id + ", " + status + ", " + type + "】");
        }
        logger.debug("end--------------------");
    }
}
