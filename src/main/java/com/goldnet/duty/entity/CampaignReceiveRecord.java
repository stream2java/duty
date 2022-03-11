package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 领取记录
 * @TableName campaign_receive_record
 */
@TableName(value ="campaign_receive_record")
@Data
public class CampaignReceiveRecord implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 套數ID
     */
    @TableField(value = "set_id")
    private String set_id;

    /**
     * 站點ID
     */
    @TableField(value = "site_id")
    private Object site_id;

    /**
     * 用戶ID
     */
    @TableField(value = "acc_id")
    private Object acc_id;

    /**
     * 活動ID
     */
    @TableField(value = "camp_config_id")
    private Object camp_config_id;

    /**
     * 领取金额
     */
    @TableField(value = "award")
    private Object award;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 同步状态
     */
    @TableField(value = "sync_status")
    private Object sync_status;

    /**
     * 
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

    /**
     * 稽核設定
     */
    @TableField(value = "synthesize_set")
    private String synthesize_set;

    /**
     * 稽核倍數
     */
    @TableField(value = "synthesize_reach_number")
    private Object synthesize_reach_number;

    /**
     * 入流水時間
     */
    @TableField(value = "gain_time")
    private LocalDateTime gain_time;

    /**
     * 領取狀態 1:成功 2: 狀態異常
     */
    @TableField(value = "gain_status")
    private Object gain_status;

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
        CampaignReceiveRecord other = (CampaignReceiveRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSet_id() == null ? other.getSet_id() == null : this.getSet_id().equals(other.getSet_id()))
            && (this.getSite_id() == null ? other.getSite_id() == null : this.getSite_id().equals(other.getSite_id()))
            && (this.getAcc_id() == null ? other.getAcc_id() == null : this.getAcc_id().equals(other.getAcc_id()))
            && (this.getCamp_config_id() == null ? other.getCamp_config_id() == null : this.getCamp_config_id().equals(other.getCamp_config_id()))
            && (this.getAward() == null ? other.getAward() == null : this.getAward().equals(other.getAward()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSync_status() == null ? other.getSync_status() == null : this.getSync_status().equals(other.getSync_status()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getSynthesize_set() == null ? other.getSynthesize_set() == null : this.getSynthesize_set().equals(other.getSynthesize_set()))
            && (this.getSynthesize_reach_number() == null ? other.getSynthesize_reach_number() == null : this.getSynthesize_reach_number().equals(other.getSynthesize_reach_number()))
            && (this.getGain_time() == null ? other.getGain_time() == null : this.getGain_time().equals(other.getGain_time()))
            && (this.getGain_status() == null ? other.getGain_status() == null : this.getGain_status().equals(other.getGain_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSet_id() == null) ? 0 : getSet_id().hashCode());
        result = prime * result + ((getSite_id() == null) ? 0 : getSite_id().hashCode());
        result = prime * result + ((getAcc_id() == null) ? 0 : getAcc_id().hashCode());
        result = prime * result + ((getCamp_config_id() == null) ? 0 : getCamp_config_id().hashCode());
        result = prime * result + ((getAward() == null) ? 0 : getAward().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSync_status() == null) ? 0 : getSync_status().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getSynthesize_set() == null) ? 0 : getSynthesize_set().hashCode());
        result = prime * result + ((getSynthesize_reach_number() == null) ? 0 : getSynthesize_reach_number().hashCode());
        result = prime * result + ((getGain_time() == null) ? 0 : getGain_time().hashCode());
        result = prime * result + ((getGain_status() == null) ? 0 : getGain_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", set_id=").append(set_id);
        sb.append(", site_id=").append(site_id);
        sb.append(", acc_id=").append(acc_id);
        sb.append(", camp_config_id=").append(camp_config_id);
        sb.append(", award=").append(award);
        sb.append(", remark=").append(remark);
        sb.append(", sync_status=").append(sync_status);
        sb.append(", create_date=").append(create_date);
        sb.append(", synthesize_set=").append(synthesize_set);
        sb.append(", synthesize_reach_number=").append(synthesize_reach_number);
        sb.append(", gain_time=").append(gain_time);
        sb.append(", gain_status=").append(gain_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}