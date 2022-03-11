package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 发送记录表
 * @TableName sys_send_record
 */
@TableName(value ="sys_send_record")
@Data
public class SysSendRecord implements Serializable {
    /**
     * 发送记录id
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 讯息id

     */
    @TableField(value = "message_id")
    private Object message_id;

    /**
     * 发送目标层级
     */
    @TableField(value = "target_level")
    private Object target_level;

    /**
     * 接收者层级
     */
    @TableField(value = "recevier")
    private Object recevier;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 账号id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 大大股东id
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 讯息类型: 0一般讯息1特殊讯息,99表示历史数据，上线时无需同步
     */
    @TableField(value = "message_type")
    private Object message_type;

    /**
     * 发送人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 会员的层级ID
     */
    @TableField(value = "level_id")
    private Object level_id;

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
        SysSendRecord other = (SysSendRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMessage_id() == null ? other.getMessage_id() == null : this.getMessage_id().equals(other.getMessage_id()))
            && (this.getTarget_level() == null ? other.getTarget_level() == null : this.getTarget_level().equals(other.getTarget_level()))
            && (this.getRecevier() == null ? other.getRecevier() == null : this.getRecevier().equals(other.getRecevier()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getMessage_type() == null ? other.getMessage_type() == null : this.getMessage_type().equals(other.getMessage_type()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getLevel_id() == null ? other.getLevel_id() == null : this.getLevel_id().equals(other.getLevel_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMessage_id() == null) ? 0 : getMessage_id().hashCode());
        result = prime * result + ((getTarget_level() == null) ? 0 : getTarget_level().hashCode());
        result = prime * result + ((getRecevier() == null) ? 0 : getRecevier().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getMessage_type() == null) ? 0 : getMessage_type().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getLevel_id() == null) ? 0 : getLevel_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", message_id=").append(message_id);
        sb.append(", target_level=").append(target_level);
        sb.append(", recevier=").append(recevier);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", account_id=").append(account_id);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", message_type=").append(message_type);
        sb.append(", create_user=").append(create_user);
        sb.append(", level_id=").append(level_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}