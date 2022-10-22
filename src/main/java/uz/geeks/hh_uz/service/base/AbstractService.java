package uz.geeks.hh_uz.service.base;

import lombok.RequiredArgsConstructor;
import uz.geeks.hh_uz.mappers.GenericMapper;
import uz.geeks.hh_uz.repository.GenericRepository;
import uz.geeks.hh_uz.utils.BaseUtils;

@RequiredArgsConstructor
public abstract class AbstractService<R extends GenericRepository, M extends GenericMapper> {
    protected final R repository;
    protected final M mapper;
    protected final BaseUtils utils;
}
