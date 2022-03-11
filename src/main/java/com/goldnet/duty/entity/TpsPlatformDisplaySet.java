package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 平台展示设定表
 * @TableName tps_platform_display_set
 */
@TableName(value ="tps_platform_display_set")
@Data
public class TpsPlatformDisplaySet implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 平台编码全称,如AGJL
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 别名，以便个别平台需要显示比较个性化的名字
     */
    @TableField(value = "alias")
    private String alias;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 0:只包含小类平台, 1:大类小类平台, 2:只包含大类平台, 3:只包含电子类和捕鱼类
     */
    @TableField(value = "group_id")
    private Object group_id;

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
     * 会员端显示开关 非1均為關閉
     */
    @TableField(value = "front_dis_status")
    private Object front_dis_status;

    /**
     * 代理端显示开关 非1均為關閉
     */
    @TableField(value = "agent_dis_status")
    private Object agent_dis_status;

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
        TpsPlatformDisplaySet other = (TpsPlatformDisplaySet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getGroup_id() == null ? other.getGroup_id() == null : this.getGroup_id().equals(other.getGroup_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getFront_dis_status() == null ? other.getFront_dis_status() == null : this.getFront_dis_status().equals(other.getFront_dis_status()))
            && (this.getAgent_dis_status() == null ? other.getAgent_dis_status() == null : this.getAgent_dis_status().equals(other.getAgent_dis_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getGroup_id() == null) ? 0 : getGroup_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getFront_dis_status() == null) ? 0 : getFront_dis_status().hashCode());
        result = prime * result + ((getAgent_dis_status() == null) ? 0 : getAgent_dis_status().hashCode());
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
        sb.append(", alias=").append(alias);
        sb.append(", sort=").append(sort);
        sb.append(", group_id=").append(group_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_user=").append(update_user);
        sb.append(", front_dis_status=").append(front_dis_status);
        sb.append(", agent_dis_status=").append(agent_dis_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}