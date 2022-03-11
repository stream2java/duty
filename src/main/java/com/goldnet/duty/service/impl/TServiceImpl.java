package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.T;
import com.goldnet.duty.service.TService;
import com.goldnet.duty.mapper.TMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【t】的数据库操作Service实现
* @createDate 2022-03-11 11:04:08
*/
@Service
public class TServiceImpl extends ServiceImpl<TMapper, T>
    implements TService{

}




