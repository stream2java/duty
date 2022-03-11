package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.ApiFailAccount;
import com.goldnet.duty.service.ApiFailAccountService;
import com.goldnet.duty.mapper.ApiFailAccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_fail_account】的数据库操作Service实现
* @createDate 2022-03-11 11:03:59
*/
@Service
public class ApiFailAccountServiceImpl extends ServiceImpl<ApiFailAccountMapper, ApiFailAccount>
    implements ApiFailAccountService{

}




