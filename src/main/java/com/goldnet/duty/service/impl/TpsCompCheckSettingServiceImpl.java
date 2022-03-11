package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.TpsCompCheckSetting;
import com.goldnet.duty.service.TpsCompCheckSettingService;
import com.goldnet.duty.mapper.TpsCompCheckSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【tps_comp_check_setting(公司入款，存放第三方相关的设定，临时表，可在生成mny_check数据后删除)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:10
*/
@Service
public class TpsCompCheckSettingServiceImpl extends ServiceImpl<TpsCompCheckSettingMapper, TpsCompCheckSetting>
    implements TpsCompCheckSettingService{

}




