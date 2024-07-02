package com.example.ft2.db.mapper;

import com.example.ft2.db.entity.VideoRecord;
import com.example.ft2.db.entity.VideoRecordExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface VideoRecordMapper {
    int countByExample(VideoRecordExample example);

    int deleteByExample(VideoRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VideoRecord record);

    int insertSelective(VideoRecord record);

    List<VideoRecord> selectByExampleWithRowbounds(VideoRecordExample example, RowBounds rowBounds);

    List<VideoRecord> selectByExample(VideoRecordExample example);

    VideoRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VideoRecord record, @Param("example") VideoRecordExample example);

    int updateByExample(@Param("record") VideoRecord record, @Param("example") VideoRecordExample example);

    int updateByPrimaryKeySelective(VideoRecord record);

    int updateByPrimaryKey(VideoRecord record);
}