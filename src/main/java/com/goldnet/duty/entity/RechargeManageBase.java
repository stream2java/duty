package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName recharge_manage_base
 */
@TableName(value ="recharge_manage_base")
@Data
public class RechargeManageBase implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 充值类型
     */
    @TableField(value = "recharge_type")
    private String recharge_type;

    /**
     * 充值类型ID
     */
    @TableField(value = "recharge_type_id")
    private Object recharge_type_id;

    /**
     * 排序字段
     */
    @TableField(value = "order_index")
    private Object order_index;

    /**
     * 线上/线下  0：线上  1：线下
     */
    @TableField(value = "online_or_offline")
    private Object online_or_offline;

    /**
     * 图片地址
     */
    @TableField(value = "picture_address")
    private String picture_address;

    /**
     * 终端   0：全部   1：PC   2：手机
     */
    @TableField(value = "terminal")
    private Object terminal;

    /**
     * 入款名称
     */
    @TableField(value = "income_name")
    private String income_name;

    /**
     * 支付类型：如线上线下同为微信扫码即归为一个类型
     */
    @TableField(value = "pay_type")
    private String pay_type;

    /**
     * 0：展示，1：隐藏
     */
    @TableField(value = "is_show")
    private Integer is_show;

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
        RechargeManageBase other = (RechargeManageBase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRecharge_type() == null ? other.getRecharge_type() == null : this.getRecharge_type().equals(other.getRecharge_type()))
            && (this.getRecharge_type_id() == null ? other.getRecharge_type_id() == null : this.getRecharge_type_id().equals(other.getRecharge_type_id()))
            && (this.getOrder_index() == null ? other.getOrder_index() == null : this.getOrder_index().equals(other.getOrder_index()))
            && (this.getOnline_or_offline() == null ? other.getOnline_or_offline() == null : this.getOnline_or_offline().equals(other.getOnline_or_offline()))
            && (this.getPicture_address() == null ? other.getPicture_address() == null : this.getPicture_address().equals(other.getPicture_address()))
            && (this.getTerminal() == null ? other.getTerminal() == null : this.getTerminal().equals(other.getTerminal()))
            && (this.getIncome_name() == null ? other.getIncome_name() == null : this.getIncome_name().equals(other.getIncome_name()))
            && (this.getPay_type() == null ? other.getPay_type() == null : this.getPay_type().equals(other.getPay_type()))
            && (this.getIs_show() == null ? other.getIs_show() == null : this.getIs_show().equals(other.getIs_show()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRecharge_type() == null) ? 0 : getRecharge_type().hashCode());
        result = prime * result + ((getRecharge_type_id() == null) ? 0 : getRecharge_type_id().hashCode());
        result = prime * result + ((getOrder_index() == null) ? 0 : getOrder_index().hashCode());
        result = prime * result + ((getOnline_or_offline() == null) ? 0 : getOnline_or_offline().hashCode());
        result = prime * result + ((getPicture_address() == null) ? 0 : getPicture_address().hashCode());
        result = prime * result + ((getTerminal() == null) ? 0 : getTerminal().hashCode());
        result = prime * result + ((getIncome_name() == null) ? 0 : getIncome_name().hashCode());
        result = prime * result + ((getPay_type() == null) ? 0 : getPay_type().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", recharge_type=").append(recharge_type);
        sb.append(", recharge_type_id=").append(recharge_type_id);
        sb.append(", order_index=").append(order_index);
        sb.append(", online_or_offline=").append(online_or_offline);
        sb.append(", picture_address=").append(picture_address);
        sb.append(", terminal=").append(terminal);
        sb.append(", income_name=").append(income_name);
        sb.append(", pay_type=").append(pay_type);
        sb.append(", is_show=").append(is_show);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}