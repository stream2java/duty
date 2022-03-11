package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName ge_station_domain
 */
@TableName(value ="ge_station_domain")
@Data
public class GeStationDomain implements Serializable {
    /**
     * 记录ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 站点Id
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 域名
     */
    @TableField(value = "domain_url")
    private String domain_url;

    /**
     * 状态 0 启用,1禁用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 0 默认域名,1:为线路检测,2:简易登录,3:代理管理
     */
    @TableField(value = "action_scope")
    private Object action_scope;

    /**
     * 域名对应的皮肤所在站点的文件夹
     */
    @TableField(value = "skin_folder")
    private String skin_folder;

    /**
     * 站点文件夹id
     */
    @TableField(value = "station_son_id")
    private Object station_son_id;

    /**
     * APP使用域名(0:关闭,1:启用)
     */
    @TableField(value = "app_checked")
    private Object app_checked;

    /**
     * 手机端子站域名对应的皮肤所在站点的文件夹
     */
    @TableField(value = "h5skin_folder")
    private String h5skin_folder;

    /**
     * APP下载(0:关闭,1:启用)
     */
    @TableField(value = "app_down_checked")
    private Object app_down_checked;

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
        GeStationDomain other = (GeStationDomain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getDomain_url() == null ? other.getDomain_url() == null : this.getDomain_url().equals(other.getDomain_url()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAction_scope() == null ? other.getAction_scope() == null : this.getAction_scope().equals(other.getAction_scope()))
            && (this.getSkin_folder() == null ? other.getSkin_folder() == null : this.getSkin_folder().equals(other.getSkin_folder()))
            && (this.getStation_son_id() == null ? other.getStation_son_id() == null : this.getStation_son_id().equals(other.getStation_son_id()))
            && (this.getApp_checked() == null ? other.getApp_checked() == null : this.getApp_checked().equals(other.getApp_checked()))
            && (this.getH5skin_folder() == null ? other.getH5skin_folder() == null : this.getH5skin_folder().equals(other.getH5skin_folder()))
            && (this.getApp_down_checked() == null ? other.getApp_down_checked() == null : this.getApp_down_checked().equals(other.getApp_down_checked()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getDomain_url() == null) ? 0 : getDomain_url().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAction_scope() == null) ? 0 : getAction_scope().hashCode());
        result = prime * result + ((getSkin_folder() == null) ? 0 : getSkin_folder().hashCode());
        result = prime * result + ((getStation_son_id() == null) ? 0 : getStation_son_id().hashCode());
        result = prime * result + ((getApp_checked() == null) ? 0 : getApp_checked().hashCode());
        result = prime * result + ((getH5skin_folder() == null) ? 0 : getH5skin_folder().hashCode());
        result = prime * result + ((getApp_down_checked() == null) ? 0 : getApp_down_checked().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", station_id=").append(station_id);
        sb.append(", domain_url=").append(domain_url);
        sb.append(", status=").append(status);
        sb.append(", action_scope=").append(action_scope);
        sb.append(", skin_folder=").append(skin_folder);
        sb.append(", station_son_id=").append(station_son_id);
        sb.append(", app_checked=").append(app_checked);
        sb.append(", h5skin_folder=").append(h5skin_folder);
        sb.append(", app_down_checked=").append(app_down_checked);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}