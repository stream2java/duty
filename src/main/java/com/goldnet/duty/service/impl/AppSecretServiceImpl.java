package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AppSecret;
import com.goldnet.duty.service.AppSecretService;
import com.goldnet.duty.mapper.AppSecretMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_secret】的数据库操作Service实现
* @createDate 2022-03-11 11:03:59
*/
@Service
public class AppSecretServiceImpl extends ServiceImpl<AppSecretMapper, AppSecret>
    implements AppSecretService{

}




