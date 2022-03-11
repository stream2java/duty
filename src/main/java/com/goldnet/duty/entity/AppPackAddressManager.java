package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 下载包地址管理
 * @TableName app_pack_address_manager
 */
@TableName(value ="app_pack_address_manager")
@Data
public class AppPackAddressManager implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * APP类型
     */
    @TableField(value = "app_type")
    private Object app_type;

    /**
     *  终端类型
     */
    @TableField(value = "device_type")
    private Object device_type;

    /**
     * 包下载地址
     */
    @TableField(value = "pack_address")
    private String pack_address;

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
        AppPackAddressManager other = (AppPackAddressManager) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApp_type() == null ? other.getApp_type() == null : this.getApp_type().equals(other.getApp_type()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()))
            && (this.getPack_address() == null ? other.getPack_address() == null : this.getPack_address().equals(other.getPack_address()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApp_type() == null) ? 0 : getApp_type().hashCode());
        result = prime * result + ((getDevice_type() == null) ? 0 : getDevice_type().hashCode());
        result = prime * result + ((getPack_address() == null) ? 0 : getPack_address().hashCode());
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
        sb.append(", pack_address=").append(pack_address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}