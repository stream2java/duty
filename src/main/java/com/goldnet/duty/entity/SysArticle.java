package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 文章管理表
 * @TableName sys_article
 */
@TableName(value ="sys_article")
@Data
public class SysArticle implements Serializable {
    /**
     * 文章id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 大大股东id
     */
    @TableId(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 作者
     */
    @TableField(value = "author")
    private String author;

    /**
     * 内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 阅读次数
     */
    @TableField(value = "read_num")
    private Object read_num;

    /**
     * 发布时间
     */
    @TableField(value = "release_time")
    private LocalDateTime release_time;

    /**
     * 来源
     */
    @TableField(value = "source")
    private String source;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 分类ID
     */
    @TableField(value = "category_id")
    private Object category_id;

    /**
     * 游戏ID
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 
     */
    @TableField(value = "in_logo_pic")
    private String in_logo_pic;

    /**
     * 
     */
    @TableField(value = "out_logo_pic")
    private String out_logo_pic;

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
        SysArticle other = (SysArticle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getRead_num() == null ? other.getRead_num() == null : this.getRead_num().equals(other.getRead_num()))
            && (this.getRelease_time() == null ? other.getRelease_time() == null : this.getRelease_time().equals(other.getRelease_time()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getIn_logo_pic() == null ? other.getIn_logo_pic() == null : this.getIn_logo_pic().equals(other.getIn_logo_pic()))
            && (this.getOut_logo_pic() == null ? other.getOut_logo_pic() == null : this.getOut_logo_pic().equals(other.getOut_logo_pic()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getRead_num() == null) ? 0 : getRead_num().hashCode());
        result = prime * result + ((getRelease_time() == null) ? 0 : getRelease_time().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getIn_logo_pic() == null) ? 0 : getIn_logo_pic().hashCode());
        result = prime * result + ((getOut_logo_pic() == null) ? 0 : getOut_logo_pic().hashCode());
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
        sb.append(", author=").append(author);
        sb.append(", content=").append(content);
        sb.append(", read_num=").append(read_num);
        sb.append(", release_time=").append(release_time);
        sb.append(", source=").append(source);
        sb.append(", title=").append(title);
        sb.append(", category_id=").append(category_id);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", in_logo_pic=").append(in_logo_pic);
        sb.append(", out_logo_pic=").append(out_logo_pic);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}