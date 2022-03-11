package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 注册会员页文案
 * @TableName wi_register_member
 */
@TableName(value ="wi_register_member")
@Data
public class WiRegisterMember implements Serializable {
    /**
     * 注册会员文案id
     */
    @TableId(value = "register_member_id")
    private Object register_member_id;

    /**
     * 注册会员文案代码
     */
    @TableField(value = "code")
    private String code;

    /**
     * 文案标题(繁体)
     */
    @TableField(value = "title_tra")
    private String title_tra;

    /**
     * 文案标题(简体)
     */
    @TableField(value = "title_sim")
    private String title_sim;

    /**
     * 文案标题(英语)
     */
    @TableField(value = "title_eng")
    private String title_eng;

    /**
     * 状态
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 文案名称
     */
    @TableField(value = "doc_name")
    private String doc_name;

    /**
     * 内容名称(繁体)
     */
    @TableField(value = "context_title_tra")
    private String context_title_tra;

    /**
     * 内容名称(简体)
     */
    @TableField(value = "context_title_sim")
    private String context_title_sim;

    /**
     * 内容名称(英文)
     */
    @TableField(value = "context_title_eng")
    private String context_title_eng;

    /**
     * 内容(繁体)
     */
    @TableField(value = "context_tra")
    private String context_tra;

    /**
     * 内容(简体)
     */
    @TableField(value = "context_sim")
    private String context_sim;

    /**
     * 内容(英文)
     */
    @TableField(value = "context_eng")
    private String context_eng;

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
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 案件种类
     */
    @TableField(value = "kind_id")
    private Object kind_id;

    /**
     * 0-正在编辑1-正在使用
     */
    @TableField(value = "doc_type")
    private Object doc_type;

    /**
     * 审核状态：1-审核中2-已审核3-撤销
     */
    @TableField(value = "auditing_status")
    private Object auditing_status;

    /**
     * 生效时间
     */
    @TableField(value = "effect_time")
    private LocalDateTime effect_time;

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
        WiRegisterMember other = (WiRegisterMember) that;
        return (this.getRegister_member_id() == null ? other.getRegister_member_id() == null : this.getRegister_member_id().equals(other.getRegister_member_id()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getTitle_tra() == null ? other.getTitle_tra() == null : this.getTitle_tra().equals(other.getTitle_tra()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDoc_name() == null ? other.getDoc_name() == null : this.getDoc_name().equals(other.getDoc_name()))
            && (this.getContext_title_tra() == null ? other.getContext_title_tra() == null : this.getContext_title_tra().equals(other.getContext_title_tra()))
            && (this.getContext_title_sim() == null ? other.getContext_title_sim() == null : this.getContext_title_sim().equals(other.getContext_title_sim()))
            && (this.getContext_title_eng() == null ? other.getContext_title_eng() == null : this.getContext_title_eng().equals(other.getContext_title_eng()))
            && (this.getContext_tra() == null ? other.getContext_tra() == null : this.getContext_tra().equals(other.getContext_tra()))
            && (this.getContext_sim() == null ? other.getContext_sim() == null : this.getContext_sim().equals(other.getContext_sim()))
            && (this.getContext_eng() == null ? other.getContext_eng() == null : this.getContext_eng().equals(other.getContext_eng()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getKind_id() == null ? other.getKind_id() == null : this.getKind_id().equals(other.getKind_id()))
            && (this.getDoc_type() == null ? other.getDoc_type() == null : this.getDoc_type().equals(other.getDoc_type()))
            && (this.getAuditing_status() == null ? other.getAuditing_status() == null : this.getAuditing_status().equals(other.getAuditing_status()))
            && (this.getEffect_time() == null ? other.getEffect_time() == null : this.getEffect_time().equals(other.getEffect_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRegister_member_id() == null) ? 0 : getRegister_member_id().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getTitle_tra() == null) ? 0 : getTitle_tra().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDoc_name() == null) ? 0 : getDoc_name().hashCode());
        result = prime * result + ((getContext_title_tra() == null) ? 0 : getContext_title_tra().hashCode());
        result = prime * result + ((getContext_title_sim() == null) ? 0 : getContext_title_sim().hashCode());
        result = prime * result + ((getContext_title_eng() == null) ? 0 : getContext_title_eng().hashCode());
        result = prime * result + ((getContext_tra() == null) ? 0 : getContext_tra().hashCode());
        result = prime * result + ((getContext_sim() == null) ? 0 : getContext_sim().hashCode());
        result = prime * result + ((getContext_eng() == null) ? 0 : getContext_eng().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getKind_id() == null) ? 0 : getKind_id().hashCode());
        result = prime * result + ((getDoc_type() == null) ? 0 : getDoc_type().hashCode());
        result = prime * result + ((getAuditing_status() == null) ? 0 : getAuditing_status().hashCode());
        result = prime * result + ((getEffect_time() == null) ? 0 : getEffect_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", register_member_id=").append(register_member_id);
        sb.append(", code=").append(code);
        sb.append(", title_tra=").append(title_tra);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", status=").append(status);
        sb.append(", doc_name=").append(doc_name);
        sb.append(", context_title_tra=").append(context_title_tra);
        sb.append(", context_title_sim=").append(context_title_sim);
        sb.append(", context_title_eng=").append(context_title_eng);
        sb.append(", context_tra=").append(context_tra);
        sb.append(", context_sim=").append(context_sim);
        sb.append(", context_eng=").append(context_eng);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", kind_id=").append(kind_id);
        sb.append(", doc_type=").append(doc_type);
        sb.append(", auditing_status=").append(auditing_status);
        sb.append(", effect_time=").append(effect_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}