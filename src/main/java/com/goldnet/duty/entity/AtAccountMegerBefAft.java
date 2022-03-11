package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName at_account_meger_bef_aft
 */
@TableName(value ="at_account_meger_bef_aft")
@Data
public class AtAccountMegerBefAft implements Serializable {
    /**
     * 
     */
    @TableField(value = "bef_name")
    private String bef_name;

    /**
     * 
     */
    @TableField(value = "aft_name")
    private String aft_name;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

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
        AtAccountMegerBefAft other = (AtAccountMegerBefAft) that;
        return (this.getBef_name() == null ? other.getBef_name() == null : this.getBef_name().equals(other.getBef_name()))
            && (this.getAft_name() == null ? other.getAft_name() == null : this.getAft_name().equals(other.getAft_name()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBef_name() == null) ? 0 : getBef_name().hashCode());
        result = prime * result + ((getAft_name() == null) ? 0 : getAft_name().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bef_name=").append(bef_name);
        sb.append(", aft_name=").append(aft_name);
        sb.append(", account1=").append(account1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}