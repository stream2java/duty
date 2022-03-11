package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.DbaError;
import com.goldnet.duty.service.DbaErrorService;
import com.goldnet.duty.mapper.DbaErrorMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【dba_error】的数据库操作Service实现
* @createDate 2022-03-11 11:04:02
*/
@Service
public class DbaErrorServiceImpl extends ServiceImpl<DbaErrorMapper, DbaError>
    implements DbaErrorService{

}




