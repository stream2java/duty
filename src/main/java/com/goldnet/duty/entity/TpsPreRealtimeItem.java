package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 时时返水明细表
 * @TableName tps_pre_realtime_item
 */
@TableName(value ="tps_pre_realtime_item")
@Data
public class TpsPreRealtimeItem implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 平台小类，如：FYQP, PPJL
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 平台大类，如：AG,FG
     */
    @TableField(value = "parent_platform_code")
    private String parent_platform_code;

    /**
     * 之前投注额
     */
    @TableField(value = "previous_bet_amount")
    private BigDecimal previous_bet_amount;

    /**
     * 之前返水金额
     */
    @TableField(value = "previous_pre_amount")
    private BigDecimal previous_pre_amount;

    /**
     * 本次投注额
     */
    @TableField(value = "current_bet_amount")
    private BigDecimal current_bet_amount;

    /**
     * 本次返水金额
     */
    @TableField(value = "current_pre_amount")
    private BigDecimal current_pre_amount;

    /**
     * 外键引用会员时时返水记录表ID
     */
    @TableField(value = "pre_realtime_record_id")
    private Long pre_realtime_record_id;

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
        TpsPreRealtimeItem other = (TpsPreRealtimeItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getParent_platform_code() == null ? other.getParent_platform_code() == null : this.getParent_platform_code().equals(other.getParent_platform_code()))
            && (this.getPrevious_bet_amount() == null ? other.getPrevious_bet_amount() == null : this.getPrevious_bet_amount().equals(other.getPrevious_bet_amount()))
            && (this.getPrevious_pre_amount() == null ? other.getPrevious_pre_amount() == null : this.getPrevious_pre_amount().equals(other.getPrevious_pre_amount()))
            && (this.getCurrent_bet_amount() == null ? other.getCurrent_bet_amount() == null : this.getCurrent_bet_amount().equals(other.getCurrent_bet_amount()))
            && (this.getCurrent_pre_amount() == null ? other.getCurrent_pre_amount() == null : this.getCurrent_pre_amount().equals(other.getCurrent_pre_amount()))
            && (this.getPre_realtime_record_id() == null ? other.getPre_realtime_record_id() == null : this.getPre_realtime_record_id().equals(other.getPre_realtime_record_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getParent_platform_code() == null) ? 0 : getParent_platform_code().hashCode());
        result = prime * result + ((getPrevious_bet_amount() == null) ? 0 : getPrevious_bet_amount().hashCode());
        result = prime * result + ((getPrevious_pre_amount() == null) ? 0 : getPrevious_pre_amount().hashCode());
        result = prime * result + ((getCurrent_bet_amount() == null) ? 0 : getCurrent_bet_amount().hashCode());
        result = prime * result + ((getCurrent_pre_amount() == null) ? 0 : getCurrent_pre_amount().hashCode());
        result = prime * result + ((getPre_realtime_record_id() == null) ? 0 : getPre_realtime_record_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", parent_platform_code=").append(parent_platform_code);
        sb.append(", previous_bet_amount=").append(previous_bet_amount);
        sb.append(", previous_pre_amount=").append(previous_pre_amount);
        sb.append(", current_bet_amount=").append(current_bet_amount);
        sb.append(", current_pre_amount=").append(current_pre_amount);
        sb.append(", pre_realtime_record_id=").append(pre_realtime_record_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}