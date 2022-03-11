package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 在线客服管理
 * @TableName wi_online_service
 */
@TableName(value ="wi_online_service")
@Data
public class WiOnlineService implements Serializable {
    /**
     * service使用状态:0-停用1-启用
     */
    @TableId(value = "service_id")
    private Object service_id;

    /**
     * 
     */
    @TableField(value = "service_status")
    private Object service_status;

    /**
     * 是否本地链接:0-不是1-是
     */
    @TableField(value = "is_local")
    private Object is_local;

    /**
     * 是否窗口打开:0-不使用1-使用
     */
    @TableField(value = "is_window")
    private Object is_window;

    /**
     * 窗口高度
     */
    @TableField(value = "window_height")
    private Object window_height;

    /**
     * 窗口宽度
     */
    @TableField(value = "window_width")
    private Object window_width;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

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

    /**
     * 大大股东ID
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 案件种类
     */
    @TableField(value = "kind_id")
    private Object kind_id;

    /**
     * 0-正在编辑,1-正在使用
     */
    @TableField(value = "doc_type")
    private Object doc_type;

    /**
     * 审核状态：1-审核中2-已审核3-撤销
     */
    @TableField(value = "auditing_status")
    private Object auditing_status;

    /**
     * 生效时间
     */
    @TableField(value = "effect_time")
    private LocalDateTime effect_time;

    /**
     * 繁体地址
     */
    @TableField(value = "url_tra")
    private String url_tra;

    /**
     * 简体地址
     */
    @TableField(value = "url_sim")
    private String url_sim;

    /**
     * 英文地址
     */
    @TableField(value = "url_eng")
    private String url_eng;

    /**
     * 案件名称
     */
    @TableField(value = "doc_name")
    private String doc_name;

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
        WiOnlineService other = (WiOnlineService) that;
        return (this.getService_id() == null ? other.getService_id() == null : this.getService_id().equals(other.getService_id()))
            && (this.getService_status() == null ? other.getService_status() == null : this.getService_status().equals(other.getService_status()))
            && (this.getIs_local() == null ? other.getIs_local() == null : this.getIs_local().equals(other.getIs_local()))
            && (this.getIs_window() == null ? other.getIs_window() == null : this.getIs_window().equals(other.getIs_window()))
            && (this.getWindow_height() == null ? other.getWindow_height() == null : this.getWindow_height().equals(other.getWindow_height()))
            && (this.getWindow_width() == null ? other.getWindow_width() == null : this.getWindow_width().equals(other.getWindow_width()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getKind_id() == null ? other.getKind_id() == null : this.getKind_id().equals(other.getKind_id()))
            && (this.getDoc_type() == null ? other.getDoc_type() == null : this.getDoc_type().equals(other.getDoc_type()))
            && (this.getAuditing_status() == null ? other.getAuditing_status() == null : this.getAuditing_status().equals(other.getAuditing_status()))
            && (this.getEffect_time() == null ? other.getEffect_time() == null : this.getEffect_time().equals(other.getEffect_time()))
            && (this.getUrl_tra() == null ? other.getUrl_tra() == null : this.getUrl_tra().equals(other.getUrl_tra()))
            && (this.getUrl_sim() == null ? other.getUrl_sim() == null : this.getUrl_sim().equals(other.getUrl_sim()))
            && (this.getUrl_eng() == null ? other.getUrl_eng() == null : this.getUrl_eng().equals(other.getUrl_eng()))
            && (this.getDoc_name() == null ? other.getDoc_name() == null : this.getDoc_name().equals(other.getDoc_name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getService_id() == null) ? 0 : getService_id().hashCode());
        result = prime * result + ((getService_status() == null) ? 0 : getService_status().hashCode());
        result = prime * result + ((getIs_local() == null) ? 0 : getIs_local().hashCode());
        result = prime * result + ((getIs_window() == null) ? 0 : getIs_window().hashCode());
        result = prime * result + ((getWindow_height() == null) ? 0 : getWindow_height().hashCode());
        result = prime * result + ((getWindow_width() == null) ? 0 : getWindow_width().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getKind_id() == null) ? 0 : getKind_id().hashCode());
        result = prime * result + ((getDoc_type() == null) ? 0 : getDoc_type().hashCode());
        result = prime * result + ((getAuditing_status() == null) ? 0 : getAuditing_status().hashCode());
        result = prime * result + ((getEffect_time() == null) ? 0 : getEffect_time().hashCode());
        result = prime * result + ((getUrl_tra() == null) ? 0 : getUrl_tra().hashCode());
        result = prime * result + ((getUrl_sim() == null) ? 0 : getUrl_sim().hashCode());
        result = prime * result + ((getUrl_eng() == null) ? 0 : getUrl_eng().hashCode());
        result = prime * result + ((getDoc_name() == null) ? 0 : getDoc_name().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", service_id=").append(service_id);
        sb.append(", service_status=").append(service_status);
        sb.append(", is_local=").append(is_local);
        sb.append(", is_window=").append(is_window);
        sb.append(", window_height=").append(window_height);
        sb.append(", window_width=").append(window_width);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", kind_id=").append(kind_id);
        sb.append(", doc_type=").append(doc_type);
        sb.append(", auditing_status=").append(auditing_status);
        sb.append(", effect_time=").append(effect_time);
        sb.append(", url_tra=").append(url_tra);
        sb.append(", url_sim=").append(url_sim);
        sb.append(", url_eng=").append(url_eng);
        sb.append(", doc_name=").append(doc_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}