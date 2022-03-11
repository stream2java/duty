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
 * 足球游戏退水表
 * @TableName ge_zq_discount
 */
@TableName(value ="ge_zq_discount")
@Data
public class GeZqDiscount implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "discount_id")
    private Object discount_id;

    /**
     * 哪一种玩法的退水比例
     */
    @TableField(value = "bet_type")
    private Object bet_type;

    /**
     * 退水比例
     */
    @TableField(value = "discount")
    private BigDecimal discount;

    /**
     * 哪一个大大股东的设定
     */
    @TableField(value = "account")
    private Object account;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 修改者
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
        GeZqDiscount other = (GeZqDiscount) that;
        return (this.getDiscount_id() == null ? other.getDiscount_id() == null : this.getDiscount_id().equals(other.getDiscount_id()))
            && (this.getBet_type() == null ? other.getBet_type() == null : this.getBet_type().equals(other.getBet_type()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDiscount_id() == null) ? 0 : getDiscount_id().hashCode());
        result = prime * result + ((getBet_type() == null) ? 0 : getBet_type().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", discount_id=").append(discount_id);
        sb.append(", bet_type=").append(bet_type);
        sb.append(", discount=").append(discount);
        sb.append(", account=").append(account);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}