package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName mny_merchant_count
 */
@TableName(value ="mny_merchant_count")
@Data
public class MnyMerchantCount implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 层级id
     */
    @TableField(value = "levelid")
    private Object levelid;

    /**
     * 状态(停用/启用）
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 大大股东
     */
    @TableField(value = "stockholderid")
    private Object stockholderid;

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
        MnyMerchantCount other = (MnyMerchantCount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLevelid() == null ? other.getLevelid() == null : this.getLevelid().equals(other.getLevelid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStockholderid() == null ? other.getStockholderid() == null : this.getStockholderid().equals(other.getStockholderid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLevelid() == null) ? 0 : getLevelid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStockholderid() == null) ? 0 : getStockholderid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", levelid=").append(levelid);
        sb.append(", status=").append(status);
        sb.append(", stockholderid=").append(stockholderid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}