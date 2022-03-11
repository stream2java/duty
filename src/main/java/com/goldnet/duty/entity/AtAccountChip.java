package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName at_account_chip
 */
@TableName(value ="at_account_chip")
@Data
public class AtAccountChip implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "account_chip_id")
    private Object account_chip_id;

    /**
     * 会员帐号ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 筹码，金额多少
     */
    @TableField(value = "chip")
    private Object chip;

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
        AtAccountChip other = (AtAccountChip) that;
        return (this.getAccount_chip_id() == null ? other.getAccount_chip_id() == null : this.getAccount_chip_id().equals(other.getAccount_chip_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getChip() == null ? other.getChip() == null : this.getChip().equals(other.getChip()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccount_chip_id() == null) ? 0 : getAccount_chip_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getChip() == null) ? 0 : getChip().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", account_chip_id=").append(account_chip_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", chip=").append(chip);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}