package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName dba_os_relogin_record
 */
@TableName(value ="dba_os_relogin_record")
@Data
public class DbaOsReloginRecord implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

    /**
     * 
     */
    @TableField(value = "relogin_name")
    private String relogin_name;

    /**
     * 
     */
    @TableField(value = "relogin_db")
    private String relogin_db;

    /**
     * 
     */
    @TableField(value = "client_host_ip")
    private String client_host_ip;

    /**
     * 
     */
    @TableField(value = "relogin_status")
    private String relogin_status;

    /**
     * 
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 
     */
    @TableField(value = "relogin_date")
    private String relogin_date;

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
        DbaOsReloginRecord other = (DbaOsReloginRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getRelogin_name() == null ? other.getRelogin_name() == null : this.getRelogin_name().equals(other.getRelogin_name()))
            && (this.getRelogin_db() == null ? other.getRelogin_db() == null : this.getRelogin_db().equals(other.getRelogin_db()))
            && (this.getClient_host_ip() == null ? other.getClient_host_ip() == null : this.getClient_host_ip().equals(other.getClient_host_ip()))
            && (this.getRelogin_status() == null ? other.getRelogin_status() == null : this.getRelogin_status().equals(other.getRelogin_status()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRelogin_date() == null ? other.getRelogin_date() == null : this.getRelogin_date().equals(other.getRelogin_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getRelogin_name() == null) ? 0 : getRelogin_name().hashCode());
        result = prime * result + ((getRelogin_db() == null) ? 0 : getRelogin_db().hashCode());
        result = prime * result + ((getClient_host_ip() == null) ? 0 : getClient_host_ip().hashCode());
        result = prime * result + ((getRelogin_status() == null) ? 0 : getRelogin_status().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRelogin_date() == null) ? 0 : getRelogin_date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_date=").append(create_date);
        sb.append(", relogin_name=").append(relogin_name);
        sb.append(", relogin_db=").append(relogin_db);
        sb.append(", client_host_ip=").append(client_host_ip);
        sb.append(", relogin_status=").append(relogin_status);
        sb.append(", status=").append(status);
        sb.append(", relogin_date=").append(relogin_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}