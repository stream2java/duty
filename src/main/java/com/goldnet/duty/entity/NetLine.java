package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName net_line
 */
@TableName(value ="net_line")
@Data
public class NetLine implements Serializable {
    /**
     * 线路Id
     */
    @TableId(value = "net_line_id")
    private Object net_line_id;

    /**
     * 网址名称
     */
    @TableField(value = "website_name")
    private String website_name;

    /**
     * 排序因子
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 大大股东ID
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 网址类型:1 pc网址, 2,H5 网址
     */
    @TableField(value = "type")
    private Object type;

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
        NetLine other = (NetLine) that;
        return (this.getNet_line_id() == null ? other.getNet_line_id() == null : this.getNet_line_id().equals(other.getNet_line_id()))
            && (this.getWebsite_name() == null ? other.getWebsite_name() == null : this.getWebsite_name().equals(other.getWebsite_name()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNet_line_id() == null) ? 0 : getNet_line_id().hashCode());
        result = prime * result + ((getWebsite_name() == null) ? 0 : getWebsite_name().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", net_line_id=").append(net_line_id);
        sb.append(", website_name=").append(website_name);
        sb.append(", sort=").append(sort);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}