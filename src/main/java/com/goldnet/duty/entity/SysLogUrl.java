package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 代理操作日志表
 * @TableName sys_log_url
 */
@TableName(value ="sys_log_url")
@Data
public class SysLogUrl implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 账号Id
     */
    @TableField(value = "accountid")
    private Object accountid;

    /**
     * 账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * URL
     */
    @TableField(value = "url")
    private String url;

    /**
     * 参数列表
     */
    @TableField(value = "params")
    private String params;

    /**
     * 动作名称
     */
    @TableField(value = "actionname")
    private String actionname;

    /**
     * 访问时间
     */
    @TableField(value = "visitdate")
    private LocalDateTime visitdate;

    /**
     * 方法动作
     */
    @TableField(value = "method")
    private String method;

    /**
     * 访问域名
     */
    @TableField(value = "domain")
    private String domain;

    /**
     * 大大股东ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 中文参数列表,用于代理平台显示
     */
    @TableField(value = "zhparams")
    private String zhparams;

    /**
     * 0:客户域名 1:主域名
     */
    @TableField(value = "type")
    private String type;

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
        SysLogUrl other = (SysLogUrl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountid() == null ? other.getAccountid() == null : this.getAccountid().equals(other.getAccountid()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()))
            && (this.getActionname() == null ? other.getActionname() == null : this.getActionname().equals(other.getActionname()))
            && (this.getVisitdate() == null ? other.getVisitdate() == null : this.getVisitdate().equals(other.getVisitdate()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getDomain() == null ? other.getDomain() == null : this.getDomain().equals(other.getDomain()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getZhparams() == null ? other.getZhparams() == null : this.getZhparams().equals(other.getZhparams()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountid() == null) ? 0 : getAccountid().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        result = prime * result + ((getActionname() == null) ? 0 : getActionname().hashCode());
        result = prime * result + ((getVisitdate() == null) ? 0 : getVisitdate().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getDomain() == null) ? 0 : getDomain().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getZhparams() == null) ? 0 : getZhparams().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountid=").append(accountid);
        sb.append(", account=").append(account);
        sb.append(", url=").append(url);
        sb.append(", params=").append(params);
        sb.append(", actionname=").append(actionname);
        sb.append(", visitdate=").append(visitdate);
        sb.append(", method=").append(method);
        sb.append(", domain=").append(domain);
        sb.append(", account1=").append(account1);
        sb.append(", zhparams=").append(zhparams);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}