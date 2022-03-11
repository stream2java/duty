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
 * 红包活动表
 * @TableName ge_activity_red_packet
 */
@TableName(value ="ge_activity_red_packet")
@Data
public class GeActivityRedPacket implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 活动主表ID
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
     * 层级
     */
    @TableField(value = "level_ids")
    private Object level_ids;

    /**
     * 存款金额要求
     */
    @TableField(value = "deposit_amount")
    private BigDecimal deposit_amount;

    /**
     * 有效投注额要求
     */
    @TableField(value = "valid_bet_amount")
    private BigDecimal valid_bet_amount;

    /**
     * 关系（0-且，1-或）
     */
    @TableField(value = "relation_type")
    private Integer relation_type;

    /**
     * 红包种类（0-随机，1-等分）
     */
    @TableField(value = "split_type")
    private Integer split_type;

    /**
     * 红包总金额
     */
    @TableField(value = "total_amount")
    private BigDecimal total_amount;

    /**
     * 红包个数
     */
    @TableField(value = "num")
    private Object num;

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

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

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
        GeActivityRedPacket other = (GeActivityRedPacket) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActivity_id() == null ? other.getActivity_id() == null : this.getActivity_id().equals(other.getActivity_id()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getLevel_ids() == null ? other.getLevel_ids() == null : this.getLevel_ids().equals(other.getLevel_ids()))
            && (this.getDeposit_amount() == null ? other.getDeposit_amount() == null : this.getDeposit_amount().equals(other.getDeposit_amount()))
            && (this.getValid_bet_amount() == null ? other.getValid_bet_amount() == null : this.getValid_bet_amount().equals(other.getValid_bet_amount()))
            && (this.getRelation_type() == null ? other.getRelation_type() == null : this.getRelation_type().equals(other.getRelation_type()))
            && (this.getSplit_type() == null ? other.getSplit_type() == null : this.getSplit_type().equals(other.getSplit_type()))
            && (this.getTotal_amount() == null ? other.getTotal_amount() == null : this.getTotal_amount().equals(other.getTotal_amount()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getMin_amount() == null ? other.getMin_amount() == null : this.getMin_amount().equals(other.getMin_amount()))
            && (this.getMax_amount() == null ? other.getMax_amount() == null : this.getMax_amount().equals(other.getMax_amount()))
            && (this.getCheck_num() == null ? other.getCheck_num() == null : this.getCheck_num().equals(other.getCheck_num()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getCheck_data() == null ? other.getCheck_data() == null : this.getCheck_data().equals(other.getCheck_data()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActivity_id() == null) ? 0 : getActivity_id().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getLevel_ids() == null) ? 0 : getLevel_ids().hashCode());
        result = prime * result + ((getDeposit_amount() == null) ? 0 : getDeposit_amount().hashCode());
        result = prime * result + ((getValid_bet_amount() == null) ? 0 : getValid_bet_amount().hashCode());
        result = prime * result + ((getRelation_type() == null) ? 0 : getRelation_type().hashCode());
        result = prime * result + ((getSplit_type() == null) ? 0 : getSplit_type().hashCode());
        result = prime * result + ((getTotal_amount() == null) ? 0 : getTotal_amount().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getMin_amount() == null) ? 0 : getMin_amount().hashCode());
        result = prime * result + ((getMax_amount() == null) ? 0 : getMax_amount().hashCode());
        result = prime * result + ((getCheck_num() == null) ? 0 : getCheck_num().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
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
        sb.append(", activity_id=").append(activity_id);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", level_ids=").append(level_ids);
        sb.append(", deposit_amount=").append(deposit_amount);
        sb.append(", valid_bet_amount=").append(valid_bet_amount);
        sb.append(", relation_type=").append(relation_type);
        sb.append(", split_type=").append(split_type);
        sb.append(", total_amount=").append(total_amount);
        sb.append(", num=").append(num);
        sb.append(", min_amount=").append(min_amount);
        sb.append(", max_amount=").append(max_amount);
        sb.append(", check_num=").append(check_num);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", account1=").append(account1);
        sb.append(", check_data=").append(check_data);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}