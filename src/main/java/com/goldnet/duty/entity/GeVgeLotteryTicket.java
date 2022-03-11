package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName ge_vge_lottery_ticket
 */
@TableName(value ="ge_vge_lottery_ticket")
@Data
public class GeVgeLotteryTicket implements Serializable {
    /**
     * id
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 类型id
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 类型名称
     */
    @TableField(value = "type_name")
    private String type_name;

    /**
     * 下级类型名称
     */
    @TableField(value = "lower_type_name")
    private String lower_type_name;

    /**
     * 子类类型名称
     */
    @TableField(value = "child_type_name")
    private String child_type_name;

    /**
     * 所属游戏
     */
    @TableField(value = "lower_game")
    private String lower_game;

    /**
     * 父类id
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 子类类型排序，从小到大排
     */
    @TableField(value = "child_sort_id")
    private Object child_sort_id;

    /**
     * 级别
     */
    @TableField(value = "level")
    private Object level;

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
        GeVgeLotteryTicket other = (GeVgeLotteryTicket) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getType_name() == null ? other.getType_name() == null : this.getType_name().equals(other.getType_name()))
            && (this.getLower_type_name() == null ? other.getLower_type_name() == null : this.getLower_type_name().equals(other.getLower_type_name()))
            && (this.getChild_type_name() == null ? other.getChild_type_name() == null : this.getChild_type_name().equals(other.getChild_type_name()))
            && (this.getLower_game() == null ? other.getLower_game() == null : this.getLower_game().equals(other.getLower_game()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getChild_sort_id() == null ? other.getChild_sort_id() == null : this.getChild_sort_id().equals(other.getChild_sort_id()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getType_name() == null) ? 0 : getType_name().hashCode());
        result = prime * result + ((getLower_type_name() == null) ? 0 : getLower_type_name().hashCode());
        result = prime * result + ((getChild_type_name() == null) ? 0 : getChild_type_name().hashCode());
        result = prime * result + ((getLower_game() == null) ? 0 : getLower_game().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getChild_sort_id() == null) ? 0 : getChild_sort_id().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", type_name=").append(type_name);
        sb.append(", lower_type_name=").append(lower_type_name);
        sb.append(", child_type_name=").append(child_type_name);
        sb.append(", lower_game=").append(lower_game);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", child_sort_id=").append(child_sort_id);
        sb.append(", level=").append(level);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}