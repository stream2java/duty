package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AppDomain;
import com.goldnet.duty.service.AppDomainService;
import com.goldnet.duty.mapper.AppDomainMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_domain(app和webapp管理)】的数据库操作Service实现
* @createDate 2022-03-11 11:03:59
*/
@Service
public class AppDomainServiceImpl extends ServiceImpl<AppDomainMapper, AppDomain>
    implements AppDomainService{

}




