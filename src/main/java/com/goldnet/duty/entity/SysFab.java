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
 * @TableName sys_fab
 */
@TableName(value ="sys_fab")
@Data
public class SysFab implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 套別
     */
    @TableField(value = "set_id")
    private String set_id;

    /**
     * 站点ID
     */
    @TableField(value = "site_id")
    private Object site_id;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_date")
    private LocalDateTime update_date;

    /**
     * 后台自订排序
     */
    @TableField(value = "sort_id")
    private Object sort_id;

    /**
     * 购彩明细功能ID
     */
    @TableField(value = "fab_id")
    private String fab_id;

    /**
     * 後台是否啟用 0:不啟用 1:啟用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 總控是否啟用 0:不啟用 1:啟用
     */
    @TableField(value = "status_control")
    private Object status_control;

    /**
     * 同步狀態
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
        SysFab other = (SysFab) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSet_id() == null ? other.getSet_id() == null : this.getSet_id().equals(other.getSet_id()))
            && (this.getSite_id() == null ? other.getSite_id() == null : this.getSite_id().equals(other.getSite_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date() == null ? other.getUpdate_date() == null : this.getUpdate_date().equals(other.getUpdate_date()))
            && (this.getSort_id() == null ? other.getSort_id() == null : this.getSort_id().equals(other.getSort_id()))
            && (this.getFab_id() == null ? other.getFab_id() == null : this.getFab_id().equals(other.getFab_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStatus_control() == null ? other.getStatus_control() == null : this.getStatus_control().equals(other.getStatus_control()))
            && (this.getSync_status() == null ? other.getSync_status() == null : this.getSync_status().equals(other.getSync_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSet_id() == null) ? 0 : getSet_id().hashCode());
        result = prime * result + ((getSite_id() == null) ? 0 : getSite_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date() == null) ? 0 : getUpdate_date().hashCode());
        result = prime * result + ((getSort_id() == null) ? 0 : getSort_id().hashCode());
        result = prime * result + ((getFab_id() == null) ? 0 : getFab_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStatus_control() == null) ? 0 : getStatus_control().hashCode());
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
        sb.append(", set_id=").append(set_id);
        sb.append(", site_id=").append(site_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date=").append(create_date);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date=").append(update_date);
        sb.append(", sort_id=").append(sort_id);
        sb.append(", fab_id=").append(fab_id);
        sb.append(", status=").append(status);
        sb.append(", status_control=").append(status_control);
        sb.append(", sync_status=").append(sync_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}