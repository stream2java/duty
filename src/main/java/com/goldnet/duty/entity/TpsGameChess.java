package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 棋牌游戏表
 * @TableName tps_game_chess
 */
@TableName(value ="tps_game_chess")
@Data
public class TpsGameChess implements Serializable {
    /**
     * 自增ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 上级游戏类目code
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 游戏名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 游戏图片
     */
    @TableField(value = "img_url")
    private String img_url;

    /**
     * 游戏描述
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 是否启用，0停用|1启用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 第三方游戏ID
     */
    @TableField(value = "game_id")
    private String game_id;

    /**
     * 第三方游戏CODE
     */
    @TableField(value = "game_code")
    private String game_code;

    /**
     * 第三方游戏别名，暂时用作代理即时注单页面
     */
    @TableField(value = "game_alias")
    private String game_alias;

    /**
     * 排序字段
     */
    @TableField(value = "sort")
    private Object sort;

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
     * 更新人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

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
        TpsGameChess other = (TpsGameChess) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImg_url() == null ? other.getImg_url() == null : this.getImg_url().equals(other.getImg_url()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGame_id() == null ? other.getGame_id() == null : this.getGame_id().equals(other.getGame_id()))
            && (this.getGame_code() == null ? other.getGame_code() == null : this.getGame_code().equals(other.getGame_code()))
            && (this.getGame_alias() == null ? other.getGame_alias() == null : this.getGame_alias().equals(other.getGame_alias()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImg_url() == null) ? 0 : getImg_url().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGame_id() == null) ? 0 : getGame_id().hashCode());
        result = prime * result + ((getGame_code() == null) ? 0 : getGame_code().hashCode());
        result = prime * result + ((getGame_alias() == null) ? 0 : getGame_alias().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", name=").append(name);
        sb.append(", img_url=").append(img_url);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", game_id=").append(game_id);
        sb.append(", game_code=").append(game_code);
        sb.append(", game_alias=").append(game_alias);
        sb.append(", sort=").append(sort);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}