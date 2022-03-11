package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName at_agent_email
 */
@TableName(value ="at_agent_email")
@Data
public class AtAgentEmail implements Serializable {
    /**
     * 
     */
    @TableId(value = "email_id")
    private Object email_id;

    /**
     * 
     */
    @TableField(value = "email_server_address")
    private String email_server_address;

    /**
     * 
     */
    @TableField(value = "send_email")
    private String send_email;

    /**
     * 
     */
    @TableField(value = "email_subject")
    private String email_subject;

    /**
     * 
     */
    @TableField(value = "user_name")
    private String user_name;

    /**
     * 
     */
    @TableField(value = "pass_word")
    private String pass_word;

    /**
     * 
     */
    @TableField(value = "site_name")
    private String site_name;

    /**
     * 
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

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
        AtAgentEmail other = (AtAgentEmail) that;
        return (this.getEmail_id() == null ? other.getEmail_id() == null : this.getEmail_id().equals(other.getEmail_id()))
            && (this.getEmail_server_address() == null ? other.getEmail_server_address() == null : this.getEmail_server_address().equals(other.getEmail_server_address()))
            && (this.getSend_email() == null ? other.getSend_email() == null : this.getSend_email().equals(other.getSend_email()))
            && (this.getEmail_subject() == null ? other.getEmail_subject() == null : this.getEmail_subject().equals(other.getEmail_subject()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getPass_word() == null ? other.getPass_word() == null : this.getPass_word().equals(other.getPass_word()))
            && (this.getSite_name() == null ? other.getSite_name() == null : this.getSite_name().equals(other.getSite_name()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmail_id() == null) ? 0 : getEmail_id().hashCode());
        result = prime * result + ((getEmail_server_address() == null) ? 0 : getEmail_server_address().hashCode());
        result = prime * result + ((getSend_email() == null) ? 0 : getSend_email().hashCode());
        result = prime * result + ((getEmail_subject() == null) ? 0 : getEmail_subject().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getPass_word() == null) ? 0 : getPass_word().hashCode());
        result = prime * result + ((getSite_name() == null) ? 0 : getSite_name().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", email_id=").append(email_id);
        sb.append(", email_server_address=").append(email_server_address);
        sb.append(", send_email=").append(send_email);
        sb.append(", email_subject=").append(email_subject);
        sb.append(", user_name=").append(user_name);
        sb.append(", pass_word=").append(pass_word);
        sb.append(", site_name=").append(site_name);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}