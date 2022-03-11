package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AppJpushMessage;
import com.goldnet.duty.service.AppJpushMessageService;
import com.goldnet.duty.mapper.AppJpushMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_jpush_message】的数据库操作Service实现
* @createDate 2022-03-11 11:03:59
*/
@Service
public class AppJpushMessageServiceImpl extends ServiceImpl<AppJpushMessageMapper, AppJpushMessage>
    implements AppJpushMessageService{

}




