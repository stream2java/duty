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
 * 
 * @TableName yuebao_station_setting
 */
@TableName(value ="yuebao_station_setting")
@Data
public class YuebaoStationSetting implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 站点ID
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 余额宝开启与关闭:1-开启;0-关闭
     */
    @TableField(value = "switch_flag")
    private Integer switch_flag;

    /**
     * 利率周期.默认24h
     */
    @TableField(value = "interest_cycle")
    private Object interest_cycle;

    /**
     * 利率
     */
    @TableField(value = "interest_rate")
    private BigDecimal interest_rate;

    /**
     * 附加利率
     */
    @TableField(value = "addition_interest_rate")
    private BigDecimal addition_interest_rate;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 新增人
     */
    @TableField(value = "create_account")
    private String create_account;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 更新人
     */
    @TableField(value = "update_account")
    private String update_account;

    /**
     * 层级选项
     */
    @TableField(value = "level_ids")
    private String level_ids;

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
        YuebaoStationSetting other = (YuebaoStationSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getSwitch_flag() == null ? other.getSwitch_flag() == null : this.getSwitch_flag().equals(other.getSwitch_flag()))
            && (this.getInterest_cycle() == null ? other.getInterest_cycle() == null : this.getInterest_cycle().equals(other.getInterest_cycle()))
            && (this.getInterest_rate() == null ? other.getInterest_rate() == null : this.getInterest_rate().equals(other.getInterest_rate()))
            && (this.getAddition_interest_rate() == null ? other.getAddition_interest_rate() == null : this.getAddition_interest_rate().equals(other.getAddition_interest_rate()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_account() == null ? other.getCreate_account() == null : this.getCreate_account().equals(other.getCreate_account()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_account() == null ? other.getUpdate_account() == null : this.getUpdate_account().equals(other.getUpdate_account()))
            && (this.getLevel_ids() == null ? other.getLevel_ids() == null : this.getLevel_ids().equals(other.getLevel_ids()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getSwitch_flag() == null) ? 0 : getSwitch_flag().hashCode());
        result = prime * result + ((getInterest_cycle() == null) ? 0 : getInterest_cycle().hashCode());
        result = prime * result + ((getInterest_rate() == null) ? 0 : getInterest_rate().hashCode());
        result = prime * result + ((getAddition_interest_rate() == null) ? 0 : getAddition_interest_rate().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_account() == null) ? 0 : getCreate_account().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_account() == null) ? 0 : getUpdate_account().hashCode());
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
        sb.append(", account1=").append(account1);
        sb.append(", station_id=").append(station_id);
        sb.append(", switch_flag=").append(switch_flag);
        sb.append(", interest_cycle=").append(interest_cycle);
        sb.append(", interest_rate=").append(interest_rate);
        sb.append(", addition_interest_rate=").append(addition_interest_rate);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_account=").append(create_account);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_account=").append(update_account);
        sb.append(", level_ids=").append(level_ids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}