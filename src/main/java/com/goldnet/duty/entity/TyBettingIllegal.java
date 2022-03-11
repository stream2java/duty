package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 密钥信息
 * @TableName ty_betting_illegal
 */
@TableName(value ="ty_betting_illegal")
@Data
public class TyBettingIllegal implements Serializable {
    /**
     * 
     */
    @TableId(value = "illegal_id")
    private Object illegal_id;

    /**
     * 
     */
    @TableField(value = "key")
    private String key;

    /**
     * 
     */
    @TableField(value = "sdate")
    private LocalDateTime sdate;

    /**
     * 
     */
    @TableField(value = "edate")
    private LocalDateTime edate;

    /**
     * 非法密钥
     */
    @TableField(value = "illegal_key")
    private String illegal_key;

    /**
     * 原始密钥
     */
    @TableField(value = "original_key")
    private String original_key;

    /**
     * 发现信息
0-自动
1-手动
     */
    @TableField(value = "discover")
    private String discover;

    /**
     * 注单信息
     */
    @TableField(value = "betting_id")
    private Object betting_id;

    /**
     * 
     */
    @TableField(value = "cdate")
    private LocalDateTime cdate;

    /**
     * 
     */
    @TableField(value = "query_code")
    private Object query_code;

    /**
     * 
     */
    @TableField(value = "query_user")
    private Object query_user;

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
        TyBettingIllegal other = (TyBettingIllegal) that;
        return (this.getIllegal_id() == null ? other.getIllegal_id() == null : this.getIllegal_id().equals(other.getIllegal_id()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getSdate() == null ? other.getSdate() == null : this.getSdate().equals(other.getSdate()))
            && (this.getEdate() == null ? other.getEdate() == null : this.getEdate().equals(other.getEdate()))
            && (this.getIllegal_key() == null ? other.getIllegal_key() == null : this.getIllegal_key().equals(other.getIllegal_key()))
            && (this.getOriginal_key() == null ? other.getOriginal_key() == null : this.getOriginal_key().equals(other.getOriginal_key()))
            && (this.getDiscover() == null ? other.getDiscover() == null : this.getDiscover().equals(other.getDiscover()))
            && (this.getBetting_id() == null ? other.getBetting_id() == null : this.getBetting_id().equals(other.getBetting_id()))
            && (this.getCdate() == null ? other.getCdate() == null : this.getCdate().equals(other.getCdate()))
            && (this.getQuery_code() == null ? other.getQuery_code() == null : this.getQuery_code().equals(other.getQuery_code()))
            && (this.getQuery_user() == null ? other.getQuery_user() == null : this.getQuery_user().equals(other.getQuery_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIllegal_id() == null) ? 0 : getIllegal_id().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getSdate() == null) ? 0 : getSdate().hashCode());
        result = prime * result + ((getEdate() == null) ? 0 : getEdate().hashCode());
        result = prime * result + ((getIllegal_key() == null) ? 0 : getIllegal_key().hashCode());
        result = prime * result + ((getOriginal_key() == null) ? 0 : getOriginal_key().hashCode());
        result = prime * result + ((getDiscover() == null) ? 0 : getDiscover().hashCode());
        result = prime * result + ((getBetting_id() == null) ? 0 : getBetting_id().hashCode());
        result = prime * result + ((getCdate() == null) ? 0 : getCdate().hashCode());
        result = prime * result + ((getQuery_code() == null) ? 0 : getQuery_code().hashCode());
        result = prime * result + ((getQuery_user() == null) ? 0 : getQuery_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", illegal_id=").append(illegal_id);
        sb.append(", key=").append(key);
        sb.append(", sdate=").append(sdate);
        sb.append(", edate=").append(edate);
        sb.append(", illegal_key=").append(illegal_key);
        sb.append(", original_key=").append(original_key);
        sb.append(", discover=").append(discover);
        sb.append(", betting_id=").append(betting_id);
        sb.append(", cdate=").append(cdate);
        sb.append(", query_code=").append(query_code);
        sb.append(", query_user=").append(query_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}