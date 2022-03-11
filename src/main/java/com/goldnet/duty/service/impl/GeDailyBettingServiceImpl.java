package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeDailyBetting;
import com.goldnet.duty.service.GeDailyBettingService;
import com.goldnet.duty.mapper.GeDailyBettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_daily_betting(会员每天打码量汇总)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:02
*/
@Service
public class GeDailyBettingServiceImpl extends ServiceImpl<GeDailyBettingMapper, GeDailyBetting>
    implements GeDailyBettingService{

}




