package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 手机版模块信息
 * @TableName sys_mobile_model
 */
@TableName(value ="sys_mobile_model")
@Data
public class SysMobileModel implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 游戏名称
     */
    @TableField(value = "model_name")
    private String model_name;

    /**
     * 跳转路由
     */
    @TableField(value = "model_url")
    private String model_url;

    /**
     * 游戏级别
     */
    @TableField(value = "model_level")
    private Object model_level;

    /**
     * 默认为1
     */
    @TableField(value = "model_target")
    private Object model_target;

    /**
     * 图片地址
     */
    @TableField(value = "model_img_url")
    private String model_img_url;

    /**
     * 游戏类型
     */
    @TableField(value = "model_type")
    private String model_type;

    /**
     * 前端跳转方法
     */
    @TableField(value = "model_html")
    private String model_html;

    /**
     * 未知字段名
     */
    @TableField(value = "model_game_type")
    private String model_game_type;

    /**
     * 是否首页展示
     */
    @TableField(value = "is_index_display")
    private Object is_index_display;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 是否为热门或火爆游戏 0.默认 1.热门 2.火爆 3.维护,4.最新，5.活动
     */
    @TableField(value = "is_hot")
    private Object is_hot;

    /**
     * 是否为试玩游戏 0.否 1.是
     */
    @TableField(value = "is_free")
    private Object is_free;

    /**
     * 二级菜单名称
     */
    @TableField(value = "sub_menu_name")
    private String sub_menu_name;

    /**
     * 厅主ID （0为默认）
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 父ID（对应account_id为0的id）
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 一级菜单名称
     */
    @TableField(value = "menu_name")
    private String menu_name;

    /**
     * 开放状态（0:开放   1:关闭）
     */
    @TableField(value = "open_flag")
    private Integer open_flag;

    /**
     * 厅主推荐(1：是  0:否)
     */
    @TableField(value = "recommend_flag")
    private Integer recommend_flag;

    /**
     * a04站点数据标识，默认为0，为1时将不查询(真人娱乐/体育/电子游艺/体育赛事/VG棋牌等)
     */
    @TableField(value = "game_flag")
    private Integer game_flag;

    /**
     * 游戏分类id
     */
    @TableField(value = "game_type_ids")
    private Object game_type_ids;

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
     * 是否需要登录后跳转(0否 1是)
     */
    @TableField(value = "login_open")
    private Integer login_open;

    /**
     * 打开链接方式(1当前窗口/2新开窗口)
     */
    @TableField(value = "href_type")
    private Integer href_type;

    /**
     * 跳转方式(1=非电子游戏 2=电子游戏，3=内部Tab页签，4=内部URL，5=自定义URL)
     */
    @TableField(value = "jump_type")
    private Integer jump_type;

    /**
     * H5跳转地址URL
     */
    @TableField(value = "h5_url")
    private String h5_url;

    /**
     * H5跳转第三方参数
     */
    @TableField(value = "h5_params")
    private String h5_params;

    /**
     * APP跳转地址URL
     */
    @TableField(value = "app_url")
    private String app_url;

    /**
     * APP跳转第三方参数
     */
    @TableField(value = "app_params")
    private String app_params;

    /**
     * 跳转类型为内部TAB时,h5的游戏分类id数组
     */
    @TableField(value = "h5_href_menu")
    private Object h5_href_menu;

    /**
     * 跳转类型为内部TAB时,app的游戏分类id数组
     */
    @TableField(value = "app_href_menu")
    private Object app_href_menu;

    /**
     * 同步DB(DB1,DB2,DB3)
     */
    @TableField(value = "db_source")
    private String db_source;

    /**
     * 横版app_游戏开放状态{0:开放，1:关闭}
     */
    @TableField(value = "hbapp_open_flag")
    private Integer hbapp_open_flag;

    /**
     * 横版app_是否为热门或火爆游戏 0.默认 1.热门 2.火爆 3.维护,4.最新，5.活动
     */
    @TableField(value = "hbapp_is_hot")
    private Object hbapp_is_hot;

    /**
     * 横版app_是否推荐：{1:推荐，0:不推荐}
     */
    @TableField(value = "hbapp_recommend_flag")
    private Integer hbapp_recommend_flag;

    /**
     * 横版app_排序
     */
    @TableField(value = "hbapp_sort")
    private Object hbapp_sort;

    /**
     * 横版app_是否支持推荐：{0:支持，1:不支持}
     */
    @TableField(value = "hbapp_support_recommend")
    private Object hbapp_support_recommend;

    /**
     * 横版app_竖图，50*60
     */
    @TableField(value = "hbapp_vertical_img_url")
    private String hbapp_vertical_img_url;

    /**
     * 横版app_横图，60*50
     */
    @TableField(value = "hbapp_horizontal_img_url")
    private String hbapp_horizontal_img_url;

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
     * 是否是平台游戏标识(0否 1是)
     */
    @TableField(value = "platform_flag")
    private Integer platform_flag;

    /**
     * 横版app图片
     */
    @TableField(value = "hbapp_model_img_url")
    private String hbapp_model_img_url;

    /**
     * 是否支持横竖屏（1：横屏，2：竖屏，3：横竖屏(预设) ）
     */
    @TableField(value = "block_rotation")
    private Object block_rotation;

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
        SysMobileModel other = (SysMobileModel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getModel_name() == null ? other.getModel_name() == null : this.getModel_name().equals(other.getModel_name()))
            && (this.getModel_url() == null ? other.getModel_url() == null : this.getModel_url().equals(other.getModel_url()))
            && (this.getModel_level() == null ? other.getModel_level() == null : this.getModel_level().equals(other.getModel_level()))
            && (this.getModel_target() == null ? other.getModel_target() == null : this.getModel_target().equals(other.getModel_target()))
            && (this.getModel_img_url() == null ? other.getModel_img_url() == null : this.getModel_img_url().equals(other.getModel_img_url()))
            && (this.getModel_type() == null ? other.getModel_type() == null : this.getModel_type().equals(other.getModel_type()))
            && (this.getModel_html() == null ? other.getModel_html() == null : this.getModel_html().equals(other.getModel_html()))
            && (this.getModel_game_type() == null ? other.getModel_game_type() == null : this.getModel_game_type().equals(other.getModel_game_type()))
            && (this.getIs_index_display() == null ? other.getIs_index_display() == null : this.getIs_index_display().equals(other.getIs_index_display()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getIs_hot() == null ? other.getIs_hot() == null : this.getIs_hot().equals(other.getIs_hot()))
            && (this.getIs_free() == null ? other.getIs_free() == null : this.getIs_free().equals(other.getIs_free()))
            && (this.getSub_menu_name() == null ? other.getSub_menu_name() == null : this.getSub_menu_name().equals(other.getSub_menu_name()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getMenu_name() == null ? other.getMenu_name() == null : this.getMenu_name().equals(other.getMenu_name()))
            && (this.getOpen_flag() == null ? other.getOpen_flag() == null : this.getOpen_flag().equals(other.getOpen_flag()))
            && (this.getRecommend_flag() == null ? other.getRecommend_flag() == null : this.getRecommend_flag().equals(other.getRecommend_flag()))
            && (this.getGame_flag() == null ? other.getGame_flag() == null : this.getGame_flag().equals(other.getGame_flag()))
            && (this.getGame_type_ids() == null ? other.getGame_type_ids() == null : this.getGame_type_ids().equals(other.getGame_type_ids()))
            && (this.getTop_up() == null ? other.getTop_up() == null : this.getTop_up().equals(other.getTop_up()))
            && (this.getTop_up_time() == null ? other.getTop_up_time() == null : this.getTop_up_time().equals(other.getTop_up_time()))
            && (this.getLogin_open() == null ? other.getLogin_open() == null : this.getLogin_open().equals(other.getLogin_open()))
            && (this.getHref_type() == null ? other.getHref_type() == null : this.getHref_type().equals(other.getHref_type()))
            && (this.getJump_type() == null ? other.getJump_type() == null : this.getJump_type().equals(other.getJump_type()))
            && (this.getH5_url() == null ? other.getH5_url() == null : this.getH5_url().equals(other.getH5_url()))
            && (this.getH5_params() == null ? other.getH5_params() == null : this.getH5_params().equals(other.getH5_params()))
            && (this.getApp_url() == null ? other.getApp_url() == null : this.getApp_url().equals(other.getApp_url()))
            && (this.getApp_params() == null ? other.getApp_params() == null : this.getApp_params().equals(other.getApp_params()))
            && (this.getH5_href_menu() == null ? other.getH5_href_menu() == null : this.getH5_href_menu().equals(other.getH5_href_menu()))
            && (this.getApp_href_menu() == null ? other.getApp_href_menu() == null : this.getApp_href_menu().equals(other.getApp_href_menu()))
            && (this.getDb_source() == null ? other.getDb_source() == null : this.getDb_source().equals(other.getDb_source()))
            && (this.getHbapp_open_flag() == null ? other.getHbapp_open_flag() == null : this.getHbapp_open_flag().equals(other.getHbapp_open_flag()))
            && (this.getHbapp_is_hot() == null ? other.getHbapp_is_hot() == null : this.getHbapp_is_hot().equals(other.getHbapp_is_hot()))
            && (this.getHbapp_recommend_flag() == null ? other.getHbapp_recommend_flag() == null : this.getHbapp_recommend_flag().equals(other.getHbapp_recommend_flag()))
            && (this.getHbapp_sort() == null ? other.getHbapp_sort() == null : this.getHbapp_sort().equals(other.getHbapp_sort()))
            && (this.getHbapp_support_recommend() == null ? other.getHbapp_support_recommend() == null : this.getHbapp_support_recommend().equals(other.getHbapp_support_recommend()))
            && (this.getHbapp_vertical_img_url() == null ? other.getHbapp_vertical_img_url() == null : this.getHbapp_vertical_img_url().equals(other.getHbapp_vertical_img_url()))
            && (this.getHbapp_horizontal_img_url() == null ? other.getHbapp_horizontal_img_url() == null : this.getHbapp_horizontal_img_url().equals(other.getHbapp_horizontal_img_url()))
            && (this.getHbapp_top_up() == null ? other.getHbapp_top_up() == null : this.getHbapp_top_up().equals(other.getHbapp_top_up()))
            && (this.getHbapp_top_up_time() == null ? other.getHbapp_top_up_time() == null : this.getHbapp_top_up_time().equals(other.getHbapp_top_up_time()))
            && (this.getPlatform_flag() == null ? other.getPlatform_flag() == null : this.getPlatform_flag().equals(other.getPlatform_flag()))
            && (this.getHbapp_model_img_url() == null ? other.getHbapp_model_img_url() == null : this.getHbapp_model_img_url().equals(other.getHbapp_model_img_url()))
            && (this.getBlock_rotation() == null ? other.getBlock_rotation() == null : this.getBlock_rotation().equals(other.getBlock_rotation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getModel_name() == null) ? 0 : getModel_name().hashCode());
        result = prime * result + ((getModel_url() == null) ? 0 : getModel_url().hashCode());
        result = prime * result + ((getModel_level() == null) ? 0 : getModel_level().hashCode());
        result = prime * result + ((getModel_target() == null) ? 0 : getModel_target().hashCode());
        result = prime * result + ((getModel_img_url() == null) ? 0 : getModel_img_url().hashCode());
        result = prime * result + ((getModel_type() == null) ? 0 : getModel_type().hashCode());
        result = prime * result + ((getModel_html() == null) ? 0 : getModel_html().hashCode());
        result = prime * result + ((getModel_game_type() == null) ? 0 : getModel_game_type().hashCode());
        result = prime * result + ((getIs_index_display() == null) ? 0 : getIs_index_display().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getIs_hot() == null) ? 0 : getIs_hot().hashCode());
        result = prime * result + ((getIs_free() == null) ? 0 : getIs_free().hashCode());
        result = prime * result + ((getSub_menu_name() == null) ? 0 : getSub_menu_name().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getMenu_name() == null) ? 0 : getMenu_name().hashCode());
        result = prime * result + ((getOpen_flag() == null) ? 0 : getOpen_flag().hashCode());
        result = prime * result + ((getRecommend_flag() == null) ? 0 : getRecommend_flag().hashCode());
        result = prime * result + ((getGame_flag() == null) ? 0 : getGame_flag().hashCode());
        result = prime * result + ((getGame_type_ids() == null) ? 0 : getGame_type_ids().hashCode());
        result = prime * result + ((getTop_up() == null) ? 0 : getTop_up().hashCode());
        result = prime * result + ((getTop_up_time() == null) ? 0 : getTop_up_time().hashCode());
        result = prime * result + ((getLogin_open() == null) ? 0 : getLogin_open().hashCode());
        result = prime * result + ((getHref_type() == null) ? 0 : getHref_type().hashCode());
        result = prime * result + ((getJump_type() == null) ? 0 : getJump_type().hashCode());
        result = prime * result + ((getH5_url() == null) ? 0 : getH5_url().hashCode());
        result = prime * result + ((getH5_params() == null) ? 0 : getH5_params().hashCode());
        result = prime * result + ((getApp_url() == null) ? 0 : getApp_url().hashCode());
        result = prime * result + ((getApp_params() == null) ? 0 : getApp_params().hashCode());
        result = prime * result + ((getH5_href_menu() == null) ? 0 : getH5_href_menu().hashCode());
        result = prime * result + ((getApp_href_menu() == null) ? 0 : getApp_href_menu().hashCode());
        result = prime * result + ((getDb_source() == null) ? 0 : getDb_source().hashCode());
        result = prime * result + ((getHbapp_open_flag() == null) ? 0 : getHbapp_open_flag().hashCode());
        result = prime * result + ((getHbapp_is_hot() == null) ? 0 : getHbapp_is_hot().hashCode());
        result = prime * result + ((getHbapp_recommend_flag() == null) ? 0 : getHbapp_recommend_flag().hashCode());
        result = prime * result + ((getHbapp_sort() == null) ? 0 : getHbapp_sort().hashCode());
        result = prime * result + ((getHbapp_support_recommend() == null) ? 0 : getHbapp_support_recommend().hashCode());
        result = prime * result + ((getHbapp_vertical_img_url() == null) ? 0 : getHbapp_vertical_img_url().hashCode());
        result = prime * result + ((getHbapp_horizontal_img_url() == null) ? 0 : getHbapp_horizontal_img_url().hashCode());
        result = prime * result + ((getHbapp_top_up() == null) ? 0 : getHbapp_top_up().hashCode());
        result = prime * result + ((getHbapp_top_up_time() == null) ? 0 : getHbapp_top_up_time().hashCode());
        result = prime * result + ((getPlatform_flag() == null) ? 0 : getPlatform_flag().hashCode());
        result = prime * result + ((getHbapp_model_img_url() == null) ? 0 : getHbapp_model_img_url().hashCode());
        result = prime * result + ((getBlock_rotation() == null) ? 0 : getBlock_rotation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", model_name=").append(model_name);
        sb.append(", model_url=").append(model_url);
        sb.append(", model_level=").append(model_level);
        sb.append(", model_target=").append(model_target);
        sb.append(", model_img_url=").append(model_img_url);
        sb.append(", model_type=").append(model_type);
        sb.append(", model_html=").append(model_html);
        sb.append(", model_game_type=").append(model_game_type);
        sb.append(", is_index_display=").append(is_index_display);
        sb.append(", sort=").append(sort);
        sb.append(", is_hot=").append(is_hot);
        sb.append(", is_free=").append(is_free);
        sb.append(", sub_menu_name=").append(sub_menu_name);
        sb.append(", account_id=").append(account_id);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", menu_name=").append(menu_name);
        sb.append(", open_flag=").append(open_flag);
        sb.append(", recommend_flag=").append(recommend_flag);
        sb.append(", game_flag=").append(game_flag);
        sb.append(", game_type_ids=").append(game_type_ids);
        sb.append(", top_up=").append(top_up);
        sb.append(", top_up_time=").append(top_up_time);
        sb.append(", login_open=").append(login_open);
        sb.append(", href_type=").append(href_type);
        sb.append(", jump_type=").append(jump_type);
        sb.append(", h5_url=").append(h5_url);
        sb.append(", h5_params=").append(h5_params);
        sb.append(", app_url=").append(app_url);
        sb.append(", app_params=").append(app_params);
        sb.append(", h5_href_menu=").append(h5_href_menu);
        sb.append(", app_href_menu=").append(app_href_menu);
        sb.append(", db_source=").append(db_source);
        sb.append(", hbapp_open_flag=").append(hbapp_open_flag);
        sb.append(", hbapp_is_hot=").append(hbapp_is_hot);
        sb.append(", hbapp_recommend_flag=").append(hbapp_recommend_flag);
        sb.append(", hbapp_sort=").append(hbapp_sort);
        sb.append(", hbapp_support_recommend=").append(hbapp_support_recommend);
        sb.append(", hbapp_vertical_img_url=").append(hbapp_vertical_img_url);
        sb.append(", hbapp_horizontal_img_url=").append(hbapp_horizontal_img_url);
        sb.append(", hbapp_top_up=").append(hbapp_top_up);
        sb.append(", hbapp_top_up_time=").append(hbapp_top_up_time);
        sb.append(", platform_flag=").append(platform_flag);
        sb.append(", hbapp_model_img_url=").append(hbapp_model_img_url);
        sb.append(", block_rotation=").append(block_rotation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}