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
 * @TableName app_jpush_message
 */
@TableName(value ="app_jpush_message")
@Data
public class AppJpushMessage implements Serializable {
    /**
     * 主键ID，唯一标识
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 厅主id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 极光推送返回的id
     */
    @TableField(value = "jpush_message_id")
    private String jpush_message_id;

    /**
     * 发送时间
     */
    @TableField(value = "send_time")
    private LocalDateTime send_time;

    /**
     * 状态：0:成功；1:失败
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 目标人群   1:广播所有人;2:设备标签;3:会员（最多 1000 个）
     */
    @TableField(value = "target")
    private Object target;

    /**
     * 发送选择的标签
     */
    @TableField(value = "tags")
    private Object tags;

    /**
     * 发送的平台   0:所有；1:Android；2:IOS
     */
    @TableField(value = "platform")
    private Object platform;

    /**
     * 离线消息保留时长,默认3600秒
     */
    @TableField(value = "live_time")
    private Object live_time;

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
        AppJpushMessage other = (AppJpushMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getJpush_message_id() == null ? other.getJpush_message_id() == null : this.getJpush_message_id().equals(other.getJpush_message_id()))
            && (this.getSend_time() == null ? other.getSend_time() == null : this.getSend_time().equals(other.getSend_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTarget() == null ? other.getTarget() == null : this.getTarget().equals(other.getTarget()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getLive_time() == null ? other.getLive_time() == null : this.getLive_time().equals(other.getLive_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getJpush_message_id() == null) ? 0 : getJpush_message_id().hashCode());
        result = prime * result + ((getSend_time() == null) ? 0 : getSend_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTarget() == null) ? 0 : getTarget().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getLive_time() == null) ? 0 : getLive_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", title=").append(title);
        sb.append(", account1=").append(account1);
        sb.append(", jpush_message_id=").append(jpush_message_id);
        sb.append(", send_time=").append(send_time);
        sb.append(", status=").append(status);
        sb.append(", target=").append(target);
        sb.append(", tags=").append(tags);
        sb.append(", platform=").append(platform);
        sb.append(", live_time=").append(live_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}