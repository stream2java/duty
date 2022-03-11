package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * app域名列表
 * @TableName app_domain_url
 */
@TableName(value ="app_domain_url")
@Data
public class AppDomainUrl implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 关联app_domain表中的主键ID
     */
    @TableField(value = "app_domain_id")
    private Object app_domain_id;

    /**
     * 域名的协议，http或者https
     */
    @TableField(value = "domain_protocol")
    private String domain_protocol;

    /**
     * 关联ge_station_domain表的主键ID，以便获取域名url
     */
    @TableField(value = "station_domain_id")
    private Object station_domain_id;

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
        AppDomainUrl other = (AppDomainUrl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApp_domain_id() == null ? other.getApp_domain_id() == null : this.getApp_domain_id().equals(other.getApp_domain_id()))
            && (this.getDomain_protocol() == null ? other.getDomain_protocol() == null : this.getDomain_protocol().equals(other.getDomain_protocol()))
            && (this.getStation_domain_id() == null ? other.getStation_domain_id() == null : this.getStation_domain_id().equals(other.getStation_domain_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApp_domain_id() == null) ? 0 : getApp_domain_id().hashCode());
        result = prime * result + ((getDomain_protocol() == null) ? 0 : getDomain_protocol().hashCode());
        result = prime * result + ((getStation_domain_id() == null) ? 0 : getStation_domain_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", app_domain_id=").append(app_domain_id);
        sb.append(", domain_protocol=").append(domain_protocol);
        sb.append(", station_domain_id=").append(station_domain_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}