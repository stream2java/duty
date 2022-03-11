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
 * @TableName gd_at_current_record_trg
 */
@TableName(value ="gd_at_current_record_trg")
@Data
public class GdAtCurrentRecordTrg implements Serializable {
    /**
     * 
     */
    @TableField(value = "current_record_id")
    private Long current_record_id;

    /**
     * 
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "old_trade_limit")
    private BigDecimal old_trade_limit;

    /**
     * 
     */
    @TableField(value = "new_trade_limit")
    private BigDecimal new_trade_limit;

    /**
     * 
     */
    @TableField(value = "old_existing_limit")
    private BigDecimal old_existing_limit;

    /**
     * 
     */
    @TableField(value = "new_existing_limit")
    private BigDecimal new_existing_limit;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "trade_type")
    private String trade_type;

    /**
     * 
     */
    @TableField(value = "old_money")
    private BigDecimal old_money;

    /**
     * 
     */
    @TableField(value = "new_money")
    private BigDecimal new_money;

    /**
     * 
     */
    @TableField(value = "insert_date")
    private LocalDateTime insert_date;

    /**
     * 
     */
    @TableField(value = "other_remark")
    private String other_remark;

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
        GdAtCurrentRecordTrg other = (GdAtCurrentRecordTrg) that;
        return (this.getCurrent_record_id() == null ? other.getCurrent_record_id() == null : this.getCurrent_record_id().equals(other.getCurrent_record_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getOld_trade_limit() == null ? other.getOld_trade_limit() == null : this.getOld_trade_limit().equals(other.getOld_trade_limit()))
            && (this.getNew_trade_limit() == null ? other.getNew_trade_limit() == null : this.getNew_trade_limit().equals(other.getNew_trade_limit()))
            && (this.getOld_existing_limit() == null ? other.getOld_existing_limit() == null : this.getOld_existing_limit().equals(other.getOld_existing_limit()))
            && (this.getNew_existing_limit() == null ? other.getNew_existing_limit() == null : this.getNew_existing_limit().equals(other.getNew_existing_limit()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getTrade_type() == null ? other.getTrade_type() == null : this.getTrade_type().equals(other.getTrade_type()))
            && (this.getOld_money() == null ? other.getOld_money() == null : this.getOld_money().equals(other.getOld_money()))
            && (this.getNew_money() == null ? other.getNew_money() == null : this.getNew_money().equals(other.getNew_money()))
            && (this.getInsert_date() == null ? other.getInsert_date() == null : this.getInsert_date().equals(other.getInsert_date()))
            && (this.getOther_remark() == null ? other.getOther_remark() == null : this.getOther_remark().equals(other.getOther_remark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCurrent_record_id() == null) ? 0 : getCurrent_record_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getOld_trade_limit() == null) ? 0 : getOld_trade_limit().hashCode());
        result = prime * result + ((getNew_trade_limit() == null) ? 0 : getNew_trade_limit().hashCode());
        result = prime * result + ((getOld_existing_limit() == null) ? 0 : getOld_existing_limit().hashCode());
        result = prime * result + ((getNew_existing_limit() == null) ? 0 : getNew_existing_limit().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getTrade_type() == null) ? 0 : getTrade_type().hashCode());
        result = prime * result + ((getOld_money() == null) ? 0 : getOld_money().hashCode());
        result = prime * result + ((getNew_money() == null) ? 0 : getNew_money().hashCode());
        result = prime * result + ((getInsert_date() == null) ? 0 : getInsert_date().hashCode());
        result = prime * result + ((getOther_remark() == null) ? 0 : getOther_remark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", current_record_id=").append(current_record_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", old_trade_limit=").append(old_trade_limit);
        sb.append(", new_trade_limit=").append(new_trade_limit);
        sb.append(", old_existing_limit=").append(old_existing_limit);
        sb.append(", new_existing_limit=").append(new_existing_limit);
        sb.append(", remark=").append(remark);
        sb.append(", trade_type=").append(trade_type);
        sb.append(", old_money=").append(old_money);
        sb.append(", new_money=").append(new_money);
        sb.append(", insert_date=").append(insert_date);
        sb.append(", other_remark=").append(other_remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}