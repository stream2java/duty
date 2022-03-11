package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.SysConfig;
import com.goldnet.duty.service.SysConfigService;
import com.goldnet.duty.mapper.SysConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【sys_config(系统参数配置表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:07
*/
@Service
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig>
    implements SysConfigService{

}




