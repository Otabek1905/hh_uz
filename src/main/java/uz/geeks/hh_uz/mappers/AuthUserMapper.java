package uz.geeks.hh_uz.mappers;

import org.mapstruct.Mapper;

import uz.geeks.hh_uz.domains.Users;
import uz.geeks.hh_uz.dto.user.AuthUserCreateDto;
import uz.geeks.hh_uz.dto.user.AuthUserDto;
import uz.geeks.hh_uz.dto.user.AuthUserUpdateDto;

@Mapper(componentModel = "spring")
public interface AuthUserMapper extends BaseMapper<Users, AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto> {

}
