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
 * @TableName aatest
 */
@TableName(value ="aatest")
@Data
public class Aatest implements Serializable {
    /**
     * 
     */
    @TableField(value = "oldid")
    private Object oldid;

    /**
     * 
     */
    @TableField(value = "oldaccount")
    private String oldaccount;

    /**
     * 
     */
    @TableField(value = "newid")
    private Object newid;

    /**
     * 
     */
    @TableField(value = "newaccount")
    private String newaccount;

    /**
     * 
     */
    @TableField(value = "date")
    private LocalDateTime date;

    /**
     * 
     */
    @TableField(value = "is_notify")
    private Object is_notify;

    /**
     * 
     */
    @TableField(value = "com_record_id")
    private Object com_record_id;

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
        Aatest other = (Aatest) that;
        return (this.getOldid() == null ? other.getOldid() == null : this.getOldid().equals(other.getOldid()))
            && (this.getOldaccount() == null ? other.getOldaccount() == null : this.getOldaccount().equals(other.getOldaccount()))
            && (this.getNewid() == null ? other.getNewid() == null : this.getNewid().equals(other.getNewid()))
            && (this.getNewaccount() == null ? other.getNewaccount() == null : this.getNewaccount().equals(other.getNewaccount()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getIs_notify() == null ? other.getIs_notify() == null : this.getIs_notify().equals(other.getIs_notify()))
            && (this.getCom_record_id() == null ? other.getCom_record_id() == null : this.getCom_record_id().equals(other.getCom_record_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOldid() == null) ? 0 : getOldid().hashCode());
        result = prime * result + ((getOldaccount() == null) ? 0 : getOldaccount().hashCode());
        result = prime * result + ((getNewid() == null) ? 0 : getNewid().hashCode());
        result = prime * result + ((getNewaccount() == null) ? 0 : getNewaccount().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getIs_notify() == null) ? 0 : getIs_notify().hashCode());
        result = prime * result + ((getCom_record_id() == null) ? 0 : getCom_record_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oldid=").append(oldid);
        sb.append(", oldaccount=").append(oldaccount);
        sb.append(", newid=").append(newid);
        sb.append(", newaccount=").append(newaccount);
        sb.append(", date=").append(date);
        sb.append(", is_notify=").append(is_notify);
        sb.append(", com_record_id=").append(com_record_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}