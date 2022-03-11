package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * E盘赔率
 * @TableName ge_e_odds
 */
@TableName(value ="ge_e_odds")
@Data
public class GeEOdds implements Serializable {
    /**
     * uuid主键
     */
    @TableField(value = "odds_id")
    private Object odds_id;

    /**
     * 项目
     */
    @TableField(value = "project")
    private String project;

    /**
     * 赔率 如1.92
     */
    @TableField(value = "odds")
    private BigDecimal odds;

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
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 大盘ID
     */
    @TableField(value = "plate_id")
    private Object plate_id;

    /**
     * 类别ID
     */
    @TableField(value = "type_id")
    private Object type_id;

    /**
     * 
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 
     */
    @TableField(value = "plate_status")
    private String plate_status;

    /**
     * 台面id
     */
    @TableField(value = "desktop_id")
    private Object desktop_id;

    /**
     * 代理id
     */
    @TableField(value = "account_id")
    private Object account_id;

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
        GeEOdds other = (GeEOdds) that;
        return (this.getOdds_id() == null ? other.getOdds_id() == null : this.getOdds_id().equals(other.getOdds_id()))
            && (this.getProject() == null ? other.getProject() == null : this.getProject().equals(other.getProject()))
            && (this.getOdds() == null ? other.getOdds() == null : this.getOdds().equals(other.getOdds()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getPlate_id() == null ? other.getPlate_id() == null : this.getPlate_id().equals(other.getPlate_id()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getPlate_status() == null ? other.getPlate_status() == null : this.getPlate_status().equals(other.getPlate_status()))
            && (this.getDesktop_id() == null ? other.getDesktop_id() == null : this.getDesktop_id().equals(other.getDesktop_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOdds_id() == null) ? 0 : getOdds_id().hashCode());
        result = prime * result + ((getProject() == null) ? 0 : getProject().hashCode());
        result = prime * result + ((getOdds() == null) ? 0 : getOdds().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getPlate_id() == null) ? 0 : getPlate_id().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getPlate_status() == null) ? 0 : getPlate_status().hashCode());
        result = prime * result + ((getDesktop_id() == null) ? 0 : getDesktop_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", odds_id=").append(odds_id);
        sb.append(", project=").append(project);
        sb.append(", odds=").append(odds);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", plate_id=").append(plate_id);
        sb.append(", type_id=").append(type_id);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", plate_status=").append(plate_status);
        sb.append(", desktop_id=").append(desktop_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}