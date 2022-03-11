package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 详细设定
 * @TableName ge_detail
 */
@TableName(value ="ge_detail")
@Data
public class GeDetail implements Serializable {
    /**
     * 
     */
    @TableId(value = "detai_id")
    private Object detai_id;

    /**
     * 单注最大
     */
    @TableField(value = "single_max_money")
    private Object single_max_money;

    /**
     * 单项最大金额
     */
    @TableField(value = "project_max_money")
    private Object project_max_money;

    /**
     * 总金额
     */
    @TableField(value = "max_money")
    private Object max_money;

    /**
     * 单注最小
     */
    @TableField(value = "min_money")
    private Object min_money;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDate create_date_time;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "update_date_time")
    private LocalDate update_date_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 彩票id
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 玩法id
     */
    @TableField(value = "type_id")
    private Object type_id;

    /**
     * 账户id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "game_name")
    private String game_name;

    /**
     * 联赛id
     */
    @TableField(value = "matches_id")
    private Object matches_id;

    /**
     * 台面id
     */
    @TableField(value = "desktop_id")
    private Object desktop_id;

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
        GeDetail other = (GeDetail) that;
        return (this.getDetai_id() == null ? other.getDetai_id() == null : this.getDetai_id().equals(other.getDetai_id()))
            && (this.getSingle_max_money() == null ? other.getSingle_max_money() == null : this.getSingle_max_money().equals(other.getSingle_max_money()))
            && (this.getProject_max_money() == null ? other.getProject_max_money() == null : this.getProject_max_money().equals(other.getProject_max_money()))
            && (this.getMax_money() == null ? other.getMax_money() == null : this.getMax_money().equals(other.getMax_money()))
            && (this.getMin_money() == null ? other.getMin_money() == null : this.getMin_money().equals(other.getMin_money()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getGame_name() == null ? other.getGame_name() == null : this.getGame_name().equals(other.getGame_name()))
            && (this.getMatches_id() == null ? other.getMatches_id() == null : this.getMatches_id().equals(other.getMatches_id()))
            && (this.getDesktop_id() == null ? other.getDesktop_id() == null : this.getDesktop_id().equals(other.getDesktop_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetai_id() == null) ? 0 : getDetai_id().hashCode());
        result = prime * result + ((getSingle_max_money() == null) ? 0 : getSingle_max_money().hashCode());
        result = prime * result + ((getProject_max_money() == null) ? 0 : getProject_max_money().hashCode());
        result = prime * result + ((getMax_money() == null) ? 0 : getMax_money().hashCode());
        result = prime * result + ((getMin_money() == null) ? 0 : getMin_money().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getGame_name() == null) ? 0 : getGame_name().hashCode());
        result = prime * result + ((getMatches_id() == null) ? 0 : getMatches_id().hashCode());
        result = prime * result + ((getDesktop_id() == null) ? 0 : getDesktop_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detai_id=").append(detai_id);
        sb.append(", single_max_money=").append(single_max_money);
        sb.append(", project_max_money=").append(project_max_money);
        sb.append(", max_money=").append(max_money);
        sb.append(", min_money=").append(min_money);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", type_id=").append(type_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", game_name=").append(game_name);
        sb.append(", matches_id=").append(matches_id);
        sb.append(", desktop_id=").append(desktop_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}