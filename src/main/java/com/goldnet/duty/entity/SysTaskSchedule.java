package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 任务计划表
 * @TableName sys_task_schedule
 */
@TableName(value ="sys_task_schedule")
@Data
public class SysTaskSchedule implements Serializable {
    /**
     * 
     */
    @TableId(value = "schedule_id")
    private Object schedule_id;

    /**
     * -- 计划名称
     */
    @TableField(value = "schedule_name")
    private String schedule_name;

    /**
     * -- 关联任务
     */
    @TableField(value = "task_id")
    private Object task_id;

    /**
     * -- 计划上次执行的时间
     */
    @TableField(value = "schedule_prev_time")
    private LocalDateTime schedule_prev_time;

    /**
     * -- 计划下次执行的时间
     */
    @TableField(value = "schedule_next_time")
    private LocalDateTime schedule_next_time;

    /**
     * -- 详细描述
     */
    @TableField(value = "schedule_desc")
    private String schedule_desc;

    /**
     * -- 计划表达式
     */
    @TableField(value = "schedule_cron")
    private String schedule_cron;

    /**
     * -- 计划cron表达式类型
     */
    @TableField(value = "schedule_cron_type")
    private String schedule_cron_type;

    /**
     * -- 计划的延时
     */
    @TableField(value = "schedule_cron_interval")
    private Object schedule_cron_interval;

    /**
     * -- 计划执行的状态
     */
    @TableField(value = "schedule_status")
    private String schedule_status;

    /**
     * -- 计划开始执行的时间
     */
    @TableField(value = "schedule_start_time")
    private LocalDateTime schedule_start_time;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private Object update_user;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "create_user")
    private Object create_user;

    /**
     * 作废标识0正常·1作废
     */
    @TableField(value = "delete_flag")
    private String delete_flag;

    /**
     * -- 用于保存JSON格式的表单数据，方便修改
     */
    @TableField(value = "json4_update")
    private String json4_update;

    /**
     * 
     */
    @TableField(value = "business_id")
    private Object business_id;

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
        SysTaskSchedule other = (SysTaskSchedule) that;
        return (this.getSchedule_id() == null ? other.getSchedule_id() == null : this.getSchedule_id().equals(other.getSchedule_id()))
            && (this.getSchedule_name() == null ? other.getSchedule_name() == null : this.getSchedule_name().equals(other.getSchedule_name()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getSchedule_prev_time() == null ? other.getSchedule_prev_time() == null : this.getSchedule_prev_time().equals(other.getSchedule_prev_time()))
            && (this.getSchedule_next_time() == null ? other.getSchedule_next_time() == null : this.getSchedule_next_time().equals(other.getSchedule_next_time()))
            && (this.getSchedule_desc() == null ? other.getSchedule_desc() == null : this.getSchedule_desc().equals(other.getSchedule_desc()))
            && (this.getSchedule_cron() == null ? other.getSchedule_cron() == null : this.getSchedule_cron().equals(other.getSchedule_cron()))
            && (this.getSchedule_cron_type() == null ? other.getSchedule_cron_type() == null : this.getSchedule_cron_type().equals(other.getSchedule_cron_type()))
            && (this.getSchedule_cron_interval() == null ? other.getSchedule_cron_interval() == null : this.getSchedule_cron_interval().equals(other.getSchedule_cron_interval()))
            && (this.getSchedule_status() == null ? other.getSchedule_status() == null : this.getSchedule_status().equals(other.getSchedule_status()))
            && (this.getSchedule_start_time() == null ? other.getSchedule_start_time() == null : this.getSchedule_start_time().equals(other.getSchedule_start_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getDelete_flag() == null ? other.getDelete_flag() == null : this.getDelete_flag().equals(other.getDelete_flag()))
            && (this.getJson4_update() == null ? other.getJson4_update() == null : this.getJson4_update().equals(other.getJson4_update()))
            && (this.getBusiness_id() == null ? other.getBusiness_id() == null : this.getBusiness_id().equals(other.getBusiness_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedule_id() == null) ? 0 : getSchedule_id().hashCode());
        result = prime * result + ((getSchedule_name() == null) ? 0 : getSchedule_name().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getSchedule_prev_time() == null) ? 0 : getSchedule_prev_time().hashCode());
        result = prime * result + ((getSchedule_next_time() == null) ? 0 : getSchedule_next_time().hashCode());
        result = prime * result + ((getSchedule_desc() == null) ? 0 : getSchedule_desc().hashCode());
        result = prime * result + ((getSchedule_cron() == null) ? 0 : getSchedule_cron().hashCode());
        result = prime * result + ((getSchedule_cron_type() == null) ? 0 : getSchedule_cron_type().hashCode());
        result = prime * result + ((getSchedule_cron_interval() == null) ? 0 : getSchedule_cron_interval().hashCode());
        result = prime * result + ((getSchedule_status() == null) ? 0 : getSchedule_status().hashCode());
        result = prime * result + ((getSchedule_start_time() == null) ? 0 : getSchedule_start_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getDelete_flag() == null) ? 0 : getDelete_flag().hashCode());
        result = prime * result + ((getJson4_update() == null) ? 0 : getJson4_update().hashCode());
        result = prime * result + ((getBusiness_id() == null) ? 0 : getBusiness_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schedule_id=").append(schedule_id);
        sb.append(", schedule_name=").append(schedule_name);
        sb.append(", task_id=").append(task_id);
        sb.append(", schedule_prev_time=").append(schedule_prev_time);
        sb.append(", schedule_next_time=").append(schedule_next_time);
        sb.append(", schedule_desc=").append(schedule_desc);
        sb.append(", schedule_cron=").append(schedule_cron);
        sb.append(", schedule_cron_type=").append(schedule_cron_type);
        sb.append(", schedule_cron_interval=").append(schedule_cron_interval);
        sb.append(", schedule_status=").append(schedule_status);
        sb.append(", schedule_start_time=").append(schedule_start_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", delete_flag=").append(delete_flag);
        sb.append(", json4_update=").append(json4_update);
        sb.append(", business_id=").append(business_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}