package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName pay_outreach_list_log
 */
@TableName(value ="pay_outreach_list_log")
@Data
public class PayOutreachListLog implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "orderno")
    private String orderno;

    /**
     * 
     */
    @TableField(value = "accountid")
    private Object accountid;

    /**
     * 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 
     */
    @TableField(value = "accountid1")
    private String accountid1;

    /**
     * 
     */
    @TableField(value = "accountid5")
    private String accountid5;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

    /**
     * 
     */
    @TableField(value = "create_date")
    private String create_date;

    /**
     * 
     */
    @TableField(value = "pay_result")
    private String pay_result;

    /**
     * 
     */
    @TableField(value = "address")
    private String address;

    /**
     * 
     */
    @TableField(value = "param")
    private String param;

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
        PayOutreachListLog other = (PayOutreachListLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderno() == null ? other.getOrderno() == null : this.getOrderno().equals(other.getOrderno()))
            && (this.getAccountid() == null ? other.getAccountid() == null : this.getAccountid().equals(other.getAccountid()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getAccountid1() == null ? other.getAccountid1() == null : this.getAccountid1().equals(other.getAccountid1()))
            && (this.getAccountid5() == null ? other.getAccountid5() == null : this.getAccountid5().equals(other.getAccountid5()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getPay_result() == null ? other.getPay_result() == null : this.getPay_result().equals(other.getPay_result()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getParam() == null ? other.getParam() == null : this.getParam().equals(other.getParam()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderno() == null) ? 0 : getOrderno().hashCode());
        result = prime * result + ((getAccountid() == null) ? 0 : getAccountid().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getAccountid1() == null) ? 0 : getAccountid1().hashCode());
        result = prime * result + ((getAccountid5() == null) ? 0 : getAccountid5().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getPay_result() == null) ? 0 : getPay_result().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getParam() == null) ? 0 : getParam().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderno=").append(orderno);
        sb.append(", accountid=").append(accountid);
        sb.append(", account=").append(account);
        sb.append(", accountid1=").append(accountid1);
        sb.append(", accountid5=").append(accountid5);
        sb.append(", type=").append(type);
        sb.append(", create_date=").append(create_date);
        sb.append(", pay_result=").append(pay_result);
        sb.append(", address=").append(address);
        sb.append(", param=").append(param);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}