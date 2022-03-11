package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName ge_ty_betdetail_log
 */
@TableName(value ="ge_ty_betdetail_log")
@Data
public class GeTyBetdetailLog implements Serializable {
    /**
     * 
     */
    @TableField(value = "logid")
    private Object logid;

    /**
     * 
     */
    @TableField(value = "detail_id")
    private Object detail_id;

    /**
     * 
     */
    @TableField(value = "betting_code")
    private String betting_code;

    /**
     * 
     */
    @TableField(value = "agent")
    private Object agent;

    /**
     * 
     */
    @TableField(value = "optype")
    private Object optype;

    /**
     * 
     */
    @TableField(value = "matches_id")
    private Object matches_id;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

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
        GeTyBetdetailLog other = (GeTyBetdetailLog) that;
        return (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getDetail_id() == null ? other.getDetail_id() == null : this.getDetail_id().equals(other.getDetail_id()))
            && (this.getBetting_code() == null ? other.getBetting_code() == null : this.getBetting_code().equals(other.getBetting_code()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getOptype() == null ? other.getOptype() == null : this.getOptype().equals(other.getOptype()))
            && (this.getMatches_id() == null ? other.getMatches_id() == null : this.getMatches_id().equals(other.getMatches_id()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getDetail_id() == null) ? 0 : getDetail_id().hashCode());
        result = prime * result + ((getBetting_code() == null) ? 0 : getBetting_code().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getOptype() == null) ? 0 : getOptype().hashCode());
        result = prime * result + ((getMatches_id() == null) ? 0 : getMatches_id().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logid=").append(logid);
        sb.append(", detail_id=").append(detail_id);
        sb.append(", betting_code=").append(betting_code);
        sb.append(", agent=").append(agent);
        sb.append(", optype=").append(optype);
        sb.append(", matches_id=").append(matches_id);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}