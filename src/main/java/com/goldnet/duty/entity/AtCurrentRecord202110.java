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
 * @TableName at_current_record_202110
 */
@TableName(value ="at_current_record_202110")
@Data
public class AtCurrentRecord202110 implements Serializable {
    /**
     * 
     */
    @TableId(value = "current_record_id")
    private Long current_record_id;

    /**
     * 
     */
    @TableField(value = "money_type")
    private Object money_type;

    /**
     * 
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 
     */
    @TableField(value = "trade_limit")
    private BigDecimal trade_limit;

    /**
     * 
     */
    @TableField(value = "existing_limit")
    private BigDecimal existing_limit;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "priject")
    private String priject;

    /**
     * 
     */
    @TableField(value = "trade_type")
    private String trade_type;

    /**
     * 
     */
    @TableField(value = "money")
    private BigDecimal money;

    /**
     * 
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 
     */
    @TableField(value = "betting_code")
    private String betting_code;

    /**
     * 
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 
     */
    @TableField(value = "flag")
    private Object flag;

    /**
     * 
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 
     */
    @TableField(value = "rate")
    private Object rate;

    /**
     * 
     */
    @TableField(value = "member_account")
    private String member_account;

    /**
     * 
     */
    @TableField(value = "account5")
    private Object account5;

    /**
     * 
     */
    @TableField(value = "agent_account")
    private String agent_account;

    /**
     * 
     */
    @TableField(value = "account2")
    private Object account2;

    /**
     * 
     */
    @TableField(value = "account3")
    private Object account3;

    /**
     * 
     */
    @TableField(value = "account4")
    private Object account4;

    /**
     * 
     */
    @TableField(value = "weixin_temp")
    private String weixin_temp;

    /**
     * 
     */
    @TableField(value = "weixin_nickname")
    private String weixin_nickname;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

    /**
     * 
     */
    @TableField(value = "trade_type_sub")
    private String trade_type_sub;

    /**
     * 
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
        AtCurrentRecord202110 other = (AtCurrentRecord202110) that;
        return (this.getCurrent_record_id() == null ? other.getCurrent_record_id() == null : this.getCurrent_record_id().equals(other.getCurrent_record_id()))
            && (this.getMoney_type() == null ? other.getMoney_type() == null : this.getMoney_type().equals(other.getMoney_type()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getTrade_limit() == null ? other.getTrade_limit() == null : this.getTrade_limit().equals(other.getTrade_limit()))
            && (this.getExisting_limit() == null ? other.getExisting_limit() == null : this.getExisting_limit().equals(other.getExisting_limit()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPriject() == null ? other.getPriject() == null : this.getPriject().equals(other.getPriject()))
            && (this.getTrade_type() == null ? other.getTrade_type() == null : this.getTrade_type().equals(other.getTrade_type()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getBetting_code() == null ? other.getBetting_code() == null : this.getBetting_code().equals(other.getBetting_code()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getAgent_account() == null ? other.getAgent_account() == null : this.getAgent_account().equals(other.getAgent_account()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getWeixin_temp() == null ? other.getWeixin_temp() == null : this.getWeixin_temp().equals(other.getWeixin_temp()))
            && (this.getWeixin_nickname() == null ? other.getWeixin_nickname() == null : this.getWeixin_nickname().equals(other.getWeixin_nickname()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTrade_type_sub() == null ? other.getTrade_type_sub() == null : this.getTrade_type_sub().equals(other.getTrade_type_sub()))
            && (this.getMember_remark() == null ? other.getMember_remark() == null : this.getMember_remark().equals(other.getMember_remark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCurrent_record_id() == null) ? 0 : getCurrent_record_id().hashCode());
        result = prime * result + ((getMoney_type() == null) ? 0 : getMoney_type().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getTrade_limit() == null) ? 0 : getTrade_limit().hashCode());
        result = prime * result + ((getExisting_limit() == null) ? 0 : getExisting_limit().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPriject() == null) ? 0 : getPriject().hashCode());
        result = prime * result + ((getTrade_type() == null) ? 0 : getTrade_type().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getBetting_code() == null) ? 0 : getBetting_code().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getAgent_account() == null) ? 0 : getAgent_account().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getWeixin_temp() == null) ? 0 : getWeixin_temp().hashCode());
        result = prime * result + ((getWeixin_nickname() == null) ? 0 : getWeixin_nickname().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTrade_type_sub() == null) ? 0 : getTrade_type_sub().hashCode());
        result = prime * result + ((getMember_remark() == null) ? 0 : getMember_remark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", current_record_id=").append(current_record_id);
        sb.append(", money_type=").append(money_type);
        sb.append(", account_id=").append(account_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", trade_limit=").append(trade_limit);
        sb.append(", existing_limit=").append(existing_limit);
        sb.append(", remark=").append(remark);
        sb.append(", priject=").append(priject);
        sb.append(", trade_type=").append(trade_type);
        sb.append(", money=").append(money);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", betting_code=").append(betting_code);
        sb.append(", status=").append(status);
        sb.append(", flag=").append(flag);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", update_time=").append(update_time);
        sb.append(", account1=").append(account1);
        sb.append(", rate=").append(rate);
        sb.append(", member_account=").append(member_account);
        sb.append(", account5=").append(account5);
        sb.append(", agent_account=").append(agent_account);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", weixin_temp=").append(weixin_temp);
        sb.append(", weixin_nickname=").append(weixin_nickname);
        sb.append(", type=").append(type);
        sb.append(", trade_type_sub=").append(trade_type_sub);
        sb.append(", member_remark=").append(member_remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}