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
 * @TableName wi_article_copy
 */
@TableName(value ="wi_article_copy")
@Data
public class WiArticleCopy implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "doc_title")
    private String doc_title;

    /**
     * 
     */
    @TableField(value = "big_title")
    private String big_title;

    /**
     * 
     */
    @TableField(value = "eng_title")
    private String eng_title;

    /**
     * 
     */
    @TableField(value = "sim_title")
    private String sim_title;

    /**
     * 
     */
    @TableField(value = "big_intro")
    private String big_intro;

    /**
     * 
     */
    @TableField(value = "eng_intro")
    private String eng_intro;

    /**
     * 
     */
    @TableField(value = "sim_intro")
    private String sim_intro;

    /**
     * 
     */
    @TableField(value = "big_title_img")
    private String big_title_img;

    /**
     * 
     */
    @TableField(value = "eng_title_img")
    private String eng_title_img;

    /**
     * 
     */
    @TableField(value = "sim_title_img")
    private String sim_title_img;

    /**
     * 
     */
    @TableField(value = "big_title_in_img")
    private String big_title_in_img;

    /**
     * 
     */
    @TableField(value = "eng_title_in_img")
    private String eng_title_in_img;

    /**
     * 
     */
    @TableField(value = "sim_title_in_img")
    private String sim_title_in_img;

    /**
     * 
     */
    @TableField(value = "big_title_out_img")
    private String big_title_out_img;

    /**
     * 
     */
    @TableField(value = "eng_title_out_img")
    private String eng_title_out_img;

    /**
     * 
     */
    @TableField(value = "sim_title_out_img")
    private String sim_title_out_img;

    /**
     * 
     */
    @TableField(value = "title_type")
    private Object title_type;

    /**
     * 
     */
    @TableField(value = "content_type")
    private Object content_type;

    /**
     * 
     */
    @TableField(value = "link_url")
    private String link_url;

    /**
     * 
     */
    @TableField(value = "big_content")
    private String big_content;

    /**
     * 
     */
    @TableField(value = "eng_content")
    private String eng_content;

    /**
     * 
     */
    @TableField(value = "sim_content")
    private String sim_content;

    /**
     * 
     */
    @TableField(value = "big_content_img")
    private String big_content_img;

    /**
     * 
     */
    @TableField(value = "eng_content_img")
    private String eng_content_img;

    /**
     * 
     */
    @TableField(value = "sim_content_img")
    private String sim_content_img;

    /**
     * 
     */
    @TableField(value = "category_id")
    private Object category_id;

    /**
     * 
     */
    @TableField(value = "section_id")
    private Object section_id;

    /**
     * 
     */
    @TableField(value = "effect")
    private String effect;

    /**
     * 
     */
    @TableField(value = "sort_id")
    private Object sort_id;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "give_auditing_time")
    private LocalDateTime give_auditing_time;

    /**
     * 
     */
    @TableField(value = "effect_time")
    private LocalDateTime effect_time;

    /**
     * 
     */
    @TableField(value = "check_time")
    private LocalDateTime check_time;

    /**
     * 
     */
    @TableField(value = "auditing_status")
    private Object auditing_status;

    /**
     * 
     */
    @TableField(value = "cancel_reason")
    private String cancel_reason;

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
        WiArticleCopy other = (WiArticleCopy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDoc_title() == null ? other.getDoc_title() == null : this.getDoc_title().equals(other.getDoc_title()))
            && (this.getBig_title() == null ? other.getBig_title() == null : this.getBig_title().equals(other.getBig_title()))
            && (this.getEng_title() == null ? other.getEng_title() == null : this.getEng_title().equals(other.getEng_title()))
            && (this.getSim_title() == null ? other.getSim_title() == null : this.getSim_title().equals(other.getSim_title()))
            && (this.getBig_intro() == null ? other.getBig_intro() == null : this.getBig_intro().equals(other.getBig_intro()))
            && (this.getEng_intro() == null ? other.getEng_intro() == null : this.getEng_intro().equals(other.getEng_intro()))
            && (this.getSim_intro() == null ? other.getSim_intro() == null : this.getSim_intro().equals(other.getSim_intro()))
            && (this.getBig_title_img() == null ? other.getBig_title_img() == null : this.getBig_title_img().equals(other.getBig_title_img()))
            && (this.getEng_title_img() == null ? other.getEng_title_img() == null : this.getEng_title_img().equals(other.getEng_title_img()))
            && (this.getSim_title_img() == null ? other.getSim_title_img() == null : this.getSim_title_img().equals(other.getSim_title_img()))
            && (this.getBig_title_in_img() == null ? other.getBig_title_in_img() == null : this.getBig_title_in_img().equals(other.getBig_title_in_img()))
            && (this.getEng_title_in_img() == null ? other.getEng_title_in_img() == null : this.getEng_title_in_img().equals(other.getEng_title_in_img()))
            && (this.getSim_title_in_img() == null ? other.getSim_title_in_img() == null : this.getSim_title_in_img().equals(other.getSim_title_in_img()))
            && (this.getBig_title_out_img() == null ? other.getBig_title_out_img() == null : this.getBig_title_out_img().equals(other.getBig_title_out_img()))
            && (this.getEng_title_out_img() == null ? other.getEng_title_out_img() == null : this.getEng_title_out_img().equals(other.getEng_title_out_img()))
            && (this.getSim_title_out_img() == null ? other.getSim_title_out_img() == null : this.getSim_title_out_img().equals(other.getSim_title_out_img()))
            && (this.getTitle_type() == null ? other.getTitle_type() == null : this.getTitle_type().equals(other.getTitle_type()))
            && (this.getContent_type() == null ? other.getContent_type() == null : this.getContent_type().equals(other.getContent_type()))
            && (this.getLink_url() == null ? other.getLink_url() == null : this.getLink_url().equals(other.getLink_url()))
            && (this.getBig_content() == null ? other.getBig_content() == null : this.getBig_content().equals(other.getBig_content()))
            && (this.getEng_content() == null ? other.getEng_content() == null : this.getEng_content().equals(other.getEng_content()))
            && (this.getSim_content() == null ? other.getSim_content() == null : this.getSim_content().equals(other.getSim_content()))
            && (this.getBig_content_img() == null ? other.getBig_content_img() == null : this.getBig_content_img().equals(other.getBig_content_img()))
            && (this.getEng_content_img() == null ? other.getEng_content_img() == null : this.getEng_content_img().equals(other.getEng_content_img()))
            && (this.getSim_content_img() == null ? other.getSim_content_img() == null : this.getSim_content_img().equals(other.getSim_content_img()))
            && (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getSection_id() == null ? other.getSection_id() == null : this.getSection_id().equals(other.getSection_id()))
            && (this.getEffect() == null ? other.getEffect() == null : this.getEffect().equals(other.getEffect()))
            && (this.getSort_id() == null ? other.getSort_id() == null : this.getSort_id().equals(other.getSort_id()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getGive_auditing_time() == null ? other.getGive_auditing_time() == null : this.getGive_auditing_time().equals(other.getGive_auditing_time()))
            && (this.getEffect_time() == null ? other.getEffect_time() == null : this.getEffect_time().equals(other.getEffect_time()))
            && (this.getCheck_time() == null ? other.getCheck_time() == null : this.getCheck_time().equals(other.getCheck_time()))
            && (this.getAuditing_status() == null ? other.getAuditing_status() == null : this.getAuditing_status().equals(other.getAuditing_status()))
            && (this.getCancel_reason() == null ? other.getCancel_reason() == null : this.getCancel_reason().equals(other.getCancel_reason()))
            && (this.getAction() == null ? other.getAction() == null : this.getAction().equals(other.getAction()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDoc_title() == null) ? 0 : getDoc_title().hashCode());
        result = prime * result + ((getBig_title() == null) ? 0 : getBig_title().hashCode());
        result = prime * result + ((getEng_title() == null) ? 0 : getEng_title().hashCode());
        result = prime * result + ((getSim_title() == null) ? 0 : getSim_title().hashCode());
        result = prime * result + ((getBig_intro() == null) ? 0 : getBig_intro().hashCode());
        result = prime * result + ((getEng_intro() == null) ? 0 : getEng_intro().hashCode());
        result = prime * result + ((getSim_intro() == null) ? 0 : getSim_intro().hashCode());
        result = prime * result + ((getBig_title_img() == null) ? 0 : getBig_title_img().hashCode());
        result = prime * result + ((getEng_title_img() == null) ? 0 : getEng_title_img().hashCode());
        result = prime * result + ((getSim_title_img() == null) ? 0 : getSim_title_img().hashCode());
        result = prime * result + ((getBig_title_in_img() == null) ? 0 : getBig_title_in_img().hashCode());
        result = prime * result + ((getEng_title_in_img() == null) ? 0 : getEng_title_in_img().hashCode());
        result = prime * result + ((getSim_title_in_img() == null) ? 0 : getSim_title_in_img().hashCode());
        result = prime * result + ((getBig_title_out_img() == null) ? 0 : getBig_title_out_img().hashCode());
        result = prime * result + ((getEng_title_out_img() == null) ? 0 : getEng_title_out_img().hashCode());
        result = prime * result + ((getSim_title_out_img() == null) ? 0 : getSim_title_out_img().hashCode());
        result = prime * result + ((getTitle_type() == null) ? 0 : getTitle_type().hashCode());
        result = prime * result + ((getContent_type() == null) ? 0 : getContent_type().hashCode());
        result = prime * result + ((getLink_url() == null) ? 0 : getLink_url().hashCode());
        result = prime * result + ((getBig_content() == null) ? 0 : getBig_content().hashCode());
        result = prime * result + ((getEng_content() == null) ? 0 : getEng_content().hashCode());
        result = prime * result + ((getSim_content() == null) ? 0 : getSim_content().hashCode());
        result = prime * result + ((getBig_content_img() == null) ? 0 : getBig_content_img().hashCode());
        result = prime * result + ((getEng_content_img() == null) ? 0 : getEng_content_img().hashCode());
        result = prime * result + ((getSim_content_img() == null) ? 0 : getSim_content_img().hashCode());
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getSection_id() == null) ? 0 : getSection_id().hashCode());
        result = prime * result + ((getEffect() == null) ? 0 : getEffect().hashCode());
        result = prime * result + ((getSort_id() == null) ? 0 : getSort_id().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getGive_auditing_time() == null) ? 0 : getGive_auditing_time().hashCode());
        result = prime * result + ((getEffect_time() == null) ? 0 : getEffect_time().hashCode());
        result = prime * result + ((getCheck_time() == null) ? 0 : getCheck_time().hashCode());
        result = prime * result + ((getAuditing_status() == null) ? 0 : getAuditing_status().hashCode());
        result = prime * result + ((getCancel_reason() == null) ? 0 : getCancel_reason().hashCode());
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
        sb.append(", doc_title=").append(doc_title);
        sb.append(", big_title=").append(big_title);
        sb.append(", eng_title=").append(eng_title);
        sb.append(", sim_title=").append(sim_title);
        sb.append(", big_intro=").append(big_intro);
        sb.append(", eng_intro=").append(eng_intro);
        sb.append(", sim_intro=").append(sim_intro);
        sb.append(", big_title_img=").append(big_title_img);
        sb.append(", eng_title_img=").append(eng_title_img);
        sb.append(", sim_title_img=").append(sim_title_img);
        sb.append(", big_title_in_img=").append(big_title_in_img);
        sb.append(", eng_title_in_img=").append(eng_title_in_img);
        sb.append(", sim_title_in_img=").append(sim_title_in_img);
        sb.append(", big_title_out_img=").append(big_title_out_img);
        sb.append(", eng_title_out_img=").append(eng_title_out_img);
        sb.append(", sim_title_out_img=").append(sim_title_out_img);
        sb.append(", title_type=").append(title_type);
        sb.append(", content_type=").append(content_type);
        sb.append(", link_url=").append(link_url);
        sb.append(", big_content=").append(big_content);
        sb.append(", eng_content=").append(eng_content);
        sb.append(", sim_content=").append(sim_content);
        sb.append(", big_content_img=").append(big_content_img);
        sb.append(", eng_content_img=").append(eng_content_img);
        sb.append(", sim_content_img=").append(sim_content_img);
        sb.append(", category_id=").append(category_id);
        sb.append(", section_id=").append(section_id);
        sb.append(", effect=").append(effect);
        sb.append(", sort_id=").append(sort_id);
        sb.append(", account1=").append(account1);
        sb.append(", station_id=").append(station_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", give_auditing_time=").append(give_auditing_time);
        sb.append(", effect_time=").append(effect_time);
        sb.append(", check_time=").append(check_time);
        sb.append(", auditing_status=").append(auditing_status);
        sb.append(", cancel_reason=").append(cancel_reason);
        sb.append(", action=").append(action);
        sb.append(", ctime=").append(ctime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}