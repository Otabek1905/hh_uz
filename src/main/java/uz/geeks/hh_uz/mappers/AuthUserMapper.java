package uz.geeks.hh_uz.mappers;

import org.mapstruct.Mapper;

import uz.geeks.hh_uz.domains.Users;
import uz.geeks.hh_uz.dto.user.AuthUserDto;
import uz.geeks.hh_uz.dto.user.AuthUserUpdateDto;
import uz.geeks.hh_uz.dto.user.LoginRequest;

@Mapper(componentModel = "spring")
public interface AuthUserMapper extends BaseMapper<Users, AuthUserDto, LoginRequest, AuthUserUpdateDto> {

}
