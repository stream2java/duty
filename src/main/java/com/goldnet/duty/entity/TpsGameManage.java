package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 游戏分类管理基础表
 * @TableName tps_game_manage
 */
@TableName(value ="tps_game_manage")
@Data
public class TpsGameManage implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 分类名称
     */
    @TableField(value = "category_name")
    private String category_name;

    /**
     * 分类编码
     */
    @TableField(value = "category_code")
    private String category_code;

    /**
     * 父级编码，顶级为NULL
     */
    @TableField(value = "parent_code")
    private String parent_code;

    /**
     * 父类id，顶级为0，层级关系以此字段为准
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 分类级别,1,2,3
     */
    @TableField(value = "category_level")
    private Integer category_level;

    /**
     * 排序，越小越排前正整数
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 是否显示下级，作用于前端展示，0：不显示，1：显示
     */
    @TableField(value = "show_child")
    private Integer show_child;

    /**
     * 分类图标地址
     */
    @TableField(value = "category_img_url")
    private String category_img_url;

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
        TpsGameManage other = (TpsGameManage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCategory_name() == null ? other.getCategory_name() == null : this.getCategory_name().equals(other.getCategory_name()))
            && (this.getCategory_code() == null ? other.getCategory_code() == null : this.getCategory_code().equals(other.getCategory_code()))
            && (this.getParent_code() == null ? other.getParent_code() == null : this.getParent_code().equals(other.getParent_code()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getCategory_level() == null ? other.getCategory_level() == null : this.getCategory_level().equals(other.getCategory_level()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getShow_child() == null ? other.getShow_child() == null : this.getShow_child().equals(other.getShow_child()))
            && (this.getCategory_img_url() == null ? other.getCategory_img_url() == null : this.getCategory_img_url().equals(other.getCategory_img_url()))
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
        result = prime * result + ((getCategory_name() == null) ? 0 : getCategory_name().hashCode());
        result = prime * result + ((getCategory_code() == null) ? 0 : getCategory_code().hashCode());
        result = prime * result + ((getParent_code() == null) ? 0 : getParent_code().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getCategory_level() == null) ? 0 : getCategory_level().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getShow_child() == null) ? 0 : getShow_child().hashCode());
        result = prime * result + ((getCategory_img_url() == null) ? 0 : getCategory_img_url().hashCode());
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
        sb.append(", category_name=").append(category_name);
        sb.append(", category_code=").append(category_code);
        sb.append(", parent_code=").append(parent_code);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", category_level=").append(category_level);
        sb.append(", sort=").append(sort);
        sb.append(", show_child=").append(show_child);
        sb.append(", category_img_url=").append(category_img_url);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}