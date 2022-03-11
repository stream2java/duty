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
 * @TableName ge_at_config
 */
@TableName(value ="ge_at_config")
@Data
public class GeAtConfig implements Serializable {
    /**
     * 
     */
    @TableId(value = "org_current_record_id")
    private Long org_current_record_id;

    /**
     * 
     */
    @TableField(value = "current_record_id")
    private Long current_record_id;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 
     */
    @TableField(value = "betting_code")
    private String betting_code;

    /**
     * 
     */
    @TableField(value = "member_account")
    private String member_account;

    /**
     * 
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "trade_limit")
    private BigDecimal trade_limit;

    /**
     * 
     */
    @TableField(value = "fix_status")
    private Boolean fix_status;

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
        GeAtConfig other = (GeAtConfig) that;
        return (this.getOrg_current_record_id() == null ? other.getOrg_current_record_id() == null : this.getOrg_current_record_id().equals(other.getOrg_current_record_id()))
            && (this.getCurrent_record_id() == null ? other.getCurrent_record_id() == null : this.getCurrent_record_id().equals(other.getCurrent_record_id()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getBetting_code() == null ? other.getBetting_code() == null : this.getBetting_code().equals(other.getBetting_code()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getTrade_limit() == null ? other.getTrade_limit() == null : this.getTrade_limit().equals(other.getTrade_limit()))
            && (this.getFix_status() == null ? other.getFix_status() == null : this.getFix_status().equals(other.getFix_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrg_current_record_id() == null) ? 0 : getOrg_current_record_id().hashCode());
        result = prime * result + ((getCurrent_record_id() == null) ? 0 : getCurrent_record_id().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getBetting_code() == null) ? 0 : getBetting_code().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getTrade_limit() == null) ? 0 : getTrade_limit().hashCode());
        result = prime * result + ((getFix_status() == null) ? 0 : getFix_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", org_current_record_id=").append(org_current_record_id);
        sb.append(", current_record_id=").append(current_record_id);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", betting_code=").append(betting_code);
        sb.append(", member_account=").append(member_account);
        sb.append(", account_id=").append(account_id);
        sb.append(", remark=").append(remark);
        sb.append(", trade_limit=").append(trade_limit);
        sb.append(", fix_status=").append(fix_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}