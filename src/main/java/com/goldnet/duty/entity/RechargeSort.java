package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName recharge_sort
 */
@TableName(value ="recharge_sort")
@Data
public class RechargeSort implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 大大股东
     */
    @TableField(value = "stockholderid")
    private Object stockholderid;

    /**
     * 
     */
    @TableField(value = "recharge_order")
    private Object recharge_order;

    /**
     * 充值类型
     */
    @TableField(value = "recharge_type_id")
    private Object recharge_type_id;

    /**
     * 充值类型
     */
    @TableField(value = "recharge_type")
    private String recharge_type;

    /**
     * 终端   0：全部   1：PC   2：手机
     */
    @TableField(value = "terminal")
    private Object terminal;

    /**
     * 线上/线下  0：线上  1：线下
     */
    @TableField(value = "online_or_offline")
    private Object online_or_offline;

    /**
     * 银行id
     */
    @TableField(value = "bank_id")
    private Object bank_id;

    /**
     * 银行名称
     */
    @TableField(value = "bank_name")
    private String bank_name;

    /**
     * 0=充值类型排序
1=for银行入款排序
     */
    @TableField(value = "sort_type")
    private Object sort_type;

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
        RechargeSort other = (RechargeSort) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStockholderid() == null ? other.getStockholderid() == null : this.getStockholderid().equals(other.getStockholderid()))
            && (this.getRecharge_order() == null ? other.getRecharge_order() == null : this.getRecharge_order().equals(other.getRecharge_order()))
            && (this.getRecharge_type_id() == null ? other.getRecharge_type_id() == null : this.getRecharge_type_id().equals(other.getRecharge_type_id()))
            && (this.getRecharge_type() == null ? other.getRecharge_type() == null : this.getRecharge_type().equals(other.getRecharge_type()))
            && (this.getTerminal() == null ? other.getTerminal() == null : this.getTerminal().equals(other.getTerminal()))
            && (this.getOnline_or_offline() == null ? other.getOnline_or_offline() == null : this.getOnline_or_offline().equals(other.getOnline_or_offline()))
            && (this.getBank_id() == null ? other.getBank_id() == null : this.getBank_id().equals(other.getBank_id()))
            && (this.getBank_name() == null ? other.getBank_name() == null : this.getBank_name().equals(other.getBank_name()))
            && (this.getSort_type() == null ? other.getSort_type() == null : this.getSort_type().equals(other.getSort_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStockholderid() == null) ? 0 : getStockholderid().hashCode());
        result = prime * result + ((getRecharge_order() == null) ? 0 : getRecharge_order().hashCode());
        result = prime * result + ((getRecharge_type_id() == null) ? 0 : getRecharge_type_id().hashCode());
        result = prime * result + ((getRecharge_type() == null) ? 0 : getRecharge_type().hashCode());
        result = prime * result + ((getTerminal() == null) ? 0 : getTerminal().hashCode());
        result = prime * result + ((getOnline_or_offline() == null) ? 0 : getOnline_or_offline().hashCode());
        result = prime * result + ((getBank_id() == null) ? 0 : getBank_id().hashCode());
        result = prime * result + ((getBank_name() == null) ? 0 : getBank_name().hashCode());
        result = prime * result + ((getSort_type() == null) ? 0 : getSort_type().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stockholderid=").append(stockholderid);
        sb.append(", recharge_order=").append(recharge_order);
        sb.append(", recharge_type_id=").append(recharge_type_id);
        sb.append(", recharge_type=").append(recharge_type);
        sb.append(", terminal=").append(terminal);
        sb.append(", online_or_offline=").append(online_or_offline);
        sb.append(", bank_id=").append(bank_id);
        sb.append(", bank_name=").append(bank_name);
        sb.append(", sort_type=").append(sort_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}