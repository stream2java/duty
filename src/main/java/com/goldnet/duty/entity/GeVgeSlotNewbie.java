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
 * @TableName ge_vge_slot_newbie
 */
@TableName(value ="ge_vge_slot_newbie")
@Data
public class GeVgeSlotNewbie implements Serializable {
    /**
     * 
     */
    @TableField(value = "nid")
    private Object nid;

    /**
     * 
     */
    @TableField(value = "newbie_name")
    private String newbie_name;

    /**
     * 
     */
    @TableField(value = "newbie_type")
    private String newbie_type;

    /**
     * 
     */
    @TableField(value = "chance_group")
    private String chance_group;

    /**
     * 
     */
    @TableField(value = "chance_group_num")
    private Object chance_group_num;

    /**
     * 
     */
    @TableField(value = "chance_group_pot")
    private BigDecimal chance_group_pot;

    /**
     * 
     */
    @TableField(value = "pot")
    private BigDecimal pot;

    /**
     * 
     */
    @TableField(value = "pot_payout")
    private BigDecimal pot_payout;

    /**
     * 
     */
    @TableField(value = "pot_make")
    private BigDecimal pot_make;

    /**
     * 
     */
    @TableField(value = "profit")
    private BigDecimal profit;

    /**
     * 
     */
    @TableField(value = "newbie_chance")
    private BigDecimal newbie_chance;

    /**
     * 
     */
    @TableField(value = "choose")
    private String choose;

    /**
     * 
     */
    @TableField(value = "bet_num_choose")
    private String bet_num_choose;

    /**
     * 
     */
    @TableField(value = "bet_num")
    private Object bet_num;

    /**
     * 
     */
    @TableField(value = "money_num_choose")
    private String money_num_choose;

    /**
     * 
     */
    @TableField(value = "money_num")
    private BigDecimal money_num;

    /**
     * 
     */
    @TableField(value = "date_num_choose")
    private String date_num_choose;

    /**
     * 
     */
    @TableField(value = "date_num")
    private Object date_num;

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
        GeVgeSlotNewbie other = (GeVgeSlotNewbie) that;
        return (this.getNid() == null ? other.getNid() == null : this.getNid().equals(other.getNid()))
            && (this.getNewbie_name() == null ? other.getNewbie_name() == null : this.getNewbie_name().equals(other.getNewbie_name()))
            && (this.getNewbie_type() == null ? other.getNewbie_type() == null : this.getNewbie_type().equals(other.getNewbie_type()))
            && (this.getChance_group() == null ? other.getChance_group() == null : this.getChance_group().equals(other.getChance_group()))
            && (this.getChance_group_num() == null ? other.getChance_group_num() == null : this.getChance_group_num().equals(other.getChance_group_num()))
            && (this.getChance_group_pot() == null ? other.getChance_group_pot() == null : this.getChance_group_pot().equals(other.getChance_group_pot()))
            && (this.getPot() == null ? other.getPot() == null : this.getPot().equals(other.getPot()))
            && (this.getPot_payout() == null ? other.getPot_payout() == null : this.getPot_payout().equals(other.getPot_payout()))
            && (this.getPot_make() == null ? other.getPot_make() == null : this.getPot_make().equals(other.getPot_make()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getNewbie_chance() == null ? other.getNewbie_chance() == null : this.getNewbie_chance().equals(other.getNewbie_chance()))
            && (this.getChoose() == null ? other.getChoose() == null : this.getChoose().equals(other.getChoose()))
            && (this.getBet_num_choose() == null ? other.getBet_num_choose() == null : this.getBet_num_choose().equals(other.getBet_num_choose()))
            && (this.getBet_num() == null ? other.getBet_num() == null : this.getBet_num().equals(other.getBet_num()))
            && (this.getMoney_num_choose() == null ? other.getMoney_num_choose() == null : this.getMoney_num_choose().equals(other.getMoney_num_choose()))
            && (this.getMoney_num() == null ? other.getMoney_num() == null : this.getMoney_num().equals(other.getMoney_num()))
            && (this.getDate_num_choose() == null ? other.getDate_num_choose() == null : this.getDate_num_choose().equals(other.getDate_num_choose()))
            && (this.getDate_num() == null ? other.getDate_num() == null : this.getDate_num().equals(other.getDate_num()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNid() == null) ? 0 : getNid().hashCode());
        result = prime * result + ((getNewbie_name() == null) ? 0 : getNewbie_name().hashCode());
        result = prime * result + ((getNewbie_type() == null) ? 0 : getNewbie_type().hashCode());
        result = prime * result + ((getChance_group() == null) ? 0 : getChance_group().hashCode());
        result = prime * result + ((getChance_group_num() == null) ? 0 : getChance_group_num().hashCode());
        result = prime * result + ((getChance_group_pot() == null) ? 0 : getChance_group_pot().hashCode());
        result = prime * result + ((getPot() == null) ? 0 : getPot().hashCode());
        result = prime * result + ((getPot_payout() == null) ? 0 : getPot_payout().hashCode());
        result = prime * result + ((getPot_make() == null) ? 0 : getPot_make().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getNewbie_chance() == null) ? 0 : getNewbie_chance().hashCode());
        result = prime * result + ((getChoose() == null) ? 0 : getChoose().hashCode());
        result = prime * result + ((getBet_num_choose() == null) ? 0 : getBet_num_choose().hashCode());
        result = prime * result + ((getBet_num() == null) ? 0 : getBet_num().hashCode());
        result = prime * result + ((getMoney_num_choose() == null) ? 0 : getMoney_num_choose().hashCode());
        result = prime * result + ((getMoney_num() == null) ? 0 : getMoney_num().hashCode());
        result = prime * result + ((getDate_num_choose() == null) ? 0 : getDate_num_choose().hashCode());
        result = prime * result + ((getDate_num() == null) ? 0 : getDate_num().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nid=").append(nid);
        sb.append(", newbie_name=").append(newbie_name);
        sb.append(", newbie_type=").append(newbie_type);
        sb.append(", chance_group=").append(chance_group);
        sb.append(", chance_group_num=").append(chance_group_num);
        sb.append(", chance_group_pot=").append(chance_group_pot);
        sb.append(", pot=").append(pot);
        sb.append(", pot_payout=").append(pot_payout);
        sb.append(", pot_make=").append(pot_make);
        sb.append(", profit=").append(profit);
        sb.append(", newbie_chance=").append(newbie_chance);
        sb.append(", choose=").append(choose);
        sb.append(", bet_num_choose=").append(bet_num_choose);
        sb.append(", bet_num=").append(bet_num);
        sb.append(", money_num_choose=").append(money_num_choose);
        sb.append(", money_num=").append(money_num);
        sb.append(", date_num_choose=").append(date_num_choose);
        sb.append(", date_num=").append(date_num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}