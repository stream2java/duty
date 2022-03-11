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
 * 层级管理
 * @TableName mny_levelmanagement
 */
@TableName(value ="mny_levelmanagement")
@Data
public class MnyLevelmanagement implements Serializable {
    /**
     * 层级的id 
     */
    @TableId(value = "levelmanagement_id")
    private Object levelmanagement_id;

    /**
     * 层级的名称
     */
    @TableField(value = "level_name")
    private String level_name;

    /**
     * 层级的描述
     */
    @TableField(value = "level_description")
    private String level_description;

    /**
     * 会员加入期间(上限)
     */
    @TableField(value = "level_join_top")
    private LocalDateTime level_join_top;

    /**
     * 会员加入期间(下限)
     */
    @TableField(value = "level_join_down")
    private LocalDateTime level_join_down;

    /**
     * 存款次数
     */
    @TableField(value = "level_depositnum")
    private Object level_depositnum;

    /**
     * 存款总额
     */
    @TableField(value = "level_deposittotal")
    private BigDecimal level_deposittotal;

    /**
     * 最大存款额度
     */
    @TableField(value = "level_maxdeposit")
    private BigDecimal level_maxdeposit;

    /**
     * 提取次数
     */
    @TableField(value = "level_collectnum")
    private Object level_collectnum;

    /**
     * 提取总额
     */
    @TableField(value = "level_collecttotal")
    private BigDecimal level_collecttotal;

    /**
     * 备注
     */
    @TableField(value = "level_remark")
    private String level_remark;

    /**
     * 创建人
     */
    @TableField(value = "level_founder")
    private String level_founder;

    /**
     * 创建时间
     */
    @TableField(value = "level_foundtime")
    private LocalDateTime level_foundtime;

    /**
     * 修改人
     */
    @TableField(value = "level_moder")
    private String level_moder;

    /**
     * 修改时间
     */
    @TableField(value = "level_modtime")
    private LocalDateTime level_modtime;

    /**
     * 最后更新时间
     */
    @TableField(value = "level_replacetime")
    private LocalDateTime level_replacetime;

    /**
     * 大大股东的id
     */
    @TableField(value = "level_ddstockholder")
    private Object level_ddstockholder;

    /**
     * 金流启用状态,1:启用,0停用
     */
    @TableField(value = "count_status")
    private Object count_status;

    /**
     * 排序
     */
    @TableField(value = "level_sort")
    private Object level_sort;

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
        MnyLevelmanagement other = (MnyLevelmanagement) that;
        return (this.getLevelmanagement_id() == null ? other.getLevelmanagement_id() == null : this.getLevelmanagement_id().equals(other.getLevelmanagement_id()))
            && (this.getLevel_name() == null ? other.getLevel_name() == null : this.getLevel_name().equals(other.getLevel_name()))
            && (this.getLevel_description() == null ? other.getLevel_description() == null : this.getLevel_description().equals(other.getLevel_description()))
            && (this.getLevel_join_top() == null ? other.getLevel_join_top() == null : this.getLevel_join_top().equals(other.getLevel_join_top()))
            && (this.getLevel_join_down() == null ? other.getLevel_join_down() == null : this.getLevel_join_down().equals(other.getLevel_join_down()))
            && (this.getLevel_depositnum() == null ? other.getLevel_depositnum() == null : this.getLevel_depositnum().equals(other.getLevel_depositnum()))
            && (this.getLevel_deposittotal() == null ? other.getLevel_deposittotal() == null : this.getLevel_deposittotal().equals(other.getLevel_deposittotal()))
            && (this.getLevel_maxdeposit() == null ? other.getLevel_maxdeposit() == null : this.getLevel_maxdeposit().equals(other.getLevel_maxdeposit()))
            && (this.getLevel_collectnum() == null ? other.getLevel_collectnum() == null : this.getLevel_collectnum().equals(other.getLevel_collectnum()))
            && (this.getLevel_collecttotal() == null ? other.getLevel_collecttotal() == null : this.getLevel_collecttotal().equals(other.getLevel_collecttotal()))
            && (this.getLevel_remark() == null ? other.getLevel_remark() == null : this.getLevel_remark().equals(other.getLevel_remark()))
            && (this.getLevel_founder() == null ? other.getLevel_founder() == null : this.getLevel_founder().equals(other.getLevel_founder()))
            && (this.getLevel_foundtime() == null ? other.getLevel_foundtime() == null : this.getLevel_foundtime().equals(other.getLevel_foundtime()))
            && (this.getLevel_moder() == null ? other.getLevel_moder() == null : this.getLevel_moder().equals(other.getLevel_moder()))
            && (this.getLevel_modtime() == null ? other.getLevel_modtime() == null : this.getLevel_modtime().equals(other.getLevel_modtime()))
            && (this.getLevel_replacetime() == null ? other.getLevel_replacetime() == null : this.getLevel_replacetime().equals(other.getLevel_replacetime()))
            && (this.getLevel_ddstockholder() == null ? other.getLevel_ddstockholder() == null : this.getLevel_ddstockholder().equals(other.getLevel_ddstockholder()))
            && (this.getCount_status() == null ? other.getCount_status() == null : this.getCount_status().equals(other.getCount_status()))
            && (this.getLevel_sort() == null ? other.getLevel_sort() == null : this.getLevel_sort().equals(other.getLevel_sort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLevelmanagement_id() == null) ? 0 : getLevelmanagement_id().hashCode());
        result = prime * result + ((getLevel_name() == null) ? 0 : getLevel_name().hashCode());
        result = prime * result + ((getLevel_description() == null) ? 0 : getLevel_description().hashCode());
        result = prime * result + ((getLevel_join_top() == null) ? 0 : getLevel_join_top().hashCode());
        result = prime * result + ((getLevel_join_down() == null) ? 0 : getLevel_join_down().hashCode());
        result = prime * result + ((getLevel_depositnum() == null) ? 0 : getLevel_depositnum().hashCode());
        result = prime * result + ((getLevel_deposittotal() == null) ? 0 : getLevel_deposittotal().hashCode());
        result = prime * result + ((getLevel_maxdeposit() == null) ? 0 : getLevel_maxdeposit().hashCode());
        result = prime * result + ((getLevel_collectnum() == null) ? 0 : getLevel_collectnum().hashCode());
        result = prime * result + ((getLevel_collecttotal() == null) ? 0 : getLevel_collecttotal().hashCode());
        result = prime * result + ((getLevel_remark() == null) ? 0 : getLevel_remark().hashCode());
        result = prime * result + ((getLevel_founder() == null) ? 0 : getLevel_founder().hashCode());
        result = prime * result + ((getLevel_foundtime() == null) ? 0 : getLevel_foundtime().hashCode());
        result = prime * result + ((getLevel_moder() == null) ? 0 : getLevel_moder().hashCode());
        result = prime * result + ((getLevel_modtime() == null) ? 0 : getLevel_modtime().hashCode());
        result = prime * result + ((getLevel_replacetime() == null) ? 0 : getLevel_replacetime().hashCode());
        result = prime * result + ((getLevel_ddstockholder() == null) ? 0 : getLevel_ddstockholder().hashCode());
        result = prime * result + ((getCount_status() == null) ? 0 : getCount_status().hashCode());
        result = prime * result + ((getLevel_sort() == null) ? 0 : getLevel_sort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", levelmanagement_id=").append(levelmanagement_id);
        sb.append(", level_name=").append(level_name);
        sb.append(", level_description=").append(level_description);
        sb.append(", level_join_top=").append(level_join_top);
        sb.append(", level_join_down=").append(level_join_down);
        sb.append(", level_depositnum=").append(level_depositnum);
        sb.append(", level_deposittotal=").append(level_deposittotal);
        sb.append(", level_maxdeposit=").append(level_maxdeposit);
        sb.append(", level_collectnum=").append(level_collectnum);
        sb.append(", level_collecttotal=").append(level_collecttotal);
        sb.append(", level_remark=").append(level_remark);
        sb.append(", level_founder=").append(level_founder);
        sb.append(", level_foundtime=").append(level_foundtime);
        sb.append(", level_moder=").append(level_moder);
        sb.append(", level_modtime=").append(level_modtime);
        sb.append(", level_replacetime=").append(level_replacetime);
        sb.append(", level_ddstockholder=").append(level_ddstockholder);
        sb.append(", count_status=").append(count_status);
        sb.append(", level_sort=").append(level_sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}