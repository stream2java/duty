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
 * 退佣表
 * @TableName mny_rebate
 */
@TableName(value ="mny_rebate")
@Data
public class MnyRebate implements Serializable {
    /**
     * 退佣表id
     */
    @TableId(value = "rebate_id")
    private Object rebate_id;

    /**
     * 代理商id
     */
    @TableField(value = "agent_id")
    private Object agent_id;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 币别id
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 期数id
     */
    @TableField(value = "periods_id")
    private Object periods_id;

    /**
     * 有效会员数
     */
    @TableField(value = "valid_member_total")
    private Object valid_member_total;

    /**
     * 前期总累积派彩
     */
    @TableField(value = "all_payouts_total")
    private BigDecimal all_payouts_total;

    /**
     * 当期总新增派彩
     */
    @TableField(value = "all_payouts_now")
    private BigDecimal all_payouts_now;

    /**
     * 前期总累积有效投注
     */
    @TableField(value = "all_cathectic_total")
    private BigDecimal all_cathectic_total;

    /**
     * 当期总累积有效投注
     */
    @TableField(value = "all_cathectic_now")
    private BigDecimal all_cathectic_now;

    /**
     * 前期累积总费用
     */
    @TableField(value = "cost_total")
    private BigDecimal cost_total;

    /**
     * 当期新增总费用
     */
    @TableField(value = "cost_now")
    private BigDecimal cost_now;

    /**
     * 可获退佣
     */
    @TableField(value = "can_get_rebate")
    private BigDecimal can_get_rebate;

    /**
     * 已获退佣
     */
    @TableField(value = "has_get_rebate")
    private BigDecimal has_get_rebate;

    /**
     * 状态
     */
    @TableField(value = "status")
    private String status;

    /**
     * 出款银行id
     */
    @TableField(value = "collectbank")
    private Object collectbank;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 创建人
     */
    @TableField(value = "founder")
    private String founder;

    /**
     * 创建时间
     */
    @TableField(value = "foundtime")
    private LocalDateTime foundtime;

    /**
     * 修改人
     */
    @TableField(value = "moder")
    private String moder;

    /**
     * 修改时间
     */
    @TableField(value = "modtime")
    private LocalDateTime modtime;

    /**
     * 挂账与防止误操作
     */
    @TableField(value = "charge")
    private BigDecimal charge;

    /**
     * 代理帐号
     */
    @TableField(value = "agent_account")
    private String agent_account;

    /**
     * 代理昵称
     */
    @TableField(value = "agent_name")
    private String agent_name;

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
        MnyRebate other = (MnyRebate) that;
        return (this.getRebate_id() == null ? other.getRebate_id() == null : this.getRebate_id().equals(other.getRebate_id()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getPeriods_id() == null ? other.getPeriods_id() == null : this.getPeriods_id().equals(other.getPeriods_id()))
            && (this.getValid_member_total() == null ? other.getValid_member_total() == null : this.getValid_member_total().equals(other.getValid_member_total()))
            && (this.getAll_payouts_total() == null ? other.getAll_payouts_total() == null : this.getAll_payouts_total().equals(other.getAll_payouts_total()))
            && (this.getAll_payouts_now() == null ? other.getAll_payouts_now() == null : this.getAll_payouts_now().equals(other.getAll_payouts_now()))
            && (this.getAll_cathectic_total() == null ? other.getAll_cathectic_total() == null : this.getAll_cathectic_total().equals(other.getAll_cathectic_total()))
            && (this.getAll_cathectic_now() == null ? other.getAll_cathectic_now() == null : this.getAll_cathectic_now().equals(other.getAll_cathectic_now()))
            && (this.getCost_total() == null ? other.getCost_total() == null : this.getCost_total().equals(other.getCost_total()))
            && (this.getCost_now() == null ? other.getCost_now() == null : this.getCost_now().equals(other.getCost_now()))
            && (this.getCan_get_rebate() == null ? other.getCan_get_rebate() == null : this.getCan_get_rebate().equals(other.getCan_get_rebate()))
            && (this.getHas_get_rebate() == null ? other.getHas_get_rebate() == null : this.getHas_get_rebate().equals(other.getHas_get_rebate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCollectbank() == null ? other.getCollectbank() == null : this.getCollectbank().equals(other.getCollectbank()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getFounder() == null ? other.getFounder() == null : this.getFounder().equals(other.getFounder()))
            && (this.getFoundtime() == null ? other.getFoundtime() == null : this.getFoundtime().equals(other.getFoundtime()))
            && (this.getModer() == null ? other.getModer() == null : this.getModer().equals(other.getModer()))
            && (this.getModtime() == null ? other.getModtime() == null : this.getModtime().equals(other.getModtime()))
            && (this.getCharge() == null ? other.getCharge() == null : this.getCharge().equals(other.getCharge()))
            && (this.getAgent_account() == null ? other.getAgent_account() == null : this.getAgent_account().equals(other.getAgent_account()))
            && (this.getAgent_name() == null ? other.getAgent_name() == null : this.getAgent_name().equals(other.getAgent_name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRebate_id() == null) ? 0 : getRebate_id().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getPeriods_id() == null) ? 0 : getPeriods_id().hashCode());
        result = prime * result + ((getValid_member_total() == null) ? 0 : getValid_member_total().hashCode());
        result = prime * result + ((getAll_payouts_total() == null) ? 0 : getAll_payouts_total().hashCode());
        result = prime * result + ((getAll_payouts_now() == null) ? 0 : getAll_payouts_now().hashCode());
        result = prime * result + ((getAll_cathectic_total() == null) ? 0 : getAll_cathectic_total().hashCode());
        result = prime * result + ((getAll_cathectic_now() == null) ? 0 : getAll_cathectic_now().hashCode());
        result = prime * result + ((getCost_total() == null) ? 0 : getCost_total().hashCode());
        result = prime * result + ((getCost_now() == null) ? 0 : getCost_now().hashCode());
        result = prime * result + ((getCan_get_rebate() == null) ? 0 : getCan_get_rebate().hashCode());
        result = prime * result + ((getHas_get_rebate() == null) ? 0 : getHas_get_rebate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCollectbank() == null) ? 0 : getCollectbank().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getFounder() == null) ? 0 : getFounder().hashCode());
        result = prime * result + ((getFoundtime() == null) ? 0 : getFoundtime().hashCode());
        result = prime * result + ((getModer() == null) ? 0 : getModer().hashCode());
        result = prime * result + ((getModtime() == null) ? 0 : getModtime().hashCode());
        result = prime * result + ((getCharge() == null) ? 0 : getCharge().hashCode());
        result = prime * result + ((getAgent_account() == null) ? 0 : getAgent_account().hashCode());
        result = prime * result + ((getAgent_name() == null) ? 0 : getAgent_name().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rebate_id=").append(rebate_id);
        sb.append(", agent_id=").append(agent_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", periods_id=").append(periods_id);
        sb.append(", valid_member_total=").append(valid_member_total);
        sb.append(", all_payouts_total=").append(all_payouts_total);
        sb.append(", all_payouts_now=").append(all_payouts_now);
        sb.append(", all_cathectic_total=").append(all_cathectic_total);
        sb.append(", all_cathectic_now=").append(all_cathectic_now);
        sb.append(", cost_total=").append(cost_total);
        sb.append(", cost_now=").append(cost_now);
        sb.append(", can_get_rebate=").append(can_get_rebate);
        sb.append(", has_get_rebate=").append(has_get_rebate);
        sb.append(", status=").append(status);
        sb.append(", collectbank=").append(collectbank);
        sb.append(", remark=").append(remark);
        sb.append(", founder=").append(founder);
        sb.append(", foundtime=").append(foundtime);
        sb.append(", moder=").append(moder);
        sb.append(", modtime=").append(modtime);
        sb.append(", charge=").append(charge);
        sb.append(", agent_account=").append(agent_account);
        sb.append(", agent_name=").append(agent_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}