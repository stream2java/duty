package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 手续费设定表
 * @TableName mny_handlingcharge_setting
 */
@TableName(value ="mny_handlingcharge_setting")
@Data
public class MnyHandlingchargeSetting implements Serializable {
    /**
     * 手续费设定表的id
     */
    @TableId(value = "handlingcharge_id")
    private Object handlingcharge_id;

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
     * 入款手续费的设定
     */
    @TableField(value = "deposit_handlingcharge_setting")
    private BigDecimal deposit_handlingcharge_setting;

    /**
     * 入款手续费上限
     */
    @TableField(value = "max_deposit_handlingcharge")
    private BigDecimal max_deposit_handlingcharge;

    /**
     * 出款手续费的设定
     */
    @TableField(value = "draw_handlingcharge_setting")
    private BigDecimal draw_handlingcharge_setting;

    /**
     * 出款手续费上限
     */
    @TableField(value = "max_draw_handlingcharge")
    private BigDecimal max_draw_handlingcharge;

    /**
     * 生效日期
     */
    @TableField(value = "effective_time")
    private LocalDateTime effective_time;

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
        MnyHandlingchargeSetting other = (MnyHandlingchargeSetting) that;
        return (this.getHandlingcharge_id() == null ? other.getHandlingcharge_id() == null : this.getHandlingcharge_id().equals(other.getHandlingcharge_id()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getDeposit_handlingcharge_setting() == null ? other.getDeposit_handlingcharge_setting() == null : this.getDeposit_handlingcharge_setting().equals(other.getDeposit_handlingcharge_setting()))
            && (this.getMax_deposit_handlingcharge() == null ? other.getMax_deposit_handlingcharge() == null : this.getMax_deposit_handlingcharge().equals(other.getMax_deposit_handlingcharge()))
            && (this.getDraw_handlingcharge_setting() == null ? other.getDraw_handlingcharge_setting() == null : this.getDraw_handlingcharge_setting().equals(other.getDraw_handlingcharge_setting()))
            && (this.getMax_draw_handlingcharge() == null ? other.getMax_draw_handlingcharge() == null : this.getMax_draw_handlingcharge().equals(other.getMax_draw_handlingcharge()))
            && (this.getEffective_time() == null ? other.getEffective_time() == null : this.getEffective_time().equals(other.getEffective_time()))
            && (this.getFounder() == null ? other.getFounder() == null : this.getFounder().equals(other.getFounder()))
            && (this.getFoundtime() == null ? other.getFoundtime() == null : this.getFoundtime().equals(other.getFoundtime()))
            && (this.getModer() == null ? other.getModer() == null : this.getModer().equals(other.getModer()))
            && (this.getModtime() == null ? other.getModtime() == null : this.getModtime().equals(other.getModtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHandlingcharge_id() == null) ? 0 : getHandlingcharge_id().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getDeposit_handlingcharge_setting() == null) ? 0 : getDeposit_handlingcharge_setting().hashCode());
        result = prime * result + ((getMax_deposit_handlingcharge() == null) ? 0 : getMax_deposit_handlingcharge().hashCode());
        result = prime * result + ((getDraw_handlingcharge_setting() == null) ? 0 : getDraw_handlingcharge_setting().hashCode());
        result = prime * result + ((getMax_draw_handlingcharge() == null) ? 0 : getMax_draw_handlingcharge().hashCode());
        result = prime * result + ((getEffective_time() == null) ? 0 : getEffective_time().hashCode());
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
        sb.append(", handlingcharge_id=").append(handlingcharge_id);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", deposit_handlingcharge_setting=").append(deposit_handlingcharge_setting);
        sb.append(", max_deposit_handlingcharge=").append(max_deposit_handlingcharge);
        sb.append(", draw_handlingcharge_setting=").append(draw_handlingcharge_setting);
        sb.append(", max_draw_handlingcharge=").append(max_draw_handlingcharge);
        sb.append(", effective_time=").append(effective_time);
        sb.append(", founder=").append(founder);
        sb.append(", foundtime=").append(foundtime);
        sb.append(", moder=").append(moder);
        sb.append(", modtime=").append(modtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}