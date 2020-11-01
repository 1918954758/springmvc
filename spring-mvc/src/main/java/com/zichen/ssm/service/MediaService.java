package com.zichen.ssm.service;

import com.zichen.ssm.bean.Media;

import java.util.List;

/**
 * @ClassName MediaService
 * @Discription 接口
 * @Author 子辰
 * @Date 2020/11/1 14:02
 */
public interface MediaService {
    public int saveMedia(Media media);
    public List<Media> queryAll();
}
