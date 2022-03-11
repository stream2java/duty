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
 * @TableName mny_pre_activity_doc
 */
@TableName(value ="mny_pre_activity_doc")
@Data
public class MnyPreActivityDoc implements Serializable {
    /**
     * 优惠活动文案表id
     */
    @TableId(value = "doc_id")
    private Object doc_id;

    /**
     * 优惠活动文案名称
     */
    @TableField(value = "doc_name")
    private String doc_name;

    /**
     * 审核状态：0-未送审，1-已送审，2-审核通过，3-审核不通过,4-文案未储存标识
     */
    @TableField(value = "auditing_status")
    private Object auditing_status;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 案件类别
     */
    @TableField(value = "kind_id")
    private Object kind_id;

    /**
     * 案件生效时间
     */
    @TableField(value = "effect_time")
    private LocalDateTime effect_time;

    /**
     * 案件结束时间
     */
    @TableField(value = "end_time")
    private LocalDateTime end_time;

    /**
     * 案件撤销原因
     */
    @TableField(value = "cancel_reason")
    private String cancel_reason;

    /**
     * 案件撤销时间
     */
    @TableField(value = "cancel_time")
    private LocalDateTime cancel_time;

    /**
     * 大大股东
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

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
        MnyPreActivityDoc other = (MnyPreActivityDoc) that;
        return (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getDoc_name() == null ? other.getDoc_name() == null : this.getDoc_name().equals(other.getDoc_name()))
            && (this.getAuditing_status() == null ? other.getAuditing_status() == null : this.getAuditing_status().equals(other.getAuditing_status()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getKind_id() == null ? other.getKind_id() == null : this.getKind_id().equals(other.getKind_id()))
            && (this.getEffect_time() == null ? other.getEffect_time() == null : this.getEffect_time().equals(other.getEffect_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getCancel_reason() == null ? other.getCancel_reason() == null : this.getCancel_reason().equals(other.getCancel_reason()))
            && (this.getCancel_time() == null ? other.getCancel_time() == null : this.getCancel_time().equals(other.getCancel_time()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getDoc_name() == null) ? 0 : getDoc_name().hashCode());
        result = prime * result + ((getAuditing_status() == null) ? 0 : getAuditing_status().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getKind_id() == null) ? 0 : getKind_id().hashCode());
        result = prime * result + ((getEffect_time() == null) ? 0 : getEffect_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getCancel_reason() == null) ? 0 : getCancel_reason().hashCode());
        result = prime * result + ((getCancel_time() == null) ? 0 : getCancel_time().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doc_id=").append(doc_id);
        sb.append(", doc_name=").append(doc_name);
        sb.append(", auditing_status=").append(auditing_status);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", kind_id=").append(kind_id);
        sb.append(", effect_time=").append(effect_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", cancel_reason=").append(cancel_reason);
        sb.append(", cancel_time=").append(cancel_time);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}