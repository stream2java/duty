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
 * @TableName mny_pre_activity
 */
@TableName(value ="mny_pre_activity")
@Data
public class MnyPreActivity implements Serializable {
    /**
     * 优惠活动id
     */
    @TableId(value = "pre_activity_id")
    private Object pre_activity_id;

    /**
     * 文案id
     */
    @TableField(value = "doc_id")
    private Object doc_id;

    /**
     * 优惠活动名称繁体形式
     */
    @TableField(value = "activity_name_tra")
    private String activity_name_tra;

    /**
     * 优惠活动名称简体形式
     */
    @TableField(value = "activity_name_sim")
    private String activity_name_sim;

    /**
     * 优惠活动名称英文形式
     */
    @TableField(value = "activity_name_eng")
    private String activity_name_eng;

    /**
     * 原排序
     */
    @TableField(value = "old_sort")
    private Object old_sort;

    /**
     * 旧排序
     */
    @TableField(value = "now_sort")
    private Object now_sort;

    /**
     * 滑鼠状态：0-关闭,1-开启
     */
    @TableField(value = "mouse_status_tra")
    private Object mouse_status_tra;

    /**
     * 是否启用图片：0-否,1-是
     */
    @TableField(value = "picture_status_tra")
    private Object picture_status_tra;

    /**
     * 滑鼠关闭时标题图片
     */
    @TableField(value = "title_pic_tra")
    private String title_pic_tra;

    /**
     * 滑鼠开启时滑鼠滑入图片
     */
    @TableField(value = "mouse_in_pic_tra")
    private String mouse_in_pic_tra;

    /**
     * 滑鼠开启时滑鼠滑出图片
     */
    @TableField(value = "mouse_out_pic_tra")
    private String mouse_out_pic_tra;

    /**
     * 内容繁体形式
     */
    @TableField(value = "content_tra")
    private String content_tra;

    /**
     * 内容简体形式
     */
    @TableField(value = "content_sim")
    private String content_sim;

    /**
     * 内容英文形式
     */
    @TableField(value = "content_eng")
    private String content_eng;

    /**
     * 内容图片
     */
    @TableField(value = "content_pic_tra")
    private String content_pic_tra;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "mouse_status_sim")
    private Object mouse_status_sim;

    /**
     * 
     */
    @TableField(value = "mouse_status_eng")
    private Object mouse_status_eng;

    /**
     * 
     */
    @TableField(value = "picture_status_sim")
    private Object picture_status_sim;

    /**
     * 
     */
    @TableField(value = "picture_status_eng")
    private Object picture_status_eng;

    /**
     * 
     */
    @TableField(value = "title_pic_sim")
    private String title_pic_sim;

    /**
     * 
     */
    @TableField(value = "title_pic_eng")
    private String title_pic_eng;

    /**
     * 
     */
    @TableField(value = "mouse_in_pic_sim")
    private String mouse_in_pic_sim;

    /**
     * 
     */
    @TableField(value = "mouse_in_pic_eng")
    private String mouse_in_pic_eng;

    /**
     * 
     */
    @TableField(value = "mouse_out_pic_sim")
    private String mouse_out_pic_sim;

    /**
     * 
     */
    @TableField(value = "mouse_out_pic_eng")
    private String mouse_out_pic_eng;

    /**
     * 
     */
    @TableField(value = "content_pic_sim")
    private String content_pic_sim;

    /**
     * 
     */
    @TableField(value = "content_pic_eng")
    private String content_pic_eng;

    /**
     * 活动开始时间
     */
    @TableField(value = "startDateTime")
    private LocalDateTime startDateTime;

    /**
     * 活动结束时间
     */
    @TableField(value = "endDateTime")
    private LocalDateTime endDateTime;

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
        MnyPreActivity other = (MnyPreActivity) that;
        return (this.getPre_activity_id() == null ? other.getPre_activity_id() == null : this.getPre_activity_id().equals(other.getPre_activity_id()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getActivity_name_tra() == null ? other.getActivity_name_tra() == null : this.getActivity_name_tra().equals(other.getActivity_name_tra()))
            && (this.getActivity_name_sim() == null ? other.getActivity_name_sim() == null : this.getActivity_name_sim().equals(other.getActivity_name_sim()))
            && (this.getActivity_name_eng() == null ? other.getActivity_name_eng() == null : this.getActivity_name_eng().equals(other.getActivity_name_eng()))
            && (this.getOld_sort() == null ? other.getOld_sort() == null : this.getOld_sort().equals(other.getOld_sort()))
            && (this.getNow_sort() == null ? other.getNow_sort() == null : this.getNow_sort().equals(other.getNow_sort()))
            && (this.getMouse_status_tra() == null ? other.getMouse_status_tra() == null : this.getMouse_status_tra().equals(other.getMouse_status_tra()))
            && (this.getPicture_status_tra() == null ? other.getPicture_status_tra() == null : this.getPicture_status_tra().equals(other.getPicture_status_tra()))
            && (this.getTitle_pic_tra() == null ? other.getTitle_pic_tra() == null : this.getTitle_pic_tra().equals(other.getTitle_pic_tra()))
            && (this.getMouse_in_pic_tra() == null ? other.getMouse_in_pic_tra() == null : this.getMouse_in_pic_tra().equals(other.getMouse_in_pic_tra()))
            && (this.getMouse_out_pic_tra() == null ? other.getMouse_out_pic_tra() == null : this.getMouse_out_pic_tra().equals(other.getMouse_out_pic_tra()))
            && (this.getContent_tra() == null ? other.getContent_tra() == null : this.getContent_tra().equals(other.getContent_tra()))
            && (this.getContent_sim() == null ? other.getContent_sim() == null : this.getContent_sim().equals(other.getContent_sim()))
            && (this.getContent_eng() == null ? other.getContent_eng() == null : this.getContent_eng().equals(other.getContent_eng()))
            && (this.getContent_pic_tra() == null ? other.getContent_pic_tra() == null : this.getContent_pic_tra().equals(other.getContent_pic_tra()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getMouse_status_sim() == null ? other.getMouse_status_sim() == null : this.getMouse_status_sim().equals(other.getMouse_status_sim()))
            && (this.getMouse_status_eng() == null ? other.getMouse_status_eng() == null : this.getMouse_status_eng().equals(other.getMouse_status_eng()))
            && (this.getPicture_status_sim() == null ? other.getPicture_status_sim() == null : this.getPicture_status_sim().equals(other.getPicture_status_sim()))
            && (this.getPicture_status_eng() == null ? other.getPicture_status_eng() == null : this.getPicture_status_eng().equals(other.getPicture_status_eng()))
            && (this.getTitle_pic_sim() == null ? other.getTitle_pic_sim() == null : this.getTitle_pic_sim().equals(other.getTitle_pic_sim()))
            && (this.getTitle_pic_eng() == null ? other.getTitle_pic_eng() == null : this.getTitle_pic_eng().equals(other.getTitle_pic_eng()))
            && (this.getMouse_in_pic_sim() == null ? other.getMouse_in_pic_sim() == null : this.getMouse_in_pic_sim().equals(other.getMouse_in_pic_sim()))
            && (this.getMouse_in_pic_eng() == null ? other.getMouse_in_pic_eng() == null : this.getMouse_in_pic_eng().equals(other.getMouse_in_pic_eng()))
            && (this.getMouse_out_pic_sim() == null ? other.getMouse_out_pic_sim() == null : this.getMouse_out_pic_sim().equals(other.getMouse_out_pic_sim()))
            && (this.getMouse_out_pic_eng() == null ? other.getMouse_out_pic_eng() == null : this.getMouse_out_pic_eng().equals(other.getMouse_out_pic_eng()))
            && (this.getContent_pic_sim() == null ? other.getContent_pic_sim() == null : this.getContent_pic_sim().equals(other.getContent_pic_sim()))
            && (this.getContent_pic_eng() == null ? other.getContent_pic_eng() == null : this.getContent_pic_eng().equals(other.getContent_pic_eng()))
            && (this.getStartDateTime() == null ? other.getStartDateTime() == null : this.getStartDateTime().equals(other.getStartDateTime()))
            && (this.getEndDateTime() == null ? other.getEndDateTime() == null : this.getEndDateTime().equals(other.getEndDateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPre_activity_id() == null) ? 0 : getPre_activity_id().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getActivity_name_tra() == null) ? 0 : getActivity_name_tra().hashCode());
        result = prime * result + ((getActivity_name_sim() == null) ? 0 : getActivity_name_sim().hashCode());
        result = prime * result + ((getActivity_name_eng() == null) ? 0 : getActivity_name_eng().hashCode());
        result = prime * result + ((getOld_sort() == null) ? 0 : getOld_sort().hashCode());
        result = prime * result + ((getNow_sort() == null) ? 0 : getNow_sort().hashCode());
        result = prime * result + ((getMouse_status_tra() == null) ? 0 : getMouse_status_tra().hashCode());
        result = prime * result + ((getPicture_status_tra() == null) ? 0 : getPicture_status_tra().hashCode());
        result = prime * result + ((getTitle_pic_tra() == null) ? 0 : getTitle_pic_tra().hashCode());
        result = prime * result + ((getMouse_in_pic_tra() == null) ? 0 : getMouse_in_pic_tra().hashCode());
        result = prime * result + ((getMouse_out_pic_tra() == null) ? 0 : getMouse_out_pic_tra().hashCode());
        result = prime * result + ((getContent_tra() == null) ? 0 : getContent_tra().hashCode());
        result = prime * result + ((getContent_sim() == null) ? 0 : getContent_sim().hashCode());
        result = prime * result + ((getContent_eng() == null) ? 0 : getContent_eng().hashCode());
        result = prime * result + ((getContent_pic_tra() == null) ? 0 : getContent_pic_tra().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getMouse_status_sim() == null) ? 0 : getMouse_status_sim().hashCode());
        result = prime * result + ((getMouse_status_eng() == null) ? 0 : getMouse_status_eng().hashCode());
        result = prime * result + ((getPicture_status_sim() == null) ? 0 : getPicture_status_sim().hashCode());
        result = prime * result + ((getPicture_status_eng() == null) ? 0 : getPicture_status_eng().hashCode());
        result = prime * result + ((getTitle_pic_sim() == null) ? 0 : getTitle_pic_sim().hashCode());
        result = prime * result + ((getTitle_pic_eng() == null) ? 0 : getTitle_pic_eng().hashCode());
        result = prime * result + ((getMouse_in_pic_sim() == null) ? 0 : getMouse_in_pic_sim().hashCode());
        result = prime * result + ((getMouse_in_pic_eng() == null) ? 0 : getMouse_in_pic_eng().hashCode());
        result = prime * result + ((getMouse_out_pic_sim() == null) ? 0 : getMouse_out_pic_sim().hashCode());
        result = prime * result + ((getMouse_out_pic_eng() == null) ? 0 : getMouse_out_pic_eng().hashCode());
        result = prime * result + ((getContent_pic_sim() == null) ? 0 : getContent_pic_sim().hashCode());
        result = prime * result + ((getContent_pic_eng() == null) ? 0 : getContent_pic_eng().hashCode());
        result = prime * result + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        result = prime * result + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pre_activity_id=").append(pre_activity_id);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", activity_name_tra=").append(activity_name_tra);
        sb.append(", activity_name_sim=").append(activity_name_sim);
        sb.append(", activity_name_eng=").append(activity_name_eng);
        sb.append(", old_sort=").append(old_sort);
        sb.append(", now_sort=").append(now_sort);
        sb.append(", mouse_status_tra=").append(mouse_status_tra);
        sb.append(", picture_status_tra=").append(picture_status_tra);
        sb.append(", title_pic_tra=").append(title_pic_tra);
        sb.append(", mouse_in_pic_tra=").append(mouse_in_pic_tra);
        sb.append(", mouse_out_pic_tra=").append(mouse_out_pic_tra);
        sb.append(", content_tra=").append(content_tra);
        sb.append(", content_sim=").append(content_sim);
        sb.append(", content_eng=").append(content_eng);
        sb.append(", content_pic_tra=").append(content_pic_tra);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", mouse_status_sim=").append(mouse_status_sim);
        sb.append(", mouse_status_eng=").append(mouse_status_eng);
        sb.append(", picture_status_sim=").append(picture_status_sim);
        sb.append(", picture_status_eng=").append(picture_status_eng);
        sb.append(", title_pic_sim=").append(title_pic_sim);
        sb.append(", title_pic_eng=").append(title_pic_eng);
        sb.append(", mouse_in_pic_sim=").append(mouse_in_pic_sim);
        sb.append(", mouse_in_pic_eng=").append(mouse_in_pic_eng);
        sb.append(", mouse_out_pic_sim=").append(mouse_out_pic_sim);
        sb.append(", mouse_out_pic_eng=").append(mouse_out_pic_eng);
        sb.append(", content_pic_sim=").append(content_pic_sim);
        sb.append(", content_pic_eng=").append(content_pic_eng);
        sb.append(", startDateTime=").append(startDateTime);
        sb.append(", endDateTime=").append(endDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}