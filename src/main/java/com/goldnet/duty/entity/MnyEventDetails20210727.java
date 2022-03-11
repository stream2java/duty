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
 * @TableName mny_event_details_20210727
 */
@TableName(value ="mny_event_details_20210727")
@Data
public class MnyEventDetails20210727 implements Serializable {
    /**
     * 
     */
    @TableField(value = "details_id")
    private Object details_id;

    /**
     * 
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "backdrop_state")
    private String backdrop_state;

    /**
     * 
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "event_id")
    private Object event_id;

    /**
     * 
     */
    @TableField(value = "eventuuid")
    private String eventuuid;

    /**
     * 
     */
    @TableField(value = "count_money")
    private BigDecimal count_money;

    /**
     * 
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 
     */
    @TableField(value = "pre_realtime_record_ids")
    private Long pre_realtime_record_ids;

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
        MnyEventDetails20210727 other = (MnyEventDetails20210727) that;
        return (this.getDetails_id() == null ? other.getDetails_id() == null : this.getDetails_id().equals(other.getDetails_id()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getBackdrop_state() == null ? other.getBackdrop_state() == null : this.getBackdrop_state().equals(other.getBackdrop_state()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getEvent_id() == null ? other.getEvent_id() == null : this.getEvent_id().equals(other.getEvent_id()))
            && (this.getEventuuid() == null ? other.getEventuuid() == null : this.getEventuuid().equals(other.getEventuuid()))
            && (this.getCount_money() == null ? other.getCount_money() == null : this.getCount_money().equals(other.getCount_money()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPre_realtime_record_ids() == null ? other.getPre_realtime_record_ids() == null : this.getPre_realtime_record_ids().equals(other.getPre_realtime_record_ids()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetails_id() == null) ? 0 : getDetails_id().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getBackdrop_state() == null) ? 0 : getBackdrop_state().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getEvent_id() == null) ? 0 : getEvent_id().hashCode());
        result = prime * result + ((getEventuuid() == null) ? 0 : getEventuuid().hashCode());
        result = prime * result + ((getCount_money() == null) ? 0 : getCount_money().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPre_realtime_record_ids() == null) ? 0 : getPre_realtime_record_ids().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", details_id=").append(details_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", backdrop_state=").append(backdrop_state);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", event_id=").append(event_id);
        sb.append(", eventuuid=").append(eventuuid);
        sb.append(", count_money=").append(count_money);
        sb.append(", status=").append(status);
        sb.append(", pre_realtime_record_ids=").append(pre_realtime_record_ids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}