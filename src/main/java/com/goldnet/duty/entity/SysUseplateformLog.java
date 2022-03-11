package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 操作日志信息
 * @TableName sys_useplateform_log
 */
@TableName(value ="sys_useplateform_log")
@Data
public class SysUseplateformLog implements Serializable {
    /**
     * 日志id
     */
    @TableId(value = "log_id")
    private Object log_id;

    /**
     * 日志内容
     */
    @TableField(value = "log_content")
    private String log_content;

    /**
     * 操作人的ip
     */
    @TableField(value = "log_ip")
    private String log_ip;

    /**
     * 操作时间
     */
    @TableField(value = "log_datetime")
    private LocalDateTime log_datetime;

    /**
     * 操作平台
     */
    @TableField(value = "user_platform")
    private Object user_platform;

    /**
     * 操作人
     */
    @TableField(value = "user_account")
    private String user_account;

    /**
     * 操作认得id
     */
    @TableField(value = "user_id")
    private Object user_id;

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
        SysUseplateformLog other = (SysUseplateformLog) that;
        return (this.getLog_id() == null ? other.getLog_id() == null : this.getLog_id().equals(other.getLog_id()))
            && (this.getLog_content() == null ? other.getLog_content() == null : this.getLog_content().equals(other.getLog_content()))
            && (this.getLog_ip() == null ? other.getLog_ip() == null : this.getLog_ip().equals(other.getLog_ip()))
            && (this.getLog_datetime() == null ? other.getLog_datetime() == null : this.getLog_datetime().equals(other.getLog_datetime()))
            && (this.getUser_platform() == null ? other.getUser_platform() == null : this.getUser_platform().equals(other.getUser_platform()))
            && (this.getUser_account() == null ? other.getUser_account() == null : this.getUser_account().equals(other.getUser_account()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLog_id() == null) ? 0 : getLog_id().hashCode());
        result = prime * result + ((getLog_content() == null) ? 0 : getLog_content().hashCode());
        result = prime * result + ((getLog_ip() == null) ? 0 : getLog_ip().hashCode());
        result = prime * result + ((getLog_datetime() == null) ? 0 : getLog_datetime().hashCode());
        result = prime * result + ((getUser_platform() == null) ? 0 : getUser_platform().hashCode());
        result = prime * result + ((getUser_account() == null) ? 0 : getUser_account().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", log_id=").append(log_id);
        sb.append(", log_content=").append(log_content);
        sb.append(", log_ip=").append(log_ip);
        sb.append(", log_datetime=").append(log_datetime);
        sb.append(", user_platform=").append(user_platform);
        sb.append(", user_account=").append(user_account);
        sb.append(", user_id=").append(user_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}