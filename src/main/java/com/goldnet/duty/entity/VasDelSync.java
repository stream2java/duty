package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName vas_del_sync
 */
@TableName(value ="vas_del_sync")
@Data
public class VasDelSync implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * Service名稱
     */
    @TableField(value = "service_name")
    private String service_name;

    /**
     * PK值
     */
    @TableField(value = "pk")
    private String pk;

    /**
     * 同步狀態, 0:未同步
     */
    @TableField(value = "status")
    private String status;

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
        VasDelSync other = (VasDelSync) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getService_name() == null ? other.getService_name() == null : this.getService_name().equals(other.getService_name()))
            && (this.getPk() == null ? other.getPk() == null : this.getPk().equals(other.getPk()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getService_name() == null) ? 0 : getService_name().hashCode());
        result = prime * result + ((getPk() == null) ? 0 : getPk().hashCode());
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
        sb.append(", service_name=").append(service_name);
        sb.append(", pk=").append(pk);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}