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
 * 加值平台流水表
 * @TableName vas_record
 */
@TableName(value ="vas_record")
@Data
public class VasRecord implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Object id;

    /**
     * CB平台流水id
     */
    @TableField(value = "record_id")
    private Object record_id;

    /**
     * 站点id
     */
    @TableField(value = "station_id")
    private Object station_id;

    /**
     * 会员id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 领取金额
     */
    @TableField(value = "award_amount")
    private BigDecimal award_amount;

    /**
     * 稽核平台设置
     */
    @TableField(value = "synthesize_set")
    private String synthesize_set;

    /**
     * 稽核倍数
     */
    @TableField(value = "check_num")
    private Object check_num;

    /**
     * 活动id
     */
    @TableField(value = "activity_id")
    private String activity_id;

    /**
     * 活动名称
     */
    @TableField(value = "activity_name")
    private String activity_name;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * CB平台创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * GPO平台入账时间
     */
    @TableField(value = "gain_time")
    private LocalDateTime gain_time;

    /**
     * 版本号 首次消费为0
     */
    @TableField(value = "version")
    private Object version;

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
        VasRecord other = (VasRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRecord_id() == null ? other.getRecord_id() == null : this.getRecord_id().equals(other.getRecord_id()))
            && (this.getStation_id() == null ? other.getStation_id() == null : this.getStation_id().equals(other.getStation_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAward_amount() == null ? other.getAward_amount() == null : this.getAward_amount().equals(other.getAward_amount()))
            && (this.getSynthesize_set() == null ? other.getSynthesize_set() == null : this.getSynthesize_set().equals(other.getSynthesize_set()))
            && (this.getCheck_num() == null ? other.getCheck_num() == null : this.getCheck_num().equals(other.getCheck_num()))
            && (this.getActivity_id() == null ? other.getActivity_id() == null : this.getActivity_id().equals(other.getActivity_id()))
            && (this.getActivity_name() == null ? other.getActivity_name() == null : this.getActivity_name().equals(other.getActivity_name()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getGain_time() == null ? other.getGain_time() == null : this.getGain_time().equals(other.getGain_time()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRecord_id() == null) ? 0 : getRecord_id().hashCode());
        result = prime * result + ((getStation_id() == null) ? 0 : getStation_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAward_amount() == null) ? 0 : getAward_amount().hashCode());
        result = prime * result + ((getSynthesize_set() == null) ? 0 : getSynthesize_set().hashCode());
        result = prime * result + ((getCheck_num() == null) ? 0 : getCheck_num().hashCode());
        result = prime * result + ((getActivity_id() == null) ? 0 : getActivity_id().hashCode());
        result = prime * result + ((getActivity_name() == null) ? 0 : getActivity_name().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getGain_time() == null) ? 0 : getGain_time().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", record_id=").append(record_id);
        sb.append(", station_id=").append(station_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", award_amount=").append(award_amount);
        sb.append(", synthesize_set=").append(synthesize_set);
        sb.append(", check_num=").append(check_num);
        sb.append(", activity_id=").append(activity_id);
        sb.append(", activity_name=").append(activity_name);
        sb.append(", remark=").append(remark);
        sb.append(", create_time=").append(create_time);
        sb.append(", gain_time=").append(gain_time);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}