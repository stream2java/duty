package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 往来记录延伸资料
 * @TableName at_current_record_stretch
 */
@TableName(value ="at_current_record_stretch")
@Data
public class AtCurrentRecordStretch implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 往来记录主键
     */
    @TableField(value = "current_record_id")
    private Long current_record_id;

    /**
     * 往来记录延伸备注
     */
    @TableField(value = "stretch_remark")
    private String stretch_remark;

    /**
     * 往来记录延伸单号
     */
    @TableField(value = "stretch_betting_code")
    private String stretch_betting_code;

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
        AtCurrentRecordStretch other = (AtCurrentRecordStretch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCurrent_record_id() == null ? other.getCurrent_record_id() == null : this.getCurrent_record_id().equals(other.getCurrent_record_id()))
            && (this.getStretch_remark() == null ? other.getStretch_remark() == null : this.getStretch_remark().equals(other.getStretch_remark()))
            && (this.getStretch_betting_code() == null ? other.getStretch_betting_code() == null : this.getStretch_betting_code().equals(other.getStretch_betting_code()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCurrent_record_id() == null) ? 0 : getCurrent_record_id().hashCode());
        result = prime * result + ((getStretch_remark() == null) ? 0 : getStretch_remark().hashCode());
        result = prime * result + ((getStretch_betting_code() == null) ? 0 : getStretch_betting_code().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", current_record_id=").append(current_record_id);
        sb.append(", stretch_remark=").append(stretch_remark);
        sb.append(", stretch_betting_code=").append(stretch_betting_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}