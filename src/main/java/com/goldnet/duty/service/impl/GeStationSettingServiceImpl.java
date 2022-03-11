package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeStationSetting;
import com.goldnet.duty.service.GeStationSettingService;
import com.goldnet.duty.mapper.GeStationSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_station_setting(站点设置表（扩展表）)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:03
*/
@Service
public class GeStationSettingServiceImpl extends ServiceImpl<GeStationSettingMapper, GeStationSetting>
    implements GeStationSettingService{

}




