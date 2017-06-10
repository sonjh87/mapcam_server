package com.jboc.server.mysql.mapper;

import org.apache.ibatis.annotations.Param;

import com.jboc.server.mysql.UserVO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by son on 2017-06-10 0010.
 */
public interface UserMapper {
    @Select("select * from user where ID = #{id}")
    public UserVO userSelect(String id) throws Exception;
}
