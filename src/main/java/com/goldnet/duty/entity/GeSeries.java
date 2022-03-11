package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 系列表
 * @TableName ge_series
 */
@TableName(value ="ge_series")
@Data
public class GeSeries implements Serializable {
    /**
     * 系列ID
     */
    @TableField(value = "series_id")
    private Object series_id;

    /**
     * 彩票系列对应的默认彩种ID(例如传统彩下的时时彩对应的默认彩票ID是重庆时时彩的ID)
     */
    @TableField(value = "default_lottery_id")
    private Object default_lottery_id;

    /**
     * 系列名称
     */
    @TableField(value = "series_name")
    private String series_name;

    /**
     * 彩种类型 0-传统彩， 1-自营彩
     */
    @TableField(value = "type")
    private Object type;

    /**
     * 系列排序
     */
    @TableField(value = "series_order")
    private Object series_order;

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
        GeSeries other = (GeSeries) that;
        return (this.getSeries_id() == null ? other.getSeries_id() == null : this.getSeries_id().equals(other.getSeries_id()))
            && (this.getDefault_lottery_id() == null ? other.getDefault_lottery_id() == null : this.getDefault_lottery_id().equals(other.getDefault_lottery_id()))
            && (this.getSeries_name() == null ? other.getSeries_name() == null : this.getSeries_name().equals(other.getSeries_name()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSeries_order() == null ? other.getSeries_order() == null : this.getSeries_order().equals(other.getSeries_order()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeries_id() == null) ? 0 : getSeries_id().hashCode());
        result = prime * result + ((getDefault_lottery_id() == null) ? 0 : getDefault_lottery_id().hashCode());
        result = prime * result + ((getSeries_name() == null) ? 0 : getSeries_name().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSeries_order() == null) ? 0 : getSeries_order().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", series_id=").append(series_id);
        sb.append(", default_lottery_id=").append(default_lottery_id);
        sb.append(", series_name=").append(series_name);
        sb.append(", type=").append(type);
        sb.append(", series_order=").append(series_order);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}