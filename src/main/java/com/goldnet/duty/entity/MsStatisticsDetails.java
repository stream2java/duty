package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 统计详情表
 * @TableName ms_statistics_details
 */
@TableName(value ="ms_statistics_details")
@Data
public class MsStatisticsDetails implements Serializable {
    /**
     * ID
     */
    @TableId(value = "archive_details_id")
    private Object archive_details_id;

    /**
     * 存档表ID
     */
    @TableField(value = "ms_archive_id")
    private Object ms_archive_id;

    /**
     * 平台名称
     */
    @TableField(value = "game_name")
    private String game_name;

    /**
     * 币别
     */
    @TableField(value = "currency")
    private String currency;

    /**
     * 派彩
     */
    @TableField(value = "profit_loss")
    private BigDecimal profit_loss;

    /**
     * 实际应收
     */
    @TableField(value = "receivables")
    private BigDecimal receivables;

    /**
     * 第一个条件
     */
    @TableField(value = "first_ratio")
    private BigDecimal first_ratio;

    /**
     * 0：没合并，1：合并，2：BB机率和PT，3：Jackpot
     */
    @TableField(value = "state")
    private String state;

    /**
     * 添加类型(0：自动，1：手动)
     */
    @TableField(value = "type")
    private String type;

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
        MsStatisticsDetails other = (MsStatisticsDetails) that;
        return (this.getArchive_details_id() == null ? other.getArchive_details_id() == null : this.getArchive_details_id().equals(other.getArchive_details_id()))
            && (this.getMs_archive_id() == null ? other.getMs_archive_id() == null : this.getMs_archive_id().equals(other.getMs_archive_id()))
            && (this.getGame_name() == null ? other.getGame_name() == null : this.getGame_name().equals(other.getGame_name()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getProfit_loss() == null ? other.getProfit_loss() == null : this.getProfit_loss().equals(other.getProfit_loss()))
            && (this.getReceivables() == null ? other.getReceivables() == null : this.getReceivables().equals(other.getReceivables()))
            && (this.getFirst_ratio() == null ? other.getFirst_ratio() == null : this.getFirst_ratio().equals(other.getFirst_ratio()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArchive_details_id() == null) ? 0 : getArchive_details_id().hashCode());
        result = prime * result + ((getMs_archive_id() == null) ? 0 : getMs_archive_id().hashCode());
        result = prime * result + ((getGame_name() == null) ? 0 : getGame_name().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getProfit_loss() == null) ? 0 : getProfit_loss().hashCode());
        result = prime * result + ((getReceivables() == null) ? 0 : getReceivables().hashCode());
        result = prime * result + ((getFirst_ratio() == null) ? 0 : getFirst_ratio().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", archive_details_id=").append(archive_details_id);
        sb.append(", ms_archive_id=").append(ms_archive_id);
        sb.append(", game_name=").append(game_name);
        sb.append(", currency=").append(currency);
        sb.append(", profit_loss=").append(profit_loss);
        sb.append(", receivables=").append(receivables);
        sb.append(", first_ratio=").append(first_ratio);
        sb.append(", state=").append(state);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}