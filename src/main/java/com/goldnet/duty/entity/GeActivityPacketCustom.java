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
 * 红包活动自定义种类
 * @TableName ge_activity_packet_custom
 */
@TableName(value ="ge_activity_packet_custom")
@Data
public class GeActivityPacketCustom implements Serializable {
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
     * 活动ID
     */
    @TableField(value = "activity_id")
    private Long activity_id;

    /**
     * 活动时间段表ID
     */
    @TableField(value = "activity_time_id")
    private Long activity_time_id;

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
     * 红包几率
     */
    @TableField(value = "ratio")
    private Integer ratio;

    /**
     * 红包个数
     */
    @TableField(value = "total_num")
    private Object total_num;

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
     * 
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
        GeActivityPacketCustom other = (GeActivityPacketCustom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getActivity_id() == null ? other.getActivity_id() == null : this.getActivity_id().equals(other.getActivity_id()))
            && (this.getActivity_time_id() == null ? other.getActivity_time_id() == null : this.getActivity_time_id().equals(other.getActivity_time_id()))
            && (this.getMin_amount() == null ? other.getMin_amount() == null : this.getMin_amount().equals(other.getMin_amount()))
            && (this.getMax_amount() == null ? other.getMax_amount() == null : this.getMax_amount().equals(other.getMax_amount()))
            && (this.getRatio() == null ? other.getRatio() == null : this.getRatio().equals(other.getRatio()))
            && (this.getTotal_num() == null ? other.getTotal_num() == null : this.getTotal_num().equals(other.getTotal_num()))
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
        result = prime * result + ((getActivity_id() == null) ? 0 : getActivity_id().hashCode());
        result = prime * result + ((getActivity_time_id() == null) ? 0 : getActivity_time_id().hashCode());
        result = prime * result + ((getMin_amount() == null) ? 0 : getMin_amount().hashCode());
        result = prime * result + ((getMax_amount() == null) ? 0 : getMax_amount().hashCode());
        result = prime * result + ((getRatio() == null) ? 0 : getRatio().hashCode());
        result = prime * result + ((getTotal_num() == null) ? 0 : getTotal_num().hashCode());
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
        sb.append(", activity_id=").append(activity_id);
        sb.append(", activity_time_id=").append(activity_time_id);
        sb.append(", min_amount=").append(min_amount);
        sb.append(", max_amount=").append(max_amount);
        sb.append(", ratio=").append(ratio);
        sb.append(", total_num=").append(total_num);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}