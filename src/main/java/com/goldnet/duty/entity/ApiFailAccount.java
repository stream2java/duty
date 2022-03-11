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
 * @TableName api_fail_account
 */
@TableName(value ="api_fail_account")
@Data
public class ApiFailAccount implements Serializable {
    /**
     * 记录ID
     */
    @TableId(value = "api_fail_acount_record_id")
    private Object api_fail_acount_record_id;

    /**
     * 会员Id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 任务ID
     */
    @TableField(value = "task_id")
    private Object task_id;

    /**
     * 再次执行时间
     */
    @TableField(value = "repeat_run_date")
    private LocalDateTime repeat_run_date;

    /**
     * 采集时间段开始时间
     */
    @TableField(value = "api_param_start_date")
    private LocalDateTime api_param_start_date;

    /**
     * 
     */
    @TableField(value = "api_param_enddate")
    private LocalDateTime api_param_enddate;

    /**
     * 假删除标志,用于执行失败顽固会员记录的关闭执行 (七天之前未执行的,采集只能采集七天内)
     */
    @TableField(value = "is_delete")
    private String is_delete;

    /**
     * 
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

    /**
     * 
     */
    @TableField(value = "api_name")
    private String api_name;

    /**
     * 注单数量
     */
    @TableField(value = "bet_count")
    private Object bet_count;

    /**
     * 备注:执行成功或者失败说明
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
        ApiFailAccount other = (ApiFailAccount) that;
        return (this.getApi_fail_acount_record_id() == null ? other.getApi_fail_acount_record_id() == null : this.getApi_fail_acount_record_id().equals(other.getApi_fail_acount_record_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getRepeat_run_date() == null ? other.getRepeat_run_date() == null : this.getRepeat_run_date().equals(other.getRepeat_run_date()))
            && (this.getApi_param_start_date() == null ? other.getApi_param_start_date() == null : this.getApi_param_start_date().equals(other.getApi_param_start_date()))
            && (this.getApi_param_enddate() == null ? other.getApi_param_enddate() == null : this.getApi_param_enddate().equals(other.getApi_param_enddate()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getApi_name() == null ? other.getApi_name() == null : this.getApi_name().equals(other.getApi_name()))
            && (this.getBet_count() == null ? other.getBet_count() == null : this.getBet_count().equals(other.getBet_count()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApi_fail_acount_record_id() == null) ? 0 : getApi_fail_acount_record_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getRepeat_run_date() == null) ? 0 : getRepeat_run_date().hashCode());
        result = prime * result + ((getApi_param_start_date() == null) ? 0 : getApi_param_start_date().hashCode());
        result = prime * result + ((getApi_param_enddate() == null) ? 0 : getApi_param_enddate().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getApi_name() == null) ? 0 : getApi_name().hashCode());
        result = prime * result + ((getBet_count() == null) ? 0 : getBet_count().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", api_fail_acount_record_id=").append(api_fail_acount_record_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", account=").append(account);
        sb.append(", task_id=").append(task_id);
        sb.append(", repeat_run_date=").append(repeat_run_date);
        sb.append(", api_param_start_date=").append(api_param_start_date);
        sb.append(", api_param_enddate=").append(api_param_enddate);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", create_date=").append(create_date);
        sb.append(", api_name=").append(api_name);
        sb.append(", bet_count=").append(bet_count);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}