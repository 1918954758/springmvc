package com.provider.service.impl;

import com.api.service.QueryRelationInfo;

import java.util.Map;

/**
 * @ClassName QueryRelationInfo
 * @Discription 查询关系人信息实现类
 * @Author 子辰
 * @Date 2020/11/1 12:30
 */
public class QueryRelationInfoImpl implements QueryRelationInfo {

    @Override
    public String queryRelation(Map<String, Object> param) {
        StringBuilder result = new StringBuilder();
        result.append("查询到的数据是：abc").append("查询参数是：").append(param);
        return result.toString();
    }
}
