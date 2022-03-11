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
 * 出款商家表
 * @TableName mny_merchant_extract
 */
@TableName(value ="mny_merchant_extract")
@Data
public class MnyMerchantExtract implements Serializable {
    /**
     * 商家号列表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 商家代称
     */
    @TableField(value = "merchantname")
    private String merchantname;

    /**
     * 启用1/停用0
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 商号顺序
     */
    @TableField(value = "merchantorder")
    private Object merchantorder;

    /**
     * 停用金额
     */
    @TableField(value = "maxsum")
    private BigDecimal maxsum;

    /**
     * 密钥
     */
    @TableField(value = "merchantkey")
    private String merchantkey;

    /**
     * 
     */
    @TableField(value = "createtime")
    private LocalDateTime createtime;

    /**
     * 
     */
    @TableField(value = "updatetime")
    private LocalDateTime updatetime;

    /**
     * 支付系统id
     */
    @TableField(value = "drawsystemid")
    private Object drawsystemid;

    /**
     * 大大股东
     */
    @TableField(value = "stockholderid")
    private Object stockholderid;

    /**
     * 回复状态(0暂停，1回复）
     */
    @TableField(value = "askstatus")
    private Object askstatus;

    /**
     * 
     */
    @TableField(value = "merchantno")
    private String merchantno;

    /**
     * 
     */
    @TableField(value = "levelid")
    private Object levelid;

    /**
     * 
     */
    @TableField(value = "ismaxsum")
    private Boolean ismaxsum;

    /**
     * 
     */
    @TableField(value = "domain_pay")
    private String domain_pay;

    /**
     * 宝付终端号
     */
    @TableField(value = "merchant_console")
    private String merchant_console;

    /**
     * 限额
     */
    @TableField(value = "quota")
    private Long quota;

    /**
     * 支付平台网关
     */
    @TableField(value = "merchant_gateway")
    private String merchant_gateway;

    /**
     * 商户私钥
     */
    @TableField(value = "privatekey")
    private String privatekey;

    /**
     * 
     */
    @TableField(value = "lower_limit_amount")
    private Long lower_limit_amount;

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
        MnyMerchantExtract other = (MnyMerchantExtract) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantname() == null ? other.getMerchantname() == null : this.getMerchantname().equals(other.getMerchantname()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMerchantorder() == null ? other.getMerchantorder() == null : this.getMerchantorder().equals(other.getMerchantorder()))
            && (this.getMaxsum() == null ? other.getMaxsum() == null : this.getMaxsum().equals(other.getMaxsum()))
            && (this.getMerchantkey() == null ? other.getMerchantkey() == null : this.getMerchantkey().equals(other.getMerchantkey()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getDrawsystemid() == null ? other.getDrawsystemid() == null : this.getDrawsystemid().equals(other.getDrawsystemid()))
            && (this.getStockholderid() == null ? other.getStockholderid() == null : this.getStockholderid().equals(other.getStockholderid()))
            && (this.getAskstatus() == null ? other.getAskstatus() == null : this.getAskstatus().equals(other.getAskstatus()))
            && (this.getMerchantno() == null ? other.getMerchantno() == null : this.getMerchantno().equals(other.getMerchantno()))
            && (this.getLevelid() == null ? other.getLevelid() == null : this.getLevelid().equals(other.getLevelid()))
            && (this.getIsmaxsum() == null ? other.getIsmaxsum() == null : this.getIsmaxsum().equals(other.getIsmaxsum()))
            && (this.getDomain_pay() == null ? other.getDomain_pay() == null : this.getDomain_pay().equals(other.getDomain_pay()))
            && (this.getMerchant_console() == null ? other.getMerchant_console() == null : this.getMerchant_console().equals(other.getMerchant_console()))
            && (this.getQuota() == null ? other.getQuota() == null : this.getQuota().equals(other.getQuota()))
            && (this.getMerchant_gateway() == null ? other.getMerchant_gateway() == null : this.getMerchant_gateway().equals(other.getMerchant_gateway()))
            && (this.getPrivatekey() == null ? other.getPrivatekey() == null : this.getPrivatekey().equals(other.getPrivatekey()))
            && (this.getLower_limit_amount() == null ? other.getLower_limit_amount() == null : this.getLower_limit_amount().equals(other.getLower_limit_amount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantname() == null) ? 0 : getMerchantname().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMerchantorder() == null) ? 0 : getMerchantorder().hashCode());
        result = prime * result + ((getMaxsum() == null) ? 0 : getMaxsum().hashCode());
        result = prime * result + ((getMerchantkey() == null) ? 0 : getMerchantkey().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getDrawsystemid() == null) ? 0 : getDrawsystemid().hashCode());
        result = prime * result + ((getStockholderid() == null) ? 0 : getStockholderid().hashCode());
        result = prime * result + ((getAskstatus() == null) ? 0 : getAskstatus().hashCode());
        result = prime * result + ((getMerchantno() == null) ? 0 : getMerchantno().hashCode());
        result = prime * result + ((getLevelid() == null) ? 0 : getLevelid().hashCode());
        result = prime * result + ((getIsmaxsum() == null) ? 0 : getIsmaxsum().hashCode());
        result = prime * result + ((getDomain_pay() == null) ? 0 : getDomain_pay().hashCode());
        result = prime * result + ((getMerchant_console() == null) ? 0 : getMerchant_console().hashCode());
        result = prime * result + ((getQuota() == null) ? 0 : getQuota().hashCode());
        result = prime * result + ((getMerchant_gateway() == null) ? 0 : getMerchant_gateway().hashCode());
        result = prime * result + ((getPrivatekey() == null) ? 0 : getPrivatekey().hashCode());
        result = prime * result + ((getLower_limit_amount() == null) ? 0 : getLower_limit_amount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merchantname=").append(merchantname);
        sb.append(", status=").append(status);
        sb.append(", merchantorder=").append(merchantorder);
        sb.append(", maxsum=").append(maxsum);
        sb.append(", merchantkey=").append(merchantkey);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", drawsystemid=").append(drawsystemid);
        sb.append(", stockholderid=").append(stockholderid);
        sb.append(", askstatus=").append(askstatus);
        sb.append(", merchantno=").append(merchantno);
        sb.append(", levelid=").append(levelid);
        sb.append(", ismaxsum=").append(ismaxsum);
        sb.append(", domain_pay=").append(domain_pay);
        sb.append(", merchant_console=").append(merchant_console);
        sb.append(", quota=").append(quota);
        sb.append(", merchant_gateway=").append(merchant_gateway);
        sb.append(", privatekey=").append(privatekey);
        sb.append(", lower_limit_amount=").append(lower_limit_amount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}