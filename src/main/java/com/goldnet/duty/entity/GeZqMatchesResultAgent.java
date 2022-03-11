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
 * @TableName ge_zq_matches_result_agent
 */
@TableName(value ="ge_zq_matches_result_agent")
@Data
public class GeZqMatchesResultAgent implements Serializable {
    /**
     * 
     */
    @TableField(value = "matches_result_id")
    private Object matches_result_id;

    /**
     * 
     */
    @TableField(value = "u_h_score")
    private Object u_h_score;

    /**
     * 
     */
    @TableField(value = "u_g_score")
    private Object u_g_score;

    /**
     * 
     */
    @TableField(value = "d_h_score")
    private Object d_h_score;

    /**
     * 
     */
    @TableField(value = "d_g_score")
    private Object d_g_score;

    /**
     * 
     */
    @TableField(value = "matches_id")
    private Object matches_id;

    /**
     * 
     */
    @TableField(value = "agent_id")
    private Object agent_id;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    /**
     * 
     */
    @TableField(value = "c_h_score")
    private Object c_h_score;

    /**
     * 
     */
    @TableField(value = "c_g_score")
    private Object c_g_score;

    /**
     * 
     */
    @TableField(value = "c_goals")
    private Object c_goals;

    /**
     * 
     */
    @TableField(value = "champion_id")
    private Object champion_id;

    /**
     * 
     */
    @TableField(value = "champion_win_id")
    private Object champion_win_id;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "lottery")
    private Object lottery;

    /**
     * 
     */
    @TableField(value = "full_h")
    private String full_h;

    /**
     * 
     */
    @TableField(value = "full_g")
    private String full_g;

    /**
     * 
     */
    @TableField(value = "hr1_h")
    private String hr1_h;

    /**
     * 
     */
    @TableField(value = "hr1_g")
    private String hr1_g;

    /**
     * 
     */
    @TableField(value = "hr2_h")
    private String hr2_h;

    /**
     * 
     */
    @TableField(value = "quarter1_h")
    private String quarter1_h;

    /**
     * 
     */
    @TableField(value = "quarter1_g")
    private String quarter1_g;

    /**
     * 
     */
    @TableField(value = "quarter2_h")
    private String quarter2_h;

    /**
     * 
     */
    @TableField(value = "quarter2_g")
    private String quarter2_g;

    /**
     * 
     */
    @TableField(value = "quarter3_h")
    private String quarter3_h;

    /**
     * 
     */
    @TableField(value = "quarter3_g")
    private String quarter3_g;

    /**
     * 
     */
    @TableField(value = "quarter4_h")
    private String quarter4_h;

    /**
     * 
     */
    @TableField(value = "quarter4_g")
    private String quarter4_g;

    /**
     * 
     */
    @TableField(value = "extra_time_h")
    private String extra_time_h;

    /**
     * 
     */
    @TableField(value = "extra_time_g")
    private String extra_time_g;

    /**
     * 
     */
    @TableField(value = "hr2_g")
    private String hr2_g;

    /**
     * 
     */
    @TableField(value = "px_order")
    private Object px_order;

    /**
     * 
     */
    @TableField(value = "quarter5_h")
    private String quarter5_h;

    /**
     * 
     */
    @TableField(value = "quarter5_g")
    private String quarter5_g;

    /**
     * 
     */
    @TableField(value = "numberwin_h")
    private String numberwin_h;

    /**
     * 
     */
    @TableField(value = "numberwin_c")
    private String numberwin_c;

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
        GeZqMatchesResultAgent other = (GeZqMatchesResultAgent) that;
        return (this.getMatches_result_id() == null ? other.getMatches_result_id() == null : this.getMatches_result_id().equals(other.getMatches_result_id()))
            && (this.getU_h_score() == null ? other.getU_h_score() == null : this.getU_h_score().equals(other.getU_h_score()))
            && (this.getU_g_score() == null ? other.getU_g_score() == null : this.getU_g_score().equals(other.getU_g_score()))
            && (this.getD_h_score() == null ? other.getD_h_score() == null : this.getD_h_score().equals(other.getD_h_score()))
            && (this.getD_g_score() == null ? other.getD_g_score() == null : this.getD_g_score().equals(other.getD_g_score()))
            && (this.getMatches_id() == null ? other.getMatches_id() == null : this.getMatches_id().equals(other.getMatches_id()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getC_h_score() == null ? other.getC_h_score() == null : this.getC_h_score().equals(other.getC_h_score()))
            && (this.getC_g_score() == null ? other.getC_g_score() == null : this.getC_g_score().equals(other.getC_g_score()))
            && (this.getC_goals() == null ? other.getC_goals() == null : this.getC_goals().equals(other.getC_goals()))
            && (this.getChampion_id() == null ? other.getChampion_id() == null : this.getChampion_id().equals(other.getChampion_id()))
            && (this.getChampion_win_id() == null ? other.getChampion_win_id() == null : this.getChampion_win_id().equals(other.getChampion_win_id()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getLottery() == null ? other.getLottery() == null : this.getLottery().equals(other.getLottery()))
            && (this.getFull_h() == null ? other.getFull_h() == null : this.getFull_h().equals(other.getFull_h()))
            && (this.getFull_g() == null ? other.getFull_g() == null : this.getFull_g().equals(other.getFull_g()))
            && (this.getHr1_h() == null ? other.getHr1_h() == null : this.getHr1_h().equals(other.getHr1_h()))
            && (this.getHr1_g() == null ? other.getHr1_g() == null : this.getHr1_g().equals(other.getHr1_g()))
            && (this.getHr2_h() == null ? other.getHr2_h() == null : this.getHr2_h().equals(other.getHr2_h()))
            && (this.getQuarter1_h() == null ? other.getQuarter1_h() == null : this.getQuarter1_h().equals(other.getQuarter1_h()))
            && (this.getQuarter1_g() == null ? other.getQuarter1_g() == null : this.getQuarter1_g().equals(other.getQuarter1_g()))
            && (this.getQuarter2_h() == null ? other.getQuarter2_h() == null : this.getQuarter2_h().equals(other.getQuarter2_h()))
            && (this.getQuarter2_g() == null ? other.getQuarter2_g() == null : this.getQuarter2_g().equals(other.getQuarter2_g()))
            && (this.getQuarter3_h() == null ? other.getQuarter3_h() == null : this.getQuarter3_h().equals(other.getQuarter3_h()))
            && (this.getQuarter3_g() == null ? other.getQuarter3_g() == null : this.getQuarter3_g().equals(other.getQuarter3_g()))
            && (this.getQuarter4_h() == null ? other.getQuarter4_h() == null : this.getQuarter4_h().equals(other.getQuarter4_h()))
            && (this.getQuarter4_g() == null ? other.getQuarter4_g() == null : this.getQuarter4_g().equals(other.getQuarter4_g()))
            && (this.getExtra_time_h() == null ? other.getExtra_time_h() == null : this.getExtra_time_h().equals(other.getExtra_time_h()))
            && (this.getExtra_time_g() == null ? other.getExtra_time_g() == null : this.getExtra_time_g().equals(other.getExtra_time_g()))
            && (this.getHr2_g() == null ? other.getHr2_g() == null : this.getHr2_g().equals(other.getHr2_g()))
            && (this.getPx_order() == null ? other.getPx_order() == null : this.getPx_order().equals(other.getPx_order()))
            && (this.getQuarter5_h() == null ? other.getQuarter5_h() == null : this.getQuarter5_h().equals(other.getQuarter5_h()))
            && (this.getQuarter5_g() == null ? other.getQuarter5_g() == null : this.getQuarter5_g().equals(other.getQuarter5_g()))
            && (this.getNumberwin_h() == null ? other.getNumberwin_h() == null : this.getNumberwin_h().equals(other.getNumberwin_h()))
            && (this.getNumberwin_c() == null ? other.getNumberwin_c() == null : this.getNumberwin_c().equals(other.getNumberwin_c()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMatches_result_id() == null) ? 0 : getMatches_result_id().hashCode());
        result = prime * result + ((getU_h_score() == null) ? 0 : getU_h_score().hashCode());
        result = prime * result + ((getU_g_score() == null) ? 0 : getU_g_score().hashCode());
        result = prime * result + ((getD_h_score() == null) ? 0 : getD_h_score().hashCode());
        result = prime * result + ((getD_g_score() == null) ? 0 : getD_g_score().hashCode());
        result = prime * result + ((getMatches_id() == null) ? 0 : getMatches_id().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getC_h_score() == null) ? 0 : getC_h_score().hashCode());
        result = prime * result + ((getC_g_score() == null) ? 0 : getC_g_score().hashCode());
        result = prime * result + ((getC_goals() == null) ? 0 : getC_goals().hashCode());
        result = prime * result + ((getChampion_id() == null) ? 0 : getChampion_id().hashCode());
        result = prime * result + ((getChampion_win_id() == null) ? 0 : getChampion_win_id().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getLottery() == null) ? 0 : getLottery().hashCode());
        result = prime * result + ((getFull_h() == null) ? 0 : getFull_h().hashCode());
        result = prime * result + ((getFull_g() == null) ? 0 : getFull_g().hashCode());
        result = prime * result + ((getHr1_h() == null) ? 0 : getHr1_h().hashCode());
        result = prime * result + ((getHr1_g() == null) ? 0 : getHr1_g().hashCode());
        result = prime * result + ((getHr2_h() == null) ? 0 : getHr2_h().hashCode());
        result = prime * result + ((getQuarter1_h() == null) ? 0 : getQuarter1_h().hashCode());
        result = prime * result + ((getQuarter1_g() == null) ? 0 : getQuarter1_g().hashCode());
        result = prime * result + ((getQuarter2_h() == null) ? 0 : getQuarter2_h().hashCode());
        result = prime * result + ((getQuarter2_g() == null) ? 0 : getQuarter2_g().hashCode());
        result = prime * result + ((getQuarter3_h() == null) ? 0 : getQuarter3_h().hashCode());
        result = prime * result + ((getQuarter3_g() == null) ? 0 : getQuarter3_g().hashCode());
        result = prime * result + ((getQuarter4_h() == null) ? 0 : getQuarter4_h().hashCode());
        result = prime * result + ((getQuarter4_g() == null) ? 0 : getQuarter4_g().hashCode());
        result = prime * result + ((getExtra_time_h() == null) ? 0 : getExtra_time_h().hashCode());
        result = prime * result + ((getExtra_time_g() == null) ? 0 : getExtra_time_g().hashCode());
        result = prime * result + ((getHr2_g() == null) ? 0 : getHr2_g().hashCode());
        result = prime * result + ((getPx_order() == null) ? 0 : getPx_order().hashCode());
        result = prime * result + ((getQuarter5_h() == null) ? 0 : getQuarter5_h().hashCode());
        result = prime * result + ((getQuarter5_g() == null) ? 0 : getQuarter5_g().hashCode());
        result = prime * result + ((getNumberwin_h() == null) ? 0 : getNumberwin_h().hashCode());
        result = prime * result + ((getNumberwin_c() == null) ? 0 : getNumberwin_c().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matches_result_id=").append(matches_result_id);
        sb.append(", u_h_score=").append(u_h_score);
        sb.append(", u_g_score=").append(u_g_score);
        sb.append(", d_h_score=").append(d_h_score);
        sb.append(", d_g_score=").append(d_g_score);
        sb.append(", matches_id=").append(matches_id);
        sb.append(", agent_id=").append(agent_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", status=").append(status);
        sb.append(", c_h_score=").append(c_h_score);
        sb.append(", c_g_score=").append(c_g_score);
        sb.append(", c_goals=").append(c_goals);
        sb.append(", champion_id=").append(champion_id);
        sb.append(", champion_win_id=").append(champion_win_id);
        sb.append(", remark=").append(remark);
        sb.append(", lottery=").append(lottery);
        sb.append(", full_h=").append(full_h);
        sb.append(", full_g=").append(full_g);
        sb.append(", hr1_h=").append(hr1_h);
        sb.append(", hr1_g=").append(hr1_g);
        sb.append(", hr2_h=").append(hr2_h);
        sb.append(", quarter1_h=").append(quarter1_h);
        sb.append(", quarter1_g=").append(quarter1_g);
        sb.append(", quarter2_h=").append(quarter2_h);
        sb.append(", quarter2_g=").append(quarter2_g);
        sb.append(", quarter3_h=").append(quarter3_h);
        sb.append(", quarter3_g=").append(quarter3_g);
        sb.append(", quarter4_h=").append(quarter4_h);
        sb.append(", quarter4_g=").append(quarter4_g);
        sb.append(", extra_time_h=").append(extra_time_h);
        sb.append(", extra_time_g=").append(extra_time_g);
        sb.append(", hr2_g=").append(hr2_g);
        sb.append(", px_order=").append(px_order);
        sb.append(", quarter5_h=").append(quarter5_h);
        sb.append(", quarter5_g=").append(quarter5_g);
        sb.append(", numberwin_h=").append(numberwin_h);
        sb.append(", numberwin_c=").append(numberwin_c);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}