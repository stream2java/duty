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
 * @TableName mny_merchant_list
 */
@TableName(value ="mny_merchant_list")
@Data
public class MnyMerchantList implements Serializable {
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
    @TableField(value = "paysystemid")
    private Object paysystemid;

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
     * 支付平台网关
     */
    @TableField(value = "merchant_gateway")
    private String merchant_gateway;

    /**
     * 限额
     */
    @TableField(value = "quota")
    private Long quota;

    /**
     * 是否启用手机端(扫码)0-启用
     */
    @TableField(value = "ismobileopen")
    private String ismobileopen;

    /**
     * MD值
     */
    @TableField(value = "md5key")
    private String md5key;

    /**
     * 最低限额，quota为最高限额
     */
    @TableField(value = "min_quota")
    private BigDecimal min_quota;

    /**
     * PC端支付名称，用于会员端展示
     */
    @TableField(value = "pc_channel_name")
    private String pc_channel_name;

    /**
     * 手机端支付名称，用于H5展示
     */
    @TableField(value = "h5_channel_name")
    private String h5_channel_name;

    /**
     * 协议类型
     */
    @TableField(value = "protocol_type")
    private String protocol_type;

    /**
     * 
     */
    @TableField(value = "merchant_description")
    private String merchant_description;

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
        MnyMerchantList other = (MnyMerchantList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantname() == null ? other.getMerchantname() == null : this.getMerchantname().equals(other.getMerchantname()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMerchantorder() == null ? other.getMerchantorder() == null : this.getMerchantorder().equals(other.getMerchantorder()))
            && (this.getMaxsum() == null ? other.getMaxsum() == null : this.getMaxsum().equals(other.getMaxsum()))
            && (this.getMerchantkey() == null ? other.getMerchantkey() == null : this.getMerchantkey().equals(other.getMerchantkey()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getPaysystemid() == null ? other.getPaysystemid() == null : this.getPaysystemid().equals(other.getPaysystemid()))
            && (this.getStockholderid() == null ? other.getStockholderid() == null : this.getStockholderid().equals(other.getStockholderid()))
            && (this.getAskstatus() == null ? other.getAskstatus() == null : this.getAskstatus().equals(other.getAskstatus()))
            && (this.getMerchantno() == null ? other.getMerchantno() == null : this.getMerchantno().equals(other.getMerchantno()))
            && (this.getLevelid() == null ? other.getLevelid() == null : this.getLevelid().equals(other.getLevelid()))
            && (this.getIsmaxsum() == null ? other.getIsmaxsum() == null : this.getIsmaxsum().equals(other.getIsmaxsum()))
            && (this.getDomain_pay() == null ? other.getDomain_pay() == null : this.getDomain_pay().equals(other.getDomain_pay()))
            && (this.getMerchant_console() == null ? other.getMerchant_console() == null : this.getMerchant_console().equals(other.getMerchant_console()))
            && (this.getMerchant_gateway() == null ? other.getMerchant_gateway() == null : this.getMerchant_gateway().equals(other.getMerchant_gateway()))
            && (this.getQuota() == null ? other.getQuota() == null : this.getQuota().equals(other.getQuota()))
            && (this.getIsmobileopen() == null ? other.getIsmobileopen() == null : this.getIsmobileopen().equals(other.getIsmobileopen()))
            && (this.getMd5key() == null ? other.getMd5key() == null : this.getMd5key().equals(other.getMd5key()))
            && (this.getMin_quota() == null ? other.getMin_quota() == null : this.getMin_quota().equals(other.getMin_quota()))
            && (this.getPc_channel_name() == null ? other.getPc_channel_name() == null : this.getPc_channel_name().equals(other.getPc_channel_name()))
            && (this.getH5_channel_name() == null ? other.getH5_channel_name() == null : this.getH5_channel_name().equals(other.getH5_channel_name()))
            && (this.getProtocol_type() == null ? other.getProtocol_type() == null : this.getProtocol_type().equals(other.getProtocol_type()))
            && (this.getMerchant_description() == null ? other.getMerchant_description() == null : this.getMerchant_description().equals(other.getMerchant_description()));
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
        result = prime * result + ((getPaysystemid() == null) ? 0 : getPaysystemid().hashCode());
        result = prime * result + ((getStockholderid() == null) ? 0 : getStockholderid().hashCode());
        result = prime * result + ((getAskstatus() == null) ? 0 : getAskstatus().hashCode());
        result = prime * result + ((getMerchantno() == null) ? 0 : getMerchantno().hashCode());
        result = prime * result + ((getLevelid() == null) ? 0 : getLevelid().hashCode());
        result = prime * result + ((getIsmaxsum() == null) ? 0 : getIsmaxsum().hashCode());
        result = prime * result + ((getDomain_pay() == null) ? 0 : getDomain_pay().hashCode());
        result = prime * result + ((getMerchant_console() == null) ? 0 : getMerchant_console().hashCode());
        result = prime * result + ((getMerchant_gateway() == null) ? 0 : getMerchant_gateway().hashCode());
        result = prime * result + ((getQuota() == null) ? 0 : getQuota().hashCode());
        result = prime * result + ((getIsmobileopen() == null) ? 0 : getIsmobileopen().hashCode());
        result = prime * result + ((getMd5key() == null) ? 0 : getMd5key().hashCode());
        result = prime * result + ((getMin_quota() == null) ? 0 : getMin_quota().hashCode());
        result = prime * result + ((getPc_channel_name() == null) ? 0 : getPc_channel_name().hashCode());
        result = prime * result + ((getH5_channel_name() == null) ? 0 : getH5_channel_name().hashCode());
        result = prime * result + ((getProtocol_type() == null) ? 0 : getProtocol_type().hashCode());
        result = prime * result + ((getMerchant_description() == null) ? 0 : getMerchant_description().hashCode());
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
        sb.append(", paysystemid=").append(paysystemid);
        sb.append(", stockholderid=").append(stockholderid);
        sb.append(", askstatus=").append(askstatus);
        sb.append(", merchantno=").append(merchantno);
        sb.append(", levelid=").append(levelid);
        sb.append(", ismaxsum=").append(ismaxsum);
        sb.append(", domain_pay=").append(domain_pay);
        sb.append(", merchant_console=").append(merchant_console);
        sb.append(", merchant_gateway=").append(merchant_gateway);
        sb.append(", quota=").append(quota);
        sb.append(", ismobileopen=").append(ismobileopen);
        sb.append(", md5key=").append(md5key);
        sb.append(", min_quota=").append(min_quota);
        sb.append(", pc_channel_name=").append(pc_channel_name);
        sb.append(", h5_channel_name=").append(h5_channel_name);
        sb.append(", protocol_type=").append(protocol_type);
        sb.append(", merchant_description=").append(merchant_description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}