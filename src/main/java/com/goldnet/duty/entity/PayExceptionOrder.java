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
 * 入款异常订单表
 * @TableName pay_exception_order
 */
@TableName(value ="pay_exception_order")
@Data
public class PayExceptionOrder implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 订单号
     */
    @TableField(value = "orderno")
    private String orderno;

    /**
     * 商号ID
     */
    @TableField(value = "merchant_id")
    private Object merchant_id;

    /**
     * 支付平台ID
     */
    @TableField(value = "pay_system_id")
    private Object pay_system_id;

    /**
     * 会员账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 会员ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 时间
     */
    @TableField(value = "createtime")
    private LocalDateTime createtime;

    /**
     * 存入金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 状态
     */
    @TableField(value = "status")
    private String status;

    /**
     * 是否上分
     */
    @TableField(value = "credited")
    private String credited;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

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
        PayExceptionOrder other = (PayExceptionOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderno() == null ? other.getOrderno() == null : this.getOrderno().equals(other.getOrderno()))
            && (this.getMerchant_id() == null ? other.getMerchant_id() == null : this.getMerchant_id().equals(other.getMerchant_id()))
            && (this.getPay_system_id() == null ? other.getPay_system_id() == null : this.getPay_system_id().equals(other.getPay_system_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCredited() == null ? other.getCredited() == null : this.getCredited().equals(other.getCredited()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderno() == null) ? 0 : getOrderno().hashCode());
        result = prime * result + ((getMerchant_id() == null) ? 0 : getMerchant_id().hashCode());
        result = prime * result + ((getPay_system_id() == null) ? 0 : getPay_system_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCredited() == null) ? 0 : getCredited().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderno=").append(orderno);
        sb.append(", merchant_id=").append(merchant_id);
        sb.append(", pay_system_id=").append(pay_system_id);
        sb.append(", account=").append(account);
        sb.append(", account_id=").append(account_id);
        sb.append(", account1=").append(account1);
        sb.append(", createtime=").append(createtime);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", credited=").append(credited);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}