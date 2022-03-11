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
 * 占成比例表
 * @TableName ms_proportion
 */
@TableName(value ="ms_proportion")
@Data
public class MsProportion implements Serializable {
    /**
     * ID
     */
    @TableId(value = "proportion_id")
    private Object proportion_id;

    /**
     * 合并ID
     */
    @TableField(value = "merge_id")
    private Object merge_id;

    /**
     * 低位额度
     */
    @TableField(value = "min_quota")
    private BigDecimal min_quota;

    /**
     * 高位额度
     */
    @TableField(value = "max_quota")
    private BigDecimal max_quota;

    /**
     * 比例
     */
    @TableField(value = "ratio")
    private BigDecimal ratio;

    /**
     * 速算扣除数
     */
    @TableField(value = "deduction")
    private BigDecimal deduction;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_datetime")
    private LocalDateTime create_datetime;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_datetime")
    private LocalDateTime update_datetime;

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
        MsProportion other = (MsProportion) that;
        return (this.getProportion_id() == null ? other.getProportion_id() == null : this.getProportion_id().equals(other.getProportion_id()))
            && (this.getMerge_id() == null ? other.getMerge_id() == null : this.getMerge_id().equals(other.getMerge_id()))
            && (this.getMin_quota() == null ? other.getMin_quota() == null : this.getMin_quota().equals(other.getMin_quota()))
            && (this.getMax_quota() == null ? other.getMax_quota() == null : this.getMax_quota().equals(other.getMax_quota()))
            && (this.getRatio() == null ? other.getRatio() == null : this.getRatio().equals(other.getRatio()))
            && (this.getDeduction() == null ? other.getDeduction() == null : this.getDeduction().equals(other.getDeduction()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_datetime() == null ? other.getCreate_datetime() == null : this.getCreate_datetime().equals(other.getCreate_datetime()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_datetime() == null ? other.getUpdate_datetime() == null : this.getUpdate_datetime().equals(other.getUpdate_datetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProportion_id() == null) ? 0 : getProportion_id().hashCode());
        result = prime * result + ((getMerge_id() == null) ? 0 : getMerge_id().hashCode());
        result = prime * result + ((getMin_quota() == null) ? 0 : getMin_quota().hashCode());
        result = prime * result + ((getMax_quota() == null) ? 0 : getMax_quota().hashCode());
        result = prime * result + ((getRatio() == null) ? 0 : getRatio().hashCode());
        result = prime * result + ((getDeduction() == null) ? 0 : getDeduction().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_datetime() == null) ? 0 : getCreate_datetime().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_datetime() == null) ? 0 : getUpdate_datetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proportion_id=").append(proportion_id);
        sb.append(", merge_id=").append(merge_id);
        sb.append(", min_quota=").append(min_quota);
        sb.append(", max_quota=").append(max_quota);
        sb.append(", ratio=").append(ratio);
        sb.append(", deduction=").append(deduction);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_datetime=").append(create_datetime);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_datetime=").append(update_datetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}