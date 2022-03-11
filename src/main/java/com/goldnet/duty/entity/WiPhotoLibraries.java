package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalTime;
import lombok.Data;

/**
 * 
 * @TableName wi_photo_libraries
 */
@TableName(value ="wi_photo_libraries")
@Data
public class WiPhotoLibraries implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 图片标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 图片名称
     */
    @TableField(value = "file_name")
    private String file_name;

    /**
     * 图片路径 /uploads/bodog/203433434.jpg
     */
    @TableField(value = "file_path")
    private String file_path;

    /**
     * 上传时间
     */
    @TableField(value = "upload_time")
    private LocalTime upload_time;

    /**
     * 图片宽度
     */
    @TableField(value = "photo_width")
    private String photo_width;

    /**
     * 图片高度
     */
    @TableField(value = "photo_height")
    private String photo_height;

    /**
     * 大大股东id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 站点id
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 
     */
    @TableField(value = "group_id")
    private Object group_id;

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
        WiPhotoLibraries other = (WiPhotoLibraries) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getFile_name() == null ? other.getFile_name() == null : this.getFile_name().equals(other.getFile_name()))
            && (this.getFile_path() == null ? other.getFile_path() == null : this.getFile_path().equals(other.getFile_path()))
            && (this.getUpload_time() == null ? other.getUpload_time() == null : this.getUpload_time().equals(other.getUpload_time()))
            && (this.getPhoto_width() == null ? other.getPhoto_width() == null : this.getPhoto_width().equals(other.getPhoto_width()))
            && (this.getPhoto_height() == null ? other.getPhoto_height() == null : this.getPhoto_height().equals(other.getPhoto_height()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getGroup_id() == null ? other.getGroup_id() == null : this.getGroup_id().equals(other.getGroup_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getFile_name() == null) ? 0 : getFile_name().hashCode());
        result = prime * result + ((getFile_path() == null) ? 0 : getFile_path().hashCode());
        result = prime * result + ((getUpload_time() == null) ? 0 : getUpload_time().hashCode());
        result = prime * result + ((getPhoto_width() == null) ? 0 : getPhoto_width().hashCode());
        result = prime * result + ((getPhoto_height() == null) ? 0 : getPhoto_height().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getGroup_id() == null) ? 0 : getGroup_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", file_name=").append(file_name);
        sb.append(", file_path=").append(file_path);
        sb.append(", upload_time=").append(upload_time);
        sb.append(", photo_width=").append(photo_width);
        sb.append(", photo_height=").append(photo_height);
        sb.append(", account1=").append(account1);
        sb.append(", station_id=").append(station_id);
        sb.append(", group_id=").append(group_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}