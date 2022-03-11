package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 合并表
 * @TableName ms_merge
 */
@TableName(value ="ms_merge")
@Data
public class MsMerge implements Serializable {
    /**
     * ID
     */
    @TableId(value = "merge_id")
    private Object merge_id;

    /**
     * 模板ID
     */
    @TableField(value = "template_id")
    private Object template_id;

    /**
     * 平台ID集合
     */
    @TableField(value = "game_ids")
    private Object game_ids;

    /**
     * 平台名称
     */
    @TableField(value = "game_name")
    private String game_name;

    /**
     * 平台类型集合
     */
    @TableField(value = "game_types")
    private String game_types;

    /**
     * 合并状态(0:没合并，1：有合并)
     */
    @TableField(value = "state")
    private String state;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_datetime")
    private LocalDateTime create_datetime;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_datetime")
    private LocalDateTime update_datetime;

    /**
     * 状态  0：可合并  1：不可合并
     */
    @TableField(value = "is_merge")
    private Object is_merge;

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
        MsMerge other = (MsMerge) that;
        return (this.getMerge_id() == null ? other.getMerge_id() == null : this.getMerge_id().equals(other.getMerge_id()))
            && (this.getTemplate_id() == null ? other.getTemplate_id() == null : this.getTemplate_id().equals(other.getTemplate_id()))
            && (this.getGame_ids() == null ? other.getGame_ids() == null : this.getGame_ids().equals(other.getGame_ids()))
            && (this.getGame_name() == null ? other.getGame_name() == null : this.getGame_name().equals(other.getGame_name()))
            && (this.getGame_types() == null ? other.getGame_types() == null : this.getGame_types().equals(other.getGame_types()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_datetime() == null ? other.getCreate_datetime() == null : this.getCreate_datetime().equals(other.getCreate_datetime()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_datetime() == null ? other.getUpdate_datetime() == null : this.getUpdate_datetime().equals(other.getUpdate_datetime()))
            && (this.getIs_merge() == null ? other.getIs_merge() == null : this.getIs_merge().equals(other.getIs_merge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMerge_id() == null) ? 0 : getMerge_id().hashCode());
        result = prime * result + ((getTemplate_id() == null) ? 0 : getTemplate_id().hashCode());
        result = prime * result + ((getGame_ids() == null) ? 0 : getGame_ids().hashCode());
        result = prime * result + ((getGame_name() == null) ? 0 : getGame_name().hashCode());
        result = prime * result + ((getGame_types() == null) ? 0 : getGame_types().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_datetime() == null) ? 0 : getCreate_datetime().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_datetime() == null) ? 0 : getUpdate_datetime().hashCode());
        result = prime * result + ((getIs_merge() == null) ? 0 : getIs_merge().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", merge_id=").append(merge_id);
        sb.append(", template_id=").append(template_id);
        sb.append(", game_ids=").append(game_ids);
        sb.append(", game_name=").append(game_name);
        sb.append(", game_types=").append(game_types);
        sb.append(", state=").append(state);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_datetime=").append(create_datetime);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_datetime=").append(update_datetime);
        sb.append(", is_merge=").append(is_merge);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}