package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

/**
 * 红包活动时间段表
 * @TableName ge_activity_packet_time
 */
@TableName(value ="ge_activity_packet_time")
@Data
public class GeActivityPacketTime implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 关联活动表ID
     */
    @TableField(value = "activity_id")
    private Long activity_id;

    /**
     * 开始时间
     */
    @TableField(value = "start_time")
    private LocalTime start_time;

    /**
     * 结束时间
     */
    @TableField(value = "end_time")
    private LocalTime end_time;

    /**
     * 红包种类：0-随机，1-等分，2-自定义
     */
    @TableField(value = "red_packet_type")
    private Object red_packet_type;

    /**
     * 红包总金额
     */
    @TableField(value = "total_amount")
    private BigDecimal total_amount;

    /**
     * 红包个数
     */
    @TableField(value = "total_num")
    private Object total_num;

    /**
     * 最低金额
     */
    @TableField(value = "min_amount")
    private BigDecimal min_amount;

    /**
     * 最高金额
     */
    @TableField(value = "max_amount")
    private BigDecimal max_amount;

    /**
     * 稽核倍数
     */
    @TableField(value = "check_num")
    private Object check_num;

    /**
     * 虚拟金额
     */
    @TableField(value = "virtual_amount")
    private BigDecimal virtual_amount;

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
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 更新人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 数据是否写入MQ，0-否，1-是
     */
    @TableField(value = "check_data")
    private Integer check_data;

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
        GeActivityPacketTime other = (GeActivityPacketTime) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getActivity_id() == null ? other.getActivity_id() == null : this.getActivity_id().equals(other.getActivity_id()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getRed_packet_type() == null ? other.getRed_packet_type() == null : this.getRed_packet_type().equals(other.getRed_packet_type()))
            && (this.getTotal_amount() == null ? other.getTotal_amount() == null : this.getTotal_amount().equals(other.getTotal_amount()))
            && (this.getTotal_num() == null ? other.getTotal_num() == null : this.getTotal_num().equals(other.getTotal_num()))
            && (this.getMin_amount() == null ? other.getMin_amount() == null : this.getMin_amount().equals(other.getMin_amount()))
            && (this.getMax_amount() == null ? other.getMax_amount() == null : this.getMax_amount().equals(other.getMax_amount()))
            && (this.getCheck_num() == null ? other.getCheck_num() == null : this.getCheck_num().equals(other.getCheck_num()))
            && (this.getVirtual_amount() == null ? other.getVirtual_amount() == null : this.getVirtual_amount().equals(other.getVirtual_amount()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getCheck_data() == null ? other.getCheck_data() == null : this.getCheck_data().equals(other.getCheck_data()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getActivity_id() == null) ? 0 : getActivity_id().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getRed_packet_type() == null) ? 0 : getRed_packet_type().hashCode());
        result = prime * result + ((getTotal_amount() == null) ? 0 : getTotal_amount().hashCode());
        result = prime * result + ((getTotal_num() == null) ? 0 : getTotal_num().hashCode());
        result = prime * result + ((getMin_amount() == null) ? 0 : getMin_amount().hashCode());
        result = prime * result + ((getMax_amount() == null) ? 0 : getMax_amount().hashCode());
        result = prime * result + ((getCheck_num() == null) ? 0 : getCheck_num().hashCode());
        result = prime * result + ((getVirtual_amount() == null) ? 0 : getVirtual_amount().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getCheck_data() == null) ? 0 : getCheck_data().hashCode());
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
        sb.append(", activity_id=").append(activity_id);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", red_packet_type=").append(red_packet_type);
        sb.append(", total_amount=").append(total_amount);
        sb.append(", total_num=").append(total_num);
        sb.append(", min_amount=").append(min_amount);
        sb.append(", max_amount=").append(max_amount);
        sb.append(", check_num=").append(check_num);
        sb.append(", virtual_amount=").append(virtual_amount);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", check_data=").append(check_data);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}