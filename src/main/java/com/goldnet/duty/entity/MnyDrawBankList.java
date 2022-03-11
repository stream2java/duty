package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 会员提现银行卡
 * @TableName mny_draw_bank_list
 */
@TableName(value ="mny_draw_bank_list")
@Data
public class MnyDrawBankList implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 会员编号
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 会员银行卡银行
     */
    @TableField(value = "bank_id")
    private Object bank_id;

    /**
     * 会员银行卡帐号
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
     * 其它市县
     */
    @TableField(value = "other_city")
    private String other_city;

    /**
     * 大大股东ID
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 开户行
     */
    @TableField(value = "opening_bank")
    private String opening_bank;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 是否为会员的默认银行卡:1表示默认，0表示非默认，一个会员只有一张默认银行卡
     */
    @TableField(value = "is_defaulted")
    private Integer is_defaulted;

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
        MnyDrawBankList other = (MnyDrawBankList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getBank_id() == null ? other.getBank_id() == null : this.getBank_id().equals(other.getBank_id()))
            && (this.getBank_account() == null ? other.getBank_account() == null : this.getBank_account().equals(other.getBank_account()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getOther_city() == null ? other.getOther_city() == null : this.getOther_city().equals(other.getOther_city()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getOpening_bank() == null ? other.getOpening_bank() == null : this.getOpening_bank().equals(other.getOpening_bank()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_defaulted() == null ? other.getIs_defaulted() == null : this.getIs_defaulted().equals(other.getIs_defaulted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getBank_id() == null) ? 0 : getBank_id().hashCode());
        result = prime * result + ((getBank_account() == null) ? 0 : getBank_account().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getOther_city() == null) ? 0 : getOther_city().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getOpening_bank() == null) ? 0 : getOpening_bank().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getIs_defaulted() == null) ? 0 : getIs_defaulted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account_id=").append(account_id);
        sb.append(", bank_id=").append(bank_id);
        sb.append(", bank_account=").append(bank_account);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", other_city=").append(other_city);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", opening_bank=").append(opening_bank);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_defaulted=").append(is_defaulted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}