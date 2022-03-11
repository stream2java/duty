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
 * @TableName sys_event_logs
 */
@TableName(value ="sys_event_logs")
@Data
public class SysEventLogs implements Serializable {
    /**
     * uuid主键
     */
    @TableId(value = "log_id")
    private String log_id;

    /**
     * 
     */
    @TableField(value = "operator")
    private Object operator;

    /**
     * 
     */
    @TableField(value = "message")
    private String message;

    /**
     * 
     */
    @TableField(value = "group_info")
    private String group_info;

    /**
     * 
     */
    @TableField(value = "package_path")
    private String package_path;

    /**
     * 
     */
    @TableField(value = "method")
    private String method;

    /**
     * 
     */
    @TableField(value = "running_time")
    private String running_time;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    /**
     * 
     */
    @TableField(value = "result_info")
    private String result_info;

    /**
     * 
     */
    @TableField(value = "error_info")
    private String error_info;

    /**
     * 
     */
    @TableField(value = "event_time")
    private LocalDateTime event_time;

    /**
     * 
     */
    @TableField(value = "operator_name")
    private String operator_name;

    /**
     * 
     */
    @TableField(value = "start_time")
    private LocalDateTime start_time;

    /**
     * 
     */
    @TableField(value = "end_time")
    private LocalDateTime end_time;

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
        SysEventLogs other = (SysEventLogs) that;
        return (this.getLog_id() == null ? other.getLog_id() == null : this.getLog_id().equals(other.getLog_id()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getGroup_info() == null ? other.getGroup_info() == null : this.getGroup_info().equals(other.getGroup_info()))
            && (this.getPackage_path() == null ? other.getPackage_path() == null : this.getPackage_path().equals(other.getPackage_path()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getRunning_time() == null ? other.getRunning_time() == null : this.getRunning_time().equals(other.getRunning_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getResult_info() == null ? other.getResult_info() == null : this.getResult_info().equals(other.getResult_info()))
            && (this.getError_info() == null ? other.getError_info() == null : this.getError_info().equals(other.getError_info()))
            && (this.getEvent_time() == null ? other.getEvent_time() == null : this.getEvent_time().equals(other.getEvent_time()))
            && (this.getOperator_name() == null ? other.getOperator_name() == null : this.getOperator_name().equals(other.getOperator_name()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLog_id() == null) ? 0 : getLog_id().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getGroup_info() == null) ? 0 : getGroup_info().hashCode());
        result = prime * result + ((getPackage_path() == null) ? 0 : getPackage_path().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getRunning_time() == null) ? 0 : getRunning_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getResult_info() == null) ? 0 : getResult_info().hashCode());
        result = prime * result + ((getError_info() == null) ? 0 : getError_info().hashCode());
        result = prime * result + ((getEvent_time() == null) ? 0 : getEvent_time().hashCode());
        result = prime * result + ((getOperator_name() == null) ? 0 : getOperator_name().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", log_id=").append(log_id);
        sb.append(", operator=").append(operator);
        sb.append(", message=").append(message);
        sb.append(", group_info=").append(group_info);
        sb.append(", package_path=").append(package_path);
        sb.append(", method=").append(method);
        sb.append(", running_time=").append(running_time);
        sb.append(", status=").append(status);
        sb.append(", result_info=").append(result_info);
        sb.append(", error_info=").append(error_info);
        sb.append(", event_time=").append(event_time);
        sb.append(", operator_name=").append(operator_name);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}