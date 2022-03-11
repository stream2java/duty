package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 时时返水表
 * @TableName mny_pre_realtime_record
 */
@TableName(value ="mny_pre_realtime_record")
@Data
public class MnyPreRealtimeRecord implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 会员ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 本次之前的有效投注金额
     */
    @TableField(value = "previous_bet_total_amount")
    private BigDecimal previous_bet_total_amount;

    /**
     * 本次有效投注金额
     */
    @TableField(value = "current_bet_total_amount")
    private BigDecimal current_bet_total_amount;

    /**
     * 本次之前的返水金额
     */
    @TableField(value = "previous_pre_total_amount")
    private BigDecimal previous_pre_total_amount;

    /**
     * 本次返水金额
     */
    @TableField(value = "current_pre_total_amount")
    private BigDecimal current_pre_total_amount;

    /**
     * 之前已经领取过的的记录ID，可为空
     */
    @TableField(value = "previous_record_ids")
    private Object previous_record_ids;

    /**
     * 时时返水状态：0可领取，1中间状态，2领取成功，3冲销
     */
    @TableField(value = "status")
    private String status;

    /**
     * 日期，与api_betting_summary_total的相同，按天记录便于查询
     */
    @TableField(value = "betting_date")
    private LocalDate betting_date;

    /**
     * 返水群组ID
     */
    @TableField(value = "set_type_id")
    private Object set_type_id;

    /**
     * 领取时间
     */
    @TableField(value = "receive_time")
    private LocalDateTime receive_time;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 更新者，可以是冲销时被更新
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 隶属日期
     */
    @TableField(value = "belong_date")
    private LocalDate belong_date;

    /**
     * 层级id
     */
    @TableField(value = "level_id")
    private Object level_id;

    /**
     * 当日领取次数
     */
    @TableField(value = "day_receive_number")
    private String day_receive_number;

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
        MnyPreRealtimeRecord other = (MnyPreRealtimeRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getPrevious_bet_total_amount() == null ? other.getPrevious_bet_total_amount() == null : this.getPrevious_bet_total_amount().equals(other.getPrevious_bet_total_amount()))
            && (this.getCurrent_bet_total_amount() == null ? other.getCurrent_bet_total_amount() == null : this.getCurrent_bet_total_amount().equals(other.getCurrent_bet_total_amount()))
            && (this.getPrevious_pre_total_amount() == null ? other.getPrevious_pre_total_amount() == null : this.getPrevious_pre_total_amount().equals(other.getPrevious_pre_total_amount()))
            && (this.getCurrent_pre_total_amount() == null ? other.getCurrent_pre_total_amount() == null : this.getCurrent_pre_total_amount().equals(other.getCurrent_pre_total_amount()))
            && (this.getPrevious_record_ids() == null ? other.getPrevious_record_ids() == null : this.getPrevious_record_ids().equals(other.getPrevious_record_ids()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBetting_date() == null ? other.getBetting_date() == null : this.getBetting_date().equals(other.getBetting_date()))
            && (this.getSet_type_id() == null ? other.getSet_type_id() == null : this.getSet_type_id().equals(other.getSet_type_id()))
            && (this.getReceive_time() == null ? other.getReceive_time() == null : this.getReceive_time().equals(other.getReceive_time()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getBelong_date() == null ? other.getBelong_date() == null : this.getBelong_date().equals(other.getBelong_date()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getDay_receive_number() == null ? other.getDay_receive_number() == null : this.getDay_receive_number().equals(other.getDay_receive_number()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getPrevious_bet_total_amount() == null) ? 0 : getPrevious_bet_total_amount().hashCode());
        result = prime * result + ((getCurrent_bet_total_amount() == null) ? 0 : getCurrent_bet_total_amount().hashCode());
        result = prime * result + ((getPrevious_pre_total_amount() == null) ? 0 : getPrevious_pre_total_amount().hashCode());
        result = prime * result + ((getCurrent_pre_total_amount() == null) ? 0 : getCurrent_pre_total_amount().hashCode());
        result = prime * result + ((getPrevious_record_ids() == null) ? 0 : getPrevious_record_ids().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBetting_date() == null) ? 0 : getBetting_date().hashCode());
        result = prime * result + ((getSet_type_id() == null) ? 0 : getSet_type_id().hashCode());
        result = prime * result + ((getReceive_time() == null) ? 0 : getReceive_time().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getBelong_date() == null) ? 0 : getBelong_date().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getDay_receive_number() == null) ? 0 : getDay_receive_number().hashCode());
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
        sb.append(", account_id=").append(account_id);
        sb.append(", previous_bet_total_amount=").append(previous_bet_total_amount);
        sb.append(", current_bet_total_amount=").append(current_bet_total_amount);
        sb.append(", previous_pre_total_amount=").append(previous_pre_total_amount);
        sb.append(", current_pre_total_amount=").append(current_pre_total_amount);
        sb.append(", previous_record_ids=").append(previous_record_ids);
        sb.append(", status=").append(status);
        sb.append(", betting_date=").append(betting_date);
        sb.append(", set_type_id=").append(set_type_id);
        sb.append(", receive_time=").append(receive_time);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", remark=").append(remark);
        sb.append(", belong_date=").append(belong_date);
        sb.append(", level_id=").append(level_id);
        sb.append(", day_receive_number=").append(day_receive_number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}