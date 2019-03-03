package com.guilin.realestate.mapper;

import com.guilin.realestate.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> selectUsers();
}
