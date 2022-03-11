package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 余额宝总账汇总表
 * @TableName yuebao_summary_total
 */
@TableName(value ="yuebao_summary_total")
@Data
public class YuebaoSummaryTotal implements Serializable {
    /**
     * 流水ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 代理ID
     */
    @TableField(value = "agent_id")
    private Object agent_id;

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
     * 代理账号
     */
    @TableField(value = "agent_account")
    private String agent_account;

    /**
     * 买进总额
     */
    @TableField(value = "deposit")
    private BigDecimal deposit;

    /**
     * 提出总额
     */
    @TableField(value = "withdraw")
    private BigDecimal withdraw;

    /**
     * 总利息
     */
    @TableField(value = "interest")
    private BigDecimal interest;

    /**
     * 统计日
     */
    @TableField(value = "summary_date")
    private LocalDate summary_date;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 会员赎回利息笔数
     */
    @TableField(value = "interest_num")
    private Object interest_num;

    /**
     * 人工存入总额
     */
    @TableField(value = "artificial_deposit")
    private BigDecimal artificial_deposit;

    /**
     * 人工提出总额
     */
    @TableField(value = "artificial_draw")
    private BigDecimal artificial_draw;

    /**
     * 人工提出利息总额
     */
    @TableField(value = "artificial_interest")
    private BigDecimal artificial_interest;

    /**
     * 人工提出利息笔数
     */
    @TableField(value = "artificial_interest_num")
    private BigDecimal artificial_interest_num;

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
        YuebaoSummaryTotal other = (YuebaoSummaryTotal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getAgent_account() == null ? other.getAgent_account() == null : this.getAgent_account().equals(other.getAgent_account()))
            && (this.getDeposit() == null ? other.getDeposit() == null : this.getDeposit().equals(other.getDeposit()))
            && (this.getWithdraw() == null ? other.getWithdraw() == null : this.getWithdraw().equals(other.getWithdraw()))
            && (this.getInterest() == null ? other.getInterest() == null : this.getInterest().equals(other.getInterest()))
            && (this.getSummary_date() == null ? other.getSummary_date() == null : this.getSummary_date().equals(other.getSummary_date()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getInterest_num() == null ? other.getInterest_num() == null : this.getInterest_num().equals(other.getInterest_num()))
            && (this.getArtificial_deposit() == null ? other.getArtificial_deposit() == null : this.getArtificial_deposit().equals(other.getArtificial_deposit()))
            && (this.getArtificial_draw() == null ? other.getArtificial_draw() == null : this.getArtificial_draw().equals(other.getArtificial_draw()))
            && (this.getArtificial_interest() == null ? other.getArtificial_interest() == null : this.getArtificial_interest().equals(other.getArtificial_interest()))
            && (this.getArtificial_interest_num() == null ? other.getArtificial_interest_num() == null : this.getArtificial_interest_num().equals(other.getArtificial_interest_num()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getAgent_account() == null) ? 0 : getAgent_account().hashCode());
        result = prime * result + ((getDeposit() == null) ? 0 : getDeposit().hashCode());
        result = prime * result + ((getWithdraw() == null) ? 0 : getWithdraw().hashCode());
        result = prime * result + ((getInterest() == null) ? 0 : getInterest().hashCode());
        result = prime * result + ((getSummary_date() == null) ? 0 : getSummary_date().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getInterest_num() == null) ? 0 : getInterest_num().hashCode());
        result = prime * result + ((getArtificial_deposit() == null) ? 0 : getArtificial_deposit().hashCode());
        result = prime * result + ((getArtificial_draw() == null) ? 0 : getArtificial_draw().hashCode());
        result = prime * result + ((getArtificial_interest() == null) ? 0 : getArtificial_interest().hashCode());
        result = prime * result + ((getArtificial_interest_num() == null) ? 0 : getArtificial_interest_num().hashCode());
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
        sb.append(", agent_id=").append(agent_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", member_account=").append(member_account);
        sb.append(", agent_account=").append(agent_account);
        sb.append(", deposit=").append(deposit);
        sb.append(", withdraw=").append(withdraw);
        sb.append(", interest=").append(interest);
        sb.append(", summary_date=").append(summary_date);
        sb.append(", create_time=").append(create_time);
        sb.append(", interest_num=").append(interest_num);
        sb.append(", artificial_deposit=").append(artificial_deposit);
        sb.append(", artificial_draw=").append(artificial_draw);
        sb.append(", artificial_interest=").append(artificial_interest);
        sb.append(", artificial_interest_num=").append(artificial_interest_num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}