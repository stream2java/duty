package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.SysMessage;
import com.goldnet.duty.service.SysMessageService;
import com.goldnet.duty.mapper.SysMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_message(发送消息记录表【暂时没用】)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:08
*/
@Service
public class SysMessageServiceImpl extends ServiceImpl<SysMessageMapper, SysMessage>
    implements SysMessageService{

}




