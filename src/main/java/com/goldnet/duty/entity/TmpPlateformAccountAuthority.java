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
 * @TableName tmp_plateform_account_authority
 */
@TableName(value ="tmp_plateform_account_authority")
@Data
public class TmpPlateformAccountAuthority implements Serializable {
    /**
     * 
     */
    @TableField(value = "account_authority_id")
    private Object account_authority_id;

    /**
     * 
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "authority_id")
    private Object authority_id;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

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
        TmpPlateformAccountAuthority other = (TmpPlateformAccountAuthority) that;
        return (this.getAccount_authority_id() == null ? other.getAccount_authority_id() == null : this.getAccount_authority_id().equals(other.getAccount_authority_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAuthority_id() == null ? other.getAuthority_id() == null : this.getAuthority_id().equals(other.getAuthority_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccount_authority_id() == null) ? 0 : getAccount_authority_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAuthority_id() == null) ? 0 : getAuthority_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", account_authority_id=").append(account_authority_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", authority_id=").append(authority_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}