package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.TaskLog;
import com.goldnet.duty.service.TaskLogService;
import com.goldnet.duty.mapper.TaskLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【task_log】的数据库操作Service实现
* @createDate 2022-03-11 11:04:08
*/
@Service
public class TaskLogServiceImpl extends ServiceImpl<TaskLogMapper, TaskLog>
    implements TaskLogService{

}




