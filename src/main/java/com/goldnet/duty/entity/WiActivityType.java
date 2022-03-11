package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 优惠活动分类表
 * @TableName wi_activity_type
 */
@TableName(value ="wi_activity_type")
@Data
public class WiActivityType implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 分类名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 描述
     */
    @TableField(value = "describe_text")
    private String describe_text;

    /**
     * 创建时间(美东)
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改时间(美东)
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 排序
     */
    @TableField(value = "sort_id")
    private Object sort_id;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 大大股东id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 子站点文件夹id,对应表ge_station_sub的id,如果值为空,表示是主站
     */
    @TableField(value = "station_sub_id")
    private Object station_sub_id;

    /**
     * 活动分类图标
     */
    @TableField(value = "icon_url")
    private String icon_url;

    /**
     * 超链接
     */
    @TableField(value = "hyperlinks")
    private String hyperlinks;

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
        WiActivityType other = (WiActivityType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescribe_text() == null ? other.getDescribe_text() == null : this.getDescribe_text().equals(other.getDescribe_text()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getSort_id() == null ? other.getSort_id() == null : this.getSort_id().equals(other.getSort_id()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getStation_sub_id() == null ? other.getStation_sub_id() == null : this.getStation_sub_id().equals(other.getStation_sub_id()))
            && (this.getIcon_url() == null ? other.getIcon_url() == null : this.getIcon_url().equals(other.getIcon_url()))
            && (this.getHyperlinks() == null ? other.getHyperlinks() == null : this.getHyperlinks().equals(other.getHyperlinks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescribe_text() == null) ? 0 : getDescribe_text().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getSort_id() == null) ? 0 : getSort_id().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getStation_sub_id() == null) ? 0 : getStation_sub_id().hashCode());
        result = prime * result + ((getIcon_url() == null) ? 0 : getIcon_url().hashCode());
        result = prime * result + ((getHyperlinks() == null) ? 0 : getHyperlinks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", describe_text=").append(describe_text);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", sort_id=").append(sort_id);
        sb.append(", update_user=").append(update_user);
        sb.append(", account1=").append(account1);
        sb.append(", create_user=").append(create_user);
        sb.append(", station_sub_id=").append(station_sub_id);
        sb.append(", icon_url=").append(icon_url);
        sb.append(", hyperlinks=").append(hyperlinks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}