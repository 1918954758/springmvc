package com.zichen.ssm.mapper;

import com.zichen.ssm.bean.Media;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @ClassName MediaMapper
 * @Discription mapper
 * @Author 子辰
 * @Date 2020/11/1 14:00
 */
@Repository
public interface MediaMapper {
    public int saveMedia(Media media);
    public List<Media> queryAll();
}
