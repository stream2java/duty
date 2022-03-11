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
 * @TableName mny_customize
 */
@TableName(value ="mny_customize")
@Data
public class MnyCustomize implements Serializable {
    /**
     * 厅主自定设定表id
     */
    @TableId(value = "customize_id")
    private Object customize_id;

    /**
     * 编号
     */
    @TableField(value = "customize_no")
    private String customize_no;

    /**
     * 名称
     */
    @TableField(value = "customize_name")
    private String customize_name;

    /**
     * 排序
     */
    @TableField(value = "customize_sort")
    private Object customize_sort;

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
     * 删除标识：0-删除1-未删除
     */
    @TableField(value = "delete_flag")
    private Object delete_flag;

    /**
     * 大大股东ID
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "uuid")
    private String uuid;

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
        MnyCustomize other = (MnyCustomize) that;
        return (this.getCustomize_id() == null ? other.getCustomize_id() == null : this.getCustomize_id().equals(other.getCustomize_id()))
            && (this.getCustomize_no() == null ? other.getCustomize_no() == null : this.getCustomize_no().equals(other.getCustomize_no()))
            && (this.getCustomize_name() == null ? other.getCustomize_name() == null : this.getCustomize_name().equals(other.getCustomize_name()))
            && (this.getCustomize_sort() == null ? other.getCustomize_sort() == null : this.getCustomize_sort().equals(other.getCustomize_sort()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDelete_flag() == null ? other.getDelete_flag() == null : this.getDelete_flag().equals(other.getDelete_flag()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomize_id() == null) ? 0 : getCustomize_id().hashCode());
        result = prime * result + ((getCustomize_no() == null) ? 0 : getCustomize_no().hashCode());
        result = prime * result + ((getCustomize_name() == null) ? 0 : getCustomize_name().hashCode());
        result = prime * result + ((getCustomize_sort() == null) ? 0 : getCustomize_sort().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDelete_flag() == null) ? 0 : getDelete_flag().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customize_id=").append(customize_id);
        sb.append(", customize_no=").append(customize_no);
        sb.append(", customize_name=").append(customize_name);
        sb.append(", customize_sort=").append(customize_sort);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", delete_flag=").append(delete_flag);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", uuid=").append(uuid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}