package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 退佣明细表
 * @TableName tps_rebate_item
 */
@TableName(value ="tps_rebate_item")
@Data
public class TpsRebateItem implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 代理id
     */
    @TableField(value = "agent_id")
    private Object agent_id;

    /**
     * 期数id
     */
    @TableField(value = "periods_id")
    private Object periods_id;

    /**
     * 退佣百分比，如果取值30，计算值为30%,来自设定表
     */
    @TableField(value = "rebate")
    private BigDecimal rebate;

    /**
     * 退水百分比，如果取值20，计算值为20%, 来自设定表
     */
    @TableField(value = "pre")
    private BigDecimal pre;

    /**
     * 前期累积派彩
     */
    @TableField(value = "payout_previous")
    private BigDecimal payout_previous;

    /**
     * 当期派彩
     */
    @TableField(value = "payout_current")
    private BigDecimal payout_current;

    /**
     * 前期累积有效投注
     */
    @TableField(value = "valid_bet_previous")
    private BigDecimal valid_bet_previous;

    /**
     * 当期有效投注
     */
    @TableField(value = "valid_bet_current")
    private BigDecimal valid_bet_current;

    /**
     * 平台大类，来自tps_platform表code字段，如OG,AG
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 平台游戏小类，如AGSX, BGBY，需引用平台+tps_game_type的type_code
     */
    @TableField(value = "platform_game_code")
    private String platform_game_code;

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
        TpsRebateItem other = (TpsRebateItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getPeriods_id() == null ? other.getPeriods_id() == null : this.getPeriods_id().equals(other.getPeriods_id()))
            && (this.getRebate() == null ? other.getRebate() == null : this.getRebate().equals(other.getRebate()))
            && (this.getPre() == null ? other.getPre() == null : this.getPre().equals(other.getPre()))
            && (this.getPayout_previous() == null ? other.getPayout_previous() == null : this.getPayout_previous().equals(other.getPayout_previous()))
            && (this.getPayout_current() == null ? other.getPayout_current() == null : this.getPayout_current().equals(other.getPayout_current()))
            && (this.getValid_bet_previous() == null ? other.getValid_bet_previous() == null : this.getValid_bet_previous().equals(other.getValid_bet_previous()))
            && (this.getValid_bet_current() == null ? other.getValid_bet_current() == null : this.getValid_bet_current().equals(other.getValid_bet_current()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getPlatform_game_code() == null ? other.getPlatform_game_code() == null : this.getPlatform_game_code().equals(other.getPlatform_game_code()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getPeriods_id() == null) ? 0 : getPeriods_id().hashCode());
        result = prime * result + ((getRebate() == null) ? 0 : getRebate().hashCode());
        result = prime * result + ((getPre() == null) ? 0 : getPre().hashCode());
        result = prime * result + ((getPayout_previous() == null) ? 0 : getPayout_previous().hashCode());
        result = prime * result + ((getPayout_current() == null) ? 0 : getPayout_current().hashCode());
        result = prime * result + ((getValid_bet_previous() == null) ? 0 : getValid_bet_previous().hashCode());
        result = prime * result + ((getValid_bet_current() == null) ? 0 : getValid_bet_current().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getPlatform_game_code() == null) ? 0 : getPlatform_game_code().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", agent_id=").append(agent_id);
        sb.append(", periods_id=").append(periods_id);
        sb.append(", rebate=").append(rebate);
        sb.append(", pre=").append(pre);
        sb.append(", payout_previous=").append(payout_previous);
        sb.append(", payout_current=").append(payout_current);
        sb.append(", valid_bet_previous=").append(valid_bet_previous);
        sb.append(", valid_bet_current=").append(valid_bet_current);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", platform_game_code=").append(platform_game_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}