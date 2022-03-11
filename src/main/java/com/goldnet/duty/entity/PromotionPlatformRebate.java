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
 * 推广用户平台返点比例表
 * @TableName promotion_platform_rebate
 */
@TableName(value ="promotion_platform_rebate")
@Data
public class PromotionPlatformRebate implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 对应at_account表ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 第三方游戏类型编码
     */
    @TableField(value = "game_type_code")
    private String game_type_code;

    /**
     * 下级差有效投注额返点比例
     */
    @TableField(value = "betting_rebate_percent")
    private BigDecimal betting_rebate_percent;

    /**
     * 下级差损益返点比例
     */
    @TableField(value = "profit_rebate_percent")
    private BigDecimal profit_rebate_percent;

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
     * 自身投注返点
     */
    @TableField(value = "self_betting_rebate_percent")
    private BigDecimal self_betting_rebate_percent;

    /**
     * 自身损益返点
     */
    @TableField(value = "self_profit_rebate_percent")
    private BigDecimal self_profit_rebate_percent;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

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
        PromotionPlatformRebate other = (PromotionPlatformRebate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getGame_type_code() == null ? other.getGame_type_code() == null : this.getGame_type_code().equals(other.getGame_type_code()))
            && (this.getBetting_rebate_percent() == null ? other.getBetting_rebate_percent() == null : this.getBetting_rebate_percent().equals(other.getBetting_rebate_percent()))
            && (this.getProfit_rebate_percent() == null ? other.getProfit_rebate_percent() == null : this.getProfit_rebate_percent().equals(other.getProfit_rebate_percent()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getSelf_betting_rebate_percent() == null ? other.getSelf_betting_rebate_percent() == null : this.getSelf_betting_rebate_percent().equals(other.getSelf_betting_rebate_percent()))
            && (this.getSelf_profit_rebate_percent() == null ? other.getSelf_profit_rebate_percent() == null : this.getSelf_profit_rebate_percent().equals(other.getSelf_profit_rebate_percent()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getGame_type_code() == null) ? 0 : getGame_type_code().hashCode());
        result = prime * result + ((getBetting_rebate_percent() == null) ? 0 : getBetting_rebate_percent().hashCode());
        result = prime * result + ((getProfit_rebate_percent() == null) ? 0 : getProfit_rebate_percent().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getSelf_betting_rebate_percent() == null) ? 0 : getSelf_betting_rebate_percent().hashCode());
        result = prime * result + ((getSelf_profit_rebate_percent() == null) ? 0 : getSelf_profit_rebate_percent().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account_id=").append(account_id);
        sb.append(", game_type_code=").append(game_type_code);
        sb.append(", betting_rebate_percent=").append(betting_rebate_percent);
        sb.append(", profit_rebate_percent=").append(profit_rebate_percent);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", self_betting_rebate_percent=").append(self_betting_rebate_percent);
        sb.append(", self_profit_rebate_percent=").append(self_profit_rebate_percent);
        sb.append(", account1=").append(account1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}