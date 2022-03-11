package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName at_transfer_station
 */
@TableName(value ="at_transfer_station")
@Data
public class AtTransferStation implements Serializable {
    /**
     * 
     */
    @TableId(value = "ac_id")
    private Object ac_id;

    /**
     * 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 
     */
    @TableField(value = "pwd")
    private String pwd;

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
        AtTransferStation other = (AtTransferStation) that;
        return (this.getAc_id() == null ? other.getAc_id() == null : this.getAc_id().equals(other.getAc_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAc_id() == null) ? 0 : getAc_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ac_id=").append(ac_id);
        sb.append(", account=").append(account);
        sb.append(", account1=").append(account1);
        sb.append(", pwd=").append(pwd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}