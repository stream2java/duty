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
 * 出款记录表
 * @TableName mny_draw_record
 */
@TableName(value ="mny_draw_record")
@Data
public class MnyDrawRecord implements Serializable {
    /**
     * 出款记录表id
     */
    @TableId(value = "draw_record_id")
    private Object draw_record_id;

    /**
     * 会员等级id
     */
    @TableField(value = "level_id")
    private Object level_id;

    /**
     * 会员id
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 申请提出额度
     */
    @TableField(value = "draw_limit")
    private BigDecimal draw_limit;

    /**
     * 手续费
     */
    @TableField(value = "poundage")
    private BigDecimal poundage;

    /**
     * 优惠金额
     */
    @TableField(value = "pre_money")
    private BigDecimal pre_money;

    /**
     * 实际出款金额
     */
    @TableField(value = "draw_money")
    private BigDecimal draw_money;

    /**
     * 出款状况，是首次出款则显示‘首次出款’
     */
    @TableField(value = "draw_situation")
    private String draw_situation;

    /**
     * 优惠是否扣除:0-否,1-是
     */
    @TableField(value = "deduct_pre")
    private Object deduct_pre;

    /**
     * 已出款:0-处理中,1-已存入,2-已取消,3-已拒绝
     */
    @TableField(value = "draw_status")
    private Object draw_status;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 操作者
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 操作时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 优惠稽核状态是否清除稽核点：0-否,1-是
     */
    @TableField(value = "pre_check_status")
    private Object pre_check_status;

    /**
     * 出款金额备注
     */
    @TableField(value = "draw_money_remark")
    private String draw_money_remark;

    /**
     * 出款类别
     */
    @TableField(value = "draw_project_id")
    private Object draw_project_id;

    /**
     * 大大股东ID
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 是否常态性稽核：0-否1-是
     */
    @TableField(value = "normal_check_status")
    private Object normal_check_status;

    /**
     * 需扣除优惠
     */
    @TableField(value = "deduct_pre_money")
    private BigDecimal deduct_pre_money;

    /**
     * 需扣除行政费用
     */
    @TableField(value = "deduct_adm_money")
    private BigDecimal deduct_adm_money;

    /**
     * 稽核起始时间
     */
    @TableField(value = "check_time_start")
    private LocalDateTime check_time_start;

    /**
     * 稽核结束时间
     */
    @TableField(value = "check_time_end")
    private LocalDateTime check_time_end;

    /**
     *  记录时间
     */
    @TableField(value = "record_time")
    private LocalDateTime record_time;

    /**
     * 重复出款手续费
     */
    @TableField(value = "repeat_draw_poundage")
    private BigDecimal repeat_draw_poundage;

    /**
     * 
     */
    @TableField(value = "order_no")
    private String order_no;

    /**
     * 会员账号
     */
    @TableField(value = "member_account")
    private String member_account;

    /**
     * 大股东id
     */
    @TableField(value = "account_id2")
    private Object account_id2;

    /**
     * 大股东账号
     */
    @TableField(value = "account2_name")
    private String account2_name;

    /**
     * 会员层级名称
     */
    @TableField(value = "level_name")
    private String level_name;

    /**
     * 会员银行卡名称
     */
    @TableField(value = "card_name")
    private String card_name;

    /**
     * 银行名称
     */
    @TableField(value = "bank_name")
    private String bank_name;

    /**
     * 银行帐号
     */
    @TableField(value = "bank_account")
    private String bank_account;

    /**
     * 省份
     */
    @TableField(value = "province")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 联络电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 浼氬憳娑堟伅澶囨敞
     */
    @TableField(value = "member_message_remark")
    private String member_message_remark;

    /**
     * 代理账号
     */
    @TableField(value = "account5_name")
    private String account5_name;

    /**
     * 代理id
     */
    @TableField(value = "account_id5")
    private Object account_id5;

    /**
     * 商户号
     */
    @TableField(value = "merchant_id")
    private Object merchant_id;

    /**
     * 是哪个账号锁定的
     */
    @TableField(value = "lock_account")
    private String lock_account;

    /**
     * 
     */
    @TableField(value = "qremark")
    private String qremark;

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
     * 临时账号标记
     */
    @TableField(value = "wx_temp")
    private String wx_temp;

    /**
     * 预备出款状态  1：预备出款  默认为：0
     */
    @TableField(value = "prepare_draw_status")
    private Object prepare_draw_status;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

    /**
     * 出款类型： 1、银行卡 2、余额宝 3、余额宝转银行卡
     */
    @TableField(value = "draw_type")
    private Object draw_type;

    /**
     * 余额宝利率周期
     */
    @TableField(value = "interest_cycle")
    private Object interest_cycle;

    /**
     * 余额宝利率
     */
    @TableField(value = "interest_rate")
    private BigDecimal interest_rate;

    /**
     * 余额宝附加利率
     */
    @TableField(value = "addition_interest_rate")
    private BigDecimal addition_interest_rate;

    /**
     * 开户行
     */
    @TableField(value = "opening_bank")
    private String opening_bank;

    /**
     * 终端类型
     */
    @TableField(value = "device")
    private Object device;

    /**
     * 緊急停止出款状态  1：停止出款  默认为：0
     */
    @TableField(value = "stop_draw_status")
    private Object stop_draw_status;

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
        MnyDrawRecord other = (MnyDrawRecord) that;
        return (this.getDraw_record_id() == null ? other.getDraw_record_id() == null : this.getDraw_record_id().equals(other.getDraw_record_id()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getDraw_limit() == null ? other.getDraw_limit() == null : this.getDraw_limit().equals(other.getDraw_limit()))
            && (this.getPoundage() == null ? other.getPoundage() == null : this.getPoundage().equals(other.getPoundage()))
            && (this.getPre_money() == null ? other.getPre_money() == null : this.getPre_money().equals(other.getPre_money()))
            && (this.getDraw_money() == null ? other.getDraw_money() == null : this.getDraw_money().equals(other.getDraw_money()))
            && (this.getDraw_situation() == null ? other.getDraw_situation() == null : this.getDraw_situation().equals(other.getDraw_situation()))
            && (this.getDeduct_pre() == null ? other.getDeduct_pre() == null : this.getDeduct_pre().equals(other.getDeduct_pre()))
            && (this.getDraw_status() == null ? other.getDraw_status() == null : this.getDraw_status().equals(other.getDraw_status()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPre_check_status() == null ? other.getPre_check_status() == null : this.getPre_check_status().equals(other.getPre_check_status()))
            && (this.getDraw_money_remark() == null ? other.getDraw_money_remark() == null : this.getDraw_money_remark().equals(other.getDraw_money_remark()))
            && (this.getDraw_project_id() == null ? other.getDraw_project_id() == null : this.getDraw_project_id().equals(other.getDraw_project_id()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getNormal_check_status() == null ? other.getNormal_check_status() == null : this.getNormal_check_status().equals(other.getNormal_check_status()))
            && (this.getDeduct_pre_money() == null ? other.getDeduct_pre_money() == null : this.getDeduct_pre_money().equals(other.getDeduct_pre_money()))
            && (this.getDeduct_adm_money() == null ? other.getDeduct_adm_money() == null : this.getDeduct_adm_money().equals(other.getDeduct_adm_money()))
            && (this.getCheck_time_start() == null ? other.getCheck_time_start() == null : this.getCheck_time_start().equals(other.getCheck_time_start()))
            && (this.getCheck_time_end() == null ? other.getCheck_time_end() == null : this.getCheck_time_end().equals(other.getCheck_time_end()))
            && (this.getRecord_time() == null ? other.getRecord_time() == null : this.getRecord_time().equals(other.getRecord_time()))
            && (this.getRepeat_draw_poundage() == null ? other.getRepeat_draw_poundage() == null : this.getRepeat_draw_poundage().equals(other.getRepeat_draw_poundage()))
            && (this.getOrder_no() == null ? other.getOrder_no() == null : this.getOrder_no().equals(other.getOrder_no()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getAccount_id2() == null ? other.getAccount_id2() == null : this.getAccount_id2().equals(other.getAccount_id2()))
            && (this.getAccount2_name() == null ? other.getAccount2_name() == null : this.getAccount2_name().equals(other.getAccount2_name()))
            && (this.getLevel_name() == null ? other.getLevel_name() == null : this.getLevel_name().equals(other.getLevel_name()))
            && (this.getCard_name() == null ? other.getCard_name() == null : this.getCard_name().equals(other.getCard_name()))
            && (this.getBank_name() == null ? other.getBank_name() == null : this.getBank_name().equals(other.getBank_name()))
            && (this.getBank_account() == null ? other.getBank_account() == null : this.getBank_account().equals(other.getBank_account()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getMember_message_remark() == null ? other.getMember_message_remark() == null : this.getMember_message_remark().equals(other.getMember_message_remark()))
            && (this.getAccount5_name() == null ? other.getAccount5_name() == null : this.getAccount5_name().equals(other.getAccount5_name()))
            && (this.getAccount_id5() == null ? other.getAccount_id5() == null : this.getAccount_id5().equals(other.getAccount_id5()))
            && (this.getMerchant_id() == null ? other.getMerchant_id() == null : this.getMerchant_id().equals(other.getMerchant_id()))
            && (this.getLock_account() == null ? other.getLock_account() == null : this.getLock_account().equals(other.getLock_account()))
            && (this.getQremark() == null ? other.getQremark() == null : this.getQremark().equals(other.getQremark()))
            && (this.getWx_account() == null ? other.getWx_account() == null : this.getWx_account().equals(other.getWx_account()))
            && (this.getWx_nickname() == null ? other.getWx_nickname() == null : this.getWx_nickname().equals(other.getWx_nickname()))
            && (this.getWx_temp() == null ? other.getWx_temp() == null : this.getWx_temp().equals(other.getWx_temp()))
            && (this.getPrepare_draw_status() == null ? other.getPrepare_draw_status() == null : this.getPrepare_draw_status().equals(other.getPrepare_draw_status()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDraw_type() == null ? other.getDraw_type() == null : this.getDraw_type().equals(other.getDraw_type()))
            && (this.getInterest_cycle() == null ? other.getInterest_cycle() == null : this.getInterest_cycle().equals(other.getInterest_cycle()))
            && (this.getInterest_rate() == null ? other.getInterest_rate() == null : this.getInterest_rate().equals(other.getInterest_rate()))
            && (this.getAddition_interest_rate() == null ? other.getAddition_interest_rate() == null : this.getAddition_interest_rate().equals(other.getAddition_interest_rate()))
            && (this.getOpening_bank() == null ? other.getOpening_bank() == null : this.getOpening_bank().equals(other.getOpening_bank()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()))
            && (this.getStop_draw_status() == null ? other.getStop_draw_status() == null : this.getStop_draw_status().equals(other.getStop_draw_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDraw_record_id() == null) ? 0 : getDraw_record_id().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getDraw_limit() == null) ? 0 : getDraw_limit().hashCode());
        result = prime * result + ((getPoundage() == null) ? 0 : getPoundage().hashCode());
        result = prime * result + ((getPre_money() == null) ? 0 : getPre_money().hashCode());
        result = prime * result + ((getDraw_money() == null) ? 0 : getDraw_money().hashCode());
        result = prime * result + ((getDraw_situation() == null) ? 0 : getDraw_situation().hashCode());
        result = prime * result + ((getDeduct_pre() == null) ? 0 : getDeduct_pre().hashCode());
        result = prime * result + ((getDraw_status() == null) ? 0 : getDraw_status().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPre_check_status() == null) ? 0 : getPre_check_status().hashCode());
        result = prime * result + ((getDraw_money_remark() == null) ? 0 : getDraw_money_remark().hashCode());
        result = prime * result + ((getDraw_project_id() == null) ? 0 : getDraw_project_id().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getNormal_check_status() == null) ? 0 : getNormal_check_status().hashCode());
        result = prime * result + ((getDeduct_pre_money() == null) ? 0 : getDeduct_pre_money().hashCode());
        result = prime * result + ((getDeduct_adm_money() == null) ? 0 : getDeduct_adm_money().hashCode());
        result = prime * result + ((getCheck_time_start() == null) ? 0 : getCheck_time_start().hashCode());
        result = prime * result + ((getCheck_time_end() == null) ? 0 : getCheck_time_end().hashCode());
        result = prime * result + ((getRecord_time() == null) ? 0 : getRecord_time().hashCode());
        result = prime * result + ((getRepeat_draw_poundage() == null) ? 0 : getRepeat_draw_poundage().hashCode());
        result = prime * result + ((getOrder_no() == null) ? 0 : getOrder_no().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getAccount_id2() == null) ? 0 : getAccount_id2().hashCode());
        result = prime * result + ((getAccount2_name() == null) ? 0 : getAccount2_name().hashCode());
        result = prime * result + ((getLevel_name() == null) ? 0 : getLevel_name().hashCode());
        result = prime * result + ((getCard_name() == null) ? 0 : getCard_name().hashCode());
        result = prime * result + ((getBank_name() == null) ? 0 : getBank_name().hashCode());
        result = prime * result + ((getBank_account() == null) ? 0 : getBank_account().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getMember_message_remark() == null) ? 0 : getMember_message_remark().hashCode());
        result = prime * result + ((getAccount5_name() == null) ? 0 : getAccount5_name().hashCode());
        result = prime * result + ((getAccount_id5() == null) ? 0 : getAccount_id5().hashCode());
        result = prime * result + ((getMerchant_id() == null) ? 0 : getMerchant_id().hashCode());
        result = prime * result + ((getLock_account() == null) ? 0 : getLock_account().hashCode());
        result = prime * result + ((getQremark() == null) ? 0 : getQremark().hashCode());
        result = prime * result + ((getWx_account() == null) ? 0 : getWx_account().hashCode());
        result = prime * result + ((getWx_nickname() == null) ? 0 : getWx_nickname().hashCode());
        result = prime * result + ((getWx_temp() == null) ? 0 : getWx_temp().hashCode());
        result = prime * result + ((getPrepare_draw_status() == null) ? 0 : getPrepare_draw_status().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDraw_type() == null) ? 0 : getDraw_type().hashCode());
        result = prime * result + ((getInterest_cycle() == null) ? 0 : getInterest_cycle().hashCode());
        result = prime * result + ((getInterest_rate() == null) ? 0 : getInterest_rate().hashCode());
        result = prime * result + ((getAddition_interest_rate() == null) ? 0 : getAddition_interest_rate().hashCode());
        result = prime * result + ((getOpening_bank() == null) ? 0 : getOpening_bank().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        result = prime * result + ((getStop_draw_status() == null) ? 0 : getStop_draw_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", draw_record_id=").append(draw_record_id);
        sb.append(", level_id=").append(level_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", draw_limit=").append(draw_limit);
        sb.append(", poundage=").append(poundage);
        sb.append(", pre_money=").append(pre_money);
        sb.append(", draw_money=").append(draw_money);
        sb.append(", draw_situation=").append(draw_situation);
        sb.append(", deduct_pre=").append(deduct_pre);
        sb.append(", draw_status=").append(draw_status);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", pre_check_status=").append(pre_check_status);
        sb.append(", draw_money_remark=").append(draw_money_remark);
        sb.append(", draw_project_id=").append(draw_project_id);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", normal_check_status=").append(normal_check_status);
        sb.append(", deduct_pre_money=").append(deduct_pre_money);
        sb.append(", deduct_adm_money=").append(deduct_adm_money);
        sb.append(", check_time_start=").append(check_time_start);
        sb.append(", check_time_end=").append(check_time_end);
        sb.append(", record_time=").append(record_time);
        sb.append(", repeat_draw_poundage=").append(repeat_draw_poundage);
        sb.append(", order_no=").append(order_no);
        sb.append(", member_account=").append(member_account);
        sb.append(", account_id2=").append(account_id2);
        sb.append(", account2_name=").append(account2_name);
        sb.append(", level_name=").append(level_name);
        sb.append(", card_name=").append(card_name);
        sb.append(", bank_name=").append(bank_name);
        sb.append(", bank_account=").append(bank_account);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", phone=").append(phone);
        sb.append(", member_message_remark=").append(member_message_remark);
        sb.append(", account5_name=").append(account5_name);
        sb.append(", account_id5=").append(account_id5);
        sb.append(", merchant_id=").append(merchant_id);
        sb.append(", lock_account=").append(lock_account);
        sb.append(", qremark=").append(qremark);
        sb.append(", wx_account=").append(wx_account);
        sb.append(", wx_nickname=").append(wx_nickname);
        sb.append(", wx_temp=").append(wx_temp);
        sb.append(", prepare_draw_status=").append(prepare_draw_status);
        sb.append(", type=").append(type);
        sb.append(", draw_type=").append(draw_type);
        sb.append(", interest_cycle=").append(interest_cycle);
        sb.append(", interest_rate=").append(interest_rate);
        sb.append(", addition_interest_rate=").append(addition_interest_rate);
        sb.append(", opening_bank=").append(opening_bank);
        sb.append(", device=").append(device);
        sb.append(", stop_draw_status=").append(stop_draw_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}