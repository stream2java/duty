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
 * @TableName sys_psw_blacklist
 */
@TableName(value ="sys_psw_blacklist")
@Data
public class SysPswBlacklist implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 密码黑名单
     */
    @TableField(value = "black_password")
    private String black_password;

    /**
     * 状态:0停用，1启用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 站点白名单
     */
    @TableField(value = "station_ids")
    private Object station_ids;

    /**
     * 更新者
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 删除时间
     */
    @TableField(value = "del_time")
    private LocalDateTime del_time;

    /**
     * 加密後密碼黑名單
     */
    @TableField(value = "en_black_password")
    private String en_black_password;

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
        SysPswBlacklist other = (SysPswBlacklist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBlack_password() == null ? other.getBlack_password() == null : this.getBlack_password().equals(other.getBlack_password()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStation_ids() == null ? other.getStation_ids() == null : this.getStation_ids().equals(other.getStation_ids()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDel_time() == null ? other.getDel_time() == null : this.getDel_time().equals(other.getDel_time()))
            && (this.getEn_black_password() == null ? other.getEn_black_password() == null : this.getEn_black_password().equals(other.getEn_black_password()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBlack_password() == null) ? 0 : getBlack_password().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStation_ids() == null) ? 0 : getStation_ids().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDel_time() == null) ? 0 : getDel_time().hashCode());
        result = prime * result + ((getEn_black_password() == null) ? 0 : getEn_black_password().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", black_password=").append(black_password);
        sb.append(", status=").append(status);
        sb.append(", station_ids=").append(station_ids);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", del_time=").append(del_time);
        sb.append(", en_black_password=").append(en_black_password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}