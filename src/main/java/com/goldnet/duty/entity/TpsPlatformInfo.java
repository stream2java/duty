package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 平台基本信息表
 * @TableName tps_platform_info
 */
@TableName(value ="tps_platform_info")
@Data
public class TpsPlatformInfo implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 平台名称，如AG电子
     */
    @TableField(value = "platform_name")
    private String platform_name;

    /**
     * 平台编码全称,如AGJL
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 平台编码名称：如NMG对应新MG
     */
    @TableField(value = "code_name")
    private String code_name;

    /**
     * 对应platform_code的小写编码
     */
    @TableField(value = "lowercase_code")
    private String lowercase_code;

    /**
     * 所属大类编码，如AG
     */
    @TableField(value = "parent_platform_code")
    private String parent_platform_code;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 状态：0禁用，1启用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 游戏类型ID，如：电子，视讯等对应的ID。关联tps_game_type的主键ID
     */
    @TableField(value = "type_id")
    private Object type_id;

    /**
     * 父类型ID，大类对应的值为0
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 平台备注、描述
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 是否有jockpot标志，0表示没有，1表示有
     */
    @TableField(value = "jockpot")
    private Object jockpot;

    /**
     * 平台时区
     */
    @TableField(value = "utc")
    private Object utc;

    /**
     * 是否试玩，0表示不支持试玩，1表示支持PC试玩，2表示支持H5，3表示pc和H5都支持
     */
    @TableField(value = "freeplay")
    private Object freeplay;

    /**
     * 跳转类型，0加载游戏列表，1跳转接口loginapi，2跳转接口playgame
     */
    @TableField(value = "jump_type")
    private Object jump_type;

    /**
     * 跳转时用到的参数值，目前主要是跳转链接参数gameId使用
     */
    @TableField(value = "jump_param")
    private String jump_param;

    /**
     * 导入平台时区
     */
    @TableField(value = "import_utc")
    private Object import_utc;

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
        TpsPlatformInfo other = (TpsPlatformInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlatform_name() == null ? other.getPlatform_name() == null : this.getPlatform_name().equals(other.getPlatform_name()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getCode_name() == null ? other.getCode_name() == null : this.getCode_name().equals(other.getCode_name()))
            && (this.getLowercase_code() == null ? other.getLowercase_code() == null : this.getLowercase_code().equals(other.getLowercase_code()))
            && (this.getParent_platform_code() == null ? other.getParent_platform_code() == null : this.getParent_platform_code().equals(other.getParent_platform_code()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getJockpot() == null ? other.getJockpot() == null : this.getJockpot().equals(other.getJockpot()))
            && (this.getUtc() == null ? other.getUtc() == null : this.getUtc().equals(other.getUtc()))
            && (this.getFreeplay() == null ? other.getFreeplay() == null : this.getFreeplay().equals(other.getFreeplay()))
            && (this.getJump_type() == null ? other.getJump_type() == null : this.getJump_type().equals(other.getJump_type()))
            && (this.getJump_param() == null ? other.getJump_param() == null : this.getJump_param().equals(other.getJump_param()))
            && (this.getImport_utc() == null ? other.getImport_utc() == null : this.getImport_utc().equals(other.getImport_utc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlatform_name() == null) ? 0 : getPlatform_name().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getCode_name() == null) ? 0 : getCode_name().hashCode());
        result = prime * result + ((getLowercase_code() == null) ? 0 : getLowercase_code().hashCode());
        result = prime * result + ((getParent_platform_code() == null) ? 0 : getParent_platform_code().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getJockpot() == null) ? 0 : getJockpot().hashCode());
        result = prime * result + ((getUtc() == null) ? 0 : getUtc().hashCode());
        result = prime * result + ((getFreeplay() == null) ? 0 : getFreeplay().hashCode());
        result = prime * result + ((getJump_type() == null) ? 0 : getJump_type().hashCode());
        result = prime * result + ((getJump_param() == null) ? 0 : getJump_param().hashCode());
        result = prime * result + ((getImport_utc() == null) ? 0 : getImport_utc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platform_name=").append(platform_name);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", code_name=").append(code_name);
        sb.append(", lowercase_code=").append(lowercase_code);
        sb.append(", parent_platform_code=").append(parent_platform_code);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_user=").append(update_user);
        sb.append(", status=").append(status);
        sb.append(", type_id=").append(type_id);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", sort=").append(sort);
        sb.append(", remark=").append(remark);
        sb.append(", jockpot=").append(jockpot);
        sb.append(", utc=").append(utc);
        sb.append(", freeplay=").append(freeplay);
        sb.append(", jump_type=").append(jump_type);
        sb.append(", jump_param=").append(jump_param);
        sb.append(", import_utc=").append(import_utc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}