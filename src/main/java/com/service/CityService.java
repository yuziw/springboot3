package com.service;

import com.entity.City;

import java.util.List;

/**
 * @author Lurenc
 * @create 2021-07-12 15:36
 */
public interface CityService {
    List<City> queryall();
    void  insert(City city);
    void  delete(String id);
}
