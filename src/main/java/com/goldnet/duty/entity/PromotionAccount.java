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
 * 推广用户表
 * @TableName promotion_account
 */
@TableName(value ="promotion_account")
@Data
public class PromotionAccount implements Serializable {
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
     * 对应at_account表ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 上级线账号数组
     */
    @TableField(value = "accounts")
    private String accounts;

    /**
     * 上级线ID数组
     */
    @TableField(value = "account_ids")
    private Object account_ids;

    /**
     * 直属上级ID
     */
    @TableField(value = "parent_account_id")
    private Object parent_account_id;

    /**
     * 直属上级账号
     */
    @TableField(value = "parent_account")
    private String parent_account;

    /**
     * 推广会员等级，最小为1
     */
    @TableField(value = "level")
    private Integer level;

    /**
     * 下级差充值返点比例
     */
    @TableField(value = "recharge_rebate_percent")
    private BigDecimal recharge_rebate_percent;

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
     * 会员账号,对应at_account表account,
     */
    @TableField(value = "account")
    private String account;

    /**
     * 注册方式：0: 链接注册 1: 会员升级 2: 厅主创建
     */
    @TableField(value = "register_type")
    private Integer register_type;

    /**
     * 自身充值返点比例
     */
    @TableField(value = "self_recharge_rebate_percent")
    private BigDecimal self_recharge_rebate_percent;

    /**
     * 有效投注返点状态(0关闭,1开启)
     */
    @TableField(value = "betting_status")
    private Integer betting_status;

    /**
     * 损益返点开启状态(0关闭,1开启)
     */
    @TableField(value = "profit_status")
    private Integer profit_status;

    /**
     * 充值返点状态(0关闭,1开启)
     */
    @TableField(value = "recharge_status")
    private Integer recharge_status;

    /**
     * 自身有效投注返点状态(0关闭,1开启)
     */
    @TableField(value = "self_betting_status")
    private Integer self_betting_status;

    /**
     * 自身损益返点状态(0关闭,1开启)
     */
    @TableField(value = "self_profit_status")
    private Integer self_profit_status;

    /**
     * 自身充值返点状态(0关闭,1开启)
     */
    @TableField(value = "self_recharge_status")
    private Integer self_recharge_status;

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
        PromotionAccount other = (PromotionAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccounts() == null ? other.getAccounts() == null : this.getAccounts().equals(other.getAccounts()))
            && (this.getAccount_ids() == null ? other.getAccount_ids() == null : this.getAccount_ids().equals(other.getAccount_ids()))
            && (this.getParent_account_id() == null ? other.getParent_account_id() == null : this.getParent_account_id().equals(other.getParent_account_id()))
            && (this.getParent_account() == null ? other.getParent_account() == null : this.getParent_account().equals(other.getParent_account()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getRecharge_rebate_percent() == null ? other.getRecharge_rebate_percent() == null : this.getRecharge_rebate_percent().equals(other.getRecharge_rebate_percent()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getRegister_type() == null ? other.getRegister_type() == null : this.getRegister_type().equals(other.getRegister_type()))
            && (this.getSelf_recharge_rebate_percent() == null ? other.getSelf_recharge_rebate_percent() == null : this.getSelf_recharge_rebate_percent().equals(other.getSelf_recharge_rebate_percent()))
            && (this.getBetting_status() == null ? other.getBetting_status() == null : this.getBetting_status().equals(other.getBetting_status()))
            && (this.getProfit_status() == null ? other.getProfit_status() == null : this.getProfit_status().equals(other.getProfit_status()))
            && (this.getRecharge_status() == null ? other.getRecharge_status() == null : this.getRecharge_status().equals(other.getRecharge_status()))
            && (this.getSelf_betting_status() == null ? other.getSelf_betting_status() == null : this.getSelf_betting_status().equals(other.getSelf_betting_status()))
            && (this.getSelf_profit_status() == null ? other.getSelf_profit_status() == null : this.getSelf_profit_status().equals(other.getSelf_profit_status()))
            && (this.getSelf_recharge_status() == null ? other.getSelf_recharge_status() == null : this.getSelf_recharge_status().equals(other.getSelf_recharge_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        result = prime * result + ((getAccount_ids() == null) ? 0 : getAccount_ids().hashCode());
        result = prime * result + ((getParent_account_id() == null) ? 0 : getParent_account_id().hashCode());
        result = prime * result + ((getParent_account() == null) ? 0 : getParent_account().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getRecharge_rebate_percent() == null) ? 0 : getRecharge_rebate_percent().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getRegister_type() == null) ? 0 : getRegister_type().hashCode());
        result = prime * result + ((getSelf_recharge_rebate_percent() == null) ? 0 : getSelf_recharge_rebate_percent().hashCode());
        result = prime * result + ((getBetting_status() == null) ? 0 : getBetting_status().hashCode());
        result = prime * result + ((getProfit_status() == null) ? 0 : getProfit_status().hashCode());
        result = prime * result + ((getRecharge_status() == null) ? 0 : getRecharge_status().hashCode());
        result = prime * result + ((getSelf_betting_status() == null) ? 0 : getSelf_betting_status().hashCode());
        result = prime * result + ((getSelf_profit_status() == null) ? 0 : getSelf_profit_status().hashCode());
        result = prime * result + ((getSelf_recharge_status() == null) ? 0 : getSelf_recharge_status().hashCode());
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
        sb.append(", account_id=").append(account_id);
        sb.append(", accounts=").append(accounts);
        sb.append(", account_ids=").append(account_ids);
        sb.append(", parent_account_id=").append(parent_account_id);
        sb.append(", parent_account=").append(parent_account);
        sb.append(", level=").append(level);
        sb.append(", recharge_rebate_percent=").append(recharge_rebate_percent);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", account=").append(account);
        sb.append(", register_type=").append(register_type);
        sb.append(", self_recharge_rebate_percent=").append(self_recharge_rebate_percent);
        sb.append(", betting_status=").append(betting_status);
        sb.append(", profit_status=").append(profit_status);
        sb.append(", recharge_status=").append(recharge_status);
        sb.append(", self_betting_status=").append(self_betting_status);
        sb.append(", self_profit_status=").append(self_profit_status);
        sb.append(", self_recharge_status=").append(self_recharge_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}