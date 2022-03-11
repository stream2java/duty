package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName mny_merchant_bank
 */
@TableName(value ="mny_merchant_bank")
@Data
public class MnyMerchantBank implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 支付方式和银行对应id
     */
    @TableField(value = "pay_bank_id")
    private Object pay_bank_id;

    /**
     * 金流id
     */
    @TableField(value = "merchantid")
    private Object merchantid;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 手续费
     */
    @TableField(value = "fee_rate")
    private BigDecimal fee_rate;

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
        MnyMerchantBank other = (MnyMerchantBank) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPay_bank_id() == null ? other.getPay_bank_id() == null : this.getPay_bank_id().equals(other.getPay_bank_id()))
            && (this.getMerchantid() == null ? other.getMerchantid() == null : this.getMerchantid().equals(other.getMerchantid()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getFee_rate() == null ? other.getFee_rate() == null : this.getFee_rate().equals(other.getFee_rate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPay_bank_id() == null) ? 0 : getPay_bank_id().hashCode());
        result = prime * result + ((getMerchantid() == null) ? 0 : getMerchantid().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getFee_rate() == null) ? 0 : getFee_rate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pay_bank_id=").append(pay_bank_id);
        sb.append(", merchantid=").append(merchantid);
        sb.append(", account1=").append(account1);
        sb.append(", fee_rate=").append(fee_rate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}