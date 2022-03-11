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
 * 额度转换流程
 * @TableName api_trunpoint
 */
@TableName(value ="api_trunpoint")
@Data
public class ApiTrunpoint implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 大大股东id
     */
    @TableField(value = "account_id1")
    private Object account_id1;

    /**
     * 会员id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 转出平台
     */
    @TableField(value = "out_platform")
    private String out_platform;

    /**
     * 转出平台时余额
     */
    @TableField(value = "out_balance")
    private BigDecimal out_balance;

    /**
     * 转入平台
     */
    @TableField(value = "in_platform")
    private String in_platform;

    /**
     * 转入平台时余额
     */
    @TableField(value = "in_balance")
    private BigDecimal in_balance;

    /**
     * 转点金额
     */
    @TableField(value = "trade_money")
    private BigDecimal trade_money;

    /**
     * 流程步骤0:待验证,1:验证成功
     */
    @TableField(value = "flow")
    private Object flow;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 交易单号
     */
    @TableField(value = "deal_sn")
    private String deal_sn;

    /**
     * 第三方交易单号
     */
    @TableField(value = "payment_id")
    private String payment_id;

    /**
     * 会员帐号
     */
    @TableField(value = "create_user")
    private String create_user;

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
        ApiTrunpoint other = (ApiTrunpoint) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount_id1() == null ? other.getAccount_id1() == null : this.getAccount_id1().equals(other.getAccount_id1()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getOut_platform() == null ? other.getOut_platform() == null : this.getOut_platform().equals(other.getOut_platform()))
            && (this.getOut_balance() == null ? other.getOut_balance() == null : this.getOut_balance().equals(other.getOut_balance()))
            && (this.getIn_platform() == null ? other.getIn_platform() == null : this.getIn_platform().equals(other.getIn_platform()))
            && (this.getIn_balance() == null ? other.getIn_balance() == null : this.getIn_balance().equals(other.getIn_balance()))
            && (this.getTrade_money() == null ? other.getTrade_money() == null : this.getTrade_money().equals(other.getTrade_money()))
            && (this.getFlow() == null ? other.getFlow() == null : this.getFlow().equals(other.getFlow()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDeal_sn() == null ? other.getDeal_sn() == null : this.getDeal_sn().equals(other.getDeal_sn()))
            && (this.getPayment_id() == null ? other.getPayment_id() == null : this.getPayment_id().equals(other.getPayment_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount_id1() == null) ? 0 : getAccount_id1().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getOut_platform() == null) ? 0 : getOut_platform().hashCode());
        result = prime * result + ((getOut_balance() == null) ? 0 : getOut_balance().hashCode());
        result = prime * result + ((getIn_platform() == null) ? 0 : getIn_platform().hashCode());
        result = prime * result + ((getIn_balance() == null) ? 0 : getIn_balance().hashCode());
        result = prime * result + ((getTrade_money() == null) ? 0 : getTrade_money().hashCode());
        result = prime * result + ((getFlow() == null) ? 0 : getFlow().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDeal_sn() == null) ? 0 : getDeal_sn().hashCode());
        result = prime * result + ((getPayment_id() == null) ? 0 : getPayment_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account_id1=").append(account_id1);
        sb.append(", account_id=").append(account_id);
        sb.append(", out_platform=").append(out_platform);
        sb.append(", out_balance=").append(out_balance);
        sb.append(", in_platform=").append(in_platform);
        sb.append(", in_balance=").append(in_balance);
        sb.append(", trade_money=").append(trade_money);
        sb.append(", flow=").append(flow);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", remark=").append(remark);
        sb.append(", deal_sn=").append(deal_sn);
        sb.append(", payment_id=").append(payment_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}