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
 * @TableName mny_add_member_set_v12_bak_02
 */
@TableName(value ="mny_add_member_set_v12_bak_02")
@Data
public class MnyAddMemberSetV12Bak02 implements Serializable {
    /**
     * 
     */
    @TableField(value = "add_member_set_id")
    private Object add_member_set_id;

    /**
     * 
     */
    @TableField(value = "field_name")
    private String field_name;

    /**
     * 
     */
    @TableField(value = "if_show")
    private Object if_show;

    /**
     * 
     */
    @TableField(value = "if_required")
    private Object if_required;

    /**
     * 
     */
    @TableField(value = "if_validate")
    private Object if_validate;

    /**
     * 
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "field_type")
    private Object field_type;

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
        MnyAddMemberSetV12Bak02 other = (MnyAddMemberSetV12Bak02) that;
        return (this.getAdd_member_set_id() == null ? other.getAdd_member_set_id() == null : this.getAdd_member_set_id().equals(other.getAdd_member_set_id()))
            && (this.getField_name() == null ? other.getField_name() == null : this.getField_name().equals(other.getField_name()))
            && (this.getIf_show() == null ? other.getIf_show() == null : this.getIf_show().equals(other.getIf_show()))
            && (this.getIf_required() == null ? other.getIf_required() == null : this.getIf_required().equals(other.getIf_required()))
            && (this.getIf_validate() == null ? other.getIf_validate() == null : this.getIf_validate().equals(other.getIf_validate()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getField_type() == null ? other.getField_type() == null : this.getField_type().equals(other.getField_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdd_member_set_id() == null) ? 0 : getAdd_member_set_id().hashCode());
        result = prime * result + ((getField_name() == null) ? 0 : getField_name().hashCode());
        result = prime * result + ((getIf_show() == null) ? 0 : getIf_show().hashCode());
        result = prime * result + ((getIf_required() == null) ? 0 : getIf_required().hashCode());
        result = prime * result + ((getIf_validate() == null) ? 0 : getIf_validate().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getField_type() == null) ? 0 : getField_type().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", add_member_set_id=").append(add_member_set_id);
        sb.append(", field_name=").append(field_name);
        sb.append(", if_show=").append(if_show);
        sb.append(", if_required=").append(if_required);
        sb.append(", if_validate=").append(if_validate);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", field_type=").append(field_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}