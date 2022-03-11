package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.GeQuestion;
import com.goldnet.duty.service.GeQuestionService;
import com.goldnet.duty.mapper.GeQuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【ge_question(问题表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:03
*/
@Service
public class GeQuestionServiceImpl extends ServiceImpl<GeQuestionMapper, GeQuestion>
    implements GeQuestionService{

}




