package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 平台游戏图片管理表
 * @TableName ge_game_pic_libraries
 */
@TableName(value ="ge_game_pic_libraries")
@Data
public class GeGamePicLibraries implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 图片名称
     */
    @TableField(value = "file_name")
    private String file_name;

    /**
     * 图片路径
     */
    @TableField(value = "file_path")
    private String file_path;

    /**
     * 图片类型（1-PC端图片 2-手机端图片）
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 上传时间
     */
    @TableField(value = "upload_time")
    private LocalDateTime upload_time;

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
     * 游戏平台编号
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 游戏分类ids
     */
    @TableField(value = "game_type_ids")
    private Object game_type_ids;

    /**
     * 同步DB(DB1,DB2,DB3)
     */
    @TableField(value = "db_source")
    private String db_source;

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
        GeGamePicLibraries other = (GeGamePicLibraries) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFile_name() == null ? other.getFile_name() == null : this.getFile_name().equals(other.getFile_name()))
            && (this.getFile_path() == null ? other.getFile_path() == null : this.getFile_path().equals(other.getFile_path()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUpload_time() == null ? other.getUpload_time() == null : this.getUpload_time().equals(other.getUpload_time()))
            && (this.getPhoto_width() == null ? other.getPhoto_width() == null : this.getPhoto_width().equals(other.getPhoto_width()))
            && (this.getPhoto_height() == null ? other.getPhoto_height() == null : this.getPhoto_height().equals(other.getPhoto_height()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getGame_type_ids() == null ? other.getGame_type_ids() == null : this.getGame_type_ids().equals(other.getGame_type_ids()))
            && (this.getDb_source() == null ? other.getDb_source() == null : this.getDb_source().equals(other.getDb_source()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFile_name() == null) ? 0 : getFile_name().hashCode());
        result = prime * result + ((getFile_path() == null) ? 0 : getFile_path().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUpload_time() == null) ? 0 : getUpload_time().hashCode());
        result = prime * result + ((getPhoto_width() == null) ? 0 : getPhoto_width().hashCode());
        result = prime * result + ((getPhoto_height() == null) ? 0 : getPhoto_height().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getGame_type_ids() == null) ? 0 : getGame_type_ids().hashCode());
        result = prime * result + ((getDb_source() == null) ? 0 : getDb_source().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", file_name=").append(file_name);
        sb.append(", file_path=").append(file_path);
        sb.append(", type=").append(type);
        sb.append(", upload_time=").append(upload_time);
        sb.append(", photo_width=").append(photo_width);
        sb.append(", photo_height=").append(photo_height);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", game_type_ids=").append(game_type_ids);
        sb.append(", db_source=").append(db_source);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}