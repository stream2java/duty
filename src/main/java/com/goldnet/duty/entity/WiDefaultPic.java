package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 上传图片表
 * @TableName wi_default_pic
 */
@TableName(value ="wi_default_pic")
@Data
public class WiDefaultPic implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "pic_id")
    private Object pic_id;

    /**
     * 大大股东
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 类型
     */
    @TableField(value = "type_id")
    private Object type_id;

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
     * 效果
     */
    @TableField(value = "effect_id")
    private Object effect_id;

    /**
     * 连结是否客服：0-否1-是
     */
    @TableField(value = "junction_type")
    private Object junction_type;

    /**
     * 滑鼠状态：0-关闭1-开启
     */
    @TableField(value = "mouse_status")
    private Object mouse_status;

    /**
     * 关闭图片状态：0-不使用1-使用
     */
    @TableField(value = "close_pic_status")
    private Object close_pic_status;

    /**
     * 繁体标题
     */
    @TableField(value = "title_tra")
    private String title_tra;

    /**
     * 简体标题
     */
    @TableField(value = "title_sim")
    private String title_sim;

    /**
     * 英文标题
     */
    @TableField(value = "title_eng")
    private String title_eng;

    /**
     * 繁体滑鼠关闭图片或者滑入图片
     */
    @TableField(value = "image1_tra")
    private String image1_tra;

    /**
     * 简体滑鼠关闭图片或者滑入图片
     */
    @TableField(value = "image1_sim")
    private String image1_sim;

    /**
     * 英文滑鼠关闭图片或者滑入图片
     */
    @TableField(value = "image1_eng")
    private String image1_eng;

    /**
     * 繁体滑出图片
     */
    @TableField(value = "image2_tra")
    private String image2_tra;

    /**
     * 简体滑出图片
     */
    @TableField(value = "image2_sim")
    private String image2_sim;

    /**
     * 英文滑出图片
     */
    @TableField(value = "image2_eng")
    private String image2_eng;

    /**
     * 繁体关闭图片
     */
    @TableField(value = "image3_tra")
    private String image3_tra;

    /**
     * 简体关闭图片
     */
    @TableField(value = "image3_sim")
    private String image3_sim;

    /**
     * 英文关闭图片
     */
    @TableField(value = "image3_eng")
    private String image3_eng;

    /**
     * 繁体连结地址
     */
    @TableField(value = "junction_tra")
    private String junction_tra;

    /**
     * 简体连结地址
     */
    @TableField(value = "junction_sim")
    private String junction_sim;

    /**
     * 英文连结地址
     */
    @TableField(value = "junction_eng")
    private String junction_eng;

    /**
     * 审核状态：0-未送审1-审核中2-已审核3-已撤销
     */
    @TableField(value = "auditing_status")
    private Object auditing_status;

    /**
     * 生效时间
     */
    @TableField(value = "effect_time")
    private LocalDateTime effect_time;

    /**
     * 目录
     */
    @TableField(value = "menu_id")
    private Object menu_id;

    /**
     * 是否新窗口打开连结地址：0-否1-是
     */
    @TableField(value = "junction_window")
    private Object junction_window;

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
        WiDefaultPic other = (WiDefaultPic) that;
        return (this.getPic_id() == null ? other.getPic_id() == null : this.getPic_id().equals(other.getPic_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getEffect_id() == null ? other.getEffect_id() == null : this.getEffect_id().equals(other.getEffect_id()))
            && (this.getJunction_type() == null ? other.getJunction_type() == null : this.getJunction_type().equals(other.getJunction_type()))
            && (this.getMouse_status() == null ? other.getMouse_status() == null : this.getMouse_status().equals(other.getMouse_status()))
            && (this.getClose_pic_status() == null ? other.getClose_pic_status() == null : this.getClose_pic_status().equals(other.getClose_pic_status()))
            && (this.getTitle_tra() == null ? other.getTitle_tra() == null : this.getTitle_tra().equals(other.getTitle_tra()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getImage1_tra() == null ? other.getImage1_tra() == null : this.getImage1_tra().equals(other.getImage1_tra()))
            && (this.getImage1_sim() == null ? other.getImage1_sim() == null : this.getImage1_sim().equals(other.getImage1_sim()))
            && (this.getImage1_eng() == null ? other.getImage1_eng() == null : this.getImage1_eng().equals(other.getImage1_eng()))
            && (this.getImage2_tra() == null ? other.getImage2_tra() == null : this.getImage2_tra().equals(other.getImage2_tra()))
            && (this.getImage2_sim() == null ? other.getImage2_sim() == null : this.getImage2_sim().equals(other.getImage2_sim()))
            && (this.getImage2_eng() == null ? other.getImage2_eng() == null : this.getImage2_eng().equals(other.getImage2_eng()))
            && (this.getImage3_tra() == null ? other.getImage3_tra() == null : this.getImage3_tra().equals(other.getImage3_tra()))
            && (this.getImage3_sim() == null ? other.getImage3_sim() == null : this.getImage3_sim().equals(other.getImage3_sim()))
            && (this.getImage3_eng() == null ? other.getImage3_eng() == null : this.getImage3_eng().equals(other.getImage3_eng()))
            && (this.getJunction_tra() == null ? other.getJunction_tra() == null : this.getJunction_tra().equals(other.getJunction_tra()))
            && (this.getJunction_sim() == null ? other.getJunction_sim() == null : this.getJunction_sim().equals(other.getJunction_sim()))
            && (this.getJunction_eng() == null ? other.getJunction_eng() == null : this.getJunction_eng().equals(other.getJunction_eng()))
            && (this.getAuditing_status() == null ? other.getAuditing_status() == null : this.getAuditing_status().equals(other.getAuditing_status()))
            && (this.getEffect_time() == null ? other.getEffect_time() == null : this.getEffect_time().equals(other.getEffect_time()))
            && (this.getMenu_id() == null ? other.getMenu_id() == null : this.getMenu_id().equals(other.getMenu_id()))
            && (this.getJunction_window() == null ? other.getJunction_window() == null : this.getJunction_window().equals(other.getJunction_window()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPic_id() == null) ? 0 : getPic_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getEffect_id() == null) ? 0 : getEffect_id().hashCode());
        result = prime * result + ((getJunction_type() == null) ? 0 : getJunction_type().hashCode());
        result = prime * result + ((getMouse_status() == null) ? 0 : getMouse_status().hashCode());
        result = prime * result + ((getClose_pic_status() == null) ? 0 : getClose_pic_status().hashCode());
        result = prime * result + ((getTitle_tra() == null) ? 0 : getTitle_tra().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getImage1_tra() == null) ? 0 : getImage1_tra().hashCode());
        result = prime * result + ((getImage1_sim() == null) ? 0 : getImage1_sim().hashCode());
        result = prime * result + ((getImage1_eng() == null) ? 0 : getImage1_eng().hashCode());
        result = prime * result + ((getImage2_tra() == null) ? 0 : getImage2_tra().hashCode());
        result = prime * result + ((getImage2_sim() == null) ? 0 : getImage2_sim().hashCode());
        result = prime * result + ((getImage2_eng() == null) ? 0 : getImage2_eng().hashCode());
        result = prime * result + ((getImage3_tra() == null) ? 0 : getImage3_tra().hashCode());
        result = prime * result + ((getImage3_sim() == null) ? 0 : getImage3_sim().hashCode());
        result = prime * result + ((getImage3_eng() == null) ? 0 : getImage3_eng().hashCode());
        result = prime * result + ((getJunction_tra() == null) ? 0 : getJunction_tra().hashCode());
        result = prime * result + ((getJunction_sim() == null) ? 0 : getJunction_sim().hashCode());
        result = prime * result + ((getJunction_eng() == null) ? 0 : getJunction_eng().hashCode());
        result = prime * result + ((getAuditing_status() == null) ? 0 : getAuditing_status().hashCode());
        result = prime * result + ((getEffect_time() == null) ? 0 : getEffect_time().hashCode());
        result = prime * result + ((getMenu_id() == null) ? 0 : getMenu_id().hashCode());
        result = prime * result + ((getJunction_window() == null) ? 0 : getJunction_window().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pic_id=").append(pic_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", type_id=").append(type_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", effect_id=").append(effect_id);
        sb.append(", junction_type=").append(junction_type);
        sb.append(", mouse_status=").append(mouse_status);
        sb.append(", close_pic_status=").append(close_pic_status);
        sb.append(", title_tra=").append(title_tra);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", image1_tra=").append(image1_tra);
        sb.append(", image1_sim=").append(image1_sim);
        sb.append(", image1_eng=").append(image1_eng);
        sb.append(", image2_tra=").append(image2_tra);
        sb.append(", image2_sim=").append(image2_sim);
        sb.append(", image2_eng=").append(image2_eng);
        sb.append(", image3_tra=").append(image3_tra);
        sb.append(", image3_sim=").append(image3_sim);
        sb.append(", image3_eng=").append(image3_eng);
        sb.append(", junction_tra=").append(junction_tra);
        sb.append(", junction_sim=").append(junction_sim);
        sb.append(", junction_eng=").append(junction_eng);
        sb.append(", auditing_status=").append(auditing_status);
        sb.append(", effect_time=").append(effect_time);
        sb.append(", menu_id=").append(menu_id);
        sb.append(", junction_window=").append(junction_window);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}