package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName app_jpush_registration
 */
@TableName(value ="app_jpush_registration")
@Data
public class AppJpushRegistration implements Serializable {
    /**
     * 主键ID，唯一标识
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 极光推送registration_id
     */
    @TableField(value = "registration_id")
    private String registration_id;

    /**
     * 用户id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 厅主id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 站点标识：由于一个厅主有多个app存在
     */
    @TableField(value = "app_station_code")
    private String app_station_code;

    /**
     * 安卓还是ios：ios,android
     */
    @TableField(value = "device")
    private String device;

    /**
     * 
     */
    @TableField(value = "status")
    private Integer status;

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
        AppJpushRegistration other = (AppJpushRegistration) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegistration_id() == null ? other.getRegistration_id() == null : this.getRegistration_id().equals(other.getRegistration_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getApp_station_code() == null ? other.getApp_station_code() == null : this.getApp_station_code().equals(other.getApp_station_code()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegistration_id() == null) ? 0 : getRegistration_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getApp_station_code() == null) ? 0 : getApp_station_code().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", registration_id=").append(registration_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", account1=").append(account1);
        sb.append(", app_station_code=").append(app_station_code);
        sb.append(", device=").append(device);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}