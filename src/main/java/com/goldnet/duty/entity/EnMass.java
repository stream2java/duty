package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName en_mass
 */
@TableName(value ="en_mass")
@Data
public class EnMass implements Serializable {
    /**
     * 
     */
    @TableField(value = "acc_id")
    private Object acc_id;

    /**
     * 
     */
    @TableField(value = "en_message")
    private String en_message;

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
        EnMass other = (EnMass) that;
        return (this.getAcc_id() == null ? other.getAcc_id() == null : this.getAcc_id().equals(other.getAcc_id()))
            && (this.getEn_message() == null ? other.getEn_message() == null : this.getEn_message().equals(other.getEn_message()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAcc_id() == null) ? 0 : getAcc_id().hashCode());
        result = prime * result + ((getEn_message() == null) ? 0 : getEn_message().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acc_id=").append(acc_id);
        sb.append(", en_message=").append(en_message);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}