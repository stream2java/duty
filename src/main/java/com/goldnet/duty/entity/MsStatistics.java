package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 统计表
 * @TableName ms_statistics
 */
@TableName(value ="ms_statistics")
@Data
public class MsStatistics implements Serializable {
    /**
     * ID
     */
    @TableId(value = "archive_id")
    private Object archive_id;

    /**
     * 站点编号
     */
    @TableField(value = "station_durl")
    private String station_durl;

    /**
     * 站点名称
     */
    @TableField(value = "station_name")
    private String station_name;

    /**
     * 模板名称
     */
    @TableField(value = "template_name")
    private String template_name;

    /**
     * 实应收
     */
    @TableField(value = "total_receivables")
    private BigDecimal total_receivables;

    /**
     * 损益
     */
    @TableField(value = "total_profit_loss")
    private BigDecimal total_profit_loss;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_datetime")
    private LocalDateTime create_datetime;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_datetime")
    private LocalDateTime update_datetime;

    /**
     * 期数ID
     */
    @TableField(value = "period_id")
    private Object period_id;

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
     * 期数开始时间
     */
    @TableField(value = "begin_date")
    private LocalDate begin_date;

    /**
     * 期数结束时间
     */
    @TableField(value = "end_date")
    private LocalDate end_date;

    /**
     * 期数名称
     */
    @TableField(value = "period_name")
    private String period_name;

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
        MsStatistics other = (MsStatistics) that;
        return (this.getArchive_id() == null ? other.getArchive_id() == null : this.getArchive_id().equals(other.getArchive_id()))
            && (this.getStation_durl() == null ? other.getStation_durl() == null : this.getStation_durl().equals(other.getStation_durl()))
            && (this.getStation_name() == null ? other.getStation_name() == null : this.getStation_name().equals(other.getStation_name()))
            && (this.getTemplate_name() == null ? other.getTemplate_name() == null : this.getTemplate_name().equals(other.getTemplate_name()))
            && (this.getTotal_receivables() == null ? other.getTotal_receivables() == null : this.getTotal_receivables().equals(other.getTotal_receivables()))
            && (this.getTotal_profit_loss() == null ? other.getTotal_profit_loss() == null : this.getTotal_profit_loss().equals(other.getTotal_profit_loss()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_datetime() == null ? other.getCreate_datetime() == null : this.getCreate_datetime().equals(other.getCreate_datetime()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_datetime() == null ? other.getUpdate_datetime() == null : this.getUpdate_datetime().equals(other.getUpdate_datetime()))
            && (this.getPeriod_id() == null ? other.getPeriod_id() == null : this.getPeriod_id().equals(other.getPeriod_id()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getBegin_date() == null ? other.getBegin_date() == null : this.getBegin_date().equals(other.getBegin_date()))
            && (this.getEnd_date() == null ? other.getEnd_date() == null : this.getEnd_date().equals(other.getEnd_date()))
            && (this.getPeriod_name() == null ? other.getPeriod_name() == null : this.getPeriod_name().equals(other.getPeriod_name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArchive_id() == null) ? 0 : getArchive_id().hashCode());
        result = prime * result + ((getStation_durl() == null) ? 0 : getStation_durl().hashCode());
        result = prime * result + ((getStation_name() == null) ? 0 : getStation_name().hashCode());
        result = prime * result + ((getTemplate_name() == null) ? 0 : getTemplate_name().hashCode());
        result = prime * result + ((getTotal_receivables() == null) ? 0 : getTotal_receivables().hashCode());
        result = prime * result + ((getTotal_profit_loss() == null) ? 0 : getTotal_profit_loss().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_datetime() == null) ? 0 : getCreate_datetime().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_datetime() == null) ? 0 : getUpdate_datetime().hashCode());
        result = prime * result + ((getPeriod_id() == null) ? 0 : getPeriod_id().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getBegin_date() == null) ? 0 : getBegin_date().hashCode());
        result = prime * result + ((getEnd_date() == null) ? 0 : getEnd_date().hashCode());
        result = prime * result + ((getPeriod_name() == null) ? 0 : getPeriod_name().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", archive_id=").append(archive_id);
        sb.append(", station_durl=").append(station_durl);
        sb.append(", station_name=").append(station_name);
        sb.append(", template_name=").append(template_name);
        sb.append(", total_receivables=").append(total_receivables);
        sb.append(", total_profit_loss=").append(total_profit_loss);
        sb.append(", remark=").append(remark);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_datetime=").append(create_datetime);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_datetime=").append(update_datetime);
        sb.append(", period_id=").append(period_id);
        sb.append(", account1=").append(account1);
        sb.append(", station_id=").append(station_id);
        sb.append(", begin_date=").append(begin_date);
        sb.append(", end_date=").append(end_date);
        sb.append(", period_name=").append(period_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}