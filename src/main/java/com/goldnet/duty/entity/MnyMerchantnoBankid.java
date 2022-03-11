package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName mny_merchantno_bankid
 */
@TableName(value ="mny_merchantno_bankid")
@Data
public class MnyMerchantnoBankid implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 支付id
     */
    @TableField(value = "pay_system_id")
    private Object pay_system_id;

    /**
     * 银行id
     */
    @TableField(value = "bank_id")
    private Object bank_id;

    /**
     * 银行-支付对应key
     */
    @TableField(value = "bank_key")
    private String bank_key;

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
        MnyMerchantnoBankid other = (MnyMerchantnoBankid) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPay_system_id() == null ? other.getPay_system_id() == null : this.getPay_system_id().equals(other.getPay_system_id()))
            && (this.getBank_id() == null ? other.getBank_id() == null : this.getBank_id().equals(other.getBank_id()))
            && (this.getBank_key() == null ? other.getBank_key() == null : this.getBank_key().equals(other.getBank_key()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPay_system_id() == null) ? 0 : getPay_system_id().hashCode());
        result = prime * result + ((getBank_id() == null) ? 0 : getBank_id().hashCode());
        result = prime * result + ((getBank_key() == null) ? 0 : getBank_key().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pay_system_id=").append(pay_system_id);
        sb.append(", bank_id=").append(bank_id);
        sb.append(", bank_key=").append(bank_key);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}