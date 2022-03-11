package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 代理游戏管理设置
 * @TableName at_agent_game_manage
 */
@TableName(value ="at_agent_game_manage")
@Data
public class AtAgentGameManage implements Serializable {
    /**
     * 代理商游戏设置id
     */
    @TableId(value = "agent_manage_game_id")
    private Object agent_manage_game_id;

    /**
     * 代理商id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 彩票id
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 是否开放游戏（0开放，1不开放）
     */
    @TableField(value = "is_open")
    private Object is_open;

    /**
     * 投注状态
     */
    @TableField(value = "betting_status")
    private Object betting_status;

    /**
     * 是否开放投注状态（0开放，1不开放）
     */
    @TableField(value = "is_open_betting_status")
    private Object is_open_betting_status;

    /**
     * 投注方式(0信用，1快开)
     */
    @TableField(value = "betting_manner")
    private String betting_manner;

    /**
     * 是否开放投注方式（0开放，1不开放）
     */
    @TableField(value = "is_open_betting_manner")
    private String is_open_betting_manner;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDate create_date_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDate update_date_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

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
        AtAgentGameManage other = (AtAgentGameManage) that;
        return (this.getAgent_manage_game_id() == null ? other.getAgent_manage_game_id() == null : this.getAgent_manage_game_id().equals(other.getAgent_manage_game_id()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getIs_open() == null ? other.getIs_open() == null : this.getIs_open().equals(other.getIs_open()))
            && (this.getBetting_status() == null ? other.getBetting_status() == null : this.getBetting_status().equals(other.getBetting_status()))
            && (this.getIs_open_betting_status() == null ? other.getIs_open_betting_status() == null : this.getIs_open_betting_status().equals(other.getIs_open_betting_status()))
            && (this.getBetting_manner() == null ? other.getBetting_manner() == null : this.getBetting_manner().equals(other.getBetting_manner()))
            && (this.getIs_open_betting_manner() == null ? other.getIs_open_betting_manner() == null : this.getIs_open_betting_manner().equals(other.getIs_open_betting_manner()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgent_manage_game_id() == null) ? 0 : getAgent_manage_game_id().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getIs_open() == null) ? 0 : getIs_open().hashCode());
        result = prime * result + ((getBetting_status() == null) ? 0 : getBetting_status().hashCode());
        result = prime * result + ((getIs_open_betting_status() == null) ? 0 : getIs_open_betting_status().hashCode());
        result = prime * result + ((getBetting_manner() == null) ? 0 : getBetting_manner().hashCode());
        result = prime * result + ((getIs_open_betting_manner() == null) ? 0 : getIs_open_betting_manner().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agent_manage_game_id=").append(agent_manage_game_id);
        sb.append(", account_id=").append(account_id);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", is_open=").append(is_open);
        sb.append(", betting_status=").append(betting_status);
        sb.append(", is_open_betting_status=").append(is_open_betting_status);
        sb.append(", betting_manner=").append(betting_manner);
        sb.append(", is_open_betting_manner=").append(is_open_betting_manner);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}