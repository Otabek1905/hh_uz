package uz.geeks.hh_uz.service.base;

import lombok.NonNull;
import uz.geeks.hh_uz.dto.Dto;
import uz.geeks.hh_uz.dto.GenericDto;

import java.io.Serializable;

public interface GenericModifyService<ID extends Serializable,
        CD extends Dto,
        UD extends GenericDto> extends BaseService {
    ID create(@NonNull CD dto);

    void delete(@NonNull ID id);

    void update(@NonNull UD dto);
}
