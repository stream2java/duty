package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AtMemberMessage;
import com.goldnet.duty.service.AtMemberMessageService;
import com.goldnet.duty.mapper.AtMemberMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_member_message(会员资料表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:00
*/
@Service
public class AtMemberMessageServiceImpl extends ServiceImpl<AtMemberMessageMapper, AtMemberMessage>
    implements AtMemberMessageService{

}




