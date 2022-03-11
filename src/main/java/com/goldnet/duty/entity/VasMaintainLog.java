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
 * @TableName vas_maintain_log
 */
@TableName(value ="vas_maintain_log")
@Data
public class VasMaintainLog implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "member_start_time")
    private String member_start_time;

    /**
     * 
     */
    @TableField(value = "member_end_time")
    private String member_end_time;

    /**
     * 
     */
    @TableField(value = "plat_start_time")
    private String plat_start_time;

    /**
     * 
     */
    @TableField(value = "plat_end_time")
    private String plat_end_time;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "operator")
    private String operator;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

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
        VasMaintainLog other = (VasMaintainLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getMember_start_time() == null ? other.getMember_start_time() == null : this.getMember_start_time().equals(other.getMember_start_time()))
            && (this.getMember_end_time() == null ? other.getMember_end_time() == null : this.getMember_end_time().equals(other.getMember_end_time()))
            && (this.getPlat_start_time() == null ? other.getPlat_start_time() == null : this.getPlat_start_time().equals(other.getPlat_start_time()))
            && (this.getPlat_end_time() == null ? other.getPlat_end_time() == null : this.getPlat_end_time().equals(other.getPlat_end_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getMember_start_time() == null) ? 0 : getMember_start_time().hashCode());
        result = prime * result + ((getMember_end_time() == null) ? 0 : getMember_end_time().hashCode());
        result = prime * result + ((getPlat_start_time() == null) ? 0 : getPlat_start_time().hashCode());
        result = prime * result + ((getPlat_end_time() == null) ? 0 : getPlat_end_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_time=").append(create_time);
        sb.append(", member_start_time=").append(member_start_time);
        sb.append(", member_end_time=").append(member_end_time);
        sb.append(", plat_start_time=").append(plat_start_time);
        sb.append(", plat_end_time=").append(plat_end_time);
        sb.append(", remark=").append(remark);
        sb.append(", operator=").append(operator);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}