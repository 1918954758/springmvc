package com.zichen.ssm.service.impl;

import com.zichen.ssm.bean.Media;
import com.zichen.ssm.mapper.MediaMapper;
import com.zichen.ssm.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MediaServiceImpl
 * @Discription 实现类
 * @Author 子辰
 * @Date 2020/11/1 14:03
 */
@Service
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaMapper sqlMap;

    @Override
    public int saveMedia(Media media) {
        return sqlMap.saveMedia(media);
    }

    @Override
    public List<Media> queryAll() {
        return sqlMap.queryAll();
    }
}
