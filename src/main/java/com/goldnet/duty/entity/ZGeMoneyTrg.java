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
 * @TableName z_ge_money_trg
 */
@TableName(value ="z_ge_money_trg")
@Data
public class ZGeMoneyTrg implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Long id;

    /**
     * 
     */
    @TableField(value = "befer_money")
    private BigDecimal befer_money;

    /**
     * 
     */
    @TableField(value = "after_money")
    private BigDecimal after_money;

    /**
     * 
     */
    @TableField(value = "init_money")
    private BigDecimal init_money;

    /**
     * 
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "insert_date")
    private LocalDateTime insert_date;

    /**
     * 
     */
    @TableField(value = "action_type")
    private String action_type;

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
        ZGeMoneyTrg other = (ZGeMoneyTrg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBefer_money() == null ? other.getBefer_money() == null : this.getBefer_money().equals(other.getBefer_money()))
            && (this.getAfter_money() == null ? other.getAfter_money() == null : this.getAfter_money().equals(other.getAfter_money()))
            && (this.getInit_money() == null ? other.getInit_money() == null : this.getInit_money().equals(other.getInit_money()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getInsert_date() == null ? other.getInsert_date() == null : this.getInsert_date().equals(other.getInsert_date()))
            && (this.getAction_type() == null ? other.getAction_type() == null : this.getAction_type().equals(other.getAction_type()))
            && (this.getOther_remark() == null ? other.getOther_remark() == null : this.getOther_remark().equals(other.getOther_remark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBefer_money() == null) ? 0 : getBefer_money().hashCode());
        result = prime * result + ((getAfter_money() == null) ? 0 : getAfter_money().hashCode());
        result = prime * result + ((getInit_money() == null) ? 0 : getInit_money().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getInsert_date() == null) ? 0 : getInsert_date().hashCode());
        result = prime * result + ((getAction_type() == null) ? 0 : getAction_type().hashCode());
        result = prime * result + ((getOther_remark() == null) ? 0 : getOther_remark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", befer_money=").append(befer_money);
        sb.append(", after_money=").append(after_money);
        sb.append(", init_money=").append(init_money);
        sb.append(", account_id=").append(account_id);
        sb.append(", insert_date=").append(insert_date);
        sb.append(", action_type=").append(action_type);
        sb.append(", other_remark=").append(other_remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}