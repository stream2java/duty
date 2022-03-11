package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 平台栏目表
 * @TableName plateform_authority
 */
@TableName(value ="plateform_authority")
@Data
public class PlateformAuthority implements Serializable {
    /**
     * 
     */
    @TableId(value = "authority_id")
    private Object authority_id;

    /**
     * 权限名称
     */
    @TableField(value = "authority_name")
    private String authority_name;

    /**
     * 权限url
     */
    @TableField(value = "authority_url")
    private String authority_url;

    /**
     * 级别
     */
    @TableField(value = "level")
    private Object level;

    /**
     * 父id
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 0必选1非必选
     */
    @TableField(value = "is_enabled")
    private String is_enabled;

    /**
     * 是否为菜单(0:是;1:否)
     */
    @TableField(value = "is_menu")
    private String is_menu;

    /**
     * 默认从小到大
     */
    @TableField(value = "sort")
    private Object sort;

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
        PlateformAuthority other = (PlateformAuthority) that;
        return (this.getAuthority_id() == null ? other.getAuthority_id() == null : this.getAuthority_id().equals(other.getAuthority_id()))
            && (this.getAuthority_name() == null ? other.getAuthority_name() == null : this.getAuthority_name().equals(other.getAuthority_name()))
            && (this.getAuthority_url() == null ? other.getAuthority_url() == null : this.getAuthority_url().equals(other.getAuthority_url()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getIs_enabled() == null ? other.getIs_enabled() == null : this.getIs_enabled().equals(other.getIs_enabled()))
            && (this.getIs_menu() == null ? other.getIs_menu() == null : this.getIs_menu().equals(other.getIs_menu()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthority_id() == null) ? 0 : getAuthority_id().hashCode());
        result = prime * result + ((getAuthority_name() == null) ? 0 : getAuthority_name().hashCode());
        result = prime * result + ((getAuthority_url() == null) ? 0 : getAuthority_url().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getIs_enabled() == null) ? 0 : getIs_enabled().hashCode());
        result = prime * result + ((getIs_menu() == null) ? 0 : getIs_menu().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authority_id=").append(authority_id);
        sb.append(", authority_name=").append(authority_name);
        sb.append(", authority_url=").append(authority_url);
        sb.append(", level=").append(level);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", is_enabled=").append(is_enabled);
        sb.append(", is_menu=").append(is_menu);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}