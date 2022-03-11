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
 * 会员详情字段表
 * @TableName at_member_detail
 */
@TableName(value ="at_member_detail")
@Data
public class AtMemberDetail implements Serializable {
    /**
     * 出入款记录id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 会员id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 存款次数
     */
    @TableField(value = "depositnum")
    private Object depositnum;

    /**
     * 存款总额
     */
    @TableField(value = "deposittotal")
    private BigDecimal deposittotal;

    /**
     * 最大存款额度
     */
    @TableField(value = "maxdeposit")
    private BigDecimal maxdeposit;

    /**
     * 提款次数
     */
    @TableField(value = "collectnum")
    private Object collectnum;

    /**
     * 提款总额
     */
    @TableField(value = "collecttotal")
    private BigDecimal collecttotal;

    /**
     * 人工提款次数
     */
    @TableField(value = "manual_collect_num")
    private Object manual_collect_num;

    /**
     * 线上取款次数
     */
    @TableField(value = "draw_num")
    private Object draw_num;

    /**
     * 首存充值类型
     */
    @TableField(value = "first_deposit_type")
    private Object first_deposit_type;

    /**
     * 首存金额
     */
    @TableField(value = "first_deposit_amount")
    private Integer first_deposit_amount;

    /**
     * 首存时间
     */
    @TableField(value = "first_deposit_time")
    private LocalDateTime first_deposit_time;

    /**
     * 最后充值金额
     */
    @TableField(value = "last_deposit_amount")
    private Integer last_deposit_amount;

    /**
     * 最后存款时间
     */
    @TableField(value = "last_deposit_time")
    private LocalDateTime last_deposit_time;

    /**
     * 余额宝存款次数
     */
    @TableField(value = "yuebao_deposit_num")
    private Object yuebao_deposit_num;

    /**
     * 余额宝存款金额
     */
    @TableField(value = "yuebao_deposit_total")
    private BigDecimal yuebao_deposit_total;

    /**
     * 余额宝转余额次数
     */
    @TableField(value = "yuebao_to_balance_num")
    private Object yuebao_to_balance_num;

    /**
     * 余额宝转余额金额
     */
    @TableField(value = "yuebao_to_balance_total")
    private BigDecimal yuebao_to_balance_total;

    /**
     * 余额宝提款次数（转银行卡、转支付宝）
     */
    @TableField(value = "yuebao_collect_num")
    private Object yuebao_collect_num;

    /**
     * 余额宝提款金额（转银行卡、转支付宝）
     */
    @TableField(value = "yuebao_collect_total")
    private BigDecimal yuebao_collect_total;

    /**
     * 首充终端类型
     */
    @TableField(value = "first_deposit_device")
    private Object first_deposit_device;

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
        AtMemberDetail other = (AtMemberDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getDepositnum() == null ? other.getDepositnum() == null : this.getDepositnum().equals(other.getDepositnum()))
            && (this.getDeposittotal() == null ? other.getDeposittotal() == null : this.getDeposittotal().equals(other.getDeposittotal()))
            && (this.getMaxdeposit() == null ? other.getMaxdeposit() == null : this.getMaxdeposit().equals(other.getMaxdeposit()))
            && (this.getCollectnum() == null ? other.getCollectnum() == null : this.getCollectnum().equals(other.getCollectnum()))
            && (this.getCollecttotal() == null ? other.getCollecttotal() == null : this.getCollecttotal().equals(other.getCollecttotal()))
            && (this.getManual_collect_num() == null ? other.getManual_collect_num() == null : this.getManual_collect_num().equals(other.getManual_collect_num()))
            && (this.getDraw_num() == null ? other.getDraw_num() == null : this.getDraw_num().equals(other.getDraw_num()))
            && (this.getFirst_deposit_type() == null ? other.getFirst_deposit_type() == null : this.getFirst_deposit_type().equals(other.getFirst_deposit_type()))
            && (this.getFirst_deposit_amount() == null ? other.getFirst_deposit_amount() == null : this.getFirst_deposit_amount().equals(other.getFirst_deposit_amount()))
            && (this.getFirst_deposit_time() == null ? other.getFirst_deposit_time() == null : this.getFirst_deposit_time().equals(other.getFirst_deposit_time()))
            && (this.getLast_deposit_amount() == null ? other.getLast_deposit_amount() == null : this.getLast_deposit_amount().equals(other.getLast_deposit_amount()))
            && (this.getLast_deposit_time() == null ? other.getLast_deposit_time() == null : this.getLast_deposit_time().equals(other.getLast_deposit_time()))
            && (this.getYuebao_deposit_num() == null ? other.getYuebao_deposit_num() == null : this.getYuebao_deposit_num().equals(other.getYuebao_deposit_num()))
            && (this.getYuebao_deposit_total() == null ? other.getYuebao_deposit_total() == null : this.getYuebao_deposit_total().equals(other.getYuebao_deposit_total()))
            && (this.getYuebao_to_balance_num() == null ? other.getYuebao_to_balance_num() == null : this.getYuebao_to_balance_num().equals(other.getYuebao_to_balance_num()))
            && (this.getYuebao_to_balance_total() == null ? other.getYuebao_to_balance_total() == null : this.getYuebao_to_balance_total().equals(other.getYuebao_to_balance_total()))
            && (this.getYuebao_collect_num() == null ? other.getYuebao_collect_num() == null : this.getYuebao_collect_num().equals(other.getYuebao_collect_num()))
            && (this.getYuebao_collect_total() == null ? other.getYuebao_collect_total() == null : this.getYuebao_collect_total().equals(other.getYuebao_collect_total()))
            && (this.getFirst_deposit_device() == null ? other.getFirst_deposit_device() == null : this.getFirst_deposit_device().equals(other.getFirst_deposit_device()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getDepositnum() == null) ? 0 : getDepositnum().hashCode());
        result = prime * result + ((getDeposittotal() == null) ? 0 : getDeposittotal().hashCode());
        result = prime * result + ((getMaxdeposit() == null) ? 0 : getMaxdeposit().hashCode());
        result = prime * result + ((getCollectnum() == null) ? 0 : getCollectnum().hashCode());
        result = prime * result + ((getCollecttotal() == null) ? 0 : getCollecttotal().hashCode());
        result = prime * result + ((getManual_collect_num() == null) ? 0 : getManual_collect_num().hashCode());
        result = prime * result + ((getDraw_num() == null) ? 0 : getDraw_num().hashCode());
        result = prime * result + ((getFirst_deposit_type() == null) ? 0 : getFirst_deposit_type().hashCode());
        result = prime * result + ((getFirst_deposit_amount() == null) ? 0 : getFirst_deposit_amount().hashCode());
        result = prime * result + ((getFirst_deposit_time() == null) ? 0 : getFirst_deposit_time().hashCode());
        result = prime * result + ((getLast_deposit_amount() == null) ? 0 : getLast_deposit_amount().hashCode());
        result = prime * result + ((getLast_deposit_time() == null) ? 0 : getLast_deposit_time().hashCode());
        result = prime * result + ((getYuebao_deposit_num() == null) ? 0 : getYuebao_deposit_num().hashCode());
        result = prime * result + ((getYuebao_deposit_total() == null) ? 0 : getYuebao_deposit_total().hashCode());
        result = prime * result + ((getYuebao_to_balance_num() == null) ? 0 : getYuebao_to_balance_num().hashCode());
        result = prime * result + ((getYuebao_to_balance_total() == null) ? 0 : getYuebao_to_balance_total().hashCode());
        result = prime * result + ((getYuebao_collect_num() == null) ? 0 : getYuebao_collect_num().hashCode());
        result = prime * result + ((getYuebao_collect_total() == null) ? 0 : getYuebao_collect_total().hashCode());
        result = prime * result + ((getFirst_deposit_device() == null) ? 0 : getFirst_deposit_device().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account_id=").append(account_id);
        sb.append(", depositnum=").append(depositnum);
        sb.append(", deposittotal=").append(deposittotal);
        sb.append(", maxdeposit=").append(maxdeposit);
        sb.append(", collectnum=").append(collectnum);
        sb.append(", collecttotal=").append(collecttotal);
        sb.append(", manual_collect_num=").append(manual_collect_num);
        sb.append(", draw_num=").append(draw_num);
        sb.append(", first_deposit_type=").append(first_deposit_type);
        sb.append(", first_deposit_amount=").append(first_deposit_amount);
        sb.append(", first_deposit_time=").append(first_deposit_time);
        sb.append(", last_deposit_amount=").append(last_deposit_amount);
        sb.append(", last_deposit_time=").append(last_deposit_time);
        sb.append(", yuebao_deposit_num=").append(yuebao_deposit_num);
        sb.append(", yuebao_deposit_total=").append(yuebao_deposit_total);
        sb.append(", yuebao_to_balance_num=").append(yuebao_to_balance_num);
        sb.append(", yuebao_to_balance_total=").append(yuebao_to_balance_total);
        sb.append(", yuebao_collect_num=").append(yuebao_collect_num);
        sb.append(", yuebao_collect_total=").append(yuebao_collect_total);
        sb.append(", first_deposit_device=").append(first_deposit_device);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}