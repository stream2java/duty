package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName mny_recharge_incentive_set
 */
@TableName(value ="mny_recharge_incentive_set")
@Data
public class MnyRechargeIncentiveSet implements Serializable {
    /**
     * 自增id
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 优惠类型id
     */
    @TableField(value = "pay_type")
    private String pay_type;

    /**
     * 优惠类型名称
     */
    @TableField(value = "pay_type_name")
    private String pay_type_name;

    /**
     * mny_code_quantity_set id
     */
    @TableField(value = "code_quantity_id")
    private Object code_quantity_id;

    /**
     * 线上优惠百分比
     */
    @TableField(value = "pre_per_online")
    private String pre_per_online;

    /**
     * 线下存款优惠百分比
     */
    @TableField(value = "pre_per_offline")
    private String pre_per_offline;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

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
        MnyRechargeIncentiveSet other = (MnyRechargeIncentiveSet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPay_type() == null ? other.getPay_type() == null : this.getPay_type().equals(other.getPay_type()))
            && (this.getPay_type_name() == null ? other.getPay_type_name() == null : this.getPay_type_name().equals(other.getPay_type_name()))
            && (this.getCode_quantity_id() == null ? other.getCode_quantity_id() == null : this.getCode_quantity_id().equals(other.getCode_quantity_id()))
            && (this.getPre_per_online() == null ? other.getPre_per_online() == null : this.getPre_per_online().equals(other.getPre_per_online()))
            && (this.getPre_per_offline() == null ? other.getPre_per_offline() == null : this.getPre_per_offline().equals(other.getPre_per_offline()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPay_type() == null) ? 0 : getPay_type().hashCode());
        result = prime * result + ((getPay_type_name() == null) ? 0 : getPay_type_name().hashCode());
        result = prime * result + ((getCode_quantity_id() == null) ? 0 : getCode_quantity_id().hashCode());
        result = prime * result + ((getPre_per_online() == null) ? 0 : getPre_per_online().hashCode());
        result = prime * result + ((getPre_per_offline() == null) ? 0 : getPre_per_offline().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pay_type=").append(pay_type);
        sb.append(", pay_type_name=").append(pay_type_name);
        sb.append(", code_quantity_id=").append(code_quantity_id);
        sb.append(", pre_per_online=").append(pre_per_online);
        sb.append(", pre_per_offline=").append(pre_per_offline);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}