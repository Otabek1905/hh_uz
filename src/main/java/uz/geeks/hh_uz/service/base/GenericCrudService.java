package uz.geeks.hh_uz.service.base;

import uz.geeks.hh_uz.dto.Dto;
import uz.geeks.hh_uz.dto.GenericDto;

import java.io.Serializable;

public interface GenericCrudService <ID extends Serializable,
        D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto> extends GenericModifyService<ID, CD, UD>, GenericReadService<ID, D> {

}
