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
 * 推广链接表
 * @TableName promotion_link
 */
@TableName(value ="promotion_link")
@Data
public class PromotionLink implements Serializable {
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
     * 推广码
     */
    @TableField(value = "promotion_code")
    private String promotion_code;

    /**
     * 充值返点
     */
    @TableField(value = "recharge_rebate_percent")
    private BigDecimal recharge_rebate_percent;

    /**
     * 注册人数
     */
    @TableField(value = "registered_num")
    private Object registered_num;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 失效时间，为null表示永久有效
     */
    @TableField(value = "invalid_time")
    private LocalDateTime invalid_time;

    /**
     * 状态0：有效 1：删除
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
        PromotionLink other = (PromotionLink) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getPromotion_code() == null ? other.getPromotion_code() == null : this.getPromotion_code().equals(other.getPromotion_code()))
            && (this.getRecharge_rebate_percent() == null ? other.getRecharge_rebate_percent() == null : this.getRecharge_rebate_percent().equals(other.getRecharge_rebate_percent()))
            && (this.getRegistered_num() == null ? other.getRegistered_num() == null : this.getRegistered_num().equals(other.getRegistered_num()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getInvalid_time() == null ? other.getInvalid_time() == null : this.getInvalid_time().equals(other.getInvalid_time()))
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
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getPromotion_code() == null) ? 0 : getPromotion_code().hashCode());
        result = prime * result + ((getRecharge_rebate_percent() == null) ? 0 : getRecharge_rebate_percent().hashCode());
        result = prime * result + ((getRegistered_num() == null) ? 0 : getRegistered_num().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getInvalid_time() == null) ? 0 : getInvalid_time().hashCode());
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
        sb.append(", account_id=").append(account_id);
        sb.append(", promotion_code=").append(promotion_code);
        sb.append(", recharge_rebate_percent=").append(recharge_rebate_percent);
        sb.append(", registered_num=").append(registered_num);
        sb.append(", remark=").append(remark);
        sb.append(", invalid_time=").append(invalid_time);
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