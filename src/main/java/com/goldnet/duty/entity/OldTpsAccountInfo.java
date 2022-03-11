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
 * @TableName old_tps_account_info
 */
@TableName(value ="old_tps_account_info")
@Data
public class OldTpsAccountInfo implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 站点id
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 厅主id
     */
    @TableField(value = "account_id1")
    private Object account_id1;

    /**
     * 第三方平台类型
     */
    @TableField(value = "platform")
    private String platform;

    /**
     * 第三方代理账号
     */
    @TableField(value = "partner")
    private String partner;

    /**
     * 密匙（彩票和体育用到）
     */
    @TableField(value = "sign")
    private String sign;

    /**
     * 站点标识（体育和彩票用到）
     */
    @TableField(value = "web_site")
    private String web_site;

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
     * 跳转域名ID
     */
    @TableField(value = "domain_id")
    private Object domain_id;

    /**
     * 会员端平台是否开启 1：开启   0：关闭
     */
    @TableField(value = "member_open")
    private Object member_open;

    /**
     * 代理端平台是否开启 1：开启   0：关闭
     */
    @TableField(value = "agent_open")
    private Object agent_open;

    /**
     * 会员端排序
     */
    @TableField(value = "order_in_member")
    private Object order_in_member;

    /**
     * 会员端显示名称
     */
    @TableField(value = "name_in_member")
    private String name_in_member;

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
        OldTpsAccountInfo other = (OldTpsAccountInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getAccount_id1() == null ? other.getAccount_id1() == null : this.getAccount_id1().equals(other.getAccount_id1()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getPartner() == null ? other.getPartner() == null : this.getPartner().equals(other.getPartner()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getWeb_site() == null ? other.getWeb_site() == null : this.getWeb_site().equals(other.getWeb_site()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDomain_id() == null ? other.getDomain_id() == null : this.getDomain_id().equals(other.getDomain_id()))
            && (this.getMember_open() == null ? other.getMember_open() == null : this.getMember_open().equals(other.getMember_open()))
            && (this.getAgent_open() == null ? other.getAgent_open() == null : this.getAgent_open().equals(other.getAgent_open()))
            && (this.getOrder_in_member() == null ? other.getOrder_in_member() == null : this.getOrder_in_member().equals(other.getOrder_in_member()))
            && (this.getName_in_member() == null ? other.getName_in_member() == null : this.getName_in_member().equals(other.getName_in_member()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getAccount_id1() == null) ? 0 : getAccount_id1().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getPartner() == null) ? 0 : getPartner().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getWeb_site() == null) ? 0 : getWeb_site().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDomain_id() == null) ? 0 : getDomain_id().hashCode());
        result = prime * result + ((getMember_open() == null) ? 0 : getMember_open().hashCode());
        result = prime * result + ((getAgent_open() == null) ? 0 : getAgent_open().hashCode());
        result = prime * result + ((getOrder_in_member() == null) ? 0 : getOrder_in_member().hashCode());
        result = prime * result + ((getName_in_member() == null) ? 0 : getName_in_member().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", station_id=").append(station_id);
        sb.append(", account_id1=").append(account_id1);
        sb.append(", platform=").append(platform);
        sb.append(", partner=").append(partner);
        sb.append(", sign=").append(sign);
        sb.append(", web_site=").append(web_site);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", domain_id=").append(domain_id);
        sb.append(", member_open=").append(member_open);
        sb.append(", agent_open=").append(agent_open);
        sb.append(", order_in_member=").append(order_in_member);
        sb.append(", name_in_member=").append(name_in_member);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}