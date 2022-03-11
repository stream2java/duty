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
 * @TableName sys_member_message_202009
 */
@TableName(value ="sys_member_message_202009")
@Data
public class SysMemberMessage202009 implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "message_id")
    private Object message_id;

    /**
     * 
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "is_read")
    private Object is_read;

    /**
     * 
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "send_date_time")
    private LocalDateTime send_date_time;

    /**
     * 
     */
    @TableField(value = "big5_subject")
    private String big5_subject;

    /**
     * 
     */
    @TableField(value = "gbk_subject")
    private String gbk_subject;

    /**
     * 
     */
    @TableField(value = "en_subject")
    private String en_subject;

    /**
     * 
     */
    @TableField(value = "big5_content")
    private String big5_content;

    /**
     * 
     */
    @TableField(value = "gbk_content")
    private String gbk_content;

    /**
     * 
     */
    @TableField(value = "en_content")
    private String en_content;

    /**
     * 
     */
    @TableField(value = "send_id")
    private Object send_id;

    /**
     * 
     */
    @TableField(value = "is_delete")
    private Object is_delete;

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
        SysMemberMessage202009 other = (SysMemberMessage202009) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMessage_id() == null ? other.getMessage_id() == null : this.getMessage_id().equals(other.getMessage_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getIs_read() == null ? other.getIs_read() == null : this.getIs_read().equals(other.getIs_read()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getSend_date_time() == null ? other.getSend_date_time() == null : this.getSend_date_time().equals(other.getSend_date_time()))
            && (this.getBig5_subject() == null ? other.getBig5_subject() == null : this.getBig5_subject().equals(other.getBig5_subject()))
            && (this.getGbk_subject() == null ? other.getGbk_subject() == null : this.getGbk_subject().equals(other.getGbk_subject()))
            && (this.getEn_subject() == null ? other.getEn_subject() == null : this.getEn_subject().equals(other.getEn_subject()))
            && (this.getBig5_content() == null ? other.getBig5_content() == null : this.getBig5_content().equals(other.getBig5_content()))
            && (this.getGbk_content() == null ? other.getGbk_content() == null : this.getGbk_content().equals(other.getGbk_content()))
            && (this.getEn_content() == null ? other.getEn_content() == null : this.getEn_content().equals(other.getEn_content()))
            && (this.getSend_id() == null ? other.getSend_id() == null : this.getSend_id().equals(other.getSend_id()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMessage_id() == null) ? 0 : getMessage_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getIs_read() == null) ? 0 : getIs_read().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getSend_date_time() == null) ? 0 : getSend_date_time().hashCode());
        result = prime * result + ((getBig5_subject() == null) ? 0 : getBig5_subject().hashCode());
        result = prime * result + ((getGbk_subject() == null) ? 0 : getGbk_subject().hashCode());
        result = prime * result + ((getEn_subject() == null) ? 0 : getEn_subject().hashCode());
        result = prime * result + ((getBig5_content() == null) ? 0 : getBig5_content().hashCode());
        result = prime * result + ((getGbk_content() == null) ? 0 : getGbk_content().hashCode());
        result = prime * result + ((getEn_content() == null) ? 0 : getEn_content().hashCode());
        result = prime * result + ((getSend_id() == null) ? 0 : getSend_id().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
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
        sb.append(", is_read=").append(is_read);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", send_date_time=").append(send_date_time);
        sb.append(", big5_subject=").append(big5_subject);
        sb.append(", gbk_subject=").append(gbk_subject);
        sb.append(", en_subject=").append(en_subject);
        sb.append(", big5_content=").append(big5_content);
        sb.append(", gbk_content=").append(gbk_content);
        sb.append(", en_content=").append(en_content);
        sb.append(", send_id=").append(send_id);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}