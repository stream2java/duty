package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName pay_money_setting
 */
@TableName(value ="pay_money_setting")
@Data
public class PayMoneySetting implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 关联ID，线上入款：此ID为商号ID，线下入款：此ID为支付类型ID
     */
    @TableField(value = "correlation_id")
    private Object correlation_id;

    /**
     * 厅主ID
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 快选金额1
     */
    @TableField(value = "fast_select_money1")
    private Object fast_select_money1;

    /**
     * 快选金额2
     */
    @TableField(value = "fast_select_money2")
    private Object fast_select_money2;

    /**
     * 快选金额3
     */
    @TableField(value = "fast_select_money3")
    private Object fast_select_money3;

    /**
     * 快选金额4
     */
    @TableField(value = "fast_select_money4")
    private Object fast_select_money4;

    /**
     * 快选金额5
     */
    @TableField(value = "fast_select_money5")
    private Object fast_select_money5;

    /**
     *  是否支持小数点（0：不支持，1：支持）
     */
    @TableField(value = "is_support_decimal")
    private Object is_support_decimal;

    /**
     * 入款类型（0：线上  1：线下）
     */
    @TableField(value = "income_type")
    private Object income_type;

    /**
     * 是否支持手动输入金额（0：不支持，1支持）
     */
    @TableField(value = "is_input_money_status")
    private Object is_input_money_status;

    /**
     * 是否显示快选金额   0：不显示     1：显示
     */
    @TableField(value = "is_show_fast_select_money")
    private Object is_show_fast_select_money;

    /**
     * 入款名称
     */
    @TableField(value = "income_name")
    private String income_name;

    /**
     * 快选金额,0代表null
     */
    @TableField(value = "fast_select_money")
    private Object fast_select_money;

    /**
     * 前端显示提示语
     */
    @TableField(value = "front_end_remarks")
    private String front_end_remarks;

    /**
     * 充值类型排序
     */
    @TableField(value = "recharge_order")
    private Object recharge_order;

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
        PayMoneySetting other = (PayMoneySetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCorrelation_id() == null ? other.getCorrelation_id() == null : this.getCorrelation_id().equals(other.getCorrelation_id()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getFast_select_money1() == null ? other.getFast_select_money1() == null : this.getFast_select_money1().equals(other.getFast_select_money1()))
            && (this.getFast_select_money2() == null ? other.getFast_select_money2() == null : this.getFast_select_money2().equals(other.getFast_select_money2()))
            && (this.getFast_select_money3() == null ? other.getFast_select_money3() == null : this.getFast_select_money3().equals(other.getFast_select_money3()))
            && (this.getFast_select_money4() == null ? other.getFast_select_money4() == null : this.getFast_select_money4().equals(other.getFast_select_money4()))
            && (this.getFast_select_money5() == null ? other.getFast_select_money5() == null : this.getFast_select_money5().equals(other.getFast_select_money5()))
            && (this.getIs_support_decimal() == null ? other.getIs_support_decimal() == null : this.getIs_support_decimal().equals(other.getIs_support_decimal()))
            && (this.getIncome_type() == null ? other.getIncome_type() == null : this.getIncome_type().equals(other.getIncome_type()))
            && (this.getIs_input_money_status() == null ? other.getIs_input_money_status() == null : this.getIs_input_money_status().equals(other.getIs_input_money_status()))
            && (this.getIs_show_fast_select_money() == null ? other.getIs_show_fast_select_money() == null : this.getIs_show_fast_select_money().equals(other.getIs_show_fast_select_money()))
            && (this.getIncome_name() == null ? other.getIncome_name() == null : this.getIncome_name().equals(other.getIncome_name()))
            && (this.getFast_select_money() == null ? other.getFast_select_money() == null : this.getFast_select_money().equals(other.getFast_select_money()))
            && (this.getFront_end_remarks() == null ? other.getFront_end_remarks() == null : this.getFront_end_remarks().equals(other.getFront_end_remarks()))
            && (this.getRecharge_order() == null ? other.getRecharge_order() == null : this.getRecharge_order().equals(other.getRecharge_order()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCorrelation_id() == null) ? 0 : getCorrelation_id().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getFast_select_money1() == null) ? 0 : getFast_select_money1().hashCode());
        result = prime * result + ((getFast_select_money2() == null) ? 0 : getFast_select_money2().hashCode());
        result = prime * result + ((getFast_select_money3() == null) ? 0 : getFast_select_money3().hashCode());
        result = prime * result + ((getFast_select_money4() == null) ? 0 : getFast_select_money4().hashCode());
        result = prime * result + ((getFast_select_money5() == null) ? 0 : getFast_select_money5().hashCode());
        result = prime * result + ((getIs_support_decimal() == null) ? 0 : getIs_support_decimal().hashCode());
        result = prime * result + ((getIncome_type() == null) ? 0 : getIncome_type().hashCode());
        result = prime * result + ((getIs_input_money_status() == null) ? 0 : getIs_input_money_status().hashCode());
        result = prime * result + ((getIs_show_fast_select_money() == null) ? 0 : getIs_show_fast_select_money().hashCode());
        result = prime * result + ((getIncome_name() == null) ? 0 : getIncome_name().hashCode());
        result = prime * result + ((getFast_select_money() == null) ? 0 : getFast_select_money().hashCode());
        result = prime * result + ((getFront_end_remarks() == null) ? 0 : getFront_end_remarks().hashCode());
        result = prime * result + ((getRecharge_order() == null) ? 0 : getRecharge_order().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", correlation_id=").append(correlation_id);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", fast_select_money1=").append(fast_select_money1);
        sb.append(", fast_select_money2=").append(fast_select_money2);
        sb.append(", fast_select_money3=").append(fast_select_money3);
        sb.append(", fast_select_money4=").append(fast_select_money4);
        sb.append(", fast_select_money5=").append(fast_select_money5);
        sb.append(", is_support_decimal=").append(is_support_decimal);
        sb.append(", income_type=").append(income_type);
        sb.append(", is_input_money_status=").append(is_input_money_status);
        sb.append(", is_show_fast_select_money=").append(is_show_fast_select_money);
        sb.append(", income_name=").append(income_name);
        sb.append(", fast_select_money=").append(fast_select_money);
        sb.append(", front_end_remarks=").append(front_end_remarks);
        sb.append(", recharge_order=").append(recharge_order);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}