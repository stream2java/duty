package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 会员资料表
 * @TableName at_member_message
 */
@TableName(value ="at_member_message")
@Data
public class AtMemberMessage implements Serializable {
    /**
     * 
     */
    @TableId(value = "message_id")
    private Object message_id;

    /**
     * 会员编号
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 昵称【此字段作废使用at_account表中name字段，20130520】
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    private LocalDateTime birthday;

    /**
     * 国家
     */
    @TableField(value = "country")
    private String country;

    /**
     * 联系方式
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 取款密码
     */
    @TableField(value = "draw_money_pwd")
    private String draw_money_pwd;

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
     * 会员银行卡帐号
     */
    @TableField(value = "bank_account")
    private String bank_account;

    /**
     * 会员银行卡银行
     */
    @TableField(value = "bank_id")
    private Object bank_id;

    /**
     * 会员银行卡名称
     */
    @TableField(value = "card_name")
    private String card_name;

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
     * 大大股东ID
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 英文昵称
     */
    @TableField(value = "enickname")
    private String enickname;

    /**
     * 身份证号
     */
    @TableField(value = "cardid")
    private String cardid;

    /**
     * 护照号
     */
    @TableField(value = "id_number")
    private String id_number;

    /**
     * 
     */
    @TableField(value = "wx_nickname")
    private String wx_nickname;

    /**
     * 
     */
    @TableField(value = "weixin_tacc")
    private String weixin_tacc;

    /**
     * 取款密码错误次数
     */
    @TableField(value = "error_num")
    private Object error_num;

    /**
     * 支付宝账号
     */
    @TableField(value = "alipay_account")
    private String alipay_account;

    /**
     * 注册域名
     */
    @TableField(value = "register_domain")
    private String register_domain;

    /**
     * 终端类型
     */
    @TableField(value = "register_device")
    private Object register_device;

    /**
     * 
     */
    @TableField(value = "message_status")
    private Object message_status;

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
        AtMemberMessage other = (AtMemberMessage) that;
        return (this.getMessage_id() == null ? other.getMessage_id() == null : this.getMessage_id().equals(other.getMessage_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getDraw_money_pwd() == null ? other.getDraw_money_pwd() == null : this.getDraw_money_pwd().equals(other.getDraw_money_pwd()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getBank_account() == null ? other.getBank_account() == null : this.getBank_account().equals(other.getBank_account()))
            && (this.getBank_id() == null ? other.getBank_id() == null : this.getBank_id().equals(other.getBank_id()))
            && (this.getCard_name() == null ? other.getCard_name() == null : this.getCard_name().equals(other.getCard_name()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getEnickname() == null ? other.getEnickname() == null : this.getEnickname().equals(other.getEnickname()))
            && (this.getCardid() == null ? other.getCardid() == null : this.getCardid().equals(other.getCardid()))
            && (this.getId_number() == null ? other.getId_number() == null : this.getId_number().equals(other.getId_number()))
            && (this.getWx_nickname() == null ? other.getWx_nickname() == null : this.getWx_nickname().equals(other.getWx_nickname()))
            && (this.getWeixin_tacc() == null ? other.getWeixin_tacc() == null : this.getWeixin_tacc().equals(other.getWeixin_tacc()))
            && (this.getError_num() == null ? other.getError_num() == null : this.getError_num().equals(other.getError_num()))
            && (this.getAlipay_account() == null ? other.getAlipay_account() == null : this.getAlipay_account().equals(other.getAlipay_account()))
            && (this.getRegister_domain() == null ? other.getRegister_domain() == null : this.getRegister_domain().equals(other.getRegister_domain()))
            && (this.getRegister_device() == null ? other.getRegister_device() == null : this.getRegister_device().equals(other.getRegister_device()))
            && (this.getMessage_status() == null ? other.getMessage_status() == null : this.getMessage_status().equals(other.getMessage_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMessage_id() == null) ? 0 : getMessage_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getDraw_money_pwd() == null) ? 0 : getDraw_money_pwd().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getBank_account() == null) ? 0 : getBank_account().hashCode());
        result = prime * result + ((getBank_id() == null) ? 0 : getBank_id().hashCode());
        result = prime * result + ((getCard_name() == null) ? 0 : getCard_name().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getEnickname() == null) ? 0 : getEnickname().hashCode());
        result = prime * result + ((getCardid() == null) ? 0 : getCardid().hashCode());
        result = prime * result + ((getId_number() == null) ? 0 : getId_number().hashCode());
        result = prime * result + ((getWx_nickname() == null) ? 0 : getWx_nickname().hashCode());
        result = prime * result + ((getWeixin_tacc() == null) ? 0 : getWeixin_tacc().hashCode());
        result = prime * result + ((getError_num() == null) ? 0 : getError_num().hashCode());
        result = prime * result + ((getAlipay_account() == null) ? 0 : getAlipay_account().hashCode());
        result = prime * result + ((getRegister_domain() == null) ? 0 : getRegister_domain().hashCode());
        result = prime * result + ((getRegister_device() == null) ? 0 : getRegister_device().hashCode());
        result = prime * result + ((getMessage_status() == null) ? 0 : getMessage_status().hashCode());
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
        sb.append(", nickname=").append(nickname);
        sb.append(", birthday=").append(birthday);
        sb.append(", country=").append(country);
        sb.append(", phone=").append(phone);
        sb.append(", draw_money_pwd=").append(draw_money_pwd);
        sb.append(", qq=").append(qq);
        sb.append(", email=").append(email);
        sb.append(", bank_account=").append(bank_account);
        sb.append(", bank_id=").append(bank_id);
        sb.append(", card_name=").append(card_name);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", remark=").append(remark);
        sb.append(", enickname=").append(enickname);
        sb.append(", cardid=").append(cardid);
        sb.append(", id_number=").append(id_number);
        sb.append(", wx_nickname=").append(wx_nickname);
        sb.append(", weixin_tacc=").append(weixin_tacc);
        sb.append(", error_num=").append(error_num);
        sb.append(", alipay_account=").append(alipay_account);
        sb.append(", register_domain=").append(register_domain);
        sb.append(", register_device=").append(register_device);
        sb.append(", message_status=").append(message_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}