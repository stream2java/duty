package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 稽核表，保存第三方相关的稽核数据
 * @TableName tps_check_16
 */
@TableName(value ="tps_check_16")
@Data
public class TpsCheck16 implements Serializable {
    /**
     * id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 稽核mny_check表id
     */
    @TableField(value = "check_id")
    private Object check_id;

    /**
     * 会员id
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 第三方游戏平台大类code，如ag, og, bg
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 第三方游戏平台大类+小类code，如agby, ogsx
     */
    @TableField(value = "platform_game_type")
    private String platform_game_type;

    /**
     * 实际有效打码量
     */
    @TableField(value = "valid_bet")
    private BigDecimal valid_bet;

    /**
     * 打码量控制：0-稽核时打码量不加或为0,1-稽核时打码量为真实打码量
     */
    @TableField(value = "bet_status")
    private Object bet_status;

    /**
     * 稽核状态
     */
    @TableField(value = "check_status")
    private Object check_status;

    /**
     * 稽核倍数
     */
    @TableField(value = "check_num")
    private Object check_num;

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
        TpsCheck16 other = (TpsCheck16) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCheck_id() == null ? other.getCheck_id() == null : this.getCheck_id().equals(other.getCheck_id()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getPlatform_game_type() == null ? other.getPlatform_game_type() == null : this.getPlatform_game_type().equals(other.getPlatform_game_type()))
            && (this.getValid_bet() == null ? other.getValid_bet() == null : this.getValid_bet().equals(other.getValid_bet()))
            && (this.getBet_status() == null ? other.getBet_status() == null : this.getBet_status().equals(other.getBet_status()))
            && (this.getCheck_status() == null ? other.getCheck_status() == null : this.getCheck_status().equals(other.getCheck_status()))
            && (this.getCheck_num() == null ? other.getCheck_num() == null : this.getCheck_num().equals(other.getCheck_num()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCheck_id() == null) ? 0 : getCheck_id().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getPlatform_game_type() == null) ? 0 : getPlatform_game_type().hashCode());
        result = prime * result + ((getValid_bet() == null) ? 0 : getValid_bet().hashCode());
        result = prime * result + ((getBet_status() == null) ? 0 : getBet_status().hashCode());
        result = prime * result + ((getCheck_status() == null) ? 0 : getCheck_status().hashCode());
        result = prime * result + ((getCheck_num() == null) ? 0 : getCheck_num().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", check_id=").append(check_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", platform_game_type=").append(platform_game_type);
        sb.append(", valid_bet=").append(valid_bet);
        sb.append(", bet_status=").append(bet_status);
        sb.append(", check_status=").append(check_status);
        sb.append(", check_num=").append(check_num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}