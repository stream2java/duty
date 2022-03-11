package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 讯息内容表【管理信息表、一般信息、特殊信息】
 * @TableName sys_message_content
 */
@TableName(value ="sys_message_content")
@Data
public class SysMessageContent implements Serializable {
    /**
     * 讯息内容id
     */
    @TableId(value = "id")
    private Object id;

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
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 讯息类型: 0一般讯息1特殊讯息
     */
    @TableField(value = "message_type")
    private Object message_type;

    /**
     * 是否发送:0-未发送，1已发送
     */
    @TableField(value = "is_send")
    private Object is_send;

    /**
     * 大大股东id
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

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
        SysMessageContent other = (SysMessageContent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBig5_subject() == null ? other.getBig5_subject() == null : this.getBig5_subject().equals(other.getBig5_subject()))
            && (this.getGbk_subject() == null ? other.getGbk_subject() == null : this.getGbk_subject().equals(other.getGbk_subject()))
            && (this.getEn_subject() == null ? other.getEn_subject() == null : this.getEn_subject().equals(other.getEn_subject()))
            && (this.getBig5_content() == null ? other.getBig5_content() == null : this.getBig5_content().equals(other.getBig5_content()))
            && (this.getGbk_content() == null ? other.getGbk_content() == null : this.getGbk_content().equals(other.getGbk_content()))
            && (this.getEn_content() == null ? other.getEn_content() == null : this.getEn_content().equals(other.getEn_content()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getMessage_type() == null ? other.getMessage_type() == null : this.getMessage_type().equals(other.getMessage_type()))
            && (this.getIs_send() == null ? other.getIs_send() == null : this.getIs_send().equals(other.getIs_send()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBig5_subject() == null) ? 0 : getBig5_subject().hashCode());
        result = prime * result + ((getGbk_subject() == null) ? 0 : getGbk_subject().hashCode());
        result = prime * result + ((getEn_subject() == null) ? 0 : getEn_subject().hashCode());
        result = prime * result + ((getBig5_content() == null) ? 0 : getBig5_content().hashCode());
        result = prime * result + ((getGbk_content() == null) ? 0 : getGbk_content().hashCode());
        result = prime * result + ((getEn_content() == null) ? 0 : getEn_content().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getMessage_type() == null) ? 0 : getMessage_type().hashCode());
        result = prime * result + ((getIs_send() == null) ? 0 : getIs_send().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", big5_subject=").append(big5_subject);
        sb.append(", gbk_subject=").append(gbk_subject);
        sb.append(", en_subject=").append(en_subject);
        sb.append(", big5_content=").append(big5_content);
        sb.append(", gbk_content=").append(gbk_content);
        sb.append(", en_content=").append(en_content);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", message_type=").append(message_type);
        sb.append(", is_send=").append(is_send);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}