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
 * @TableName yuebao_funds_pool
 */
@TableName(value ="yuebao_funds_pool")
@Data
public class YuebaoFundsPool implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 会员ID
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 会员账号
     */
    @TableField(value = "member_account")
    private String member_account;

    /**
     * 存入金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 层级ID
     */
    @TableField(value = "level_id")
    private Object level_id;

    /**
     * 层级名称
     */
    @TableField(value = "level_name")
    private String level_name;

    /**
     * 存入时间
     */
    @TableField(value = "deposit_time")
    private LocalDateTime deposit_time;

    /**
     * 终止时间
     */
    @TableField(value = "end_time")
    private LocalDateTime end_time;

    /**
     * 提取时间
     */
    @TableField(value = "withdraw_time")
    private LocalDateTime withdraw_time;

    /**
     * 利率
     */
    @TableField(value = "interest_rate")
    private BigDecimal interest_rate;

    /**
     * 附加利率
     */
    @TableField(value = "addition_interest_rate")
    private BigDecimal addition_interest_rate;

    /**
     * 计息周期
     */
    @TableField(value = "interest_cycle")
    private Object interest_cycle;

    /**
     * 收益
     */
    @TableField(value = "interest")
    private BigDecimal interest;

    /**
     * 提款人账号
     */
    @TableField(value = "withdraw_account")
    private String withdraw_account;

    /**
     * 终止人账号
     */
    @TableField(value = "end_account")
    private String end_account;

    /**
     * 状态:1-进行中;2-已终止;3-已赎回;4-赎回中
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 后台备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 账号类型:0-正式;98-测试'99-试玩
     */
    @TableField(value = "type")
    private String type;

    /**
     * 存款交易单号
     */
    @TableField(value = "deposit_bill_no")
    private String deposit_bill_no;

    /**
     * 取款交易单号
     */
    @TableField(value = "withdraw_bill_no")
    private String withdraw_bill_no;

    /**
     * 交易类型
     */
    @TableField(value = "trade_type")
    private Object trade_type;

    /**
     * 前端备注
     */
    @TableField(value = "member_remark")
    private String member_remark;

    /**
     * 转入终端类型
     */
    @TableField(value = "deposit_device")
    private Object deposit_device;

    /**
     * 转出终端类型
     */
    @TableField(value = "draw_device")
    private Object draw_device;

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
        YuebaoFundsPool other = (YuebaoFundsPool) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getLevel_name() == null ? other.getLevel_name() == null : this.getLevel_name().equals(other.getLevel_name()))
            && (this.getDeposit_time() == null ? other.getDeposit_time() == null : this.getDeposit_time().equals(other.getDeposit_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getWithdraw_time() == null ? other.getWithdraw_time() == null : this.getWithdraw_time().equals(other.getWithdraw_time()))
            && (this.getInterest_rate() == null ? other.getInterest_rate() == null : this.getInterest_rate().equals(other.getInterest_rate()))
            && (this.getAddition_interest_rate() == null ? other.getAddition_interest_rate() == null : this.getAddition_interest_rate().equals(other.getAddition_interest_rate()))
            && (this.getInterest_cycle() == null ? other.getInterest_cycle() == null : this.getInterest_cycle().equals(other.getInterest_cycle()))
            && (this.getInterest() == null ? other.getInterest() == null : this.getInterest().equals(other.getInterest()))
            && (this.getWithdraw_account() == null ? other.getWithdraw_account() == null : this.getWithdraw_account().equals(other.getWithdraw_account()))
            && (this.getEnd_account() == null ? other.getEnd_account() == null : this.getEnd_account().equals(other.getEnd_account()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDeposit_bill_no() == null ? other.getDeposit_bill_no() == null : this.getDeposit_bill_no().equals(other.getDeposit_bill_no()))
            && (this.getWithdraw_bill_no() == null ? other.getWithdraw_bill_no() == null : this.getWithdraw_bill_no().equals(other.getWithdraw_bill_no()))
            && (this.getTrade_type() == null ? other.getTrade_type() == null : this.getTrade_type().equals(other.getTrade_type()))
            && (this.getMember_remark() == null ? other.getMember_remark() == null : this.getMember_remark().equals(other.getMember_remark()))
            && (this.getDeposit_device() == null ? other.getDeposit_device() == null : this.getDeposit_device().equals(other.getDeposit_device()))
            && (this.getDraw_device() == null ? other.getDraw_device() == null : this.getDraw_device().equals(other.getDraw_device()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getLevel_name() == null) ? 0 : getLevel_name().hashCode());
        result = prime * result + ((getDeposit_time() == null) ? 0 : getDeposit_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getWithdraw_time() == null) ? 0 : getWithdraw_time().hashCode());
        result = prime * result + ((getInterest_rate() == null) ? 0 : getInterest_rate().hashCode());
        result = prime * result + ((getAddition_interest_rate() == null) ? 0 : getAddition_interest_rate().hashCode());
        result = prime * result + ((getInterest_cycle() == null) ? 0 : getInterest_cycle().hashCode());
        result = prime * result + ((getInterest() == null) ? 0 : getInterest().hashCode());
        result = prime * result + ((getWithdraw_account() == null) ? 0 : getWithdraw_account().hashCode());
        result = prime * result + ((getEnd_account() == null) ? 0 : getEnd_account().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDeposit_bill_no() == null) ? 0 : getDeposit_bill_no().hashCode());
        result = prime * result + ((getWithdraw_bill_no() == null) ? 0 : getWithdraw_bill_no().hashCode());
        result = prime * result + ((getTrade_type() == null) ? 0 : getTrade_type().hashCode());
        result = prime * result + ((getMember_remark() == null) ? 0 : getMember_remark().hashCode());
        result = prime * result + ((getDeposit_device() == null) ? 0 : getDeposit_device().hashCode());
        result = prime * result + ((getDraw_device() == null) ? 0 : getDraw_device().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account1=").append(account1);
        sb.append(", member_id=").append(member_id);
        sb.append(", member_account=").append(member_account);
        sb.append(", amount=").append(amount);
        sb.append(", level_id=").append(level_id);
        sb.append(", level_name=").append(level_name);
        sb.append(", deposit_time=").append(deposit_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", withdraw_time=").append(withdraw_time);
        sb.append(", interest_rate=").append(interest_rate);
        sb.append(", addition_interest_rate=").append(addition_interest_rate);
        sb.append(", interest_cycle=").append(interest_cycle);
        sb.append(", interest=").append(interest);
        sb.append(", withdraw_account=").append(withdraw_account);
        sb.append(", end_account=").append(end_account);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", type=").append(type);
        sb.append(", deposit_bill_no=").append(deposit_bill_no);
        sb.append(", withdraw_bill_no=").append(withdraw_bill_no);
        sb.append(", trade_type=").append(trade_type);
        sb.append(", member_remark=").append(member_remark);
        sb.append(", deposit_device=").append(deposit_device);
        sb.append(", draw_device=").append(draw_device);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}