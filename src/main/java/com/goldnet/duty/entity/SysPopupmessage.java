package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 管理彈跳公告【会员弹出公告、代理弹出公告】
 * @TableName sys_popupmessage
 */
@TableName(value ="sys_popupmessage")
@Data
public class SysPopupmessage implements Serializable {
    /**
     * 主键
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 繁体中文公告内容
     */
    @TableField(value = "big5_content")
    private String big5_content;

    /**
     * 简体中文公告内容
     */
    @TableField(value = "gbk_content")
    private String gbk_content;

    /**
     * 英文公告内容

     */
    @TableField(value = "en_content")
    private String en_content;

    /**
     * 等级
     */
    @TableField(value = "rate")
    private Object rate;

    /**
     * 启用状态 0-关闭, 1-启用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 大大股东Id
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "big5_pic_url")
    private String big5_pic_url;

    /**
     * 
     */
    @TableField(value = "gbk_pic_url")
    private String gbk_pic_url;

    /**
     * 
     */
    @TableField(value = "en_pic_url")
    private String en_pic_url;

    /**
     * 
     */
    @TableField(value = "big5_msg_type")
    private Object big5_msg_type;

    /**
     * 
     */
    @TableField(value = "gbk_msg_type")
    private Object gbk_msg_type;

    /**
     * 
     */
    @TableField(value = "en_msg_type")
    private Object en_msg_type;

    /**
     * 
     */
    @TableField(value = "big5_width")
    private Object big5_width;

    /**
     * 
     */
    @TableField(value = "gbk_width")
    private Object gbk_width;

    /**
     * 
     */
    @TableField(value = "en_width")
    private Object en_width;

    /**
     * 
     */
    @TableField(value = "big5_height")
    private Object big5_height;

    /**
     * 
     */
    @TableField(value = "gbk_height")
    private Object gbk_height;

    /**
     * 
     */
    @TableField(value = "en_height")
    private Object en_height;

    /**
     * 
     */
    @TableField(value = "last_update_time")
    private LocalDateTime last_update_time;

    /**
     * 
     */
    @TableField(value = "title")
    private String title;

    /**
     * 
     */
    @TableField(value = "level_id")
    private String level_id;

    /**
     * 首次弹窗的代理ID
     */
    @TableField(value = "agent_id")
    private String agent_id;

    /**
     * 0:普通弹窗，1:会员首次登录弹窗
     */
    @TableField(value = "show_type")
    private Integer show_type;

    /**
     * 终端类型（0：PC，1：手机）
     */
    @TableField(value = "terminal_type")
    private Integer terminal_type;

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
        SysPopupmessage other = (SysPopupmessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getBig5_content() == null ? other.getBig5_content() == null : this.getBig5_content().equals(other.getBig5_content()))
            && (this.getGbk_content() == null ? other.getGbk_content() == null : this.getGbk_content().equals(other.getGbk_content()))
            && (this.getEn_content() == null ? other.getEn_content() == null : this.getEn_content().equals(other.getEn_content()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getBig5_pic_url() == null ? other.getBig5_pic_url() == null : this.getBig5_pic_url().equals(other.getBig5_pic_url()))
            && (this.getGbk_pic_url() == null ? other.getGbk_pic_url() == null : this.getGbk_pic_url().equals(other.getGbk_pic_url()))
            && (this.getEn_pic_url() == null ? other.getEn_pic_url() == null : this.getEn_pic_url().equals(other.getEn_pic_url()))
            && (this.getBig5_msg_type() == null ? other.getBig5_msg_type() == null : this.getBig5_msg_type().equals(other.getBig5_msg_type()))
            && (this.getGbk_msg_type() == null ? other.getGbk_msg_type() == null : this.getGbk_msg_type().equals(other.getGbk_msg_type()))
            && (this.getEn_msg_type() == null ? other.getEn_msg_type() == null : this.getEn_msg_type().equals(other.getEn_msg_type()))
            && (this.getBig5_width() == null ? other.getBig5_width() == null : this.getBig5_width().equals(other.getBig5_width()))
            && (this.getGbk_width() == null ? other.getGbk_width() == null : this.getGbk_width().equals(other.getGbk_width()))
            && (this.getEn_width() == null ? other.getEn_width() == null : this.getEn_width().equals(other.getEn_width()))
            && (this.getBig5_height() == null ? other.getBig5_height() == null : this.getBig5_height().equals(other.getBig5_height()))
            && (this.getGbk_height() == null ? other.getGbk_height() == null : this.getGbk_height().equals(other.getGbk_height()))
            && (this.getEn_height() == null ? other.getEn_height() == null : this.getEn_height().equals(other.getEn_height()))
            && (this.getLast_update_time() == null ? other.getLast_update_time() == null : this.getLast_update_time().equals(other.getLast_update_time()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getShow_type() == null ? other.getShow_type() == null : this.getShow_type().equals(other.getShow_type()))
            && (this.getTerminal_type() == null ? other.getTerminal_type() == null : this.getTerminal_type().equals(other.getTerminal_type()));
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
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getBig5_pic_url() == null) ? 0 : getBig5_pic_url().hashCode());
        result = prime * result + ((getGbk_pic_url() == null) ? 0 : getGbk_pic_url().hashCode());
        result = prime * result + ((getEn_pic_url() == null) ? 0 : getEn_pic_url().hashCode());
        result = prime * result + ((getBig5_msg_type() == null) ? 0 : getBig5_msg_type().hashCode());
        result = prime * result + ((getGbk_msg_type() == null) ? 0 : getGbk_msg_type().hashCode());
        result = prime * result + ((getEn_msg_type() == null) ? 0 : getEn_msg_type().hashCode());
        result = prime * result + ((getBig5_width() == null) ? 0 : getBig5_width().hashCode());
        result = prime * result + ((getGbk_width() == null) ? 0 : getGbk_width().hashCode());
        result = prime * result + ((getEn_width() == null) ? 0 : getEn_width().hashCode());
        result = prime * result + ((getBig5_height() == null) ? 0 : getBig5_height().hashCode());
        result = prime * result + ((getGbk_height() == null) ? 0 : getGbk_height().hashCode());
        result = prime * result + ((getEn_height() == null) ? 0 : getEn_height().hashCode());
        result = prime * result + ((getLast_update_time() == null) ? 0 : getLast_update_time().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getShow_type() == null) ? 0 : getShow_type().hashCode());
        result = prime * result + ((getTerminal_type() == null) ? 0 : getTerminal_type().hashCode());
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
        sb.append(", rate=").append(rate);
        sb.append(", status=").append(status);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", big5_pic_url=").append(big5_pic_url);
        sb.append(", gbk_pic_url=").append(gbk_pic_url);
        sb.append(", en_pic_url=").append(en_pic_url);
        sb.append(", big5_msg_type=").append(big5_msg_type);
        sb.append(", gbk_msg_type=").append(gbk_msg_type);
        sb.append(", en_msg_type=").append(en_msg_type);
        sb.append(", big5_width=").append(big5_width);
        sb.append(", gbk_width=").append(gbk_width);
        sb.append(", en_width=").append(en_width);
        sb.append(", big5_height=").append(big5_height);
        sb.append(", gbk_height=").append(gbk_height);
        sb.append(", en_height=").append(en_height);
        sb.append(", last_update_time=").append(last_update_time);
        sb.append(", title=").append(title);
        sb.append(", level_id=").append(level_id);
        sb.append(", agent_id=").append(agent_id);
        sb.append(", show_type=").append(show_type);
        sb.append(", terminal_type=").append(terminal_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}