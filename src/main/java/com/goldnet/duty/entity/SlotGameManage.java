package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 电子游戏管理
 * @TableName slot_game_manage
 */
@TableName(value ="slot_game_manage")
@Data
public class SlotGameManage implements Serializable {
    /**
     * 唯一ID，自增长
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 游戏名称
     */
    @TableField(value = "game_name")
    private String game_name;

    /**
     * 游戏平台：{1:MG_WEB版，2:MG_WAP版，3:PT__WEB版，4:PT_WAP版，5:OG_WEB版，6:OG_WAP版}
     */
    @TableField(value = "game_platform")
    private String game_platform;

    /**
     * 游戏状态{0:开放，1:关闭}
     */
    @TableField(value = "game_status")
    private String game_status;

    /**
     * 是否推荐：{0:推荐，1:不推荐}
     */
    @TableField(value = "recommend")
    private String recommend;

    /**
     * 游戏图片地址
     */
    @TableField(value = "game_img_url")
    private String game_img_url;

    /**
     * 游戏ID
     */
    @TableField(value = "game_id")
    private String game_id;

    /**
     * 游戏显示排序字段
     */
    @TableField(value = "game_order")
    private Object game_order;

    /**
     * 游戏大类{1:拉霸，2:桌面游戏，3:视讯扑克，4:其他游戏,5:电动吃角子老虎机、6:经典老虎机、7:街机游戏、8:刮刮乐游戏,9:成人老虎机}
     */
    @TableField(value = "game_big_type")
    private String game_big_type;

    /**
     * 游戏小类:{1:电动老虎机（3）,2:电动老虎机（5）,3:其他赌场游戏,4:其他桌面游戏,5:轮盘}
     */
    @TableField(value = "game_small_type")
    private String game_small_type;

    /**
     * 操作人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 操作时间
     */
    @TableField(value = "create_date")
    private String create_date;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_date")
    private String update_date;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 父类ID
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 终端标识：0/PC端，1/手机端
     */
    @TableField(value = "terminal_flag")
    private Object terminal_flag;

    /**
     * 平台编码全称,如AGJL
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 游戏类别编码
     */
    @TableField(value = "category_code")
    private String category_code;

    /**
     * 角标(0普通/4最新/1热门/2火爆/5活动)
     */
    @TableField(value = "small_logo_flag")
    private Integer small_logo_flag;

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
     * 横版app_游戏状态{0:开放，1:关闭}
     */
    @TableField(value = "hbapp_game_status")
    private String hbapp_game_status;

    /**
     * 横版app_是否为热门或火爆游戏 0.默认 1.热门 2.火爆 3.维护,4.最新，5.活动
     */
    @TableField(value = "hbapp_small_logo_flag")
    private Integer hbapp_small_logo_flag;

    /**
     * 横版app_是否推荐：{0:推荐，1:不推荐}
     */
    @TableField(value = "hbapp_recommend")
    private String hbapp_recommend;

    /**
     * 横版app_排序字段
     */
    @TableField(value = "hbapp_game_order")
    private Object hbapp_game_order;

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
        SlotGameManage other = (SlotGameManage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGame_name() == null ? other.getGame_name() == null : this.getGame_name().equals(other.getGame_name()))
            && (this.getGame_platform() == null ? other.getGame_platform() == null : this.getGame_platform().equals(other.getGame_platform()))
            && (this.getGame_status() == null ? other.getGame_status() == null : this.getGame_status().equals(other.getGame_status()))
            && (this.getRecommend() == null ? other.getRecommend() == null : this.getRecommend().equals(other.getRecommend()))
            && (this.getGame_img_url() == null ? other.getGame_img_url() == null : this.getGame_img_url().equals(other.getGame_img_url()))
            && (this.getGame_id() == null ? other.getGame_id() == null : this.getGame_id().equals(other.getGame_id()))
            && (this.getGame_order() == null ? other.getGame_order() == null : this.getGame_order().equals(other.getGame_order()))
            && (this.getGame_big_type() == null ? other.getGame_big_type() == null : this.getGame_big_type().equals(other.getGame_big_type()))
            && (this.getGame_small_type() == null ? other.getGame_small_type() == null : this.getGame_small_type().equals(other.getGame_small_type()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date() == null ? other.getUpdate_date() == null : this.getUpdate_date().equals(other.getUpdate_date()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getTerminal_flag() == null ? other.getTerminal_flag() == null : this.getTerminal_flag().equals(other.getTerminal_flag()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getCategory_code() == null ? other.getCategory_code() == null : this.getCategory_code().equals(other.getCategory_code()))
            && (this.getSmall_logo_flag() == null ? other.getSmall_logo_flag() == null : this.getSmall_logo_flag().equals(other.getSmall_logo_flag()))
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
            && (this.getHbapp_game_status() == null ? other.getHbapp_game_status() == null : this.getHbapp_game_status().equals(other.getHbapp_game_status()))
            && (this.getHbapp_small_logo_flag() == null ? other.getHbapp_small_logo_flag() == null : this.getHbapp_small_logo_flag().equals(other.getHbapp_small_logo_flag()))
            && (this.getHbapp_recommend() == null ? other.getHbapp_recommend() == null : this.getHbapp_recommend().equals(other.getHbapp_recommend()))
            && (this.getHbapp_game_order() == null ? other.getHbapp_game_order() == null : this.getHbapp_game_order().equals(other.getHbapp_game_order()))
            && (this.getHbapp_support_recommend() == null ? other.getHbapp_support_recommend() == null : this.getHbapp_support_recommend().equals(other.getHbapp_support_recommend()))
            && (this.getHbapp_vertical_img_url() == null ? other.getHbapp_vertical_img_url() == null : this.getHbapp_vertical_img_url().equals(other.getHbapp_vertical_img_url()))
            && (this.getHbapp_horizontal_img_url() == null ? other.getHbapp_horizontal_img_url() == null : this.getHbapp_horizontal_img_url().equals(other.getHbapp_horizontal_img_url()))
            && (this.getHbapp_top_up() == null ? other.getHbapp_top_up() == null : this.getHbapp_top_up().equals(other.getHbapp_top_up()))
            && (this.getHbapp_top_up_time() == null ? other.getHbapp_top_up_time() == null : this.getHbapp_top_up_time().equals(other.getHbapp_top_up_time()))
            && (this.getBlock_rotation() == null ? other.getBlock_rotation() == null : this.getBlock_rotation().equals(other.getBlock_rotation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGame_name() == null) ? 0 : getGame_name().hashCode());
        result = prime * result + ((getGame_platform() == null) ? 0 : getGame_platform().hashCode());
        result = prime * result + ((getGame_status() == null) ? 0 : getGame_status().hashCode());
        result = prime * result + ((getRecommend() == null) ? 0 : getRecommend().hashCode());
        result = prime * result + ((getGame_img_url() == null) ? 0 : getGame_img_url().hashCode());
        result = prime * result + ((getGame_id() == null) ? 0 : getGame_id().hashCode());
        result = prime * result + ((getGame_order() == null) ? 0 : getGame_order().hashCode());
        result = prime * result + ((getGame_big_type() == null) ? 0 : getGame_big_type().hashCode());
        result = prime * result + ((getGame_small_type() == null) ? 0 : getGame_small_type().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date() == null) ? 0 : getUpdate_date().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getTerminal_flag() == null) ? 0 : getTerminal_flag().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getCategory_code() == null) ? 0 : getCategory_code().hashCode());
        result = prime * result + ((getSmall_logo_flag() == null) ? 0 : getSmall_logo_flag().hashCode());
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
        result = prime * result + ((getHbapp_game_status() == null) ? 0 : getHbapp_game_status().hashCode());
        result = prime * result + ((getHbapp_small_logo_flag() == null) ? 0 : getHbapp_small_logo_flag().hashCode());
        result = prime * result + ((getHbapp_recommend() == null) ? 0 : getHbapp_recommend().hashCode());
        result = prime * result + ((getHbapp_game_order() == null) ? 0 : getHbapp_game_order().hashCode());
        result = prime * result + ((getHbapp_support_recommend() == null) ? 0 : getHbapp_support_recommend().hashCode());
        result = prime * result + ((getHbapp_vertical_img_url() == null) ? 0 : getHbapp_vertical_img_url().hashCode());
        result = prime * result + ((getHbapp_horizontal_img_url() == null) ? 0 : getHbapp_horizontal_img_url().hashCode());
        result = prime * result + ((getHbapp_top_up() == null) ? 0 : getHbapp_top_up().hashCode());
        result = prime * result + ((getHbapp_top_up_time() == null) ? 0 : getHbapp_top_up_time().hashCode());
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
        sb.append(", game_name=").append(game_name);
        sb.append(", game_platform=").append(game_platform);
        sb.append(", game_status=").append(game_status);
        sb.append(", recommend=").append(recommend);
        sb.append(", game_img_url=").append(game_img_url);
        sb.append(", game_id=").append(game_id);
        sb.append(", game_order=").append(game_order);
        sb.append(", game_big_type=").append(game_big_type);
        sb.append(", game_small_type=").append(game_small_type);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date=").append(create_date);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date=").append(update_date);
        sb.append(", account1=").append(account1);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", terminal_flag=").append(terminal_flag);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", category_code=").append(category_code);
        sb.append(", small_logo_flag=").append(small_logo_flag);
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
        sb.append(", hbapp_game_status=").append(hbapp_game_status);
        sb.append(", hbapp_small_logo_flag=").append(hbapp_small_logo_flag);
        sb.append(", hbapp_recommend=").append(hbapp_recommend);
        sb.append(", hbapp_game_order=").append(hbapp_game_order);
        sb.append(", hbapp_support_recommend=").append(hbapp_support_recommend);
        sb.append(", hbapp_vertical_img_url=").append(hbapp_vertical_img_url);
        sb.append(", hbapp_horizontal_img_url=").append(hbapp_horizontal_img_url);
        sb.append(", hbapp_top_up=").append(hbapp_top_up);
        sb.append(", hbapp_top_up_time=").append(hbapp_top_up_time);
        sb.append(", block_rotation=").append(block_rotation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}