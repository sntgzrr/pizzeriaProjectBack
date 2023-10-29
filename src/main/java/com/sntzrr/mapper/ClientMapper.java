package com.sntzrr.mapper;

import com.sntzrr.model.Client;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClientMapper {
    @Select("SELECT * FROM CLIENT")
    List<Client> clients();
    @Insert("INSERT INTO CLIENT (NAME, LASTNAME, EMAIL, PASSWORD, ROL) VALUES (#{name}, #{lastname}, #{email}, #{password}, 'CLIENT')")
    int save(Client client);
    @Select("SELECT * FROM CLIENT WHERE EMAIL = #{email} AND PASSWORD = #{password}")
    Client client(@Param("email") String email, @Param("password") String password);
}
