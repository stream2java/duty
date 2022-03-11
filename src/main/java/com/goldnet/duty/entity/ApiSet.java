package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * API设置管理表
 * @TableName api_set
 */
@TableName(value ="api_set")
@Data
public class ApiSet implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 平台
     */
    @TableField(value = "platform")
    private String platform;

    /**
     * 星期
     */
    @TableField(value = "week")
    private Object week;

    /**
     * 开始时间
     */
    @TableField(value = "start_time")
    private String start_time;

    /**
     * 时长
     */
    @TableField(value = "duration")
    private String duration;

    /**
     * 维护提示
     */
    @TableField(value = "behalf_hint")
    private String behalf_hint;

    /**
     * 登录提示
     */
    @TableField(value = "login_hint")
    private String login_hint;

    /**
     * 是否有站点(account1)挂维护
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
        ApiSet other = (ApiSet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getBehalf_hint() == null ? other.getBehalf_hint() == null : this.getBehalf_hint().equals(other.getBehalf_hint()))
            && (this.getLogin_hint() == null ? other.getLogin_hint() == null : this.getLogin_hint().equals(other.getLogin_hint()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getBehalf_hint() == null) ? 0 : getBehalf_hint().hashCode());
        result = prime * result + ((getLogin_hint() == null) ? 0 : getLogin_hint().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platform=").append(platform);
        sb.append(", week=").append(week);
        sb.append(", start_time=").append(start_time);
        sb.append(", duration=").append(duration);
        sb.append(", behalf_hint=").append(behalf_hint);
        sb.append(", login_hint=").append(login_hint);
        sb.append(", account1=").append(account1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}