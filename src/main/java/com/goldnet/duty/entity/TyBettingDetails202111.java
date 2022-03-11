package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName ty_betting_details_202111
 */
@TableName(value ="ty_betting_details_202111")
@Data
public class TyBettingDetails202111 implements Serializable {
    /**
     * 
     */
    @TableId(value = "detail_id")
    private Long detail_id;

    /**
     * 
     */
    @TableField(value = "betting_code")
    private String betting_code;

    /**
     * 
     */
    @TableField(value = "betting_date")
    private LocalDateTime betting_date;

    /**
     * 
     */
    @TableField(value = "period")
    private String period;

    /**
     * 
     */
    @TableField(value = "project")
    private String project;

    /**
     * 
     */
    @TableField(value = "betting_money")
    private BigDecimal betting_money;

    /**
     * 
     */
    @TableField(value = "valid_money")
    private BigDecimal valid_money;

    /**
     * 
     */
    @TableField(value = "odds")
    private BigDecimal odds;

    /**
     * 
     */
    @TableField(value = "odds_group")
    private String odds_group;

    /**
     * 
     */
    @TableField(value = "is_winning")
    private String is_winning;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    /**
     * 
     */
    @TableField(value = "member_result")
    private BigDecimal member_result;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "money_type")
    private String money_type;

    /**
     * 
     */
    @TableField(value = "game_type_id")
    private Object game_type_id;

    /**
     * 
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 
     */
    @TableField(value = "plate_id")
    private Object plate_id;

    /**
     * 
     */
    @TableField(value = "balance_money")
    private BigDecimal balance_money;

    /**
     * 
     */
    @TableField(value = "flag")
    private String flag;

    /**
     * 
     */
    @TableField(value = "betting_status")
    private String betting_status;

    /**
     * 
     */
    @TableField(value = "ab_flag")
    private String ab_flag;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "return_ratio")
    private BigDecimal return_ratio;

    /**
     * 
     */
    @TableField(value = "account_id0")
    private Object account_id0;

    /**
     * 
     */
    @TableField(value = "account_id1")
    private Object account_id1;

    /**
     * 
     */
    @TableField(value = "account_id2")
    private Object account_id2;

    /**
     * 
     */
    @TableField(value = "account_id3")
    private Object account_id3;

    /**
     * 
     */
    @TableField(value = "account_id4")
    private Object account_id4;

    /**
     * 
     */
    @TableField(value = "account_id5")
    private Object account_id5;

    /**
     * 
     */
    @TableField(value = "account_id6")
    private Object account_id6;

    /**
     * 
     */
    @TableField(value = "return0")
    private BigDecimal return0;

    /**
     * 
     */
    @TableField(value = "return1")
    private BigDecimal return1;

    /**
     * 
     */
    @TableField(value = "return2")
    private BigDecimal return2;

    /**
     * 
     */
    @TableField(value = "return3")
    private BigDecimal return3;

    /**
     * 
     */
    @TableField(value = "return4")
    private BigDecimal return4;

    /**
     * 
     */
    @TableField(value = "return5")
    private BigDecimal return5;

    /**
     * 
     */
    @TableField(value = "return6")
    private BigDecimal return6;

    /**
     * 
     */
    @TableField(value = "ratio0")
    private BigDecimal ratio0;

    /**
     * 
     */
    @TableField(value = "ratio1")
    private BigDecimal ratio1;

    /**
     * 
     */
    @TableField(value = "ratio2")
    private BigDecimal ratio2;

    /**
     * 
     */
    @TableField(value = "ratio3")
    private BigDecimal ratio3;

    /**
     * 
     */
    @TableField(value = "ratio4")
    private BigDecimal ratio4;

    /**
     * 
     */
    @TableField(value = "ratio5")
    private BigDecimal ratio5;

    /**
     * 
     */
    @TableField(value = "currency")
    private String currency;

    /**
     * 
     */
    @TableField(value = "current_odds")
    private BigDecimal current_odds;

    /**
     * 
     */
    @TableField(value = "op")
    private String op;

    /**
     * 
     */
    @TableField(value = "award")
    private String award;

    /**
     * 
     */
    @TableField(value = "account_date_time")
    private LocalDateTime account_date_time;

    /**
     * 
     */
    @TableField(value = "is_balance")
    private String is_balance;

    /**
     * 
     */
    @TableField(value = "odds_project")
    private String odds_project;

    /**
     * 
     */
    @TableField(value = "key")
    private String key;

    /**
     * 
     */
    @TableField(value = "is_mix")
    private String is_mix;

    /**
     * 
     */
    @TableField(value = "is_live")
    private String is_live;

    /**
     * 
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 
     */
    @TableField(value = "child_num")
    private Object child_num;

    /**
     * 
     */
    @TableField(value = "md5key")
    private String md5key;

    /**
     * 
     */
    @TableField(value = "desktop_id")
    private Object desktop_id;

    /**
     * 
     */
    @TableField(value = "state_remark")
    private String state_remark;

    /**
     * 
     */
    @TableField(value = "show_odds")
    private BigDecimal show_odds;

    /**
     * 
     */
    @TableField(value = "bet_plate")
    private String bet_plate;

    /**
     * 
     */
    @TableField(value = "jockpot")
    private BigDecimal jockpot;

    /**
     * 
     */
    @TableField(value = "jockpot_type")
    private String jockpot_type;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

    /**
     * 
     */
    @TableField(value = "lottery_name")
    private String lottery_name;

    /**
     * 
     */
    @TableField(value = "game_type_name")
    private String game_type_name;

    /**
     * 
     */
    @TableField(value = "cp_id")
    private Long cp_id;

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
        TyBettingDetails202111 other = (TyBettingDetails202111) that;
        return (this.getDetail_id() == null ? other.getDetail_id() == null : this.getDetail_id().equals(other.getDetail_id()))
            && (this.getBetting_code() == null ? other.getBetting_code() == null : this.getBetting_code().equals(other.getBetting_code()))
            && (this.getBetting_date() == null ? other.getBetting_date() == null : this.getBetting_date().equals(other.getBetting_date()))
            && (this.getPeriod() == null ? other.getPeriod() == null : this.getPeriod().equals(other.getPeriod()))
            && (this.getProject() == null ? other.getProject() == null : this.getProject().equals(other.getProject()))
            && (this.getBetting_money() == null ? other.getBetting_money() == null : this.getBetting_money().equals(other.getBetting_money()))
            && (this.getValid_money() == null ? other.getValid_money() == null : this.getValid_money().equals(other.getValid_money()))
            && (this.getOdds() == null ? other.getOdds() == null : this.getOdds().equals(other.getOdds()))
            && (this.getOdds_group() == null ? other.getOdds_group() == null : this.getOdds_group().equals(other.getOdds_group()))
            && (this.getIs_winning() == null ? other.getIs_winning() == null : this.getIs_winning().equals(other.getIs_winning()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMember_result() == null ? other.getMember_result() == null : this.getMember_result().equals(other.getMember_result()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getMoney_type() == null ? other.getMoney_type() == null : this.getMoney_type().equals(other.getMoney_type()))
            && (this.getGame_type_id() == null ? other.getGame_type_id() == null : this.getGame_type_id().equals(other.getGame_type_id()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getPlate_id() == null ? other.getPlate_id() == null : this.getPlate_id().equals(other.getPlate_id()))
            && (this.getBalance_money() == null ? other.getBalance_money() == null : this.getBalance_money().equals(other.getBalance_money()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getBetting_status() == null ? other.getBetting_status() == null : this.getBetting_status().equals(other.getBetting_status()))
            && (this.getAb_flag() == null ? other.getAb_flag() == null : this.getAb_flag().equals(other.getAb_flag()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getReturn_ratio() == null ? other.getReturn_ratio() == null : this.getReturn_ratio().equals(other.getReturn_ratio()))
            && (this.getAccount_id0() == null ? other.getAccount_id0() == null : this.getAccount_id0().equals(other.getAccount_id0()))
            && (this.getAccount_id1() == null ? other.getAccount_id1() == null : this.getAccount_id1().equals(other.getAccount_id1()))
            && (this.getAccount_id2() == null ? other.getAccount_id2() == null : this.getAccount_id2().equals(other.getAccount_id2()))
            && (this.getAccount_id3() == null ? other.getAccount_id3() == null : this.getAccount_id3().equals(other.getAccount_id3()))
            && (this.getAccount_id4() == null ? other.getAccount_id4() == null : this.getAccount_id4().equals(other.getAccount_id4()))
            && (this.getAccount_id5() == null ? other.getAccount_id5() == null : this.getAccount_id5().equals(other.getAccount_id5()))
            && (this.getAccount_id6() == null ? other.getAccount_id6() == null : this.getAccount_id6().equals(other.getAccount_id6()))
            && (this.getReturn0() == null ? other.getReturn0() == null : this.getReturn0().equals(other.getReturn0()))
            && (this.getReturn1() == null ? other.getReturn1() == null : this.getReturn1().equals(other.getReturn1()))
            && (this.getReturn2() == null ? other.getReturn2() == null : this.getReturn2().equals(other.getReturn2()))
            && (this.getReturn3() == null ? other.getReturn3() == null : this.getReturn3().equals(other.getReturn3()))
            && (this.getReturn4() == null ? other.getReturn4() == null : this.getReturn4().equals(other.getReturn4()))
            && (this.getReturn5() == null ? other.getReturn5() == null : this.getReturn5().equals(other.getReturn5()))
            && (this.getReturn6() == null ? other.getReturn6() == null : this.getReturn6().equals(other.getReturn6()))
            && (this.getRatio0() == null ? other.getRatio0() == null : this.getRatio0().equals(other.getRatio0()))
            && (this.getRatio1() == null ? other.getRatio1() == null : this.getRatio1().equals(other.getRatio1()))
            && (this.getRatio2() == null ? other.getRatio2() == null : this.getRatio2().equals(other.getRatio2()))
            && (this.getRatio3() == null ? other.getRatio3() == null : this.getRatio3().equals(other.getRatio3()))
            && (this.getRatio4() == null ? other.getRatio4() == null : this.getRatio4().equals(other.getRatio4()))
            && (this.getRatio5() == null ? other.getRatio5() == null : this.getRatio5().equals(other.getRatio5()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getCurrent_odds() == null ? other.getCurrent_odds() == null : this.getCurrent_odds().equals(other.getCurrent_odds()))
            && (this.getOp() == null ? other.getOp() == null : this.getOp().equals(other.getOp()))
            && (this.getAward() == null ? other.getAward() == null : this.getAward().equals(other.getAward()))
            && (this.getAccount_date_time() == null ? other.getAccount_date_time() == null : this.getAccount_date_time().equals(other.getAccount_date_time()))
            && (this.getIs_balance() == null ? other.getIs_balance() == null : this.getIs_balance().equals(other.getIs_balance()))
            && (this.getOdds_project() == null ? other.getOdds_project() == null : this.getOdds_project().equals(other.getOdds_project()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getIs_mix() == null ? other.getIs_mix() == null : this.getIs_mix().equals(other.getIs_mix()))
            && (this.getIs_live() == null ? other.getIs_live() == null : this.getIs_live().equals(other.getIs_live()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getChild_num() == null ? other.getChild_num() == null : this.getChild_num().equals(other.getChild_num()))
            && (this.getMd5key() == null ? other.getMd5key() == null : this.getMd5key().equals(other.getMd5key()))
            && (this.getDesktop_id() == null ? other.getDesktop_id() == null : this.getDesktop_id().equals(other.getDesktop_id()))
            && (this.getState_remark() == null ? other.getState_remark() == null : this.getState_remark().equals(other.getState_remark()))
            && (this.getShow_odds() == null ? other.getShow_odds() == null : this.getShow_odds().equals(other.getShow_odds()))
            && (this.getBet_plate() == null ? other.getBet_plate() == null : this.getBet_plate().equals(other.getBet_plate()))
            && (this.getJockpot() == null ? other.getJockpot() == null : this.getJockpot().equals(other.getJockpot()))
            && (this.getJockpot_type() == null ? other.getJockpot_type() == null : this.getJockpot_type().equals(other.getJockpot_type()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getLottery_name() == null ? other.getLottery_name() == null : this.getLottery_name().equals(other.getLottery_name()))
            && (this.getGame_type_name() == null ? other.getGame_type_name() == null : this.getGame_type_name().equals(other.getGame_type_name()))
            && (this.getCp_id() == null ? other.getCp_id() == null : this.getCp_id().equals(other.getCp_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetail_id() == null) ? 0 : getDetail_id().hashCode());
        result = prime * result + ((getBetting_code() == null) ? 0 : getBetting_code().hashCode());
        result = prime * result + ((getBetting_date() == null) ? 0 : getBetting_date().hashCode());
        result = prime * result + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        result = prime * result + ((getProject() == null) ? 0 : getProject().hashCode());
        result = prime * result + ((getBetting_money() == null) ? 0 : getBetting_money().hashCode());
        result = prime * result + ((getValid_money() == null) ? 0 : getValid_money().hashCode());
        result = prime * result + ((getOdds() == null) ? 0 : getOdds().hashCode());
        result = prime * result + ((getOdds_group() == null) ? 0 : getOdds_group().hashCode());
        result = prime * result + ((getIs_winning() == null) ? 0 : getIs_winning().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMember_result() == null) ? 0 : getMember_result().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getMoney_type() == null) ? 0 : getMoney_type().hashCode());
        result = prime * result + ((getGame_type_id() == null) ? 0 : getGame_type_id().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getPlate_id() == null) ? 0 : getPlate_id().hashCode());
        result = prime * result + ((getBalance_money() == null) ? 0 : getBalance_money().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getBetting_status() == null) ? 0 : getBetting_status().hashCode());
        result = prime * result + ((getAb_flag() == null) ? 0 : getAb_flag().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getReturn_ratio() == null) ? 0 : getReturn_ratio().hashCode());
        result = prime * result + ((getAccount_id0() == null) ? 0 : getAccount_id0().hashCode());
        result = prime * result + ((getAccount_id1() == null) ? 0 : getAccount_id1().hashCode());
        result = prime * result + ((getAccount_id2() == null) ? 0 : getAccount_id2().hashCode());
        result = prime * result + ((getAccount_id3() == null) ? 0 : getAccount_id3().hashCode());
        result = prime * result + ((getAccount_id4() == null) ? 0 : getAccount_id4().hashCode());
        result = prime * result + ((getAccount_id5() == null) ? 0 : getAccount_id5().hashCode());
        result = prime * result + ((getAccount_id6() == null) ? 0 : getAccount_id6().hashCode());
        result = prime * result + ((getReturn0() == null) ? 0 : getReturn0().hashCode());
        result = prime * result + ((getReturn1() == null) ? 0 : getReturn1().hashCode());
        result = prime * result + ((getReturn2() == null) ? 0 : getReturn2().hashCode());
        result = prime * result + ((getReturn3() == null) ? 0 : getReturn3().hashCode());
        result = prime * result + ((getReturn4() == null) ? 0 : getReturn4().hashCode());
        result = prime * result + ((getReturn5() == null) ? 0 : getReturn5().hashCode());
        result = prime * result + ((getReturn6() == null) ? 0 : getReturn6().hashCode());
        result = prime * result + ((getRatio0() == null) ? 0 : getRatio0().hashCode());
        result = prime * result + ((getRatio1() == null) ? 0 : getRatio1().hashCode());
        result = prime * result + ((getRatio2() == null) ? 0 : getRatio2().hashCode());
        result = prime * result + ((getRatio3() == null) ? 0 : getRatio3().hashCode());
        result = prime * result + ((getRatio4() == null) ? 0 : getRatio4().hashCode());
        result = prime * result + ((getRatio5() == null) ? 0 : getRatio5().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getCurrent_odds() == null) ? 0 : getCurrent_odds().hashCode());
        result = prime * result + ((getOp() == null) ? 0 : getOp().hashCode());
        result = prime * result + ((getAward() == null) ? 0 : getAward().hashCode());
        result = prime * result + ((getAccount_date_time() == null) ? 0 : getAccount_date_time().hashCode());
        result = prime * result + ((getIs_balance() == null) ? 0 : getIs_balance().hashCode());
        result = prime * result + ((getOdds_project() == null) ? 0 : getOdds_project().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getIs_mix() == null) ? 0 : getIs_mix().hashCode());
        result = prime * result + ((getIs_live() == null) ? 0 : getIs_live().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getChild_num() == null) ? 0 : getChild_num().hashCode());
        result = prime * result + ((getMd5key() == null) ? 0 : getMd5key().hashCode());
        result = prime * result + ((getDesktop_id() == null) ? 0 : getDesktop_id().hashCode());
        result = prime * result + ((getState_remark() == null) ? 0 : getState_remark().hashCode());
        result = prime * result + ((getShow_odds() == null) ? 0 : getShow_odds().hashCode());
        result = prime * result + ((getBet_plate() == null) ? 0 : getBet_plate().hashCode());
        result = prime * result + ((getJockpot() == null) ? 0 : getJockpot().hashCode());
        result = prime * result + ((getJockpot_type() == null) ? 0 : getJockpot_type().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getLottery_name() == null) ? 0 : getLottery_name().hashCode());
        result = prime * result + ((getGame_type_name() == null) ? 0 : getGame_type_name().hashCode());
        result = prime * result + ((getCp_id() == null) ? 0 : getCp_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detail_id=").append(detail_id);
        sb.append(", betting_code=").append(betting_code);
        sb.append(", betting_date=").append(betting_date);
        sb.append(", period=").append(period);
        sb.append(", project=").append(project);
        sb.append(", betting_money=").append(betting_money);
        sb.append(", valid_money=").append(valid_money);
        sb.append(", odds=").append(odds);
        sb.append(", odds_group=").append(odds_group);
        sb.append(", is_winning=").append(is_winning);
        sb.append(", status=").append(status);
        sb.append(", member_result=").append(member_result);
        sb.append(", remark=").append(remark);
        sb.append(", money_type=").append(money_type);
        sb.append(", game_type_id=").append(game_type_id);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", plate_id=").append(plate_id);
        sb.append(", balance_money=").append(balance_money);
        sb.append(", flag=").append(flag);
        sb.append(", betting_status=").append(betting_status);
        sb.append(", ab_flag=").append(ab_flag);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", return_ratio=").append(return_ratio);
        sb.append(", account_id0=").append(account_id0);
        sb.append(", account_id1=").append(account_id1);
        sb.append(", account_id2=").append(account_id2);
        sb.append(", account_id3=").append(account_id3);
        sb.append(", account_id4=").append(account_id4);
        sb.append(", account_id5=").append(account_id5);
        sb.append(", account_id6=").append(account_id6);
        sb.append(", return0=").append(return0);
        sb.append(", return1=").append(return1);
        sb.append(", return2=").append(return2);
        sb.append(", return3=").append(return3);
        sb.append(", return4=").append(return4);
        sb.append(", return5=").append(return5);
        sb.append(", return6=").append(return6);
        sb.append(", ratio0=").append(ratio0);
        sb.append(", ratio1=").append(ratio1);
        sb.append(", ratio2=").append(ratio2);
        sb.append(", ratio3=").append(ratio3);
        sb.append(", ratio4=").append(ratio4);
        sb.append(", ratio5=").append(ratio5);
        sb.append(", currency=").append(currency);
        sb.append(", current_odds=").append(current_odds);
        sb.append(", op=").append(op);
        sb.append(", award=").append(award);
        sb.append(", account_date_time=").append(account_date_time);
        sb.append(", is_balance=").append(is_balance);
        sb.append(", odds_project=").append(odds_project);
        sb.append(", key=").append(key);
        sb.append(", is_mix=").append(is_mix);
        sb.append(", is_live=").append(is_live);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", child_num=").append(child_num);
        sb.append(", md5key=").append(md5key);
        sb.append(", desktop_id=").append(desktop_id);
        sb.append(", state_remark=").append(state_remark);
        sb.append(", show_odds=").append(show_odds);
        sb.append(", bet_plate=").append(bet_plate);
        sb.append(", jockpot=").append(jockpot);
        sb.append(", jockpot_type=").append(jockpot_type);
        sb.append(", type=").append(type);
        sb.append(", lottery_name=").append(lottery_name);
        sb.append(", game_type_name=").append(game_type_name);
        sb.append(", cp_id=").append(cp_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}