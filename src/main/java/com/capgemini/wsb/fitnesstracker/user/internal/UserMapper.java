package com.capgemini.wsb.fitnesstracker.user.internal;

import com.capgemini.wsb.fitnesstracker.user.api.User;
import com.capgemini.wsb.fitnesstracker.user.internal.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    User toEntity(UserDto dto){
        return new User(dto.firstName(), dto.lastName(), dto.birthdate(), dto.email());
    }

    public UserDto toDto(User user) {
        return new UserDto(user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getBirthdate(),
                user.getEmail());
    }

    public UserDtoBasic basicToDto(User user) {
        return new UserDtoBasic(user.getId(),
                user.getFirstName());
    }
}