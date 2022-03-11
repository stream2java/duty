package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.PayExceptionOrder;
import com.goldnet.duty.service.PayExceptionOrderService;
import com.goldnet.duty.mapper.PayExceptionOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【pay_exception_order(入款异常订单表)】的数据库操作Service实现
* @createDate 2022-03-11 11:04:06
*/
@Service
public class PayExceptionOrderServiceImpl extends ServiceImpl<PayExceptionOrderMapper, PayExceptionOrder>
    implements PayExceptionOrderService{

}




