package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AtMemberLogin;
import com.goldnet.duty.service.AtMemberLoginService;
import com.goldnet.duty.mapper.AtMemberLoginMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_member_login(登录信息扩展表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:00
*/
@Service
public class AtMemberLoginServiceImpl extends ServiceImpl<AtMemberLoginMapper, AtMemberLogin>
    implements AtMemberLoginService{

}




