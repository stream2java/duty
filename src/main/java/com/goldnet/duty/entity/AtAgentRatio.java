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
 * 代理占成
 * @TableName at_agent_ratio
 */
@TableName(value ="at_agent_ratio")
@Data
public class AtAgentRatio implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 实际占成
     */
    @TableField(value = "actual_ratio")
    private BigDecimal actual_ratio;

    /**
     * 占成走飞状态 0默认开启,1默认关闭 （预留字段）
     */
    @TableField(value = "thows_ratio_open")
    private String thows_ratio_open;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 代理商id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 是否级联更新
     */
    @TableField(value = "is_cascade")
    private String is_cascade;

    /**
     * 
     */
    @TableField(value = "category_code")
    private String category_code;

    /**
     * 上级给我最大占成
     */
    @TableField(value = "max_ratio")
    private BigDecimal max_ratio;

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
        AtAgentRatio other = (AtAgentRatio) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActual_ratio() == null ? other.getActual_ratio() == null : this.getActual_ratio().equals(other.getActual_ratio()))
            && (this.getThows_ratio_open() == null ? other.getThows_ratio_open() == null : this.getThows_ratio_open().equals(other.getThows_ratio_open()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getIs_cascade() == null ? other.getIs_cascade() == null : this.getIs_cascade().equals(other.getIs_cascade()))
            && (this.getCategory_code() == null ? other.getCategory_code() == null : this.getCategory_code().equals(other.getCategory_code()))
            && (this.getMax_ratio() == null ? other.getMax_ratio() == null : this.getMax_ratio().equals(other.getMax_ratio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActual_ratio() == null) ? 0 : getActual_ratio().hashCode());
        result = prime * result + ((getThows_ratio_open() == null) ? 0 : getThows_ratio_open().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getIs_cascade() == null) ? 0 : getIs_cascade().hashCode());
        result = prime * result + ((getCategory_code() == null) ? 0 : getCategory_code().hashCode());
        result = prime * result + ((getMax_ratio() == null) ? 0 : getMax_ratio().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", actual_ratio=").append(actual_ratio);
        sb.append(", thows_ratio_open=").append(thows_ratio_open);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", account_id=").append(account_id);
        sb.append(", is_cascade=").append(is_cascade);
        sb.append(", category_code=").append(category_code);
        sb.append(", max_ratio=").append(max_ratio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}