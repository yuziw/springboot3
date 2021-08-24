package com.dao;

import com.entity.City;

import java.util.List;

/**
 * @author Lurenc
 * @create 2021-07-12 15:31
 */
public interface CityDao {
    List<City> queryall();
    void  insert(City city);
    void  delete(String id);
}
