package com.goldnet.duty.service;

import com.goldnet.duty.entity.MnyCompCheckSetting;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Max.Huang
* @description 针对表【mny_comp_check_setting(公司入款，存放第三方不相关的设定，临时表，可在生成mny_check数据后删除)】的数据库操作Service
* @createDate 2022-03-11 11:04:04
*/
public interface MnyCompCheckSettingService extends IService<MnyCompCheckSetting> {

}
