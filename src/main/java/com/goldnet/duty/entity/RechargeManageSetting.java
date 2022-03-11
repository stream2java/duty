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
 * @TableName recharge_manage_setting
 */
@TableName(value ="recharge_manage_setting")
@Data
public class RechargeManageSetting implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 充值类型
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "order_index")
    private Object order_index;

    /**
     * 按钮角标  0：无 1：快 2：安 3：稳 4：热 5：火 6：大
     */
    @TableField(value = "corner_mark")
    private Object corner_mark;

    /**
     * 
     */
    @TableField(value = "picture_address")
    private String picture_address;

    /**
     * 
     */
    @TableField(value = "stockholderid")
    private Object stockholderid;

    /**
     * 
     */
    @TableField(value = "recharge_type_id")
    private Object recharge_type_id;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 网址（自定义支付）
     */
    @TableField(value = "website")
    private String website;

    /**
     * 协议：http://，https://
     */
    @TableField(value = "protocol")
    private String protocol;

    /**
     * 厅主层级id
     */
    @TableField(value = "level_ids")
    private Object level_ids;

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
        RechargeManageSetting other = (RechargeManageSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOrder_index() == null ? other.getOrder_index() == null : this.getOrder_index().equals(other.getOrder_index()))
            && (this.getCorner_mark() == null ? other.getCorner_mark() == null : this.getCorner_mark().equals(other.getCorner_mark()))
            && (this.getPicture_address() == null ? other.getPicture_address() == null : this.getPicture_address().equals(other.getPicture_address()))
            && (this.getStockholderid() == null ? other.getStockholderid() == null : this.getStockholderid().equals(other.getStockholderid()))
            && (this.getRecharge_type_id() == null ? other.getRecharge_type_id() == null : this.getRecharge_type_id().equals(other.getRecharge_type_id()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()))
            && (this.getProtocol() == null ? other.getProtocol() == null : this.getProtocol().equals(other.getProtocol()))
            && (this.getLevel_ids() == null ? other.getLevel_ids() == null : this.getLevel_ids().equals(other.getLevel_ids()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOrder_index() == null) ? 0 : getOrder_index().hashCode());
        result = prime * result + ((getCorner_mark() == null) ? 0 : getCorner_mark().hashCode());
        result = prime * result + ((getPicture_address() == null) ? 0 : getPicture_address().hashCode());
        result = prime * result + ((getStockholderid() == null) ? 0 : getStockholderid().hashCode());
        result = prime * result + ((getRecharge_type_id() == null) ? 0 : getRecharge_type_id().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        result = prime * result + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        result = prime * result + ((getLevel_ids() == null) ? 0 : getLevel_ids().hashCode());
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
        sb.append(", order_index=").append(order_index);
        sb.append(", corner_mark=").append(corner_mark);
        sb.append(", picture_address=").append(picture_address);
        sb.append(", stockholderid=").append(stockholderid);
        sb.append(", recharge_type_id=").append(recharge_type_id);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", website=").append(website);
        sb.append(", protocol=").append(protocol);
        sb.append(", level_ids=").append(level_ids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}