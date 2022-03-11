package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 在线统计
 * @TableName ge_online
 */
@TableName(value ="ge_online")
@Data
public class GeOnline implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 在线时长
     */
    @TableField(value = "online_time")
    private String online_time;

    /**
     * 当前页面
     */
    @TableField(value = "online_page")
    private String online_page;

    /**
     * 当前使用浏览器
     */
    @TableField(value = "browser")
    private String browser;

    /**
     * 是否黑名单
     */
    @TableField(value = "blacklist")
    private String blacklist;

    /**
     * 
     */
    @TableField(value = "account")
    private Object account;

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
        GeOnline other = (GeOnline) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOnline_time() == null ? other.getOnline_time() == null : this.getOnline_time().equals(other.getOnline_time()))
            && (this.getOnline_page() == null ? other.getOnline_page() == null : this.getOnline_page().equals(other.getOnline_page()))
            && (this.getBrowser() == null ? other.getBrowser() == null : this.getBrowser().equals(other.getBrowser()))
            && (this.getBlacklist() == null ? other.getBlacklist() == null : this.getBlacklist().equals(other.getBlacklist()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOnline_time() == null) ? 0 : getOnline_time().hashCode());
        result = prime * result + ((getOnline_page() == null) ? 0 : getOnline_page().hashCode());
        result = prime * result + ((getBrowser() == null) ? 0 : getBrowser().hashCode());
        result = prime * result + ((getBlacklist() == null) ? 0 : getBlacklist().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", online_time=").append(online_time);
        sb.append(", online_page=").append(online_page);
        sb.append(", browser=").append(browser);
        sb.append(", blacklist=").append(blacklist);
        sb.append(", account=").append(account);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}