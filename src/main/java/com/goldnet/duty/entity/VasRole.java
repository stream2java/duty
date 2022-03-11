package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 加值平台角色表
 * @TableName vas_role
 */
@TableName(value ="vas_role")
@Data
public class VasRole implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 角色代號
     */
    @TableField(value = "type")
    private String type;

    /**
     * 角色顯示名稱
     */
    @TableField(value = "role_name")
    private String role_name;

    /**
     * 角色描述
     */
    @TableField(value = "role_desc")
    private String role_desc;

    /**
     * 同步狀態 0:未同步 1:同步
     */
    @TableField(value = "sync_status")
    private Object sync_status;

    /**
     * 套数
     */
    @TableField(value = "set_id")
    private String set_id;

    /**
     * 
     */
    @TableField(value = "site_id")
    private Object site_id;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_date")
    private LocalDateTime update_date;

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
        VasRole other = (VasRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRole_name() == null ? other.getRole_name() == null : this.getRole_name().equals(other.getRole_name()))
            && (this.getRole_desc() == null ? other.getRole_desc() == null : this.getRole_desc().equals(other.getRole_desc()))
            && (this.getSync_status() == null ? other.getSync_status() == null : this.getSync_status().equals(other.getSync_status()))
            && (this.getSet_id() == null ? other.getSet_id() == null : this.getSet_id().equals(other.getSet_id()))
            && (this.getSite_id() == null ? other.getSite_id() == null : this.getSite_id().equals(other.getSite_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date() == null ? other.getUpdate_date() == null : this.getUpdate_date().equals(other.getUpdate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRole_name() == null) ? 0 : getRole_name().hashCode());
        result = prime * result + ((getRole_desc() == null) ? 0 : getRole_desc().hashCode());
        result = prime * result + ((getSync_status() == null) ? 0 : getSync_status().hashCode());
        result = prime * result + ((getSet_id() == null) ? 0 : getSet_id().hashCode());
        result = prime * result + ((getSite_id() == null) ? 0 : getSite_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date() == null) ? 0 : getUpdate_date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", role_name=").append(role_name);
        sb.append(", role_desc=").append(role_desc);
        sb.append(", sync_status=").append(sync_status);
        sb.append(", set_id=").append(set_id);
        sb.append(", site_id=").append(site_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date=").append(create_date);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date=").append(update_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}