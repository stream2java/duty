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
 * @TableName api_detail_login_log
 */
@TableName(value ="api_detail_login_log")
@Data
public class ApiDetailLoginLog implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 大大股东
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 会员Id
     */
    @TableField(value = "account6")
    private Object account6;

    /**
     * api帐号
     */
    @TableField(value = "api_account")
    private String api_account;

    /**
     * 本平台帐号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 最后操作时间
     */
    @TableField(value = "op_time")
    private LocalDateTime op_time;

    /**
     * 0:成功,1:不成功
     */
    @TableField(value = "op_status")
    private Object op_status;

    /**
     * 第三方名称:hg,bb,ea
     */
    @TableField(value = "api_name")
    private String api_name;

    /**
     * api 和营商代码
     */
    @TableField(value = "api_key")
    private String api_key;

    /**
     * 庄家
     */
    @TableField(value = "account0")
    private Object account0;

    /**
     * 大股东
     */
    @TableField(value = "account2")
    private Object account2;

    /**
     * 股东
     */
    @TableField(value = "account3")
    private Object account3;

    /**
     * 总代
     */
    @TableField(value = "account4")
    private Object account4;

    /**
     * 代理
     */
    @TableField(value = "account5")
    private Object account5;

    /**
     * 最后登录时间,只有彩票和体育平台需要用到
     */
    @TableField(value = "last_login_time")
    private LocalDateTime last_login_time;

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
        ApiDetailLoginLog other = (ApiDetailLoginLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount6() == null ? other.getAccount6() == null : this.getAccount6().equals(other.getAccount6()))
            && (this.getApi_account() == null ? other.getApi_account() == null : this.getApi_account().equals(other.getApi_account()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getOp_time() == null ? other.getOp_time() == null : this.getOp_time().equals(other.getOp_time()))
            && (this.getOp_status() == null ? other.getOp_status() == null : this.getOp_status().equals(other.getOp_status()))
            && (this.getApi_name() == null ? other.getApi_name() == null : this.getApi_name().equals(other.getApi_name()))
            && (this.getApi_key() == null ? other.getApi_key() == null : this.getApi_key().equals(other.getApi_key()))
            && (this.getAccount0() == null ? other.getAccount0() == null : this.getAccount0().equals(other.getAccount0()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getLast_login_time() == null ? other.getLast_login_time() == null : this.getLast_login_time().equals(other.getLast_login_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount6() == null) ? 0 : getAccount6().hashCode());
        result = prime * result + ((getApi_account() == null) ? 0 : getApi_account().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getOp_time() == null) ? 0 : getOp_time().hashCode());
        result = prime * result + ((getOp_status() == null) ? 0 : getOp_status().hashCode());
        result = prime * result + ((getApi_name() == null) ? 0 : getApi_name().hashCode());
        result = prime * result + ((getApi_key() == null) ? 0 : getApi_key().hashCode());
        result = prime * result + ((getAccount0() == null) ? 0 : getAccount0().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getLast_login_time() == null) ? 0 : getLast_login_time().hashCode());
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
        sb.append(", account6=").append(account6);
        sb.append(", api_account=").append(api_account);
        sb.append(", account=").append(account);
        sb.append(", op_time=").append(op_time);
        sb.append(", op_status=").append(op_status);
        sb.append(", api_name=").append(api_name);
        sb.append(", api_key=").append(api_key);
        sb.append(", account0=").append(account0);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", account5=").append(account5);
        sb.append(", last_login_time=").append(last_login_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}