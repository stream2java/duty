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
 * 公司入款帐号管理表
 * @TableName mny_companyaccount
 */
@TableName(value ="mny_companyaccount")
@Data
public class MnyCompanyaccount implements Serializable {
    /**
     * 公司入款帐号管理表id
     */
    @TableId(value = "companyaccount_id")
    private Object companyaccount_id;

    /**
     * 币别id
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 银行id
     */
    @TableField(value = "bank_id")
    private Object bank_id;

    /**
     * 公司银行帐号
     */
    @TableField(value = "bankaccount")
    private String bankaccount;

    /**
     * 控端提示
     */
    @TableField(value = "prompt")
    private String prompt;

    /**
     * 收款人(户名,在会员端显示)
     */
    @TableField(value = "chamberlain")
    private String chamberlain;

    /**
     * 开户银行站点(xx地区xx支行,在会员端显示)
     */
    @TableField(value = "bankstation")
    private String bankstation;

    /**
     * 会员端显示的入款卡号
     */
    @TableField(value = "mbankaccount")
    private String mbankaccount;

    /**
     * 该帐号是否停用(停用为0,未停用为1)
     */
    @TableField(value = "shutdown")
    private Object shutdown;

    /**
     * 该帐号是否隐藏(隐藏为0,未隐藏为1)
     */
    @TableField(value = "isdetele")
    private Object isdetele;

    /**
     * 创建人
     */
    @TableField(value = "founder")
    private String founder;

    /**
     * 创建时间
     */
    @TableField(value = "foundtime")
    private LocalDateTime foundtime;

    /**
     * 修改人
     */
    @TableField(value = "moder")
    private String moder;

    /**
     * 修改时间
     */
    @TableField(value = "modtime")
    private LocalDateTime modtime;

    /**
     * 二维码图片路径
     */
    @TableField(value = "qr_code")
    private String qr_code;

    /**
     * 最大存款金额
     */
    @TableField(value = "max_deposit")
    private Double max_deposit;

    /**
     * 当前已入款金额
     */
    @TableField(value = "curr_deposit")
    private Double curr_deposit;

    /**
     * 帐号排序
     */
    @TableField(value = "accountorder")
    private Object accountorder;

    /**
     * 微信和支付宝好友转账银行名称
     */
    @TableField(value = "online_bank_name")
    private String online_bank_name;

    /**
     * 微信和支付宝好友转账银行卡号
     */
    @TableField(value = "online_bank_account")
    private String online_bank_account;

    /**
     * 是否为银行支付 0-银行 1-非银行
     */
    @TableField(value = "isbank")
    private Object isbank;

    /**
     * 商家描述
     */
    @TableField(value = "merchant_comment")
    private String merchant_comment;

    /**
     * 恢复状态(1 自动暂停 2 手动暂停 3 自动恢复  4 手动恢复）,与限额有关的状态
     */
    @TableField(value = "ask_status")
    private Object ask_status;

    /**
     * 单笔最低限额
     */
    @TableField(value = "min_deposit_amount")
    private BigDecimal min_deposit_amount;

    /**
     * 单笔最高限额
     */
    @TableField(value = "max_deposit_amount")
    private BigDecimal max_deposit_amount;

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
        MnyCompanyaccount other = (MnyCompanyaccount) that;
        return (this.getCompanyaccount_id() == null ? other.getCompanyaccount_id() == null : this.getCompanyaccount_id().equals(other.getCompanyaccount_id()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getBank_id() == null ? other.getBank_id() == null : this.getBank_id().equals(other.getBank_id()))
            && (this.getBankaccount() == null ? other.getBankaccount() == null : this.getBankaccount().equals(other.getBankaccount()))
            && (this.getPrompt() == null ? other.getPrompt() == null : this.getPrompt().equals(other.getPrompt()))
            && (this.getChamberlain() == null ? other.getChamberlain() == null : this.getChamberlain().equals(other.getChamberlain()))
            && (this.getBankstation() == null ? other.getBankstation() == null : this.getBankstation().equals(other.getBankstation()))
            && (this.getMbankaccount() == null ? other.getMbankaccount() == null : this.getMbankaccount().equals(other.getMbankaccount()))
            && (this.getShutdown() == null ? other.getShutdown() == null : this.getShutdown().equals(other.getShutdown()))
            && (this.getIsdetele() == null ? other.getIsdetele() == null : this.getIsdetele().equals(other.getIsdetele()))
            && (this.getFounder() == null ? other.getFounder() == null : this.getFounder().equals(other.getFounder()))
            && (this.getFoundtime() == null ? other.getFoundtime() == null : this.getFoundtime().equals(other.getFoundtime()))
            && (this.getModer() == null ? other.getModer() == null : this.getModer().equals(other.getModer()))
            && (this.getModtime() == null ? other.getModtime() == null : this.getModtime().equals(other.getModtime()))
            && (this.getQr_code() == null ? other.getQr_code() == null : this.getQr_code().equals(other.getQr_code()))
            && (this.getMax_deposit() == null ? other.getMax_deposit() == null : this.getMax_deposit().equals(other.getMax_deposit()))
            && (this.getCurr_deposit() == null ? other.getCurr_deposit() == null : this.getCurr_deposit().equals(other.getCurr_deposit()))
            && (this.getAccountorder() == null ? other.getAccountorder() == null : this.getAccountorder().equals(other.getAccountorder()))
            && (this.getOnline_bank_name() == null ? other.getOnline_bank_name() == null : this.getOnline_bank_name().equals(other.getOnline_bank_name()))
            && (this.getOnline_bank_account() == null ? other.getOnline_bank_account() == null : this.getOnline_bank_account().equals(other.getOnline_bank_account()))
            && (this.getIsbank() == null ? other.getIsbank() == null : this.getIsbank().equals(other.getIsbank()))
            && (this.getMerchant_comment() == null ? other.getMerchant_comment() == null : this.getMerchant_comment().equals(other.getMerchant_comment()))
            && (this.getAsk_status() == null ? other.getAsk_status() == null : this.getAsk_status().equals(other.getAsk_status()))
            && (this.getMin_deposit_amount() == null ? other.getMin_deposit_amount() == null : this.getMin_deposit_amount().equals(other.getMin_deposit_amount()))
            && (this.getMax_deposit_amount() == null ? other.getMax_deposit_amount() == null : this.getMax_deposit_amount().equals(other.getMax_deposit_amount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyaccount_id() == null) ? 0 : getCompanyaccount_id().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getBank_id() == null) ? 0 : getBank_id().hashCode());
        result = prime * result + ((getBankaccount() == null) ? 0 : getBankaccount().hashCode());
        result = prime * result + ((getPrompt() == null) ? 0 : getPrompt().hashCode());
        result = prime * result + ((getChamberlain() == null) ? 0 : getChamberlain().hashCode());
        result = prime * result + ((getBankstation() == null) ? 0 : getBankstation().hashCode());
        result = prime * result + ((getMbankaccount() == null) ? 0 : getMbankaccount().hashCode());
        result = prime * result + ((getShutdown() == null) ? 0 : getShutdown().hashCode());
        result = prime * result + ((getIsdetele() == null) ? 0 : getIsdetele().hashCode());
        result = prime * result + ((getFounder() == null) ? 0 : getFounder().hashCode());
        result = prime * result + ((getFoundtime() == null) ? 0 : getFoundtime().hashCode());
        result = prime * result + ((getModer() == null) ? 0 : getModer().hashCode());
        result = prime * result + ((getModtime() == null) ? 0 : getModtime().hashCode());
        result = prime * result + ((getQr_code() == null) ? 0 : getQr_code().hashCode());
        result = prime * result + ((getMax_deposit() == null) ? 0 : getMax_deposit().hashCode());
        result = prime * result + ((getCurr_deposit() == null) ? 0 : getCurr_deposit().hashCode());
        result = prime * result + ((getAccountorder() == null) ? 0 : getAccountorder().hashCode());
        result = prime * result + ((getOnline_bank_name() == null) ? 0 : getOnline_bank_name().hashCode());
        result = prime * result + ((getOnline_bank_account() == null) ? 0 : getOnline_bank_account().hashCode());
        result = prime * result + ((getIsbank() == null) ? 0 : getIsbank().hashCode());
        result = prime * result + ((getMerchant_comment() == null) ? 0 : getMerchant_comment().hashCode());
        result = prime * result + ((getAsk_status() == null) ? 0 : getAsk_status().hashCode());
        result = prime * result + ((getMin_deposit_amount() == null) ? 0 : getMin_deposit_amount().hashCode());
        result = prime * result + ((getMax_deposit_amount() == null) ? 0 : getMax_deposit_amount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyaccount_id=").append(companyaccount_id);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", bank_id=").append(bank_id);
        sb.append(", bankaccount=").append(bankaccount);
        sb.append(", prompt=").append(prompt);
        sb.append(", chamberlain=").append(chamberlain);
        sb.append(", bankstation=").append(bankstation);
        sb.append(", mbankaccount=").append(mbankaccount);
        sb.append(", shutdown=").append(shutdown);
        sb.append(", isdetele=").append(isdetele);
        sb.append(", founder=").append(founder);
        sb.append(", foundtime=").append(foundtime);
        sb.append(", moder=").append(moder);
        sb.append(", modtime=").append(modtime);
        sb.append(", qr_code=").append(qr_code);
        sb.append(", max_deposit=").append(max_deposit);
        sb.append(", curr_deposit=").append(curr_deposit);
        sb.append(", accountorder=").append(accountorder);
        sb.append(", online_bank_name=").append(online_bank_name);
        sb.append(", online_bank_account=").append(online_bank_account);
        sb.append(", isbank=").append(isbank);
        sb.append(", merchant_comment=").append(merchant_comment);
        sb.append(", ask_status=").append(ask_status);
        sb.append(", min_deposit_amount=").append(min_deposit_amount);
        sb.append(", max_deposit_amount=").append(max_deposit_amount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}