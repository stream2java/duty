package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeLotterySeries;
import com.goldnet.duty.service.GeLotterySeriesService;
import com.goldnet.duty.mapper.GeLotterySeriesMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_lottery_series(彩票ID与系列ID关系表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:03
*/
@Service
public class GeLotterySeriesServiceImpl extends ServiceImpl<GeLotterySeriesMapper, GeLotterySeries>
    implements GeLotterySeriesService{

}




