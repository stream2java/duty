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
 * @TableName tps_back_pre_set
 */
@TableName(value ="tps_back_pre_set")
@Data
public class TpsBackPreSet implements Serializable {
    /**
     * 第三方返水优惠设定ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 返水设定ID
     */
    @TableField(value = "mny_backpre_id")
    private Object mny_backpre_id;

    /**
     * 平台ID
     */
    @TableField(value = "platform_id")
    private Object platform_id;

    /**
     * 平台游戏类型
     */
    @TableField(value = "game_type")
    private Object game_type;

    /**
     * 优惠
     */
    @TableField(value = "pre_per")
    private BigDecimal pre_per;

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
        TpsBackPreSet other = (TpsBackPreSet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMny_backpre_id() == null ? other.getMny_backpre_id() == null : this.getMny_backpre_id().equals(other.getMny_backpre_id()))
            && (this.getPlatform_id() == null ? other.getPlatform_id() == null : this.getPlatform_id().equals(other.getPlatform_id()))
            && (this.getGame_type() == null ? other.getGame_type() == null : this.getGame_type().equals(other.getGame_type()))
            && (this.getPre_per() == null ? other.getPre_per() == null : this.getPre_per().equals(other.getPre_per()))
            && (this.getPlat_game_code() == null ? other.getPlat_game_code() == null : this.getPlat_game_code().equals(other.getPlat_game_code()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMny_backpre_id() == null) ? 0 : getMny_backpre_id().hashCode());
        result = prime * result + ((getPlatform_id() == null) ? 0 : getPlatform_id().hashCode());
        result = prime * result + ((getGame_type() == null) ? 0 : getGame_type().hashCode());
        result = prime * result + ((getPre_per() == null) ? 0 : getPre_per().hashCode());
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
        sb.append(", mny_backpre_id=").append(mny_backpre_id);
        sb.append(", platform_id=").append(platform_id);
        sb.append(", game_type=").append(game_type);
        sb.append(", pre_per=").append(pre_per);
        sb.append(", plat_game_code=").append(plat_game_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}