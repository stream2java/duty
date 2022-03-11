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
 * @TableName vas_maintain
 */
@TableName(value ="vas_maintain")
@Data
public class VasMaintain implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 后台维护开始时间
     */
    @TableField(value = "agent_start_time")
    private LocalDateTime agent_start_time;

    /**
     * 后台维护结束时间
     */
    @TableField(value = "agent_end_time")
    private LocalDateTime agent_end_time;

    /**
     * 前台维护开始时间
     */
    @TableField(value = "member_start_time")
    private LocalDateTime member_start_time;

    /**
     * 前台维护结束时间
     */
    @TableField(value = "member_end_time")
    private LocalDateTime member_end_time;

    /**
     * 维护原因
     */
    @TableField(value = "maintain_content")
    private String maintain_content;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 更新者
     */
    @TableField(value = "update_user")
    private String update_user;

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
        VasMaintain other = (VasMaintain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgent_start_time() == null ? other.getAgent_start_time() == null : this.getAgent_start_time().equals(other.getAgent_start_time()))
            && (this.getAgent_end_time() == null ? other.getAgent_end_time() == null : this.getAgent_end_time().equals(other.getAgent_end_time()))
            && (this.getMember_start_time() == null ? other.getMember_start_time() == null : this.getMember_start_time().equals(other.getMember_start_time()))
            && (this.getMember_end_time() == null ? other.getMember_end_time() == null : this.getMember_end_time().equals(other.getMember_end_time()))
            && (this.getMaintain_content() == null ? other.getMaintain_content() == null : this.getMaintain_content().equals(other.getMaintain_content()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgent_start_time() == null) ? 0 : getAgent_start_time().hashCode());
        result = prime * result + ((getAgent_end_time() == null) ? 0 : getAgent_end_time().hashCode());
        result = prime * result + ((getMember_start_time() == null) ? 0 : getMember_start_time().hashCode());
        result = prime * result + ((getMember_end_time() == null) ? 0 : getMember_end_time().hashCode());
        result = prime * result + ((getMaintain_content() == null) ? 0 : getMaintain_content().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", agent_start_time=").append(agent_start_time);
        sb.append(", agent_end_time=").append(agent_end_time);
        sb.append(", member_start_time=").append(member_start_time);
        sb.append(", member_end_time=").append(member_end_time);
        sb.append(", maintain_content=").append(maintain_content);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}