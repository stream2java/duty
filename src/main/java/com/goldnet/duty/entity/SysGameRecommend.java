package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 游戏推荐表
 * @TableName sys_game_recommend
 */
@TableName(value ="sys_game_recommend")
@Data
public class SysGameRecommend implements Serializable {
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
     * 游戏id
     */
    @TableField(value = "game_id")
    private Object game_id;

    /**
     * 排序值
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 游戏来源(1:sys_mobile_model-手机游戏表 2:slot_game_manage-电子游戏表)
     */
    @TableField(value = "game_source")
    private Integer game_source;

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
     * 置顶标识(0否 1是)
     */
    @TableField(value = "top_up")
    private Integer top_up;

    /**
     * 置顶时间
     */
    @TableField(value = "top_up_time")
    private LocalDateTime top_up_time;

    /**
     * 横版app_排序
     */
    @TableField(value = "hbapp_sort")
    private Object hbapp_sort;

    /**
     * 置顶标识(0否 1是)
     */
    @TableField(value = "hbapp_top_up")
    private Integer hbapp_top_up;

    /**
     * 置顶时间
     */
    @TableField(value = "hbapp_top_up_time")
    private LocalDateTime hbapp_top_up_time;

    /**
     * 子站ID
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
        SysGameRecommend other = (SysGameRecommend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getGame_id() == null ? other.getGame_id() == null : this.getGame_id().equals(other.getGame_id()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getGame_source() == null ? other.getGame_source() == null : this.getGame_source().equals(other.getGame_source()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getTop_up() == null ? other.getTop_up() == null : this.getTop_up().equals(other.getTop_up()))
            && (this.getTop_up_time() == null ? other.getTop_up_time() == null : this.getTop_up_time().equals(other.getTop_up_time()))
            && (this.getHbapp_sort() == null ? other.getHbapp_sort() == null : this.getHbapp_sort().equals(other.getHbapp_sort()))
            && (this.getHbapp_top_up() == null ? other.getHbapp_top_up() == null : this.getHbapp_top_up().equals(other.getHbapp_top_up()))
            && (this.getHbapp_top_up_time() == null ? other.getHbapp_top_up_time() == null : this.getHbapp_top_up_time().equals(other.getHbapp_top_up_time()))
            && (this.getStation_sub_id() == null ? other.getStation_sub_id() == null : this.getStation_sub_id().equals(other.getStation_sub_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getGame_id() == null) ? 0 : getGame_id().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getGame_source() == null) ? 0 : getGame_source().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getTop_up() == null) ? 0 : getTop_up().hashCode());
        result = prime * result + ((getTop_up_time() == null) ? 0 : getTop_up_time().hashCode());
        result = prime * result + ((getHbapp_sort() == null) ? 0 : getHbapp_sort().hashCode());
        result = prime * result + ((getHbapp_top_up() == null) ? 0 : getHbapp_top_up().hashCode());
        result = prime * result + ((getHbapp_top_up_time() == null) ? 0 : getHbapp_top_up_time().hashCode());
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
        sb.append(", account1=").append(account1);
        sb.append(", game_id=").append(game_id);
        sb.append(", sort=").append(sort);
        sb.append(", game_source=").append(game_source);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", top_up=").append(top_up);
        sb.append(", top_up_time=").append(top_up_time);
        sb.append(", hbapp_sort=").append(hbapp_sort);
        sb.append(", hbapp_top_up=").append(hbapp_top_up);
        sb.append(", hbapp_top_up_time=").append(hbapp_top_up_time);
        sb.append(", station_sub_id=").append(station_sub_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}