package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 体育 - 玩法等信息 (现在基本无用 无需优化等后续维护)
 * @TableName ge_zq_bet_tyep
 */
@TableName(value ="ge_zq_bet_tyep")
@Data
public class GeZqBetTyep implements Serializable {
    /**
     * 投注类型id
     */
    @TableId(value = "bet_type_id")
    private Object bet_type_id;

    /**
     * 具体比赛(某期比赛)
     */
    @TableField(value = "matches_detail_id")
    private Object matches_detail_id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "bet_type")
    private Object bet_type;

    /**
     * 
     */
    @TableField(value = "is_mix")
    private String is_mix;

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
        GeZqBetTyep other = (GeZqBetTyep) that;
        return (this.getBet_type_id() == null ? other.getBet_type_id() == null : this.getBet_type_id().equals(other.getBet_type_id()))
            && (this.getMatches_detail_id() == null ? other.getMatches_detail_id() == null : this.getMatches_detail_id().equals(other.getMatches_detail_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getBet_type() == null ? other.getBet_type() == null : this.getBet_type().equals(other.getBet_type()))
            && (this.getIs_mix() == null ? other.getIs_mix() == null : this.getIs_mix().equals(other.getIs_mix()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBet_type_id() == null) ? 0 : getBet_type_id().hashCode());
        result = prime * result + ((getMatches_detail_id() == null) ? 0 : getMatches_detail_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getBet_type() == null) ? 0 : getBet_type().hashCode());
        result = prime * result + ((getIs_mix() == null) ? 0 : getIs_mix().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bet_type_id=").append(bet_type_id);
        sb.append(", matches_detail_id=").append(matches_detail_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", bet_type=").append(bet_type);
        sb.append(", is_mix=").append(is_mix);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}