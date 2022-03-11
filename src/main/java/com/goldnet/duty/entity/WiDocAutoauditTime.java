package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName wi_doc_autoaudit_time
 */
@TableName(value ="wi_doc_autoaudit_time")
@Data
public class WiDocAutoauditTime implements Serializable {
    /**
     * id
     */
    @TableField(value = "autoaudit_id")
    private Object autoaudit_id;

    /**
     * 自动审核时间
     */
    @TableField(value = "date_time")
    private Object date_time;

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
        WiDocAutoauditTime other = (WiDocAutoauditTime) that;
        return (this.getAutoaudit_id() == null ? other.getAutoaudit_id() == null : this.getAutoaudit_id().equals(other.getAutoaudit_id()))
            && (this.getDate_time() == null ? other.getDate_time() == null : this.getDate_time().equals(other.getDate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAutoaudit_id() == null) ? 0 : getAutoaudit_id().hashCode());
        result = prime * result + ((getDate_time() == null) ? 0 : getDate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", autoaudit_id=").append(autoaudit_id);
        sb.append(", date_time=").append(date_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}