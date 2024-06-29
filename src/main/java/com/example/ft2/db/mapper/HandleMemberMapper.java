package com.example.ft2.db.mapper;

import com.example.acoustic.db.entity.HandleMember;
import com.example.acoustic.db.entity.HandleMemberExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface HandleMemberMapper {
    int countByExample(HandleMemberExample example);

    int deleteByExample(HandleMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HandleMember record);

    int insertSelective(HandleMember record);

    List<HandleMember> selectByExampleWithRowbounds(HandleMemberExample example, RowBounds rowBounds);

    List<HandleMember> selectByExample(HandleMemberExample example);

    HandleMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HandleMember record, @Param("example") HandleMemberExample example);

    int updateByExample(@Param("record") HandleMember record, @Param("example") HandleMemberExample example);

    int updateByPrimaryKeySelective(HandleMember record);

    int updateByPrimaryKey(HandleMember record);
}