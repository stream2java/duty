package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName wi_app_update_address
 */
@TableName(value ="wi_app_update_address")
@Data
public class WiAppUpdateAddress implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 
     */
    @TableField(value = "station_son")
    private String station_son;

    /**
     * APP类型    竖版APP/横版APP
     */
    @TableField(value = "app_type")
    private String app_type;

    /**
     * 终端类型 Android/IOS
     */
    @TableField(value = "device_id")
    private String device_id;

    /**
     * 更新地址
     */
    @TableField(value = "update_address")
    private String update_address;

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
        WiAppUpdateAddress other = (WiAppUpdateAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getStation_son() == null ? other.getStation_son() == null : this.getStation_son().equals(other.getStation_son()))
            && (this.getApp_type() == null ? other.getApp_type() == null : this.getApp_type().equals(other.getApp_type()))
            && (this.getDevice_id() == null ? other.getDevice_id() == null : this.getDevice_id().equals(other.getDevice_id()))
            && (this.getUpdate_address() == null ? other.getUpdate_address() == null : this.getUpdate_address().equals(other.getUpdate_address()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getStation_son() == null) ? 0 : getStation_son().hashCode());
        result = prime * result + ((getApp_type() == null) ? 0 : getApp_type().hashCode());
        result = prime * result + ((getDevice_id() == null) ? 0 : getDevice_id().hashCode());
        result = prime * result + ((getUpdate_address() == null) ? 0 : getUpdate_address().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", station_id=").append(station_id);
        sb.append(", station_son=").append(station_son);
        sb.append(", app_type=").append(app_type);
        sb.append(", device_id=").append(device_id);
        sb.append(", update_address=").append(update_address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}