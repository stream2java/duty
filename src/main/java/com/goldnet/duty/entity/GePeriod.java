package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 游戏期数表
 * @TableName ge_period
 */
@TableName(value ="ge_period")
@Data
public class GePeriod implements Serializable {
    /**
     * 期数ID 
     */
    @TableId(value = "period_id")
    private Object period_id;

    /**
     * 游戏编号
     */
    @TableField(value = "lottery_code")
    private String lottery_code;

    /**
     * 期数编号
     */
    @TableField(value = "period_code")
    private String period_code;

    /**
     * 期数日前
     */
    @TableField(value = "period_date")
    private String period_date;

    /**
     * 投注开始时间
     */
    @TableField(value = "betting_start_date")
    private String betting_start_date;

    /**
     * 投注截止时间
     */
    @TableField(value = "betting_end_date")
    private String betting_end_date;

    /**
     * 期数截止时间
     */
    @TableField(value = "period_end_date")
    private String period_end_date;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 游戏ID
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

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
        GePeriod other = (GePeriod) that;
        return (this.getPeriod_id() == null ? other.getPeriod_id() == null : this.getPeriod_id().equals(other.getPeriod_id()))
            && (this.getLottery_code() == null ? other.getLottery_code() == null : this.getLottery_code().equals(other.getLottery_code()))
            && (this.getPeriod_code() == null ? other.getPeriod_code() == null : this.getPeriod_code().equals(other.getPeriod_code()))
            && (this.getPeriod_date() == null ? other.getPeriod_date() == null : this.getPeriod_date().equals(other.getPeriod_date()))
            && (this.getBetting_start_date() == null ? other.getBetting_start_date() == null : this.getBetting_start_date().equals(other.getBetting_start_date()))
            && (this.getBetting_end_date() == null ? other.getBetting_end_date() == null : this.getBetting_end_date().equals(other.getBetting_end_date()))
            && (this.getPeriod_end_date() == null ? other.getPeriod_end_date() == null : this.getPeriod_end_date().equals(other.getPeriod_end_date()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPeriod_id() == null) ? 0 : getPeriod_id().hashCode());
        result = prime * result + ((getLottery_code() == null) ? 0 : getLottery_code().hashCode());
        result = prime * result + ((getPeriod_code() == null) ? 0 : getPeriod_code().hashCode());
        result = prime * result + ((getPeriod_date() == null) ? 0 : getPeriod_date().hashCode());
        result = prime * result + ((getBetting_start_date() == null) ? 0 : getBetting_start_date().hashCode());
        result = prime * result + ((getBetting_end_date() == null) ? 0 : getBetting_end_date().hashCode());
        result = prime * result + ((getPeriod_end_date() == null) ? 0 : getPeriod_end_date().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", period_id=").append(period_id);
        sb.append(", lottery_code=").append(lottery_code);
        sb.append(", period_code=").append(period_code);
        sb.append(", period_date=").append(period_date);
        sb.append(", betting_start_date=").append(betting_start_date);
        sb.append(", betting_end_date=").append(betting_end_date);
        sb.append(", period_end_date=").append(period_end_date);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}