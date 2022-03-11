package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 推广域名绑定表
 * @TableName ge_promot
 */
@TableName(value ="ge_promot")
@Data
public class GePromot implements Serializable {
    /**
     * 
     */
    @TableId(value = "promot_id")
    private Object promot_id;

    /**
     * 代理ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 绑定域名ID
     */
    @TableField(value = "stationdomain_id")
    private Object stationdomain_id;

    /**
     * 代理账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 推广码
     */
    @TableField(value = "agent_no")
    private String agent_no;

    /**
     * 绑定域名
     */
    @TableField(value = "stationdomain_url")
    private String stationdomain_url;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

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
        GePromot other = (GePromot) that;
        return (this.getPromot_id() == null ? other.getPromot_id() == null : this.getPromot_id().equals(other.getPromot_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getStationdomain_id() == null ? other.getStationdomain_id() == null : this.getStationdomain_id().equals(other.getStationdomain_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getAgent_no() == null ? other.getAgent_no() == null : this.getAgent_no().equals(other.getAgent_no()))
            && (this.getStationdomain_url() == null ? other.getStationdomain_url() == null : this.getStationdomain_url().equals(other.getStationdomain_url()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPromot_id() == null) ? 0 : getPromot_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getStationdomain_id() == null) ? 0 : getStationdomain_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getAgent_no() == null) ? 0 : getAgent_no().hashCode());
        result = prime * result + ((getStationdomain_url() == null) ? 0 : getStationdomain_url().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promot_id=").append(promot_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", stationdomain_id=").append(stationdomain_id);
        sb.append(", account=").append(account);
        sb.append(", agent_no=").append(agent_no);
        sb.append(", stationdomain_url=").append(stationdomain_url);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}