package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName promotion_self_rebate_percent
 */
@TableName(value ="promotion_self_rebate_percent")
@Data
public class PromotionSelfRebatePercent implements Serializable {
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
     * 返点设置类型  0：有效投注 1：损益返点 2：充值返点
     */
    @TableField(value = "rebate_type")
    private Object rebate_type;

    /**
     * 0:全站推广会员的自身返点值为会员的推广返点值,1:全站推广会员的自身返点将统一使用厅主设定值(以下输入框的返点值)
     */
    @TableField(value = "rebate_value_type")
    private Object rebate_value_type;

    /**
     * 第三方游戏类型编码
     */
    @TableField(value = "game_type_code")
    private String game_type_code;

    /**
     * 自身返点
     */
    @TableField(value = "self_rebate_percent")
    private BigDecimal self_rebate_percent;

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
        PromotionSelfRebatePercent other = (PromotionSelfRebatePercent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getRebate_type() == null ? other.getRebate_type() == null : this.getRebate_type().equals(other.getRebate_type()))
            && (this.getRebate_value_type() == null ? other.getRebate_value_type() == null : this.getRebate_value_type().equals(other.getRebate_value_type()))
            && (this.getGame_type_code() == null ? other.getGame_type_code() == null : this.getGame_type_code().equals(other.getGame_type_code()))
            && (this.getSelf_rebate_percent() == null ? other.getSelf_rebate_percent() == null : this.getSelf_rebate_percent().equals(other.getSelf_rebate_percent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getRebate_type() == null) ? 0 : getRebate_type().hashCode());
        result = prime * result + ((getRebate_value_type() == null) ? 0 : getRebate_value_type().hashCode());
        result = prime * result + ((getGame_type_code() == null) ? 0 : getGame_type_code().hashCode());
        result = prime * result + ((getSelf_rebate_percent() == null) ? 0 : getSelf_rebate_percent().hashCode());
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
        sb.append(", rebate_type=").append(rebate_type);
        sb.append(", rebate_value_type=").append(rebate_value_type);
        sb.append(", game_type_code=").append(game_type_code);
        sb.append(", self_rebate_percent=").append(self_rebate_percent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}