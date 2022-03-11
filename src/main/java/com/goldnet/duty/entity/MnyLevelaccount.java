package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 层级帐号对应表
 * @TableName mny_levelaccount
 */
@TableName(value ="mny_levelaccount")
@Data
public class MnyLevelaccount implements Serializable {
    /**
     * 层级帐号对应表id
     */
    @TableId(value = "levelaccount_id")
    private Object levelaccount_id;

    /**
     * 层级id
     */
    @TableField(value = "level_id")
    private Object level_id;

    /**
     * 公司银行帐号id
     */
    @TableField(value = "companyaccount_id")
    private Object companyaccount_id;

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
        MnyLevelaccount other = (MnyLevelaccount) that;
        return (this.getLevelaccount_id() == null ? other.getLevelaccount_id() == null : this.getLevelaccount_id().equals(other.getLevelaccount_id()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()))
            && (this.getCompanyaccount_id() == null ? other.getCompanyaccount_id() == null : this.getCompanyaccount_id().equals(other.getCompanyaccount_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLevelaccount_id() == null) ? 0 : getLevelaccount_id().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        result = prime * result + ((getCompanyaccount_id() == null) ? 0 : getCompanyaccount_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", levelaccount_id=").append(levelaccount_id);
        sb.append(", level_id=").append(level_id);
        sb.append(", companyaccount_id=").append(companyaccount_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}