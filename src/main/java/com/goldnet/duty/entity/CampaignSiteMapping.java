package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 活动站点映射表
 * @TableName campaign_site_mapping
 */
@TableName(value ="campaign_site_mapping")
@Data
public class CampaignSiteMapping implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 活动ID
     */
    @TableField(value = "camp_id")
    private String camp_id;

    /**
     * 
     */
    @TableField(value = "set_id")
    private String set_id;

    /**
     * 站点编号
     */
    @TableField(value = "site_id")
    private Object site_id;

    /**
     * 狀態
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 
     */
    @TableField(value = "modify_date")
    private LocalDateTime modify_date;

    /**
     * 
     */
    @TableField(value = "modify_user")
    private String modify_user;

    /**
     * 
     */
    @TableField(value = "control_status")
    private Object control_status;

    /**
     * 
     */
    @TableField(value = "sync_status")
    private Object sync_status;

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
        CampaignSiteMapping other = (CampaignSiteMapping) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCamp_id() == null ? other.getCamp_id() == null : this.getCamp_id().equals(other.getCamp_id()))
            && (this.getSet_id() == null ? other.getSet_id() == null : this.getSet_id().equals(other.getSet_id()))
            && (this.getSite_id() == null ? other.getSite_id() == null : this.getSite_id().equals(other.getSite_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getModify_date() == null ? other.getModify_date() == null : this.getModify_date().equals(other.getModify_date()))
            && (this.getModify_user() == null ? other.getModify_user() == null : this.getModify_user().equals(other.getModify_user()))
            && (this.getControl_status() == null ? other.getControl_status() == null : this.getControl_status().equals(other.getControl_status()))
            && (this.getSync_status() == null ? other.getSync_status() == null : this.getSync_status().equals(other.getSync_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCamp_id() == null) ? 0 : getCamp_id().hashCode());
        result = prime * result + ((getSet_id() == null) ? 0 : getSet_id().hashCode());
        result = prime * result + ((getSite_id() == null) ? 0 : getSite_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getModify_date() == null) ? 0 : getModify_date().hashCode());
        result = prime * result + ((getModify_user() == null) ? 0 : getModify_user().hashCode());
        result = prime * result + ((getControl_status() == null) ? 0 : getControl_status().hashCode());
        result = prime * result + ((getSync_status() == null) ? 0 : getSync_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", camp_id=").append(camp_id);
        sb.append(", set_id=").append(set_id);
        sb.append(", site_id=").append(site_id);
        sb.append(", status=").append(status);
        sb.append(", modify_date=").append(modify_date);
        sb.append(", modify_user=").append(modify_user);
        sb.append(", control_status=").append(control_status);
        sb.append(", sync_status=").append(sync_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}