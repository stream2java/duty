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
 * 返水优惠设定组别表
 * @TableName mny_back_pre_set_type
 */
@TableName(value ="mny_back_pre_set_type")
@Data
public class MnyBackPreSetType implements Serializable {
    /**
     * 分类ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 大大股东id
     */
    @TableId(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 分类名称
     */
    @TableField(value = "category_name")
    private String category_name;

    /**
     * 等级
     */
    @TableField(value = "rate")
    private Object rate;

    /**
     * 父分类ID
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 层级ID，可支持多个
     */
    @TableField(value = "realtime_level_ids")
    private Object realtime_level_ids;

    /**
     * 稽核倍数
     */
    @TableField(value = "check_num")
    private Object check_num;

    /**
     * 是否开启此群组，作用到时时返水, 1表示启用，0表示停用
     */
    @TableField(value = "enable_realtime")
    private Integer enable_realtime;

    /**
     * 会员类型,作用到时时返水
     */
    @TableField(value = "account_type_realtime")
    private String account_type_realtime;

    /**
     * 时时返水最低可领取金额
     */
    @TableField(value = "min_realtime_pre")
    private BigDecimal min_realtime_pre;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

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
        MnyBackPreSetType other = (MnyBackPreSetType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getCategory_name() == null ? other.getCategory_name() == null : this.getCategory_name().equals(other.getCategory_name()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getRealtime_level_ids() == null ? other.getRealtime_level_ids() == null : this.getRealtime_level_ids().equals(other.getRealtime_level_ids()))
            && (this.getCheck_num() == null ? other.getCheck_num() == null : this.getCheck_num().equals(other.getCheck_num()))
            && (this.getEnable_realtime() == null ? other.getEnable_realtime() == null : this.getEnable_realtime().equals(other.getEnable_realtime()))
            && (this.getAccount_type_realtime() == null ? other.getAccount_type_realtime() == null : this.getAccount_type_realtime().equals(other.getAccount_type_realtime()))
            && (this.getMin_realtime_pre() == null ? other.getMin_realtime_pre() == null : this.getMin_realtime_pre().equals(other.getMin_realtime_pre()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getCategory_name() == null) ? 0 : getCategory_name().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getRealtime_level_ids() == null) ? 0 : getRealtime_level_ids().hashCode());
        result = prime * result + ((getCheck_num() == null) ? 0 : getCheck_num().hashCode());
        result = prime * result + ((getEnable_realtime() == null) ? 0 : getEnable_realtime().hashCode());
        result = prime * result + ((getAccount_type_realtime() == null) ? 0 : getAccount_type_realtime().hashCode());
        result = prime * result + ((getMin_realtime_pre() == null) ? 0 : getMin_realtime_pre().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", category_name=").append(category_name);
        sb.append(", rate=").append(rate);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", sort=").append(sort);
        sb.append(", realtime_level_ids=").append(realtime_level_ids);
        sb.append(", check_num=").append(check_num);
        sb.append(", enable_realtime=").append(enable_realtime);
        sb.append(", account_type_realtime=").append(account_type_realtime);
        sb.append(", min_realtime_pre=").append(min_realtime_pre);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}