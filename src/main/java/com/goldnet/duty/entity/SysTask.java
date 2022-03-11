package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 任务信息表
 * @TableName sys_task
 */
@TableName(value ="sys_task")
@Data
public class SysTask implements Serializable {
    /**
     * 
     */
    @TableId(value = "task_id")
    private Object task_id;

    /**
     * -- 任务名称
     */
    @TableField(value = "task_name")
    private String task_name;

    /**
     * -- 任务实现类
     */
    @TableField(value = "task_class")
    private String task_class;

    /**
     * -- 详细描述
     */
    @TableField(value = "task_desc")
    private String task_desc;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * -- 作废标识0正常1作废
     */
    @TableField(value = "delete_flag")
    private String delete_flag;

    /**
     * 
     */
    @TableField(value = "task_code")
    private String task_code;

    /**
     * -- 修改人
     */
    @TableField(value = "update_user")
    private Object update_user;

    /**
     * -- 创建人
     */
    @TableField(value = "create_user")
    private Object create_user;

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
        SysTask other = (SysTask) that;
        return (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getTask_name() == null ? other.getTask_name() == null : this.getTask_name().equals(other.getTask_name()))
            && (this.getTask_class() == null ? other.getTask_class() == null : this.getTask_class().equals(other.getTask_class()))
            && (this.getTask_desc() == null ? other.getTask_desc() == null : this.getTask_desc().equals(other.getTask_desc()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getDelete_flag() == null ? other.getDelete_flag() == null : this.getDelete_flag().equals(other.getDelete_flag()))
            && (this.getTask_code() == null ? other.getTask_code() == null : this.getTask_code().equals(other.getTask_code()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getTask_name() == null) ? 0 : getTask_name().hashCode());
        result = prime * result + ((getTask_class() == null) ? 0 : getTask_class().hashCode());
        result = prime * result + ((getTask_desc() == null) ? 0 : getTask_desc().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getDelete_flag() == null) ? 0 : getDelete_flag().hashCode());
        result = prime * result + ((getTask_code() == null) ? 0 : getTask_code().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", task_id=").append(task_id);
        sb.append(", task_name=").append(task_name);
        sb.append(", task_class=").append(task_class);
        sb.append(", task_desc=").append(task_desc);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_time=").append(create_time);
        sb.append(", delete_flag=").append(delete_flag);
        sb.append(", task_code=").append(task_code);
        sb.append(", update_user=").append(update_user);
        sb.append(", create_user=").append(create_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}