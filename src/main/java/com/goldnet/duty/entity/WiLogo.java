package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 首页LOGO管理
 * @TableName wi_logo
 */
@TableName(value ="wi_logo")
@Data
public class WiLogo implements Serializable {
    /**
     * logo表id
     */
    @TableId(value = "logo_id")
    private Object logo_id;

    /**
     * logo代码
     */
    @TableField(value = "logo_code")
    private String logo_code;

    /**
     * logo名称
     */
    @TableField(value = "logo_name")
    private String logo_name;

    /**
     * logo使用状态:0-停用1-启用
     */
    @TableField(value = "logo_status")
    private Object logo_status;

    /**
     * logo使用的起始时间
     */
    @TableField(value = "logo_begintime")
    private LocalDateTime logo_begintime;

    /**
     * logo使用的终点时间
     */
    @TableField(value = "logo_endtime")
    private LocalDateTime logo_endtime;

    /**
     * logo图片存储路径
     */
    @TableField(value = "logo_pic")
    private String logo_pic;

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
     * 大大股东ID
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 案件种类
     */
    @TableField(value = "kind_id")
    private Object kind_id;

    /**
     * 0-正在编辑,1-正在使用
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
        WiLogo other = (WiLogo) that;
        return (this.getLogo_id() == null ? other.getLogo_id() == null : this.getLogo_id().equals(other.getLogo_id()))
            && (this.getLogo_code() == null ? other.getLogo_code() == null : this.getLogo_code().equals(other.getLogo_code()))
            && (this.getLogo_name() == null ? other.getLogo_name() == null : this.getLogo_name().equals(other.getLogo_name()))
            && (this.getLogo_status() == null ? other.getLogo_status() == null : this.getLogo_status().equals(other.getLogo_status()))
            && (this.getLogo_begintime() == null ? other.getLogo_begintime() == null : this.getLogo_begintime().equals(other.getLogo_begintime()))
            && (this.getLogo_endtime() == null ? other.getLogo_endtime() == null : this.getLogo_endtime().equals(other.getLogo_endtime()))
            && (this.getLogo_pic() == null ? other.getLogo_pic() == null : this.getLogo_pic().equals(other.getLogo_pic()))
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
        result = prime * result + ((getLogo_id() == null) ? 0 : getLogo_id().hashCode());
        result = prime * result + ((getLogo_code() == null) ? 0 : getLogo_code().hashCode());
        result = prime * result + ((getLogo_name() == null) ? 0 : getLogo_name().hashCode());
        result = prime * result + ((getLogo_status() == null) ? 0 : getLogo_status().hashCode());
        result = prime * result + ((getLogo_begintime() == null) ? 0 : getLogo_begintime().hashCode());
        result = prime * result + ((getLogo_endtime() == null) ? 0 : getLogo_endtime().hashCode());
        result = prime * result + ((getLogo_pic() == null) ? 0 : getLogo_pic().hashCode());
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
        sb.append(", logo_id=").append(logo_id);
        sb.append(", logo_code=").append(logo_code);
        sb.append(", logo_name=").append(logo_name);
        sb.append(", logo_status=").append(logo_status);
        sb.append(", logo_begintime=").append(logo_begintime);
        sb.append(", logo_endtime=").append(logo_endtime);
        sb.append(", logo_pic=").append(logo_pic);
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