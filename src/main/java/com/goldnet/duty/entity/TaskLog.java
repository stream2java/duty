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
 * @TableName task_log
 */
@TableName(value ="task_log")
@Data
public class TaskLog implements Serializable {
    /**
     * 
     */
    @TableId(value = "task_log_id")
    private Object task_log_id;

    /**
     * 任务名称
     */
    @TableField(value = "task_name")
    private String task_name;

    /**
     * 失败会员数量
     */
    @TableField(value = "fail_amount")
    private Object fail_amount;

    /**
     * 任务执行开始时间
     */
    @TableField(value = "start_date")
    private LocalDateTime start_date;

    /**
     * 任务执行结束时间
     */
    @TableField(value = "end_date")
    private LocalDateTime end_date;

    /**
     * 任务执行状态
     */
    @TableField(value = "status")
    private String status;

    /**
     * 执行会员成功数量
     */
    @TableField(value = "success_amount")
    private Object success_amount;

    /**
     * 任务再次执行时间
     */
    @TableField(value = "repeat_run_date")
    private LocalDateTime repeat_run_date;

    /**
     * 
     */
    @TableField(value = "api_name")
    private String api_name;

    /**
     * 任务描述
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 执行时间
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

    /**
     * 耗时时分秒
     */
    @TableField(value = "runtimes")
    private String runtimes;

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
        TaskLog other = (TaskLog) that;
        return (this.getTask_log_id() == null ? other.getTask_log_id() == null : this.getTask_log_id().equals(other.getTask_log_id()))
            && (this.getTask_name() == null ? other.getTask_name() == null : this.getTask_name().equals(other.getTask_name()))
            && (this.getFail_amount() == null ? other.getFail_amount() == null : this.getFail_amount().equals(other.getFail_amount()))
            && (this.getStart_date() == null ? other.getStart_date() == null : this.getStart_date().equals(other.getStart_date()))
            && (this.getEnd_date() == null ? other.getEnd_date() == null : this.getEnd_date().equals(other.getEnd_date()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSuccess_amount() == null ? other.getSuccess_amount() == null : this.getSuccess_amount().equals(other.getSuccess_amount()))
            && (this.getRepeat_run_date() == null ? other.getRepeat_run_date() == null : this.getRepeat_run_date().equals(other.getRepeat_run_date()))
            && (this.getApi_name() == null ? other.getApi_name() == null : this.getApi_name().equals(other.getApi_name()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getRuntimes() == null ? other.getRuntimes() == null : this.getRuntimes().equals(other.getRuntimes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTask_log_id() == null) ? 0 : getTask_log_id().hashCode());
        result = prime * result + ((getTask_name() == null) ? 0 : getTask_name().hashCode());
        result = prime * result + ((getFail_amount() == null) ? 0 : getFail_amount().hashCode());
        result = prime * result + ((getStart_date() == null) ? 0 : getStart_date().hashCode());
        result = prime * result + ((getEnd_date() == null) ? 0 : getEnd_date().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSuccess_amount() == null) ? 0 : getSuccess_amount().hashCode());
        result = prime * result + ((getRepeat_run_date() == null) ? 0 : getRepeat_run_date().hashCode());
        result = prime * result + ((getApi_name() == null) ? 0 : getApi_name().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getRuntimes() == null) ? 0 : getRuntimes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", task_log_id=").append(task_log_id);
        sb.append(", task_name=").append(task_name);
        sb.append(", fail_amount=").append(fail_amount);
        sb.append(", start_date=").append(start_date);
        sb.append(", end_date=").append(end_date);
        sb.append(", status=").append(status);
        sb.append(", success_amount=").append(success_amount);
        sb.append(", repeat_run_date=").append(repeat_run_date);
        sb.append(", api_name=").append(api_name);
        sb.append(", remark=").append(remark);
        sb.append(", create_date=").append(create_date);
        sb.append(", runtimes=").append(runtimes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}