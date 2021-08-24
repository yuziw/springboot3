package com.service;

import com.dao.CityDao;
import com.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @author Lurenc
 * @create 2021-07-12 15:37
 */
@Service("cityService")
@Transactional
public class CityServiceImp implements  CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<City> queryall() {
        return cityDao.queryall();
    }

    @Override
    public void insert(City city) {
        city.setId( UUID.randomUUID().toString());

        cityDao.insert(city);
    }

    @Override
    public void delete(String id) {
        cityDao.delete(id);
    }
}
