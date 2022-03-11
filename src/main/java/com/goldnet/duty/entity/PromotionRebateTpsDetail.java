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
 * 推广返点事件详情表
 * @TableName promotion_rebate_tps_detail
 */
@TableName(value ="promotion_rebate_tps_detail")
@Data
public class PromotionRebateTpsDetail implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 返水详情ID
     */
    @TableField(value = "detail_id")
    private String detail_id;

    /**
     * 返水事件ID
     */
    @TableField(value = "event_id")
    private Object event_id;

    /**
     * 产生此条返水的会员ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 第三方平台CODE
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 第三方平台游戏类型Code
     */
    @TableField(value = "game_type_code")
    private String game_type_code;

    /**
     * 有效投注额
     */
    @TableField(value = "valid_betting")
    private BigDecimal valid_betting;

    /**
     * 投注返水金额
     */
    @TableField(value = "bet_rebate_amount")
    private BigDecimal bet_rebate_amount;

    /**
     * 返点比例
     */
    @TableField(value = "rebate_percent")
    private BigDecimal rebate_percent;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 损益
     */
    @TableField(value = "profit_loss")
    private BigDecimal profit_loss;

    /**
     * 损益返水金额
     */
    @TableField(value = "profit_rebate_amount")
    private BigDecimal profit_rebate_amount;

    /**
     * 真实损益返水金额
     */
    @TableField(value = "profit_real_amount")
    private BigDecimal profit_real_amount;

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
        PromotionRebateTpsDetail other = (PromotionRebateTpsDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDetail_id() == null ? other.getDetail_id() == null : this.getDetail_id().equals(other.getDetail_id()))
            && (this.getEvent_id() == null ? other.getEvent_id() == null : this.getEvent_id().equals(other.getEvent_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getGame_type_code() == null ? other.getGame_type_code() == null : this.getGame_type_code().equals(other.getGame_type_code()))
            && (this.getValid_betting() == null ? other.getValid_betting() == null : this.getValid_betting().equals(other.getValid_betting()))
            && (this.getBet_rebate_amount() == null ? other.getBet_rebate_amount() == null : this.getBet_rebate_amount().equals(other.getBet_rebate_amount()))
            && (this.getRebate_percent() == null ? other.getRebate_percent() == null : this.getRebate_percent().equals(other.getRebate_percent()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getProfit_loss() == null ? other.getProfit_loss() == null : this.getProfit_loss().equals(other.getProfit_loss()))
            && (this.getProfit_rebate_amount() == null ? other.getProfit_rebate_amount() == null : this.getProfit_rebate_amount().equals(other.getProfit_rebate_amount()))
            && (this.getProfit_real_amount() == null ? other.getProfit_real_amount() == null : this.getProfit_real_amount().equals(other.getProfit_real_amount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDetail_id() == null) ? 0 : getDetail_id().hashCode());
        result = prime * result + ((getEvent_id() == null) ? 0 : getEvent_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getGame_type_code() == null) ? 0 : getGame_type_code().hashCode());
        result = prime * result + ((getValid_betting() == null) ? 0 : getValid_betting().hashCode());
        result = prime * result + ((getBet_rebate_amount() == null) ? 0 : getBet_rebate_amount().hashCode());
        result = prime * result + ((getRebate_percent() == null) ? 0 : getRebate_percent().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getProfit_loss() == null) ? 0 : getProfit_loss().hashCode());
        result = prime * result + ((getProfit_rebate_amount() == null) ? 0 : getProfit_rebate_amount().hashCode());
        result = prime * result + ((getProfit_real_amount() == null) ? 0 : getProfit_real_amount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", detail_id=").append(detail_id);
        sb.append(", event_id=").append(event_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", game_type_code=").append(game_type_code);
        sb.append(", valid_betting=").append(valid_betting);
        sb.append(", bet_rebate_amount=").append(bet_rebate_amount);
        sb.append(", rebate_percent=").append(rebate_percent);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", profit_loss=").append(profit_loss);
        sb.append(", profit_rebate_amount=").append(profit_rebate_amount);
        sb.append(", profit_real_amount=").append(profit_real_amount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}