package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 会员资讯管理表【最新消息、历史消息】
 * @TableName sys_member_announcement
 */
@TableName(value ="sys_member_announcement")
@Data
public class SysMemberAnnouncement implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 创建时间...
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

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
     * 显示历史 1-显示 0-不显示

     */
    @TableField(value = "history")
    private Object history;

    /**
     * 启用状态, 0-禁止 1-启用

     */
    @TableField(value = "status")
    private Object status;

    /**
     * 大大股东id

     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

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
        SysMemberAnnouncement other = (SysMemberAnnouncement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getBig5_content() == null ? other.getBig5_content() == null : this.getBig5_content().equals(other.getBig5_content()))
            && (this.getGbk_content() == null ? other.getGbk_content() == null : this.getGbk_content().equals(other.getGbk_content()))
            && (this.getEn_content() == null ? other.getEn_content() == null : this.getEn_content().equals(other.getEn_content()))
            && (this.getHistory() == null ? other.getHistory() == null : this.getHistory().equals(other.getHistory()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getBig5_content() == null) ? 0 : getBig5_content().hashCode());
        result = prime * result + ((getGbk_content() == null) ? 0 : getGbk_content().hashCode());
        result = prime * result + ((getEn_content() == null) ? 0 : getEn_content().hashCode());
        result = prime * result + ((getHistory() == null) ? 0 : getHistory().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", big5_content=").append(big5_content);
        sb.append(", gbk_content=").append(gbk_content);
        sb.append(", en_content=").append(en_content);
        sb.append(", history=").append(history);
        sb.append(", status=").append(status);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}