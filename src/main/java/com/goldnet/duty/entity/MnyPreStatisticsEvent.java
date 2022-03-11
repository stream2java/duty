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
 * @TableName mny_pre_statistics_event
 */
@TableName(value ="mny_pre_statistics_event")
@Data
public class MnyPreStatisticsEvent implements Serializable {
    /**
     * 优惠统计事件表id
     */
    @TableId(value = "event_id")
    private Object event_id;

    /**
     * 优惠统计事件编号
     */
    @TableField(value = "event_no")
    private String event_no;

    /**
     * 事件
     */
    @TableField(value = "event_details")
    private String event_details;

    /**
     * 币别
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 返水时间（起）
     */
    @TableField(value = "return_time_from")
    private LocalDateTime return_time_from;

    /**
     * 返水时间（迄）
     */
    @TableField(value = "return_time_end")
    private LocalDateTime return_time_end;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改者
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 大大股东
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "eventuuid")
    private String eventuuid;

    /**
     * 返水优惠群组名称
     */
    @TableField(value = "set_type_name")
    private String set_type_name;

    /**
     * 返水会员数量
     */
    @TableField(value = "count_member")
    private Object count_member;

    /**
     * 返水优惠群组名称
     */
    @TableField(value = "count_money")
    private BigDecimal count_money;

    /**
     * 未返水会员数量
     */
    @TableField(value = "undealed_count_member")
    private Object undealed_count_member;

    /**
     * 未返水会员总金额
     */
    @TableField(value = "undealed_count_money")
    private BigDecimal undealed_count_money;

    /**
     * 用于生成返水事件，群组对应的稽核倍数
     */
    @TableField(value = "check_num")
    private Object check_num;

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
        MnyPreStatisticsEvent other = (MnyPreStatisticsEvent) that;
        return (this.getEvent_id() == null ? other.getEvent_id() == null : this.getEvent_id().equals(other.getEvent_id()))
            && (this.getEvent_no() == null ? other.getEvent_no() == null : this.getEvent_no().equals(other.getEvent_no()))
            && (this.getEvent_details() == null ? other.getEvent_details() == null : this.getEvent_details().equals(other.getEvent_details()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getReturn_time_from() == null ? other.getReturn_time_from() == null : this.getReturn_time_from().equals(other.getReturn_time_from()))
            && (this.getReturn_time_end() == null ? other.getReturn_time_end() == null : this.getReturn_time_end().equals(other.getReturn_time_end()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getEventuuid() == null ? other.getEventuuid() == null : this.getEventuuid().equals(other.getEventuuid()))
            && (this.getSet_type_name() == null ? other.getSet_type_name() == null : this.getSet_type_name().equals(other.getSet_type_name()))
            && (this.getCount_member() == null ? other.getCount_member() == null : this.getCount_member().equals(other.getCount_member()))
            && (this.getCount_money() == null ? other.getCount_money() == null : this.getCount_money().equals(other.getCount_money()))
            && (this.getUndealed_count_member() == null ? other.getUndealed_count_member() == null : this.getUndealed_count_member().equals(other.getUndealed_count_member()))
            && (this.getUndealed_count_money() == null ? other.getUndealed_count_money() == null : this.getUndealed_count_money().equals(other.getUndealed_count_money()))
            && (this.getCheck_num() == null ? other.getCheck_num() == null : this.getCheck_num().equals(other.getCheck_num()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEvent_id() == null) ? 0 : getEvent_id().hashCode());
        result = prime * result + ((getEvent_no() == null) ? 0 : getEvent_no().hashCode());
        result = prime * result + ((getEvent_details() == null) ? 0 : getEvent_details().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getReturn_time_from() == null) ? 0 : getReturn_time_from().hashCode());
        result = prime * result + ((getReturn_time_end() == null) ? 0 : getReturn_time_end().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getEventuuid() == null) ? 0 : getEventuuid().hashCode());
        result = prime * result + ((getSet_type_name() == null) ? 0 : getSet_type_name().hashCode());
        result = prime * result + ((getCount_member() == null) ? 0 : getCount_member().hashCode());
        result = prime * result + ((getCount_money() == null) ? 0 : getCount_money().hashCode());
        result = prime * result + ((getUndealed_count_member() == null) ? 0 : getUndealed_count_member().hashCode());
        result = prime * result + ((getUndealed_count_money() == null) ? 0 : getUndealed_count_money().hashCode());
        result = prime * result + ((getCheck_num() == null) ? 0 : getCheck_num().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", event_id=").append(event_id);
        sb.append(", event_no=").append(event_no);
        sb.append(", event_details=").append(event_details);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", return_time_from=").append(return_time_from);
        sb.append(", return_time_end=").append(return_time_end);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", eventuuid=").append(eventuuid);
        sb.append(", set_type_name=").append(set_type_name);
        sb.append(", count_member=").append(count_member);
        sb.append(", count_money=").append(count_money);
        sb.append(", undealed_count_member=").append(undealed_count_member);
        sb.append(", undealed_count_money=").append(undealed_count_money);
        sb.append(", check_num=").append(check_num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}