package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.SysUserLog;
import com.goldnet.duty.service.SysUserLogService;
import com.goldnet.duty.mapper.SysUserLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_user_log(总控操作日志表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:08
*/
@Service
public class SysUserLogServiceImpl extends ServiceImpl<SysUserLogMapper, SysUserLog>
    implements SysUserLogService{

}




