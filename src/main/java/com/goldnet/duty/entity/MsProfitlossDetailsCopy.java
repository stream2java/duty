package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName ms_profitloss_details_copy
 */
@TableName(value ="ms_profitloss_details_copy")
@Data
public class MsProfitlossDetailsCopy implements Serializable {
    /**
     * 
     */
    @TableField(value = "profitloss_details_id")
    private Object profitloss_details_id;

    /**
     * 
     */
    @TableField(value = "archive_details_id")
    private Object archive_details_id;

    /**
     * 
     */
    @TableField(value = "game_name")
    private String game_name;

    /**
     * 
     */
    @TableField(value = "profit_loss")
    private BigDecimal profit_loss;

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
        MsProfitlossDetailsCopy other = (MsProfitlossDetailsCopy) that;
        return (this.getProfitloss_details_id() == null ? other.getProfitloss_details_id() == null : this.getProfitloss_details_id().equals(other.getProfitloss_details_id()))
            && (this.getArchive_details_id() == null ? other.getArchive_details_id() == null : this.getArchive_details_id().equals(other.getArchive_details_id()))
            && (this.getGame_name() == null ? other.getGame_name() == null : this.getGame_name().equals(other.getGame_name()))
            && (this.getProfit_loss() == null ? other.getProfit_loss() == null : this.getProfit_loss().equals(other.getProfit_loss()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProfitloss_details_id() == null) ? 0 : getProfitloss_details_id().hashCode());
        result = prime * result + ((getArchive_details_id() == null) ? 0 : getArchive_details_id().hashCode());
        result = prime * result + ((getGame_name() == null) ? 0 : getGame_name().hashCode());
        result = prime * result + ((getProfit_loss() == null) ? 0 : getProfit_loss().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", profitloss_details_id=").append(profitloss_details_id);
        sb.append(", archive_details_id=").append(archive_details_id);
        sb.append(", game_name=").append(game_name);
        sb.append(", profit_loss=").append(profit_loss);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}