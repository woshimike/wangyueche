package com.example.ft2.db.mapper;

import com.example.ft2.db.entity.SendScore;
import com.example.ft2.db.entity.SendScoreExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface SendScoreMapper {
    int countByExample(SendScoreExample example);

    int deleteByExample(SendScoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SendScore record);

    int insertSelective(SendScore record);

    List<SendScore> selectByExampleWithRowbounds(SendScoreExample example, RowBounds rowBounds);

    List<SendScore> selectByExample(SendScoreExample example);

    SendScore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SendScore record, @Param("example") SendScoreExample example);

    int updateByExample(@Param("record") SendScore record, @Param("example") SendScoreExample example);

    int updateByPrimaryKeySelective(SendScore record);

    int updateByPrimaryKey(SendScore record);
}