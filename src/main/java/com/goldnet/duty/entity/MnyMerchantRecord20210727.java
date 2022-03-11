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
 * @TableName mny_merchant_record_20210727
 */
@TableName(value ="mny_merchant_record_20210727")
@Data
public class MnyMerchantRecord20210727 implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 
     */
    @TableField(value = "levelname")
    private String levelname;

    /**
     * 
     */
    @TableField(value = "levelno")
    private Object levelno;

    /**
     * 
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 
     */
    @TableField(value = "paysystem")
    private String paysystem;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "createtime")
    private LocalDateTime createtime;

    /**
     * 
     */
    @TableField(value = "email")
    private String email;

    /**
     * 
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 
     */
    @TableField(value = "memberid")
    private Object memberid;

    /**
     * 
     */
    @TableField(value = "stockholderid")
    private Object stockholderid;

    /**
     * 
     */
    @TableField(value = "memid")
    private Object memid;

    /**
     * 
     */
    @TableField(value = "merchant_id")
    private Object merchant_id;

    /**
     * 
     */
    @TableField(value = "youhui")
    private String youhui;

    /**
     * 
     */
    @TableField(value = "levelid")
    private Object levelid;

    /**
     * 
     */
    @TableField(value = "orderno")
    private String orderno;

    /**
     * 
     */
    @TableField(value = "merchantno")
    private String merchantno;

    /**
     * 
     */
    @TableField(value = "manaual")
    private Object manaual;

    /**
     * 
     */
    @TableField(value = "pay_call_date")
    private LocalDateTime pay_call_date;

    /**
     * 
     */
    @TableField(value = "bank_key")
    private String bank_key;

    /**
     * 
     */
    @TableField(value = "banktype")
    private Object banktype;

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
    @TableField(value = "wx_temp")
    private String wx_temp;

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
        MnyMerchantRecord20210727 other = (MnyMerchantRecord20210727) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getLevelname() == null ? other.getLevelname() == null : this.getLevelname().equals(other.getLevelname()))
            && (this.getLevelno() == null ? other.getLevelno() == null : this.getLevelno().equals(other.getLevelno()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPaysystem() == null ? other.getPaysystem() == null : this.getPaysystem().equals(other.getPaysystem()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getStockholderid() == null ? other.getStockholderid() == null : this.getStockholderid().equals(other.getStockholderid()))
            && (this.getMemid() == null ? other.getMemid() == null : this.getMemid().equals(other.getMemid()))
            && (this.getMerchant_id() == null ? other.getMerchant_id() == null : this.getMerchant_id().equals(other.getMerchant_id()))
            && (this.getYouhui() == null ? other.getYouhui() == null : this.getYouhui().equals(other.getYouhui()))
            && (this.getLevelid() == null ? other.getLevelid() == null : this.getLevelid().equals(other.getLevelid()))
            && (this.getOrderno() == null ? other.getOrderno() == null : this.getOrderno().equals(other.getOrderno()))
            && (this.getMerchantno() == null ? other.getMerchantno() == null : this.getMerchantno().equals(other.getMerchantno()))
            && (this.getManaual() == null ? other.getManaual() == null : this.getManaual().equals(other.getManaual()))
            && (this.getPay_call_date() == null ? other.getPay_call_date() == null : this.getPay_call_date().equals(other.getPay_call_date()))
            && (this.getBank_key() == null ? other.getBank_key() == null : this.getBank_key().equals(other.getBank_key()))
            && (this.getBanktype() == null ? other.getBanktype() == null : this.getBanktype().equals(other.getBanktype()))
            && (this.getWx_account() == null ? other.getWx_account() == null : this.getWx_account().equals(other.getWx_account()))
            && (this.getWx_nickname() == null ? other.getWx_nickname() == null : this.getWx_nickname().equals(other.getWx_nickname()))
            && (this.getWx_temp() == null ? other.getWx_temp() == null : this.getWx_temp().equals(other.getWx_temp()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getLevelname() == null) ? 0 : getLevelname().hashCode());
        result = prime * result + ((getLevelno() == null) ? 0 : getLevelno().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPaysystem() == null) ? 0 : getPaysystem().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getStockholderid() == null) ? 0 : getStockholderid().hashCode());
        result = prime * result + ((getMemid() == null) ? 0 : getMemid().hashCode());
        result = prime * result + ((getMerchant_id() == null) ? 0 : getMerchant_id().hashCode());
        result = prime * result + ((getYouhui() == null) ? 0 : getYouhui().hashCode());
        result = prime * result + ((getLevelid() == null) ? 0 : getLevelid().hashCode());
        result = prime * result + ((getOrderno() == null) ? 0 : getOrderno().hashCode());
        result = prime * result + ((getMerchantno() == null) ? 0 : getMerchantno().hashCode());
        result = prime * result + ((getManaual() == null) ? 0 : getManaual().hashCode());
        result = prime * result + ((getPay_call_date() == null) ? 0 : getPay_call_date().hashCode());
        result = prime * result + ((getBank_key() == null) ? 0 : getBank_key().hashCode());
        result = prime * result + ((getBanktype() == null) ? 0 : getBanktype().hashCode());
        result = prime * result + ((getWx_account() == null) ? 0 : getWx_account().hashCode());
        result = prime * result + ((getWx_nickname() == null) ? 0 : getWx_nickname().hashCode());
        result = prime * result + ((getWx_temp() == null) ? 0 : getWx_temp().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", amount=").append(amount);
        sb.append(", account=").append(account);
        sb.append(", levelname=").append(levelname);
        sb.append(", levelno=").append(levelno);
        sb.append(", status=").append(status);
        sb.append(", paysystem=").append(paysystem);
        sb.append(", remark=").append(remark);
        sb.append(", createtime=").append(createtime);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", memberid=").append(memberid);
        sb.append(", stockholderid=").append(stockholderid);
        sb.append(", memid=").append(memid);
        sb.append(", merchant_id=").append(merchant_id);
        sb.append(", youhui=").append(youhui);
        sb.append(", levelid=").append(levelid);
        sb.append(", orderno=").append(orderno);
        sb.append(", merchantno=").append(merchantno);
        sb.append(", manaual=").append(manaual);
        sb.append(", pay_call_date=").append(pay_call_date);
        sb.append(", bank_key=").append(bank_key);
        sb.append(", banktype=").append(banktype);
        sb.append(", wx_account=").append(wx_account);
        sb.append(", wx_nickname=").append(wx_nickname);
        sb.append(", wx_temp=").append(wx_temp);
        sb.append(", device=").append(device);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}