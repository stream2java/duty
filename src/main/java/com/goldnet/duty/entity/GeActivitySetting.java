package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 活动设置表
 * @TableName ge_activity_setting
 */
@TableName(value ="ge_activity_setting")
@Data
public class GeActivitySetting implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 活动是否开启：0-关闭，1-开启
     */
    @TableField(value = "activity_enable")
    private Integer activity_enable;

    /**
     * 层级
     */
    @TableField(value = "level_ids")
    private Object level_ids;

    /**
     * PC端活动规则
     */
    @TableField(value = "pc_rule")
    private String pc_rule;

    /**
     * 移动端规则
     */
    @TableField(value = "wap_rule")
    private String wap_rule;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 是否全部选中层级，0-全部，1-部分
     */
    @TableField(value = "level_type")
    private Integer level_type;

    /**
     * 移动端规则-预览
     */
    @TableField(value = "wap_rule_temp")
    private String wap_rule_temp;

    /**
     * PC端活动规则-预览
     */
    @TableField(value = "pc_rule_temp")
    private String pc_rule_temp;

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
        GeActivitySetting other = (GeActivitySetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getActivity_enable() == null ? other.getActivity_enable() == null : this.getActivity_enable().equals(other.getActivity_enable()))
            && (this.getLevel_ids() == null ? other.getLevel_ids() == null : this.getLevel_ids().equals(other.getLevel_ids()))
            && (this.getPc_rule() == null ? other.getPc_rule() == null : this.getPc_rule().equals(other.getPc_rule()))
            && (this.getWap_rule() == null ? other.getWap_rule() == null : this.getWap_rule().equals(other.getWap_rule()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getLevel_type() == null ? other.getLevel_type() == null : this.getLevel_type().equals(other.getLevel_type()))
            && (this.getWap_rule_temp() == null ? other.getWap_rule_temp() == null : this.getWap_rule_temp().equals(other.getWap_rule_temp()))
            && (this.getPc_rule_temp() == null ? other.getPc_rule_temp() == null : this.getPc_rule_temp().equals(other.getPc_rule_temp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getActivity_enable() == null) ? 0 : getActivity_enable().hashCode());
        result = prime * result + ((getLevel_ids() == null) ? 0 : getLevel_ids().hashCode());
        result = prime * result + ((getPc_rule() == null) ? 0 : getPc_rule().hashCode());
        result = prime * result + ((getWap_rule() == null) ? 0 : getWap_rule().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getLevel_type() == null) ? 0 : getLevel_type().hashCode());
        result = prime * result + ((getWap_rule_temp() == null) ? 0 : getWap_rule_temp().hashCode());
        result = prime * result + ((getPc_rule_temp() == null) ? 0 : getPc_rule_temp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account1=").append(account1);
        sb.append(", activity_enable=").append(activity_enable);
        sb.append(", level_ids=").append(level_ids);
        sb.append(", pc_rule=").append(pc_rule);
        sb.append(", wap_rule=").append(wap_rule);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", level_type=").append(level_type);
        sb.append(", wap_rule_temp=").append(wap_rule_temp);
        sb.append(", pc_rule_temp=").append(pc_rule_temp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}