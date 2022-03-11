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
 * 红包活动条件
 * @TableName ge_activity_packet_condition
 */
@TableName(value ="ge_activity_packet_condition")
@Data
public class GeActivityPacketCondition implements Serializable {
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
     * 关联红包活动时间段表ID
     */
    @TableField(value = "activity_time_id")
    private Long activity_time_id;

    /**
     * 充值金额
     */
    @TableField(value = "deposit_amount")
    private BigDecimal deposit_amount;

    /**
     * 有效投注额
     */
    @TableField(value = "betting_amount")
    private BigDecimal betting_amount;

    /**
     * 层级
     */
    @TableField(value = "level_ids")
    private Object level_ids;

    /**
     * 关系
     */
    @TableField(value = "relation_type")
    private Integer relation_type;

    /**
     * 可抢红包个数
     */
    @TableField(value = "num")
    private Object num;

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
        GeActivityPacketCondition other = (GeActivityPacketCondition) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getActivity_id() == null ? other.getActivity_id() == null : this.getActivity_id().equals(other.getActivity_id()))
            && (this.getActivity_time_id() == null ? other.getActivity_time_id() == null : this.getActivity_time_id().equals(other.getActivity_time_id()))
            && (this.getDeposit_amount() == null ? other.getDeposit_amount() == null : this.getDeposit_amount().equals(other.getDeposit_amount()))
            && (this.getBetting_amount() == null ? other.getBetting_amount() == null : this.getBetting_amount().equals(other.getBetting_amount()))
            && (this.getLevel_ids() == null ? other.getLevel_ids() == null : this.getLevel_ids().equals(other.getLevel_ids()))
            && (this.getRelation_type() == null ? other.getRelation_type() == null : this.getRelation_type().equals(other.getRelation_type()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
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
        result = prime * result + ((getDeposit_amount() == null) ? 0 : getDeposit_amount().hashCode());
        result = prime * result + ((getBetting_amount() == null) ? 0 : getBetting_amount().hashCode());
        result = prime * result + ((getLevel_ids() == null) ? 0 : getLevel_ids().hashCode());
        result = prime * result + ((getRelation_type() == null) ? 0 : getRelation_type().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
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
        sb.append(", deposit_amount=").append(deposit_amount);
        sb.append(", betting_amount=").append(betting_amount);
        sb.append(", level_ids=").append(level_ids);
        sb.append(", relation_type=").append(relation_type);
        sb.append(", num=").append(num);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}