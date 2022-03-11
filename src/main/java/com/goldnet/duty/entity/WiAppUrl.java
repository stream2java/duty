package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 手机客户端下载地址表
 * @TableName wi_app_url
 */
@TableName(value ="wi_app_url")
@Data
public class WiAppUrl implements Serializable {
    /**
     * 手机客户端下载地址表主键id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 下载页downloadPage,下载包downloadFile
     */
    @TableField(value = "type")
    private String type;

    /**
     * 下载页地址
     */
    @TableField(value = "page_url")
    private String page_url;

    /**
     * android下载包地址
     */
    @TableField(value = "android_url")
    private String android_url;

    /**
     * ios下载包地址
     */
    @TableField(value = "ios_url")
    private String ios_url;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 状态
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 引用wi_article的id
     */
    @TableField(value = "doc_id")
    private Object doc_id;

    /**
     * 厅主id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * APP原生下载标题
     */
    @TableField(value = "app_down_title")
    private String app_down_title;

    /**
     * APP原生图标
     */
    @TableField(value = "app_down_img")
    private String app_down_img;

    /**
     * 设备类型 1-ios 2-android
     */
    @TableField(value = "device_type")
    private Integer device_type;

    /**
     * app_domain 站点标识id
     */
    @TableField(value = "app_domain_id")
    private Object app_domain_id;

    /**
     * 是否启用下载 1-启用 0-不启用
     */
    @TableField(value = "enable_download")
    private Object enable_download;

    /**
     * 子站点文件夹id,对应表ge_station_sub的id,,如果值为空,表示是主站
     */
    @TableField(value = "station_sub_id")
    private Object station_sub_id;

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
        WiAppUrl other = (WiAppUrl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPage_url() == null ? other.getPage_url() == null : this.getPage_url().equals(other.getPage_url()))
            && (this.getAndroid_url() == null ? other.getAndroid_url() == null : this.getAndroid_url().equals(other.getAndroid_url()))
            && (this.getIos_url() == null ? other.getIos_url() == null : this.getIos_url().equals(other.getIos_url()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDoc_id() == null ? other.getDoc_id() == null : this.getDoc_id().equals(other.getDoc_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getApp_down_title() == null ? other.getApp_down_title() == null : this.getApp_down_title().equals(other.getApp_down_title()))
            && (this.getApp_down_img() == null ? other.getApp_down_img() == null : this.getApp_down_img().equals(other.getApp_down_img()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()))
            && (this.getApp_domain_id() == null ? other.getApp_domain_id() == null : this.getApp_domain_id().equals(other.getApp_domain_id()))
            && (this.getEnable_download() == null ? other.getEnable_download() == null : this.getEnable_download().equals(other.getEnable_download()))
            && (this.getStation_sub_id() == null ? other.getStation_sub_id() == null : this.getStation_sub_id().equals(other.getStation_sub_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPage_url() == null) ? 0 : getPage_url().hashCode());
        result = prime * result + ((getAndroid_url() == null) ? 0 : getAndroid_url().hashCode());
        result = prime * result + ((getIos_url() == null) ? 0 : getIos_url().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDoc_id() == null) ? 0 : getDoc_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getApp_down_title() == null) ? 0 : getApp_down_title().hashCode());
        result = prime * result + ((getApp_down_img() == null) ? 0 : getApp_down_img().hashCode());
        result = prime * result + ((getDevice_type() == null) ? 0 : getDevice_type().hashCode());
        result = prime * result + ((getApp_domain_id() == null) ? 0 : getApp_domain_id().hashCode());
        result = prime * result + ((getEnable_download() == null) ? 0 : getEnable_download().hashCode());
        result = prime * result + ((getStation_sub_id() == null) ? 0 : getStation_sub_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", page_url=").append(page_url);
        sb.append(", android_url=").append(android_url);
        sb.append(", ios_url=").append(ios_url);
        sb.append(", create_user=").append(create_user);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", doc_id=").append(doc_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", app_down_title=").append(app_down_title);
        sb.append(", app_down_img=").append(app_down_img);
        sb.append(", device_type=").append(device_type);
        sb.append(", app_domain_id=").append(app_domain_id);
        sb.append(", enable_download=").append(enable_download);
        sb.append(", station_sub_id=").append(station_sub_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}