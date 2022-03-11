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
 * @TableName mny_com_record_20210727
 */
@TableName(value ="mny_com_record_20210727")
@Data
public class MnyComRecord20210727 implements Serializable {
    /**
     * 
     */
    @TableField(value = "com_record_id")
    private Object com_record_id;

    /**
     * 
     */
    @TableField(value = "order_no")
    private String order_no;

    /**
     * 
     */
    @TableField(value = "level_id")
    private Object level_id;

    /**
     * 
     */
    @TableField(value = "partner_id")
    private Object partner_id;

    /**
     * 
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 
     */
    @TableField(value = "deposit_type")
    private String deposit_type;

    /**
     * 
     */
    @TableField(value = "deposit_money")
    private BigDecimal deposit_money;

    /**
     * 
     */
    @TableField(value = "deposit_pre")
    private BigDecimal deposit_pre;

    /**
     * 
     */
    @TableField(value = "other_pre")
    private BigDecimal other_pre;

    /**
     * 
     */
    @TableField(value = "status")
    private Object status;

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
    @TableField(value = "system_time")
    private LocalDateTime system_time;

    /**
     * 
     */
    @TableField(value = "deposit_pre_status")
    private Object deposit_pre_status;

    /**
     * 
     */
    @TableField(value = "other_pre_status")
    private Object other_pre_status;

    /**
     * 
     */
    @TableField(value = "comp_bet_check_status")
    private Object comp_bet_check_status;

    /**
     * 
     */
    @TableField(value = "comp_bet")
    private BigDecimal comp_bet;

    /**
     * 
     */
    @TableField(value = "normal_check_status")
    private Object normal_check_status;

    /**
     * 
     */
    @TableField(value = "deposit_project_id")
    private Object deposit_project_id;

    /**
     * 
     */
    @TableField(value = "deposit_money_remark")
    private String deposit_money_remark;

    /**
     * 
     */
    @TableField(value = "deposit_pre_remark")
    private String deposit_pre_remark;

    /**
     * 
     */
    @TableField(value = "other_pre_remark")
    private String other_pre_remark;

    /**
     * 
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 
     */
    @TableField(value = "bank_account_id")
    private Object bank_account_id;

    /**
     * 
     */
    @TableField(value = "bb_limit")
    private BigDecimal bb_limit;

    /**
     * 
     */
    @TableField(value = "comp_num_check")
    private Object comp_num_check;

    /**
     * 
     */
    @TableField(value = "deposit_man_name")
    private String deposit_man_name;

    /**
     * 
     */
    @TableField(value = "pre_rem_per_check")
    private Object pre_rem_per_check;

    /**
     * 
     */
    @TableField(value = "member_deposit_bank_id")
    private Object member_deposit_bank_id;

    /**
     * 
     */
    @TableField(value = "mem_bank_account")
    private String mem_bank_account;

    /**
     * 
     */
    @TableField(value = "mem_bank_name")
    private String mem_bank_name;

    /**
     * 
     */
    @TableField(value = "level_name")
    private String level_name;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 
     */
    @TableField(value = "account2")
    private Object account2;

    /**
     * 
     */
    @TableField(value = "account3")
    private Object account3;

    /**
     * 
     */
    @TableField(value = "account4")
    private Object account4;

    /**
     * 
     */
    @TableField(value = "account5")
    private Object account5;

    /**
     * 
     */
    @TableField(value = "rate")
    private Object rate;

    /**
     * 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

    /**
     * 
     */
    @TableField(value = "agent_account")
    private String agent_account;

    /**
     * 
     */
    @TableField(value = "chamberlain")
    private String chamberlain;

    /**
     * 
     */
    @TableField(value = "company_bank_id")
    private Object company_bank_id;

    /**
     * 
     */
    @TableField(value = "wx_account")
    private String wx_account;

    /**
     * 
     */
    @TableField(value = "wx_nickname")
    private String wx_nickname;

    /**
     * 
     */
    @TableField(value = "isbank")
    private Object isbank;

    /**
     * 
     */
    @TableField(value = "device")
    private Object device;

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
        MnyComRecord20210727 other = (MnyComRecord20210727) that;
        return (this.getCom_record_id() == null ? other.getCom_record_id() == null : this.getCom_record_id().equals(other.getCom_record_id()))
            && (this.getOrder_no() == null ? other.getOrder_no() == null : this.getOrder_no().equals(other.getOrder_no()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getPartner_id() == null ? other.getPartner_id() == null : this.getPartner_id().equals(other.getPartner_id()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getDeposit_type() == null ? other.getDeposit_type() == null : this.getDeposit_type().equals(other.getDeposit_type()))
            && (this.getDeposit_money() == null ? other.getDeposit_money() == null : this.getDeposit_money().equals(other.getDeposit_money()))
            && (this.getDeposit_pre() == null ? other.getDeposit_pre() == null : this.getDeposit_pre().equals(other.getDeposit_pre()))
            && (this.getOther_pre() == null ? other.getOther_pre() == null : this.getOther_pre().equals(other.getOther_pre()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getSystem_time() == null ? other.getSystem_time() == null : this.getSystem_time().equals(other.getSystem_time()))
            && (this.getDeposit_pre_status() == null ? other.getDeposit_pre_status() == null : this.getDeposit_pre_status().equals(other.getDeposit_pre_status()))
            && (this.getOther_pre_status() == null ? other.getOther_pre_status() == null : this.getOther_pre_status().equals(other.getOther_pre_status()))
            && (this.getComp_bet_check_status() == null ? other.getComp_bet_check_status() == null : this.getComp_bet_check_status().equals(other.getComp_bet_check_status()))
            && (this.getComp_bet() == null ? other.getComp_bet() == null : this.getComp_bet().equals(other.getComp_bet()))
            && (this.getNormal_check_status() == null ? other.getNormal_check_status() == null : this.getNormal_check_status().equals(other.getNormal_check_status()))
            && (this.getDeposit_project_id() == null ? other.getDeposit_project_id() == null : this.getDeposit_project_id().equals(other.getDeposit_project_id()))
            && (this.getDeposit_money_remark() == null ? other.getDeposit_money_remark() == null : this.getDeposit_money_remark().equals(other.getDeposit_money_remark()))
            && (this.getDeposit_pre_remark() == null ? other.getDeposit_pre_remark() == null : this.getDeposit_pre_remark().equals(other.getDeposit_pre_remark()))
            && (this.getOther_pre_remark() == null ? other.getOther_pre_remark() == null : this.getOther_pre_remark().equals(other.getOther_pre_remark()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getBank_account_id() == null ? other.getBank_account_id() == null : this.getBank_account_id().equals(other.getBank_account_id()))
            && (this.getBb_limit() == null ? other.getBb_limit() == null : this.getBb_limit().equals(other.getBb_limit()))
            && (this.getComp_num_check() == null ? other.getComp_num_check() == null : this.getComp_num_check().equals(other.getComp_num_check()))
            && (this.getDeposit_man_name() == null ? other.getDeposit_man_name() == null : this.getDeposit_man_name().equals(other.getDeposit_man_name()))
            && (this.getPre_rem_per_check() == null ? other.getPre_rem_per_check() == null : this.getPre_rem_per_check().equals(other.getPre_rem_per_check()))
            && (this.getMember_deposit_bank_id() == null ? other.getMember_deposit_bank_id() == null : this.getMember_deposit_bank_id().equals(other.getMember_deposit_bank_id()))
            && (this.getMem_bank_account() == null ? other.getMem_bank_account() == null : this.getMem_bank_account().equals(other.getMem_bank_account()))
            && (this.getMem_bank_name() == null ? other.getMem_bank_name() == null : this.getMem_bank_name().equals(other.getMem_bank_name()))
            && (this.getLevel_name() == null ? other.getLevel_name() == null : this.getLevel_name().equals(other.getLevel_name()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getAgent_account() == null ? other.getAgent_account() == null : this.getAgent_account().equals(other.getAgent_account()))
            && (this.getChamberlain() == null ? other.getChamberlain() == null : this.getChamberlain().equals(other.getChamberlain()))
            && (this.getCompany_bank_id() == null ? other.getCompany_bank_id() == null : this.getCompany_bank_id().equals(other.getCompany_bank_id()))
            && (this.getWx_account() == null ? other.getWx_account() == null : this.getWx_account().equals(other.getWx_account()))
            && (this.getWx_nickname() == null ? other.getWx_nickname() == null : this.getWx_nickname().equals(other.getWx_nickname()))
            && (this.getIsbank() == null ? other.getIsbank() == null : this.getIsbank().equals(other.getIsbank()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCom_record_id() == null) ? 0 : getCom_record_id().hashCode());
        result = prime * result + ((getOrder_no() == null) ? 0 : getOrder_no().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getPartner_id() == null) ? 0 : getPartner_id().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getDeposit_type() == null) ? 0 : getDeposit_type().hashCode());
        result = prime * result + ((getDeposit_money() == null) ? 0 : getDeposit_money().hashCode());
        result = prime * result + ((getDeposit_pre() == null) ? 0 : getDeposit_pre().hashCode());
        result = prime * result + ((getOther_pre() == null) ? 0 : getOther_pre().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getSystem_time() == null) ? 0 : getSystem_time().hashCode());
        result = prime * result + ((getDeposit_pre_status() == null) ? 0 : getDeposit_pre_status().hashCode());
        result = prime * result + ((getOther_pre_status() == null) ? 0 : getOther_pre_status().hashCode());
        result = prime * result + ((getComp_bet_check_status() == null) ? 0 : getComp_bet_check_status().hashCode());
        result = prime * result + ((getComp_bet() == null) ? 0 : getComp_bet().hashCode());
        result = prime * result + ((getNormal_check_status() == null) ? 0 : getNormal_check_status().hashCode());
        result = prime * result + ((getDeposit_project_id() == null) ? 0 : getDeposit_project_id().hashCode());
        result = prime * result + ((getDeposit_money_remark() == null) ? 0 : getDeposit_money_remark().hashCode());
        result = prime * result + ((getDeposit_pre_remark() == null) ? 0 : getDeposit_pre_remark().hashCode());
        result = prime * result + ((getOther_pre_remark() == null) ? 0 : getOther_pre_remark().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getBank_account_id() == null) ? 0 : getBank_account_id().hashCode());
        result = prime * result + ((getBb_limit() == null) ? 0 : getBb_limit().hashCode());
        result = prime * result + ((getComp_num_check() == null) ? 0 : getComp_num_check().hashCode());
        result = prime * result + ((getDeposit_man_name() == null) ? 0 : getDeposit_man_name().hashCode());
        result = prime * result + ((getPre_rem_per_check() == null) ? 0 : getPre_rem_per_check().hashCode());
        result = prime * result + ((getMember_deposit_bank_id() == null) ? 0 : getMember_deposit_bank_id().hashCode());
        result = prime * result + ((getMem_bank_account() == null) ? 0 : getMem_bank_account().hashCode());
        result = prime * result + ((getMem_bank_name() == null) ? 0 : getMem_bank_name().hashCode());
        result = prime * result + ((getLevel_name() == null) ? 0 : getLevel_name().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAgent_account() == null) ? 0 : getAgent_account().hashCode());
        result = prime * result + ((getChamberlain() == null) ? 0 : getChamberlain().hashCode());
        result = prime * result + ((getCompany_bank_id() == null) ? 0 : getCompany_bank_id().hashCode());
        result = prime * result + ((getWx_account() == null) ? 0 : getWx_account().hashCode());
        result = prime * result + ((getWx_nickname() == null) ? 0 : getWx_nickname().hashCode());
        result = prime * result + ((getIsbank() == null) ? 0 : getIsbank().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", com_record_id=").append(com_record_id);
        sb.append(", order_no=").append(order_no);
        sb.append(", level_id=").append(level_id);
        sb.append(", partner_id=").append(partner_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", deposit_type=").append(deposit_type);
        sb.append(", deposit_money=").append(deposit_money);
        sb.append(", deposit_pre=").append(deposit_pre);
        sb.append(", other_pre=").append(other_pre);
        sb.append(", status=").append(status);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", system_time=").append(system_time);
        sb.append(", deposit_pre_status=").append(deposit_pre_status);
        sb.append(", other_pre_status=").append(other_pre_status);
        sb.append(", comp_bet_check_status=").append(comp_bet_check_status);
        sb.append(", comp_bet=").append(comp_bet);
        sb.append(", normal_check_status=").append(normal_check_status);
        sb.append(", deposit_project_id=").append(deposit_project_id);
        sb.append(", deposit_money_remark=").append(deposit_money_remark);
        sb.append(", deposit_pre_remark=").append(deposit_pre_remark);
        sb.append(", other_pre_remark=").append(other_pre_remark);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", bank_account_id=").append(bank_account_id);
        sb.append(", bb_limit=").append(bb_limit);
        sb.append(", comp_num_check=").append(comp_num_check);
        sb.append(", deposit_man_name=").append(deposit_man_name);
        sb.append(", pre_rem_per_check=").append(pre_rem_per_check);
        sb.append(", member_deposit_bank_id=").append(member_deposit_bank_id);
        sb.append(", mem_bank_account=").append(mem_bank_account);
        sb.append(", mem_bank_name=").append(mem_bank_name);
        sb.append(", level_name=").append(level_name);
        sb.append(", account1=").append(account1);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", account5=").append(account5);
        sb.append(", rate=").append(rate);
        sb.append(", account=").append(account);
        sb.append(", type=").append(type);
        sb.append(", agent_account=").append(agent_account);
        sb.append(", chamberlain=").append(chamberlain);
        sb.append(", company_bank_id=").append(company_bank_id);
        sb.append(", wx_account=").append(wx_account);
        sb.append(", wx_nickname=").append(wx_nickname);
        sb.append(", isbank=").append(isbank);
        sb.append(", device=").append(device);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}