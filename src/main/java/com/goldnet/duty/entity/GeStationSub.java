package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 站点子站表
 * @TableName ge_station_sub
 */
@TableName(value ="ge_station_sub")
@Data
public class GeStationSub implements Serializable {
    /**
     * 流水id
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 站点皮肤
     */
    @TableField(value = "station_skin")
    private String station_skin;

    /**
     * 站点id
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 注册状态 1:允许注册 2:不允许注册
     */
    @TableField(value = "reg_status")
    private Object reg_status;

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
     * 站点类型
     */
    @TableField(value = "type")
    private Object type;

    /**
     * 类型名称
     */
    @TableField(value = "type_name")
    private String type_name;

    /**
     * H5/APP前端皮肤
     */
    @TableField(value = "h5_skin")
    private String h5_skin;

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
        GeStationSub other = (GeStationSub) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStation_skin() == null ? other.getStation_skin() == null : this.getStation_skin().equals(other.getStation_skin()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getReg_status() == null ? other.getReg_status() == null : this.getReg_status().equals(other.getReg_status()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getType_name() == null ? other.getType_name() == null : this.getType_name().equals(other.getType_name()))
            && (this.getH5_skin() == null ? other.getH5_skin() == null : this.getH5_skin().equals(other.getH5_skin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStation_skin() == null) ? 0 : getStation_skin().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getReg_status() == null) ? 0 : getReg_status().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getType_name() == null) ? 0 : getType_name().hashCode());
        result = prime * result + ((getH5_skin() == null) ? 0 : getH5_skin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", station_skin=").append(station_skin);
        sb.append(", station_id=").append(station_id);
        sb.append(", reg_status=").append(reg_status);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", type=").append(type);
        sb.append(", type_name=").append(type_name);
        sb.append(", h5_skin=").append(h5_skin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}