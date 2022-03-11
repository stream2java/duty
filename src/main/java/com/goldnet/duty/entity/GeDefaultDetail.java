package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName ge_default_detail
 */
@TableName(value ="ge_default_detail")
@Data
public class GeDefaultDetail implements Serializable {
    /**
     * id
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 默认单注限额
     */
    @TableField(value = "single_max_money")
    private Object single_max_money;

    /**
     * 默认单项限额
     */
    @TableField(value = "project_max_money")
    private Object project_max_money;

    /**
     * 默认最低下注
     */
    @TableField(value = "min_money")
    private Object min_money;

    /**
     * 账户id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 游戏id
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 游戏类型id
     */
    @TableField(value = "type_id")
    private Object type_id;

    /**
     * 0表示是大大股东自己设置的默认限额，为空表示是庄家为大大股东设定的默认限额
     */
    @TableField(value = "flag")
    private Object flag;

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
        GeDefaultDetail other = (GeDefaultDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSingle_max_money() == null ? other.getSingle_max_money() == null : this.getSingle_max_money().equals(other.getSingle_max_money()))
            && (this.getProject_max_money() == null ? other.getProject_max_money() == null : this.getProject_max_money().equals(other.getProject_max_money()))
            && (this.getMin_money() == null ? other.getMin_money() == null : this.getMin_money().equals(other.getMin_money()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSingle_max_money() == null) ? 0 : getSingle_max_money().hashCode());
        result = prime * result + ((getProject_max_money() == null) ? 0 : getProject_max_money().hashCode());
        result = prime * result + ((getMin_money() == null) ? 0 : getMin_money().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", single_max_money=").append(single_max_money);
        sb.append(", project_max_money=").append(project_max_money);
        sb.append(", min_money=").append(min_money);
        sb.append(", account_id=").append(account_id);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", type_id=").append(type_id);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}