package uz.geeks.hh_uz.service.user;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.dto.user.AuthUserCreateDto;
import uz.geeks.hh_uz.dto.user.AuthUserDto;
import uz.geeks.hh_uz.dto.user.AuthUserUpdateDto;
import uz.geeks.hh_uz.mappers.AuthUserMapper;
import uz.geeks.hh_uz.repository.AuthUserRepository;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.util.List;

@Service
public class AuthUserService extends AbstractService<AuthUserRepository, AuthUserMapper>
        implements GenericCrudService<Long, AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto> {


    public AuthUserService(AuthUserRepository repository, AuthUserMapper mapper, BaseUtils utils) {
        super(repository, mapper, utils);
    }

    @Override
    public List<AuthUserDto> getAll() {
        return null;
    }

    @Override
    public AuthUserDto get(@NonNull Long aLong) {
        return null;
    }

    @Override
    public Long create(@NonNull AuthUserCreateDto dto) {
        return null;
    }

    @Override
    public void delete(@NonNull Long aLong) {

    }

    @Override
    public void update(@NonNull AuthUserUpdateDto dto) {

    }
}
