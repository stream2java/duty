package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sn_info
 */
@TableName(value ="sn_info")
@Data
public class SnInfo implements Serializable {
    /**
     * 
     */
    @TableId(value = "sn")
    private Object sn;

    /**
     * 
     */
    @TableField(value = "sn_info")
    private String sn_info;

    /**
     * OTP类型：0实体OTP,1软件OTP
     */
    @TableField(value = "type")
    private String type;

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
        SnInfo other = (SnInfo) that;
        return (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getSn_info() == null ? other.getSn_info() == null : this.getSn_info().equals(other.getSn_info()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getSn_info() == null) ? 0 : getSn_info().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sn=").append(sn);
        sb.append(", sn_info=").append(sn_info);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}