package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 活动管理表
 * @TableName ge_activity
 */
@TableName(value ="ge_activity")
@Data
public class GeActivity implements Serializable {
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
     * 活动名称
     */
    @TableField(value = "activity_name")
    private String activity_name;

    /**
     * 活动类型(0-红包活动，)
     */
    @TableField(value = "activity_type")
    private Integer activity_type;

    /**
     * 是否开启(0-无效，1-有效)
     */
    @TableField(value = "activity_valid")
    private Integer activity_valid;

    /**
     * 活动日期
     */
    @TableField(value = "activity_days")
    private String activity_days;

    /**
     * 星期数
     */
    @TableField(value = "week_days")
    private Object week_days;

    /**
     * 开始日期
     */
    @TableField(value = "start_date")
    private LocalDate start_date;

    /**
     * 结束日期
     */
    @TableField(value = "end_date")
    private LocalDate end_date;

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
     * 活动是否开启：0-关闭，1-开启
     */
    @TableField(value = "activity_enable")
    private Integer activity_enable;

    /**
     * 开启时间
     */
    @TableField(value = "open_time")
    private LocalDateTime open_time;

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
        GeActivity other = (GeActivity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getActivity_name() == null ? other.getActivity_name() == null : this.getActivity_name().equals(other.getActivity_name()))
            && (this.getActivity_type() == null ? other.getActivity_type() == null : this.getActivity_type().equals(other.getActivity_type()))
            && (this.getActivity_valid() == null ? other.getActivity_valid() == null : this.getActivity_valid().equals(other.getActivity_valid()))
            && (this.getActivity_days() == null ? other.getActivity_days() == null : this.getActivity_days().equals(other.getActivity_days()))
            && (this.getWeek_days() == null ? other.getWeek_days() == null : this.getWeek_days().equals(other.getWeek_days()))
            && (this.getStart_date() == null ? other.getStart_date() == null : this.getStart_date().equals(other.getStart_date()))
            && (this.getEnd_date() == null ? other.getEnd_date() == null : this.getEnd_date().equals(other.getEnd_date()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getActivity_enable() == null ? other.getActivity_enable() == null : this.getActivity_enable().equals(other.getActivity_enable()))
            && (this.getOpen_time() == null ? other.getOpen_time() == null : this.getOpen_time().equals(other.getOpen_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getActivity_name() == null) ? 0 : getActivity_name().hashCode());
        result = prime * result + ((getActivity_type() == null) ? 0 : getActivity_type().hashCode());
        result = prime * result + ((getActivity_valid() == null) ? 0 : getActivity_valid().hashCode());
        result = prime * result + ((getActivity_days() == null) ? 0 : getActivity_days().hashCode());
        result = prime * result + ((getWeek_days() == null) ? 0 : getWeek_days().hashCode());
        result = prime * result + ((getStart_date() == null) ? 0 : getStart_date().hashCode());
        result = prime * result + ((getEnd_date() == null) ? 0 : getEnd_date().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getActivity_enable() == null) ? 0 : getActivity_enable().hashCode());
        result = prime * result + ((getOpen_time() == null) ? 0 : getOpen_time().hashCode());
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
        sb.append(", activity_name=").append(activity_name);
        sb.append(", activity_type=").append(activity_type);
        sb.append(", activity_valid=").append(activity_valid);
        sb.append(", activity_days=").append(activity_days);
        sb.append(", week_days=").append(week_days);
        sb.append(", start_date=").append(start_date);
        sb.append(", end_date=").append(end_date);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", activity_enable=").append(activity_enable);
        sb.append(", open_time=").append(open_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}