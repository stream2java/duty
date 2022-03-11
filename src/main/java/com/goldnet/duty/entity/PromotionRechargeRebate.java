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
 * 充值实时返水记录表
 * @TableName promotion_recharge_rebate
 */
@TableName(value ="promotion_recharge_rebate")
@Data
public class PromotionRechargeRebate implements Serializable {
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
     * 充值流水记录单号
     */
    @TableField(value = "record_no")
    private String record_no;

    /**
     * 产生此条返水的会员ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 产生此条返水的会员账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 充值金额
     */
    @TableField(value = "recharge_amount")
    private BigDecimal recharge_amount;

    /**
     * 充值类型0:线上存款 1:公司入款 2:人工存入
     */
    @TableField(value = "trade_type")
    private Integer trade_type;

    /**
     * 充值子类型，关联recharge_manage_base表的recharge_type_id字段 -1代表空
     */
    @TableField(value = "trade_sub_type")
    private Integer trade_sub_type;

    /**
     * 返水状态0：未返水 1：已返水 2：已冲销 3：已失效
     */
    @TableField(value = "status")
    private Integer status;

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
        PromotionRechargeRebate other = (PromotionRechargeRebate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getRecord_no() == null ? other.getRecord_no() == null : this.getRecord_no().equals(other.getRecord_no()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getRecharge_amount() == null ? other.getRecharge_amount() == null : this.getRecharge_amount().equals(other.getRecharge_amount()))
            && (this.getTrade_type() == null ? other.getTrade_type() == null : this.getTrade_type().equals(other.getTrade_type()))
            && (this.getTrade_sub_type() == null ? other.getTrade_sub_type() == null : this.getTrade_sub_type().equals(other.getTrade_sub_type()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
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
        result = prime * result + ((getRecord_no() == null) ? 0 : getRecord_no().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getRecharge_amount() == null) ? 0 : getRecharge_amount().hashCode());
        result = prime * result + ((getTrade_type() == null) ? 0 : getTrade_type().hashCode());
        result = prime * result + ((getTrade_sub_type() == null) ? 0 : getTrade_sub_type().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", record_no=").append(record_no);
        sb.append(", account_id=").append(account_id);
        sb.append(", account=").append(account);
        sb.append(", recharge_amount=").append(recharge_amount);
        sb.append(", trade_type=").append(trade_type);
        sb.append(", trade_sub_type=").append(trade_sub_type);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}