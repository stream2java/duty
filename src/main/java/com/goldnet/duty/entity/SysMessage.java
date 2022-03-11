package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 发送消息记录表【暂时没用】
 * @TableName sys_message
 */
@TableName(value ="sys_message")
@Data
public class SysMessage implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 会员id
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 公告名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 公告id
     */
    @TableField(value = "announcement_id")
    private Object announcement_id;

    /**
     * 发送方名称
     */
    @TableField(value = "sendname")
    private String sendname;

    /**
     * 公告内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 是否已读
     */
    @TableField(value = "isready")
    private String isready;

    /**
     * 开始时间
     */
    @TableField(value = "begin_time")
    private LocalDateTime begin_time;

    /**
     * 结束时间
     */
    @TableField(value = "end_time")
    private LocalDateTime end_time;

    /**
     * 备注
     */
    @TableField(value = "account")
    private String account;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

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
        SysMessage other = (SysMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAnnouncement_id() == null ? other.getAnnouncement_id() == null : this.getAnnouncement_id().equals(other.getAnnouncement_id()))
            && (this.getSendname() == null ? other.getSendname() == null : this.getSendname().equals(other.getSendname()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getIsready() == null ? other.getIsready() == null : this.getIsready().equals(other.getIsready()))
            && (this.getBegin_time() == null ? other.getBegin_time() == null : this.getBegin_time().equals(other.getBegin_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAnnouncement_id() == null) ? 0 : getAnnouncement_id().hashCode());
        result = prime * result + ((getSendname() == null) ? 0 : getSendname().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getIsready() == null) ? 0 : getIsready().hashCode());
        result = prime * result + ((getBegin_time() == null) ? 0 : getBegin_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", member_id=").append(member_id);
        sb.append(", name=").append(name);
        sb.append(", announcement_id=").append(announcement_id);
        sb.append(", sendname=").append(sendname);
        sb.append(", content=").append(content);
        sb.append(", isready=").append(isready);
        sb.append(", begin_time=").append(begin_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", account=").append(account);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}