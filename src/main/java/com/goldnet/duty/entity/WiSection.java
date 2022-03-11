package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName wi_section
 */
@TableName(value ="wi_section")
@Data
public class WiSection implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 栏目key
     */
    @TableField(value = "station_key")
    private String station_key;

    /**
     * 栏目名称
     */
    @TableField(value = "title")
    private String title;

    /**
     * 栏目深度
     */
    @TableField(value = "depath")
    private String depath;

    /**
     * 上级id 
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 是否有下级
     */
    @TableField(value = "has_child")
    private Object has_child;

    /**
     * 上传图片设置
     */
    @TableField(value = "img_setting")
    private String img_setting;

    /**
     * -1:无分类,0:无限制,1:一级类,2:二级类,3:三级类,4:四级类
     */
    @TableField(value = "category")
    private Object category;

    /**
     * 栏目类型
     */
    @TableField(value = "section_type")
    private String section_type;

    /**
     * 排序id
     */
    @TableField(value = "sort_id")
    private Object sort_id;

    /**
     * 简单备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 大大股东id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 站点id
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 
     */
    @TableField(value = "section_level")
    private Object section_level;

    /**
     * 
     */
    @TableField(value = "preview_url")
    private String preview_url;

    /**
     * 子站点文件夹id,对应表ge_station_sub的id,如果值为空,表示是主站
     */
    @TableField(value = "station_sub_id")
    private Object station_sub_id;

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
        WiSection other = (WiSection) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStation_key() == null ? other.getStation_key() == null : this.getStation_key().equals(other.getStation_key()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDepath() == null ? other.getDepath() == null : this.getDepath().equals(other.getDepath()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getHas_child() == null ? other.getHas_child() == null : this.getHas_child().equals(other.getHas_child()))
            && (this.getImg_setting() == null ? other.getImg_setting() == null : this.getImg_setting().equals(other.getImg_setting()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getSection_type() == null ? other.getSection_type() == null : this.getSection_type().equals(other.getSection_type()))
            && (this.getSort_id() == null ? other.getSort_id() == null : this.getSort_id().equals(other.getSort_id()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getSection_level() == null ? other.getSection_level() == null : this.getSection_level().equals(other.getSection_level()))
            && (this.getPreview_url() == null ? other.getPreview_url() == null : this.getPreview_url().equals(other.getPreview_url()))
            && (this.getStation_sub_id() == null ? other.getStation_sub_id() == null : this.getStation_sub_id().equals(other.getStation_sub_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStation_key() == null) ? 0 : getStation_key().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDepath() == null) ? 0 : getDepath().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getHas_child() == null) ? 0 : getHas_child().hashCode());
        result = prime * result + ((getImg_setting() == null) ? 0 : getImg_setting().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getSection_type() == null) ? 0 : getSection_type().hashCode());
        result = prime * result + ((getSort_id() == null) ? 0 : getSort_id().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getSection_level() == null) ? 0 : getSection_level().hashCode());
        result = prime * result + ((getPreview_url() == null) ? 0 : getPreview_url().hashCode());
        result = prime * result + ((getStation_sub_id() == null) ? 0 : getStation_sub_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", station_key=").append(station_key);
        sb.append(", title=").append(title);
        sb.append(", depath=").append(depath);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", has_child=").append(has_child);
        sb.append(", img_setting=").append(img_setting);
        sb.append(", category=").append(category);
        sb.append(", section_type=").append(section_type);
        sb.append(", sort_id=").append(sort_id);
        sb.append(", remark=").append(remark);
        sb.append(", account1=").append(account1);
        sb.append(", station_id=").append(station_id);
        sb.append(", section_level=").append(section_level);
        sb.append(", preview_url=").append(preview_url);
        sb.append(", station_sub_id=").append(station_sub_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}