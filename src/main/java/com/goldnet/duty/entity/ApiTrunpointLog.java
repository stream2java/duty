package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 额度转换流程记录
 * @TableName api_trunpoint_log
 */
@TableName(value ="api_trunpoint_log")
@Data
public class ApiTrunpointLog implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 操作者Id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 额度转换流程id
     */
    @TableField(value = "trunpoint_id")
    private Object trunpoint_id;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 流程步骤1:请求 确认,2:请求确认失败,3:请求确认成功,4:重新请求失败,5:重新请求成功
     */
    @TableField(value = "flow")
    private Object flow;

    /**
     * 操作人
     */
    @TableField(value = "create_user")
    private String create_user;

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
        ApiTrunpointLog other = (ApiTrunpointLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getTrunpoint_id() == null ? other.getTrunpoint_id() == null : this.getTrunpoint_id().equals(other.getTrunpoint_id()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getFlow() == null ? other.getFlow() == null : this.getFlow().equals(other.getFlow()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getTrunpoint_id() == null) ? 0 : getTrunpoint_id().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getFlow() == null) ? 0 : getFlow().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account_id=").append(account_id);
        sb.append(", trunpoint_id=").append(trunpoint_id);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", remark=").append(remark);
        sb.append(", flow=").append(flow);
        sb.append(", create_user=").append(create_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}