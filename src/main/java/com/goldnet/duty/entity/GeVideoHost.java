package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 视讯类服务器及台面表
 * @TableName ge_video_host
 */
@TableName(value ="ge_video_host")
@Data
public class GeVideoHost implements Serializable {
    /**
     * 自增主键
     */
    @TableId(value = "host_id")
    private Object host_id;

    /**
     * 主机名/台面名
     */
    @TableField(value = "host_name")
    private String host_name;

    /**
     * 主机标识/台面标识
     */
    @TableField(value = "host_tag")
    private String host_tag;

    /**
     * 主机连接密码/台面连接密码
     */
    @TableField(value = "host_password")
    private String host_password;

    /**
     * 服务端ip/台面ip
     */
    @TableField(value = "host_ip")
    private String host_ip;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDate create_date_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_date_tiem")
    private LocalDate update_date_tiem;

    /**
     * 最后连接时间
     */
    @TableField(value = "last_connect_time")
    private LocalDate last_connect_time;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 是否启用0禁1启
     */
    @TableField(value = "is_enable")
    private Object is_enable;

    /**
     * 所属父id，1级为0
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 所属视讯游戏类别
     */
    @TableField(value = "game_type_id")
    private Object game_type_id;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改者
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 是否正在连接
     */
    @TableField(value = "is_connect")
    private Object is_connect;

    /**
     * 
     */
    @TableField(value = "type")
    private Object type;

    /**
     * 端口
     */
    @TableField(value = "port")
    private String port;

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
        GeVideoHost other = (GeVideoHost) that;
        return (this.getHost_id() == null ? other.getHost_id() == null : this.getHost_id().equals(other.getHost_id()))
            && (this.getHost_name() == null ? other.getHost_name() == null : this.getHost_name().equals(other.getHost_name()))
            && (this.getHost_tag() == null ? other.getHost_tag() == null : this.getHost_tag().equals(other.getHost_tag()))
            && (this.getHost_password() == null ? other.getHost_password() == null : this.getHost_password().equals(other.getHost_password()))
            && (this.getHost_ip() == null ? other.getHost_ip() == null : this.getHost_ip().equals(other.getHost_ip()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_date_tiem() == null ? other.getUpdate_date_tiem() == null : this.getUpdate_date_tiem().equals(other.getUpdate_date_tiem()))
            && (this.getLast_connect_time() == null ? other.getLast_connect_time() == null : this.getLast_connect_time().equals(other.getLast_connect_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getIs_enable() == null ? other.getIs_enable() == null : this.getIs_enable().equals(other.getIs_enable()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getGame_type_id() == null ? other.getGame_type_id() == null : this.getGame_type_id().equals(other.getGame_type_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getIs_connect() == null ? other.getIs_connect() == null : this.getIs_connect().equals(other.getIs_connect()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost_id() == null) ? 0 : getHost_id().hashCode());
        result = prime * result + ((getHost_name() == null) ? 0 : getHost_name().hashCode());
        result = prime * result + ((getHost_tag() == null) ? 0 : getHost_tag().hashCode());
        result = prime * result + ((getHost_password() == null) ? 0 : getHost_password().hashCode());
        result = prime * result + ((getHost_ip() == null) ? 0 : getHost_ip().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_date_tiem() == null) ? 0 : getUpdate_date_tiem().hashCode());
        result = prime * result + ((getLast_connect_time() == null) ? 0 : getLast_connect_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getIs_enable() == null) ? 0 : getIs_enable().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getGame_type_id() == null) ? 0 : getGame_type_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getIs_connect() == null) ? 0 : getIs_connect().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host_id=").append(host_id);
        sb.append(", host_name=").append(host_name);
        sb.append(", host_tag=").append(host_tag);
        sb.append(", host_password=").append(host_password);
        sb.append(", host_ip=").append(host_ip);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_date_tiem=").append(update_date_tiem);
        sb.append(", last_connect_time=").append(last_connect_time);
        sb.append(", remark=").append(remark);
        sb.append(", is_enable=").append(is_enable);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", game_type_id=").append(game_type_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_user=").append(update_user);
        sb.append(", is_connect=").append(is_connect);
        sb.append(", type=").append(type);
        sb.append(", port=").append(port);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}