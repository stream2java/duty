package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 首页文案编辑
 * @TableName wi_edit_doc
 */
@TableName(value ="wi_edit_doc")
@Data
public class WiEditDoc implements Serializable {
    /**
     * 文案编辑id
     */
    @TableId(value = "edit_doc_id")
    private Object edit_doc_id;

    /**
     * 文案代码
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
     * 使用联络表单
     */
    @TableField(value = "contact")
    private Object contact;

    /**
     * 代理登入
     */
    @TableField(value = "agent_login")
    private Object agent_login;

    /**
     * 开启页签状态
     */
    @TableField(value = "page_mark")
    private Object page_mark;

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
        WiEditDoc other = (WiEditDoc) that;
        return (this.getEdit_doc_id() == null ? other.getEdit_doc_id() == null : this.getEdit_doc_id().equals(other.getEdit_doc_id()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getTitle_tra() == null ? other.getTitle_tra() == null : this.getTitle_tra().equals(other.getTitle_tra()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getAgent_login() == null ? other.getAgent_login() == null : this.getAgent_login().equals(other.getAgent_login()))
            && (this.getPage_mark() == null ? other.getPage_mark() == null : this.getPage_mark().equals(other.getPage_mark()))
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
        result = prime * result + ((getEdit_doc_id() == null) ? 0 : getEdit_doc_id().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getTitle_tra() == null) ? 0 : getTitle_tra().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getAgent_login() == null) ? 0 : getAgent_login().hashCode());
        result = prime * result + ((getPage_mark() == null) ? 0 : getPage_mark().hashCode());
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
        sb.append(", edit_doc_id=").append(edit_doc_id);
        sb.append(", code=").append(code);
        sb.append(", title_tra=").append(title_tra);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", status=").append(status);
        sb.append(", contact=").append(contact);
        sb.append(", agent_login=").append(agent_login);
        sb.append(", page_mark=").append(page_mark);
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