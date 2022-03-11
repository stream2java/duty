package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 体育 - 具体比赛表
 * @TableName ge_zq_matches_detail
 */
@TableName(value ="ge_zq_matches_detail")
@Data
public class GeZqMatchesDetail implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "matches_detail_id")
    private Object matches_detail_id;

    /**
     * 联赛编号
     */
    @TableField(value = "matches_id")
    private Object matches_id;

    /**
     * 主队名称
     */
    @TableField(value = "h_team")
    private String h_team;

    /**
     * 客队名称
     */
    @TableField(value = "g_team")
    private String g_team;

    /**
     * 投注开始时间
     */
    @TableField(value = "betting_start_date")
    private String betting_start_date;

    /**
     * 投注截止时间
     */
    @TableField(value = "betting_end_date")
    private String betting_end_date;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 是否有开放滚球盘口 0无 1有
     */
    @TableField(value = "is_live")
    private String is_live;

    /**
     * 滚球是否开始 开始 1 未开始 0
     */
    @TableField(value = "is_live_start")
    private String is_live_start;

    /**
     * 比赛进行时间
     */
    @TableField(value = "live_time")
    private String live_time;

    /**
     * 比赛状态 0 正常 1中场 2暂停 3比赛结束
     */
    @TableField(value = "live_status")
    private String live_status;

    /**
     * 当前主队得分
     */
    @TableField(value = "h_score")
    private Object h_score;

    /**
     * 当前客队得分
     */
    @TableField(value = "g_score")
    private Object g_score;

    /**
     * 比赛开始时间
用来确定是在早餐里还是 今日里
     */
    @TableField(value = "start_time")
    private LocalDateTime start_time;

    /**
     * 是不是主盘口或者说 赛果里显不显示本场比赛
默认0不显示 1显示
     */
    @TableField(value = "is_lose")
    private String is_lose;

    /**
     * 主队违规状态  红牌的数量 0是无违规  0以上就是红牌的数量
     */
    @TableField(value = "h_illegal")
    private String h_illegal;

    /**
     * 客队违规状态  0 正常 0以上就是红牌的数量
     */
    @TableField(value = "g_illegal")
    private String g_illegal;

    /**
     * 0 无 1有 是否开放混合过关
0 是普通盘口 1是主盘口
     */
    @TableField(value = "is_mix")
    private String is_mix;

    /**
     * 0是正常  1是早盘
暂时无用 早盘通过比赛时间来判断
     */
    @TableField(value = "is_future")
    private String is_future;

    /**
     * 主队编号
     */
    @TableField(value = "h_code")
    private Object h_code;

    /**
     * 客队编号
     */
    @TableField(value = "g_code")
    private Object g_code;

    /**
     * 球赛编号
     */
    @TableField(value = "mat_code")
    private Object mat_code;

    /**
     * 是否显示本场比赛
0 显示 1不显示
     */
    @TableField(value = "is_show")
    private String is_show;

    /**
     * 有混合过关的话是不是要显示
0显示 1不显示
     */
    @TableField(value = "is_mix_show")
    private String is_mix_show;

    /**
     * 是否开放本场比赛的投注
0 开放 1不开放
     */
    @TableField(value = "is_bet_show")
    private String is_bet_show;

    /**
     * 比赛是否结算过
     */
    @TableField(value = "is_balance")
    private String is_balance;

    /**
     * 比赛结果的ID 没有就是比赛还未产生结果 为1就是比赛被取消了
     */
    @TableField(value = "is_result")
    private Object is_result;

    /**
     * 
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 
     */
    @TableField(value = "onlykey")
    private String onlykey;

    /**
     * 标注 篮美用

0 赛果单独使用
0 是特殊赛事 如先得分等

1-8 赛果共用

1 是第一节
2 二
3 三
4 是第四节
5 是 上半
6 是 下半
7 是 加时赛
8 是全场
     */
    @TableField(value = "bettype")
    private String bettype;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GeZqMatchesDetail other = (GeZqMatchesDetail) that;
        return (this.getMatches_detail_id() == null ? other.getMatches_detail_id() == null : this.getMatches_detail_id().equals(other.getMatches_detail_id()))
            && (this.getMatches_id() == null ? other.getMatches_id() == null : this.getMatches_id().equals(other.getMatches_id()))
            && (this.getH_team() == null ? other.getH_team() == null : this.getH_team().equals(other.getH_team()))
            && (this.getG_team() == null ? other.getG_team() == null : this.getG_team().equals(other.getG_team()))
            && (this.getBetting_start_date() == null ? other.getBetting_start_date() == null : this.getBetting_start_date().equals(other.getBetting_start_date()))
            && (this.getBetting_end_date() == null ? other.getBetting_end_date() == null : this.getBetting_end_date().equals(other.getBetting_end_date()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getIs_live() == null ? other.getIs_live() == null : this.getIs_live().equals(other.getIs_live()))
            && (this.getIs_live_start() == null ? other.getIs_live_start() == null : this.getIs_live_start().equals(other.getIs_live_start()))
            && (this.getLive_time() == null ? other.getLive_time() == null : this.getLive_time().equals(other.getLive_time()))
            && (this.getLive_status() == null ? other.getLive_status() == null : this.getLive_status().equals(other.getLive_status()))
            && (this.getH_score() == null ? other.getH_score() == null : this.getH_score().equals(other.getH_score()))
            && (this.getG_score() == null ? other.getG_score() == null : this.getG_score().equals(other.getG_score()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getIs_lose() == null ? other.getIs_lose() == null : this.getIs_lose().equals(other.getIs_lose()))
            && (this.getH_illegal() == null ? other.getH_illegal() == null : this.getH_illegal().equals(other.getH_illegal()))
            && (this.getG_illegal() == null ? other.getG_illegal() == null : this.getG_illegal().equals(other.getG_illegal()))
            && (this.getIs_mix() == null ? other.getIs_mix() == null : this.getIs_mix().equals(other.getIs_mix()))
            && (this.getIs_future() == null ? other.getIs_future() == null : this.getIs_future().equals(other.getIs_future()))
            && (this.getH_code() == null ? other.getH_code() == null : this.getH_code().equals(other.getH_code()))
            && (this.getG_code() == null ? other.getG_code() == null : this.getG_code().equals(other.getG_code()))
            && (this.getMat_code() == null ? other.getMat_code() == null : this.getMat_code().equals(other.getMat_code()))
            && (this.getIs_show() == null ? other.getIs_show() == null : this.getIs_show().equals(other.getIs_show()))
            && (this.getIs_mix_show() == null ? other.getIs_mix_show() == null : this.getIs_mix_show().equals(other.getIs_mix_show()))
            && (this.getIs_bet_show() == null ? other.getIs_bet_show() == null : this.getIs_bet_show().equals(other.getIs_bet_show()))
            && (this.getIs_balance() == null ? other.getIs_balance() == null : this.getIs_balance().equals(other.getIs_balance()))
            && (this.getIs_result() == null ? other.getIs_result() == null : this.getIs_result().equals(other.getIs_result()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getOnlykey() == null ? other.getOnlykey() == null : this.getOnlykey().equals(other.getOnlykey()))
            && (this.getBettype() == null ? other.getBettype() == null : this.getBettype().equals(other.getBettype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMatches_detail_id() == null) ? 0 : getMatches_detail_id().hashCode());
        result = prime * result + ((getMatches_id() == null) ? 0 : getMatches_id().hashCode());
        result = prime * result + ((getH_team() == null) ? 0 : getH_team().hashCode());
        result = prime * result + ((getG_team() == null) ? 0 : getG_team().hashCode());
        result = prime * result + ((getBetting_start_date() == null) ? 0 : getBetting_start_date().hashCode());
        result = prime * result + ((getBetting_end_date() == null) ? 0 : getBetting_end_date().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getIs_live() == null) ? 0 : getIs_live().hashCode());
        result = prime * result + ((getIs_live_start() == null) ? 0 : getIs_live_start().hashCode());
        result = prime * result + ((getLive_time() == null) ? 0 : getLive_time().hashCode());
        result = prime * result + ((getLive_status() == null) ? 0 : getLive_status().hashCode());
        result = prime * result + ((getH_score() == null) ? 0 : getH_score().hashCode());
        result = prime * result + ((getG_score() == null) ? 0 : getG_score().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getIs_lose() == null) ? 0 : getIs_lose().hashCode());
        result = prime * result + ((getH_illegal() == null) ? 0 : getH_illegal().hashCode());
        result = prime * result + ((getG_illegal() == null) ? 0 : getG_illegal().hashCode());
        result = prime * result + ((getIs_mix() == null) ? 0 : getIs_mix().hashCode());
        result = prime * result + ((getIs_future() == null) ? 0 : getIs_future().hashCode());
        result = prime * result + ((getH_code() == null) ? 0 : getH_code().hashCode());
        result = prime * result + ((getG_code() == null) ? 0 : getG_code().hashCode());
        result = prime * result + ((getMat_code() == null) ? 0 : getMat_code().hashCode());
        result = prime * result + ((getIs_show() == null) ? 0 : getIs_show().hashCode());
        result = prime * result + ((getIs_mix_show() == null) ? 0 : getIs_mix_show().hashCode());
        result = prime * result + ((getIs_bet_show() == null) ? 0 : getIs_bet_show().hashCode());
        result = prime * result + ((getIs_balance() == null) ? 0 : getIs_balance().hashCode());
        result = prime * result + ((getIs_result() == null) ? 0 : getIs_result().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getOnlykey() == null) ? 0 : getOnlykey().hashCode());
        result = prime * result + ((getBettype() == null) ? 0 : getBettype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matches_detail_id=").append(matches_detail_id);
        sb.append(", matches_id=").append(matches_id);
        sb.append(", h_team=").append(h_team);
        sb.append(", g_team=").append(g_team);
        sb.append(", betting_start_date=").append(betting_start_date);
        sb.append(", betting_end_date=").append(betting_end_date);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", is_live=").append(is_live);
        sb.append(", is_live_start=").append(is_live_start);
        sb.append(", live_time=").append(live_time);
        sb.append(", live_status=").append(live_status);
        sb.append(", h_score=").append(h_score);
        sb.append(", g_score=").append(g_score);
        sb.append(", start_time=").append(start_time);
        sb.append(", is_lose=").append(is_lose);
        sb.append(", h_illegal=").append(h_illegal);
        sb.append(", g_illegal=").append(g_illegal);
        sb.append(", is_mix=").append(is_mix);
        sb.append(", is_future=").append(is_future);
        sb.append(", h_code=").append(h_code);
        sb.append(", g_code=").append(g_code);
        sb.append(", mat_code=").append(mat_code);
        sb.append(", is_show=").append(is_show);
        sb.append(", is_mix_show=").append(is_mix_show);
        sb.append(", is_bet_show=").append(is_bet_show);
        sb.append(", is_balance=").append(is_balance);
        sb.append(", is_result=").append(is_result);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", onlykey=").append(onlykey);
        sb.append(", bettype=").append(bettype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}