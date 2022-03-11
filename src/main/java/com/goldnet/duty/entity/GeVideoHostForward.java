package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 台面与转发服务器关联表
 * @TableName ge_video_host_forward
 */
@TableName(value ="ge_video_host_forward")
@Data
public class GeVideoHostForward implements Serializable {
    /**
     * 
     */
    @TableId(value = "host_forward_id")
    private Object host_forward_id;

    /**
     * 
     */
    @TableField(value = "host_id")
    private Object host_id;

    /**
     * 
     */
    @TableField(value = "forward_id")
    private Object forward_id;

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
        GeVideoHostForward other = (GeVideoHostForward) that;
        return (this.getHost_forward_id() == null ? other.getHost_forward_id() == null : this.getHost_forward_id().equals(other.getHost_forward_id()))
            && (this.getHost_id() == null ? other.getHost_id() == null : this.getHost_id().equals(other.getHost_id()))
            && (this.getForward_id() == null ? other.getForward_id() == null : this.getForward_id().equals(other.getForward_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost_forward_id() == null) ? 0 : getHost_forward_id().hashCode());
        result = prime * result + ((getHost_id() == null) ? 0 : getHost_id().hashCode());
        result = prime * result + ((getForward_id() == null) ? 0 : getForward_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host_forward_id=").append(host_forward_id);
        sb.append(", host_id=").append(host_id);
        sb.append(", forward_id=").append(forward_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}