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
 * 电子游艺 - 临时积分信息表
 * @TableName ge_vge_integral
 */
@TableName(value ="ge_vge_integral")
@Data
public class GeVgeIntegral implements Serializable {
    /**
     * 
     */
    @TableId(value = "int_id")
    private Object int_id;

    /**
     * 比例 RMB
     */
    @TableField(value = "ratio_money")
    private Object ratio_money;

    /**
     * 比例 积分
     */
    @TableField(value = "ratio_integral")
    private Object ratio_integral;

    /**
     * 会员
     */
    @TableField(value = "account")
    private Object account;

    /**
     * 剩余积分
     */
    @TableField(value = "balance")
    private BigDecimal balance;

    /**
     * 游戏类型
     */
    @TableField(value = "slot_type")
    private Object slot_type;

    /**
     * 创建时间
     */
    @TableField(value = "creation_time")
    private LocalDateTime creation_time;

    /**
     * 结算时间
     */
    @TableField(value = "balance_time")
    private LocalDateTime balance_time;

    /**
     * 有效性 默认0 有效 1无效
     */
    @TableField(value = "validity")
    private String validity;

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
        GeVgeIntegral other = (GeVgeIntegral) that;
        return (this.getInt_id() == null ? other.getInt_id() == null : this.getInt_id().equals(other.getInt_id()))
            && (this.getRatio_money() == null ? other.getRatio_money() == null : this.getRatio_money().equals(other.getRatio_money()))
            && (this.getRatio_integral() == null ? other.getRatio_integral() == null : this.getRatio_integral().equals(other.getRatio_integral()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getSlot_type() == null ? other.getSlot_type() == null : this.getSlot_type().equals(other.getSlot_type()))
            && (this.getCreation_time() == null ? other.getCreation_time() == null : this.getCreation_time().equals(other.getCreation_time()))
            && (this.getBalance_time() == null ? other.getBalance_time() == null : this.getBalance_time().equals(other.getBalance_time()))
            && (this.getValidity() == null ? other.getValidity() == null : this.getValidity().equals(other.getValidity()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInt_id() == null) ? 0 : getInt_id().hashCode());
        result = prime * result + ((getRatio_money() == null) ? 0 : getRatio_money().hashCode());
        result = prime * result + ((getRatio_integral() == null) ? 0 : getRatio_integral().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getSlot_type() == null) ? 0 : getSlot_type().hashCode());
        result = prime * result + ((getCreation_time() == null) ? 0 : getCreation_time().hashCode());
        result = prime * result + ((getBalance_time() == null) ? 0 : getBalance_time().hashCode());
        result = prime * result + ((getValidity() == null) ? 0 : getValidity().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", int_id=").append(int_id);
        sb.append(", ratio_money=").append(ratio_money);
        sb.append(", ratio_integral=").append(ratio_integral);
        sb.append(", account=").append(account);
        sb.append(", balance=").append(balance);
        sb.append(", slot_type=").append(slot_type);
        sb.append(", creation_time=").append(creation_time);
        sb.append(", balance_time=").append(balance_time);
        sb.append(", validity=").append(validity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}