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
 * 返水优惠设定表
 * @TableName mny_back_pre_set
 */
@TableName(value ="mny_back_pre_set")
@Data
public class MnyBackPreSet implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 有效 总投注
     */
    @TableField(value = "valid_total_bet")
    private BigDecimal valid_total_bet;

    /**
     * 优惠上限
     */
    @TableField(value = "pre_up_limit")
    private BigDecimal pre_up_limit;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 大大股东
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 返水优惠组别ID
     */
    @TableField(value = "set_type_id")
    private Object set_type_id;

    /**
     * 六合彩系列优惠
     */
    @TableField(value = "lhc_pre_per")
    private BigDecimal lhc_pre_per;

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
        MnyBackPreSet other = (MnyBackPreSet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getValid_total_bet() == null ? other.getValid_total_bet() == null : this.getValid_total_bet().equals(other.getValid_total_bet()))
            && (this.getPre_up_limit() == null ? other.getPre_up_limit() == null : this.getPre_up_limit().equals(other.getPre_up_limit()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getSet_type_id() == null ? other.getSet_type_id() == null : this.getSet_type_id().equals(other.getSet_type_id()))
            && (this.getLhc_pre_per() == null ? other.getLhc_pre_per() == null : this.getLhc_pre_per().equals(other.getLhc_pre_per()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getValid_total_bet() == null) ? 0 : getValid_total_bet().hashCode());
        result = prime * result + ((getPre_up_limit() == null) ? 0 : getPre_up_limit().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getSet_type_id() == null) ? 0 : getSet_type_id().hashCode());
        result = prime * result + ((getLhc_pre_per() == null) ? 0 : getLhc_pre_per().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", valid_total_bet=").append(valid_total_bet);
        sb.append(", pre_up_limit=").append(pre_up_limit);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", set_type_id=").append(set_type_id);
        sb.append(", lhc_pre_per=").append(lhc_pre_per);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}