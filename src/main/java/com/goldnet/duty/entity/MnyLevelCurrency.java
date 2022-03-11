package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 层级-币别-会员数量
 * @TableName mny_level_currency
 */
@TableName(value ="mny_level_currency")
@Data
public class MnyLevelCurrency implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 层级id 
     */
    @TableField(value = "level_id")
    private Object level_id;

    /**
     * 厅主自定名称id
     */
    @TableField(value = "customize_id")
    private Object customize_id;

    /**
     * 该层级所使用的货币种类(外键)
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 层级会员数量
     */
    @TableField(value = "member_num")
    private Object member_num;

    /**
     * 大大股东id 
     */
    @TableField(value = "account1")
    private Object account1;

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
        MnyLevelCurrency other = (MnyLevelCurrency) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getCustomize_id() == null ? other.getCustomize_id() == null : this.getCustomize_id().equals(other.getCustomize_id()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getMember_num() == null ? other.getMember_num() == null : this.getMember_num().equals(other.getMember_num()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getCustomize_id() == null) ? 0 : getCustomize_id().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getMember_num() == null) ? 0 : getMember_num().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", level_id=").append(level_id);
        sb.append(", customize_id=").append(customize_id);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", member_num=").append(member_num);
        sb.append(", account1=").append(account1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}