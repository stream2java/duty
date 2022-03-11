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
 * 期数表
 * @TableName ms_period
 */
@TableName(value ="ms_period")
@Data
public class MsPeriod implements Serializable {
    /**
     * ID
     */
    @TableId(value = "period_id")
    private Object period_id;

    /**
     * 期数名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 期数起点
     */
    @TableField(value = "begin_date")
    private LocalDate begin_date;

    /**
     * 期数结束
     */
    @TableField(value = "end_date")
    private LocalDate end_date;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_datetime")
    private LocalDateTime create_datetime;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_datetime")
    private LocalDateTime update_datetime;

    /**
     * 是否已经归档（0：未归档，1：已归档）
     */
    @TableField(value = "is_archive")
    private String is_archive;

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
        MsPeriod other = (MsPeriod) that;
        return (this.getPeriod_id() == null ? other.getPeriod_id() == null : this.getPeriod_id().equals(other.getPeriod_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBegin_date() == null ? other.getBegin_date() == null : this.getBegin_date().equals(other.getBegin_date()))
            && (this.getEnd_date() == null ? other.getEnd_date() == null : this.getEnd_date().equals(other.getEnd_date()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_datetime() == null ? other.getCreate_datetime() == null : this.getCreate_datetime().equals(other.getCreate_datetime()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_datetime() == null ? other.getUpdate_datetime() == null : this.getUpdate_datetime().equals(other.getUpdate_datetime()))
            && (this.getIs_archive() == null ? other.getIs_archive() == null : this.getIs_archive().equals(other.getIs_archive()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPeriod_id() == null) ? 0 : getPeriod_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBegin_date() == null) ? 0 : getBegin_date().hashCode());
        result = prime * result + ((getEnd_date() == null) ? 0 : getEnd_date().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_datetime() == null) ? 0 : getCreate_datetime().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_datetime() == null) ? 0 : getUpdate_datetime().hashCode());
        result = prime * result + ((getIs_archive() == null) ? 0 : getIs_archive().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", period_id=").append(period_id);
        sb.append(", name=").append(name);
        sb.append(", begin_date=").append(begin_date);
        sb.append(", end_date=").append(end_date);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_datetime=").append(create_datetime);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_datetime=").append(update_datetime);
        sb.append(", is_archive=").append(is_archive);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}