package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName api_login_log
 */
@TableName(value ="api_login_log")
@Data
public class ApiLoginLog implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 会员Id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 会员帐号
     */
    @TableField(value = "account")
    private String account;

    /**
     * api平台,hg,bb,ea,ag
     */
    @TableField(value = "platform")
    private String platform;

    /**
     * 登录时间
     */
    @TableField(value = "login_time")
    private LocalDateTime login_time;

    /**
     * 是否自动额度转换,0:表示自动额度  1:表示手动
     */
    @TableField(value = "transfer_money_status")
    private Object transfer_money_status;

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
        ApiLoginLog other = (ApiLoginLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getLogin_time() == null ? other.getLogin_time() == null : this.getLogin_time().equals(other.getLogin_time()))
            && (this.getTransfer_money_status() == null ? other.getTransfer_money_status() == null : this.getTransfer_money_status().equals(other.getTransfer_money_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getLogin_time() == null) ? 0 : getLogin_time().hashCode());
        result = prime * result + ((getTransfer_money_status() == null) ? 0 : getTransfer_money_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account_id=").append(account_id);
        sb.append(", account=").append(account);
        sb.append(", platform=").append(platform);
        sb.append(", login_time=").append(login_time);
        sb.append(", transfer_money_status=").append(transfer_money_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}