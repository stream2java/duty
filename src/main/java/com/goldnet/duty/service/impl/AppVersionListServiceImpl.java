package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.AppVersionList;
import com.goldnet.duty.service.AppVersionListService;
import com.goldnet.duty.mapper.AppVersionListMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【app_version_list】的数据库操作Service实现
* @createDate 2022-03-11 11:03:59
*/
@Service
public class AppVersionListServiceImpl extends ServiceImpl<AppVersionListMapper, AppVersionList>
    implements AppVersionListService{

}




