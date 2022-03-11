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
 * @TableName at_member_message_backup
 */
@TableName(value ="at_member_message_backup")
@Data
public class AtMemberMessageBackup implements Serializable {
    /**
     * 
     */
    @TableField(value = "mmb_id")
    private Object mmb_id;

    /**
     * 会员编号
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "mmb_type")
    private Object mmb_type;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

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
        AtMemberMessageBackup other = (AtMemberMessageBackup) that;
        return (this.getMmb_id() == null ? other.getMmb_id() == null : this.getMmb_id().equals(other.getMmb_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getMmb_type() == null ? other.getMmb_type() == null : this.getMmb_type().equals(other.getMmb_type()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
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
            && (this.getId_number() == null ? other.getId_number() == null : this.getId_number().equals(other.getId_number()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMmb_id() == null) ? 0 : getMmb_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getMmb_type() == null) ? 0 : getMmb_type().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mmb_id=").append(mmb_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", mmb_type=").append(mmb_type);
        sb.append(", create_time=").append(create_time);
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}