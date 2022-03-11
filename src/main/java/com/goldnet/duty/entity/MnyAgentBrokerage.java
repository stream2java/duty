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
 * 代理佣金设定表
 * @TableName mny_agent_brokerage
 */
@TableName(value ="mny_agent_brokerage")
@Data
public class MnyAgentBrokerage implements Serializable {
    /**
     * 代理佣金设定表id 
     */
    @TableId(value = "agentbrokerage_id")
    private Object agentbrokerage_id;

    /**
     * 币别id
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 大大股东id
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 自身盈利金额
     */
    @TableField(value = "self_gain")
    private BigDecimal self_gain;

    /**
     * 有效会员人数
     */
    @TableField(value = "valid_membertotal")
    private Object valid_membertotal;

    /**
     * 自身有效投注金额
     */
    @TableField(value = "self_validbetting")
    private BigDecimal self_validbetting;

    /**
     * 有效会员投注额
     */
    @TableField(value = "valid_member_threshold")
    private BigDecimal valid_member_threshold;

    /**
     * 创建人
     */
    @TableField(value = "founder")
    private String founder;

    /**
     * 创建时间
     */
    @TableField(value = "foundtime")
    private LocalDateTime foundtime;

    /**
     * 修改人
     */
    @TableField(value = "moder")
    private String moder;

    /**
     * 修改时间
     */
    @TableField(value = "modtime")
    private LocalDateTime modtime;

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
        MnyAgentBrokerage other = (MnyAgentBrokerage) that;
        return (this.getAgentbrokerage_id() == null ? other.getAgentbrokerage_id() == null : this.getAgentbrokerage_id().equals(other.getAgentbrokerage_id()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getSelf_gain() == null ? other.getSelf_gain() == null : this.getSelf_gain().equals(other.getSelf_gain()))
            && (this.getValid_membertotal() == null ? other.getValid_membertotal() == null : this.getValid_membertotal().equals(other.getValid_membertotal()))
            && (this.getSelf_validbetting() == null ? other.getSelf_validbetting() == null : this.getSelf_validbetting().equals(other.getSelf_validbetting()))
            && (this.getValid_member_threshold() == null ? other.getValid_member_threshold() == null : this.getValid_member_threshold().equals(other.getValid_member_threshold()))
            && (this.getFounder() == null ? other.getFounder() == null : this.getFounder().equals(other.getFounder()))
            && (this.getFoundtime() == null ? other.getFoundtime() == null : this.getFoundtime().equals(other.getFoundtime()))
            && (this.getModer() == null ? other.getModer() == null : this.getModer().equals(other.getModer()))
            && (this.getModtime() == null ? other.getModtime() == null : this.getModtime().equals(other.getModtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgentbrokerage_id() == null) ? 0 : getAgentbrokerage_id().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getSelf_gain() == null) ? 0 : getSelf_gain().hashCode());
        result = prime * result + ((getValid_membertotal() == null) ? 0 : getValid_membertotal().hashCode());
        result = prime * result + ((getSelf_validbetting() == null) ? 0 : getSelf_validbetting().hashCode());
        result = prime * result + ((getValid_member_threshold() == null) ? 0 : getValid_member_threshold().hashCode());
        result = prime * result + ((getFounder() == null) ? 0 : getFounder().hashCode());
        result = prime * result + ((getFoundtime() == null) ? 0 : getFoundtime().hashCode());
        result = prime * result + ((getModer() == null) ? 0 : getModer().hashCode());
        result = prime * result + ((getModtime() == null) ? 0 : getModtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agentbrokerage_id=").append(agentbrokerage_id);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", self_gain=").append(self_gain);
        sb.append(", valid_membertotal=").append(valid_membertotal);
        sb.append(", self_validbetting=").append(self_validbetting);
        sb.append(", valid_member_threshold=").append(valid_member_threshold);
        sb.append(", founder=").append(founder);
        sb.append(", foundtime=").append(foundtime);
        sb.append(", moder=").append(moder);
        sb.append(", modtime=").append(modtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}