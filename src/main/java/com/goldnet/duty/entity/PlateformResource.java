package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 平台资源表
 * @TableName plateform_resource
 */
@TableName(value ="plateform_resource")
@Data
public class PlateformResource implements Serializable {
    /**
     * 
     */
    @TableField(value = "resource_id")
    private Object resource_id;

    /**
     * 
     */
    @TableField(value = "authority_id")
    private Object authority_id;

    /**
     * 
     */
    @TableField(value = "authority_url")
    private String authority_url;

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
        PlateformResource other = (PlateformResource) that;
        return (this.getResource_id() == null ? other.getResource_id() == null : this.getResource_id().equals(other.getResource_id()))
            && (this.getAuthority_id() == null ? other.getAuthority_id() == null : this.getAuthority_id().equals(other.getAuthority_id()))
            && (this.getAuthority_url() == null ? other.getAuthority_url() == null : this.getAuthority_url().equals(other.getAuthority_url()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResource_id() == null) ? 0 : getResource_id().hashCode());
        result = prime * result + ((getAuthority_id() == null) ? 0 : getAuthority_id().hashCode());
        result = prime * result + ((getAuthority_url() == null) ? 0 : getAuthority_url().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resource_id=").append(resource_id);
        sb.append(", authority_id=").append(authority_id);
        sb.append(", authority_url=").append(authority_url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}