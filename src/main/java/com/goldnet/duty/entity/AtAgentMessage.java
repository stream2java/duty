package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 代理商资料信息
 * @TableName at_agent_message
 */
@TableName(value ="at_agent_message")
@Data
public class AtAgentMessage implements Serializable {
    /**
     * 
     */
    @TableId(value = "message_id")
    private Object message_id;

    /**
     * 代理商编号
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 推广网址
     */
    @TableField(value = "spread_url")
    private String spread_url;

    /**
     * 其他推广网址
     */
    @TableField(value = "rests_spread_url")
    private String rests_spread_url;

    /**
     * 联系方式
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * qq
     */
    @TableField(value = "qq")
    private String qq;

    /**
     * email
     */
    @TableField(value = "email")
    private String email;

    /**
     * 出款银行
     */
    @TableField(value = "bank")
    private String bank;

    /**
     * 出款账号
     */
    @TableField(value = "bank_account")
    private String bank_account;

    /**
     * 出款省份
     */
    @TableField(value = "bank_province")
    private String bank_province;

    /**
     * 出款县市
     */
    @TableField(value = "bank_country")
    private String bank_country;

    /**
     * 提款密码
     */
    @TableField(value = "draw_money_pwd")
    private String draw_money_pwd;

    /**
     * 真实姓名
     */
    @TableField(value = "real_name")
    private String real_name;

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
        AtAgentMessage other = (AtAgentMessage) that;
        return (this.getMessage_id() == null ? other.getMessage_id() == null : this.getMessage_id().equals(other.getMessage_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getSpread_url() == null ? other.getSpread_url() == null : this.getSpread_url().equals(other.getSpread_url()))
            && (this.getRests_spread_url() == null ? other.getRests_spread_url() == null : this.getRests_spread_url().equals(other.getRests_spread_url()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getBank() == null ? other.getBank() == null : this.getBank().equals(other.getBank()))
            && (this.getBank_account() == null ? other.getBank_account() == null : this.getBank_account().equals(other.getBank_account()))
            && (this.getBank_province() == null ? other.getBank_province() == null : this.getBank_province().equals(other.getBank_province()))
            && (this.getBank_country() == null ? other.getBank_country() == null : this.getBank_country().equals(other.getBank_country()))
            && (this.getDraw_money_pwd() == null ? other.getDraw_money_pwd() == null : this.getDraw_money_pwd().equals(other.getDraw_money_pwd()))
            && (this.getReal_name() == null ? other.getReal_name() == null : this.getReal_name().equals(other.getReal_name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMessage_id() == null) ? 0 : getMessage_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getSpread_url() == null) ? 0 : getSpread_url().hashCode());
        result = prime * result + ((getRests_spread_url() == null) ? 0 : getRests_spread_url().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getBank() == null) ? 0 : getBank().hashCode());
        result = prime * result + ((getBank_account() == null) ? 0 : getBank_account().hashCode());
        result = prime * result + ((getBank_province() == null) ? 0 : getBank_province().hashCode());
        result = prime * result + ((getBank_country() == null) ? 0 : getBank_country().hashCode());
        result = prime * result + ((getDraw_money_pwd() == null) ? 0 : getDraw_money_pwd().hashCode());
        result = prime * result + ((getReal_name() == null) ? 0 : getReal_name().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", message_id=").append(message_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", spread_url=").append(spread_url);
        sb.append(", rests_spread_url=").append(rests_spread_url);
        sb.append(", phone=").append(phone);
        sb.append(", qq=").append(qq);
        sb.append(", email=").append(email);
        sb.append(", bank=").append(bank);
        sb.append(", bank_account=").append(bank_account);
        sb.append(", bank_province=").append(bank_province);
        sb.append(", bank_country=").append(bank_country);
        sb.append(", draw_money_pwd=").append(draw_money_pwd);
        sb.append(", real_name=").append(real_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}