package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 浮动图管理正在编辑表
 * @TableName wi_edit_float_pic
 */
@TableName(value ="wi_edit_float_pic")
@Data
public class WiEditFloatPic implements Serializable {
    /**
     * 浮动图id
     */
    @TableId(value = "pic_id")
    private Object pic_id;

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
     * 标题(繁体)
     */
    @TableField(value = "title_tra")
    private String title_tra;

    /**
     * 标题(简体)
     */
    @TableField(value = "title_sim")
    private String title_sim;

    /**
     * 标题(英文)
     */
    @TableField(value = "title_eng")
    private String title_eng;

    /**
     * 滑鼠效果：0-否1-是
     */
    @TableField(value = "mouse_status_tra")
    private Object mouse_status_tra;

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
     * 关闭图片上传图片繁体
     */
    @TableField(value = "close_pic_tra")
    private String close_pic_tra;

    /**
     * 关闭图片上传图片简体
     */
    @TableField(value = "close_pic_sim")
    private String close_pic_sim;

    /**
     * 关闭图片上传图片英文
     */
    @TableField(value = "close_pic_eng")
    private String close_pic_eng;

    /**
     * 浮动位置繁体
     */
    @TableField(value = "float_position_tra")
    private Object float_position_tra;

    /**
     * 浮动位置简体
     */
    @TableField(value = "float_position_sim")
    private Object float_position_sim;

    /**
     * 浮动位置英文
     */
    @TableField(value = "float_position_eng")
    private Object float_position_eng;

    /**
     * 连结繁体
     */
    @TableField(value = "junction_tra")
    private String junction_tra;

    /**
     * 显示页面繁体
     */
    @TableField(value = "display_page_tra")
    private String display_page_tra;

    /**
     * 显示页面简体
     */
    @TableField(value = "display_page_sim")
    private String display_page_sim;

    /**
     * 显示页面英文
     */
    @TableField(value = "display_page_eng")
    private String display_page_eng;

    /**
     * 关联案件表id
     */
    @TableField(value = "doc_id")
    private Object doc_id;

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
     * 滑鼠状态：0-关闭1-开启
     */
    @TableField(value = "close_pic_status_tra")
    private Object close_pic_status_tra;

    /**
     * 滑鼠状态：0-关闭1-开启
     */
    @TableField(value = "close_pic_status_sim")
    private Object close_pic_status_sim;

    /**
     * 滑鼠状态：0-关闭1-开启
     */
    @TableField(value = "close_pic_status_eng")
    private Object close_pic_status_eng;

    /**
     * 连结简体
     */
    @TableField(value = "junction_sim")
    private String junction_sim;

    /**
     * 连结英文
     */
    @TableField(value = "junction_eng")
    private String junction_eng;

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
        WiEditFloatPic other = (WiEditFloatPic) that;
        return (this.getPic_id() == null ? other.getPic_id() == null : this.getPic_id().equals(other.getPic_id()))
            && (this.getOld_sort() == null ? other.getOld_sort() == null : this.getOld_sort().equals(other.getOld_sort()))
            && (this.getNow_sort() == null ? other.getNow_sort() == null : this.getNow_sort().equals(other.getNow_sort()))
            && (this.getTitle_tra() == null ? other.getTitle_tra() == null : this.getTitle_tra().equals(other.getTitle_tra()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getMouse_status_tra() == null ? other.getMouse_status_tra() == null : this.getMouse_status_tra().equals(other.getMouse_status_tra()))
            && (this.getMouse_off_pic_tra() == null ? other.getMouse_off_pic_tra() == null : this.getMouse_off_pic_tra().equals(other.getMouse_off_pic_tra()))
            && (this.getMouse_off_pic_sim() == null ? other.getMouse_off_pic_sim() == null : this.getMouse_off_pic_sim().equals(other.getMouse_off_pic_sim()))
            && (this.getMouse_off_pic_eng() == null ? other.getMouse_off_pic_eng() == null : this.getMouse_off_pic_eng().equals(other.getMouse_off_pic_eng()))
            && (this.getMouse_in_pic_tra() == null ? other.getMouse_in_pic_tra() == null : this.getMouse_in_pic_tra().equals(other.getMouse_in_pic_tra()))
            && (this.getMouse_in_pic_sim() == null ? other.getMouse_in_pic_sim() == null : this.getMouse_in_pic_sim().equals(other.getMouse_in_pic_sim()))
            && (this.getMouse_in_pic_eng() == null ? other.getMouse_in_pic_eng() == null : this.getMouse_in_pic_eng().equals(other.getMouse_in_pic_eng()))
            && (this.getMouse_out_pic_tra() == null ? other.getMouse_out_pic_tra() == null : this.getMouse_out_pic_tra().equals(other.getMouse_out_pic_tra()))
            && (this.getMouse_out_pic_sim() == null ? other.getMouse_out_pic_sim() == null : this.getMouse_out_pic_sim().equals(other.getMouse_out_pic_sim()))
            && (this.getMouse_out_pic_eng() == null ? other.getMouse_out_pic_eng() == null : this.getMouse_out_pic_eng().equals(other.getMouse_out_pic_eng()))
            && (this.getClose_pic_tra() == null ? other.getClose_pic_tra() == null : this.getClose_pic_tra().equals(other.getClose_pic_tra()))
            && (this.getClose_pic_sim() == null ? other.getClose_pic_sim() == null : this.getClose_pic_sim().equals(other.getClose_pic_sim()))
            && (this.getClose_pic_eng() == null ? other.getClose_pic_eng() == null : this.getClose_pic_eng().equals(other.getClose_pic_eng()))
            && (this.getFloat_position_tra() == null ? other.getFloat_position_tra() == null : this.getFloat_position_tra().equals(other.getFloat_position_tra()))
            && (this.getFloat_position_sim() == null ? other.getFloat_position_sim() == null : this.getFloat_position_sim().equals(other.getFloat_position_sim()))
            && (this.getFloat_position_eng() == null ? other.getFloat_position_eng() == null : this.getFloat_position_eng().equals(other.getFloat_position_eng()))
            && (this.getJunction_tra() == null ? other.getJunction_tra() == null : this.getJunction_tra().equals(other.getJunction_tra()))
            && (this.getDisplay_page_tra() == null ? other.getDisplay_page_tra() == null : this.getDisplay_page_tra().equals(other.getDisplay_page_tra()))
            && (this.getDisplay_page_sim() == null ? other.getDisplay_page_sim() == null : this.getDisplay_page_sim().equals(other.getDisplay_page_sim()))
            && (this.getDisplay_page_eng() == null ? other.getDisplay_page_eng() == null : this.getDisplay_page_eng().equals(other.getDisplay_page_eng()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getMouse_status_sim() == null ? other.getMouse_status_sim() == null : this.getMouse_status_sim().equals(other.getMouse_status_sim()))
            && (this.getMouse_status_eng() == null ? other.getMouse_status_eng() == null : this.getMouse_status_eng().equals(other.getMouse_status_eng()))
            && (this.getClose_pic_status_tra() == null ? other.getClose_pic_status_tra() == null : this.getClose_pic_status_tra().equals(other.getClose_pic_status_tra()))
            && (this.getClose_pic_status_sim() == null ? other.getClose_pic_status_sim() == null : this.getClose_pic_status_sim().equals(other.getClose_pic_status_sim()))
            && (this.getClose_pic_status_eng() == null ? other.getClose_pic_status_eng() == null : this.getClose_pic_status_eng().equals(other.getClose_pic_status_eng()))
            && (this.getJunction_sim() == null ? other.getJunction_sim() == null : this.getJunction_sim().equals(other.getJunction_sim()))
            && (this.getJunction_eng() == null ? other.getJunction_eng() == null : this.getJunction_eng().equals(other.getJunction_eng()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPic_id() == null) ? 0 : getPic_id().hashCode());
        result = prime * result + ((getOld_sort() == null) ? 0 : getOld_sort().hashCode());
        result = prime * result + ((getNow_sort() == null) ? 0 : getNow_sort().hashCode());
        result = prime * result + ((getTitle_tra() == null) ? 0 : getTitle_tra().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getMouse_status_tra() == null) ? 0 : getMouse_status_tra().hashCode());
        result = prime * result + ((getMouse_off_pic_tra() == null) ? 0 : getMouse_off_pic_tra().hashCode());
        result = prime * result + ((getMouse_off_pic_sim() == null) ? 0 : getMouse_off_pic_sim().hashCode());
        result = prime * result + ((getMouse_off_pic_eng() == null) ? 0 : getMouse_off_pic_eng().hashCode());
        result = prime * result + ((getMouse_in_pic_tra() == null) ? 0 : getMouse_in_pic_tra().hashCode());
        result = prime * result + ((getMouse_in_pic_sim() == null) ? 0 : getMouse_in_pic_sim().hashCode());
        result = prime * result + ((getMouse_in_pic_eng() == null) ? 0 : getMouse_in_pic_eng().hashCode());
        result = prime * result + ((getMouse_out_pic_tra() == null) ? 0 : getMouse_out_pic_tra().hashCode());
        result = prime * result + ((getMouse_out_pic_sim() == null) ? 0 : getMouse_out_pic_sim().hashCode());
        result = prime * result + ((getMouse_out_pic_eng() == null) ? 0 : getMouse_out_pic_eng().hashCode());
        result = prime * result + ((getClose_pic_tra() == null) ? 0 : getClose_pic_tra().hashCode());
        result = prime * result + ((getClose_pic_sim() == null) ? 0 : getClose_pic_sim().hashCode());
        result = prime * result + ((getClose_pic_eng() == null) ? 0 : getClose_pic_eng().hashCode());
        result = prime * result + ((getFloat_position_tra() == null) ? 0 : getFloat_position_tra().hashCode());
        result = prime * result + ((getFloat_position_sim() == null) ? 0 : getFloat_position_sim().hashCode());
        result = prime * result + ((getFloat_position_eng() == null) ? 0 : getFloat_position_eng().hashCode());
        result = prime * result + ((getJunction_tra() == null) ? 0 : getJunction_tra().hashCode());
        result = prime * result + ((getDisplay_page_tra() == null) ? 0 : getDisplay_page_tra().hashCode());
        result = prime * result + ((getDisplay_page_sim() == null) ? 0 : getDisplay_page_sim().hashCode());
        result = prime * result + ((getDisplay_page_eng() == null) ? 0 : getDisplay_page_eng().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getMouse_status_sim() == null) ? 0 : getMouse_status_sim().hashCode());
        result = prime * result + ((getMouse_status_eng() == null) ? 0 : getMouse_status_eng().hashCode());
        result = prime * result + ((getClose_pic_status_tra() == null) ? 0 : getClose_pic_status_tra().hashCode());
        result = prime * result + ((getClose_pic_status_sim() == null) ? 0 : getClose_pic_status_sim().hashCode());
        result = prime * result + ((getClose_pic_status_eng() == null) ? 0 : getClose_pic_status_eng().hashCode());
        result = prime * result + ((getJunction_sim() == null) ? 0 : getJunction_sim().hashCode());
        result = prime * result + ((getJunction_eng() == null) ? 0 : getJunction_eng().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pic_id=").append(pic_id);
        sb.append(", old_sort=").append(old_sort);
        sb.append(", now_sort=").append(now_sort);
        sb.append(", title_tra=").append(title_tra);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", mouse_status_tra=").append(mouse_status_tra);
        sb.append(", mouse_off_pic_tra=").append(mouse_off_pic_tra);
        sb.append(", mouse_off_pic_sim=").append(mouse_off_pic_sim);
        sb.append(", mouse_off_pic_eng=").append(mouse_off_pic_eng);
        sb.append(", mouse_in_pic_tra=").append(mouse_in_pic_tra);
        sb.append(", mouse_in_pic_sim=").append(mouse_in_pic_sim);
        sb.append(", mouse_in_pic_eng=").append(mouse_in_pic_eng);
        sb.append(", mouse_out_pic_tra=").append(mouse_out_pic_tra);
        sb.append(", mouse_out_pic_sim=").append(mouse_out_pic_sim);
        sb.append(", mouse_out_pic_eng=").append(mouse_out_pic_eng);
        sb.append(", close_pic_tra=").append(close_pic_tra);
        sb.append(", close_pic_sim=").append(close_pic_sim);
        sb.append(", close_pic_eng=").append(close_pic_eng);
        sb.append(", float_position_tra=").append(float_position_tra);
        sb.append(", float_position_sim=").append(float_position_sim);
        sb.append(", float_position_eng=").append(float_position_eng);
        sb.append(", junction_tra=").append(junction_tra);
        sb.append(", display_page_tra=").append(display_page_tra);
        sb.append(", display_page_sim=").append(display_page_sim);
        sb.append(", display_page_eng=").append(display_page_eng);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", mouse_status_sim=").append(mouse_status_sim);
        sb.append(", mouse_status_eng=").append(mouse_status_eng);
        sb.append(", close_pic_status_tra=").append(close_pic_status_tra);
        sb.append(", close_pic_status_sim=").append(close_pic_status_sim);
        sb.append(", close_pic_status_eng=").append(close_pic_status_eng);
        sb.append(", junction_sim=").append(junction_sim);
        sb.append(", junction_eng=").append(junction_eng);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}