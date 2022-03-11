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
 * 推广用户返点设置表
 * @TableName promotion_rebate_setting
 */
@TableName(value ="promotion_rebate_setting")
@Data
public class PromotionRebateSetting implements Serializable {
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
     * 对应at_account表ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 最低充值额度,为0则没有限制
     */
    @TableField(value = "recharge_condition_money")
    private BigDecimal recharge_condition_money;

    /**
     * 充值返点最大金额,为0则没有限制
     */
    @TableField(value = "recharge_limit_money")
    private BigDecimal recharge_limit_money;

    /**
     * 有效投注额度,为0则没有限制
     */
    @TableField(value = "betting_valid")
    private BigDecimal betting_valid;

    /**
     * 有效损益额度,为0则没有限制
     */
    @TableField(value = "profit_valid")
    private BigDecimal profit_valid;

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
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 余额宝入款是否返佣
     */
    @TableField(value = "yuebao_deposit_status")
    private Integer yuebao_deposit_status;

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
        PromotionRebateSetting other = (PromotionRebateSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getRecharge_condition_money() == null ? other.getRecharge_condition_money() == null : this.getRecharge_condition_money().equals(other.getRecharge_condition_money()))
            && (this.getRecharge_limit_money() == null ? other.getRecharge_limit_money() == null : this.getRecharge_limit_money().equals(other.getRecharge_limit_money()))
            && (this.getBetting_valid() == null ? other.getBetting_valid() == null : this.getBetting_valid().equals(other.getBetting_valid()))
            && (this.getProfit_valid() == null ? other.getProfit_valid() == null : this.getProfit_valid().equals(other.getProfit_valid()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getYuebao_deposit_status() == null ? other.getYuebao_deposit_status() == null : this.getYuebao_deposit_status().equals(other.getYuebao_deposit_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getRecharge_condition_money() == null) ? 0 : getRecharge_condition_money().hashCode());
        result = prime * result + ((getRecharge_limit_money() == null) ? 0 : getRecharge_limit_money().hashCode());
        result = prime * result + ((getBetting_valid() == null) ? 0 : getBetting_valid().hashCode());
        result = prime * result + ((getProfit_valid() == null) ? 0 : getProfit_valid().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getYuebao_deposit_status() == null) ? 0 : getYuebao_deposit_status().hashCode());
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
        sb.append(", recharge_condition_money=").append(recharge_condition_money);
        sb.append(", recharge_limit_money=").append(recharge_limit_money);
        sb.append(", betting_valid=").append(betting_valid);
        sb.append(", profit_valid=").append(profit_valid);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", yuebao_deposit_status=").append(yuebao_deposit_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}