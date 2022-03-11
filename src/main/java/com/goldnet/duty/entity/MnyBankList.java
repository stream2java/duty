package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName mny_bank_list
 */
@TableName(value ="mny_bank_list")
@Data
public class MnyBankList implements Serializable {
    /**
     * 银行编号 id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 银行名称
     */
    @TableField(value = "bankname")
    private String bankname;

    /**
     * 银行Key
     */
    @TableField(value = "bankkey")
    private String bankkey;

    /**
     * 支付类型：0 为 银行，1 为 点卡
     */
    @TableField(value = "banktype")
    private Object banktype;

    /**
     * 是否为银行 0-银行 1-非银行
     */
    @TableField(value = "isbank")
    private Object isbank;

    /**
     * 排序编号
     */
    @TableField(value = "sortnum")
    private Object sortnum;

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
        MnyBankList other = (MnyBankList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBankname() == null ? other.getBankname() == null : this.getBankname().equals(other.getBankname()))
            && (this.getBankkey() == null ? other.getBankkey() == null : this.getBankkey().equals(other.getBankkey()))
            && (this.getBanktype() == null ? other.getBanktype() == null : this.getBanktype().equals(other.getBanktype()))
            && (this.getIsbank() == null ? other.getIsbank() == null : this.getIsbank().equals(other.getIsbank()))
            && (this.getSortnum() == null ? other.getSortnum() == null : this.getSortnum().equals(other.getSortnum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBankname() == null) ? 0 : getBankname().hashCode());
        result = prime * result + ((getBankkey() == null) ? 0 : getBankkey().hashCode());
        result = prime * result + ((getBanktype() == null) ? 0 : getBanktype().hashCode());
        result = prime * result + ((getIsbank() == null) ? 0 : getIsbank().hashCode());
        result = prime * result + ((getSortnum() == null) ? 0 : getSortnum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bankname=").append(bankname);
        sb.append(", bankkey=").append(bankkey);
        sb.append(", banktype=").append(banktype);
        sb.append(", isbank=").append(isbank);
        sb.append(", sortnum=").append(sortnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}