package com.goldnet.duty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goldnet.duty.entity.ApiBettingGameSummary;
import com.goldnet.duty.service.ApiBettingGameSummaryService;
import com.goldnet.duty.mapper.ApiBettingGameSummaryMapper;
import org.springframework.stereotype.Service;

/**
* @author Max.Huang
* @description 针对表【api_betting_game_summary(厅主某一天的打码量、有效投注。损益按游戏汇总表)】的数据库操作Service实现
* @createDate 2022-03-11 11:03:58
*/
@Service
public class ApiBettingGameSummaryServiceImpl extends ServiceImpl<ApiBettingGameSummaryMapper, ApiBettingGameSummary>
    implements ApiBettingGameSummaryService{

}



