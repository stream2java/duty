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
 * @TableName tps_agent_brokerage
 */
@TableName(value ="tps_agent_brokerage")
@Data
public class TpsAgentBrokerage implements Serializable {
    /**
     * 代理ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 代理佣金设定主表id
     */
    @TableField(value = "brokerage_id")
    private Object brokerage_id;

    /**
     * 第三方平台ID
     */
    @TableField(value = "platform_id")
    private Object platform_id;

    /**
     * 平台游戏类型
     */
    @TableField(value = "game_type")
    private Object game_type;

    /**
     * 退佣比例
     */
    @TableField(value = "rebate")
    private BigDecimal rebate;

    /**
     * 返水比例
     */
    @TableField(value = "waterbreak")
    private BigDecimal waterbreak;

    /**
     * 平台及游戏类型，例：BBJL
     */
    @TableField(value = "plat_game_code")
    private String plat_game_code;

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
        TpsAgentBrokerage other = (TpsAgentBrokerage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrokerage_id() == null ? other.getBrokerage_id() == null : this.getBrokerage_id().equals(other.getBrokerage_id()))
            && (this.getPlatform_id() == null ? other.getPlatform_id() == null : this.getPlatform_id().equals(other.getPlatform_id()))
            && (this.getGame_type() == null ? other.getGame_type() == null : this.getGame_type().equals(other.getGame_type()))
            && (this.getRebate() == null ? other.getRebate() == null : this.getRebate().equals(other.getRebate()))
            && (this.getWaterbreak() == null ? other.getWaterbreak() == null : this.getWaterbreak().equals(other.getWaterbreak()))
            && (this.getPlat_game_code() == null ? other.getPlat_game_code() == null : this.getPlat_game_code().equals(other.getPlat_game_code()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrokerage_id() == null) ? 0 : getBrokerage_id().hashCode());
        result = prime * result + ((getPlatform_id() == null) ? 0 : getPlatform_id().hashCode());
        result = prime * result + ((getGame_type() == null) ? 0 : getGame_type().hashCode());
        result = prime * result + ((getRebate() == null) ? 0 : getRebate().hashCode());
        result = prime * result + ((getWaterbreak() == null) ? 0 : getWaterbreak().hashCode());
        result = prime * result + ((getPlat_game_code() == null) ? 0 : getPlat_game_code().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brokerage_id=").append(brokerage_id);
        sb.append(", platform_id=").append(platform_id);
        sb.append(", game_type=").append(game_type);
        sb.append(", rebate=").append(rebate);
        sb.append(", waterbreak=").append(waterbreak);
        sb.append(", plat_game_code=").append(plat_game_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}