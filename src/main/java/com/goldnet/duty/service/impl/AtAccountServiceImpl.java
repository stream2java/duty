package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AtAccount;
import com.goldnet.duty.service.AtAccountService;
import com.goldnet.duty.mapper.AtAccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_account(账户表)】的数据库操作Service实现
* @createDate 2022-03-11 11:03:59
*/
@Service
public class AtAccountServiceImpl extends ServiceImpl<AtAccountMapper, AtAccount>
    implements AtAccountService{

}




