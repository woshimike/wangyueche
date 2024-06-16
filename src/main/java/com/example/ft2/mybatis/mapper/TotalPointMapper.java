package com.example.ft2.mybatis.mapper;

import com.example.ft2.mybatis.po.TotalPoint;
import java.util.List;

public interface TotalPointMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TotalPoint record);

    TotalPoint selectByPrimaryKey(Integer id);

    List<TotalPoint> selectAll();

    int updateByPrimaryKey(TotalPoint record);
}