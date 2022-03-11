package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName mny_merchant_msg
 */
@TableName(value ="mny_merchant_msg")
@Data
public class MnyMerchantMsg implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 记录讯息
     */
    @TableField(value = "logmsg")
    private String logmsg;

    /**
     * 
     */
    @TableField(value = "createtime")
    private LocalDateTime createtime;

    /**
     * 大大股东
     */
    @TableField(value = "stockholderid")
    private Object stockholderid;

    /**
     * 会员id
     */
    @TableField(value = "memberid")
    private Object memberid;

    /**
     * 北京时间
     */
    @TableField(value = "bjtime")
    private LocalDateTime bjtime;

    /**
     * 
     */
    @TableField(value = "merchantno")
    private String merchantno;

    /**
     * 取款存款标识0：存款1：取款
     */
    @TableField(value = "isdrawordeposit")
    private Object isdrawordeposit;

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
        MnyMerchantMsg other = (MnyMerchantMsg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogmsg() == null ? other.getLogmsg() == null : this.getLogmsg().equals(other.getLogmsg()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getStockholderid() == null ? other.getStockholderid() == null : this.getStockholderid().equals(other.getStockholderid()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getBjtime() == null ? other.getBjtime() == null : this.getBjtime().equals(other.getBjtime()))
            && (this.getMerchantno() == null ? other.getMerchantno() == null : this.getMerchantno().equals(other.getMerchantno()))
            && (this.getIsdrawordeposit() == null ? other.getIsdrawordeposit() == null : this.getIsdrawordeposit().equals(other.getIsdrawordeposit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogmsg() == null) ? 0 : getLogmsg().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getStockholderid() == null) ? 0 : getStockholderid().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getBjtime() == null) ? 0 : getBjtime().hashCode());
        result = prime * result + ((getMerchantno() == null) ? 0 : getMerchantno().hashCode());
        result = prime * result + ((getIsdrawordeposit() == null) ? 0 : getIsdrawordeposit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logmsg=").append(logmsg);
        sb.append(", createtime=").append(createtime);
        sb.append(", stockholderid=").append(stockholderid);
        sb.append(", memberid=").append(memberid);
        sb.append(", bjtime=").append(bjtime);
        sb.append(", merchantno=").append(merchantno);
        sb.append(", isdrawordeposit=").append(isdrawordeposit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}