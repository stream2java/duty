package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 期数停售表
 * @TableName ge_period_status
 */
@TableName(value ="ge_period_status")
@Data
public class GePeriodStatus implements Serializable {
    /**
     * 期数停售ID
     */
    @TableId(value = "period_status_id")
    private Object period_status_id;

    /**
     * 期数时间
     */
    @TableField(value = "period_date")
    private String period_date;

    /**
     * 期数编号
     */
    @TableField(value = "period_code")
    private String period_code;

    /**
     * 停售状态
     */
    @TableField(value = "status")
    private String status;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDate create_date_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDate update_date_time;

    /**
     * 游戏ID
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 期数ID
     */
    @TableField(value = "period_id")
    private Object period_id;

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
        GePeriodStatus other = (GePeriodStatus) that;
        return (this.getPeriod_status_id() == null ? other.getPeriod_status_id() == null : this.getPeriod_status_id().equals(other.getPeriod_status_id()))
            && (this.getPeriod_date() == null ? other.getPeriod_date() == null : this.getPeriod_date().equals(other.getPeriod_date()))
            && (this.getPeriod_code() == null ? other.getPeriod_code() == null : this.getPeriod_code().equals(other.getPeriod_code()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getPeriod_id() == null ? other.getPeriod_id() == null : this.getPeriod_id().equals(other.getPeriod_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPeriod_status_id() == null) ? 0 : getPeriod_status_id().hashCode());
        result = prime * result + ((getPeriod_date() == null) ? 0 : getPeriod_date().hashCode());
        result = prime * result + ((getPeriod_code() == null) ? 0 : getPeriod_code().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getPeriod_id() == null) ? 0 : getPeriod_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", period_status_id=").append(period_status_id);
        sb.append(", period_date=").append(period_date);
        sb.append(", period_code=").append(period_code);
        sb.append(", status=").append(status);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", period_id=").append(period_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}