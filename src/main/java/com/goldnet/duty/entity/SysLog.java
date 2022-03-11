package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sys_log
 */
@TableName(value ="sys_log")
@Data
public class SysLog implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "task_name")
    private String task_name;

    /**
     * 
     */
    @TableField(value = "exe_time")
    private String exe_time;

    /**
     * 
     */
    @TableField(value = "log_type")
    private String log_type;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

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
        SysLog other = (SysLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTask_name() == null ? other.getTask_name() == null : this.getTask_name().equals(other.getTask_name()))
            && (this.getExe_time() == null ? other.getExe_time() == null : this.getExe_time().equals(other.getExe_time()))
            && (this.getLog_type() == null ? other.getLog_type() == null : this.getLog_type().equals(other.getLog_type()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTask_name() == null) ? 0 : getTask_name().hashCode());
        result = prime * result + ((getExe_time() == null) ? 0 : getExe_time().hashCode());
        result = prime * result + ((getLog_type() == null) ? 0 : getLog_type().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", task_name=").append(task_name);
        sb.append(", exe_time=").append(exe_time);
        sb.append(", log_type=").append(log_type);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}