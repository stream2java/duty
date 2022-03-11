package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GoldConfig;
import com.goldnet.duty.service.GoldConfigService;
import com.goldnet.duty.mapper.GoldConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【gold_config(系统配置文件表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:04
*/
@Service
public class GoldConfigServiceImpl extends ServiceImpl<GoldConfigMapper, GoldConfig>
    implements GoldConfigService{

}




