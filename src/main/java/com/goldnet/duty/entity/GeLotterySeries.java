package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 彩票ID与系列ID关系表
 * @TableName ge_lottery_series
 */
@TableName(value ="ge_lottery_series")
@Data
public class GeLotterySeries implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 彩票ID
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 系列ID
     */
    @TableField(value = "series_id")
    private Object series_id;

    /**
     * 彩票种类排序
     */
    @TableField(value = "lottery_order")
    private Object lottery_order;

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
        GeLotterySeries other = (GeLotterySeries) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getSeries_id() == null ? other.getSeries_id() == null : this.getSeries_id().equals(other.getSeries_id()))
            && (this.getLottery_order() == null ? other.getLottery_order() == null : this.getLottery_order().equals(other.getLottery_order()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getSeries_id() == null) ? 0 : getSeries_id().hashCode());
        result = prime * result + ((getLottery_order() == null) ? 0 : getLottery_order().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", series_id=").append(series_id);
        sb.append(", lottery_order=").append(lottery_order);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}