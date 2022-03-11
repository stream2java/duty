package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName ms_archive_proportion_copy
 */
@TableName(value ="ms_archive_proportion_copy")
@Data
public class MsArchiveProportionCopy implements Serializable {
    /**
     * 
     */
    @TableField(value = "archive_proportion_id")
    private Object archive_proportion_id;

    /**
     * 
     */
    @TableField(value = "archive_details_id")
    private Object archive_details_id;

    /**
     * 
     */
    @TableField(value = "min_quota")
    private BigDecimal min_quota;

    /**
     * 
     */
    @TableField(value = "max_quota")
    private BigDecimal max_quota;

    /**
     * 
     */
    @TableField(value = "ratio")
    private BigDecimal ratio;

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
        MsArchiveProportionCopy other = (MsArchiveProportionCopy) that;
        return (this.getArchive_proportion_id() == null ? other.getArchive_proportion_id() == null : this.getArchive_proportion_id().equals(other.getArchive_proportion_id()))
            && (this.getArchive_details_id() == null ? other.getArchive_details_id() == null : this.getArchive_details_id().equals(other.getArchive_details_id()))
            && (this.getMin_quota() == null ? other.getMin_quota() == null : this.getMin_quota().equals(other.getMin_quota()))
            && (this.getMax_quota() == null ? other.getMax_quota() == null : this.getMax_quota().equals(other.getMax_quota()))
            && (this.getRatio() == null ? other.getRatio() == null : this.getRatio().equals(other.getRatio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArchive_proportion_id() == null) ? 0 : getArchive_proportion_id().hashCode());
        result = prime * result + ((getArchive_details_id() == null) ? 0 : getArchive_details_id().hashCode());
        result = prime * result + ((getMin_quota() == null) ? 0 : getMin_quota().hashCode());
        result = prime * result + ((getMax_quota() == null) ? 0 : getMax_quota().hashCode());
        result = prime * result + ((getRatio() == null) ? 0 : getRatio().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", archive_proportion_id=").append(archive_proportion_id);
        sb.append(", archive_details_id=").append(archive_details_id);
        sb.append(", min_quota=").append(min_quota);
        sb.append(", max_quota=").append(max_quota);
        sb.append(", ratio=").append(ratio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}