package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 手机游戏新表，站点维度
 * @TableName sys_mobile_model_station
 */
@TableName(value ="sys_mobile_model_station")
@Data
public class SysMobileModelStation implements Serializable {
    /**
     * 表ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 子站点ID
     */
    @TableField(value = "station_sub_id")
    private Object station_sub_id;

    /**
     * 游戏ID包含：手机游戏表ID、电子游戏表ID
     */
    @TableField(value = "game_id")
    private Object game_id;

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
     * game_source=1时:推荐(0:否,1:是)，game_source=2时:推荐(1:否,0:是)
     */
    @TableField(value = "recommend_flag")
    private Integer recommend_flag;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 开放状态
     */
    @TableField(value = "open_flag")
    private Integer open_flag;

    /**
     * 是否首页显示（A04）/角标
     */
    @TableField(value = "hot_flag")
    private Integer hot_flag;

    /**
     * 终端标识：0/PC端，1/手机端
     */
    @TableField(value = "terminal_flag")
    private Integer terminal_flag;

    /**
     * 首页游戏管理修改图片
     */
    @TableField(value = "game_img_url")
    private String game_img_url;

    /**
     * 游戏平台二级分类code
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 标识来源于1：sys_mobile_model，还是2：slot_game_manage
     */
    @TableField(value = "game_source")
    private Integer game_source;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 更新人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 游戏分类id
     */
    @TableField(value = "game_type_ids")
    private Object game_type_ids;

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
        SysMobileModelStation other = (SysMobileModelStation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getStation_sub_id() == null ? other.getStation_sub_id() == null : this.getStation_sub_id().equals(other.getStation_sub_id()))
            && (this.getGame_id() == null ? other.getGame_id() == null : this.getGame_id().equals(other.getGame_id()))
            && (this.getTop_up() == null ? other.getTop_up() == null : this.getTop_up().equals(other.getTop_up()))
            && (this.getTop_up_time() == null ? other.getTop_up_time() == null : this.getTop_up_time().equals(other.getTop_up_time()))
            && (this.getRecommend_flag() == null ? other.getRecommend_flag() == null : this.getRecommend_flag().equals(other.getRecommend_flag()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getOpen_flag() == null ? other.getOpen_flag() == null : this.getOpen_flag().equals(other.getOpen_flag()))
            && (this.getHot_flag() == null ? other.getHot_flag() == null : this.getHot_flag().equals(other.getHot_flag()))
            && (this.getTerminal_flag() == null ? other.getTerminal_flag() == null : this.getTerminal_flag().equals(other.getTerminal_flag()))
            && (this.getGame_img_url() == null ? other.getGame_img_url() == null : this.getGame_img_url().equals(other.getGame_img_url()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getGame_source() == null ? other.getGame_source() == null : this.getGame_source().equals(other.getGame_source()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getGame_type_ids() == null ? other.getGame_type_ids() == null : this.getGame_type_ids().equals(other.getGame_type_ids()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getStation_sub_id() == null) ? 0 : getStation_sub_id().hashCode());
        result = prime * result + ((getGame_id() == null) ? 0 : getGame_id().hashCode());
        result = prime * result + ((getTop_up() == null) ? 0 : getTop_up().hashCode());
        result = prime * result + ((getTop_up_time() == null) ? 0 : getTop_up_time().hashCode());
        result = prime * result + ((getRecommend_flag() == null) ? 0 : getRecommend_flag().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getOpen_flag() == null) ? 0 : getOpen_flag().hashCode());
        result = prime * result + ((getHot_flag() == null) ? 0 : getHot_flag().hashCode());
        result = prime * result + ((getTerminal_flag() == null) ? 0 : getTerminal_flag().hashCode());
        result = prime * result + ((getGame_img_url() == null) ? 0 : getGame_img_url().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getGame_source() == null) ? 0 : getGame_source().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getGame_type_ids() == null) ? 0 : getGame_type_ids().hashCode());
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
        sb.append(", game_id=").append(game_id);
        sb.append(", top_up=").append(top_up);
        sb.append(", top_up_time=").append(top_up_time);
        sb.append(", recommend_flag=").append(recommend_flag);
        sb.append(", sort=").append(sort);
        sb.append(", open_flag=").append(open_flag);
        sb.append(", hot_flag=").append(hot_flag);
        sb.append(", terminal_flag=").append(terminal_flag);
        sb.append(", game_img_url=").append(game_img_url);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", game_source=").append(game_source);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", game_type_ids=").append(game_type_ids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}