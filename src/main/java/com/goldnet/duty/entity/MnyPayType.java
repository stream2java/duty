package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName mny_pay_type
 */
@TableName(value ="mny_pay_type")
@Data
public class MnyPayType implements Serializable {
    /**
     * 支付类型(关联充值管理，如果线上线下同为微信扫码的即归为同一类型)
     */
    @TableField(value = "pay_type")
    private String pay_type;

    /**
     * 支付类型名称
     */
    @TableField(value = "pay_type_name")
    private String pay_type_name;

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
        MnyPayType other = (MnyPayType) that;
        return (this.getPay_type() == null ? other.getPay_type() == null : this.getPay_type().equals(other.getPay_type()))
            && (this.getPay_type_name() == null ? other.getPay_type_name() == null : this.getPay_type_name().equals(other.getPay_type_name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPay_type() == null) ? 0 : getPay_type().hashCode());
        result = prime * result + ((getPay_type_name() == null) ? 0 : getPay_type_name().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pay_type=").append(pay_type);
        sb.append(", pay_type_name=").append(pay_type_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}