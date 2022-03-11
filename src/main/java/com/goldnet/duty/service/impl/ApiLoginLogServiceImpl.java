package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.ApiLoginLog;
import com.goldnet.duty.service.ApiLoginLogService;
import com.goldnet.duty.mapper.ApiLoginLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_login_log】的数据库操作Service实现
* @createDate 2022-03-11 11:03:59
*/
@Service
public class ApiLoginLogServiceImpl extends ServiceImpl<ApiLoginLogMapper, ApiLoginLog>
    implements ApiLoginLogService{

}




