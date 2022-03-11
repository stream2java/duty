package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 最近访问表
 * @TableName at_account_recent
 */
@TableName(value ="at_account_recent")
@Data
public class AtAccountRecent implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "recent_id")
    private Object recent_id;

    /**
     * 
     */
    @TableField(value = "acc_id")
    private Object acc_id;

    /**
     * 
     */
    @TableField(value = "model_id")
    private Object model_id;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

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
        AtAccountRecent other = (AtAccountRecent) that;
        return (this.getRecent_id() == null ? other.getRecent_id() == null : this.getRecent_id().equals(other.getRecent_id()))
            && (this.getAcc_id() == null ? other.getAcc_id() == null : this.getAcc_id().equals(other.getAcc_id()))
            && (this.getModel_id() == null ? other.getModel_id() == null : this.getModel_id().equals(other.getModel_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecent_id() == null) ? 0 : getRecent_id().hashCode());
        result = prime * result + ((getAcc_id() == null) ? 0 : getAcc_id().hashCode());
        result = prime * result + ((getModel_id() == null) ? 0 : getModel_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recent_id=").append(recent_id);
        sb.append(", acc_id=").append(acc_id);
        sb.append(", model_id=").append(model_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}