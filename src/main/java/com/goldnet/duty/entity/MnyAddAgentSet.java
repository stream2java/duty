package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 会员端新增代理设定
 * @TableName mny_add_agent_set
 */
@TableName(value ="mny_add_agent_set")
@Data
public class MnyAddAgentSet implements Serializable {
    /**
     * 新增代理设定表id
     */
    @TableId(value = "add_agent_set_id")
    private Object add_agent_set_id;

    /**
     * 栏位名称
     */
    @TableField(value = "field_name")
    private String field_name;

    /**
     * 栏位类型
     */
    @TableField(value = "field_type")
    private Object field_type;

    /**
     * 状态设置(0-不验证,1-须验证;若栏位名称为会员端新增代理商,则0-停用,1-启用)
     */
    @TableField(value = "status_set")
    private Object status_set;

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
        MnyAddAgentSet other = (MnyAddAgentSet) that;
        return (this.getAdd_agent_set_id() == null ? other.getAdd_agent_set_id() == null : this.getAdd_agent_set_id().equals(other.getAdd_agent_set_id()))
            && (this.getField_name() == null ? other.getField_name() == null : this.getField_name().equals(other.getField_name()))
            && (this.getField_type() == null ? other.getField_type() == null : this.getField_type().equals(other.getField_type()))
            && (this.getStatus_set() == null ? other.getStatus_set() == null : this.getStatus_set().equals(other.getStatus_set()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdd_agent_set_id() == null) ? 0 : getAdd_agent_set_id().hashCode());
        result = prime * result + ((getField_name() == null) ? 0 : getField_name().hashCode());
        result = prime * result + ((getField_type() == null) ? 0 : getField_type().hashCode());
        result = prime * result + ((getStatus_set() == null) ? 0 : getStatus_set().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", add_agent_set_id=").append(add_agent_set_id);
        sb.append(", field_name=").append(field_name);
        sb.append(", field_type=").append(field_type);
        sb.append(", status_set=").append(status_set);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}