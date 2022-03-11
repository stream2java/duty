package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName mny_costdetailed_202206
 */
@TableName(value ="mny_costdetailed_202206")
@Data
public class MnyCostdetailed202206 implements Serializable {
    /**
     * 
     */
    @TableId(value = "costdetailed_id")
    private Object costdetailed_id;

    /**
     * 
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 
     */
    @TableField(value = "agent_id")
    private Object agent_id;

    /**
     * 
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 
     */
    @TableField(value = "periods_id")
    private Object periods_id;

    /**
     * 
     */
    @TableField(value = "administration_cost")
    private BigDecimal administration_cost;

    /**
     * 
     */
    @TableField(value = "rebate_discount")
    private BigDecimal rebate_discount;

    /**
     * 
     */
    @TableField(value = "waterbreak_discount")
    private BigDecimal waterbreak_discount;

    /**
     * 
     */
    @TableField(value = "deposit_discount")
    private BigDecimal deposit_discount;

    /**
     * 
     */
    @TableField(value = "subtotal")
    private BigDecimal subtotal;

    /**
     * 
     */
    @TableField(value = "founder")
    private String founder;

    /**
     * 
     */
    @TableField(value = "foundtime")
    private LocalDateTime foundtime;

    /**
     * 
     */
    @TableField(value = "memberaccount")
    private String memberaccount;

    /**
     * 
     */
    @TableField(value = "activity_discount")
    private BigDecimal activity_discount;

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
        MnyCostdetailed202206 other = (MnyCostdetailed202206) that;
        return (this.getCostdetailed_id() == null ? other.getCostdetailed_id() == null : this.getCostdetailed_id().equals(other.getCostdetailed_id()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getPeriods_id() == null ? other.getPeriods_id() == null : this.getPeriods_id().equals(other.getPeriods_id()))
            && (this.getAdministration_cost() == null ? other.getAdministration_cost() == null : this.getAdministration_cost().equals(other.getAdministration_cost()))
            && (this.getRebate_discount() == null ? other.getRebate_discount() == null : this.getRebate_discount().equals(other.getRebate_discount()))
            && (this.getWaterbreak_discount() == null ? other.getWaterbreak_discount() == null : this.getWaterbreak_discount().equals(other.getWaterbreak_discount()))
            && (this.getDeposit_discount() == null ? other.getDeposit_discount() == null : this.getDeposit_discount().equals(other.getDeposit_discount()))
            && (this.getSubtotal() == null ? other.getSubtotal() == null : this.getSubtotal().equals(other.getSubtotal()))
            && (this.getFounder() == null ? other.getFounder() == null : this.getFounder().equals(other.getFounder()))
            && (this.getFoundtime() == null ? other.getFoundtime() == null : this.getFoundtime().equals(other.getFoundtime()))
            && (this.getMemberaccount() == null ? other.getMemberaccount() == null : this.getMemberaccount().equals(other.getMemberaccount()))
            && (this.getActivity_discount() == null ? other.getActivity_discount() == null : this.getActivity_discount().equals(other.getActivity_discount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCostdetailed_id() == null) ? 0 : getCostdetailed_id().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getPeriods_id() == null) ? 0 : getPeriods_id().hashCode());
        result = prime * result + ((getAdministration_cost() == null) ? 0 : getAdministration_cost().hashCode());
        result = prime * result + ((getRebate_discount() == null) ? 0 : getRebate_discount().hashCode());
        result = prime * result + ((getWaterbreak_discount() == null) ? 0 : getWaterbreak_discount().hashCode());
        result = prime * result + ((getDeposit_discount() == null) ? 0 : getDeposit_discount().hashCode());
        result = prime * result + ((getSubtotal() == null) ? 0 : getSubtotal().hashCode());
        result = prime * result + ((getFounder() == null) ? 0 : getFounder().hashCode());
        result = prime * result + ((getFoundtime() == null) ? 0 : getFoundtime().hashCode());
        result = prime * result + ((getMemberaccount() == null) ? 0 : getMemberaccount().hashCode());
        result = prime * result + ((getActivity_discount() == null) ? 0 : getActivity_discount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costdetailed_id=").append(costdetailed_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", agent_id=").append(agent_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", periods_id=").append(periods_id);
        sb.append(", administration_cost=").append(administration_cost);
        sb.append(", rebate_discount=").append(rebate_discount);
        sb.append(", waterbreak_discount=").append(waterbreak_discount);
        sb.append(", deposit_discount=").append(deposit_discount);
        sb.append(", subtotal=").append(subtotal);
        sb.append(", founder=").append(founder);
        sb.append(", foundtime=").append(foundtime);
        sb.append(", memberaccount=").append(memberaccount);
        sb.append(", activity_discount=").append(activity_discount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}