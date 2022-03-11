package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeActivitySetting;
import com.goldnet.duty.service.GeActivitySettingService;
import com.goldnet.duty.mapper.GeActivitySettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_activity_setting(活动设置表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:02
*/
@Service
public class GeActivitySettingServiceImpl extends ServiceImpl<GeActivitySettingMapper, GeActivitySetting>
    implements GeActivitySettingService{

}




