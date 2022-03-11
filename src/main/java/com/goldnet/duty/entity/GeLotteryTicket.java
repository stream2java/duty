package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 游戏表
 * @TableName ge_lottery_ticket
 */
@TableName(value ="ge_lottery_ticket")
@Data
public class GeLotteryTicket implements Serializable {
    /**
     * uuid主键
     */
    @TableId(value = "lottery_id")
    private Object lottery_id;

    /**
     * 基础游戏名称
     */
    @TableField(value = "lottery_name")
    private String lottery_name;

    /**
     * 基础游戏代号
     */
    @TableField(value = "lottery_code")
    private String lottery_code;

    /**
     * 彩票期数第一期开奖时间
     */
    @TableField(value = "start_date")
    private String start_date;

    /**
     * 有效投注时间，例如重庆时时彩9分钟
     */
    @TableField(value = "spacing_date")
    private String spacing_date;

    /**
     * 彩票最后一期开奖时间
     */
    @TableField(value = "end_date")
    private String end_date;

    /**
     * 开始期数
     */
    @TableField(value = "start_award")
    private String start_award;

    /**
     * 每期间隔时间，例如北京间隔5分钟
     */
    @TableField(value = "awid_date")
    private String awid_date;

    /**
     * 具体游戏类别代号【待讨论】
     */
    @TableField(value = "type")
    private String type;

    /**
     * 
     */
    @TableField(value = "lottery_number")
    private Object lottery_number;

    /**
     * 0：有效 1无效
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 父级ID
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 具体游戏英文代号类型
     */
    @TableField(value = "lottery_type")
    private String lottery_type;

    /**
     * 排序,从小到大排序
     */
    @TableField(value = "sort_id")
    private Object sort_id;

    /**
     * 期数是否自动，0为手动，1为自动
     */
    @TableField(value = "auto_period")
    private Object auto_period;

    /**
     * 
     */
    @TableField(value = "open")
    private String open;

    /**
     * 
     */
    @TableField(value = "close_begin_date_time")
    private String close_begin_date_time;

    /**
     * 
     */
    @TableField(value = "close_end_date_time")
    private String close_end_date_time;

    /**
     * 
     */
    @TableField(value = "lottery_center_code")
    private String lottery_center_code;

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
        GeLotteryTicket other = (GeLotteryTicket) that;
        return (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getLottery_name() == null ? other.getLottery_name() == null : this.getLottery_name().equals(other.getLottery_name()))
            && (this.getLottery_code() == null ? other.getLottery_code() == null : this.getLottery_code().equals(other.getLottery_code()))
            && (this.getStart_date() == null ? other.getStart_date() == null : this.getStart_date().equals(other.getStart_date()))
            && (this.getSpacing_date() == null ? other.getSpacing_date() == null : this.getSpacing_date().equals(other.getSpacing_date()))
            && (this.getEnd_date() == null ? other.getEnd_date() == null : this.getEnd_date().equals(other.getEnd_date()))
            && (this.getStart_award() == null ? other.getStart_award() == null : this.getStart_award().equals(other.getStart_award()))
            && (this.getAwid_date() == null ? other.getAwid_date() == null : this.getAwid_date().equals(other.getAwid_date()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getLottery_number() == null ? other.getLottery_number() == null : this.getLottery_number().equals(other.getLottery_number()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getLottery_type() == null ? other.getLottery_type() == null : this.getLottery_type().equals(other.getLottery_type()))
            && (this.getSort_id() == null ? other.getSort_id() == null : this.getSort_id().equals(other.getSort_id()))
            && (this.getAuto_period() == null ? other.getAuto_period() == null : this.getAuto_period().equals(other.getAuto_period()))
            && (this.getOpen() == null ? other.getOpen() == null : this.getOpen().equals(other.getOpen()))
            && (this.getClose_begin_date_time() == null ? other.getClose_begin_date_time() == null : this.getClose_begin_date_time().equals(other.getClose_begin_date_time()))
            && (this.getClose_end_date_time() == null ? other.getClose_end_date_time() == null : this.getClose_end_date_time().equals(other.getClose_end_date_time()))
            && (this.getLottery_center_code() == null ? other.getLottery_center_code() == null : this.getLottery_center_code().equals(other.getLottery_center_code()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getLottery_name() == null) ? 0 : getLottery_name().hashCode());
        result = prime * result + ((getLottery_code() == null) ? 0 : getLottery_code().hashCode());
        result = prime * result + ((getStart_date() == null) ? 0 : getStart_date().hashCode());
        result = prime * result + ((getSpacing_date() == null) ? 0 : getSpacing_date().hashCode());
        result = prime * result + ((getEnd_date() == null) ? 0 : getEnd_date().hashCode());
        result = prime * result + ((getStart_award() == null) ? 0 : getStart_award().hashCode());
        result = prime * result + ((getAwid_date() == null) ? 0 : getAwid_date().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getLottery_number() == null) ? 0 : getLottery_number().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getLottery_type() == null) ? 0 : getLottery_type().hashCode());
        result = prime * result + ((getSort_id() == null) ? 0 : getSort_id().hashCode());
        result = prime * result + ((getAuto_period() == null) ? 0 : getAuto_period().hashCode());
        result = prime * result + ((getOpen() == null) ? 0 : getOpen().hashCode());
        result = prime * result + ((getClose_begin_date_time() == null) ? 0 : getClose_begin_date_time().hashCode());
        result = prime * result + ((getClose_end_date_time() == null) ? 0 : getClose_end_date_time().hashCode());
        result = prime * result + ((getLottery_center_code() == null) ? 0 : getLottery_center_code().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", lottery_name=").append(lottery_name);
        sb.append(", lottery_code=").append(lottery_code);
        sb.append(", start_date=").append(start_date);
        sb.append(", spacing_date=").append(spacing_date);
        sb.append(", end_date=").append(end_date);
        sb.append(", start_award=").append(start_award);
        sb.append(", awid_date=").append(awid_date);
        sb.append(", type=").append(type);
        sb.append(", lottery_number=").append(lottery_number);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", lottery_type=").append(lottery_type);
        sb.append(", sort_id=").append(sort_id);
        sb.append(", auto_period=").append(auto_period);
        sb.append(", open=").append(open);
        sb.append(", close_begin_date_time=").append(close_begin_date_time);
        sb.append(", close_end_date_time=").append(close_end_date_time);
        sb.append(", lottery_center_code=").append(lottery_center_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}