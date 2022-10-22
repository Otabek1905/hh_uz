package uz.geeks.hh_uz.controller;

import lombok.RequiredArgsConstructor;
import uz.geeks.hh_uz.service.base.BaseService;

@RequiredArgsConstructor
public abstract class ApiController<S extends BaseService> {
    protected final S service;
    protected final String API = "/api";
    protected final String V1 = "/v1";
}
