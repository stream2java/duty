package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 体育 - 联赛信息表
 * @TableName ge_zq_matches
 */
@TableName(value ="ge_zq_matches")
@Data
public class GeZqMatches implements Serializable {
    /**
     * 
     */
    @TableId(value = "matches_id")
    private Object matches_id;

    /**
     * 联赛名称
     */
    @TableField(value = "mname")
    private String mname;

    /**
     * 联赛编号

     */
    @TableField(value = "matches_code")
    private Object matches_code;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 该联赛是否开放投注
0开放 1不开放
     */
    @TableField(value = "is_show")
    private String is_show;

    /**
     * 用来表示是什么的联赛 
30是足球
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

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
        GeZqMatches other = (GeZqMatches) that;
        return (this.getMatches_id() == null ? other.getMatches_id() == null : this.getMatches_id().equals(other.getMatches_id()))
            && (this.getMname() == null ? other.getMname() == null : this.getMname().equals(other.getMname()))
            && (this.getMatches_code() == null ? other.getMatches_code() == null : this.getMatches_code().equals(other.getMatches_code()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getIs_show() == null ? other.getIs_show() == null : this.getIs_show().equals(other.getIs_show()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMatches_id() == null) ? 0 : getMatches_id().hashCode());
        result = prime * result + ((getMname() == null) ? 0 : getMname().hashCode());
        result = prime * result + ((getMatches_code() == null) ? 0 : getMatches_code().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getIs_show() == null) ? 0 : getIs_show().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matches_id=").append(matches_id);
        sb.append(", mname=").append(mname);
        sb.append(", matches_code=").append(matches_code);
        sb.append(", create_time=").append(create_time);
        sb.append(", is_show=").append(is_show);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}