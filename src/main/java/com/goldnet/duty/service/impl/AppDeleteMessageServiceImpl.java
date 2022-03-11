package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AppDeleteMessage;
import com.goldnet.duty.service.AppDeleteMessageService;
import com.goldnet.duty.mapper.AppDeleteMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_delete_message】的数据库操作Service实现
* @createDate 2022-03-11 11:03:59
*/
@Service
public class AppDeleteMessageServiceImpl extends ServiceImpl<AppDeleteMessageMapper, AppDeleteMessage>
    implements AppDeleteMessageService{

}




