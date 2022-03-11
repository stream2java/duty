package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeCategory;
import com.goldnet.duty.service.GeCategoryService;
import com.goldnet.duty.mapper.GeCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_category(游戏分类【大类】)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:02
*/
@Service
public class GeCategoryServiceImpl extends ServiceImpl<GeCategoryMapper, GeCategory>
    implements GeCategoryService{

}




