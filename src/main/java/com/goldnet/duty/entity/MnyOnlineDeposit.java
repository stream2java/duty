package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 线上存款表
 * @TableName mny_online_deposit
 */
@TableName(value ="mny_online_deposit")
@Data
public class MnyOnlineDeposit implements Serializable {
    /**
     * 线上存款表id
     */
    @TableId(value = "online_deposit_id")
    private Object online_deposit_id;

    /**
     * 代码
     */
    @TableField(value = "code")
    private String code;

    /**
     * 标题繁体形式
     */
    @TableField(value = "title_tra")
    private String title_tra;

    /**
     * 标题简体形式
     */
    @TableField(value = "title_sim")
    private String title_sim;

    /**
     * 标题英文形式
     */
    @TableField(value = "title_eng")
    private String title_eng;

    /**
     * 内容繁体形式
     */
    @TableField(value = "content_tra")
    private String content_tra;

    /**
     * 内容简体形式
     */
    @TableField(value = "content_sim")
    private String content_sim;

    /**
     * 内容英文形式
     */
    @TableField(value = "content_eng")
    private String content_eng;

    /**
     * 是否启用:0-否,1-是
     */
    @TableField(value = "status")
    private String status;

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
     * 名称繁体形式
     */
    @TableField(value = "name_tra")
    private String name_tra;

    /**
     * 名称简体形式
     */
    @TableField(value = "name_sim")
    private String name_sim;

    /**
     * 名称英文形式
     */
    @TableField(value = "name_eng")
    private String name_eng;

    /**
     * 大大股东ID
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 线上存款文案类型：
0-存款类型,1-公司入款说明文案,2-在线支付说明文案,3-提示文案,4-银行账户输入提示
     */
    @TableField(value = "document_type")
    private Object document_type;

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
        MnyOnlineDeposit other = (MnyOnlineDeposit) that;
        return (this.getOnline_deposit_id() == null ? other.getOnline_deposit_id() == null : this.getOnline_deposit_id().equals(other.getOnline_deposit_id()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getTitle_tra() == null ? other.getTitle_tra() == null : this.getTitle_tra().equals(other.getTitle_tra()))
            && (this.getTitle_sim() == null ? other.getTitle_sim() == null : this.getTitle_sim().equals(other.getTitle_sim()))
            && (this.getTitle_eng() == null ? other.getTitle_eng() == null : this.getTitle_eng().equals(other.getTitle_eng()))
            && (this.getContent_tra() == null ? other.getContent_tra() == null : this.getContent_tra().equals(other.getContent_tra()))
            && (this.getContent_sim() == null ? other.getContent_sim() == null : this.getContent_sim().equals(other.getContent_sim()))
            && (this.getContent_eng() == null ? other.getContent_eng() == null : this.getContent_eng().equals(other.getContent_eng()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getName_tra() == null ? other.getName_tra() == null : this.getName_tra().equals(other.getName_tra()))
            && (this.getName_sim() == null ? other.getName_sim() == null : this.getName_sim().equals(other.getName_sim()))
            && (this.getName_eng() == null ? other.getName_eng() == null : this.getName_eng().equals(other.getName_eng()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getDocument_type() == null ? other.getDocument_type() == null : this.getDocument_type().equals(other.getDocument_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOnline_deposit_id() == null) ? 0 : getOnline_deposit_id().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getTitle_tra() == null) ? 0 : getTitle_tra().hashCode());
        result = prime * result + ((getTitle_sim() == null) ? 0 : getTitle_sim().hashCode());
        result = prime * result + ((getTitle_eng() == null) ? 0 : getTitle_eng().hashCode());
        result = prime * result + ((getContent_tra() == null) ? 0 : getContent_tra().hashCode());
        result = prime * result + ((getContent_sim() == null) ? 0 : getContent_sim().hashCode());
        result = prime * result + ((getContent_eng() == null) ? 0 : getContent_eng().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getName_tra() == null) ? 0 : getName_tra().hashCode());
        result = prime * result + ((getName_sim() == null) ? 0 : getName_sim().hashCode());
        result = prime * result + ((getName_eng() == null) ? 0 : getName_eng().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getDocument_type() == null) ? 0 : getDocument_type().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", online_deposit_id=").append(online_deposit_id);
        sb.append(", code=").append(code);
        sb.append(", title_tra=").append(title_tra);
        sb.append(", title_sim=").append(title_sim);
        sb.append(", title_eng=").append(title_eng);
        sb.append(", content_tra=").append(content_tra);
        sb.append(", content_sim=").append(content_sim);
        sb.append(", content_eng=").append(content_eng);
        sb.append(", status=").append(status);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", name_tra=").append(name_tra);
        sb.append(", name_sim=").append(name_sim);
        sb.append(", name_eng=").append(name_eng);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", document_type=").append(document_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}