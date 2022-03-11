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
 * @TableName mny_check
 */
@TableName(value ="mny_check")
@Data
public class MnyCheck implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "check_id")
    private Object check_id;

    /**
     * 起始时间
     */
    @TableField(value = "time_start")
    private LocalDateTime time_start;

    /**
     * 结束时间
     */
    @TableField(value = "time_end")
    private LocalDateTime time_end;

    /**
     * 存款金额
     */
    @TableField(value = "deposit_money")
    private BigDecimal deposit_money;

    /**
     * 优惠
     */
    @TableField(value = "preferential")
    private BigDecimal preferential;

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
     * 修改者
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 会员ID
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 达打码量与否:0-不需稽核1-通过2-未通过
     */
    @TableField(value = "pre_check_status")
    private Object pre_check_status;

    /**
     * 需扣除行政费用：0-不需稽核1-否（通过）2-是（未通过）
     */
    @TableField(value = "normal_check_status")
    private Object normal_check_status;

    /**
     * 类别：0-即时稽核1-已取款稽核
     */
    @TableField(value = "type")
    private Object type;

    /**
     * 订单号，在线存款时用
     */
    @TableField(value = "orderno")
    private String orderno;

    /**
     * 综合额度稽核状态数据是否通过：0-不需稽核（-）1-V（通过）2-X（未通过）
     */
    @TableField(value = "comp_status_check")
    private Object comp_status_check;

    /**
     * 综合额度稽核倍数数据
     */
    @TableField(value = "comp_num_check")
    private Object comp_num_check;

    /**
     * 常态性稽核状态数据是否通过：0-不需稽核（-）1-V（通过）2-X（未通过）
     */
    @TableField(value = "normal_status_check")
    private Object normal_status_check;

    /**
     * 常态性稽核百分比数据
     */
    @TableField(value = "normal_per_check")
    private Object normal_per_check;

    /**
     * 常态性稽核放宽额度数据
     */
    @TableField(value = "normal_relax_check")
    private BigDecimal normal_relax_check;

    /**
     * 常态性稽核行政费率数据
     */
    @TableField(value = "normal_adm_per_check")
    private Object normal_adm_per_check;

    /**
     * 常态性稽核需扣除行政费用
     */
    @TableField(value = "normal_check_deduct_money")
    private BigDecimal normal_check_deduct_money;

    /**
     * 优惠稽核
     */
    @TableField(value = "shipping_audit")
    private BigDecimal shipping_audit;

    /**
     * 常能性稽核
     */
    @TableField(value = "normal_shipping_audit")
    private BigDecimal normal_shipping_audit;

    /**
     * 人工存入综合打码量
     */
    @TableField(value = "comp_bet")
    private BigDecimal comp_bet;

    /**
     * 
     */
    @TableField(value = "pre_rem_per_check")
    private Object pre_rem_per_check;

    /**
     * 操作状态：0-未操作1-已操作
     */
    @TableField(value = "operator_status")
    private Object operator_status;

    /**
     * 大大股东ID
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 本地本次存款时间点的余额
     */
    @TableField(value = "this_remoney")
    private BigDecimal this_remoney;

    /**
     * 
     */
    @TableField(value = "run_time")
    private LocalDateTime run_time;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

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
        MnyCheck other = (MnyCheck) that;
        return (this.getCheck_id() == null ? other.getCheck_id() == null : this.getCheck_id().equals(other.getCheck_id()))
            && (this.getTime_start() == null ? other.getTime_start() == null : this.getTime_start().equals(other.getTime_start()))
            && (this.getTime_end() == null ? other.getTime_end() == null : this.getTime_end().equals(other.getTime_end()))
            && (this.getDeposit_money() == null ? other.getDeposit_money() == null : this.getDeposit_money().equals(other.getDeposit_money()))
            && (this.getPreferential() == null ? other.getPreferential() == null : this.getPreferential().equals(other.getPreferential()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getPre_check_status() == null ? other.getPre_check_status() == null : this.getPre_check_status().equals(other.getPre_check_status()))
            && (this.getNormal_check_status() == null ? other.getNormal_check_status() == null : this.getNormal_check_status().equals(other.getNormal_check_status()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getOrderno() == null ? other.getOrderno() == null : this.getOrderno().equals(other.getOrderno()))
            && (this.getComp_status_check() == null ? other.getComp_status_check() == null : this.getComp_status_check().equals(other.getComp_status_check()))
            && (this.getComp_num_check() == null ? other.getComp_num_check() == null : this.getComp_num_check().equals(other.getComp_num_check()))
            && (this.getNormal_status_check() == null ? other.getNormal_status_check() == null : this.getNormal_status_check().equals(other.getNormal_status_check()))
            && (this.getNormal_per_check() == null ? other.getNormal_per_check() == null : this.getNormal_per_check().equals(other.getNormal_per_check()))
            && (this.getNormal_relax_check() == null ? other.getNormal_relax_check() == null : this.getNormal_relax_check().equals(other.getNormal_relax_check()))
            && (this.getNormal_adm_per_check() == null ? other.getNormal_adm_per_check() == null : this.getNormal_adm_per_check().equals(other.getNormal_adm_per_check()))
            && (this.getNormal_check_deduct_money() == null ? other.getNormal_check_deduct_money() == null : this.getNormal_check_deduct_money().equals(other.getNormal_check_deduct_money()))
            && (this.getShipping_audit() == null ? other.getShipping_audit() == null : this.getShipping_audit().equals(other.getShipping_audit()))
            && (this.getNormal_shipping_audit() == null ? other.getNormal_shipping_audit() == null : this.getNormal_shipping_audit().equals(other.getNormal_shipping_audit()))
            && (this.getComp_bet() == null ? other.getComp_bet() == null : this.getComp_bet().equals(other.getComp_bet()))
            && (this.getPre_rem_per_check() == null ? other.getPre_rem_per_check() == null : this.getPre_rem_per_check().equals(other.getPre_rem_per_check()))
            && (this.getOperator_status() == null ? other.getOperator_status() == null : this.getOperator_status().equals(other.getOperator_status()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getThis_remoney() == null ? other.getThis_remoney() == null : this.getThis_remoney().equals(other.getThis_remoney()))
            && (this.getRun_time() == null ? other.getRun_time() == null : this.getRun_time().equals(other.getRun_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheck_id() == null) ? 0 : getCheck_id().hashCode());
        result = prime * result + ((getTime_start() == null) ? 0 : getTime_start().hashCode());
        result = prime * result + ((getTime_end() == null) ? 0 : getTime_end().hashCode());
        result = prime * result + ((getDeposit_money() == null) ? 0 : getDeposit_money().hashCode());
        result = prime * result + ((getPreferential() == null) ? 0 : getPreferential().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getPre_check_status() == null) ? 0 : getPre_check_status().hashCode());
        result = prime * result + ((getNormal_check_status() == null) ? 0 : getNormal_check_status().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getOrderno() == null) ? 0 : getOrderno().hashCode());
        result = prime * result + ((getComp_status_check() == null) ? 0 : getComp_status_check().hashCode());
        result = prime * result + ((getComp_num_check() == null) ? 0 : getComp_num_check().hashCode());
        result = prime * result + ((getNormal_status_check() == null) ? 0 : getNormal_status_check().hashCode());
        result = prime * result + ((getNormal_per_check() == null) ? 0 : getNormal_per_check().hashCode());
        result = prime * result + ((getNormal_relax_check() == null) ? 0 : getNormal_relax_check().hashCode());
        result = prime * result + ((getNormal_adm_per_check() == null) ? 0 : getNormal_adm_per_check().hashCode());
        result = prime * result + ((getNormal_check_deduct_money() == null) ? 0 : getNormal_check_deduct_money().hashCode());
        result = prime * result + ((getShipping_audit() == null) ? 0 : getShipping_audit().hashCode());
        result = prime * result + ((getNormal_shipping_audit() == null) ? 0 : getNormal_shipping_audit().hashCode());
        result = prime * result + ((getComp_bet() == null) ? 0 : getComp_bet().hashCode());
        result = prime * result + ((getPre_rem_per_check() == null) ? 0 : getPre_rem_per_check().hashCode());
        result = prime * result + ((getOperator_status() == null) ? 0 : getOperator_status().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getThis_remoney() == null) ? 0 : getThis_remoney().hashCode());
        result = prime * result + ((getRun_time() == null) ? 0 : getRun_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", check_id=").append(check_id);
        sb.append(", time_start=").append(time_start);
        sb.append(", time_end=").append(time_end);
        sb.append(", deposit_money=").append(deposit_money);
        sb.append(", preferential=").append(preferential);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", member_id=").append(member_id);
        sb.append(", pre_check_status=").append(pre_check_status);
        sb.append(", normal_check_status=").append(normal_check_status);
        sb.append(", type=").append(type);
        sb.append(", orderno=").append(orderno);
        sb.append(", comp_status_check=").append(comp_status_check);
        sb.append(", comp_num_check=").append(comp_num_check);
        sb.append(", normal_status_check=").append(normal_status_check);
        sb.append(", normal_per_check=").append(normal_per_check);
        sb.append(", normal_relax_check=").append(normal_relax_check);
        sb.append(", normal_adm_per_check=").append(normal_adm_per_check);
        sb.append(", normal_check_deduct_money=").append(normal_check_deduct_money);
        sb.append(", shipping_audit=").append(shipping_audit);
        sb.append(", normal_shipping_audit=").append(normal_shipping_audit);
        sb.append(", comp_bet=").append(comp_bet);
        sb.append(", pre_rem_per_check=").append(pre_rem_per_check);
        sb.append(", operator_status=").append(operator_status);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", this_remoney=").append(this_remoney);
        sb.append(", run_time=").append(run_time);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}