package com.example.ft2.db.mapper;

import com.example.acoustic.db.entity.DailyData;
import com.example.acoustic.db.entity.DailyDataExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface DailyDataMapper {
    int countByExample(DailyDataExample example);

    int deleteByExample(DailyDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DailyData record);

    int insertSelective(DailyData record);

    List<DailyData> selectByExampleWithRowbounds(DailyDataExample example, RowBounds rowBounds);

    List<DailyData> selectByExample(DailyDataExample example);

    DailyData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DailyData record, @Param("example") DailyDataExample example);

    int updateByExample(@Param("record") DailyData record, @Param("example") DailyDataExample example);

    int updateByPrimaryKeySelective(DailyData record);

    int updateByPrimaryKey(DailyData record);
}