package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 图片类案件表
 * @TableName wi_photo_doc
 */
@TableName(value ="wi_photo_doc")
@Data
public class WiPhotoDoc implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 大大股东ID
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 类型：singleimg\playimg\playimg\adimg\floatimg
     */
    @TableField(value = "type")
    private String type;

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
     * 滑鼠效果繁体：0-关闭1-开启
     */
    @TableField(value = "mouse_status_big")
    private Object mouse_status_big;

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
    @TableField(value = "mouse_off_pic_big")
    private String mouse_off_pic_big;

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
    @TableField(value = "mouse_in_pic_big")
    private String mouse_in_pic_big;

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
    @TableField(value = "mouse_out_pic_big")
    private String mouse_out_pic_big;

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
     * 繁体内容图片/繁体轮播图图片/繁体轮播图关闭图片
     */
    @TableField(value = "cpic_big")
    private String cpic_big;

    /**
     * 简体内容图片/简体轮播图图片/简体轮播图关闭图片
     */
    @TableField(value = "cpic_sim")
    private String cpic_sim;

    /**
     * 英文内容图片/英文轮播图图片/英文轮播图关闭图片
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
     * 浮动位置繁体
     */
    @TableField(value = "float_position_big")
    private Object float_position_big;

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
    @TableField(value = "junction_big")
    private String junction_big;

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

    /**
     * 
     */
    @TableField(value = "title_describe_big")
    private String title_describe_big;

    /**
     * 
     */
    @TableField(value = "title_describe_sim")
    private String title_describe_sim;

    /**
     * 
     */
    @TableField(value = "title_describe_eng")
    private String title_describe_eng;

    /**
     * 
     */
    @TableField(value = "en_height")
    private Object en_height;

    /**
     * 简体消息弹窗高度
     */
    @TableField(value = "gbk_height")
    private Object gbk_height;

    /**
     * 繁体消息弹窗高度
     */
    @TableField(value = "big5_height")
    private Object big5_height;

    /**
     * 英文消息弹窗宽度
     */
    @TableField(value = "en_width")
    private Object en_width;

    /**
     * 简体消息弹窗宽度
     */
    @TableField(value = "gbk_width")
    private Object gbk_width;

    /**
     * 繁体消息弹窗宽度
     */
    @TableField(value = "big5_width")
    private Object big5_width;

    /**
     * 链接打开方式繁体
     */
    @TableField(value = "href_target_big")
    private String href_target_big;

    /**
     * 链接打开方式简体
     */
    @TableField(value = "href_target_sim")
    private String href_target_sim;

    /**
     * 链接打开方式英文
     */
    @TableField(value = "href_target_eng")
    private String href_target_eng;

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
        WiPhotoDoc other = (WiPhotoDoc) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getTitle_big() == null ? other.getTitle_big() == null : this.getTitle_big().equals(other.getTitle_big()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getMouse_status_big() == null ? other.getMouse_status_big() == null : this.getMouse_status_big().equals(other.getMouse_status_big()))
            && (this.getMouse_status_sim() == null ? other.getMouse_status_sim() == null : this.getMouse_status_sim().equals(other.getMouse_status_sim()))
            && (this.getMouse_status_eng() == null ? other.getMouse_status_eng() == null : this.getMouse_status_eng().equals(other.getMouse_status_eng()))
            && (this.getMouse_off_pic_big() == null ? other.getMouse_off_pic_big() == null : this.getMouse_off_pic_big().equals(other.getMouse_off_pic_big()))
            && (this.getMouse_off_pic_sim() == null ? other.getMouse_off_pic_sim() == null : this.getMouse_off_pic_sim().equals(other.getMouse_off_pic_sim()))
            && (this.getMouse_off_pic_eng() == null ? other.getMouse_off_pic_eng() == null : this.getMouse_off_pic_eng().equals(other.getMouse_off_pic_eng()))
            && (this.getMouse_in_pic_big() == null ? other.getMouse_in_pic_big() == null : this.getMouse_in_pic_big().equals(other.getMouse_in_pic_big()))
            && (this.getMouse_in_pic_sim() == null ? other.getMouse_in_pic_sim() == null : this.getMouse_in_pic_sim().equals(other.getMouse_in_pic_sim()))
            && (this.getMouse_in_pic_eng() == null ? other.getMouse_in_pic_eng() == null : this.getMouse_in_pic_eng().equals(other.getMouse_in_pic_eng()))
            && (this.getMouse_out_pic_big() == null ? other.getMouse_out_pic_big() == null : this.getMouse_out_pic_big().equals(other.getMouse_out_pic_big()))
            && (this.getMouse_out_pic_sim() == null ? other.getMouse_out_pic_sim() == null : this.getMouse_out_pic_sim().equals(other.getMouse_out_pic_sim()))
            && (this.getMouse_out_pic_eng() == null ? other.getMouse_out_pic_eng() == null : this.getMouse_out_pic_eng().equals(other.getMouse_out_pic_eng()))
            && (this.getPic_status_big() == null ? other.getPic_status_big() == null : this.getPic_status_big().equals(other.getPic_status_big()))
            && (this.getPic_status_sim() == null ? other.getPic_status_sim() == null : this.getPic_status_sim().equals(other.getPic_status_sim()))
            && (this.getPic_status_eng() == null ? other.getPic_status_eng() == null : this.getPic_status_eng().equals(other.getPic_status_eng()))
            && (this.getCpic_big() == null ? other.getCpic_big() == null : this.getCpic_big().equals(other.getCpic_big()))
            && (this.getCpic_sim() == null ? other.getCpic_sim() == null : this.getCpic_sim().equals(other.getCpic_sim()))
            && (this.getCpic_eng() == null ? other.getCpic_eng() == null : this.getCpic_eng().equals(other.getCpic_eng()))
            && (this.getContext_big() == null ? other.getContext_big() == null : this.getContext_big().equals(other.getContext_big()))
            && (this.getContext_sim() == null ? other.getContext_sim() == null : this.getContext_sim().equals(other.getContext_sim()))
            && (this.getContext_eng() == null ? other.getContext_eng() == null : this.getContext_eng().equals(other.getContext_eng()))
            && (this.getFloat_position_big() == null ? other.getFloat_position_big() == null : this.getFloat_position_big().equals(other.getFloat_position_big()))
            && (this.getFloat_position_sim() == null ? other.getFloat_position_sim() == null : this.getFloat_position_sim().equals(other.getFloat_position_sim()))
            && (this.getFloat_position_eng() == null ? other.getFloat_position_eng() == null : this.getFloat_position_eng().equals(other.getFloat_position_eng()))
            && (this.getJunction_big() == null ? other.getJunction_big() == null : this.getJunction_big().equals(other.getJunction_big()))
            && (this.getJunction_sim() == null ? other.getJunction_sim() == null : this.getJunction_sim().equals(other.getJunction_sim()))
            && (this.getJunction_eng() == null ? other.getJunction_eng() == null : this.getJunction_eng().equals(other.getJunction_eng()))
            && (this.getOld_sort() == null ? other.getOld_sort() == null : this.getOld_sort().equals(other.getOld_sort()))
            && (this.getNow_sort() == null ? other.getNow_sort() == null : this.getNow_sort().equals(other.getNow_sort()))
            && (this.getTitle_describe_big() == null ? other.getTitle_describe_big() == null : this.getTitle_describe_big().equals(other.getTitle_describe_big()))
            && (this.getTitle_describe_sim() == null ? other.getTitle_describe_sim() == null : this.getTitle_describe_sim().equals(other.getTitle_describe_sim()))
            && (this.getTitle_describe_eng() == null ? other.getTitle_describe_eng() == null : this.getTitle_describe_eng().equals(other.getTitle_describe_eng()))
            && (this.getEn_height() == null ? other.getEn_height() == null : this.getEn_height().equals(other.getEn_height()))
            && (this.getGbk_height() == null ? other.getGbk_height() == null : this.getGbk_height().equals(other.getGbk_height()))
            && (this.getBig5_height() == null ? other.getBig5_height() == null : this.getBig5_height().equals(other.getBig5_height()))
            && (this.getEn_width() == null ? other.getEn_width() == null : this.getEn_width().equals(other.getEn_width()))
            && (this.getGbk_width() == null ? other.getGbk_width() == null : this.getGbk_width().equals(other.getGbk_width()))
            && (this.getBig5_width() == null ? other.getBig5_width() == null : this.getBig5_width().equals(other.getBig5_width()))
            && (this.getHref_target_big() == null ? other.getHref_target_big() == null : this.getHref_target_big().equals(other.getHref_target_big()))
            && (this.getHref_target_sim() == null ? other.getHref_target_sim() == null : this.getHref_target_sim().equals(other.getHref_target_sim()))
            && (this.getHref_target_eng() == null ? other.getHref_target_eng() == null : this.getHref_target_eng().equals(other.getHref_target_eng()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getTitle_big() == null) ? 0 : getTitle_big().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getMouse_status_big() == null) ? 0 : getMouse_status_big().hashCode());
        result = prime * result + ((getMouse_status_sim() == null) ? 0 : getMouse_status_sim().hashCode());
        result = prime * result + ((getMouse_status_eng() == null) ? 0 : getMouse_status_eng().hashCode());
        result = prime * result + ((getMouse_off_pic_big() == null) ? 0 : getMouse_off_pic_big().hashCode());
        result = prime * result + ((getMouse_off_pic_sim() == null) ? 0 : getMouse_off_pic_sim().hashCode());
        result = prime * result + ((getMouse_off_pic_eng() == null) ? 0 : getMouse_off_pic_eng().hashCode());
        result = prime * result + ((getMouse_in_pic_big() == null) ? 0 : getMouse_in_pic_big().hashCode());
        result = prime * result + ((getMouse_in_pic_sim() == null) ? 0 : getMouse_in_pic_sim().hashCode());
        result = prime * result + ((getMouse_in_pic_eng() == null) ? 0 : getMouse_in_pic_eng().hashCode());
        result = prime * result + ((getMouse_out_pic_big() == null) ? 0 : getMouse_out_pic_big().hashCode());
        result = prime * result + ((getMouse_out_pic_sim() == null) ? 0 : getMouse_out_pic_sim().hashCode());
        result = prime * result + ((getMouse_out_pic_eng() == null) ? 0 : getMouse_out_pic_eng().hashCode());
        result = prime * result + ((getPic_status_big() == null) ? 0 : getPic_status_big().hashCode());
        result = prime * result + ((getPic_status_sim() == null) ? 0 : getPic_status_sim().hashCode());
        result = prime * result + ((getPic_status_eng() == null) ? 0 : getPic_status_eng().hashCode());
        result = prime * result + ((getCpic_big() == null) ? 0 : getCpic_big().hashCode());
        result = prime * result + ((getCpic_sim() == null) ? 0 : getCpic_sim().hashCode());
        result = prime * result + ((getCpic_eng() == null) ? 0 : getCpic_eng().hashCode());
        result = prime * result + ((getContext_big() == null) ? 0 : getContext_big().hashCode());
        result = prime * result + ((getContext_sim() == null) ? 0 : getContext_sim().hashCode());
        result = prime * result + ((getContext_eng() == null) ? 0 : getContext_eng().hashCode());
        result = prime * result + ((getFloat_position_big() == null) ? 0 : getFloat_position_big().hashCode());
        result = prime * result + ((getFloat_position_sim() == null) ? 0 : getFloat_position_sim().hashCode());
        result = prime * result + ((getFloat_position_eng() == null) ? 0 : getFloat_position_eng().hashCode());
        result = prime * result + ((getJunction_big() == null) ? 0 : getJunction_big().hashCode());
        result = prime * result + ((getJunction_sim() == null) ? 0 : getJunction_sim().hashCode());
        result = prime * result + ((getJunction_eng() == null) ? 0 : getJunction_eng().hashCode());
        result = prime * result + ((getOld_sort() == null) ? 0 : getOld_sort().hashCode());
        result = prime * result + ((getNow_sort() == null) ? 0 : getNow_sort().hashCode());
        result = prime * result + ((getTitle_describe_big() == null) ? 0 : getTitle_describe_big().hashCode());
        result = prime * result + ((getTitle_describe_sim() == null) ? 0 : getTitle_describe_sim().hashCode());
        result = prime * result + ((getTitle_describe_eng() == null) ? 0 : getTitle_describe_eng().hashCode());
        result = prime * result + ((getEn_height() == null) ? 0 : getEn_height().hashCode());
        result = prime * result + ((getGbk_height() == null) ? 0 : getGbk_height().hashCode());
        result = prime * result + ((getBig5_height() == null) ? 0 : getBig5_height().hashCode());
        result = prime * result + ((getEn_width() == null) ? 0 : getEn_width().hashCode());
        result = prime * result + ((getGbk_width() == null) ? 0 : getGbk_width().hashCode());
        result = prime * result + ((getBig5_width() == null) ? 0 : getBig5_width().hashCode());
        result = prime * result + ((getHref_target_big() == null) ? 0 : getHref_target_big().hashCode());
        result = prime * result + ((getHref_target_sim() == null) ? 0 : getHref_target_sim().hashCode());
        result = prime * result + ((getHref_target_eng() == null) ? 0 : getHref_target_eng().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", type=").append(type);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", title_big=").append(title_big);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", mouse_status_big=").append(mouse_status_big);
        sb.append(", mouse_status_sim=").append(mouse_status_sim);
        sb.append(", mouse_status_eng=").append(mouse_status_eng);
        sb.append(", mouse_off_pic_big=").append(mouse_off_pic_big);
        sb.append(", mouse_off_pic_sim=").append(mouse_off_pic_sim);
        sb.append(", mouse_off_pic_eng=").append(mouse_off_pic_eng);
        sb.append(", mouse_in_pic_big=").append(mouse_in_pic_big);
        sb.append(", mouse_in_pic_sim=").append(mouse_in_pic_sim);
        sb.append(", mouse_in_pic_eng=").append(mouse_in_pic_eng);
        sb.append(", mouse_out_pic_big=").append(mouse_out_pic_big);
        sb.append(", mouse_out_pic_sim=").append(mouse_out_pic_sim);
        sb.append(", mouse_out_pic_eng=").append(mouse_out_pic_eng);
        sb.append(", pic_status_big=").append(pic_status_big);
        sb.append(", pic_status_sim=").append(pic_status_sim);
        sb.append(", pic_status_eng=").append(pic_status_eng);
        sb.append(", cpic_big=").append(cpic_big);
        sb.append(", cpic_sim=").append(cpic_sim);
        sb.append(", cpic_eng=").append(cpic_eng);
        sb.append(", context_big=").append(context_big);
        sb.append(", context_sim=").append(context_sim);
        sb.append(", context_eng=").append(context_eng);
        sb.append(", float_position_big=").append(float_position_big);
        sb.append(", float_position_sim=").append(float_position_sim);
        sb.append(", float_position_eng=").append(float_position_eng);
        sb.append(", junction_big=").append(junction_big);
        sb.append(", junction_sim=").append(junction_sim);
        sb.append(", junction_eng=").append(junction_eng);
        sb.append(", old_sort=").append(old_sort);
        sb.append(", now_sort=").append(now_sort);
        sb.append(", title_describe_big=").append(title_describe_big);
        sb.append(", title_describe_sim=").append(title_describe_sim);
        sb.append(", title_describe_eng=").append(title_describe_eng);
        sb.append(", en_height=").append(en_height);
        sb.append(", gbk_height=").append(gbk_height);
        sb.append(", big5_height=").append(big5_height);
        sb.append(", en_width=").append(en_width);
        sb.append(", gbk_width=").append(gbk_width);
        sb.append(", big5_width=").append(big5_width);
        sb.append(", href_target_big=").append(href_target_big);
        sb.append(", href_target_sim=").append(href_target_sim);
        sb.append(", href_target_eng=").append(href_target_eng);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}