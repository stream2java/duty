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
 * 百家乐局详情
 * @TableName ge_video_baccarat
 */
@TableName(value ="ge_video_baccarat")
@Data
public class GeVideoBaccarat implements Serializable {
    /**
     * 局ID
     */
    @TableId(value = "inning_id")
    private Object inning_id;

    /**
     * 
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 
     */
    @TableField(value = "inning")
    private Object inning;

    /**
     * 
     */
    @TableField(value = "round")
    private Object round;

    /**
     * 
     */
    @TableField(value = "belong_service_id")
    private Object belong_service_id;

    /**
     * 
     */
    @TableField(value = "belong_desktop_id")
    private Object belong_desktop_id;

    /**
     * 闲点数
     */
    @TableField(value = "player_point")
    private Object player_point;

    /**
     * 庄点数
     */
    @TableField(value = "banker_point")
    private Object banker_point;

    /**
     * 闲第一张牌
     */
    @TableField(value = "player_poker1")
    private String player_poker1;

    /**
     * 闲第二张牌
     */
    @TableField(value = "player_poker2")
    private String player_poker2;

    /**
     * 闲第三张牌
     */
    @TableField(value = "player_poker3")
    private String player_poker3;

    /**
     * 庄第一张牌
     */
    @TableField(value = "banker_poker1")
    private String banker_poker1;

    /**
     * 庄第二张牌
     */
    @TableField(value = "banker_poker2")
    private String banker_poker2;

    /**
     * 庄第三张牌
     */
    @TableField(value = "banker_poker3")
    private String banker_poker3;

    /**
     * 
     */
    @TableField(value = "total_betting")
    private Object total_betting;

    /**
     * 
     */
    @TableField(value = "total_payout")
    private BigDecimal total_payout;

    /**
     * 
     */
    @TableField(value = "desktop_name")
    private String desktop_name;

    /**
     * 
     */
    @TableField(value = "belong_game_type")
    private Object belong_game_type;

    /**
     * 胜者，0闲1庄2和
     */
    @TableField(value = "winner")
    private Object winner;

    /**
     * 庄对,0无1有
     */
    @TableField(value = "banker_pair")
    private Object banker_pair;

    /**
     * 庄单双,0双,1单
     */
    @TableField(value = "banker_odd_even")
    private Object banker_odd_even;

    /**
     * 闲对,0无1有
     */
    @TableField(value = "player_pair")
    private Object player_pair;

    /**
     * 闲单双,0双1单
     */
    @TableField(value = "player_odd_even")
    private Object player_odd_even;

    /**
     * 大小,0小1大
     */
    @TableField(value = "big_small")
    private Object big_small;

    /**
     * 
     */
    @TableField(value = "inning_number")
    private String inning_number;

    /**
     * 
     */
    @TableField(value = "desktop")
    private String desktop;

    /**
     * 所属游戏外键
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 游戏状态1休息中2投注中3准备中4派彩中5已开奖
     */
    @TableField(value = "game_status")
    private Object game_status;

    /**
     * 是否最新场和次新场，1最新，2次新'
     */
    @TableField(value = "is_new")
    private Object is_new;

    /**
     * 
     */
    @TableField(value = "baccarat_id")
    private Object baccarat_id;

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
        GeVideoBaccarat other = (GeVideoBaccarat) that;
        return (this.getInning_id() == null ? other.getInning_id() == null : this.getInning_id().equals(other.getInning_id()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getInning() == null ? other.getInning() == null : this.getInning().equals(other.getInning()))
            && (this.getRound() == null ? other.getRound() == null : this.getRound().equals(other.getRound()))
            && (this.getBelong_service_id() == null ? other.getBelong_service_id() == null : this.getBelong_service_id().equals(other.getBelong_service_id()))
            && (this.getBelong_desktop_id() == null ? other.getBelong_desktop_id() == null : this.getBelong_desktop_id().equals(other.getBelong_desktop_id()))
            && (this.getPlayer_point() == null ? other.getPlayer_point() == null : this.getPlayer_point().equals(other.getPlayer_point()))
            && (this.getBanker_point() == null ? other.getBanker_point() == null : this.getBanker_point().equals(other.getBanker_point()))
            && (this.getPlayer_poker1() == null ? other.getPlayer_poker1() == null : this.getPlayer_poker1().equals(other.getPlayer_poker1()))
            && (this.getPlayer_poker2() == null ? other.getPlayer_poker2() == null : this.getPlayer_poker2().equals(other.getPlayer_poker2()))
            && (this.getPlayer_poker3() == null ? other.getPlayer_poker3() == null : this.getPlayer_poker3().equals(other.getPlayer_poker3()))
            && (this.getBanker_poker1() == null ? other.getBanker_poker1() == null : this.getBanker_poker1().equals(other.getBanker_poker1()))
            && (this.getBanker_poker2() == null ? other.getBanker_poker2() == null : this.getBanker_poker2().equals(other.getBanker_poker2()))
            && (this.getBanker_poker3() == null ? other.getBanker_poker3() == null : this.getBanker_poker3().equals(other.getBanker_poker3()))
            && (this.getTotal_betting() == null ? other.getTotal_betting() == null : this.getTotal_betting().equals(other.getTotal_betting()))
            && (this.getTotal_payout() == null ? other.getTotal_payout() == null : this.getTotal_payout().equals(other.getTotal_payout()))
            && (this.getDesktop_name() == null ? other.getDesktop_name() == null : this.getDesktop_name().equals(other.getDesktop_name()))
            && (this.getBelong_game_type() == null ? other.getBelong_game_type() == null : this.getBelong_game_type().equals(other.getBelong_game_type()))
            && (this.getWinner() == null ? other.getWinner() == null : this.getWinner().equals(other.getWinner()))
            && (this.getBanker_pair() == null ? other.getBanker_pair() == null : this.getBanker_pair().equals(other.getBanker_pair()))
            && (this.getBanker_odd_even() == null ? other.getBanker_odd_even() == null : this.getBanker_odd_even().equals(other.getBanker_odd_even()))
            && (this.getPlayer_pair() == null ? other.getPlayer_pair() == null : this.getPlayer_pair().equals(other.getPlayer_pair()))
            && (this.getPlayer_odd_even() == null ? other.getPlayer_odd_even() == null : this.getPlayer_odd_even().equals(other.getPlayer_odd_even()))
            && (this.getBig_small() == null ? other.getBig_small() == null : this.getBig_small().equals(other.getBig_small()))
            && (this.getInning_number() == null ? other.getInning_number() == null : this.getInning_number().equals(other.getInning_number()))
            && (this.getDesktop() == null ? other.getDesktop() == null : this.getDesktop().equals(other.getDesktop()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getGame_status() == null ? other.getGame_status() == null : this.getGame_status().equals(other.getGame_status()))
            && (this.getIs_new() == null ? other.getIs_new() == null : this.getIs_new().equals(other.getIs_new()))
            && (this.getBaccarat_id() == null ? other.getBaccarat_id() == null : this.getBaccarat_id().equals(other.getBaccarat_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInning_id() == null) ? 0 : getInning_id().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getInning() == null) ? 0 : getInning().hashCode());
        result = prime * result + ((getRound() == null) ? 0 : getRound().hashCode());
        result = prime * result + ((getBelong_service_id() == null) ? 0 : getBelong_service_id().hashCode());
        result = prime * result + ((getBelong_desktop_id() == null) ? 0 : getBelong_desktop_id().hashCode());
        result = prime * result + ((getPlayer_point() == null) ? 0 : getPlayer_point().hashCode());
        result = prime * result + ((getBanker_point() == null) ? 0 : getBanker_point().hashCode());
        result = prime * result + ((getPlayer_poker1() == null) ? 0 : getPlayer_poker1().hashCode());
        result = prime * result + ((getPlayer_poker2() == null) ? 0 : getPlayer_poker2().hashCode());
        result = prime * result + ((getPlayer_poker3() == null) ? 0 : getPlayer_poker3().hashCode());
        result = prime * result + ((getBanker_poker1() == null) ? 0 : getBanker_poker1().hashCode());
        result = prime * result + ((getBanker_poker2() == null) ? 0 : getBanker_poker2().hashCode());
        result = prime * result + ((getBanker_poker3() == null) ? 0 : getBanker_poker3().hashCode());
        result = prime * result + ((getTotal_betting() == null) ? 0 : getTotal_betting().hashCode());
        result = prime * result + ((getTotal_payout() == null) ? 0 : getTotal_payout().hashCode());
        result = prime * result + ((getDesktop_name() == null) ? 0 : getDesktop_name().hashCode());
        result = prime * result + ((getBelong_game_type() == null) ? 0 : getBelong_game_type().hashCode());
        result = prime * result + ((getWinner() == null) ? 0 : getWinner().hashCode());
        result = prime * result + ((getBanker_pair() == null) ? 0 : getBanker_pair().hashCode());
        result = prime * result + ((getBanker_odd_even() == null) ? 0 : getBanker_odd_even().hashCode());
        result = prime * result + ((getPlayer_pair() == null) ? 0 : getPlayer_pair().hashCode());
        result = prime * result + ((getPlayer_odd_even() == null) ? 0 : getPlayer_odd_even().hashCode());
        result = prime * result + ((getBig_small() == null) ? 0 : getBig_small().hashCode());
        result = prime * result + ((getInning_number() == null) ? 0 : getInning_number().hashCode());
        result = prime * result + ((getDesktop() == null) ? 0 : getDesktop().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getGame_status() == null) ? 0 : getGame_status().hashCode());
        result = prime * result + ((getIs_new() == null) ? 0 : getIs_new().hashCode());
        result = prime * result + ((getBaccarat_id() == null) ? 0 : getBaccarat_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inning_id=").append(inning_id);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", inning=").append(inning);
        sb.append(", round=").append(round);
        sb.append(", belong_service_id=").append(belong_service_id);
        sb.append(", belong_desktop_id=").append(belong_desktop_id);
        sb.append(", player_point=").append(player_point);
        sb.append(", banker_point=").append(banker_point);
        sb.append(", player_poker1=").append(player_poker1);
        sb.append(", player_poker2=").append(player_poker2);
        sb.append(", player_poker3=").append(player_poker3);
        sb.append(", banker_poker1=").append(banker_poker1);
        sb.append(", banker_poker2=").append(banker_poker2);
        sb.append(", banker_poker3=").append(banker_poker3);
        sb.append(", total_betting=").append(total_betting);
        sb.append(", total_payout=").append(total_payout);
        sb.append(", desktop_name=").append(desktop_name);
        sb.append(", belong_game_type=").append(belong_game_type);
        sb.append(", winner=").append(winner);
        sb.append(", banker_pair=").append(banker_pair);
        sb.append(", banker_odd_even=").append(banker_odd_even);
        sb.append(", player_pair=").append(player_pair);
        sb.append(", player_odd_even=").append(player_odd_even);
        sb.append(", big_small=").append(big_small);
        sb.append(", inning_number=").append(inning_number);
        sb.append(", desktop=").append(desktop);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", game_status=").append(game_status);
        sb.append(", is_new=").append(is_new);
        sb.append(", baccarat_id=").append(baccarat_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}