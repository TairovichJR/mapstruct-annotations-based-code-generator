package com.tairovich.mapper;

import com.tairovich.domain.User;
import com.tairovich.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    public static final UserMapper INSTANCE  = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);
}
