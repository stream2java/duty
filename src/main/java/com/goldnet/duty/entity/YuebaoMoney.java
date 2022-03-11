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
 * @TableName yuebao_money
 */
@TableName(value ="yuebao_money")
@Data
public class YuebaoMoney implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 剩余总金额:总本金+总利息
     */
    @TableField(value = "balance")
    private BigDecimal balance;

    /**
     * 已结算未提现利息
     */
    @TableField(value = "interest")
    private BigDecimal interest;

    /**
     * 已提现利息
     */
    @TableField(value = "withdraw_interest")
    private BigDecimal withdraw_interest;

    /**
     * 会员账号ID
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 会员账号
     */
    @TableField(value = "member_account")
    private String member_account;

    /**
     * 创建人
     */
    @TableField(value = "create_account")
    private String create_account;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改人
     */
    @TableField(value = "update_account")
    private String update_account;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 是否显示金额 0隐藏 1显示
     */
    @TableField(value = "is_show")
    private Object is_show;

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
        YuebaoMoney other = (YuebaoMoney) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getInterest() == null ? other.getInterest() == null : this.getInterest().equals(other.getInterest()))
            && (this.getWithdraw_interest() == null ? other.getWithdraw_interest() == null : this.getWithdraw_interest().equals(other.getWithdraw_interest()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getCreate_account() == null ? other.getCreate_account() == null : this.getCreate_account().equals(other.getCreate_account()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_account() == null ? other.getUpdate_account() == null : this.getUpdate_account().equals(other.getUpdate_account()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getIs_show() == null ? other.getIs_show() == null : this.getIs_show().equals(other.getIs_show()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getInterest() == null) ? 0 : getInterest().hashCode());
        result = prime * result + ((getWithdraw_interest() == null) ? 0 : getWithdraw_interest().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getCreate_account() == null) ? 0 : getCreate_account().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_account() == null) ? 0 : getUpdate_account().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getIs_show() == null) ? 0 : getIs_show().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", balance=").append(balance);
        sb.append(", interest=").append(interest);
        sb.append(", withdraw_interest=").append(withdraw_interest);
        sb.append(", member_id=").append(member_id);
        sb.append(", member_account=").append(member_account);
        sb.append(", create_account=").append(create_account);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_account=").append(update_account);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", is_show=").append(is_show);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}