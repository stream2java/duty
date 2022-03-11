package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 文章分类表
 * @TableName sys_article_category
 */
@TableName(value ="sys_article_category")
@Data
public class SysArticleCategory implements Serializable {
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
        SysArticleCategory other = (SysArticleCategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getCategory_name() == null ? other.getCategory_name() == null : this.getCategory_name().equals(other.getCategory_name()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}