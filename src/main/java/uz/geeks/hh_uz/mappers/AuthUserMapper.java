package uz.geeks.hh_uz.mappers;

import org.mapstruct.Mapper;
import uz.geeks.hh_uz.domains.User;
import uz.geeks.hh_uz.dto.user.AuthUserCreateDto;
import uz.geeks.hh_uz.dto.user.AuthUserDto;
import uz.geeks.hh_uz.dto.user.AuthUserUpdateDto;

@Mapper(componentModel = "spring")
public interface AuthUserMapper extends BaseMapper<User, AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto> {

}
