package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 期数管理表
 * @TableName mny_periods
 */
@TableName(value ="mny_periods")
@Data
public class MnyPeriods implements Serializable {
    /**
     * 期数表主键
     */
    @TableId(value = "periods_id")
    private Object periods_id;

    /**
     * 币别id
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 期数名称
     */
    @TableField(value = "periods_name")
    private String periods_name;

    /**
     * 开始时间
     */
    @TableField(value = "periods_begintime")
    private LocalDateTime periods_begintime;

    /**
     * 结束时间
     */
    @TableField(value = "periods_endtime")
    private LocalDateTime periods_endtime;

    /**
     * 创建人
     */
    @TableField(value = "founder")
    private String founder;

    /**
     * 创建时间
     */
    @TableField(value = "foundtime")
    private LocalDateTime foundtime;

    /**
     * 修改人
     */
    @TableField(value = "moder")
    private String moder;

    /**
     * 修改时间
     */
    @TableField(value = "modtime")
    private LocalDateTime modtime;

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
        MnyPeriods other = (MnyPeriods) that;
        return (this.getPeriods_id() == null ? other.getPeriods_id() == null : this.getPeriods_id().equals(other.getPeriods_id()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getPeriods_name() == null ? other.getPeriods_name() == null : this.getPeriods_name().equals(other.getPeriods_name()))
            && (this.getPeriods_begintime() == null ? other.getPeriods_begintime() == null : this.getPeriods_begintime().equals(other.getPeriods_begintime()))
            && (this.getPeriods_endtime() == null ? other.getPeriods_endtime() == null : this.getPeriods_endtime().equals(other.getPeriods_endtime()))
            && (this.getFounder() == null ? other.getFounder() == null : this.getFounder().equals(other.getFounder()))
            && (this.getFoundtime() == null ? other.getFoundtime() == null : this.getFoundtime().equals(other.getFoundtime()))
            && (this.getModer() == null ? other.getModer() == null : this.getModer().equals(other.getModer()))
            && (this.getModtime() == null ? other.getModtime() == null : this.getModtime().equals(other.getModtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPeriods_id() == null) ? 0 : getPeriods_id().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getPeriods_name() == null) ? 0 : getPeriods_name().hashCode());
        result = prime * result + ((getPeriods_begintime() == null) ? 0 : getPeriods_begintime().hashCode());
        result = prime * result + ((getPeriods_endtime() == null) ? 0 : getPeriods_endtime().hashCode());
        result = prime * result + ((getFounder() == null) ? 0 : getFounder().hashCode());
        result = prime * result + ((getFoundtime() == null) ? 0 : getFoundtime().hashCode());
        result = prime * result + ((getModer() == null) ? 0 : getModer().hashCode());
        result = prime * result + ((getModtime() == null) ? 0 : getModtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", periods_id=").append(periods_id);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", periods_name=").append(periods_name);
        sb.append(", periods_begintime=").append(periods_begintime);
        sb.append(", periods_endtime=").append(periods_endtime);
        sb.append(", founder=").append(founder);
        sb.append(", foundtime=").append(foundtime);
        sb.append(", moder=").append(moder);
        sb.append(", modtime=").append(modtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}