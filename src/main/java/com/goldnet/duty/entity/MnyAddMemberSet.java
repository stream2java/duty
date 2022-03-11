package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 线上新增会员设定表
 * @TableName mny_add_member_set
 */
@TableName(value ="mny_add_member_set")
@Data
public class MnyAddMemberSet implements Serializable {
    /**
     * 线上新增会员设定表id
     */
    @TableId(value = "add_member_set_id")
    private Object add_member_set_id;

    /**
     * 栏位名称
     */
    @TableField(value = "field_name")
    private String field_name;

    /**
     * 是否呈现(0-不呈现,1-呈现)
     */
    @TableField(value = "if_show")
    private Object if_show;

    /**
     * 是否必填(0-不必填,1-必填)
     */
    @TableField(value = "if_required")
    private Object if_required;

    /**
     * 是否验证(0-不验证,1-验证)
     */
    @TableField(value = "if_validate")
    private Object if_validate;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

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

    /**
     * 栏位类型
     */
    @TableField(value = "field_type")
    private Object field_type;

    /**
     * 
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 字段标识
     */
    @TableField(value = "field_code")
    private String field_code;

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
        MnyAddMemberSet other = (MnyAddMemberSet) that;
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
            && (this.getField_type() == null ? other.getField_type() == null : this.getField_type().equals(other.getField_type()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getField_code() == null ? other.getField_code() == null : this.getField_code().equals(other.getField_code()));
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
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getField_code() == null) ? 0 : getField_code().hashCode());
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
        sb.append(", sort=").append(sort);
        sb.append(", field_code=").append(field_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}