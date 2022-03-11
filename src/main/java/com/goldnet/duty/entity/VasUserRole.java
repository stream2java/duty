package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 使用者角色對應表
 * @TableName vas_user_role
 */
@TableName(value ="vas_user_role")
@Data
public class VasUserRole implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Object role_id;

    /**
     * 套名
     */
    @TableField(value = "set_id")
    private String set_id;

    /**
     * 站点ID
     */
    @TableField(value = "site_id")
    private Object site_id;

    /**
     * 会员Id
     */
    @TableField(value = "acc_id")
    private Object acc_id;

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
        VasUserRole other = (VasUserRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()))
            && (this.getSet_id() == null ? other.getSet_id() == null : this.getSet_id().equals(other.getSet_id()))
            && (this.getSite_id() == null ? other.getSite_id() == null : this.getSite_id().equals(other.getSite_id()))
            && (this.getAcc_id() == null ? other.getAcc_id() == null : this.getAcc_id().equals(other.getAcc_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        result = prime * result + ((getSet_id() == null) ? 0 : getSet_id().hashCode());
        result = prime * result + ((getSite_id() == null) ? 0 : getSite_id().hashCode());
        result = prime * result + ((getAcc_id() == null) ? 0 : getAcc_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", role_id=").append(role_id);
        sb.append(", set_id=").append(set_id);
        sb.append(", site_id=").append(site_id);
        sb.append(", acc_id=").append(acc_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}