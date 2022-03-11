package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 推广返点事件表
 * @TableName promotion_rebate_event
 */
@TableName(value ="promotion_rebate_event")
@Data
public class PromotionRebateEvent implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 事件名称
     */
    @TableField(value = "event_name")
    private String event_name;

    /**
     * 统计开始时间
     */
    @TableField(value = "calculate_time_start")
    private LocalDateTime calculate_time_start;

    /**
     * 统计结束时间
     */
    @TableField(value = "calculate_time_end")
    private LocalDateTime calculate_time_end;

    /**
     * 返点人数
     */
    @TableField(value = "total_account")
    private Object total_account;

    /**
     * 返水金额
     */
    @TableField(value = "total_amount")
    private BigDecimal total_amount;

    /**
     * 未返水人数
     */
    @TableField(value = "undeal_total_account")
    private Object undeal_total_account;

    /**
     * 未返水金额
     */
    @TableField(value = "undeal_total_amount")
    private BigDecimal undeal_total_amount;

    /**
     * 冲销人数
     */
    @TableField(value = "revert_total_account")
    private Object revert_total_account;

    /**
     * 冲销金额
     */
    @TableField(value = "revert_total_amount")
    private BigDecimal revert_total_amount;

    /**
     * 返水事件条件
     */
    @TableField(value = "event_condition")
    private String event_condition;

    /**
     * 事件状态0:待处理 1:已处理
     */
    @TableField(value = "event_status")
    private Integer event_status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

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
        PromotionRebateEvent other = (PromotionRebateEvent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getEvent_name() == null ? other.getEvent_name() == null : this.getEvent_name().equals(other.getEvent_name()))
            && (this.getCalculate_time_start() == null ? other.getCalculate_time_start() == null : this.getCalculate_time_start().equals(other.getCalculate_time_start()))
            && (this.getCalculate_time_end() == null ? other.getCalculate_time_end() == null : this.getCalculate_time_end().equals(other.getCalculate_time_end()))
            && (this.getTotal_account() == null ? other.getTotal_account() == null : this.getTotal_account().equals(other.getTotal_account()))
            && (this.getTotal_amount() == null ? other.getTotal_amount() == null : this.getTotal_amount().equals(other.getTotal_amount()))
            && (this.getUndeal_total_account() == null ? other.getUndeal_total_account() == null : this.getUndeal_total_account().equals(other.getUndeal_total_account()))
            && (this.getUndeal_total_amount() == null ? other.getUndeal_total_amount() == null : this.getUndeal_total_amount().equals(other.getUndeal_total_amount()))
            && (this.getRevert_total_account() == null ? other.getRevert_total_account() == null : this.getRevert_total_account().equals(other.getRevert_total_account()))
            && (this.getRevert_total_amount() == null ? other.getRevert_total_amount() == null : this.getRevert_total_amount().equals(other.getRevert_total_amount()))
            && (this.getEvent_condition() == null ? other.getEvent_condition() == null : this.getEvent_condition().equals(other.getEvent_condition()))
            && (this.getEvent_status() == null ? other.getEvent_status() == null : this.getEvent_status().equals(other.getEvent_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getEvent_name() == null) ? 0 : getEvent_name().hashCode());
        result = prime * result + ((getCalculate_time_start() == null) ? 0 : getCalculate_time_start().hashCode());
        result = prime * result + ((getCalculate_time_end() == null) ? 0 : getCalculate_time_end().hashCode());
        result = prime * result + ((getTotal_account() == null) ? 0 : getTotal_account().hashCode());
        result = prime * result + ((getTotal_amount() == null) ? 0 : getTotal_amount().hashCode());
        result = prime * result + ((getUndeal_total_account() == null) ? 0 : getUndeal_total_account().hashCode());
        result = prime * result + ((getUndeal_total_amount() == null) ? 0 : getUndeal_total_amount().hashCode());
        result = prime * result + ((getRevert_total_account() == null) ? 0 : getRevert_total_account().hashCode());
        result = prime * result + ((getRevert_total_amount() == null) ? 0 : getRevert_total_amount().hashCode());
        result = prime * result + ((getEvent_condition() == null) ? 0 : getEvent_condition().hashCode());
        result = prime * result + ((getEvent_status() == null) ? 0 : getEvent_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account1=").append(account1);
        sb.append(", event_name=").append(event_name);
        sb.append(", calculate_time_start=").append(calculate_time_start);
        sb.append(", calculate_time_end=").append(calculate_time_end);
        sb.append(", total_account=").append(total_account);
        sb.append(", total_amount=").append(total_amount);
        sb.append(", undeal_total_account=").append(undeal_total_account);
        sb.append(", undeal_total_amount=").append(undeal_total_amount);
        sb.append(", revert_total_account=").append(revert_total_account);
        sb.append(", revert_total_amount=").append(revert_total_amount);
        sb.append(", event_condition=").append(event_condition);
        sb.append(", event_status=").append(event_status);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}