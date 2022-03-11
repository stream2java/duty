package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 登录信息扩展表
 * @TableName at_member_login
 */
@TableName(value ="at_member_login")
@Data
public class AtMemberLogin implements Serializable {
    /**
     * at_account表id
     */
    @TableId(value = "account_id")
    private Object account_id;

    /**
     * 登录时间
     */
    @TableField(value = "login_time")
    private LocalDateTime login_time;

    /**
     * 上次登录时间
     */
    @TableField(value = "login_back")
    private LocalDateTime login_back;

    /**
     * 登录次数
     */
    @TableField(value = "login_num")
    private Object login_num;

    /**
     * 登录ip
     */
    @TableField(value = "login_ip")
    private String login_ip;

    /**
     * 密码错误次数
     */
    @TableField(value = "error_num")
    private Object error_num;

    /**
     * 用户当前登陆的sessionid
     */
    @TableField(value = "session_id")
    private String session_id;

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
        AtMemberLogin other = (AtMemberLogin) that;
        return (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getLogin_time() == null ? other.getLogin_time() == null : this.getLogin_time().equals(other.getLogin_time()))
            && (this.getLogin_back() == null ? other.getLogin_back() == null : this.getLogin_back().equals(other.getLogin_back()))
            && (this.getLogin_num() == null ? other.getLogin_num() == null : this.getLogin_num().equals(other.getLogin_num()))
            && (this.getLogin_ip() == null ? other.getLogin_ip() == null : this.getLogin_ip().equals(other.getLogin_ip()))
            && (this.getError_num() == null ? other.getError_num() == null : this.getError_num().equals(other.getError_num()))
            && (this.getSession_id() == null ? other.getSession_id() == null : this.getSession_id().equals(other.getSession_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getLogin_time() == null) ? 0 : getLogin_time().hashCode());
        result = prime * result + ((getLogin_back() == null) ? 0 : getLogin_back().hashCode());
        result = prime * result + ((getLogin_num() == null) ? 0 : getLogin_num().hashCode());
        result = prime * result + ((getLogin_ip() == null) ? 0 : getLogin_ip().hashCode());
        result = prime * result + ((getError_num() == null) ? 0 : getError_num().hashCode());
        result = prime * result + ((getSession_id() == null) ? 0 : getSession_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", account_id=").append(account_id);
        sb.append(", login_time=").append(login_time);
        sb.append(", login_back=").append(login_back);
        sb.append(", login_num=").append(login_num);
        sb.append(", login_ip=").append(login_ip);
        sb.append(", error_num=").append(error_num);
        sb.append(", session_id=").append(session_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}