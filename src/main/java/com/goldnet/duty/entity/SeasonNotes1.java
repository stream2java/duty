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
 * @TableName season_notes1
 */
@TableName(value ="season_notes1")
@Data
public class SeasonNotes1 implements Serializable {
    /**
     * 
     */
    @TableId(value = "a_one")
    private Object a_one;

    /**
     * 
     */
    @TableField(value = "b_two")
    private String b_two;

    /**
     * 
     */
    @TableField(value = "c_three")
    private String c_three;

    /**
     * 
     */
    @TableField(value = "d_four")
    private String d_four;

    /**
     * 
     */
    @TableField(value = "e_create_date")
    private LocalDateTime e_create_date;

    /**
     * 
     */
    @TableField(value = "f_status")
    private Object f_status;

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
        SeasonNotes1 other = (SeasonNotes1) that;
        return (this.getA_one() == null ? other.getA_one() == null : this.getA_one().equals(other.getA_one()))
            && (this.getB_two() == null ? other.getB_two() == null : this.getB_two().equals(other.getB_two()))
            && (this.getC_three() == null ? other.getC_three() == null : this.getC_three().equals(other.getC_three()))
            && (this.getD_four() == null ? other.getD_four() == null : this.getD_four().equals(other.getD_four()))
            && (this.getE_create_date() == null ? other.getE_create_date() == null : this.getE_create_date().equals(other.getE_create_date()))
            && (this.getF_status() == null ? other.getF_status() == null : this.getF_status().equals(other.getF_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getA_one() == null) ? 0 : getA_one().hashCode());
        result = prime * result + ((getB_two() == null) ? 0 : getB_two().hashCode());
        result = prime * result + ((getC_three() == null) ? 0 : getC_three().hashCode());
        result = prime * result + ((getD_four() == null) ? 0 : getD_four().hashCode());
        result = prime * result + ((getE_create_date() == null) ? 0 : getE_create_date().hashCode());
        result = prime * result + ((getF_status() == null) ? 0 : getF_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", a_one=").append(a_one);
        sb.append(", b_two=").append(b_two);
        sb.append(", c_three=").append(c_three);
        sb.append(", d_four=").append(d_four);
        sb.append(", e_create_date=").append(e_create_date);
        sb.append(", f_status=").append(f_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}