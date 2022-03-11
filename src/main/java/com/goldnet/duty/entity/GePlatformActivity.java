package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 平台活动
 * @TableName ge_platform_activity
 */
@TableName(value ="ge_platform_activity")
@Data
public class GePlatformActivity implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * db之间数据同步ID
     */
    @TableField(value = "db_sync_id")
    private String db_sync_id;

    /**
     * 活动标题
     */
    @TableField(value = "activity_title")
    private String activity_title;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 上架时间
     */
    @TableField(value = "start_time")
    private String start_time;

    /**
     * 下架时间
     */
    @TableField(value = "end_time")
    private String end_time;

    /**
     * 活动平台
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 游戏平台名称
     */
    @TableField(value = "platform_name")
    private String platform_name;

    /**
     * 活动状态：0-关闭，1-开启
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 活动预览是否发布，0-预览，1-发布
     */
    @TableField(value = "activity_enable")
    private Integer activity_enable;

    /**
     * H5端标题类型
     */
    @TableField(value = "title_type_wap")
    private Integer title_type_wap;

    /**
     * H5端标题小图标
     */
    @TableField(value = "title_icon_wap")
    private Integer title_icon_wap;

    /**
     * PC端文字标题
     */
    @TableField(value = "title_pic_wap")
    private String title_pic_wap;

    /**
     * H5端文字标题
     */
    @TableField(value = "title_txt_wap")
    private String title_txt_wap;

    /**
     * 标题类型
     */
    @TableField(value = "title_type_pc")
    private Integer title_type_pc;

    /**
     * 文字标题小图标
     */
    @TableField(value = "title_icon_pc")
    private String title_icon_pc;

    /**
     * 图片标题路径
     */
    @TableField(value = "title_pic_pc")
    private String title_pic_pc;

    /**
     * PC端文字标题
     */
    @TableField(value = "title_txt_pc")
    private String title_txt_pc;

    /**
     * PC端活动内容
     */
    @TableField(value = "content_pc")
    private String content_pc;

    /**
     * H5端活动内容
     */
    @TableField(value = "content_wap")
    private String content_wap;

    /**
     * 预览标题
     */
    @TableField(value = "activity_title_temp")
    private String activity_title_temp;

    /**
     * PC端预览内容
     */
    @TableField(value = "content_pc_temp")
    private String content_pc_temp;

    /**
     * H5端预览内容
     */
    @TableField(value = "content_wap_temp")
    private String content_wap_temp;

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
     * 横版app端预览内容
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 更新人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 横版app端标题类型
     */
    @TableField(value = "title_type_hbapp")
    private Integer title_type_hbapp;

    /**
     * 横版app端标题小图标
     */
    @TableField(value = "title_icon_hbapp")
    private Integer title_icon_hbapp;

    /**
     * 横版app标题图片
     */
    @TableField(value = "title_pic_hbapp")
    private String title_pic_hbapp;

    /**
     * 横版app端文字标题
     */
    @TableField(value = "title_txt_hbapp")
    private String title_txt_hbapp;

    /**
     * 横版app端活动内容
     */
    @TableField(value = "content_hbapp")
    private String content_hbapp;

    /**
     * 
     */
    @TableField(value = "content_hbapp_temp")
    private String content_hbapp_temp;

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
        GePlatformActivity other = (GePlatformActivity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getDb_sync_id() == null ? other.getDb_sync_id() == null : this.getDb_sync_id().equals(other.getDb_sync_id()))
            && (this.getActivity_title() == null ? other.getActivity_title() == null : this.getActivity_title().equals(other.getActivity_title()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getPlatform_name() == null ? other.getPlatform_name() == null : this.getPlatform_name().equals(other.getPlatform_name()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getActivity_enable() == null ? other.getActivity_enable() == null : this.getActivity_enable().equals(other.getActivity_enable()))
            && (this.getTitle_type_wap() == null ? other.getTitle_type_wap() == null : this.getTitle_type_wap().equals(other.getTitle_type_wap()))
            && (this.getTitle_icon_wap() == null ? other.getTitle_icon_wap() == null : this.getTitle_icon_wap().equals(other.getTitle_icon_wap()))
            && (this.getTitle_pic_wap() == null ? other.getTitle_pic_wap() == null : this.getTitle_pic_wap().equals(other.getTitle_pic_wap()))
            && (this.getTitle_txt_wap() == null ? other.getTitle_txt_wap() == null : this.getTitle_txt_wap().equals(other.getTitle_txt_wap()))
            && (this.getTitle_type_pc() == null ? other.getTitle_type_pc() == null : this.getTitle_type_pc().equals(other.getTitle_type_pc()))
            && (this.getTitle_icon_pc() == null ? other.getTitle_icon_pc() == null : this.getTitle_icon_pc().equals(other.getTitle_icon_pc()))
            && (this.getTitle_pic_pc() == null ? other.getTitle_pic_pc() == null : this.getTitle_pic_pc().equals(other.getTitle_pic_pc()))
            && (this.getTitle_txt_pc() == null ? other.getTitle_txt_pc() == null : this.getTitle_txt_pc().equals(other.getTitle_txt_pc()))
            && (this.getContent_pc() == null ? other.getContent_pc() == null : this.getContent_pc().equals(other.getContent_pc()))
            && (this.getContent_wap() == null ? other.getContent_wap() == null : this.getContent_wap().equals(other.getContent_wap()))
            && (this.getActivity_title_temp() == null ? other.getActivity_title_temp() == null : this.getActivity_title_temp().equals(other.getActivity_title_temp()))
            && (this.getContent_pc_temp() == null ? other.getContent_pc_temp() == null : this.getContent_pc_temp().equals(other.getContent_pc_temp()))
            && (this.getContent_wap_temp() == null ? other.getContent_wap_temp() == null : this.getContent_wap_temp().equals(other.getContent_wap_temp()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getTitle_type_hbapp() == null ? other.getTitle_type_hbapp() == null : this.getTitle_type_hbapp().equals(other.getTitle_type_hbapp()))
            && (this.getTitle_icon_hbapp() == null ? other.getTitle_icon_hbapp() == null : this.getTitle_icon_hbapp().equals(other.getTitle_icon_hbapp()))
            && (this.getTitle_pic_hbapp() == null ? other.getTitle_pic_hbapp() == null : this.getTitle_pic_hbapp().equals(other.getTitle_pic_hbapp()))
            && (this.getTitle_txt_hbapp() == null ? other.getTitle_txt_hbapp() == null : this.getTitle_txt_hbapp().equals(other.getTitle_txt_hbapp()))
            && (this.getContent_hbapp() == null ? other.getContent_hbapp() == null : this.getContent_hbapp().equals(other.getContent_hbapp()))
            && (this.getContent_hbapp_temp() == null ? other.getContent_hbapp_temp() == null : this.getContent_hbapp_temp().equals(other.getContent_hbapp_temp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getDb_sync_id() == null) ? 0 : getDb_sync_id().hashCode());
        result = prime * result + ((getActivity_title() == null) ? 0 : getActivity_title().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getPlatform_name() == null) ? 0 : getPlatform_name().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getActivity_enable() == null) ? 0 : getActivity_enable().hashCode());
        result = prime * result + ((getTitle_type_wap() == null) ? 0 : getTitle_type_wap().hashCode());
        result = prime * result + ((getTitle_icon_wap() == null) ? 0 : getTitle_icon_wap().hashCode());
        result = prime * result + ((getTitle_pic_wap() == null) ? 0 : getTitle_pic_wap().hashCode());
        result = prime * result + ((getTitle_txt_wap() == null) ? 0 : getTitle_txt_wap().hashCode());
        result = prime * result + ((getTitle_type_pc() == null) ? 0 : getTitle_type_pc().hashCode());
        result = prime * result + ((getTitle_icon_pc() == null) ? 0 : getTitle_icon_pc().hashCode());
        result = prime * result + ((getTitle_pic_pc() == null) ? 0 : getTitle_pic_pc().hashCode());
        result = prime * result + ((getTitle_txt_pc() == null) ? 0 : getTitle_txt_pc().hashCode());
        result = prime * result + ((getContent_pc() == null) ? 0 : getContent_pc().hashCode());
        result = prime * result + ((getContent_wap() == null) ? 0 : getContent_wap().hashCode());
        result = prime * result + ((getActivity_title_temp() == null) ? 0 : getActivity_title_temp().hashCode());
        result = prime * result + ((getContent_pc_temp() == null) ? 0 : getContent_pc_temp().hashCode());
        result = prime * result + ((getContent_wap_temp() == null) ? 0 : getContent_wap_temp().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getTitle_type_hbapp() == null) ? 0 : getTitle_type_hbapp().hashCode());
        result = prime * result + ((getTitle_icon_hbapp() == null) ? 0 : getTitle_icon_hbapp().hashCode());
        result = prime * result + ((getTitle_pic_hbapp() == null) ? 0 : getTitle_pic_hbapp().hashCode());
        result = prime * result + ((getTitle_txt_hbapp() == null) ? 0 : getTitle_txt_hbapp().hashCode());
        result = prime * result + ((getContent_hbapp() == null) ? 0 : getContent_hbapp().hashCode());
        result = prime * result + ((getContent_hbapp_temp() == null) ? 0 : getContent_hbapp_temp().hashCode());
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
        sb.append(", db_sync_id=").append(db_sync_id);
        sb.append(", activity_title=").append(activity_title);
        sb.append(", sort=").append(sort);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", platform_name=").append(platform_name);
        sb.append(", status=").append(status);
        sb.append(", activity_enable=").append(activity_enable);
        sb.append(", title_type_wap=").append(title_type_wap);
        sb.append(", title_icon_wap=").append(title_icon_wap);
        sb.append(", title_pic_wap=").append(title_pic_wap);
        sb.append(", title_txt_wap=").append(title_txt_wap);
        sb.append(", title_type_pc=").append(title_type_pc);
        sb.append(", title_icon_pc=").append(title_icon_pc);
        sb.append(", title_pic_pc=").append(title_pic_pc);
        sb.append(", title_txt_pc=").append(title_txt_pc);
        sb.append(", content_pc=").append(content_pc);
        sb.append(", content_wap=").append(content_wap);
        sb.append(", activity_title_temp=").append(activity_title_temp);
        sb.append(", content_pc_temp=").append(content_pc_temp);
        sb.append(", content_wap_temp=").append(content_wap_temp);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", title_type_hbapp=").append(title_type_hbapp);
        sb.append(", title_icon_hbapp=").append(title_icon_hbapp);
        sb.append(", title_pic_hbapp=").append(title_pic_hbapp);
        sb.append(", title_txt_hbapp=").append(title_txt_hbapp);
        sb.append(", content_hbapp=").append(content_hbapp);
        sb.append(", content_hbapp_temp=").append(content_hbapp_temp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}