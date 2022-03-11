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
 * @TableName ge_login_password_setting
 */
@TableName(value ="ge_login_password_setting")
@Data
public class GeLoginPasswordSetting implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 会员密码修改是否开启 0关闭 1开启
     */
    @TableField(value = "member_status")
    private Object member_status;

    /**
     * 会员密码有效期
     */
    @TableField(value = "member_cycle")
    private String member_cycle;

    /**
     * 会员密码过期提醒方式   1强制修改 2每次登录提醒
     */
    @TableField(value = "member_reminder")
    private Object member_reminder;

    /**
     * 子账号密码修改是否开启 0关闭 1开启
     */
    @TableField(value = "sub_account_status")
    private Object sub_account_status;

    /**
     * 子账号密码有效期
     */
    @TableField(value = "sub_account_cycle")
    private String sub_account_cycle;

    /**
     * 子账号密码过期提醒方式   1强制修改 2每次登录提醒
     */
    @TableField(value = "sub_account_reminder")
    private Object sub_account_reminder;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 自行修改密码开关(self_help_modify_pwd_symbol)标志(取值范围：on/ON:开启  off/OFF：关闭)
     */
    @TableField(value = "sh_mpwd_symbol")
    private String sh_mpwd_symbol;

    /**
     * 密码强度不足修改方式 1会员自行修改密码 2通过客服修改密码
     */
    @TableField(value = "member_changepwd")
    private Object member_changepwd;

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
        GeLoginPasswordSetting other = (GeLoginPasswordSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getMember_status() == null ? other.getMember_status() == null : this.getMember_status().equals(other.getMember_status()))
            && (this.getMember_cycle() == null ? other.getMember_cycle() == null : this.getMember_cycle().equals(other.getMember_cycle()))
            && (this.getMember_reminder() == null ? other.getMember_reminder() == null : this.getMember_reminder().equals(other.getMember_reminder()))
            && (this.getSub_account_status() == null ? other.getSub_account_status() == null : this.getSub_account_status().equals(other.getSub_account_status()))
            && (this.getSub_account_cycle() == null ? other.getSub_account_cycle() == null : this.getSub_account_cycle().equals(other.getSub_account_cycle()))
            && (this.getSub_account_reminder() == null ? other.getSub_account_reminder() == null : this.getSub_account_reminder().equals(other.getSub_account_reminder()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getSh_mpwd_symbol() == null ? other.getSh_mpwd_symbol() == null : this.getSh_mpwd_symbol().equals(other.getSh_mpwd_symbol()))
            && (this.getMember_changepwd() == null ? other.getMember_changepwd() == null : this.getMember_changepwd().equals(other.getMember_changepwd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getMember_status() == null) ? 0 : getMember_status().hashCode());
        result = prime * result + ((getMember_cycle() == null) ? 0 : getMember_cycle().hashCode());
        result = prime * result + ((getMember_reminder() == null) ? 0 : getMember_reminder().hashCode());
        result = prime * result + ((getSub_account_status() == null) ? 0 : getSub_account_status().hashCode());
        result = prime * result + ((getSub_account_cycle() == null) ? 0 : getSub_account_cycle().hashCode());
        result = prime * result + ((getSub_account_reminder() == null) ? 0 : getSub_account_reminder().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getSh_mpwd_symbol() == null) ? 0 : getSh_mpwd_symbol().hashCode());
        result = prime * result + ((getMember_changepwd() == null) ? 0 : getMember_changepwd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account1=").append(account1);
        sb.append(", member_status=").append(member_status);
        sb.append(", member_cycle=").append(member_cycle);
        sb.append(", member_reminder=").append(member_reminder);
        sb.append(", sub_account_status=").append(sub_account_status);
        sb.append(", sub_account_cycle=").append(sub_account_cycle);
        sb.append(", sub_account_reminder=").append(sub_account_reminder);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", sh_mpwd_symbol=").append(sh_mpwd_symbol);
        sb.append(", member_changepwd=").append(member_changepwd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}