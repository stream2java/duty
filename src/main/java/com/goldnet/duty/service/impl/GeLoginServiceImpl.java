package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeLogin;
import com.goldnet.duty.service.GeLoginService;
import com.goldnet.duty.mapper.GeLoginMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_login(登录用户记录表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:02
*/
@Service
public class GeLoginServiceImpl extends ServiceImpl<GeLoginMapper, GeLogin>
    implements GeLoginService{

}




