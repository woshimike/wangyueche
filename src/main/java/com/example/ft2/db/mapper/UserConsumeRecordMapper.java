package com.example.ft2.db.mapper;

import com.example.acoustic.db.entity.UserConsumeRecord;
import com.example.acoustic.db.entity.UserConsumeRecordExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserConsumeRecordMapper {
    int countByExample(UserConsumeRecordExample example);

    int deleteByExample(UserConsumeRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserConsumeRecord record);

    int insertSelective(UserConsumeRecord record);

    List<UserConsumeRecord> selectByExampleWithRowbounds(UserConsumeRecordExample example, RowBounds rowBounds);

    List<UserConsumeRecord> selectByExample(UserConsumeRecordExample example);

    UserConsumeRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserConsumeRecord record, @Param("example") UserConsumeRecordExample example);

    int updateByExample(@Param("record") UserConsumeRecord record, @Param("example") UserConsumeRecordExample example);

    int updateByPrimaryKeySelective(UserConsumeRecord record);

    int updateByPrimaryKey(UserConsumeRecord record);
}