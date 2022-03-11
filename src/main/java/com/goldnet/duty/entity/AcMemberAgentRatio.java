package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 会员与代理商占城设定表
 * @TableName ac_member_agent_ratio
 */
@TableName(value ="ac_member_agent_ratio")
@Data
public class AcMemberAgentRatio implements Serializable {
    /**
     * 
     */
    @TableId(value = "agent_ration_id")
    private Object agent_ration_id;

    /**
     * 具体游戏ID
     */
    @TableField(value = "lotery_id")
    private Object lotery_id;

    /**
     * 会员id
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 庄家占成
     */
    @TableField(value = "ratio0")
    private BigDecimal ratio0;

    /**
     * 大大股东占成
     */
    @TableField(value = "ratio1")
    private BigDecimal ratio1;

    /**
     * 
     */
    @TableField(value = "ratio2")
    private BigDecimal ratio2;

    /**
     * 
     */
    @TableField(value = "ratio3")
    private BigDecimal ratio3;

    /**
     * 
     */
    @TableField(value = "ratio4")
    private BigDecimal ratio4;

    /**
     * 代理占成
     */
    @TableField(value = "ratio5")
    private BigDecimal ratio5;

    /**
     * 此字段不需要使用，因会员没有占成
     */
    @TableField(value = "ratio6")
    private BigDecimal ratio6;

    /**
     * 庄家账号
     */
    @TableField(value = "agent_id0")
    private Object agent_id0;

    /**
     * 大大股东ID
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
     * 代理ID
     */
    @TableField(value = "agent_id5")
    private Object agent_id5;

    /**
     * 会员ID
     */
    @TableField(value = "agent_id6")
    private Object agent_id6;

    /**
     * 游戏类别编号
     */
    @TableField(value = "category_code")
    private String category_code;

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
        AcMemberAgentRatio other = (AcMemberAgentRatio) that;
        return (this.getAgent_ration_id() == null ? other.getAgent_ration_id() == null : this.getAgent_ration_id().equals(other.getAgent_ration_id()))
            && (this.getLotery_id() == null ? other.getLotery_id() == null : this.getLotery_id().equals(other.getLotery_id()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getRatio0() == null ? other.getRatio0() == null : this.getRatio0().equals(other.getRatio0()))
            && (this.getRatio1() == null ? other.getRatio1() == null : this.getRatio1().equals(other.getRatio1()))
            && (this.getRatio2() == null ? other.getRatio2() == null : this.getRatio2().equals(other.getRatio2()))
            && (this.getRatio3() == null ? other.getRatio3() == null : this.getRatio3().equals(other.getRatio3()))
            && (this.getRatio4() == null ? other.getRatio4() == null : this.getRatio4().equals(other.getRatio4()))
            && (this.getRatio5() == null ? other.getRatio5() == null : this.getRatio5().equals(other.getRatio5()))
            && (this.getRatio6() == null ? other.getRatio6() == null : this.getRatio6().equals(other.getRatio6()))
            && (this.getAgent_id0() == null ? other.getAgent_id0() == null : this.getAgent_id0().equals(other.getAgent_id0()))
            && (this.getAgent_id1() == null ? other.getAgent_id1() == null : this.getAgent_id1().equals(other.getAgent_id1()))
            && (this.getAgent_id2() == null ? other.getAgent_id2() == null : this.getAgent_id2().equals(other.getAgent_id2()))
            && (this.getAgent_id3() == null ? other.getAgent_id3() == null : this.getAgent_id3().equals(other.getAgent_id3()))
            && (this.getAgent_id4() == null ? other.getAgent_id4() == null : this.getAgent_id4().equals(other.getAgent_id4()))
            && (this.getAgent_id5() == null ? other.getAgent_id5() == null : this.getAgent_id5().equals(other.getAgent_id5()))
            && (this.getAgent_id6() == null ? other.getAgent_id6() == null : this.getAgent_id6().equals(other.getAgent_id6()))
            && (this.getCategory_code() == null ? other.getCategory_code() == null : this.getCategory_code().equals(other.getCategory_code()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgent_ration_id() == null) ? 0 : getAgent_ration_id().hashCode());
        result = prime * result + ((getLotery_id() == null) ? 0 : getLotery_id().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getRatio0() == null) ? 0 : getRatio0().hashCode());
        result = prime * result + ((getRatio1() == null) ? 0 : getRatio1().hashCode());
        result = prime * result + ((getRatio2() == null) ? 0 : getRatio2().hashCode());
        result = prime * result + ((getRatio3() == null) ? 0 : getRatio3().hashCode());
        result = prime * result + ((getRatio4() == null) ? 0 : getRatio4().hashCode());
        result = prime * result + ((getRatio5() == null) ? 0 : getRatio5().hashCode());
        result = prime * result + ((getRatio6() == null) ? 0 : getRatio6().hashCode());
        result = prime * result + ((getAgent_id0() == null) ? 0 : getAgent_id0().hashCode());
        result = prime * result + ((getAgent_id1() == null) ? 0 : getAgent_id1().hashCode());
        result = prime * result + ((getAgent_id2() == null) ? 0 : getAgent_id2().hashCode());
        result = prime * result + ((getAgent_id3() == null) ? 0 : getAgent_id3().hashCode());
        result = prime * result + ((getAgent_id4() == null) ? 0 : getAgent_id4().hashCode());
        result = prime * result + ((getAgent_id5() == null) ? 0 : getAgent_id5().hashCode());
        result = prime * result + ((getAgent_id6() == null) ? 0 : getAgent_id6().hashCode());
        result = prime * result + ((getCategory_code() == null) ? 0 : getCategory_code().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agent_ration_id=").append(agent_ration_id);
        sb.append(", lotery_id=").append(lotery_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", ratio0=").append(ratio0);
        sb.append(", ratio1=").append(ratio1);
        sb.append(", ratio2=").append(ratio2);
        sb.append(", ratio3=").append(ratio3);
        sb.append(", ratio4=").append(ratio4);
        sb.append(", ratio5=").append(ratio5);
        sb.append(", ratio6=").append(ratio6);
        sb.append(", agent_id0=").append(agent_id0);
        sb.append(", agent_id1=").append(agent_id1);
        sb.append(", agent_id2=").append(agent_id2);
        sb.append(", agent_id3=").append(agent_id3);
        sb.append(", agent_id4=").append(agent_id4);
        sb.append(", agent_id5=").append(agent_id5);
        sb.append(", agent_id6=").append(agent_id6);
        sb.append(", category_code=").append(category_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}