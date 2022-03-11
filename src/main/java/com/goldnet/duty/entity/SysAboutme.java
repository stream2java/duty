package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 关于我们
 * @TableName sys_aboutme
 */
@TableName(value ="sys_aboutme")
@Data
public class SysAboutme implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 
     */
    @TableField(value = "qq_skype")
    private String qq_skype;

    /**
     * 电话
     */
    @TableField(value = "tele_phone")
    private String tele_phone;

    /**
     * 中文名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 联系事由
     */
    @TableField(value = "business")
    private String business;

    /**
     * 联系状态
     */
    @TableField(value = "status")
    private String status;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "ip_address")
    private String ip_address;

    /**
     * 
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

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
        SysAboutme other = (SysAboutme) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getQq_skype() == null ? other.getQq_skype() == null : this.getQq_skype().equals(other.getQq_skype()))
            && (this.getTele_phone() == null ? other.getTele_phone() == null : this.getTele_phone().equals(other.getTele_phone()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBusiness() == null ? other.getBusiness() == null : this.getBusiness().equals(other.getBusiness()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getIp_address() == null ? other.getIp_address() == null : this.getIp_address().equals(other.getIp_address()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getQq_skype() == null) ? 0 : getQq_skype().hashCode());
        result = prime * result + ((getTele_phone() == null) ? 0 : getTele_phone().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBusiness() == null) ? 0 : getBusiness().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getIp_address() == null) ? 0 : getIp_address().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", email=").append(email);
        sb.append(", qq_skype=").append(qq_skype);
        sb.append(", tele_phone=").append(tele_phone);
        sb.append(", name=").append(name);
        sb.append(", business=").append(business);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", create_time=").append(create_time);
        sb.append(", ip_address=").append(ip_address);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}