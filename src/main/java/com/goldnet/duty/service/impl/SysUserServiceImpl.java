package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.SysUser;
import com.goldnet.duty.service.SysUserService;
import com.goldnet.duty.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_user(系统用户表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:08
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




