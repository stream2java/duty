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
 * @TableName at_money_max_limit
 */
@TableName(value ="at_money_max_limit")
@Data
public class AtMoneyMaxLimit implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 人工提出最大限额，单次最高可操作金额
     */
    @TableField(value = "draw_money_max_limit")
    private BigDecimal draw_money_max_limit;

    /**
     * 批量存入最大限额，单次最高可操作金额
     */
    @TableField(value = "batch_money_max_limit")
    private BigDecimal batch_money_max_limit;

    /**
     * 快速出款最大限额，单次最高可操作金额
     */
    @TableField(value = "rapid_money_max_limit")
    private BigDecimal rapid_money_max_limit;

    /**
     * 存款优惠最大额度
     */
    @TableField(value = "deposit_pre_max_limit")
    private BigDecimal deposit_pre_max_limit;

    /**
     * 汇款优惠最大额度
     */
    @TableField(value = "other_pre_max_limit")
    private BigDecimal other_pre_max_limit;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 出款下限限额
     */
    @TableField(value = "payment_money_min_limit")
    private BigDecimal payment_money_min_limit;

    /**
     * 出款上限限额
     */
    @TableField(value = "payment_money_max_limit")
    private BigDecimal payment_money_max_limit;

    /**
     * 入款下限限额
     */
    @TableField(value = "deposit_money_min_limit")
    private BigDecimal deposit_money_min_limit;

    /**
     * 入款上限限额
     */
    @TableField(value = "deposit_money_max_limit")
    private BigDecimal deposit_money_max_limit;

    /**
     * 余额宝快速转账最大限额，单次最高可操作金额
     */
    @TableField(value = "transfer_money_max_limit")
    private BigDecimal transfer_money_max_limit;

    /**
     * 余额宝批量存提限额
     */
    @TableField(value = "yuebao_batch_money_max_limit")
    private BigDecimal yuebao_batch_money_max_limit;

    /**
     * 余额宝人工提出限额
     */
    @TableField(value = "yuebao_cunti_max_limit")
    private BigDecimal yuebao_cunti_max_limit;

    /**
     * 人工存入最大限额，单次最高可操作金额
     */
    @TableField(value = "manual_deposit_max_limit")
    private BigDecimal manual_deposit_max_limit;

    /**
     * 余额宝人工存入限额
     */
    @TableField(value = "yuebao_manual_deposit_max_limit")
    private BigDecimal yuebao_manual_deposit_max_limit;

    /**
     * 批量提出最大限额，单次最高可操作金额
     */
    @TableField(value = "batch_draw_money_max_limit")
    private BigDecimal batch_draw_money_max_limit;

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
        AtMoneyMaxLimit other = (AtMoneyMaxLimit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getDraw_money_max_limit() == null ? other.getDraw_money_max_limit() == null : this.getDraw_money_max_limit().equals(other.getDraw_money_max_limit()))
            && (this.getBatch_money_max_limit() == null ? other.getBatch_money_max_limit() == null : this.getBatch_money_max_limit().equals(other.getBatch_money_max_limit()))
            && (this.getRapid_money_max_limit() == null ? other.getRapid_money_max_limit() == null : this.getRapid_money_max_limit().equals(other.getRapid_money_max_limit()))
            && (this.getDeposit_pre_max_limit() == null ? other.getDeposit_pre_max_limit() == null : this.getDeposit_pre_max_limit().equals(other.getDeposit_pre_max_limit()))
            && (this.getOther_pre_max_limit() == null ? other.getOther_pre_max_limit() == null : this.getOther_pre_max_limit().equals(other.getOther_pre_max_limit()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getPayment_money_min_limit() == null ? other.getPayment_money_min_limit() == null : this.getPayment_money_min_limit().equals(other.getPayment_money_min_limit()))
            && (this.getPayment_money_max_limit() == null ? other.getPayment_money_max_limit() == null : this.getPayment_money_max_limit().equals(other.getPayment_money_max_limit()))
            && (this.getDeposit_money_min_limit() == null ? other.getDeposit_money_min_limit() == null : this.getDeposit_money_min_limit().equals(other.getDeposit_money_min_limit()))
            && (this.getDeposit_money_max_limit() == null ? other.getDeposit_money_max_limit() == null : this.getDeposit_money_max_limit().equals(other.getDeposit_money_max_limit()))
            && (this.getTransfer_money_max_limit() == null ? other.getTransfer_money_max_limit() == null : this.getTransfer_money_max_limit().equals(other.getTransfer_money_max_limit()))
            && (this.getYuebao_batch_money_max_limit() == null ? other.getYuebao_batch_money_max_limit() == null : this.getYuebao_batch_money_max_limit().equals(other.getYuebao_batch_money_max_limit()))
            && (this.getYuebao_cunti_max_limit() == null ? other.getYuebao_cunti_max_limit() == null : this.getYuebao_cunti_max_limit().equals(other.getYuebao_cunti_max_limit()))
            && (this.getManual_deposit_max_limit() == null ? other.getManual_deposit_max_limit() == null : this.getManual_deposit_max_limit().equals(other.getManual_deposit_max_limit()))
            && (this.getYuebao_manual_deposit_max_limit() == null ? other.getYuebao_manual_deposit_max_limit() == null : this.getYuebao_manual_deposit_max_limit().equals(other.getYuebao_manual_deposit_max_limit()))
            && (this.getBatch_draw_money_max_limit() == null ? other.getBatch_draw_money_max_limit() == null : this.getBatch_draw_money_max_limit().equals(other.getBatch_draw_money_max_limit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getDraw_money_max_limit() == null) ? 0 : getDraw_money_max_limit().hashCode());
        result = prime * result + ((getBatch_money_max_limit() == null) ? 0 : getBatch_money_max_limit().hashCode());
        result = prime * result + ((getRapid_money_max_limit() == null) ? 0 : getRapid_money_max_limit().hashCode());
        result = prime * result + ((getDeposit_pre_max_limit() == null) ? 0 : getDeposit_pre_max_limit().hashCode());
        result = prime * result + ((getOther_pre_max_limit() == null) ? 0 : getOther_pre_max_limit().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getPayment_money_min_limit() == null) ? 0 : getPayment_money_min_limit().hashCode());
        result = prime * result + ((getPayment_money_max_limit() == null) ? 0 : getPayment_money_max_limit().hashCode());
        result = prime * result + ((getDeposit_money_min_limit() == null) ? 0 : getDeposit_money_min_limit().hashCode());
        result = prime * result + ((getDeposit_money_max_limit() == null) ? 0 : getDeposit_money_max_limit().hashCode());
        result = prime * result + ((getTransfer_money_max_limit() == null) ? 0 : getTransfer_money_max_limit().hashCode());
        result = prime * result + ((getYuebao_batch_money_max_limit() == null) ? 0 : getYuebao_batch_money_max_limit().hashCode());
        result = prime * result + ((getYuebao_cunti_max_limit() == null) ? 0 : getYuebao_cunti_max_limit().hashCode());
        result = prime * result + ((getManual_deposit_max_limit() == null) ? 0 : getManual_deposit_max_limit().hashCode());
        result = prime * result + ((getYuebao_manual_deposit_max_limit() == null) ? 0 : getYuebao_manual_deposit_max_limit().hashCode());
        result = prime * result + ((getBatch_draw_money_max_limit() == null) ? 0 : getBatch_draw_money_max_limit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", draw_money_max_limit=").append(draw_money_max_limit);
        sb.append(", batch_money_max_limit=").append(batch_money_max_limit);
        sb.append(", rapid_money_max_limit=").append(rapid_money_max_limit);
        sb.append(", deposit_pre_max_limit=").append(deposit_pre_max_limit);
        sb.append(", other_pre_max_limit=").append(other_pre_max_limit);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", payment_money_min_limit=").append(payment_money_min_limit);
        sb.append(", payment_money_max_limit=").append(payment_money_max_limit);
        sb.append(", deposit_money_min_limit=").append(deposit_money_min_limit);
        sb.append(", deposit_money_max_limit=").append(deposit_money_max_limit);
        sb.append(", transfer_money_max_limit=").append(transfer_money_max_limit);
        sb.append(", yuebao_batch_money_max_limit=").append(yuebao_batch_money_max_limit);
        sb.append(", yuebao_cunti_max_limit=").append(yuebao_cunti_max_limit);
        sb.append(", manual_deposit_max_limit=").append(manual_deposit_max_limit);
        sb.append(", yuebao_manual_deposit_max_limit=").append(yuebao_manual_deposit_max_limit);
        sb.append(", batch_draw_money_max_limit=").append(batch_draw_money_max_limit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}