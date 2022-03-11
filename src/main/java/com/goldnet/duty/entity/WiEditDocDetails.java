package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 首页文案具体表
 * @TableName wi_edit_doc_details
 */
@TableName(value ="wi_edit_doc_details")
@Data
public class WiEditDocDetails implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "details_id")
    private Object details_id;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改者
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 原排序
     */
    @TableField(value = "old_sort")
    private Object old_sort;

    /**
     * 现排序
     */
    @TableField(value = "now_sort")
    private Object now_sort;

    /**
     * 名称繁体
     */
    @TableField(value = "name_tra")
    private String name_tra;

    /**
     * 名称简体
     */
    @TableField(value = "name_sim")
    private String name_sim;

    /**
     * 名称英文
     */
    @TableField(value = "name_eng")
    private String name_eng;

    /**
     * 是否使用图片繁体：0-否1-是
     */
    @TableField(value = "pic_status_tra")
    private Object pic_status_tra;

    /**
     * 是否使用图片简体：0-否1-是
     */
    @TableField(value = "pic_status_sim")
    private Object pic_status_sim;

    /**
     * 是否使用图片英文：0-否1-是
     */
    @TableField(value = "pic_status_eng")
    private Object pic_status_eng;

    /**
     * 内容图片繁体
     */
    @TableField(value = "context_pic_tra")
    private String context_pic_tra;

    /**
     * 内容图片简体
     */
    @TableField(value = "context_pic_sim")
    private String context_pic_sim;

    /**
     * 内容图片英文
     */
    @TableField(value = "context_pic_eng")
    private String context_pic_eng;

    /**
     * 内容繁体
     */
    @TableField(value = "context_tra")
    private String context_tra;

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
     * 关联的首页文案编辑案件id
     */
    @TableField(value = "doc_id")
    private Object doc_id;

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
        WiEditDocDetails other = (WiEditDocDetails) that;
        return (this.getDetails_id() == null ? other.getDetails_id() == null : this.getDetails_id().equals(other.getDetails_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getOld_sort() == null ? other.getOld_sort() == null : this.getOld_sort().equals(other.getOld_sort()))
            && (this.getNow_sort() == null ? other.getNow_sort() == null : this.getNow_sort().equals(other.getNow_sort()))
            && (this.getName_tra() == null ? other.getName_tra() == null : this.getName_tra().equals(other.getName_tra()))
            && (this.getName_sim() == null ? other.getName_sim() == null : this.getName_sim().equals(other.getName_sim()))
            && (this.getName_eng() == null ? other.getName_eng() == null : this.getName_eng().equals(other.getName_eng()))
            && (this.getPic_status_tra() == null ? other.getPic_status_tra() == null : this.getPic_status_tra().equals(other.getPic_status_tra()))
            && (this.getPic_status_sim() == null ? other.getPic_status_sim() == null : this.getPic_status_sim().equals(other.getPic_status_sim()))
            && (this.getPic_status_eng() == null ? other.getPic_status_eng() == null : this.getPic_status_eng().equals(other.getPic_status_eng()))
            && (this.getContext_pic_tra() == null ? other.getContext_pic_tra() == null : this.getContext_pic_tra().equals(other.getContext_pic_tra()))
            && (this.getContext_pic_sim() == null ? other.getContext_pic_sim() == null : this.getContext_pic_sim().equals(other.getContext_pic_sim()))
            && (this.getContext_pic_eng() == null ? other.getContext_pic_eng() == null : this.getContext_pic_eng().equals(other.getContext_pic_eng()))
            && (this.getContext_tra() == null ? other.getContext_tra() == null : this.getContext_tra().equals(other.getContext_tra()))
            && (this.getContext_sim() == null ? other.getContext_sim() == null : this.getContext_sim().equals(other.getContext_sim()))
            && (this.getContext_eng() == null ? other.getContext_eng() == null : this.getContext_eng().equals(other.getContext_eng()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetails_id() == null) ? 0 : getDetails_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getOld_sort() == null) ? 0 : getOld_sort().hashCode());
        result = prime * result + ((getNow_sort() == null) ? 0 : getNow_sort().hashCode());
        result = prime * result + ((getName_tra() == null) ? 0 : getName_tra().hashCode());
        result = prime * result + ((getName_sim() == null) ? 0 : getName_sim().hashCode());
        result = prime * result + ((getName_eng() == null) ? 0 : getName_eng().hashCode());
        result = prime * result + ((getPic_status_tra() == null) ? 0 : getPic_status_tra().hashCode());
        result = prime * result + ((getPic_status_sim() == null) ? 0 : getPic_status_sim().hashCode());
        result = prime * result + ((getPic_status_eng() == null) ? 0 : getPic_status_eng().hashCode());
        result = prime * result + ((getContext_pic_tra() == null) ? 0 : getContext_pic_tra().hashCode());
        result = prime * result + ((getContext_pic_sim() == null) ? 0 : getContext_pic_sim().hashCode());
        result = prime * result + ((getContext_pic_eng() == null) ? 0 : getContext_pic_eng().hashCode());
        result = prime * result + ((getContext_tra() == null) ? 0 : getContext_tra().hashCode());
        result = prime * result + ((getContext_sim() == null) ? 0 : getContext_sim().hashCode());
        result = prime * result + ((getContext_eng() == null) ? 0 : getContext_eng().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", details_id=").append(details_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", old_sort=").append(old_sort);
        sb.append(", now_sort=").append(now_sort);
        sb.append(", name_tra=").append(name_tra);
        sb.append(", name_sim=").append(name_sim);
        sb.append(", name_eng=").append(name_eng);
        sb.append(", pic_status_tra=").append(pic_status_tra);
        sb.append(", pic_status_sim=").append(pic_status_sim);
        sb.append(", pic_status_eng=").append(pic_status_eng);
        sb.append(", context_pic_tra=").append(context_pic_tra);
        sb.append(", context_pic_sim=").append(context_pic_sim);
        sb.append(", context_pic_eng=").append(context_pic_eng);
        sb.append(", context_tra=").append(context_tra);
        sb.append(", context_sim=").append(context_sim);
        sb.append(", context_eng=").append(context_eng);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}