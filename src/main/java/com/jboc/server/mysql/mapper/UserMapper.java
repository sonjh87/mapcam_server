package com.jboc.server.mysql.mapper;

import org.apache.ibatis.annotations.*;

import com.jboc.server.mysql.vo.UserVO;

/**
 * Created by son on 2017-06-10 0010.
 */
public interface UserMapper {
    @Results(
            {
                    @Result(property = "ID" , column = "ID"),
                    @Result(property = "PASSWORD" , column = "PASSWORD")}
    )

    @Select("select * from user where ID = #{ID}")
    public UserVO userSelect(String ID) throws Exception;

    @Insert("insert into user(ID,PASSWORD) values(#{ID},#{PASSWORD})")
    public void userInsert(UserVO userVo) throws Exception;
}
