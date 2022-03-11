package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.SysMessageContent;
import com.goldnet.duty.service.SysMessageContentService;
import com.goldnet.duty.mapper.SysMessageContentMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_message_content(讯息内容表【管理信息表、一般信息、特殊信息】)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:08
*/
@Service
public class SysMessageContentServiceImpl extends ServiceImpl<SysMessageContentMapper, SysMessageContent>
    implements SysMessageContentService{

}




