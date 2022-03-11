package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 报表历史记录表
 * @TableName promotion_report_record
 */
@TableName(value ="promotion_report_record")
@Data
public class PromotionReportRecord implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 产生此条记录的会员ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 产生此条记录的会员账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 上级线账号数组
     */
    @TableField(value = "parent_accounts")
    private String parent_accounts;

    /**
     * 上级线ID数组
     */
    @TableField(value = "parent_account_ids")
    private Object parent_account_ids;

    /**
     * 注册人数
     */
    @TableField(value = "register_num")
    private Object register_num;

    /**
     * 充值人数
     */
    @TableField(value = "recharge_num")
    private Object recharge_num;

    /**
     * 投注人数
     */
    @TableField(value = "betting_num")
    private Object betting_num;

    /**
     * 投注金额
     */
    @TableField(value = "betting_amount")
    private BigDecimal betting_amount;

    /**
     * 中奖金额
     */
    @TableField(value = "profit_amount")
    private BigDecimal profit_amount;

    /**
     * 优惠金额
     */
    @TableField(value = "discount_amount")
    private BigDecimal discount_amount;

    /**
     * 团队佣金
     */
    @TableField(value = "team_commission")
    private BigDecimal team_commission;

    /**
     * 充值金额
     */
    @TableField(value = "recharge_amount")
    private BigDecimal recharge_amount;

    /**
     * 提现金额 
     */
    @TableField(value = "withdraw_amount")
    private BigDecimal withdraw_amount;

    /**
     * 团队盈利
     */
    @TableField(value = "team_profit")
    private BigDecimal team_profit;

    /**
     * 团队盈利-不含投注盈亏
     */
    @TableField(value = "profit")
    private BigDecimal profit;

    /**
     * 推广佣金(下级)
     */
    @TableField(value = "promotion_commission_down")
    private BigDecimal promotion_commission_down;

    /**
     * 推广佣金(自身)
     */
    @TableField(value = "promotion_commission_self")
    private BigDecimal promotion_commission_self;

    /**
     * 统计日期
     */
    @TableField(value = "statistics_time")
    private LocalDate statistics_time;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

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
        PromotionReportRecord other = (PromotionReportRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getParent_accounts() == null ? other.getParent_accounts() == null : this.getParent_accounts().equals(other.getParent_accounts()))
            && (this.getParent_account_ids() == null ? other.getParent_account_ids() == null : this.getParent_account_ids().equals(other.getParent_account_ids()))
            && (this.getRegister_num() == null ? other.getRegister_num() == null : this.getRegister_num().equals(other.getRegister_num()))
            && (this.getRecharge_num() == null ? other.getRecharge_num() == null : this.getRecharge_num().equals(other.getRecharge_num()))
            && (this.getBetting_num() == null ? other.getBetting_num() == null : this.getBetting_num().equals(other.getBetting_num()))
            && (this.getBetting_amount() == null ? other.getBetting_amount() == null : this.getBetting_amount().equals(other.getBetting_amount()))
            && (this.getProfit_amount() == null ? other.getProfit_amount() == null : this.getProfit_amount().equals(other.getProfit_amount()))
            && (this.getDiscount_amount() == null ? other.getDiscount_amount() == null : this.getDiscount_amount().equals(other.getDiscount_amount()))
            && (this.getTeam_commission() == null ? other.getTeam_commission() == null : this.getTeam_commission().equals(other.getTeam_commission()))
            && (this.getRecharge_amount() == null ? other.getRecharge_amount() == null : this.getRecharge_amount().equals(other.getRecharge_amount()))
            && (this.getWithdraw_amount() == null ? other.getWithdraw_amount() == null : this.getWithdraw_amount().equals(other.getWithdraw_amount()))
            && (this.getTeam_profit() == null ? other.getTeam_profit() == null : this.getTeam_profit().equals(other.getTeam_profit()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getPromotion_commission_down() == null ? other.getPromotion_commission_down() == null : this.getPromotion_commission_down().equals(other.getPromotion_commission_down()))
            && (this.getPromotion_commission_self() == null ? other.getPromotion_commission_self() == null : this.getPromotion_commission_self().equals(other.getPromotion_commission_self()))
            && (this.getStatistics_time() == null ? other.getStatistics_time() == null : this.getStatistics_time().equals(other.getStatistics_time()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getParent_accounts() == null) ? 0 : getParent_accounts().hashCode());
        result = prime * result + ((getParent_account_ids() == null) ? 0 : getParent_account_ids().hashCode());
        result = prime * result + ((getRegister_num() == null) ? 0 : getRegister_num().hashCode());
        result = prime * result + ((getRecharge_num() == null) ? 0 : getRecharge_num().hashCode());
        result = prime * result + ((getBetting_num() == null) ? 0 : getBetting_num().hashCode());
        result = prime * result + ((getBetting_amount() == null) ? 0 : getBetting_amount().hashCode());
        result = prime * result + ((getProfit_amount() == null) ? 0 : getProfit_amount().hashCode());
        result = prime * result + ((getDiscount_amount() == null) ? 0 : getDiscount_amount().hashCode());
        result = prime * result + ((getTeam_commission() == null) ? 0 : getTeam_commission().hashCode());
        result = prime * result + ((getRecharge_amount() == null) ? 0 : getRecharge_amount().hashCode());
        result = prime * result + ((getWithdraw_amount() == null) ? 0 : getWithdraw_amount().hashCode());
        result = prime * result + ((getTeam_profit() == null) ? 0 : getTeam_profit().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getPromotion_commission_down() == null) ? 0 : getPromotion_commission_down().hashCode());
        result = prime * result + ((getPromotion_commission_self() == null) ? 0 : getPromotion_commission_self().hashCode());
        result = prime * result + ((getStatistics_time() == null) ? 0 : getStatistics_time().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account1=").append(account1);
        sb.append(", account_id=").append(account_id);
        sb.append(", account=").append(account);
        sb.append(", parent_accounts=").append(parent_accounts);
        sb.append(", parent_account_ids=").append(parent_account_ids);
        sb.append(", register_num=").append(register_num);
        sb.append(", recharge_num=").append(recharge_num);
        sb.append(", betting_num=").append(betting_num);
        sb.append(", betting_amount=").append(betting_amount);
        sb.append(", profit_amount=").append(profit_amount);
        sb.append(", discount_amount=").append(discount_amount);
        sb.append(", team_commission=").append(team_commission);
        sb.append(", recharge_amount=").append(recharge_amount);
        sb.append(", withdraw_amount=").append(withdraw_amount);
        sb.append(", team_profit=").append(team_profit);
        sb.append(", profit=").append(profit);
        sb.append(", promotion_commission_down=").append(promotion_commission_down);
        sb.append(", promotion_commission_self=").append(promotion_commission_self);
        sb.append(", statistics_time=").append(statistics_time);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}