package uz.geeks.hh_uz.service.base;

import lombok.NonNull;
import uz.geeks.hh_uz.dto.GenericDto;

import java.io.Serializable;
import java.util.List;

public interface GenericReadService <ID extends Serializable, D extends GenericDto> extends BaseService{
    List<D> getAll();

    D get(@NonNull ID id);
}
