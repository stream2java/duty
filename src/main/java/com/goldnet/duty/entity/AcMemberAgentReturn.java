package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 会员与代理退水设定表
 * @TableName ac_member_agent_return
 */
@TableName(value ="ac_member_agent_return")
@Data
public class AcMemberAgentReturn implements Serializable {
    /**
     * 
     */
    @TableId(value = "agent_return_id")
    private Object agent_return_id;

    /**
     * 账号id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 彩票id
     */
    @TableField(value = "lotery_id")
    private Object lotery_id;

    /**
     * 大盘id
     */
    @TableField(value = "plate_id")
    private Object plate_id;

    /**
     * 游戏类型id
     */
    @TableField(value = "type_id")
    private Object type_id;

    /**
     * 
     */
    @TableField(value = "return0")
    private BigDecimal return0;

    /**
     * 
     */
    @TableField(value = "return1")
    private BigDecimal return1;

    /**
     * 
     */
    @TableField(value = "return2")
    private BigDecimal return2;

    /**
     * 
     */
    @TableField(value = "return3")
    private BigDecimal return3;

    /**
     * 
     */
    @TableField(value = "return4")
    private BigDecimal return4;

    /**
     * 
     */
    @TableField(value = "return5")
    private BigDecimal return5;

    /**
     * 
     */
    @TableField(value = "return6")
    private BigDecimal return6;

    /**
     * 
     */
    @TableField(value = "agent_id0")
    private Object agent_id0;

    /**
     * 
     */
    @TableField(value = "agent_id1")
    private Object agent_id1;

    /**
     * 
     */
    @TableField(value = "agent_id2")
    private Object agent_id2;

    /**
     * 
     */
    @TableField(value = "agent_id3")
    private Object agent_id3;

    /**
     * 
     */
    @TableField(value = "agent_id4")
    private Object agent_id4;

    /**
     * 
     */
    @TableField(value = "agent_id5")
    private Object agent_id5;

    /**
     * 
     */
    @TableField(value = "agent_id6")
    private Object agent_id6;

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
        AcMemberAgentReturn other = (AcMemberAgentReturn) that;
        return (this.getAgent_return_id() == null ? other.getAgent_return_id() == null : this.getAgent_return_id().equals(other.getAgent_return_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getLotery_id() == null ? other.getLotery_id() == null : this.getLotery_id().equals(other.getLotery_id()))
            && (this.getPlate_id() == null ? other.getPlate_id() == null : this.getPlate_id().equals(other.getPlate_id()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getReturn0() == null ? other.getReturn0() == null : this.getReturn0().equals(other.getReturn0()))
            && (this.getReturn1() == null ? other.getReturn1() == null : this.getReturn1().equals(other.getReturn1()))
            && (this.getReturn2() == null ? other.getReturn2() == null : this.getReturn2().equals(other.getReturn2()))
            && (this.getReturn3() == null ? other.getReturn3() == null : this.getReturn3().equals(other.getReturn3()))
            && (this.getReturn4() == null ? other.getReturn4() == null : this.getReturn4().equals(other.getReturn4()))
            && (this.getReturn5() == null ? other.getReturn5() == null : this.getReturn5().equals(other.getReturn5()))
            && (this.getReturn6() == null ? other.getReturn6() == null : this.getReturn6().equals(other.getReturn6()))
            && (this.getAgent_id0() == null ? other.getAgent_id0() == null : this.getAgent_id0().equals(other.getAgent_id0()))
            && (this.getAgent_id1() == null ? other.getAgent_id1() == null : this.getAgent_id1().equals(other.getAgent_id1()))
            && (this.getAgent_id2() == null ? other.getAgent_id2() == null : this.getAgent_id2().equals(other.getAgent_id2()))
            && (this.getAgent_id3() == null ? other.getAgent_id3() == null : this.getAgent_id3().equals(other.getAgent_id3()))
            && (this.getAgent_id4() == null ? other.getAgent_id4() == null : this.getAgent_id4().equals(other.getAgent_id4()))
            && (this.getAgent_id5() == null ? other.getAgent_id5() == null : this.getAgent_id5().equals(other.getAgent_id5()))
            && (this.getAgent_id6() == null ? other.getAgent_id6() == null : this.getAgent_id6().equals(other.getAgent_id6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgent_return_id() == null) ? 0 : getAgent_return_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getLotery_id() == null) ? 0 : getLotery_id().hashCode());
        result = prime * result + ((getPlate_id() == null) ? 0 : getPlate_id().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getReturn0() == null) ? 0 : getReturn0().hashCode());
        result = prime * result + ((getReturn1() == null) ? 0 : getReturn1().hashCode());
        result = prime * result + ((getReturn2() == null) ? 0 : getReturn2().hashCode());
        result = prime * result + ((getReturn3() == null) ? 0 : getReturn3().hashCode());
        result = prime * result + ((getReturn4() == null) ? 0 : getReturn4().hashCode());
        result = prime * result + ((getReturn5() == null) ? 0 : getReturn5().hashCode());
        result = prime * result + ((getReturn6() == null) ? 0 : getReturn6().hashCode());
        result = prime * result + ((getAgent_id0() == null) ? 0 : getAgent_id0().hashCode());
        result = prime * result + ((getAgent_id1() == null) ? 0 : getAgent_id1().hashCode());
        result = prime * result + ((getAgent_id2() == null) ? 0 : getAgent_id2().hashCode());
        result = prime * result + ((getAgent_id3() == null) ? 0 : getAgent_id3().hashCode());
        result = prime * result + ((getAgent_id4() == null) ? 0 : getAgent_id4().hashCode());
        result = prime * result + ((getAgent_id5() == null) ? 0 : getAgent_id5().hashCode());
        result = prime * result + ((getAgent_id6() == null) ? 0 : getAgent_id6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agent_return_id=").append(agent_return_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", lotery_id=").append(lotery_id);
        sb.append(", plate_id=").append(plate_id);
        sb.append(", type_id=").append(type_id);
        sb.append(", return0=").append(return0);
        sb.append(", return1=").append(return1);
        sb.append(", return2=").append(return2);
        sb.append(", return3=").append(return3);
        sb.append(", return4=").append(return4);
        sb.append(", return5=").append(return5);
        sb.append(", return6=").append(return6);
        sb.append(", agent_id0=").append(agent_id0);
        sb.append(", agent_id1=").append(agent_id1);
        sb.append(", agent_id2=").append(agent_id2);
        sb.append(", agent_id3=").append(agent_id3);
        sb.append(", agent_id4=").append(agent_id4);
        sb.append(", agent_id5=").append(agent_id5);
        sb.append(", agent_id6=").append(agent_id6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}