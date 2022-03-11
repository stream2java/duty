package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeMoney;
import com.goldnet.duty.service.GeMoneyService;
import com.goldnet.duty.mapper.GeMoneyMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_money(金钱(会员平台显示余额))】的数据库操作Service实现
* @createDate 2022-03-11 11:04:03
*/
@Service
public class GeMoneyServiceImpl extends ServiceImpl<GeMoneyMapper, GeMoney>
    implements GeMoneyService{

}




