package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 案件表
 * @TableName wi_doc
 */
@TableName(value ="wi_doc")
@Data
public class WiDoc implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "doc_id")
    private Object doc_id;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 案件种类
     */
    @TableField(value = "kind_id")
    private Object kind_id;

    /**
     * 送审时间
     */
    @TableField(value = "give_auditing_time")
    private LocalDateTime give_auditing_time;

    /**
     * 生效时间
     */
    @TableField(value = "effect_time")
    private LocalDateTime effect_time;

    /**
     * 通过撤/销时间
     */
    @TableField(value = "pass_cancel_time")
    private LocalDateTime pass_cancel_time;

    /**
     * 案件状态：0-未送审1-审核中2-已审核(审核通过)3-撤销(审核不通过)
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 关联的文案id
     */
    @TableField(value = "relation_doc_id")
    private Object relation_doc_id;

    /**
     * 撤销原因
     */
    @TableField(value = "cancel_reason")
    private String cancel_reason;

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
        WiDoc other = (WiDoc) that;
        return (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getKind_id() == null ? other.getKind_id() == null : this.getKind_id().equals(other.getKind_id()))
            && (this.getGive_auditing_time() == null ? other.getGive_auditing_time() == null : this.getGive_auditing_time().equals(other.getGive_auditing_time()))
            && (this.getEffect_time() == null ? other.getEffect_time() == null : this.getEffect_time().equals(other.getEffect_time()))
            && (this.getPass_cancel_time() == null ? other.getPass_cancel_time() == null : this.getPass_cancel_time().equals(other.getPass_cancel_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRelation_doc_id() == null ? other.getRelation_doc_id() == null : this.getRelation_doc_id().equals(other.getRelation_doc_id()))
            && (this.getCancel_reason() == null ? other.getCancel_reason() == null : this.getCancel_reason().equals(other.getCancel_reason()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getKind_id() == null) ? 0 : getKind_id().hashCode());
        result = prime * result + ((getGive_auditing_time() == null) ? 0 : getGive_auditing_time().hashCode());
        result = prime * result + ((getEffect_time() == null) ? 0 : getEffect_time().hashCode());
        result = prime * result + ((getPass_cancel_time() == null) ? 0 : getPass_cancel_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRelation_doc_id() == null) ? 0 : getRelation_doc_id().hashCode());
        result = prime * result + ((getCancel_reason() == null) ? 0 : getCancel_reason().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doc_id=").append(doc_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", title=").append(title);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", kind_id=").append(kind_id);
        sb.append(", give_auditing_time=").append(give_auditing_time);
        sb.append(", effect_time=").append(effect_time);
        sb.append(", pass_cancel_time=").append(pass_cancel_time);
        sb.append(", status=").append(status);
        sb.append(", relation_doc_id=").append(relation_doc_id);
        sb.append(", cancel_reason=").append(cancel_reason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}