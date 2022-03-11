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
 * @TableName old_ge_station
 */
@TableName(value ="old_ge_station")
@Data
public class OldGeStation implements Serializable {
    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "url")
    private String url;

    /**
     * 
     */
    @TableField(value = "parent_partner")
    private Object parent_partner;

    /**
     * 
     */
    @TableField(value = "ftp")
    private String ftp;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "keys")
    private String keys;

    /**
     * 
     */
    @TableField(value = "durl")
    private String durl;

    /**
     * 
     */
    @TableField(value = "ftpname")
    private String ftpname;

    /**
     * 
     */
    @TableField(value = "ftppwd")
    private String ftppwd;

    /**
     * 
     */
    @TableField(value = "ftppost")
    private String ftppost;

    /**
     * 
     */
    @TableField(value = "account0")
    private Object account0;

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
    @TableField(value = "week")
    private String week;

    /**
     * 
     */
    @TableField(value = "close_time")
    private String close_time;

    /**
     * 
     */
    @TableField(value = "open_time")
    private String open_time;

    /**
     * 
     */
    @TableField(value = "platform_type")
    private String platform_type;

    /**
     * 
     */
    @TableField(value = "float_status")
    private Object float_status;

    /**
     * 
     */
    @TableField(value = "login_validcode")
    private Object login_validcode;

    /**
     * 
     */
    @TableField(value = "keywords")
    private String keywords;

    /**
     * 
     */
    @TableField(value = "color_style")
    private String color_style;

    /**
     * 
     */
    @TableField(value = "mongo_server_id")
    private Object mongo_server_id;

    /**
     * 
     */
    @TableField(value = "trial_account_num")
    private Object trial_account_num;

    /**
     * 
     */
    @TableField(value = "trial_account_money")
    private BigDecimal trial_account_money;

    /**
     * 
     */
    @TableField(value = "new_durl")
    private String new_durl;

    /**
     * 
     */
    @TableField(value = "baofoo_wechat_status")
    private Object baofoo_wechat_status;

    /**
     * 
     */
    @TableField(value = "template_id")
    private Object template_id;

    /**
     * 
     */
    @TableField(value = "static_domain")
    private String static_domain;

    /**
     * 
     */
    @TableField(value = "test_account_money")
    private BigDecimal test_account_money;

    /**
     * 
     */
    @TableField(value = "platform_name")
    private String platform_name;

    /**
     * 
     */
    @TableField(value = "app_status")
    private String app_status;

    /**
     * 
     */
    @TableField(value = "app_code")
    private String app_code;

    /**
     * 
     */
    @TableField(value = "station_code")
    private String station_code;

    /**
     * 
     */
    @TableField(value = "ip_reg_status")
    private Object ip_reg_status;

    /**
     * 
     */
    @TableField(value = "update_ip_reg_time")
    private LocalDateTime update_ip_reg_time;

    /**
     * 
     */
    @TableField(value = "ip_reg_num")
    private Object ip_reg_num;

    /**
     * 
     */
    @TableField(value = "app_domain")
    private String app_domain;

    /**
     * 
     */
    @TableField(value = "special_login_status")
    private Object special_login_status;

    /**
     * 
     */
    @TableField(value = "multi_channel_status")
    private Object multi_channel_status;

    /**
     * 
     */
    @TableField(value = "promotion_storey_num")
    private Object promotion_storey_num;

    /**
     * 
     */
    @TableField(value = "promotion_betting_max_rebate")
    private BigDecimal promotion_betting_max_rebate;

    /**
     * 
     */
    @TableField(value = "member_profit_loss")
    private BigDecimal member_profit_loss;

    /**
     * 
     */
    @TableField(value = "enable_native_pay")
    private Integer enable_native_pay;

    /**
     * 
     */
    @TableField(value = "data_source_type")
    private Integer data_source_type;

    /**
     * 
     */
    @TableField(value = "today_report_search")
    private Integer today_report_search;

    /**
     * 
     */
    @TableField(value = "send_to_es")
    private Integer send_to_es;

    /**
     * 
     */
    @TableField(value = "ip_reg_max_num")
    private Object ip_reg_max_num;

    /**
     * 
     */
    @TableField(value = "close_mbr_time")
    private String close_mbr_time;

    /**
     * 
     */
    @TableField(value = "open_mbr_time")
    private String open_mbr_time;

    /**
     * 
     */
    @TableField(value = "data_source_map")
    private String data_source_map;

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
        OldGeStation other = (OldGeStation) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getParent_partner() == null ? other.getParent_partner() == null : this.getParent_partner().equals(other.getParent_partner()))
            && (this.getFtp() == null ? other.getFtp() == null : this.getFtp().equals(other.getFtp()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKeys() == null ? other.getKeys() == null : this.getKeys().equals(other.getKeys()))
            && (this.getDurl() == null ? other.getDurl() == null : this.getDurl().equals(other.getDurl()))
            && (this.getFtpname() == null ? other.getFtpname() == null : this.getFtpname().equals(other.getFtpname()))
            && (this.getFtppwd() == null ? other.getFtppwd() == null : this.getFtppwd().equals(other.getFtppwd()))
            && (this.getFtppost() == null ? other.getFtppost() == null : this.getFtppost().equals(other.getFtppost()))
            && (this.getAccount0() == null ? other.getAccount0() == null : this.getAccount0().equals(other.getAccount0()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
            && (this.getClose_time() == null ? other.getClose_time() == null : this.getClose_time().equals(other.getClose_time()))
            && (this.getOpen_time() == null ? other.getOpen_time() == null : this.getOpen_time().equals(other.getOpen_time()))
            && (this.getPlatform_type() == null ? other.getPlatform_type() == null : this.getPlatform_type().equals(other.getPlatform_type()))
            && (this.getFloat_status() == null ? other.getFloat_status() == null : this.getFloat_status().equals(other.getFloat_status()))
            && (this.getLogin_validcode() == null ? other.getLogin_validcode() == null : this.getLogin_validcode().equals(other.getLogin_validcode()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getColor_style() == null ? other.getColor_style() == null : this.getColor_style().equals(other.getColor_style()))
            && (this.getMongo_server_id() == null ? other.getMongo_server_id() == null : this.getMongo_server_id().equals(other.getMongo_server_id()))
            && (this.getTrial_account_num() == null ? other.getTrial_account_num() == null : this.getTrial_account_num().equals(other.getTrial_account_num()))
            && (this.getTrial_account_money() == null ? other.getTrial_account_money() == null : this.getTrial_account_money().equals(other.getTrial_account_money()))
            && (this.getNew_durl() == null ? other.getNew_durl() == null : this.getNew_durl().equals(other.getNew_durl()))
            && (this.getBaofoo_wechat_status() == null ? other.getBaofoo_wechat_status() == null : this.getBaofoo_wechat_status().equals(other.getBaofoo_wechat_status()))
            && (this.getTemplate_id() == null ? other.getTemplate_id() == null : this.getTemplate_id().equals(other.getTemplate_id()))
            && (this.getStatic_domain() == null ? other.getStatic_domain() == null : this.getStatic_domain().equals(other.getStatic_domain()))
            && (this.getTest_account_money() == null ? other.getTest_account_money() == null : this.getTest_account_money().equals(other.getTest_account_money()))
            && (this.getPlatform_name() == null ? other.getPlatform_name() == null : this.getPlatform_name().equals(other.getPlatform_name()))
            && (this.getApp_status() == null ? other.getApp_status() == null : this.getApp_status().equals(other.getApp_status()))
            && (this.getApp_code() == null ? other.getApp_code() == null : this.getApp_code().equals(other.getApp_code()))
            && (this.getStation_code() == null ? other.getStation_code() == null : this.getStation_code().equals(other.getStation_code()))
            && (this.getIp_reg_status() == null ? other.getIp_reg_status() == null : this.getIp_reg_status().equals(other.getIp_reg_status()))
            && (this.getUpdate_ip_reg_time() == null ? other.getUpdate_ip_reg_time() == null : this.getUpdate_ip_reg_time().equals(other.getUpdate_ip_reg_time()))
            && (this.getIp_reg_num() == null ? other.getIp_reg_num() == null : this.getIp_reg_num().equals(other.getIp_reg_num()))
            && (this.getApp_domain() == null ? other.getApp_domain() == null : this.getApp_domain().equals(other.getApp_domain()))
            && (this.getSpecial_login_status() == null ? other.getSpecial_login_status() == null : this.getSpecial_login_status().equals(other.getSpecial_login_status()))
            && (this.getMulti_channel_status() == null ? other.getMulti_channel_status() == null : this.getMulti_channel_status().equals(other.getMulti_channel_status()))
            && (this.getPromotion_storey_num() == null ? other.getPromotion_storey_num() == null : this.getPromotion_storey_num().equals(other.getPromotion_storey_num()))
            && (this.getPromotion_betting_max_rebate() == null ? other.getPromotion_betting_max_rebate() == null : this.getPromotion_betting_max_rebate().equals(other.getPromotion_betting_max_rebate()))
            && (this.getMember_profit_loss() == null ? other.getMember_profit_loss() == null : this.getMember_profit_loss().equals(other.getMember_profit_loss()))
            && (this.getEnable_native_pay() == null ? other.getEnable_native_pay() == null : this.getEnable_native_pay().equals(other.getEnable_native_pay()))
            && (this.getData_source_type() == null ? other.getData_source_type() == null : this.getData_source_type().equals(other.getData_source_type()))
            && (this.getToday_report_search() == null ? other.getToday_report_search() == null : this.getToday_report_search().equals(other.getToday_report_search()))
            && (this.getSend_to_es() == null ? other.getSend_to_es() == null : this.getSend_to_es().equals(other.getSend_to_es()))
            && (this.getIp_reg_max_num() == null ? other.getIp_reg_max_num() == null : this.getIp_reg_max_num().equals(other.getIp_reg_max_num()))
            && (this.getClose_mbr_time() == null ? other.getClose_mbr_time() == null : this.getClose_mbr_time().equals(other.getClose_mbr_time()))
            && (this.getOpen_mbr_time() == null ? other.getOpen_mbr_time() == null : this.getOpen_mbr_time().equals(other.getOpen_mbr_time()))
            && (this.getData_source_map() == null ? other.getData_source_map() == null : this.getData_source_map().equals(other.getData_source_map()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getParent_partner() == null) ? 0 : getParent_partner().hashCode());
        result = prime * result + ((getFtp() == null) ? 0 : getFtp().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKeys() == null) ? 0 : getKeys().hashCode());
        result = prime * result + ((getDurl() == null) ? 0 : getDurl().hashCode());
        result = prime * result + ((getFtpname() == null) ? 0 : getFtpname().hashCode());
        result = prime * result + ((getFtppwd() == null) ? 0 : getFtppwd().hashCode());
        result = prime * result + ((getFtppost() == null) ? 0 : getFtppost().hashCode());
        result = prime * result + ((getAccount0() == null) ? 0 : getAccount0().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getClose_time() == null) ? 0 : getClose_time().hashCode());
        result = prime * result + ((getOpen_time() == null) ? 0 : getOpen_time().hashCode());
        result = prime * result + ((getPlatform_type() == null) ? 0 : getPlatform_type().hashCode());
        result = prime * result + ((getFloat_status() == null) ? 0 : getFloat_status().hashCode());
        result = prime * result + ((getLogin_validcode() == null) ? 0 : getLogin_validcode().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getColor_style() == null) ? 0 : getColor_style().hashCode());
        result = prime * result + ((getMongo_server_id() == null) ? 0 : getMongo_server_id().hashCode());
        result = prime * result + ((getTrial_account_num() == null) ? 0 : getTrial_account_num().hashCode());
        result = prime * result + ((getTrial_account_money() == null) ? 0 : getTrial_account_money().hashCode());
        result = prime * result + ((getNew_durl() == null) ? 0 : getNew_durl().hashCode());
        result = prime * result + ((getBaofoo_wechat_status() == null) ? 0 : getBaofoo_wechat_status().hashCode());
        result = prime * result + ((getTemplate_id() == null) ? 0 : getTemplate_id().hashCode());
        result = prime * result + ((getStatic_domain() == null) ? 0 : getStatic_domain().hashCode());
        result = prime * result + ((getTest_account_money() == null) ? 0 : getTest_account_money().hashCode());
        result = prime * result + ((getPlatform_name() == null) ? 0 : getPlatform_name().hashCode());
        result = prime * result + ((getApp_status() == null) ? 0 : getApp_status().hashCode());
        result = prime * result + ((getApp_code() == null) ? 0 : getApp_code().hashCode());
        result = prime * result + ((getStation_code() == null) ? 0 : getStation_code().hashCode());
        result = prime * result + ((getIp_reg_status() == null) ? 0 : getIp_reg_status().hashCode());
        result = prime * result + ((getUpdate_ip_reg_time() == null) ? 0 : getUpdate_ip_reg_time().hashCode());
        result = prime * result + ((getIp_reg_num() == null) ? 0 : getIp_reg_num().hashCode());
        result = prime * result + ((getApp_domain() == null) ? 0 : getApp_domain().hashCode());
        result = prime * result + ((getSpecial_login_status() == null) ? 0 : getSpecial_login_status().hashCode());
        result = prime * result + ((getMulti_channel_status() == null) ? 0 : getMulti_channel_status().hashCode());
        result = prime * result + ((getPromotion_storey_num() == null) ? 0 : getPromotion_storey_num().hashCode());
        result = prime * result + ((getPromotion_betting_max_rebate() == null) ? 0 : getPromotion_betting_max_rebate().hashCode());
        result = prime * result + ((getMember_profit_loss() == null) ? 0 : getMember_profit_loss().hashCode());
        result = prime * result + ((getEnable_native_pay() == null) ? 0 : getEnable_native_pay().hashCode());
        result = prime * result + ((getData_source_type() == null) ? 0 : getData_source_type().hashCode());
        result = prime * result + ((getToday_report_search() == null) ? 0 : getToday_report_search().hashCode());
        result = prime * result + ((getSend_to_es() == null) ? 0 : getSend_to_es().hashCode());
        result = prime * result + ((getIp_reg_max_num() == null) ? 0 : getIp_reg_max_num().hashCode());
        result = prime * result + ((getClose_mbr_time() == null) ? 0 : getClose_mbr_time().hashCode());
        result = prime * result + ((getOpen_mbr_time() == null) ? 0 : getOpen_mbr_time().hashCode());
        result = prime * result + ((getData_source_map() == null) ? 0 : getData_source_map().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", parent_partner=").append(parent_partner);
        sb.append(", ftp=").append(ftp);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", id=").append(id);
        sb.append(", keys=").append(keys);
        sb.append(", durl=").append(durl);
        sb.append(", ftpname=").append(ftpname);
        sb.append(", ftppwd=").append(ftppwd);
        sb.append(", ftppost=").append(ftppost);
        sb.append(", account0=").append(account0);
        sb.append(", account1=").append(account1);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", account5=").append(account5);
        sb.append(", week=").append(week);
        sb.append(", close_time=").append(close_time);
        sb.append(", open_time=").append(open_time);
        sb.append(", platform_type=").append(platform_type);
        sb.append(", float_status=").append(float_status);
        sb.append(", login_validcode=").append(login_validcode);
        sb.append(", keywords=").append(keywords);
        sb.append(", color_style=").append(color_style);
        sb.append(", mongo_server_id=").append(mongo_server_id);
        sb.append(", trial_account_num=").append(trial_account_num);
        sb.append(", trial_account_money=").append(trial_account_money);
        sb.append(", new_durl=").append(new_durl);
        sb.append(", baofoo_wechat_status=").append(baofoo_wechat_status);
        sb.append(", template_id=").append(template_id);
        sb.append(", static_domain=").append(static_domain);
        sb.append(", test_account_money=").append(test_account_money);
        sb.append(", platform_name=").append(platform_name);
        sb.append(", app_status=").append(app_status);
        sb.append(", app_code=").append(app_code);
        sb.append(", station_code=").append(station_code);
        sb.append(", ip_reg_status=").append(ip_reg_status);
        sb.append(", update_ip_reg_time=").append(update_ip_reg_time);
        sb.append(", ip_reg_num=").append(ip_reg_num);
        sb.append(", app_domain=").append(app_domain);
        sb.append(", special_login_status=").append(special_login_status);
        sb.append(", multi_channel_status=").append(multi_channel_status);
        sb.append(", promotion_storey_num=").append(promotion_storey_num);
        sb.append(", promotion_betting_max_rebate=").append(promotion_betting_max_rebate);
        sb.append(", member_profit_loss=").append(member_profit_loss);
        sb.append(", enable_native_pay=").append(enable_native_pay);
        sb.append(", data_source_type=").append(data_source_type);
        sb.append(", today_report_search=").append(today_report_search);
        sb.append(", send_to_es=").append(send_to_es);
        sb.append(", ip_reg_max_num=").append(ip_reg_max_num);
        sb.append(", close_mbr_time=").append(close_mbr_time);
        sb.append(", open_mbr_time=").append(open_mbr_time);
        sb.append(", data_source_map=").append(data_source_map);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}