package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * app和webapp管理
 * @TableName app_domain
 */
@TableName(value ="app_domain")
@Data
public class AppDomain implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 站点id
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 大大股东id
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * APP站点标识
     */
    @TableField(value = "app_station_code")
    private String app_station_code;

    /**
     * APP启用状态  1 启用  2停用
     */
    @TableField(value = "app_status")
    private Object app_status;

    /**
     * APP访问域名协议
     */
    @TableField(value = "domain_protocol")
    private String domain_protocol;

    /**
     * APP访问域名id
     */
    @TableField(value = "domian_id")
    private Object domian_id;

    /**
     * app版本号id
     */
    @TableField(value = "app_version_id")
    private Object app_version_id;

    /**
     * 备注
     */
    @TableField(value = "mark")
    private String mark;

    /**
     * 类型 1 webapp 2 app
     */
    @TableField(value = "type")
    private Object type;

    /**
     * ios版本号ID
     */
    @TableField(value = "ios_version_id")
    private Object ios_version_id;

    /**
     * android版本号ID
     */
    @TableField(value = "android_version_id")
    private Object android_version_id;

    /**
     * ios是否启用状态:0禁用，1启用
     */
    @TableField(value = "ios_status")
    private Object ios_status;

    /**
     * android是否启用状态:0禁用，1启用
     */
    @TableField(value = "android_status")
    private Object android_status;

    /**
     * 推送是否启用:0禁用，1启用
     */
    @TableField(value = "jpush_status")
    private Object jpush_status;

    /**
     * 极光推送的ios_appkey
     */
    @TableField(value = "ios_appkey")
    private String ios_appkey;

    /**
     * 极光推送的ios_mastersecret
     */
    @TableField(value = "ios_mastersecret")
    private String ios_mastersecret;

    /**
     * 极光推送的android_appkey
     */
    @TableField(value = "android_appkey")
    private String android_appkey;

    /**
     * 极光推送的android_mastersecret
     */
    @TableField(value = "android_mastersecret")
    private String android_mastersecret;

    /**
     * app标识
     */
    @TableField(value = "app_station_name")
    private String app_station_name;

    /**
     * 子站点文件夹id,对应表ge_station_sub的id
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
        AppDomain other = (AppDomain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getApp_station_code() == null ? other.getApp_station_code() == null : this.getApp_station_code().equals(other.getApp_station_code()))
            && (this.getApp_status() == null ? other.getApp_status() == null : this.getApp_status().equals(other.getApp_status()))
            && (this.getDomain_protocol() == null ? other.getDomain_protocol() == null : this.getDomain_protocol().equals(other.getDomain_protocol()))
            && (this.getDomian_id() == null ? other.getDomian_id() == null : this.getDomian_id().equals(other.getDomian_id()))
            && (this.getApp_version_id() == null ? other.getApp_version_id() == null : this.getApp_version_id().equals(other.getApp_version_id()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIos_version_id() == null ? other.getIos_version_id() == null : this.getIos_version_id().equals(other.getIos_version_id()))
            && (this.getAndroid_version_id() == null ? other.getAndroid_version_id() == null : this.getAndroid_version_id().equals(other.getAndroid_version_id()))
            && (this.getIos_status() == null ? other.getIos_status() == null : this.getIos_status().equals(other.getIos_status()))
            && (this.getAndroid_status() == null ? other.getAndroid_status() == null : this.getAndroid_status().equals(other.getAndroid_status()))
            && (this.getJpush_status() == null ? other.getJpush_status() == null : this.getJpush_status().equals(other.getJpush_status()))
            && (this.getIos_appkey() == null ? other.getIos_appkey() == null : this.getIos_appkey().equals(other.getIos_appkey()))
            && (this.getIos_mastersecret() == null ? other.getIos_mastersecret() == null : this.getIos_mastersecret().equals(other.getIos_mastersecret()))
            && (this.getAndroid_appkey() == null ? other.getAndroid_appkey() == null : this.getAndroid_appkey().equals(other.getAndroid_appkey()))
            && (this.getAndroid_mastersecret() == null ? other.getAndroid_mastersecret() == null : this.getAndroid_mastersecret().equals(other.getAndroid_mastersecret()))
            && (this.getApp_station_name() == null ? other.getApp_station_name() == null : this.getApp_station_name().equals(other.getApp_station_name()))
            && (this.getStation_sub_id() == null ? other.getStation_sub_id() == null : this.getStation_sub_id().equals(other.getStation_sub_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getApp_station_code() == null) ? 0 : getApp_station_code().hashCode());
        result = prime * result + ((getApp_status() == null) ? 0 : getApp_status().hashCode());
        result = prime * result + ((getDomain_protocol() == null) ? 0 : getDomain_protocol().hashCode());
        result = prime * result + ((getDomian_id() == null) ? 0 : getDomian_id().hashCode());
        result = prime * result + ((getApp_version_id() == null) ? 0 : getApp_version_id().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIos_version_id() == null) ? 0 : getIos_version_id().hashCode());
        result = prime * result + ((getAndroid_version_id() == null) ? 0 : getAndroid_version_id().hashCode());
        result = prime * result + ((getIos_status() == null) ? 0 : getIos_status().hashCode());
        result = prime * result + ((getAndroid_status() == null) ? 0 : getAndroid_status().hashCode());
        result = prime * result + ((getJpush_status() == null) ? 0 : getJpush_status().hashCode());
        result = prime * result + ((getIos_appkey() == null) ? 0 : getIos_appkey().hashCode());
        result = prime * result + ((getIos_mastersecret() == null) ? 0 : getIos_mastersecret().hashCode());
        result = prime * result + ((getAndroid_appkey() == null) ? 0 : getAndroid_appkey().hashCode());
        result = prime * result + ((getAndroid_mastersecret() == null) ? 0 : getAndroid_mastersecret().hashCode());
        result = prime * result + ((getApp_station_name() == null) ? 0 : getApp_station_name().hashCode());
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
        sb.append(", station_id=").append(station_id);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", app_station_code=").append(app_station_code);
        sb.append(", app_status=").append(app_status);
        sb.append(", domain_protocol=").append(domain_protocol);
        sb.append(", domian_id=").append(domian_id);
        sb.append(", app_version_id=").append(app_version_id);
        sb.append(", mark=").append(mark);
        sb.append(", type=").append(type);
        sb.append(", ios_version_id=").append(ios_version_id);
        sb.append(", android_version_id=").append(android_version_id);
        sb.append(", ios_status=").append(ios_status);
        sb.append(", android_status=").append(android_status);
        sb.append(", jpush_status=").append(jpush_status);
        sb.append(", ios_appkey=").append(ios_appkey);
        sb.append(", ios_mastersecret=").append(ios_mastersecret);
        sb.append(", android_appkey=").append(android_appkey);
        sb.append(", android_mastersecret=").append(android_mastersecret);
        sb.append(", app_station_name=").append(app_station_name);
        sb.append(", station_sub_id=").append(station_sub_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}