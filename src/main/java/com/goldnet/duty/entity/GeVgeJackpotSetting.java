package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 电子游艺-超级彩金-设置
 * @TableName ge_vge_jackpot_setting
 */
@TableName(value ="ge_vge_jackpot_setting")
@Data
public class GeVgeJackpotSetting implements Serializable {
    /**
     * 
     */
    @TableField(value = "jsid")
    private Object jsid;

    /**
     * 超级彩金-中奖机率
     */
    @TableField(value = "grand_chance")
    private BigDecimal grand_chance;

    /**
     * 中奖机率
     */
    @TableField(value = "major_chance")
    private BigDecimal major_chance;

    /**
     * 
     */
    @TableField(value = "minor_chance")
    private BigDecimal minor_chance;

    /**
     * 
     */
    @TableField(value = "mini_chance")
    private BigDecimal mini_chance;

    /**
     * 彩池累积比例
     */
    @TableField(value = "grand_ratio")
    private BigDecimal grand_ratio;

    /**
     * 
     */
    @TableField(value = "major_ratio")
    private BigDecimal major_ratio;

    /**
     * 
     */
    @TableField(value = "minor_ratio")
    private BigDecimal minor_ratio;

    /**
     * 
     */
    @TableField(value = "mini_ratio")
    private BigDecimal mini_ratio;

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
        GeVgeJackpotSetting other = (GeVgeJackpotSetting) that;
        return (this.getJsid() == null ? other.getJsid() == null : this.getJsid().equals(other.getJsid()))
            && (this.getGrand_chance() == null ? other.getGrand_chance() == null : this.getGrand_chance().equals(other.getGrand_chance()))
            && (this.getMajor_chance() == null ? other.getMajor_chance() == null : this.getMajor_chance().equals(other.getMajor_chance()))
            && (this.getMinor_chance() == null ? other.getMinor_chance() == null : this.getMinor_chance().equals(other.getMinor_chance()))
            && (this.getMini_chance() == null ? other.getMini_chance() == null : this.getMini_chance().equals(other.getMini_chance()))
            && (this.getGrand_ratio() == null ? other.getGrand_ratio() == null : this.getGrand_ratio().equals(other.getGrand_ratio()))
            && (this.getMajor_ratio() == null ? other.getMajor_ratio() == null : this.getMajor_ratio().equals(other.getMajor_ratio()))
            && (this.getMinor_ratio() == null ? other.getMinor_ratio() == null : this.getMinor_ratio().equals(other.getMinor_ratio()))
            && (this.getMini_ratio() == null ? other.getMini_ratio() == null : this.getMini_ratio().equals(other.getMini_ratio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJsid() == null) ? 0 : getJsid().hashCode());
        result = prime * result + ((getGrand_chance() == null) ? 0 : getGrand_chance().hashCode());
        result = prime * result + ((getMajor_chance() == null) ? 0 : getMajor_chance().hashCode());
        result = prime * result + ((getMinor_chance() == null) ? 0 : getMinor_chance().hashCode());
        result = prime * result + ((getMini_chance() == null) ? 0 : getMini_chance().hashCode());
        result = prime * result + ((getGrand_ratio() == null) ? 0 : getGrand_ratio().hashCode());
        result = prime * result + ((getMajor_ratio() == null) ? 0 : getMajor_ratio().hashCode());
        result = prime * result + ((getMinor_ratio() == null) ? 0 : getMinor_ratio().hashCode());
        result = prime * result + ((getMini_ratio() == null) ? 0 : getMini_ratio().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jsid=").append(jsid);
        sb.append(", grand_chance=").append(grand_chance);
        sb.append(", major_chance=").append(major_chance);
        sb.append(", minor_chance=").append(minor_chance);
        sb.append(", mini_chance=").append(mini_chance);
        sb.append(", grand_ratio=").append(grand_ratio);
        sb.append(", major_ratio=").append(major_ratio);
        sb.append(", minor_ratio=").append(minor_ratio);
        sb.append(", mini_ratio=").append(mini_ratio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}