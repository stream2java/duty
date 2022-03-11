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
 * 推广返点事件详情表
 * @TableName promotion_rebate_detail
 */
@TableName(value ="promotion_rebate_detail")
@Data
public class PromotionRebateDetail implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 返水事件ID
     */
    @TableField(value = "event_id")
    private Object event_id;

    /**
     * 返水账号ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 返水账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 下级ID
     */
    @TableField(value = "sub_id")
    private Object sub_id;

    /**
     * 下级账号
     */
    @TableField(value = "sub_account")
    private String sub_account;

    /**
     * 产生此条返水的会员ID
     */
    @TableField(value = "mem_id")
    private Object mem_id;

    /**
     * 有效返水投注额
     */
    @TableField(value = "bet_valid_amount")
    private BigDecimal bet_valid_amount;

    /**
     * 投注返水金额
     */
    @TableField(value = "bet_rebate_amount")
    private BigDecimal bet_rebate_amount;

    /**
     * 有效损益金额
     */
    @TableField(value = "profit_valid_amount")
    private BigDecimal profit_valid_amount;

    /**
     * 损益返水金额
     */
    @TableField(value = "profit_rebate_amount")
    private BigDecimal profit_rebate_amount;

    /**
     * 返水状态0：未返水 1：已返水 2：已冲销
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 返水时间
     */
    @TableField(value = "rebate_time")
    private LocalDateTime rebate_time;

    /**
     * 冲销时间
     */
    @TableField(value = "revert_time")
    private LocalDateTime revert_time;

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
        PromotionRebateDetail other = (PromotionRebateDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getEvent_id() == null ? other.getEvent_id() == null : this.getEvent_id().equals(other.getEvent_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getSub_id() == null ? other.getSub_id() == null : this.getSub_id().equals(other.getSub_id()))
            && (this.getSub_account() == null ? other.getSub_account() == null : this.getSub_account().equals(other.getSub_account()))
            && (this.getMem_id() == null ? other.getMem_id() == null : this.getMem_id().equals(other.getMem_id()))
            && (this.getBet_valid_amount() == null ? other.getBet_valid_amount() == null : this.getBet_valid_amount().equals(other.getBet_valid_amount()))
            && (this.getBet_rebate_amount() == null ? other.getBet_rebate_amount() == null : this.getBet_rebate_amount().equals(other.getBet_rebate_amount()))
            && (this.getProfit_valid_amount() == null ? other.getProfit_valid_amount() == null : this.getProfit_valid_amount().equals(other.getProfit_valid_amount()))
            && (this.getProfit_rebate_amount() == null ? other.getProfit_rebate_amount() == null : this.getProfit_rebate_amount().equals(other.getProfit_rebate_amount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRebate_time() == null ? other.getRebate_time() == null : this.getRebate_time().equals(other.getRebate_time()))
            && (this.getRevert_time() == null ? other.getRevert_time() == null : this.getRevert_time().equals(other.getRevert_time()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getEvent_id() == null) ? 0 : getEvent_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getSub_id() == null) ? 0 : getSub_id().hashCode());
        result = prime * result + ((getSub_account() == null) ? 0 : getSub_account().hashCode());
        result = prime * result + ((getMem_id() == null) ? 0 : getMem_id().hashCode());
        result = prime * result + ((getBet_valid_amount() == null) ? 0 : getBet_valid_amount().hashCode());
        result = prime * result + ((getBet_rebate_amount() == null) ? 0 : getBet_rebate_amount().hashCode());
        result = prime * result + ((getProfit_valid_amount() == null) ? 0 : getProfit_valid_amount().hashCode());
        result = prime * result + ((getProfit_rebate_amount() == null) ? 0 : getProfit_rebate_amount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRebate_time() == null) ? 0 : getRebate_time().hashCode());
        result = prime * result + ((getRevert_time() == null) ? 0 : getRevert_time().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
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
        sb.append(", event_id=").append(event_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", account=").append(account);
        sb.append(", sub_id=").append(sub_id);
        sb.append(", sub_account=").append(sub_account);
        sb.append(", mem_id=").append(mem_id);
        sb.append(", bet_valid_amount=").append(bet_valid_amount);
        sb.append(", bet_rebate_amount=").append(bet_rebate_amount);
        sb.append(", profit_valid_amount=").append(profit_valid_amount);
        sb.append(", profit_rebate_amount=").append(profit_rebate_amount);
        sb.append(", status=").append(status);
        sb.append(", rebate_time=").append(rebate_time);
        sb.append(", revert_time=").append(revert_time);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}