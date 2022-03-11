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
 * 厅主某一天的打码量、有效投注。损益按游戏汇总表
 * @TableName api_betting_game_summary
 */
@TableName(value ="api_betting_game_summary")
@Data
public class ApiBettingGameSummary implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 厅主id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 游戏大类+小类，如果CPCP, OGJL
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 游戏名称
     */
    @TableField(value = "gametype")
    private String gametype;

    /**
     * 下注日期，没有时分秒
     */
    @TableField(value = "betting_date")
    private LocalDate betting_date;

    /**
     * 有效投注额
     */
    @TableField(value = "valid_amount")
    private BigDecimal valid_amount;

    /**
     * 损益
     */
    @TableField(value = "profitloss")
    private BigDecimal profitloss;

    /**
     * 注单量
     */
    @TableField(value = "bettingnum")
    private Object bettingnum;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 更新时间，定时任务汇总，有效投注有变化时，需要更新
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

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
        ApiBettingGameSummary other = (ApiBettingGameSummary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getGametype() == null ? other.getGametype() == null : this.getGametype().equals(other.getGametype()))
            && (this.getBetting_date() == null ? other.getBetting_date() == null : this.getBetting_date().equals(other.getBetting_date()))
            && (this.getValid_amount() == null ? other.getValid_amount() == null : this.getValid_amount().equals(other.getValid_amount()))
            && (this.getProfitloss() == null ? other.getProfitloss() == null : this.getProfitloss().equals(other.getProfitloss()))
            && (this.getBettingnum() == null ? other.getBettingnum() == null : this.getBettingnum().equals(other.getBettingnum()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getGametype() == null) ? 0 : getGametype().hashCode());
        result = prime * result + ((getBetting_date() == null) ? 0 : getBetting_date().hashCode());
        result = prime * result + ((getValid_amount() == null) ? 0 : getValid_amount().hashCode());
        result = prime * result + ((getProfitloss() == null) ? 0 : getProfitloss().hashCode());
        result = prime * result + ((getBettingnum() == null) ? 0 : getBettingnum().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
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
        sb.append(", platform_code=").append(platform_code);
        sb.append(", gametype=").append(gametype);
        sb.append(", betting_date=").append(betting_date);
        sb.append(", valid_amount=").append(valid_amount);
        sb.append(", profitloss=").append(profitloss);
        sb.append(", bettingnum=").append(bettingnum);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}