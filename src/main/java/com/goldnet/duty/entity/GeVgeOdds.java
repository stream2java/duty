package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 电子游艺 - 游戏 具体奖项中奖机率设置表
 * @TableName ge_vge_odds
 */
@TableName(value ="ge_vge_odds")
@Data
public class GeVgeOdds implements Serializable {
    /**
     * 
     */
    @TableId(value = "oid")
    private Object oid;

    /**
     * 被选中几率
     */
    @TableField(value = "ochoose_chance")
    private Object ochoose_chance;

    /**
     * 中奖几率
     */
    @TableField(value = "owin_chance")
    private BigDecimal owin_chance;

    /**
     * 拉霸机类型
     */
    @TableField(value = "olabar_type")
    private Object olabar_type;

    /**
     * 赔率
     */
    @TableField(value = "oodds")
    private Object oodds;

    /**
     * 牌组
     */
    @TableField(value = "ogroup")
    private String ogroup;

    /**
     * 父类id
     */
    @TableField(value = "opid")
    private Object opid;

    /**
     * 级别信息
     */
    @TableField(value = "oleve")
    private Object oleve;

    /**
     * 
     */
    @TableField(value = "oexodds")
    private Object oexodds;

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
        GeVgeOdds other = (GeVgeOdds) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getOchoose_chance() == null ? other.getOchoose_chance() == null : this.getOchoose_chance().equals(other.getOchoose_chance()))
            && (this.getOwin_chance() == null ? other.getOwin_chance() == null : this.getOwin_chance().equals(other.getOwin_chance()))
            && (this.getOlabar_type() == null ? other.getOlabar_type() == null : this.getOlabar_type().equals(other.getOlabar_type()))
            && (this.getOodds() == null ? other.getOodds() == null : this.getOodds().equals(other.getOodds()))
            && (this.getOgroup() == null ? other.getOgroup() == null : this.getOgroup().equals(other.getOgroup()))
            && (this.getOpid() == null ? other.getOpid() == null : this.getOpid().equals(other.getOpid()))
            && (this.getOleve() == null ? other.getOleve() == null : this.getOleve().equals(other.getOleve()))
            && (this.getOexodds() == null ? other.getOexodds() == null : this.getOexodds().equals(other.getOexodds()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOchoose_chance() == null) ? 0 : getOchoose_chance().hashCode());
        result = prime * result + ((getOwin_chance() == null) ? 0 : getOwin_chance().hashCode());
        result = prime * result + ((getOlabar_type() == null) ? 0 : getOlabar_type().hashCode());
        result = prime * result + ((getOodds() == null) ? 0 : getOodds().hashCode());
        result = prime * result + ((getOgroup() == null) ? 0 : getOgroup().hashCode());
        result = prime * result + ((getOpid() == null) ? 0 : getOpid().hashCode());
        result = prime * result + ((getOleve() == null) ? 0 : getOleve().hashCode());
        result = prime * result + ((getOexodds() == null) ? 0 : getOexodds().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", ochoose_chance=").append(ochoose_chance);
        sb.append(", owin_chance=").append(owin_chance);
        sb.append(", olabar_type=").append(olabar_type);
        sb.append(", oodds=").append(oodds);
        sb.append(", ogroup=").append(ogroup);
        sb.append(", opid=").append(opid);
        sb.append(", oleve=").append(oleve);
        sb.append(", oexodds=").append(oexodds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}