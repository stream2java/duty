package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AtMemberMessageTrg;
import com.goldnet.duty.service.AtMemberMessageTrgService;
import com.goldnet.duty.mapper.AtMemberMessageTrgMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【at_member_message_trg(用于监控我们的会员资料表的变更情况，会对update和delete操作进行触发进来)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:00
*/
@Service
public class AtMemberMessageTrgServiceImpl extends ServiceImpl<AtMemberMessageTrgMapper, AtMemberMessageTrg>
    implements AtMemberMessageTrgService{

}




