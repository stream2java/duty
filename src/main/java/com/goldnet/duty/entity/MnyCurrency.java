package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName mny_currency
 */
@TableName(value ="mny_currency")
@Data
public class MnyCurrency implements Serializable {
    /**
     * 币别表id
     */
    @TableId(value = "currency_id")
    private Object currency_id;

    /**
     * 币别名称
     */
    @TableField(value = "currency_name")
    private String currency_name;

    /**
     * 币别代码
     */
    @TableField(value = "currency_code")
    private String currency_code;

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
        MnyCurrency other = (MnyCurrency) that;
        return (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getCurrency_name() == null ? other.getCurrency_name() == null : this.getCurrency_name().equals(other.getCurrency_name()))
            && (this.getCurrency_code() == null ? other.getCurrency_code() == null : this.getCurrency_code().equals(other.getCurrency_code()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getCurrency_name() == null) ? 0 : getCurrency_name().hashCode());
        result = prime * result + ((getCurrency_code() == null) ? 0 : getCurrency_code().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", currency_id=").append(currency_id);
        sb.append(", currency_name=").append(currency_name);
        sb.append(", currency_code=").append(currency_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}