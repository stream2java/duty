package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 文案类案件
 * @TableName wi_edoc_details
 */
@TableName(value ="wi_edoc_details")
@Data
public class WiEdocDetails implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "id")
    private Object id;

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
     * 标题繁体
     */
    @TableField(value = "title_big")
    private String title_big;

    /**
     * 标题简体
     */
    @TableField(value = "title_sim")
    private String title_sim;

    /**
     * 标题英文
     */
    @TableField(value = "title_eng")
    private String title_eng;

    /**
     * 关联案件ID
     */
    @TableField(value = "doc_id")
    private Object doc_id;

    /**
     * 使用图片繁体：0-否1-是
     */
    @TableField(value = "pic_status_big")
    private Object pic_status_big;

    /**
     * 使用图片简体：0-否1-是
     */
    @TableField(value = "pic_status_sim")
    private Object pic_status_sim;

    /**
     * 使用图片英文：0-否1-是
     */
    @TableField(value = "pic_status_eng")
    private Object pic_status_eng;

    /**
     * 繁体内容图片
     */
    @TableField(value = "cpic_big")
    private String cpic_big;

    /**
     * 简体内容图片
     */
    @TableField(value = "cpic_sim")
    private String cpic_sim;

    /**
     * 英文内容图片
     */
    @TableField(value = "cpic_eng")
    private String cpic_eng;

    /**
     * 内容繁体
     */
    @TableField(value = "context_big")
    private String context_big;

    /**
     * 内容简体
     */
    @TableField(value = "context_sim")
    private String context_sim;

    /**
     * 内容英文
     */
    @TableField(value = "context_eng")
    private String context_eng;

    /**
     * 原排序
     */
    @TableField(value = "old_sort")
    private Object old_sort;

    /**
     * 现在排序
     */
    @TableField(value = "now_sort")
    private Object now_sort;

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
        WiEdocDetails other = (WiEdocDetails) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getTitle_big() == null ? other.getTitle_big() == null : this.getTitle_big().equals(other.getTitle_big()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getPic_status_big() == null ? other.getPic_status_big() == null : this.getPic_status_big().equals(other.getPic_status_big()))
            && (this.getPic_status_sim() == null ? other.getPic_status_sim() == null : this.getPic_status_sim().equals(other.getPic_status_sim()))
            && (this.getPic_status_eng() == null ? other.getPic_status_eng() == null : this.getPic_status_eng().equals(other.getPic_status_eng()))
            && (this.getCpic_big() == null ? other.getCpic_big() == null : this.getCpic_big().equals(other.getCpic_big()))
            && (this.getCpic_sim() == null ? other.getCpic_sim() == null : this.getCpic_sim().equals(other.getCpic_sim()))
            && (this.getCpic_eng() == null ? other.getCpic_eng() == null : this.getCpic_eng().equals(other.getCpic_eng()))
            && (this.getContext_big() == null ? other.getContext_big() == null : this.getContext_big().equals(other.getContext_big()))
            && (this.getContext_sim() == null ? other.getContext_sim() == null : this.getContext_sim().equals(other.getContext_sim()))
            && (this.getContext_eng() == null ? other.getContext_eng() == null : this.getContext_eng().equals(other.getContext_eng()))
            && (this.getOld_sort() == null ? other.getOld_sort() == null : this.getOld_sort().equals(other.getOld_sort()))
            && (this.getNow_sort() == null ? other.getNow_sort() == null : this.getNow_sort().equals(other.getNow_sort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getTitle_big() == null) ? 0 : getTitle_big().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getPic_status_big() == null) ? 0 : getPic_status_big().hashCode());
        result = prime * result + ((getPic_status_sim() == null) ? 0 : getPic_status_sim().hashCode());
        result = prime * result + ((getPic_status_eng() == null) ? 0 : getPic_status_eng().hashCode());
        result = prime * result + ((getCpic_big() == null) ? 0 : getCpic_big().hashCode());
        result = prime * result + ((getCpic_sim() == null) ? 0 : getCpic_sim().hashCode());
        result = prime * result + ((getCpic_eng() == null) ? 0 : getCpic_eng().hashCode());
        result = prime * result + ((getContext_big() == null) ? 0 : getContext_big().hashCode());
        result = prime * result + ((getContext_sim() == null) ? 0 : getContext_sim().hashCode());
        result = prime * result + ((getContext_eng() == null) ? 0 : getContext_eng().hashCode());
        result = prime * result + ((getOld_sort() == null) ? 0 : getOld_sort().hashCode());
        result = prime * result + ((getNow_sort() == null) ? 0 : getNow_sort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", title_big=").append(title_big);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", pic_status_big=").append(pic_status_big);
        sb.append(", pic_status_sim=").append(pic_status_sim);
        sb.append(", pic_status_eng=").append(pic_status_eng);
        sb.append(", cpic_big=").append(cpic_big);
        sb.append(", cpic_sim=").append(cpic_sim);
        sb.append(", cpic_eng=").append(cpic_eng);
        sb.append(", context_big=").append(context_big);
        sb.append(", context_sim=").append(context_sim);
        sb.append(", context_eng=").append(context_eng);
        sb.append(", old_sort=").append(old_sort);
        sb.append(", now_sort=").append(now_sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}