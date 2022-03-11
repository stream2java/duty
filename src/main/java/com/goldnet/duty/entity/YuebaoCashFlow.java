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
 * @TableName yuebao_cash_flow
 */
@TableName(value ="yuebao_cash_flow")
@Data
public class YuebaoCashFlow implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

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
     * 会员层级ID
     */
    @TableField(value = "level_id")
    private Object level_id;

    /**
     * 层级名称
     */
    @TableField(value = "level_name")
    private String level_name;

    /**
     * 代理ID
     */
    @TableField(value = "agent_id")
    private Object agent_id;

    /**
     * 代理账号
     */
    @TableField(value = "agent_account")
    private String agent_account;

    /**
     * 交易类型:201-余额存入;202-收益发送;203-转出至余额;204-收益转至余额;205-申请转出至银行卡;206-申请收益转出至银行卡;207-实际转出至银行卡;208-实际收益转出至银行卡;209-取消申请转出至银行卡;210-取消收益转出至银行卡
     */
    @TableField(value = "trade_type")
    private Integer trade_type;

    /**
     * 流水类型:1-本金;2-利息
     */
    @TableField(value = "flow_type")
    private Integer flow_type;

    /**
     * 提款类型:1-银行卡;2-账户余额
     */
    @TableField(value = "draw_type")
    private Integer draw_type;

    /**
     * 余额
     */
    @TableField(value = "balance")
    private BigDecimal balance;

    /**
     * 交易额度
     */
    @TableField(value = "trade_money")
    private BigDecimal trade_money;

    /**
     * 余额宝资金池存入单号
     */
    @TableField(value = "deposit_bill_no")
    private String deposit_bill_no;

    /**
     * 流水单号
     */
    @TableField(value = "withdraw_bill_no")
    private String withdraw_bill_no;

    /**
     * 后台备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 会员类型:0-正式会员;98-测试会员; 99-试玩会员
     */
    @TableField(value = "type")
    private String type;

    /**
     * 操作ID
     */
    @TableField(value = "operator_id")
    private Object operator_id;

    /**
     * 操作账号
     */
    @TableField(value = "operator_account")
    private String operator_account;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 前端备注
     */
    @TableField(value = "member_remark")
    private String member_remark;

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
        YuebaoCashFlow other = (YuebaoCashFlow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getLevel_name() == null ? other.getLevel_name() == null : this.getLevel_name().equals(other.getLevel_name()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getAgent_account() == null ? other.getAgent_account() == null : this.getAgent_account().equals(other.getAgent_account()))
            && (this.getTrade_type() == null ? other.getTrade_type() == null : this.getTrade_type().equals(other.getTrade_type()))
            && (this.getFlow_type() == null ? other.getFlow_type() == null : this.getFlow_type().equals(other.getFlow_type()))
            && (this.getDraw_type() == null ? other.getDraw_type() == null : this.getDraw_type().equals(other.getDraw_type()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getTrade_money() == null ? other.getTrade_money() == null : this.getTrade_money().equals(other.getTrade_money()))
            && (this.getDeposit_bill_no() == null ? other.getDeposit_bill_no() == null : this.getDeposit_bill_no().equals(other.getDeposit_bill_no()))
            && (this.getWithdraw_bill_no() == null ? other.getWithdraw_bill_no() == null : this.getWithdraw_bill_no().equals(other.getWithdraw_bill_no()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getOperator_id() == null ? other.getOperator_id() == null : this.getOperator_id().equals(other.getOperator_id()))
            && (this.getOperator_account() == null ? other.getOperator_account() == null : this.getOperator_account().equals(other.getOperator_account()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getMember_remark() == null ? other.getMember_remark() == null : this.getMember_remark().equals(other.getMember_remark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getLevel_name() == null) ? 0 : getLevel_name().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getAgent_account() == null) ? 0 : getAgent_account().hashCode());
        result = prime * result + ((getTrade_type() == null) ? 0 : getTrade_type().hashCode());
        result = prime * result + ((getFlow_type() == null) ? 0 : getFlow_type().hashCode());
        result = prime * result + ((getDraw_type() == null) ? 0 : getDraw_type().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getTrade_money() == null) ? 0 : getTrade_money().hashCode());
        result = prime * result + ((getDeposit_bill_no() == null) ? 0 : getDeposit_bill_no().hashCode());
        result = prime * result + ((getWithdraw_bill_no() == null) ? 0 : getWithdraw_bill_no().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getOperator_id() == null) ? 0 : getOperator_id().hashCode());
        result = prime * result + ((getOperator_account() == null) ? 0 : getOperator_account().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getMember_remark() == null) ? 0 : getMember_remark().hashCode());
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
        sb.append(", level_id=").append(level_id);
        sb.append(", level_name=").append(level_name);
        sb.append(", agent_id=").append(agent_id);
        sb.append(", agent_account=").append(agent_account);
        sb.append(", trade_type=").append(trade_type);
        sb.append(", flow_type=").append(flow_type);
        sb.append(", draw_type=").append(draw_type);
        sb.append(", balance=").append(balance);
        sb.append(", trade_money=").append(trade_money);
        sb.append(", deposit_bill_no=").append(deposit_bill_no);
        sb.append(", withdraw_bill_no=").append(withdraw_bill_no);
        sb.append(", remark=").append(remark);
        sb.append(", create_time=").append(create_time);
        sb.append(", type=").append(type);
        sb.append(", operator_id=").append(operator_id);
        sb.append(", operator_account=").append(operator_account);
        sb.append(", update_time=").append(update_time);
        sb.append(", member_remark=").append(member_remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}