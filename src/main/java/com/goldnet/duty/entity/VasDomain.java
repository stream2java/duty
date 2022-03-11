package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 加值服务域名表
 * @TableName vas_domain
 */
@TableName(value ="vas_domain")
@Data
public class VasDomain implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 域名
     */
    @TableField(value = "domain_url")
    private String domain_url;

    /**
     * 状态 1启用,0禁用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 主域名 1:是,0:否
     */
    @TableField(value = "master")
    private Object master;

    /**
     * 1:加值平台总控,2:加值平台后台,3:加值平台前端,4:厅主提供域名(前端)
     */
    @TableField(value = "action_scope")
    private Object action_scope;

    /**
     * 此域名对应的所有站点编号 ,隔开
     */
    @TableField(value = "folder")
    private String folder;

    /**
     * 同步状态 0:需同步 1:已同步 null:此域名未作修改无需同步
     */
    @TableField(value = "sync_status")
    private Object sync_status;

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
        VasDomain other = (VasDomain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDomain_url() == null ? other.getDomain_url() == null : this.getDomain_url().equals(other.getDomain_url()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMaster() == null ? other.getMaster() == null : this.getMaster().equals(other.getMaster()))
            && (this.getAction_scope() == null ? other.getAction_scope() == null : this.getAction_scope().equals(other.getAction_scope()))
            && (this.getFolder() == null ? other.getFolder() == null : this.getFolder().equals(other.getFolder()))
            && (this.getSync_status() == null ? other.getSync_status() == null : this.getSync_status().equals(other.getSync_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDomain_url() == null) ? 0 : getDomain_url().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMaster() == null) ? 0 : getMaster().hashCode());
        result = prime * result + ((getAction_scope() == null) ? 0 : getAction_scope().hashCode());
        result = prime * result + ((getFolder() == null) ? 0 : getFolder().hashCode());
        result = prime * result + ((getSync_status() == null) ? 0 : getSync_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", domain_url=").append(domain_url);
        sb.append(", status=").append(status);
        sb.append(", master=").append(master);
        sb.append(", action_scope=").append(action_scope);
        sb.append(", folder=").append(folder);
        sb.append(", sync_status=").append(sync_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}