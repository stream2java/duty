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
 * @TableName mny_check_record
 */
@TableName(value ="mny_check_record")
@Data
public class MnyCheckRecord implements Serializable {
    /**
     * 
     */
    @TableId(value = "record_id")
    private Object record_id;

    /**
     * 
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 
     */
    @TableField(value = "time_start")
    private LocalDateTime time_start;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "content")
    private String content;

    /**
     * 大大股东ID
     */
    @TableField(value = "ddgd_id")
    private Object ddgd_id;

    /**
     * 结束时间
     */
    @TableField(value = "time_end")
    private LocalDateTime time_end;

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
        MnyCheckRecord other = (MnyCheckRecord) that;
        return (this.getRecord_id() == null ? other.getRecord_id() == null : this.getRecord_id().equals(other.getRecord_id()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getTime_start() == null ? other.getTime_start() == null : this.getTime_start().equals(other.getTime_start()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDdgd_id() == null ? other.getDdgd_id() == null : this.getDdgd_id().equals(other.getDdgd_id()))
            && (this.getTime_end() == null ? other.getTime_end() == null : this.getTime_end().equals(other.getTime_end()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecord_id() == null) ? 0 : getRecord_id().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getTime_start() == null) ? 0 : getTime_start().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDdgd_id() == null) ? 0 : getDdgd_id().hashCode());
        result = prime * result + ((getTime_end() == null) ? 0 : getTime_end().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", record_id=").append(record_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", time_start=").append(time_start);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", remark=").append(remark);
        sb.append(", content=").append(content);
        sb.append(", ddgd_id=").append(ddgd_id);
        sb.append(", time_end=").append(time_end);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}