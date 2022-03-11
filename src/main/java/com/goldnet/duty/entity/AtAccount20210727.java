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
 * @TableName at_account_20210727
 */
@TableName(value ="at_account_20210727")
@Data
public class AtAccount20210727 implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "pwd")
    private String pwd;

    /**
     * 
     */
    @TableField(value = "role")
    private String role;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

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
    @TableField(value = "login_time")
    private LocalDateTime login_time;

    /**
     * 
     */
    @TableField(value = "login_back")
    private LocalDateTime login_back;

    /**
     * 
     */
    @TableField(value = "login_num")
    private Object login_num;

    /**
     * 
     */
    @TableField(value = "login_ip")
    private String login_ip;

    /**
     * 
     */
    @TableField(value = "error_num")
    private Object error_num;

    /**
     * 
     */
    @TableField(value = "blacklist")
    private String blacklist;

    /**
     * 
     */
    @TableField(value = "old_account")
    private String old_account;

    /**
     * 
     */
    @TableField(value = "isonline")
    private String isonline;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

    /**
     * 
     */
    @TableField(value = "money_type")
    private String money_type;

    /**
     * 
     */
    @TableField(value = "check_status")
    private String check_status;

    /**
     * 
     */
    @TableField(value = "login_day_number")
    private Object login_day_number;

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
    @TableField(value = "account0")
    private Object account0;

    /**
     * 
     */
    @TableField(value = "account6")
    private Object account6;

    /**
     * 
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 
     */
    @TableField(value = "rate")
    private Object rate;

    /**
     * 
     */
    @TableField(value = "use_status")
    private Object use_status;

    /**
     * 
     */
    @TableField(value = "betting_status")
    private Object betting_status;

    /**
     * 
     */
    @TableField(value = "agent_no")
    private String agent_no;

    /**
     * 
     */
    @TableField(value = "agent_is_verify")
    private String agent_is_verify;

    /**
     * 
     */
    @TableField(value = "mem_is_verify")
    private String mem_is_verify;

    /**
     * 
     */
    @TableField(value = "jointime")
    private LocalDateTime jointime;

    /**
     * 
     */
    @TableField(value = "level_id")
    private Object level_id;

    /**
     * 
     */
    @TableField(value = "locking")
    private Object locking;

    /**
     * 
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 
     */
    @TableField(value = "session_id")
    private String session_id;

    /**
     * 
     */
    @TableField(value = "detail_flag")
    private String detail_flag;

    /**
     * 
     */
    @TableField(value = "hg_reg")
    private Object hg_reg;

    /**
     * 
     */
    @TableField(value = "ea_reg")
    private Object ea_reg;

    /**
     * 
     */
    @TableField(value = "bb_reg")
    private Object bb_reg;

    /**
     * 
     */
    @TableField(value = "api_pre_code")
    private String api_pre_code;

    /**
     * 
     */
    @TableField(value = "dmic_pwd")
    private String dmic_pwd;

    /**
     * 
     */
    @TableField(value = "ag_reg")
    private Object ag_reg;

    /**
     * 
     */
    @TableField(value = "draw_money_max_limit")
    private BigDecimal draw_money_max_limit;

    /**
     * 
     */
    @TableField(value = "mg_password")
    private String mg_password;

    /**
     * 
     */
    @TableField(value = "pt_password")
    private String pt_password;

    /**
     * 
     */
    @TableField(value = "og_login_status")
    private Object og_login_status;

    /**
     * 
     */
    @TableField(value = "register_ip")
    private String register_ip;

    /**
     * 
     */
    @TableField(value = "agent_account")
    private String agent_account;

    /**
     * 
     */
    @TableField(value = "transfer_money_status")
    private Object transfer_money_status;

    /**
     * 
     */
    @TableField(value = "last_login_platform")
    private String last_login_platform;

    /**
     * 
     */
    @TableField(value = "batch_money_max_limit")
    private BigDecimal batch_money_max_limit;

    /**
     * 
     */
    @TableField(value = "monthly_statement_pwd")
    private String monthly_statement_pwd;

    /**
     * 
     */
    @TableField(value = "weixin_key")
    private String weixin_key;

    /**
     * 
     */
    @TableField(value = "weixin_temp")
    private String weixin_temp;

    /**
     * 
     */
    @TableField(value = "weixin_nickname")
    private String weixin_nickname;

    /**
     * 
     */
    @TableField(value = "weixin_tacc")
    private String weixin_tacc;

    /**
     * 
     */
    @TableField(value = "headimgurl")
    private String headimgurl;

    /**
     * 
     */
    @TableField(value = "rapid_money_max_limit")
    private BigDecimal rapid_money_max_limit;

    /**
     * 
     */
    @TableField(value = "cp_parterner")
    private String cp_parterner;

    /**
     * 
     */
    @TableField(value = "cp_sign")
    private String cp_sign;

    /**
     * 
     */
    @TableField(value = "cp_web_site")
    private String cp_web_site;

    /**
     * 
     */
    @TableField(value = "is_init_password")
    private Object is_init_password;

    /**
     * 
     */
    @TableField(value = "money_status")
    private Object money_status;

    /**
     * 
     */
    @TableField(value = "promotion_status")
    private Integer promotion_status;

    /**
     * 
     */
    @TableField(value = "modify_password_time")
    private LocalDateTime modify_password_time;

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
        AtAccount20210727 other = (AtAccount20210727) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getLogin_time() == null ? other.getLogin_time() == null : this.getLogin_time().equals(other.getLogin_time()))
            && (this.getLogin_back() == null ? other.getLogin_back() == null : this.getLogin_back().equals(other.getLogin_back()))
            && (this.getLogin_num() == null ? other.getLogin_num() == null : this.getLogin_num().equals(other.getLogin_num()))
            && (this.getLogin_ip() == null ? other.getLogin_ip() == null : this.getLogin_ip().equals(other.getLogin_ip()))
            && (this.getError_num() == null ? other.getError_num() == null : this.getError_num().equals(other.getError_num()))
            && (this.getBlacklist() == null ? other.getBlacklist() == null : this.getBlacklist().equals(other.getBlacklist()))
            && (this.getOld_account() == null ? other.getOld_account() == null : this.getOld_account().equals(other.getOld_account()))
            && (this.getIsonline() == null ? other.getIsonline() == null : this.getIsonline().equals(other.getIsonline()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMoney_type() == null ? other.getMoney_type() == null : this.getMoney_type().equals(other.getMoney_type()))
            && (this.getCheck_status() == null ? other.getCheck_status() == null : this.getCheck_status().equals(other.getCheck_status()))
            && (this.getLogin_day_number() == null ? other.getLogin_day_number() == null : this.getLogin_day_number().equals(other.getLogin_day_number()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getAccount0() == null ? other.getAccount0() == null : this.getAccount0().equals(other.getAccount0()))
            && (this.getAccount6() == null ? other.getAccount6() == null : this.getAccount6().equals(other.getAccount6()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getUse_status() == null ? other.getUse_status() == null : this.getUse_status().equals(other.getUse_status()))
            && (this.getBetting_status() == null ? other.getBetting_status() == null : this.getBetting_status().equals(other.getBetting_status()))
            && (this.getAgent_no() == null ? other.getAgent_no() == null : this.getAgent_no().equals(other.getAgent_no()))
            && (this.getAgent_is_verify() == null ? other.getAgent_is_verify() == null : this.getAgent_is_verify().equals(other.getAgent_is_verify()))
            && (this.getMem_is_verify() == null ? other.getMem_is_verify() == null : this.getMem_is_verify().equals(other.getMem_is_verify()))
            && (this.getJointime() == null ? other.getJointime() == null : this.getJointime().equals(other.getJointime()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getLocking() == null ? other.getLocking() == null : this.getLocking().equals(other.getLocking()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getSession_id() == null ? other.getSession_id() == null : this.getSession_id().equals(other.getSession_id()))
            && (this.getDetail_flag() == null ? other.getDetail_flag() == null : this.getDetail_flag().equals(other.getDetail_flag()))
            && (this.getHg_reg() == null ? other.getHg_reg() == null : this.getHg_reg().equals(other.getHg_reg()))
            && (this.getEa_reg() == null ? other.getEa_reg() == null : this.getEa_reg().equals(other.getEa_reg()))
            && (this.getBb_reg() == null ? other.getBb_reg() == null : this.getBb_reg().equals(other.getBb_reg()))
            && (this.getApi_pre_code() == null ? other.getApi_pre_code() == null : this.getApi_pre_code().equals(other.getApi_pre_code()))
            && (this.getDmic_pwd() == null ? other.getDmic_pwd() == null : this.getDmic_pwd().equals(other.getDmic_pwd()))
            && (this.getAg_reg() == null ? other.getAg_reg() == null : this.getAg_reg().equals(other.getAg_reg()))
            && (this.getDraw_money_max_limit() == null ? other.getDraw_money_max_limit() == null : this.getDraw_money_max_limit().equals(other.getDraw_money_max_limit()))
            && (this.getMg_password() == null ? other.getMg_password() == null : this.getMg_password().equals(other.getMg_password()))
            && (this.getPt_password() == null ? other.getPt_password() == null : this.getPt_password().equals(other.getPt_password()))
            && (this.getOg_login_status() == null ? other.getOg_login_status() == null : this.getOg_login_status().equals(other.getOg_login_status()))
            && (this.getRegister_ip() == null ? other.getRegister_ip() == null : this.getRegister_ip().equals(other.getRegister_ip()))
            && (this.getAgent_account() == null ? other.getAgent_account() == null : this.getAgent_account().equals(other.getAgent_account()))
            && (this.getTransfer_money_status() == null ? other.getTransfer_money_status() == null : this.getTransfer_money_status().equals(other.getTransfer_money_status()))
            && (this.getLast_login_platform() == null ? other.getLast_login_platform() == null : this.getLast_login_platform().equals(other.getLast_login_platform()))
            && (this.getBatch_money_max_limit() == null ? other.getBatch_money_max_limit() == null : this.getBatch_money_max_limit().equals(other.getBatch_money_max_limit()))
            && (this.getMonthly_statement_pwd() == null ? other.getMonthly_statement_pwd() == null : this.getMonthly_statement_pwd().equals(other.getMonthly_statement_pwd()))
            && (this.getWeixin_key() == null ? other.getWeixin_key() == null : this.getWeixin_key().equals(other.getWeixin_key()))
            && (this.getWeixin_temp() == null ? other.getWeixin_temp() == null : this.getWeixin_temp().equals(other.getWeixin_temp()))
            && (this.getWeixin_nickname() == null ? other.getWeixin_nickname() == null : this.getWeixin_nickname().equals(other.getWeixin_nickname()))
            && (this.getWeixin_tacc() == null ? other.getWeixin_tacc() == null : this.getWeixin_tacc().equals(other.getWeixin_tacc()))
            && (this.getHeadimgurl() == null ? other.getHeadimgurl() == null : this.getHeadimgurl().equals(other.getHeadimgurl()))
            && (this.getRapid_money_max_limit() == null ? other.getRapid_money_max_limit() == null : this.getRapid_money_max_limit().equals(other.getRapid_money_max_limit()))
            && (this.getCp_parterner() == null ? other.getCp_parterner() == null : this.getCp_parterner().equals(other.getCp_parterner()))
            && (this.getCp_sign() == null ? other.getCp_sign() == null : this.getCp_sign().equals(other.getCp_sign()))
            && (this.getCp_web_site() == null ? other.getCp_web_site() == null : this.getCp_web_site().equals(other.getCp_web_site()))
            && (this.getIs_init_password() == null ? other.getIs_init_password() == null : this.getIs_init_password().equals(other.getIs_init_password()))
            && (this.getMoney_status() == null ? other.getMoney_status() == null : this.getMoney_status().equals(other.getMoney_status()))
            && (this.getPromotion_status() == null ? other.getPromotion_status() == null : this.getPromotion_status().equals(other.getPromotion_status()))
            && (this.getModify_password_time() == null ? other.getModify_password_time() == null : this.getModify_password_time().equals(other.getModify_password_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getLogin_time() == null) ? 0 : getLogin_time().hashCode());
        result = prime * result + ((getLogin_back() == null) ? 0 : getLogin_back().hashCode());
        result = prime * result + ((getLogin_num() == null) ? 0 : getLogin_num().hashCode());
        result = prime * result + ((getLogin_ip() == null) ? 0 : getLogin_ip().hashCode());
        result = prime * result + ((getError_num() == null) ? 0 : getError_num().hashCode());
        result = prime * result + ((getBlacklist() == null) ? 0 : getBlacklist().hashCode());
        result = prime * result + ((getOld_account() == null) ? 0 : getOld_account().hashCode());
        result = prime * result + ((getIsonline() == null) ? 0 : getIsonline().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMoney_type() == null) ? 0 : getMoney_type().hashCode());
        result = prime * result + ((getCheck_status() == null) ? 0 : getCheck_status().hashCode());
        result = prime * result + ((getLogin_day_number() == null) ? 0 : getLogin_day_number().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getAccount0() == null) ? 0 : getAccount0().hashCode());
        result = prime * result + ((getAccount6() == null) ? 0 : getAccount6().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getUse_status() == null) ? 0 : getUse_status().hashCode());
        result = prime * result + ((getBetting_status() == null) ? 0 : getBetting_status().hashCode());
        result = prime * result + ((getAgent_no() == null) ? 0 : getAgent_no().hashCode());
        result = prime * result + ((getAgent_is_verify() == null) ? 0 : getAgent_is_verify().hashCode());
        result = prime * result + ((getMem_is_verify() == null) ? 0 : getMem_is_verify().hashCode());
        result = prime * result + ((getJointime() == null) ? 0 : getJointime().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getLocking() == null) ? 0 : getLocking().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getSession_id() == null) ? 0 : getSession_id().hashCode());
        result = prime * result + ((getDetail_flag() == null) ? 0 : getDetail_flag().hashCode());
        result = prime * result + ((getHg_reg() == null) ? 0 : getHg_reg().hashCode());
        result = prime * result + ((getEa_reg() == null) ? 0 : getEa_reg().hashCode());
        result = prime * result + ((getBb_reg() == null) ? 0 : getBb_reg().hashCode());
        result = prime * result + ((getApi_pre_code() == null) ? 0 : getApi_pre_code().hashCode());
        result = prime * result + ((getDmic_pwd() == null) ? 0 : getDmic_pwd().hashCode());
        result = prime * result + ((getAg_reg() == null) ? 0 : getAg_reg().hashCode());
        result = prime * result + ((getDraw_money_max_limit() == null) ? 0 : getDraw_money_max_limit().hashCode());
        result = prime * result + ((getMg_password() == null) ? 0 : getMg_password().hashCode());
        result = prime * result + ((getPt_password() == null) ? 0 : getPt_password().hashCode());
        result = prime * result + ((getOg_login_status() == null) ? 0 : getOg_login_status().hashCode());
        result = prime * result + ((getRegister_ip() == null) ? 0 : getRegister_ip().hashCode());
        result = prime * result + ((getAgent_account() == null) ? 0 : getAgent_account().hashCode());
        result = prime * result + ((getTransfer_money_status() == null) ? 0 : getTransfer_money_status().hashCode());
        result = prime * result + ((getLast_login_platform() == null) ? 0 : getLast_login_platform().hashCode());
        result = prime * result + ((getBatch_money_max_limit() == null) ? 0 : getBatch_money_max_limit().hashCode());
        result = prime * result + ((getMonthly_statement_pwd() == null) ? 0 : getMonthly_statement_pwd().hashCode());
        result = prime * result + ((getWeixin_key() == null) ? 0 : getWeixin_key().hashCode());
        result = prime * result + ((getWeixin_temp() == null) ? 0 : getWeixin_temp().hashCode());
        result = prime * result + ((getWeixin_nickname() == null) ? 0 : getWeixin_nickname().hashCode());
        result = prime * result + ((getWeixin_tacc() == null) ? 0 : getWeixin_tacc().hashCode());
        result = prime * result + ((getHeadimgurl() == null) ? 0 : getHeadimgurl().hashCode());
        result = prime * result + ((getRapid_money_max_limit() == null) ? 0 : getRapid_money_max_limit().hashCode());
        result = prime * result + ((getCp_parterner() == null) ? 0 : getCp_parterner().hashCode());
        result = prime * result + ((getCp_sign() == null) ? 0 : getCp_sign().hashCode());
        result = prime * result + ((getCp_web_site() == null) ? 0 : getCp_web_site().hashCode());
        result = prime * result + ((getIs_init_password() == null) ? 0 : getIs_init_password().hashCode());
        result = prime * result + ((getMoney_status() == null) ? 0 : getMoney_status().hashCode());
        result = prime * result + ((getPromotion_status() == null) ? 0 : getPromotion_status().hashCode());
        result = prime * result + ((getModify_password_time() == null) ? 0 : getModify_password_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", name=").append(name);
        sb.append(", pwd=").append(pwd);
        sb.append(", role=").append(role);
        sb.append(", remark=").append(remark);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", login_time=").append(login_time);
        sb.append(", login_back=").append(login_back);
        sb.append(", login_num=").append(login_num);
        sb.append(", login_ip=").append(login_ip);
        sb.append(", error_num=").append(error_num);
        sb.append(", blacklist=").append(blacklist);
        sb.append(", old_account=").append(old_account);
        sb.append(", isonline=").append(isonline);
        sb.append(", type=").append(type);
        sb.append(", money_type=").append(money_type);
        sb.append(", check_status=").append(check_status);
        sb.append(", login_day_number=").append(login_day_number);
        sb.append(", account1=").append(account1);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", account5=").append(account5);
        sb.append(", account0=").append(account0);
        sb.append(", account6=").append(account6);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", rate=").append(rate);
        sb.append(", use_status=").append(use_status);
        sb.append(", betting_status=").append(betting_status);
        sb.append(", agent_no=").append(agent_no);
        sb.append(", agent_is_verify=").append(agent_is_verify);
        sb.append(", mem_is_verify=").append(mem_is_verify);
        sb.append(", jointime=").append(jointime);
        sb.append(", level_id=").append(level_id);
        sb.append(", locking=").append(locking);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", session_id=").append(session_id);
        sb.append(", detail_flag=").append(detail_flag);
        sb.append(", hg_reg=").append(hg_reg);
        sb.append(", ea_reg=").append(ea_reg);
        sb.append(", bb_reg=").append(bb_reg);
        sb.append(", api_pre_code=").append(api_pre_code);
        sb.append(", dmic_pwd=").append(dmic_pwd);
        sb.append(", ag_reg=").append(ag_reg);
        sb.append(", draw_money_max_limit=").append(draw_money_max_limit);
        sb.append(", mg_password=").append(mg_password);
        sb.append(", pt_password=").append(pt_password);
        sb.append(", og_login_status=").append(og_login_status);
        sb.append(", register_ip=").append(register_ip);
        sb.append(", agent_account=").append(agent_account);
        sb.append(", transfer_money_status=").append(transfer_money_status);
        sb.append(", last_login_platform=").append(last_login_platform);
        sb.append(", batch_money_max_limit=").append(batch_money_max_limit);
        sb.append(", monthly_statement_pwd=").append(monthly_statement_pwd);
        sb.append(", weixin_key=").append(weixin_key);
        sb.append(", weixin_temp=").append(weixin_temp);
        sb.append(", weixin_nickname=").append(weixin_nickname);
        sb.append(", weixin_tacc=").append(weixin_tacc);
        sb.append(", headimgurl=").append(headimgurl);
        sb.append(", rapid_money_max_limit=").append(rapid_money_max_limit);
        sb.append(", cp_parterner=").append(cp_parterner);
        sb.append(", cp_sign=").append(cp_sign);
        sb.append(", cp_web_site=").append(cp_web_site);
        sb.append(", is_init_password=").append(is_init_password);
        sb.append(", money_status=").append(money_status);
        sb.append(", promotion_status=").append(promotion_status);
        sb.append(", modify_password_time=").append(modify_password_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}