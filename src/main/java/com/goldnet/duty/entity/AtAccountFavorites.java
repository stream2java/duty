package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 收藏信息表
 * @TableName at_account_favorites
 */
@TableName(value ="at_account_favorites")
@Data
public class AtAccountFavorites implements Serializable {
    /**
     * 
     */
    @TableId(value = "acc_id")
    private Object acc_id;

    /**
     * 
     */
    @TableId(value = "model_id")
    private Object model_id;

    /**
     * 
     */
    @TableField(value = "or_order")
    private Object or_order;

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
        AtAccountFavorites other = (AtAccountFavorites) that;
        return (this.getAcc_id() == null ? other.getAcc_id() == null : this.getAcc_id().equals(other.getAcc_id()))
            && (this.getModel_id() == null ? other.getModel_id() == null : this.getModel_id().equals(other.getModel_id()))
            && (this.getOr_order() == null ? other.getOr_order() == null : this.getOr_order().equals(other.getOr_order()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAcc_id() == null) ? 0 : getAcc_id().hashCode());
        result = prime * result + ((getModel_id() == null) ? 0 : getModel_id().hashCode());
        result = prime * result + ((getOr_order() == null) ? 0 : getOr_order().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acc_id=").append(acc_id);
        sb.append(", model_id=").append(model_id);
        sb.append(", or_order=").append(or_order);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}