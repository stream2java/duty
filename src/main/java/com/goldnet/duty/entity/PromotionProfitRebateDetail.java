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
 * @TableName promotion_profit_rebate_detail
 */
@TableName(value ="promotion_profit_rebate_detail")
@Data
public class PromotionProfitRebateDetail implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 返佣事件ID
     */
    @TableField(value = "event_id")
    private Object event_id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 返水账号ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 返水会员账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 直属下级团队手续费
     */
    @TableField(value = "sub_fee")
    private BigDecimal sub_fee;

    /**
     * 当期总佣金
     */
    @TableField(value = "current_commission")
    private BigDecimal current_commission;

    /**
     * 上期佣金挂账
     */
    @TableField(value = "last_commission")
    private BigDecimal last_commission;

    /**
     * 总佣金
     */
    @TableField(value = "total_commission")
    private BigDecimal total_commission;

    /**
     * 直属下级团队损益总额
     */
    @TableField(value = "sub_profit_amount")
    private BigDecimal sub_profit_amount;

    /**
     * 返佣状态0：未返佣  1：已返佣  2：已冲销 3：挂账 4：已清零 5：已还原
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 事件中间时间
     */
    @TableField(value = "intermediate_state_time")
    private LocalDateTime intermediate_state_time;

    /**
     * 事件终结时间
     */
    @TableField(value = "terminal_state_time")
    private LocalDateTime terminal_state_time;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 有效会员数
     */
    @TableField(value = "effective_account")
    private Object effective_account;

    /**
     * 上级会员名称
     */
    @TableField(value = "parent_accounts")
    private String parent_accounts;

    /**
     * 平台返佣占比
     */
    @TableField(value = "depot_rebate_percent")
    private BigDecimal depot_rebate_percent;

    /**
     * 会员类型
     */
    @TableField(value = "account_type")
    private String account_type;

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
        PromotionProfitRebateDetail other = (PromotionProfitRebateDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEvent_id() == null ? other.getEvent_id() == null : this.getEvent_id().equals(other.getEvent_id()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getSub_fee() == null ? other.getSub_fee() == null : this.getSub_fee().equals(other.getSub_fee()))
            && (this.getCurrent_commission() == null ? other.getCurrent_commission() == null : this.getCurrent_commission().equals(other.getCurrent_commission()))
            && (this.getLast_commission() == null ? other.getLast_commission() == null : this.getLast_commission().equals(other.getLast_commission()))
            && (this.getTotal_commission() == null ? other.getTotal_commission() == null : this.getTotal_commission().equals(other.getTotal_commission()))
            && (this.getSub_profit_amount() == null ? other.getSub_profit_amount() == null : this.getSub_profit_amount().equals(other.getSub_profit_amount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIntermediate_state_time() == null ? other.getIntermediate_state_time() == null : this.getIntermediate_state_time().equals(other.getIntermediate_state_time()))
            && (this.getTerminal_state_time() == null ? other.getTerminal_state_time() == null : this.getTerminal_state_time().equals(other.getTerminal_state_time()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getEffective_account() == null ? other.getEffective_account() == null : this.getEffective_account().equals(other.getEffective_account()))
            && (this.getParent_accounts() == null ? other.getParent_accounts() == null : this.getParent_accounts().equals(other.getParent_accounts()))
            && (this.getDepot_rebate_percent() == null ? other.getDepot_rebate_percent() == null : this.getDepot_rebate_percent().equals(other.getDepot_rebate_percent()))
            && (this.getAccount_type() == null ? other.getAccount_type() == null : this.getAccount_type().equals(other.getAccount_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEvent_id() == null) ? 0 : getEvent_id().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getSub_fee() == null) ? 0 : getSub_fee().hashCode());
        result = prime * result + ((getCurrent_commission() == null) ? 0 : getCurrent_commission().hashCode());
        result = prime * result + ((getLast_commission() == null) ? 0 : getLast_commission().hashCode());
        result = prime * result + ((getTotal_commission() == null) ? 0 : getTotal_commission().hashCode());
        result = prime * result + ((getSub_profit_amount() == null) ? 0 : getSub_profit_amount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIntermediate_state_time() == null) ? 0 : getIntermediate_state_time().hashCode());
        result = prime * result + ((getTerminal_state_time() == null) ? 0 : getTerminal_state_time().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getEffective_account() == null) ? 0 : getEffective_account().hashCode());
        result = prime * result + ((getParent_accounts() == null) ? 0 : getParent_accounts().hashCode());
        result = prime * result + ((getDepot_rebate_percent() == null) ? 0 : getDepot_rebate_percent().hashCode());
        result = prime * result + ((getAccount_type() == null) ? 0 : getAccount_type().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", event_id=").append(event_id);
        sb.append(", account1=").append(account1);
        sb.append(", account_id=").append(account_id);
        sb.append(", account=").append(account);
        sb.append(", sub_fee=").append(sub_fee);
        sb.append(", current_commission=").append(current_commission);
        sb.append(", last_commission=").append(last_commission);
        sb.append(", total_commission=").append(total_commission);
        sb.append(", sub_profit_amount=").append(sub_profit_amount);
        sb.append(", status=").append(status);
        sb.append(", intermediate_state_time=").append(intermediate_state_time);
        sb.append(", terminal_state_time=").append(terminal_state_time);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", effective_account=").append(effective_account);
        sb.append(", parent_accounts=").append(parent_accounts);
        sb.append(", depot_rebate_percent=").append(depot_rebate_percent);
        sb.append(", account_type=").append(account_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}