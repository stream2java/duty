package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 版本号管理表
 * @TableName app_version_list_tmp2
 */
@TableName(value ="app_version_list_tmp2")
@Data
public class AppVersionListTmp2 implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * APP类型  1WebApp 2APP
     */
    @TableField(value = "app_type")
    private Object app_type;

    /**
     * 终端类型  1 ios 2 安卓
     */
    @TableField(value = "device_type")
    private Object device_type;

    /**
     * 版本状态  1启用  2停用
     */
    @TableField(value = "version_status")
    private Object version_status;

    /**
     * 是否强制更新  1否  2是
     */
    @TableField(value = "is_force_update")
    private Object is_force_update;

    /**
     * APP版本号
     */
    @TableField(value = "app_version_number")
    private String app_version_number;

    /**
     * API接口版本号
     */
    @TableField(value = "api_interface_version_number")
    private String api_interface_version_number;

    /**
     * 前台更新说明
     */
    @TableField(value = "update_describe")
    private String update_describe;

    /**
     * 后台更新说明
     */
    @TableField(value = "update_admin_describe")
    private String update_admin_describe;

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
        AppVersionListTmp2 other = (AppVersionListTmp2) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApp_type() == null ? other.getApp_type() == null : this.getApp_type().equals(other.getApp_type()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()))
            && (this.getVersion_status() == null ? other.getVersion_status() == null : this.getVersion_status().equals(other.getVersion_status()))
            && (this.getIs_force_update() == null ? other.getIs_force_update() == null : this.getIs_force_update().equals(other.getIs_force_update()))
            && (this.getApp_version_number() == null ? other.getApp_version_number() == null : this.getApp_version_number().equals(other.getApp_version_number()))
            && (this.getApi_interface_version_number() == null ? other.getApi_interface_version_number() == null : this.getApi_interface_version_number().equals(other.getApi_interface_version_number()))
            && (this.getUpdate_describe() == null ? other.getUpdate_describe() == null : this.getUpdate_describe().equals(other.getUpdate_describe()))
            && (this.getUpdate_admin_describe() == null ? other.getUpdate_admin_describe() == null : this.getUpdate_admin_describe().equals(other.getUpdate_admin_describe()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApp_type() == null) ? 0 : getApp_type().hashCode());
        result = prime * result + ((getDevice_type() == null) ? 0 : getDevice_type().hashCode());
        result = prime * result + ((getVersion_status() == null) ? 0 : getVersion_status().hashCode());
        result = prime * result + ((getIs_force_update() == null) ? 0 : getIs_force_update().hashCode());
        result = prime * result + ((getApp_version_number() == null) ? 0 : getApp_version_number().hashCode());
        result = prime * result + ((getApi_interface_version_number() == null) ? 0 : getApi_interface_version_number().hashCode());
        result = prime * result + ((getUpdate_describe() == null) ? 0 : getUpdate_describe().hashCode());
        result = prime * result + ((getUpdate_admin_describe() == null) ? 0 : getUpdate_admin_describe().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", app_type=").append(app_type);
        sb.append(", device_type=").append(device_type);
        sb.append(", version_status=").append(version_status);
        sb.append(", is_force_update=").append(is_force_update);
        sb.append(", app_version_number=").append(app_version_number);
        sb.append(", api_interface_version_number=").append(api_interface_version_number);
        sb.append(", update_describe=").append(update_describe);
        sb.append(", update_admin_describe=").append(update_admin_describe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}