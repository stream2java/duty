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
 * @TableName tps_event_details_20210727
 */
@TableName(value ="tps_event_details_20210727")
@Data
public class TpsEventDetails20210727 implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "platform")
    private String platform;

    /**
     * 
     */
    @TableField(value = "game_code")
    private String game_code;

    /**
     * 
     */
    @TableField(value = "bet_total")
    private BigDecimal bet_total;

    /**
     * 
     */
    @TableField(value = "pre")
    private BigDecimal pre;

    /**
     * 
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 
     */
    @TableField(value = "event_uuid")
    private String event_uuid;

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
        TpsEventDetails20210727 other = (TpsEventDetails20210727) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getGame_code() == null ? other.getGame_code() == null : this.getGame_code().equals(other.getGame_code()))
            && (this.getBet_total() == null ? other.getBet_total() == null : this.getBet_total().equals(other.getBet_total()))
            && (this.getPre() == null ? other.getPre() == null : this.getPre().equals(other.getPre()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getEvent_uuid() == null ? other.getEvent_uuid() == null : this.getEvent_uuid().equals(other.getEvent_uuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getGame_code() == null) ? 0 : getGame_code().hashCode());
        result = prime * result + ((getBet_total() == null) ? 0 : getBet_total().hashCode());
        result = prime * result + ((getPre() == null) ? 0 : getPre().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getEvent_uuid() == null) ? 0 : getEvent_uuid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platform=").append(platform);
        sb.append(", game_code=").append(game_code);
        sb.append(", bet_total=").append(bet_total);
        sb.append(", pre=").append(pre);
        sb.append(", member_id=").append(member_id);
        sb.append(", event_uuid=").append(event_uuid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}