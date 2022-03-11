package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 所有公告【总控的公告管理：包含一般公告、系统公告、维护公告、推广公告】
 * @TableName sys_announcement
 */
@TableName(value ="sys_announcement")
@Data
public class SysAnnouncement implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 公告名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 公告内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 状态0庄家发送1是大大股东
     */
    @TableField(value = "status")
    private String status;

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
     * 类别0一般游戏公告1系统游戏公告2推广游戏公告3维护公告4代理商5会员
     */
    @TableField(value = "type")
    private String type;

    /**
     * 发送方id
     */
    @TableField(value = "send_id")
    private Object send_id;

    /**
     * 接受者id
     */
    @TableField(value = "account")
    private String account;

    /**
     * 游戏种类ID 1体育 2 彩票  3 视讯 4电子
     */
    @TableField(value = "category_id")
    private Object category_id;

    /**
     * 台面Id
     */
    @TableField(value = "host_id")
    private Object host_id;

    /**
     * 大大股东Id
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

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
        SysAnnouncement other = (SysAnnouncement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBegin_time() == null ? other.getBegin_time() == null : this.getBegin_time().equals(other.getBegin_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSend_id() == null ? other.getSend_id() == null : this.getSend_id().equals(other.getSend_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getHost_id() == null ? other.getHost_id() == null : this.getHost_id().equals(other.getHost_id()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBegin_time() == null) ? 0 : getBegin_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSend_id() == null) ? 0 : getSend_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getHost_id() == null) ? 0 : getHost_id().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", content=").append(content);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", begin_time=").append(begin_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", type=").append(type);
        sb.append(", send_id=").append(send_id);
        sb.append(", account=").append(account);
        sb.append(", category_id=").append(category_id);
        sb.append(", host_id=").append(host_id);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}