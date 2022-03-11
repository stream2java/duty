package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.Test;
import com.goldnet.duty.service.TestService;
import com.goldnet.duty.mapper.TestMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【test】的数据库操作Service实现
* @createDate 2022-03-11 11:04:08
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test>
    implements TestService{

}




