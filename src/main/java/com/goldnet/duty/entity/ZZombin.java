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
 * @TableName z_zombin
 */
@TableName(value ="z_zombin")
@Data
public class ZZombin implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

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
    @TableField(value = "tpe_table_name")
    private String tpe_table_name;

    /**
     * 
     */
    @TableField(value = "tg_op_type")
    private String tg_op_type;

    /**
     * 
     */
    @TableField(value = "operate_record")
    private String operate_record;

    /**
     * 
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

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
        ZZombin other = (ZZombin) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOldid() == null ? other.getOldid() == null : this.getOldid().equals(other.getOldid()))
            && (this.getOldaccount() == null ? other.getOldaccount() == null : this.getOldaccount().equals(other.getOldaccount()))
            && (this.getNewid() == null ? other.getNewid() == null : this.getNewid().equals(other.getNewid()))
            && (this.getNewaccount() == null ? other.getNewaccount() == null : this.getNewaccount().equals(other.getNewaccount()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getIs_notify() == null ? other.getIs_notify() == null : this.getIs_notify().equals(other.getIs_notify()))
            && (this.getTpe_table_name() == null ? other.getTpe_table_name() == null : this.getTpe_table_name().equals(other.getTpe_table_name()))
            && (this.getTg_op_type() == null ? other.getTg_op_type() == null : this.getTg_op_type().equals(other.getTg_op_type()))
            && (this.getOperate_record() == null ? other.getOperate_record() == null : this.getOperate_record().equals(other.getOperate_record()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOldid() == null) ? 0 : getOldid().hashCode());
        result = prime * result + ((getOldaccount() == null) ? 0 : getOldaccount().hashCode());
        result = prime * result + ((getNewid() == null) ? 0 : getNewid().hashCode());
        result = prime * result + ((getNewaccount() == null) ? 0 : getNewaccount().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getIs_notify() == null) ? 0 : getIs_notify().hashCode());
        result = prime * result + ((getTpe_table_name() == null) ? 0 : getTpe_table_name().hashCode());
        result = prime * result + ((getTg_op_type() == null) ? 0 : getTg_op_type().hashCode());
        result = prime * result + ((getOperate_record() == null) ? 0 : getOperate_record().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oldid=").append(oldid);
        sb.append(", oldaccount=").append(oldaccount);
        sb.append(", newid=").append(newid);
        sb.append(", newaccount=").append(newaccount);
        sb.append(", date=").append(date);
        sb.append(", is_notify=").append(is_notify);
        sb.append(", tpe_table_name=").append(tpe_table_name);
        sb.append(", tg_op_type=").append(tg_op_type);
        sb.append(", operate_record=").append(operate_record);
        sb.append(", create_date=").append(create_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}