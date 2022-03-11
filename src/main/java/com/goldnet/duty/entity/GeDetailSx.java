package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 此表预留，暂不使用
 * @TableName ge_detail_sx
 */
@TableName(value ="ge_detail_sx")
@Data
public class GeDetailSx implements Serializable {
    /**
     * 
     */
    @TableId(value = "detail_id")
    private Object detail_id;

    /**
     * 
     */
    @TableField(value = "desktop_id")
    private Object desktop_id;

    /**
     * 
     */
    @TableField(value = "project_max_money_xc")
    private Object project_max_money_xc;

    /**
     * 
     */
    @TableField(value = "single_max_money_xc")
    private Object single_max_money_xc;

    /**
     * 
     */
    @TableField(value = "min_money_xc")
    private Object min_money_xc;

    /**
     * 
     */
    @TableField(value = "project_max_money_xd")
    private Object project_max_money_xd;

    /**
     * 
     */
    @TableField(value = "single_max_money_xd")
    private Object single_max_money_xd;

    /**
     * 
     */
    @TableField(value = "min_money_xd")
    private Object min_money_xd;

    /**
     * 
     */
    @TableField(value = "project_max_money_xg")
    private Object project_max_money_xg;

    /**
     * 
     */
    @TableField(value = "single_max_money_xg")
    private Object single_max_money_xg;

    /**
     * 
     */
    @TableField(value = "min_money_xg")
    private Object min_money_xg;

    /**
     * 
     */
    @TableField(value = "project_max_money_zg")
    private Object project_max_money_zg;

    /**
     * 
     */
    @TableField(value = "single_max_money_zg")
    private Object single_max_money_zg;

    /**
     * 
     */
    @TableField(value = "min_money_zg")
    private Object min_money_zg;

    /**
     * 
     */
    @TableField(value = "project_max_money_zd")
    private Object project_max_money_zd;

    /**
     * 
     */
    @TableField(value = "single_max_money_zd")
    private Object single_max_money_zd;

    /**
     * 
     */
    @TableField(value = "min_money_zd")
    private Object min_money_zd;

    /**
     * 
     */
    @TableField(value = "project_max_money_zc")
    private Object project_max_money_zc;

    /**
     * 
     */
    @TableField(value = "single_max_money_zc")
    private Object single_max_money_zc;

    /**
     * 
     */
    @TableField(value = "min_money_zc")
    private Object min_money_zc;

    /**
     * 
     */
    @TableField(value = "project_max_money_b")
    private Object project_max_money_b;

    /**
     * 
     */
    @TableField(value = "single_max_money_b")
    private Object single_max_money_b;

    /**
     * 
     */
    @TableField(value = "min_money_b")
    private Object min_money_b;

    /**
     * 
     */
    @TableField(value = "project_max_money_h")
    private Object project_max_money_h;

    /**
     * 
     */
    @TableField(value = "single_max_money_h")
    private Object single_max_money_h;

    /**
     * 
     */
    @TableField(value = "min_money_h")
    private Object min_money_h;

    /**
     * 
     */
    @TableField(value = "project_max_money_a")
    private Object project_max_money_a;

    /**
     * 
     */
    @TableField(value = "single_max_money_a")
    private Object single_max_money_a;

    /**
     * 
     */
    @TableField(value = "min_money_a")
    private Object min_money_a;

    /**
     * 
     */
    @TableField(value = "project_max_money_x")
    private Object project_max_money_x;

    /**
     * 
     */
    @TableField(value = "single_max_money_x")
    private Object single_max_money_x;

    /**
     * 
     */
    @TableField(value = "min_money_x")
    private Object min_money_x;

    /**
     * 
     */
    @TableField(value = "project_max_money_z")
    private Object project_max_money_z;

    /**
     * 
     */
    @TableField(value = "single_max_money_z")
    private Object single_max_money_z;

    /**
     * 
     */
    @TableField(value = "min_money_z")
    private Object min_money_z;

    /**
     * 
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
        GeDetailSx other = (GeDetailSx) that;
        return (this.getDetail_id() == null ? other.getDetail_id() == null : this.getDetail_id().equals(other.getDetail_id()))
            && (this.getDesktop_id() == null ? other.getDesktop_id() == null : this.getDesktop_id().equals(other.getDesktop_id()))
            && (this.getProject_max_money_xc() == null ? other.getProject_max_money_xc() == null : this.getProject_max_money_xc().equals(other.getProject_max_money_xc()))
            && (this.getSingle_max_money_xc() == null ? other.getSingle_max_money_xc() == null : this.getSingle_max_money_xc().equals(other.getSingle_max_money_xc()))
            && (this.getMin_money_xc() == null ? other.getMin_money_xc() == null : this.getMin_money_xc().equals(other.getMin_money_xc()))
            && (this.getProject_max_money_xd() == null ? other.getProject_max_money_xd() == null : this.getProject_max_money_xd().equals(other.getProject_max_money_xd()))
            && (this.getSingle_max_money_xd() == null ? other.getSingle_max_money_xd() == null : this.getSingle_max_money_xd().equals(other.getSingle_max_money_xd()))
            && (this.getMin_money_xd() == null ? other.getMin_money_xd() == null : this.getMin_money_xd().equals(other.getMin_money_xd()))
            && (this.getProject_max_money_xg() == null ? other.getProject_max_money_xg() == null : this.getProject_max_money_xg().equals(other.getProject_max_money_xg()))
            && (this.getSingle_max_money_xg() == null ? other.getSingle_max_money_xg() == null : this.getSingle_max_money_xg().equals(other.getSingle_max_money_xg()))
            && (this.getMin_money_xg() == null ? other.getMin_money_xg() == null : this.getMin_money_xg().equals(other.getMin_money_xg()))
            && (this.getProject_max_money_zg() == null ? other.getProject_max_money_zg() == null : this.getProject_max_money_zg().equals(other.getProject_max_money_zg()))
            && (this.getSingle_max_money_zg() == null ? other.getSingle_max_money_zg() == null : this.getSingle_max_money_zg().equals(other.getSingle_max_money_zg()))
            && (this.getMin_money_zg() == null ? other.getMin_money_zg() == null : this.getMin_money_zg().equals(other.getMin_money_zg()))
            && (this.getProject_max_money_zd() == null ? other.getProject_max_money_zd() == null : this.getProject_max_money_zd().equals(other.getProject_max_money_zd()))
            && (this.getSingle_max_money_zd() == null ? other.getSingle_max_money_zd() == null : this.getSingle_max_money_zd().equals(other.getSingle_max_money_zd()))
            && (this.getMin_money_zd() == null ? other.getMin_money_zd() == null : this.getMin_money_zd().equals(other.getMin_money_zd()))
            && (this.getProject_max_money_zc() == null ? other.getProject_max_money_zc() == null : this.getProject_max_money_zc().equals(other.getProject_max_money_zc()))
            && (this.getSingle_max_money_zc() == null ? other.getSingle_max_money_zc() == null : this.getSingle_max_money_zc().equals(other.getSingle_max_money_zc()))
            && (this.getMin_money_zc() == null ? other.getMin_money_zc() == null : this.getMin_money_zc().equals(other.getMin_money_zc()))
            && (this.getProject_max_money_b() == null ? other.getProject_max_money_b() == null : this.getProject_max_money_b().equals(other.getProject_max_money_b()))
            && (this.getSingle_max_money_b() == null ? other.getSingle_max_money_b() == null : this.getSingle_max_money_b().equals(other.getSingle_max_money_b()))
            && (this.getMin_money_b() == null ? other.getMin_money_b() == null : this.getMin_money_b().equals(other.getMin_money_b()))
            && (this.getProject_max_money_h() == null ? other.getProject_max_money_h() == null : this.getProject_max_money_h().equals(other.getProject_max_money_h()))
            && (this.getSingle_max_money_h() == null ? other.getSingle_max_money_h() == null : this.getSingle_max_money_h().equals(other.getSingle_max_money_h()))
            && (this.getMin_money_h() == null ? other.getMin_money_h() == null : this.getMin_money_h().equals(other.getMin_money_h()))
            && (this.getProject_max_money_a() == null ? other.getProject_max_money_a() == null : this.getProject_max_money_a().equals(other.getProject_max_money_a()))
            && (this.getSingle_max_money_a() == null ? other.getSingle_max_money_a() == null : this.getSingle_max_money_a().equals(other.getSingle_max_money_a()))
            && (this.getMin_money_a() == null ? other.getMin_money_a() == null : this.getMin_money_a().equals(other.getMin_money_a()))
            && (this.getProject_max_money_x() == null ? other.getProject_max_money_x() == null : this.getProject_max_money_x().equals(other.getProject_max_money_x()))
            && (this.getSingle_max_money_x() == null ? other.getSingle_max_money_x() == null : this.getSingle_max_money_x().equals(other.getSingle_max_money_x()))
            && (this.getMin_money_x() == null ? other.getMin_money_x() == null : this.getMin_money_x().equals(other.getMin_money_x()))
            && (this.getProject_max_money_z() == null ? other.getProject_max_money_z() == null : this.getProject_max_money_z().equals(other.getProject_max_money_z()))
            && (this.getSingle_max_money_z() == null ? other.getSingle_max_money_z() == null : this.getSingle_max_money_z().equals(other.getSingle_max_money_z()))
            && (this.getMin_money_z() == null ? other.getMin_money_z() == null : this.getMin_money_z().equals(other.getMin_money_z()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetail_id() == null) ? 0 : getDetail_id().hashCode());
        result = prime * result + ((getDesktop_id() == null) ? 0 : getDesktop_id().hashCode());
        result = prime * result + ((getProject_max_money_xc() == null) ? 0 : getProject_max_money_xc().hashCode());
        result = prime * result + ((getSingle_max_money_xc() == null) ? 0 : getSingle_max_money_xc().hashCode());
        result = prime * result + ((getMin_money_xc() == null) ? 0 : getMin_money_xc().hashCode());
        result = prime * result + ((getProject_max_money_xd() == null) ? 0 : getProject_max_money_xd().hashCode());
        result = prime * result + ((getSingle_max_money_xd() == null) ? 0 : getSingle_max_money_xd().hashCode());
        result = prime * result + ((getMin_money_xd() == null) ? 0 : getMin_money_xd().hashCode());
        result = prime * result + ((getProject_max_money_xg() == null) ? 0 : getProject_max_money_xg().hashCode());
        result = prime * result + ((getSingle_max_money_xg() == null) ? 0 : getSingle_max_money_xg().hashCode());
        result = prime * result + ((getMin_money_xg() == null) ? 0 : getMin_money_xg().hashCode());
        result = prime * result + ((getProject_max_money_zg() == null) ? 0 : getProject_max_money_zg().hashCode());
        result = prime * result + ((getSingle_max_money_zg() == null) ? 0 : getSingle_max_money_zg().hashCode());
        result = prime * result + ((getMin_money_zg() == null) ? 0 : getMin_money_zg().hashCode());
        result = prime * result + ((getProject_max_money_zd() == null) ? 0 : getProject_max_money_zd().hashCode());
        result = prime * result + ((getSingle_max_money_zd() == null) ? 0 : getSingle_max_money_zd().hashCode());
        result = prime * result + ((getMin_money_zd() == null) ? 0 : getMin_money_zd().hashCode());
        result = prime * result + ((getProject_max_money_zc() == null) ? 0 : getProject_max_money_zc().hashCode());
        result = prime * result + ((getSingle_max_money_zc() == null) ? 0 : getSingle_max_money_zc().hashCode());
        result = prime * result + ((getMin_money_zc() == null) ? 0 : getMin_money_zc().hashCode());
        result = prime * result + ((getProject_max_money_b() == null) ? 0 : getProject_max_money_b().hashCode());
        result = prime * result + ((getSingle_max_money_b() == null) ? 0 : getSingle_max_money_b().hashCode());
        result = prime * result + ((getMin_money_b() == null) ? 0 : getMin_money_b().hashCode());
        result = prime * result + ((getProject_max_money_h() == null) ? 0 : getProject_max_money_h().hashCode());
        result = prime * result + ((getSingle_max_money_h() == null) ? 0 : getSingle_max_money_h().hashCode());
        result = prime * result + ((getMin_money_h() == null) ? 0 : getMin_money_h().hashCode());
        result = prime * result + ((getProject_max_money_a() == null) ? 0 : getProject_max_money_a().hashCode());
        result = prime * result + ((getSingle_max_money_a() == null) ? 0 : getSingle_max_money_a().hashCode());
        result = prime * result + ((getMin_money_a() == null) ? 0 : getMin_money_a().hashCode());
        result = prime * result + ((getProject_max_money_x() == null) ? 0 : getProject_max_money_x().hashCode());
        result = prime * result + ((getSingle_max_money_x() == null) ? 0 : getSingle_max_money_x().hashCode());
        result = prime * result + ((getMin_money_x() == null) ? 0 : getMin_money_x().hashCode());
        result = prime * result + ((getProject_max_money_z() == null) ? 0 : getProject_max_money_z().hashCode());
        result = prime * result + ((getSingle_max_money_z() == null) ? 0 : getSingle_max_money_z().hashCode());
        result = prime * result + ((getMin_money_z() == null) ? 0 : getMin_money_z().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detail_id=").append(detail_id);
        sb.append(", desktop_id=").append(desktop_id);
        sb.append(", project_max_money_xc=").append(project_max_money_xc);
        sb.append(", single_max_money_xc=").append(single_max_money_xc);
        sb.append(", min_money_xc=").append(min_money_xc);
        sb.append(", project_max_money_xd=").append(project_max_money_xd);
        sb.append(", single_max_money_xd=").append(single_max_money_xd);
        sb.append(", min_money_xd=").append(min_money_xd);
        sb.append(", project_max_money_xg=").append(project_max_money_xg);
        sb.append(", single_max_money_xg=").append(single_max_money_xg);
        sb.append(", min_money_xg=").append(min_money_xg);
        sb.append(", project_max_money_zg=").append(project_max_money_zg);
        sb.append(", single_max_money_zg=").append(single_max_money_zg);
        sb.append(", min_money_zg=").append(min_money_zg);
        sb.append(", project_max_money_zd=").append(project_max_money_zd);
        sb.append(", single_max_money_zd=").append(single_max_money_zd);
        sb.append(", min_money_zd=").append(min_money_zd);
        sb.append(", project_max_money_zc=").append(project_max_money_zc);
        sb.append(", single_max_money_zc=").append(single_max_money_zc);
        sb.append(", min_money_zc=").append(min_money_zc);
        sb.append(", project_max_money_b=").append(project_max_money_b);
        sb.append(", single_max_money_b=").append(single_max_money_b);
        sb.append(", min_money_b=").append(min_money_b);
        sb.append(", project_max_money_h=").append(project_max_money_h);
        sb.append(", single_max_money_h=").append(single_max_money_h);
        sb.append(", min_money_h=").append(min_money_h);
        sb.append(", project_max_money_a=").append(project_max_money_a);
        sb.append(", single_max_money_a=").append(single_max_money_a);
        sb.append(", min_money_a=").append(min_money_a);
        sb.append(", project_max_money_x=").append(project_max_money_x);
        sb.append(", single_max_money_x=").append(single_max_money_x);
        sb.append(", min_money_x=").append(min_money_x);
        sb.append(", project_max_money_z=").append(project_max_money_z);
        sb.append(", single_max_money_z=").append(single_max_money_z);
        sb.append(", min_money_z=").append(min_money_z);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}