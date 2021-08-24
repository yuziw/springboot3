package com.controller;

import com.entity.City;
import com.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Lurenc
 * @create 2021-07-12 15:57
 */
@RequestMapping("city")
@Controller
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping("queryAll")
    public String queryall(HttpServletRequest request){
        List<City> list= cityService.queryall();
        request.setAttribute("list", list);
        return "queryall";
    }

    @RequestMapping("Insert")
    public String insert(City city){
        cityService.insert(city);
    return "redirect:/city/queryAll";
    }
    @RequestMapping("Delete")
    public String delete(String id){
        cityService.delete(id);
    return "redirect:/city/queryAll";
    }
}
