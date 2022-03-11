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
 * @TableName sys_proposal
 */
@TableName(value ="sys_proposal")
@Data
public class SysProposal implements Serializable {
    /**
     * id
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 建议类型
     */
    @TableField(value = "proposal_type")
    private String proposal_type;

    /**
     * 建议内容
     */
    @TableField(value = "proposal_content")
    private String proposal_content;

    /**
     * 账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 所属平台
     */
    @TableField(value = "affiliation_platform")
    private Object affiliation_platform;

    /**
     * 建议时间
     */
    @TableField(value = "proposal_date_time")
    private LocalDateTime proposal_date_time;

    /**
     * 阅读状态  0：未读，1：已读
     */
    @TableField(value = "read_status")
    private Object read_status;

    /**
     * qq号码
     */
    @TableField(value = "qq")
    private String qq;

    /**
     * 手机号码
     */
    @TableField(value = "phone")
    private String phone;

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
        SysProposal other = (SysProposal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProposal_type() == null ? other.getProposal_type() == null : this.getProposal_type().equals(other.getProposal_type()))
            && (this.getProposal_content() == null ? other.getProposal_content() == null : this.getProposal_content().equals(other.getProposal_content()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getAffiliation_platform() == null ? other.getAffiliation_platform() == null : this.getAffiliation_platform().equals(other.getAffiliation_platform()))
            && (this.getProposal_date_time() == null ? other.getProposal_date_time() == null : this.getProposal_date_time().equals(other.getProposal_date_time()))
            && (this.getRead_status() == null ? other.getRead_status() == null : this.getRead_status().equals(other.getRead_status()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProposal_type() == null) ? 0 : getProposal_type().hashCode());
        result = prime * result + ((getProposal_content() == null) ? 0 : getProposal_content().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getAffiliation_platform() == null) ? 0 : getAffiliation_platform().hashCode());
        result = prime * result + ((getProposal_date_time() == null) ? 0 : getProposal_date_time().hashCode());
        result = prime * result + ((getRead_status() == null) ? 0 : getRead_status().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", proposal_type=").append(proposal_type);
        sb.append(", proposal_content=").append(proposal_content);
        sb.append(", account=").append(account);
        sb.append(", affiliation_platform=").append(affiliation_platform);
        sb.append(", proposal_date_time=").append(proposal_date_time);
        sb.append(", read_status=").append(read_status);
        sb.append(", qq=").append(qq);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}