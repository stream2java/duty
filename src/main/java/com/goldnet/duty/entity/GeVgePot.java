package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 电子游艺 - 连线彩金信息 - 四个级别的都在
 * @TableName ge_vge_pot
 */
@TableName(value ="ge_vge_pot")
@Data
public class GeVgePot implements Serializable {
    /**
     * 
     */
    @TableField(value = "pid")
    private Object pid;

    /**
     * 0为超级彩池Grand 
1为争霸彩池Major
2为双龙彩池Minor
3为个人彩池Mini
     */
    @TableField(value = "pot_type")
    private String pot_type;

    /**
     * 游戏类型
为空就是所有游戏通用
如大大股东的 争霸彩池
和个人的mini彩池
     */
    @TableField(value = "pot_game_type")
    private Object pot_game_type;

    /**
     * 如果是争霸彩池或者双龙彩池 这里填大大股东
     */
    @TableField(value = "pot_agent")
    private Object pot_agent;

    /**
     * mini彩池填个人彩池的金额
     */
    @TableField(value = "pot_account")
    private Object pot_account;

    /**
     * 彩池剩余金额
     */
    @TableField(value = "pot_money")
    private BigDecimal pot_money;

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
        GeVgePot other = (GeVgePot) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getPot_type() == null ? other.getPot_type() == null : this.getPot_type().equals(other.getPot_type()))
            && (this.getPot_game_type() == null ? other.getPot_game_type() == null : this.getPot_game_type().equals(other.getPot_game_type()))
            && (this.getPot_agent() == null ? other.getPot_agent() == null : this.getPot_agent().equals(other.getPot_agent()))
            && (this.getPot_account() == null ? other.getPot_account() == null : this.getPot_account().equals(other.getPot_account()))
            && (this.getPot_money() == null ? other.getPot_money() == null : this.getPot_money().equals(other.getPot_money()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getPot_type() == null) ? 0 : getPot_type().hashCode());
        result = prime * result + ((getPot_game_type() == null) ? 0 : getPot_game_type().hashCode());
        result = prime * result + ((getPot_agent() == null) ? 0 : getPot_agent().hashCode());
        result = prime * result + ((getPot_account() == null) ? 0 : getPot_account().hashCode());
        result = prime * result + ((getPot_money() == null) ? 0 : getPot_money().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", pot_type=").append(pot_type);
        sb.append(", pot_game_type=").append(pot_game_type);
        sb.append(", pot_agent=").append(pot_agent);
        sb.append(", pot_account=").append(pot_account);
        sb.append(", pot_money=").append(pot_money);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}