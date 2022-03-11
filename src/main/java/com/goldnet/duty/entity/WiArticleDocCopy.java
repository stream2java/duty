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
 * @TableName wi_article_doc_copy
 */
@TableName(value ="wi_article_doc_copy")
@Data
public class WiArticleDocCopy implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

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
     * 
     */
    @TableField(value = "title_big")
    private String title_big;

    /**
     * 
     */
    @TableField(value = "title_sim")
    private String title_sim;

    /**
     * 
     */
    @TableField(value = "title_eng")
    private String title_eng;

    /**
     * 
     */
    @TableField(value = "doc_id")
    private Object doc_id;

    /**
     * 
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 
     */
    @TableField(value = "doc_name")
    private String doc_name;

    /**
     * 
     */
    @TableField(value = "context_big")
    private String context_big;

    /**
     * 
     */
    @TableField(value = "context_sim")
    private String context_sim;

    /**
     * 
     */
    @TableField(value = "context_eng")
    private String context_eng;

    /**
     * 
     */
    @TableField(value = "junction_big")
    private String junction_big;

    /**
     * 
     */
    @TableField(value = "junction_sim")
    private String junction_sim;

    /**
     * 
     */
    @TableField(value = "junction_eng")
    private String junction_eng;

    /**
     * 
     */
    @TableField(value = "is_local")
    private Object is_local;

    /**
     * 
     */
    @TableField(value = "is_window")
    private Object is_window;

    /**
     * 
     */
    @TableField(value = "window_height")
    private Object window_height;

    /**
     * 
     */
    @TableField(value = "window_width")
    private Object window_width;

    /**
     * 
     */
    @TableField(value = "contact")
    private Object contact;

    /**
     * 
     */
    @TableField(value = "agent_login")
    private Object agent_login;

    /**
     * 
     */
    @TableField(value = "page_mark")
    private Object page_mark;

    /**
     * 
     */
    @TableField(value = "agent_registered")
    private Object agent_registered;

    /**
     * 
     */
    @TableField(value = "action")
    private String action;

    /**
     * 
     */
    @TableField(value = "ctime")
    private LocalDateTime ctime;

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
        WiArticleDocCopy other = (WiArticleDocCopy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getTitle_big() == null ? other.getTitle_big() == null : this.getTitle_big().equals(other.getTitle_big()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDoc_name() == null ? other.getDoc_name() == null : this.getDoc_name().equals(other.getDoc_name()))
            && (this.getContext_big() == null ? other.getContext_big() == null : this.getContext_big().equals(other.getContext_big()))
            && (this.getContext_sim() == null ? other.getContext_sim() == null : this.getContext_sim().equals(other.getContext_sim()))
            && (this.getContext_eng() == null ? other.getContext_eng() == null : this.getContext_eng().equals(other.getContext_eng()))
            && (this.getJunction_big() == null ? other.getJunction_big() == null : this.getJunction_big().equals(other.getJunction_big()))
            && (this.getJunction_sim() == null ? other.getJunction_sim() == null : this.getJunction_sim().equals(other.getJunction_sim()))
            && (this.getJunction_eng() == null ? other.getJunction_eng() == null : this.getJunction_eng().equals(other.getJunction_eng()))
            && (this.getIs_local() == null ? other.getIs_local() == null : this.getIs_local().equals(other.getIs_local()))
            && (this.getIs_window() == null ? other.getIs_window() == null : this.getIs_window().equals(other.getIs_window()))
            && (this.getWindow_height() == null ? other.getWindow_height() == null : this.getWindow_height().equals(other.getWindow_height()))
            && (this.getWindow_width() == null ? other.getWindow_width() == null : this.getWindow_width().equals(other.getWindow_width()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getAgent_login() == null ? other.getAgent_login() == null : this.getAgent_login().equals(other.getAgent_login()))
            && (this.getPage_mark() == null ? other.getPage_mark() == null : this.getPage_mark().equals(other.getPage_mark()))
            && (this.getAgent_registered() == null ? other.getAgent_registered() == null : this.getAgent_registered().equals(other.getAgent_registered()))
            && (this.getAction() == null ? other.getAction() == null : this.getAction().equals(other.getAction()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getTitle_big() == null) ? 0 : getTitle_big().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDoc_name() == null) ? 0 : getDoc_name().hashCode());
        result = prime * result + ((getContext_big() == null) ? 0 : getContext_big().hashCode());
        result = prime * result + ((getContext_sim() == null) ? 0 : getContext_sim().hashCode());
        result = prime * result + ((getContext_eng() == null) ? 0 : getContext_eng().hashCode());
        result = prime * result + ((getJunction_big() == null) ? 0 : getJunction_big().hashCode());
        result = prime * result + ((getJunction_sim() == null) ? 0 : getJunction_sim().hashCode());
        result = prime * result + ((getJunction_eng() == null) ? 0 : getJunction_eng().hashCode());
        result = prime * result + ((getIs_local() == null) ? 0 : getIs_local().hashCode());
        result = prime * result + ((getIs_window() == null) ? 0 : getIs_window().hashCode());
        result = prime * result + ((getWindow_height() == null) ? 0 : getWindow_height().hashCode());
        result = prime * result + ((getWindow_width() == null) ? 0 : getWindow_width().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getAgent_login() == null) ? 0 : getAgent_login().hashCode());
        result = prime * result + ((getPage_mark() == null) ? 0 : getPage_mark().hashCode());
        result = prime * result + ((getAgent_registered() == null) ? 0 : getAgent_registered().hashCode());
        result = prime * result + ((getAction() == null) ? 0 : getAction().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", type=").append(type);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", title_big=").append(title_big);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", status=").append(status);
        sb.append(", doc_name=").append(doc_name);
        sb.append(", context_big=").append(context_big);
        sb.append(", context_sim=").append(context_sim);
        sb.append(", context_eng=").append(context_eng);
        sb.append(", junction_big=").append(junction_big);
        sb.append(", junction_sim=").append(junction_sim);
        sb.append(", junction_eng=").append(junction_eng);
        sb.append(", is_local=").append(is_local);
        sb.append(", is_window=").append(is_window);
        sb.append(", window_height=").append(window_height);
        sb.append(", window_width=").append(window_width);
        sb.append(", contact=").append(contact);
        sb.append(", agent_login=").append(agent_login);
        sb.append(", page_mark=").append(page_mark);
        sb.append(", agent_registered=").append(agent_registered);
        sb.append(", action=").append(action);
        sb.append(", ctime=").append(ctime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}