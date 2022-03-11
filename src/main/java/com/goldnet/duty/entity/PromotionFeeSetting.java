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
 * 推广费用设定表
 * @TableName promotion_fee_setting
 */
@TableName(value ="promotion_fee_setting")
@Data
public class PromotionFeeSetting implements Serializable {
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
     * 入款手续费比例
     */
    @TableField(value = "deposit_fee_percent")
    private BigDecimal deposit_fee_percent;

    /**
     * 入款手续费上限
     */
    @TableField(value = "deposit_fee_uplimit")
    private BigDecimal deposit_fee_uplimit;

    /**
     * 出款手续费比例
     */
    @TableField(value = "draw_fee_percent")
    private BigDecimal draw_fee_percent;

    /**
     * 出款手续费上限
     */
    @TableField(value = "draw_fee_uplimit")
    private BigDecimal draw_fee_uplimit;

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
        PromotionFeeSetting other = (PromotionFeeSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getDeposit_fee_percent() == null ? other.getDeposit_fee_percent() == null : this.getDeposit_fee_percent().equals(other.getDeposit_fee_percent()))
            && (this.getDeposit_fee_uplimit() == null ? other.getDeposit_fee_uplimit() == null : this.getDeposit_fee_uplimit().equals(other.getDeposit_fee_uplimit()))
            && (this.getDraw_fee_percent() == null ? other.getDraw_fee_percent() == null : this.getDraw_fee_percent().equals(other.getDraw_fee_percent()))
            && (this.getDraw_fee_uplimit() == null ? other.getDraw_fee_uplimit() == null : this.getDraw_fee_uplimit().equals(other.getDraw_fee_uplimit()))
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
        result = prime * result + ((getDeposit_fee_percent() == null) ? 0 : getDeposit_fee_percent().hashCode());
        result = prime * result + ((getDeposit_fee_uplimit() == null) ? 0 : getDeposit_fee_uplimit().hashCode());
        result = prime * result + ((getDraw_fee_percent() == null) ? 0 : getDraw_fee_percent().hashCode());
        result = prime * result + ((getDraw_fee_uplimit() == null) ? 0 : getDraw_fee_uplimit().hashCode());
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
        sb.append(", deposit_fee_percent=").append(deposit_fee_percent);
        sb.append(", deposit_fee_uplimit=").append(deposit_fee_uplimit);
        sb.append(", draw_fee_percent=").append(draw_fee_percent);
        sb.append(", draw_fee_uplimit=").append(draw_fee_uplimit);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}