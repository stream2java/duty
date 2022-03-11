package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 拉霸机分组表
 * @TableName ge_vge_slot_group
 */
@TableName(value ="ge_vge_slot_group")
@Data
public class GeVgeSlotGroup implements Serializable {
    /**
     * 主键 必须有一条gid为1的基础数据 
     */
    @TableId(value = "gid")
    private Object gid;

    /**
     * 分组名称
     */
    @TableField(value = "group_name")
    private String group_name;

    /**
     * 分组类型
     */
    @TableField(value = "group_type")
    private Object group_type;

    /**
     * 中奖机率组
     */
    @TableField(value = "chance_group")
    private String chance_group;

    /**
     * 当前使用的中奖机率组
     */
    @TableField(value = "chance_group_num")
    private Object chance_group_num;

    /**
     * 剩多少投注额跳动到下一个机率
     */
    @TableField(value = "chance_group_pot")
    private BigDecimal chance_group_pot;

    /**
     * 投注量
     */
    @TableField(value = "pot")
    private BigDecimal pot;

    /**
     * 已排出额度
     */
    @TableField(value = "pot_payout")
    private BigDecimal pot_payout;

    /**
     * 彩池补偿
     */
    @TableField(value = "pot_make")
    private BigDecimal pot_make;

    /**
     * 损益比
     */
    @TableField(value = "profit")
    private BigDecimal profit;

    /**
     * 乐观锁版本控制
     */
    @TableField(value = "versions")
    private Object versions;

    /**
     * 分组中奖机率 在chance_group 为空时使用
     */
    @TableField(value = "group_chance")
    private BigDecimal group_chance;

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
        GeVgeSlotGroup other = (GeVgeSlotGroup) that;
        return (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getGroup_name() == null ? other.getGroup_name() == null : this.getGroup_name().equals(other.getGroup_name()))
            && (this.getGroup_type() == null ? other.getGroup_type() == null : this.getGroup_type().equals(other.getGroup_type()))
            && (this.getChance_group() == null ? other.getChance_group() == null : this.getChance_group().equals(other.getChance_group()))
            && (this.getChance_group_num() == null ? other.getChance_group_num() == null : this.getChance_group_num().equals(other.getChance_group_num()))
            && (this.getChance_group_pot() == null ? other.getChance_group_pot() == null : this.getChance_group_pot().equals(other.getChance_group_pot()))
            && (this.getPot() == null ? other.getPot() == null : this.getPot().equals(other.getPot()))
            && (this.getPot_payout() == null ? other.getPot_payout() == null : this.getPot_payout().equals(other.getPot_payout()))
            && (this.getPot_make() == null ? other.getPot_make() == null : this.getPot_make().equals(other.getPot_make()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getVersions() == null ? other.getVersions() == null : this.getVersions().equals(other.getVersions()))
            && (this.getGroup_chance() == null ? other.getGroup_chance() == null : this.getGroup_chance().equals(other.getGroup_chance()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getGroup_name() == null) ? 0 : getGroup_name().hashCode());
        result = prime * result + ((getGroup_type() == null) ? 0 : getGroup_type().hashCode());
        result = prime * result + ((getChance_group() == null) ? 0 : getChance_group().hashCode());
        result = prime * result + ((getChance_group_num() == null) ? 0 : getChance_group_num().hashCode());
        result = prime * result + ((getChance_group_pot() == null) ? 0 : getChance_group_pot().hashCode());
        result = prime * result + ((getPot() == null) ? 0 : getPot().hashCode());
        result = prime * result + ((getPot_payout() == null) ? 0 : getPot_payout().hashCode());
        result = prime * result + ((getPot_make() == null) ? 0 : getPot_make().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getVersions() == null) ? 0 : getVersions().hashCode());
        result = prime * result + ((getGroup_chance() == null) ? 0 : getGroup_chance().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gid=").append(gid);
        sb.append(", group_name=").append(group_name);
        sb.append(", group_type=").append(group_type);
        sb.append(", chance_group=").append(chance_group);
        sb.append(", chance_group_num=").append(chance_group_num);
        sb.append(", chance_group_pot=").append(chance_group_pot);
        sb.append(", pot=").append(pot);
        sb.append(", pot_payout=").append(pot_payout);
        sb.append(", pot_make=").append(pot_make);
        sb.append(", profit=").append(profit);
        sb.append(", versions=").append(versions);
        sb.append(", group_chance=").append(group_chance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}