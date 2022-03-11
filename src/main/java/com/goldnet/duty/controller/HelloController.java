package com.goldnet.duty.controller;

import com.goldnet.duty.entity.GeStation;
import com.goldnet.duty.mapper.GeStationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    private GeStationMapper geStationMapper;

    public HelloController(GeStationMapper geStationMapper) {
        this.geStationMapper = geStationMapper;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String getHello(){
        return  "hello";
    }

    @ResponseBody
    @GetMapping("/station")
    public List<GeStation> getStation(){
        List<GeStation> geStations = geStationMapper.selectList(null);
        return geStations;

    }
}
