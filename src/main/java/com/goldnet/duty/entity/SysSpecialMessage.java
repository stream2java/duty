package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 特殊讯息表
 * @TableName sys_special_message
 */
@TableName(value ="sys_special_message")
@Data
public class SysSpecialMessage implements Serializable {
    /**
     * 特殊讯息表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 讯息id
     */
    @TableField(value = "message_id")
    private Object message_id;

    /**
     * 账号id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 繁体中文主题
     */
    @TableField(value = "big5_subject")
    private String big5_subject;

    /**
     * 简体中文主题
     */
    @TableField(value = "gbk_subject")
    private String gbk_subject;

    /**
     * 英文主题
     */
    @TableField(value = "en_subject")
    private String en_subject;

    /**
     * 繁体中文内容
     */
    @TableField(value = "big5_content")
    private String big5_content;

    /**
     * 简体中文内容
     */
    @TableField(value = "gbk_content")
    private String gbk_content;

    /**
     * 英文内容

     */
    @TableField(value = "en_content")
    private String en_content;

    /**
     * 大大股东id
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "is_read")
    private Object is_read;

    /**
     * 
     */
    @TableField(value = "send_date_time")
    private LocalDateTime send_date_time;

    /**
     * 
     */
    @TableField(value = "account_name")
    private String account_name;

    /**
     * 消息类型（0:：特殊讯息 1：会员留言）
     */
    @TableField(value = "message_type")
    private Object message_type;

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
        SysSpecialMessage other = (SysSpecialMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMessage_id() == null ? other.getMessage_id() == null : this.getMessage_id().equals(other.getMessage_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getBig5_subject() == null ? other.getBig5_subject() == null : this.getBig5_subject().equals(other.getBig5_subject()))
            && (this.getGbk_subject() == null ? other.getGbk_subject() == null : this.getGbk_subject().equals(other.getGbk_subject()))
            && (this.getEn_subject() == null ? other.getEn_subject() == null : this.getEn_subject().equals(other.getEn_subject()))
            && (this.getBig5_content() == null ? other.getBig5_content() == null : this.getBig5_content().equals(other.getBig5_content()))
            && (this.getGbk_content() == null ? other.getGbk_content() == null : this.getGbk_content().equals(other.getGbk_content()))
            && (this.getEn_content() == null ? other.getEn_content() == null : this.getEn_content().equals(other.getEn_content()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getIs_read() == null ? other.getIs_read() == null : this.getIs_read().equals(other.getIs_read()))
            && (this.getSend_date_time() == null ? other.getSend_date_time() == null : this.getSend_date_time().equals(other.getSend_date_time()))
            && (this.getAccount_name() == null ? other.getAccount_name() == null : this.getAccount_name().equals(other.getAccount_name()))
            && (this.getMessage_type() == null ? other.getMessage_type() == null : this.getMessage_type().equals(other.getMessage_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMessage_id() == null) ? 0 : getMessage_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getBig5_subject() == null) ? 0 : getBig5_subject().hashCode());
        result = prime * result + ((getGbk_subject() == null) ? 0 : getGbk_subject().hashCode());
        result = prime * result + ((getEn_subject() == null) ? 0 : getEn_subject().hashCode());
        result = prime * result + ((getBig5_content() == null) ? 0 : getBig5_content().hashCode());
        result = prime * result + ((getGbk_content() == null) ? 0 : getGbk_content().hashCode());
        result = prime * result + ((getEn_content() == null) ? 0 : getEn_content().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getIs_read() == null) ? 0 : getIs_read().hashCode());
        result = prime * result + ((getSend_date_time() == null) ? 0 : getSend_date_time().hashCode());
        result = prime * result + ((getAccount_name() == null) ? 0 : getAccount_name().hashCode());
        result = prime * result + ((getMessage_type() == null) ? 0 : getMessage_type().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", message_id=").append(message_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", big5_subject=").append(big5_subject);
        sb.append(", gbk_subject=").append(gbk_subject);
        sb.append(", en_subject=").append(en_subject);
        sb.append(", big5_content=").append(big5_content);
        sb.append(", gbk_content=").append(gbk_content);
        sb.append(", en_content=").append(en_content);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", is_read=").append(is_read);
        sb.append(", send_date_time=").append(send_date_time);
        sb.append(", account_name=").append(account_name);
        sb.append(", message_type=").append(message_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}