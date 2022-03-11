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
 * 
 * @TableName at_current_record_compare
 */
@TableName(value ="at_current_record_compare")
@Data
public class AtCurrentRecordCompare implements Serializable {
    /**
     * 
     */
    @TableField(value = "durl")
    private String durl;

    /**
     * 
     */
    @TableField(value = "trade_limit")
    private BigDecimal trade_limit;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "member_account")
    private String member_account;

    /**
     * 
     */
    @TableField(value = "betting_code")
    private String betting_code;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 
     */
    @TableField(value = "origin_member_account")
    private String origin_member_account;

    /**
     * 
     */
    @TableField(value = "send_mark")
    private Object send_mark;

    /**
     * 
     */
    @TableField(value = "trade_type")
    private String trade_type;

    /**
     * 
     */
    @TableField(value = "origin_trade_limit")
    private BigDecimal origin_trade_limit;

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
        AtCurrentRecordCompare other = (AtCurrentRecordCompare) that;
        return (this.getDurl() == null ? other.getDurl() == null : this.getDurl().equals(other.getDurl()))
            && (this.getTrade_limit() == null ? other.getTrade_limit() == null : this.getTrade_limit().equals(other.getTrade_limit()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getBetting_code() == null ? other.getBetting_code() == null : this.getBetting_code().equals(other.getBetting_code()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getOrigin_member_account() == null ? other.getOrigin_member_account() == null : this.getOrigin_member_account().equals(other.getOrigin_member_account()))
            && (this.getSend_mark() == null ? other.getSend_mark() == null : this.getSend_mark().equals(other.getSend_mark()))
            && (this.getTrade_type() == null ? other.getTrade_type() == null : this.getTrade_type().equals(other.getTrade_type()))
            && (this.getOrigin_trade_limit() == null ? other.getOrigin_trade_limit() == null : this.getOrigin_trade_limit().equals(other.getOrigin_trade_limit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDurl() == null) ? 0 : getDurl().hashCode());
        result = prime * result + ((getTrade_limit() == null) ? 0 : getTrade_limit().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getBetting_code() == null) ? 0 : getBetting_code().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getOrigin_member_account() == null) ? 0 : getOrigin_member_account().hashCode());
        result = prime * result + ((getSend_mark() == null) ? 0 : getSend_mark().hashCode());
        result = prime * result + ((getTrade_type() == null) ? 0 : getTrade_type().hashCode());
        result = prime * result + ((getOrigin_trade_limit() == null) ? 0 : getOrigin_trade_limit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", durl=").append(durl);
        sb.append(", trade_limit=").append(trade_limit);
        sb.append(", remark=").append(remark);
        sb.append(", member_account=").append(member_account);
        sb.append(", betting_code=").append(betting_code);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", origin_member_account=").append(origin_member_account);
        sb.append(", send_mark=").append(send_mark);
        sb.append(", trade_type=").append(trade_type);
        sb.append(", origin_trade_limit=").append(origin_trade_limit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}