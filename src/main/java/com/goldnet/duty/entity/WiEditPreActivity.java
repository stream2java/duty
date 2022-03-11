package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 优惠活动编辑表
 * @TableName wi_edit_pre_activity
 */
@TableName(value ="wi_edit_pre_activity")
@Data
public class WiEditPreActivity implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "activity_id")
    private Object activity_id;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

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
     * 滑鼠效果繁体：0-关闭1-开启
     */
    @TableField(value = "mouse_status_tra")
    private Object mouse_status_tra;

    /**
     * 滑鼠效果简体：0-关闭1-开启
     */
    @TableField(value = "mouse_status_sim")
    private Object mouse_status_sim;

    /**
     * 滑鼠效果英文：0-关闭1-开启
     */
    @TableField(value = "mouse_status_eng")
    private Object mouse_status_eng;

    /**
     * 滑鼠关闭上传图片繁体
     */
    @TableField(value = "mouse_off_pic_tra")
    private String mouse_off_pic_tra;

    /**
     * 滑鼠关闭上传图片简体
     */
    @TableField(value = "mouse_off_pic_sim")
    private String mouse_off_pic_sim;

    /**
     * 滑鼠关闭上传图片英文
     */
    @TableField(value = "mouse_off_pic_eng")
    private String mouse_off_pic_eng;

    /**
     * 滑鼠滑入上传图片繁体
     */
    @TableField(value = "mouse_in_pic_tra")
    private String mouse_in_pic_tra;

    /**
     * 滑鼠滑入上传图片简体
     */
    @TableField(value = "mouse_in_pic_sim")
    private String mouse_in_pic_sim;

    /**
     * 滑鼠滑入上传图片英文
     */
    @TableField(value = "mouse_in_pic_eng")
    private String mouse_in_pic_eng;

    /**
     * 滑鼠滑出上传图片繁体
     */
    @TableField(value = "mouse_out_pic_tra")
    private String mouse_out_pic_tra;

    /**
     * 滑鼠滑出上传图片简体
     */
    @TableField(value = "mouse_out_pic_sim")
    private String mouse_out_pic_sim;

    /**
     * 滑鼠滑出上传图片英文
     */
    @TableField(value = "mouse_out_pic_eng")
    private String mouse_out_pic_eng;

    /**
     * 使用图片繁体：0-否1-是
     */
    @TableField(value = "pic_status_tra")
    private Object pic_status_tra;

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
     * 使用图片上传图片繁体
     */
    @TableField(value = "content_pic_tra")
    private String content_pic_tra;

    /**
     * 使用图片上传图片简体
     */
    @TableField(value = "content_pic_sim")
    private String content_pic_sim;

    /**
     * 使用图片上传图片英文
     */
    @TableField(value = "content_pic_eng")
    private String content_pic_eng;

    /**
     * 内容繁体
     */
    @TableField(value = "content_tra")
    private String content_tra;

    /**
     * 内容简体
     */
    @TableField(value = "content_sim")
    private String content_sim;

    /**
     * 内容英文
     */
    @TableField(value = "content_eng")
    private String content_eng;

    /**
     * 关联案件表id
     */
    @TableField(value = "doc_id")
    private Object doc_id;

    /**
     * 繁体是否上传轮播图：0-否1-是
     */
    @TableField(value = "alternation_status_tra")
    private Object alternation_status_tra;

    /**
     * 简体是否上传轮播图：0-否1-是
     */
    @TableField(value = "alternation_status_sim")
    private Object alternation_status_sim;

    /**
     * 英文是否上传轮播图：0-否1-是
     */
    @TableField(value = "alternation_status_eng")
    private Object alternation_status_eng;

    /**
     * 繁体轮播图片
     */
    @TableField(value = "alternation_pic_tra")
    private String alternation_pic_tra;

    /**
     * 简体轮播图片
     */
    @TableField(value = "alternation_pic_sim")
    private String alternation_pic_sim;

    /**
     * 英文轮播图片
     */
    @TableField(value = "alternation_pic_eng")
    private String alternation_pic_eng;

    /**
     * 繁体轮播图位置：0-无1-真人2-电子3-彩票
     */
    @TableField(value = "alternation_position_tra")
    private Object alternation_position_tra;

    /**
     * 简体轮播图位置：0-无1-真人2-电子3-彩票
     */
    @TableField(value = "alternation_position_sim")
    private Object alternation_position_sim;

    /**
     * 英文轮播图位置：0-无1-真人2-电子3-彩票
     */
    @TableField(value = "alternation_position_eng")
    private Object alternation_position_eng;

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
        WiEditPreActivity other = (WiEditPreActivity) that;
        return (this.getActivity_id() == null ? other.getActivity_id() == null : this.getActivity_id().equals(other.getActivity_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getOld_sort() == null ? other.getOld_sort() == null : this.getOld_sort().equals(other.getOld_sort()))
            && (this.getNow_sort() == null ? other.getNow_sort() == null : this.getNow_sort().equals(other.getNow_sort()))
            && (this.getName_tra() == null ? other.getName_tra() == null : this.getName_tra().equals(other.getName_tra()))
            && (this.getName_sim() == null ? other.getName_sim() == null : this.getName_sim().equals(other.getName_sim()))
            && (this.getName_eng() == null ? other.getName_eng() == null : this.getName_eng().equals(other.getName_eng()))
            && (this.getMouse_status_tra() == null ? other.getMouse_status_tra() == null : this.getMouse_status_tra().equals(other.getMouse_status_tra()))
            && (this.getMouse_status_sim() == null ? other.getMouse_status_sim() == null : this.getMouse_status_sim().equals(other.getMouse_status_sim()))
            && (this.getMouse_status_eng() == null ? other.getMouse_status_eng() == null : this.getMouse_status_eng().equals(other.getMouse_status_eng()))
            && (this.getMouse_off_pic_tra() == null ? other.getMouse_off_pic_tra() == null : this.getMouse_off_pic_tra().equals(other.getMouse_off_pic_tra()))
            && (this.getMouse_off_pic_sim() == null ? other.getMouse_off_pic_sim() == null : this.getMouse_off_pic_sim().equals(other.getMouse_off_pic_sim()))
            && (this.getMouse_off_pic_eng() == null ? other.getMouse_off_pic_eng() == null : this.getMouse_off_pic_eng().equals(other.getMouse_off_pic_eng()))
            && (this.getMouse_in_pic_tra() == null ? other.getMouse_in_pic_tra() == null : this.getMouse_in_pic_tra().equals(other.getMouse_in_pic_tra()))
            && (this.getMouse_in_pic_sim() == null ? other.getMouse_in_pic_sim() == null : this.getMouse_in_pic_sim().equals(other.getMouse_in_pic_sim()))
            && (this.getMouse_in_pic_eng() == null ? other.getMouse_in_pic_eng() == null : this.getMouse_in_pic_eng().equals(other.getMouse_in_pic_eng()))
            && (this.getMouse_out_pic_tra() == null ? other.getMouse_out_pic_tra() == null : this.getMouse_out_pic_tra().equals(other.getMouse_out_pic_tra()))
            && (this.getMouse_out_pic_sim() == null ? other.getMouse_out_pic_sim() == null : this.getMouse_out_pic_sim().equals(other.getMouse_out_pic_sim()))
            && (this.getMouse_out_pic_eng() == null ? other.getMouse_out_pic_eng() == null : this.getMouse_out_pic_eng().equals(other.getMouse_out_pic_eng()))
            && (this.getPic_status_tra() == null ? other.getPic_status_tra() == null : this.getPic_status_tra().equals(other.getPic_status_tra()))
            && (this.getPic_status_sim() == null ? other.getPic_status_sim() == null : this.getPic_status_sim().equals(other.getPic_status_sim()))
            && (this.getPic_status_eng() == null ? other.getPic_status_eng() == null : this.getPic_status_eng().equals(other.getPic_status_eng()))
            && (this.getContent_pic_tra() == null ? other.getContent_pic_tra() == null : this.getContent_pic_tra().equals(other.getContent_pic_tra()))
            && (this.getContent_pic_sim() == null ? other.getContent_pic_sim() == null : this.getContent_pic_sim().equals(other.getContent_pic_sim()))
            && (this.getContent_pic_eng() == null ? other.getContent_pic_eng() == null : this.getContent_pic_eng().equals(other.getContent_pic_eng()))
            && (this.getContent_tra() == null ? other.getContent_tra() == null : this.getContent_tra().equals(other.getContent_tra()))
            && (this.getContent_sim() == null ? other.getContent_sim() == null : this.getContent_sim().equals(other.getContent_sim()))
            && (this.getContent_eng() == null ? other.getContent_eng() == null : this.getContent_eng().equals(other.getContent_eng()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getAlternation_status_tra() == null ? other.getAlternation_status_tra() == null : this.getAlternation_status_tra().equals(other.getAlternation_status_tra()))
            && (this.getAlternation_status_sim() == null ? other.getAlternation_status_sim() == null : this.getAlternation_status_sim().equals(other.getAlternation_status_sim()))
            && (this.getAlternation_status_eng() == null ? other.getAlternation_status_eng() == null : this.getAlternation_status_eng().equals(other.getAlternation_status_eng()))
            && (this.getAlternation_pic_tra() == null ? other.getAlternation_pic_tra() == null : this.getAlternation_pic_tra().equals(other.getAlternation_pic_tra()))
            && (this.getAlternation_pic_sim() == null ? other.getAlternation_pic_sim() == null : this.getAlternation_pic_sim().equals(other.getAlternation_pic_sim()))
            && (this.getAlternation_pic_eng() == null ? other.getAlternation_pic_eng() == null : this.getAlternation_pic_eng().equals(other.getAlternation_pic_eng()))
            && (this.getAlternation_position_tra() == null ? other.getAlternation_position_tra() == null : this.getAlternation_position_tra().equals(other.getAlternation_position_tra()))
            && (this.getAlternation_position_sim() == null ? other.getAlternation_position_sim() == null : this.getAlternation_position_sim().equals(other.getAlternation_position_sim()))
            && (this.getAlternation_position_eng() == null ? other.getAlternation_position_eng() == null : this.getAlternation_position_eng().equals(other.getAlternation_position_eng()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActivity_id() == null) ? 0 : getActivity_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getOld_sort() == null) ? 0 : getOld_sort().hashCode());
        result = prime * result + ((getNow_sort() == null) ? 0 : getNow_sort().hashCode());
        result = prime * result + ((getName_tra() == null) ? 0 : getName_tra().hashCode());
        result = prime * result + ((getName_sim() == null) ? 0 : getName_sim().hashCode());
        result = prime * result + ((getName_eng() == null) ? 0 : getName_eng().hashCode());
        result = prime * result + ((getMouse_status_tra() == null) ? 0 : getMouse_status_tra().hashCode());
        result = prime * result + ((getMouse_status_sim() == null) ? 0 : getMouse_status_sim().hashCode());
        result = prime * result + ((getMouse_status_eng() == null) ? 0 : getMouse_status_eng().hashCode());
        result = prime * result + ((getMouse_off_pic_tra() == null) ? 0 : getMouse_off_pic_tra().hashCode());
        result = prime * result + ((getMouse_off_pic_sim() == null) ? 0 : getMouse_off_pic_sim().hashCode());
        result = prime * result + ((getMouse_off_pic_eng() == null) ? 0 : getMouse_off_pic_eng().hashCode());
        result = prime * result + ((getMouse_in_pic_tra() == null) ? 0 : getMouse_in_pic_tra().hashCode());
        result = prime * result + ((getMouse_in_pic_sim() == null) ? 0 : getMouse_in_pic_sim().hashCode());
        result = prime * result + ((getMouse_in_pic_eng() == null) ? 0 : getMouse_in_pic_eng().hashCode());
        result = prime * result + ((getMouse_out_pic_tra() == null) ? 0 : getMouse_out_pic_tra().hashCode());
        result = prime * result + ((getMouse_out_pic_sim() == null) ? 0 : getMouse_out_pic_sim().hashCode());
        result = prime * result + ((getMouse_out_pic_eng() == null) ? 0 : getMouse_out_pic_eng().hashCode());
        result = prime * result + ((getPic_status_tra() == null) ? 0 : getPic_status_tra().hashCode());
        result = prime * result + ((getPic_status_sim() == null) ? 0 : getPic_status_sim().hashCode());
        result = prime * result + ((getPic_status_eng() == null) ? 0 : getPic_status_eng().hashCode());
        result = prime * result + ((getContent_pic_tra() == null) ? 0 : getContent_pic_tra().hashCode());
        result = prime * result + ((getContent_pic_sim() == null) ? 0 : getContent_pic_sim().hashCode());
        result = prime * result + ((getContent_pic_eng() == null) ? 0 : getContent_pic_eng().hashCode());
        result = prime * result + ((getContent_tra() == null) ? 0 : getContent_tra().hashCode());
        result = prime * result + ((getContent_sim() == null) ? 0 : getContent_sim().hashCode());
        result = prime * result + ((getContent_eng() == null) ? 0 : getContent_eng().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getAlternation_status_tra() == null) ? 0 : getAlternation_status_tra().hashCode());
        result = prime * result + ((getAlternation_status_sim() == null) ? 0 : getAlternation_status_sim().hashCode());
        result = prime * result + ((getAlternation_status_eng() == null) ? 0 : getAlternation_status_eng().hashCode());
        result = prime * result + ((getAlternation_pic_tra() == null) ? 0 : getAlternation_pic_tra().hashCode());
        result = prime * result + ((getAlternation_pic_sim() == null) ? 0 : getAlternation_pic_sim().hashCode());
        result = prime * result + ((getAlternation_pic_eng() == null) ? 0 : getAlternation_pic_eng().hashCode());
        result = prime * result + ((getAlternation_position_tra() == null) ? 0 : getAlternation_position_tra().hashCode());
        result = prime * result + ((getAlternation_position_sim() == null) ? 0 : getAlternation_position_sim().hashCode());
        result = prime * result + ((getAlternation_position_eng() == null) ? 0 : getAlternation_position_eng().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activity_id=").append(activity_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", old_sort=").append(old_sort);
        sb.append(", now_sort=").append(now_sort);
        sb.append(", name_tra=").append(name_tra);
        sb.append(", name_sim=").append(name_sim);
        sb.append(", name_eng=").append(name_eng);
        sb.append(", mouse_status_tra=").append(mouse_status_tra);
        sb.append(", mouse_status_sim=").append(mouse_status_sim);
        sb.append(", mouse_status_eng=").append(mouse_status_eng);
        sb.append(", mouse_off_pic_tra=").append(mouse_off_pic_tra);
        sb.append(", mouse_off_pic_sim=").append(mouse_off_pic_sim);
        sb.append(", mouse_off_pic_eng=").append(mouse_off_pic_eng);
        sb.append(", mouse_in_pic_tra=").append(mouse_in_pic_tra);
        sb.append(", mouse_in_pic_sim=").append(mouse_in_pic_sim);
        sb.append(", mouse_in_pic_eng=").append(mouse_in_pic_eng);
        sb.append(", mouse_out_pic_tra=").append(mouse_out_pic_tra);
        sb.append(", mouse_out_pic_sim=").append(mouse_out_pic_sim);
        sb.append(", mouse_out_pic_eng=").append(mouse_out_pic_eng);
        sb.append(", pic_status_tra=").append(pic_status_tra);
        sb.append(", pic_status_sim=").append(pic_status_sim);
        sb.append(", pic_status_eng=").append(pic_status_eng);
        sb.append(", content_pic_tra=").append(content_pic_tra);
        sb.append(", content_pic_sim=").append(content_pic_sim);
        sb.append(", content_pic_eng=").append(content_pic_eng);
        sb.append(", content_tra=").append(content_tra);
        sb.append(", content_sim=").append(content_sim);
        sb.append(", content_eng=").append(content_eng);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", alternation_status_tra=").append(alternation_status_tra);
        sb.append(", alternation_status_sim=").append(alternation_status_sim);
        sb.append(", alternation_status_eng=").append(alternation_status_eng);
        sb.append(", alternation_pic_tra=").append(alternation_pic_tra);
        sb.append(", alternation_pic_sim=").append(alternation_pic_sim);
        sb.append(", alternation_pic_eng=").append(alternation_pic_eng);
        sb.append(", alternation_position_tra=").append(alternation_position_tra);
        sb.append(", alternation_position_sim=").append(alternation_position_sim);
        sb.append(", alternation_position_eng=").append(alternation_position_eng);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}