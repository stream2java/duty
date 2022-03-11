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
 * @TableName sys_custom_game_recommend
 */
@TableName(value ="sys_custom_game_recommend")
@Data
public class SysCustomGameRecommend implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 子站ID
     */
    @TableField(value = "station_sub_id")
    private Object station_sub_id;

    /**
     * 游戏名称
     */
    @TableField(value = "game_name")
    private String game_name;

    /**
     * 链接类型（对应H5页面）：4：内部URL，5：外部链接
     */
    @TableField(value = "jump_type")
    private Object jump_type;

    /**
     * H5跳转链接
     */
    @TableField(value = "h5_url")
    private String h5_url;

    /**
     * APP跳转链接
     */
    @TableField(value = "app_url")
    private String app_url;

    /**
     * 外部链接跳转地址
     */
    @TableField(value = "jump_url")
    private String jump_url;

    /**
     * 打开方式 1：当前窗口，2：新页签窗口
     */
    @TableField(value = "href_type")
    private Object href_type;

    /**
     * 图片地址
     */
    @TableField(value = "game_img_url")
    private String game_img_url;

    /**
     * 游戏角标
     */
    @TableField(value = "is_hot")
    private Integer is_hot;

    /**
     * 开放状态
     */
    @TableField(value = "open_flag")
    private Integer open_flag;

    /**
     * 排序值
     */
    @TableField(value = "sort")
    private Integer sort;

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
     * 有效标识（0:有效  1:无效）
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 置顶标识(0否 1是)
     */
    @TableField(value = "top_up")
    private Integer top_up;

    /**
     * 置顶时间
     */
    @TableField(value = "top_up_time")
    private LocalDateTime top_up_time;

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
        SysCustomGameRecommend other = (SysCustomGameRecommend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getStation_sub_id() == null ? other.getStation_sub_id() == null : this.getStation_sub_id().equals(other.getStation_sub_id()))
            && (this.getGame_name() == null ? other.getGame_name() == null : this.getGame_name().equals(other.getGame_name()))
            && (this.getJump_type() == null ? other.getJump_type() == null : this.getJump_type().equals(other.getJump_type()))
            && (this.getH5_url() == null ? other.getH5_url() == null : this.getH5_url().equals(other.getH5_url()))
            && (this.getApp_url() == null ? other.getApp_url() == null : this.getApp_url().equals(other.getApp_url()))
            && (this.getJump_url() == null ? other.getJump_url() == null : this.getJump_url().equals(other.getJump_url()))
            && (this.getHref_type() == null ? other.getHref_type() == null : this.getHref_type().equals(other.getHref_type()))
            && (this.getGame_img_url() == null ? other.getGame_img_url() == null : this.getGame_img_url().equals(other.getGame_img_url()))
            && (this.getIs_hot() == null ? other.getIs_hot() == null : this.getIs_hot().equals(other.getIs_hot()))
            && (this.getOpen_flag() == null ? other.getOpen_flag() == null : this.getOpen_flag().equals(other.getOpen_flag()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTop_up() == null ? other.getTop_up() == null : this.getTop_up().equals(other.getTop_up()))
            && (this.getTop_up_time() == null ? other.getTop_up_time() == null : this.getTop_up_time().equals(other.getTop_up_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getStation_sub_id() == null) ? 0 : getStation_sub_id().hashCode());
        result = prime * result + ((getGame_name() == null) ? 0 : getGame_name().hashCode());
        result = prime * result + ((getJump_type() == null) ? 0 : getJump_type().hashCode());
        result = prime * result + ((getH5_url() == null) ? 0 : getH5_url().hashCode());
        result = prime * result + ((getApp_url() == null) ? 0 : getApp_url().hashCode());
        result = prime * result + ((getJump_url() == null) ? 0 : getJump_url().hashCode());
        result = prime * result + ((getHref_type() == null) ? 0 : getHref_type().hashCode());
        result = prime * result + ((getGame_img_url() == null) ? 0 : getGame_img_url().hashCode());
        result = prime * result + ((getIs_hot() == null) ? 0 : getIs_hot().hashCode());
        result = prime * result + ((getOpen_flag() == null) ? 0 : getOpen_flag().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTop_up() == null) ? 0 : getTop_up().hashCode());
        result = prime * result + ((getTop_up_time() == null) ? 0 : getTop_up_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account1=").append(account1);
        sb.append(", station_sub_id=").append(station_sub_id);
        sb.append(", game_name=").append(game_name);
        sb.append(", jump_type=").append(jump_type);
        sb.append(", h5_url=").append(h5_url);
        sb.append(", app_url=").append(app_url);
        sb.append(", jump_url=").append(jump_url);
        sb.append(", href_type=").append(href_type);
        sb.append(", game_img_url=").append(game_img_url);
        sb.append(", is_hot=").append(is_hot);
        sb.append(", open_flag=").append(open_flag);
        sb.append(", sort=").append(sort);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", status=").append(status);
        sb.append(", top_up=").append(top_up);
        sb.append(", top_up_time=").append(top_up_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}