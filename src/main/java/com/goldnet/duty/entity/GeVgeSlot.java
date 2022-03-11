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
 * 电子游艺 - 拉霸机 机台(筒子拉霸机、扑克拉霸机、水果拉霸机、足球拉霸机使用)
 * @TableName ge_vge_slot
 */
@TableName(value ="ge_vge_slot")
@Data
public class GeVgeSlot implements Serializable {
    /**
     * 
     */
    @TableId(value = "slot_id")
    private Object slot_id;

    /**
     * 机器编号
     */
    @TableField(value = "machine_code")
    private Object machine_code;

    /**
     * 状态
0空闲 1使用中
5关闭
     */
    @TableField(value = "status")
    private String status;

    /**
     * 使用的会员
     */
    @TableField(value = "account")
    private Object account;

    /**
     * 坐下的时间
     */
    @TableField(value = "sit_time")
    private LocalDateTime sit_time;

    /**
     * 最后一次的操作时间
用来踢 挂机的会员
     */
    @TableField(value = "act_time")
    private LocalDateTime act_time;

    /**
     * 游戏类型
     */
    @TableField(value = "slot_type")
    private Object slot_type;

    /**
     * 本机彩池（基本靠实时统计）
     */
    @TableField(value = "pot")
    private BigDecimal pot;

    /**
     * 损益 1000 就是 100%
10就是 1%  1%就是在pot中抽取 1%是必须赚到的
     */
    @TableField(value = "profit")
    private Object profit;

    /**
     * 是哪一代理的拉霸机
     */
    @TableField(value = "agent")
    private Object agent;

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
        GeVgeSlot other = (GeVgeSlot) that;
        return (this.getSlot_id() == null ? other.getSlot_id() == null : this.getSlot_id().equals(other.getSlot_id()))
            && (this.getMachine_code() == null ? other.getMachine_code() == null : this.getMachine_code().equals(other.getMachine_code()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getSit_time() == null ? other.getSit_time() == null : this.getSit_time().equals(other.getSit_time()))
            && (this.getAct_time() == null ? other.getAct_time() == null : this.getAct_time().equals(other.getAct_time()))
            && (this.getSlot_type() == null ? other.getSlot_type() == null : this.getSlot_type().equals(other.getSlot_type()))
            && (this.getPot() == null ? other.getPot() == null : this.getPot().equals(other.getPot()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSlot_id() == null) ? 0 : getSlot_id().hashCode());
        result = prime * result + ((getMachine_code() == null) ? 0 : getMachine_code().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getSit_time() == null) ? 0 : getSit_time().hashCode());
        result = prime * result + ((getAct_time() == null) ? 0 : getAct_time().hashCode());
        result = prime * result + ((getSlot_type() == null) ? 0 : getSlot_type().hashCode());
        result = prime * result + ((getPot() == null) ? 0 : getPot().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slot_id=").append(slot_id);
        sb.append(", machine_code=").append(machine_code);
        sb.append(", status=").append(status);
        sb.append(", account=").append(account);
        sb.append(", sit_time=").append(sit_time);
        sb.append(", act_time=").append(act_time);
        sb.append(", slot_type=").append(slot_type);
        sb.append(", pot=").append(pot);
        sb.append(", profit=").append(profit);
        sb.append(", agent=").append(agent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}