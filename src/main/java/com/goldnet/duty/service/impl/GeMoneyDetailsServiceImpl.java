package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeMoneyDetails;
import com.goldnet.duty.service.GeMoneyDetailsService;
import com.goldnet.duty.mapper.GeMoneyDetailsMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_money_details(金钱流水（用于投注、结算操作余额）)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:03
*/
@Service
public class GeMoneyDetailsServiceImpl extends ServiceImpl<GeMoneyDetailsMapper, GeMoneyDetails>
    implements GeMoneyDetailsService{

}




