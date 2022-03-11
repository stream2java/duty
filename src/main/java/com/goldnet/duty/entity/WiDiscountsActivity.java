package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 手机优惠活动列表
 * @TableName wi_discounts_activity
 */
@TableName(value ="wi_discounts_activity")
@Data
public class WiDiscountsActivity implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 活动标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 活动分类id
     */
    @TableField(value = "classify_id")
    private Object classify_id;

    /**
     * 活动状态 0：停用   1: 启用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 大大股东id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 活动类型：PC: 0  手机：1
     */
    @TableField(value = "type")
    private String type;

    /**
     * 使用图片：0-否1-是
     */
    @TableField(value = "pic_status")
    private Object pic_status;

    /**
     * 内容图片
     */
    @TableField(value = "pic_context")
    private String pic_context;

    /**
     * 活动内容
     */
    @TableField(value = "txt_context")
    private String txt_context;

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
     * 标题类型   0：图片   1：文字
     */
    @TableField(value = "mobpre_radio")
    private Object mobpre_radio;

    /**
     * 图片路径
     */
    @TableField(value = "mouse_off_pic")
    private String mouse_off_pic;

    /**
     * 图标
     */
    @TableField(value = "title_ico")
    private Object title_ico;

    /**
     * 标题描述
     */
    @TableField(value = "title_describe")
    private String title_describe;

    /**
     * 原wi_photo_doc表活动ID
     */
    @TableField(value = "old_id")
    private Object old_id;

    /**
     * 排序
     */
    @TableField(value = "sort_num")
    private Object sort_num;

    /**
     * 子站点文件夹id,对应表ge_station_sub的id,如果值为空,表示是主站
     */
    @TableField(value = "station_sub_id")
    private Object station_sub_id;

    /**
     * 自定义上传图库id
     */
    @TableField(value = "title_ico_id")
    private Object title_ico_id;

    /**
     * 横版APP活动内容
     */
    @TableField(value = "txt_context_hb")
    private String txt_context_hb;

    /**
     * 横板APP内容图片
     */
    @TableField(value = "pic_context_hb")
    private String pic_context_hb;

    /**
     * H5&竖版或者横板：0-竖版 1-横板
     */
    @TableField(value = "txt_context_status")
    private Object txt_context_status;

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
        WiDiscountsActivity other = (WiDiscountsActivity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getClassify_id() == null ? other.getClassify_id() == null : this.getClassify_id().equals(other.getClassify_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPic_status() == null ? other.getPic_status() == null : this.getPic_status().equals(other.getPic_status()))
            && (this.getPic_context() == null ? other.getPic_context() == null : this.getPic_context().equals(other.getPic_context()))
            && (this.getTxt_context() == null ? other.getTxt_context() == null : this.getTxt_context().equals(other.getTxt_context()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getMobpre_radio() == null ? other.getMobpre_radio() == null : this.getMobpre_radio().equals(other.getMobpre_radio()))
            && (this.getMouse_off_pic() == null ? other.getMouse_off_pic() == null : this.getMouse_off_pic().equals(other.getMouse_off_pic()))
            && (this.getTitle_ico() == null ? other.getTitle_ico() == null : this.getTitle_ico().equals(other.getTitle_ico()))
            && (this.getTitle_describe() == null ? other.getTitle_describe() == null : this.getTitle_describe().equals(other.getTitle_describe()))
            && (this.getOld_id() == null ? other.getOld_id() == null : this.getOld_id().equals(other.getOld_id()))
            && (this.getSort_num() == null ? other.getSort_num() == null : this.getSort_num().equals(other.getSort_num()))
            && (this.getStation_sub_id() == null ? other.getStation_sub_id() == null : this.getStation_sub_id().equals(other.getStation_sub_id()))
            && (this.getTitle_ico_id() == null ? other.getTitle_ico_id() == null : this.getTitle_ico_id().equals(other.getTitle_ico_id()))
            && (this.getTxt_context_hb() == null ? other.getTxt_context_hb() == null : this.getTxt_context_hb().equals(other.getTxt_context_hb()))
            && (this.getPic_context_hb() == null ? other.getPic_context_hb() == null : this.getPic_context_hb().equals(other.getPic_context_hb()))
            && (this.getTxt_context_status() == null ? other.getTxt_context_status() == null : this.getTxt_context_status().equals(other.getTxt_context_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getClassify_id() == null) ? 0 : getClassify_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPic_status() == null) ? 0 : getPic_status().hashCode());
        result = prime * result + ((getPic_context() == null) ? 0 : getPic_context().hashCode());
        result = prime * result + ((getTxt_context() == null) ? 0 : getTxt_context().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getMobpre_radio() == null) ? 0 : getMobpre_radio().hashCode());
        result = prime * result + ((getMouse_off_pic() == null) ? 0 : getMouse_off_pic().hashCode());
        result = prime * result + ((getTitle_ico() == null) ? 0 : getTitle_ico().hashCode());
        result = prime * result + ((getTitle_describe() == null) ? 0 : getTitle_describe().hashCode());
        result = prime * result + ((getOld_id() == null) ? 0 : getOld_id().hashCode());
        result = prime * result + ((getSort_num() == null) ? 0 : getSort_num().hashCode());
        result = prime * result + ((getStation_sub_id() == null) ? 0 : getStation_sub_id().hashCode());
        result = prime * result + ((getTitle_ico_id() == null) ? 0 : getTitle_ico_id().hashCode());
        result = prime * result + ((getTxt_context_hb() == null) ? 0 : getTxt_context_hb().hashCode());
        result = prime * result + ((getPic_context_hb() == null) ? 0 : getPic_context_hb().hashCode());
        result = prime * result + ((getTxt_context_status() == null) ? 0 : getTxt_context_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", classify_id=").append(classify_id);
        sb.append(", status=").append(status);
        sb.append(", account1=").append(account1);
        sb.append(", type=").append(type);
        sb.append(", pic_status=").append(pic_status);
        sb.append(", pic_context=").append(pic_context);
        sb.append(", txt_context=").append(txt_context);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", mobpre_radio=").append(mobpre_radio);
        sb.append(", mouse_off_pic=").append(mouse_off_pic);
        sb.append(", title_ico=").append(title_ico);
        sb.append(", title_describe=").append(title_describe);
        sb.append(", old_id=").append(old_id);
        sb.append(", sort_num=").append(sort_num);
        sb.append(", station_sub_id=").append(station_sub_id);
        sb.append(", title_ico_id=").append(title_ico_id);
        sb.append(", txt_context_hb=").append(txt_context_hb);
        sb.append(", pic_context_hb=").append(pic_context_hb);
        sb.append(", txt_context_status=").append(txt_context_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}