package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 系统配置文件表
 * @TableName gold_config
 */
@TableName(value ="gold_config")
@Data
public class GoldConfig implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 系统名称
     */
    @TableField(value = "sys_name")
    private String sys_name;

    /**
     * 文件名称
     */
    @TableField(value = "file_name")
    private String file_name;

    /**
     * key名称
     */
    @TableField(value = "key_name")
    private String key_name;

    /**
     * key对应的value值
     */
    @TableField(value = "value_name")
    private String value_name;

    /**
     * key对应的备注
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
        GoldConfig other = (GoldConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSys_name() == null ? other.getSys_name() == null : this.getSys_name().equals(other.getSys_name()))
            && (this.getFile_name() == null ? other.getFile_name() == null : this.getFile_name().equals(other.getFile_name()))
            && (this.getKey_name() == null ? other.getKey_name() == null : this.getKey_name().equals(other.getKey_name()))
            && (this.getValue_name() == null ? other.getValue_name() == null : this.getValue_name().equals(other.getValue_name()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSys_name() == null) ? 0 : getSys_name().hashCode());
        result = prime * result + ((getFile_name() == null) ? 0 : getFile_name().hashCode());
        result = prime * result + ((getKey_name() == null) ? 0 : getKey_name().hashCode());
        result = prime * result + ((getValue_name() == null) ? 0 : getValue_name().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sys_name=").append(sys_name);
        sb.append(", file_name=").append(file_name);
        sb.append(", key_name=").append(key_name);
        sb.append(", value_name=").append(value_name);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}