package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeActivityPacketTime;
import com.goldnet.duty.service.GeActivityPacketTimeService;
import com.goldnet.duty.mapper.GeActivityPacketTimeMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_activity_packet_time(红包活动时间段表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:02
*/
@Service
public class GeActivityPacketTimeServiceImpl extends ServiceImpl<GeActivityPacketTimeMapper, GeActivityPacketTime>
    implements GeActivityPacketTimeService{

}




