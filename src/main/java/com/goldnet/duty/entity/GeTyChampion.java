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
 * 体育 - 类特殊赛事 - 冠军赛 - 联赛 - 玩法 - 投注点(所有信息)
 * @TableName ge_ty_champion
 */
@TableName(value ="ge_ty_champion")
@Data
public class GeTyChampion implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "win_id")
    private Object win_id;

    /**
     * 等级为 0 时 是联赛名称
等级为 1 时 是盘口名称（玩法名称）
等级为 2 时 是队伍名称or选手名称

     */
    @TableField(value = "t_name")
    private String t_name;

    /**
     * 
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 等级为 2 时 才有数据
     */
    @TableField(value = "odds")
    private BigDecimal odds;

    /**
     * 等级 0是联赛 1是玩法 2是队伍
     */
    @TableField(value = "rank")
    private String rank;

    /**
     * 上级id
如果rank 是0 那么就是 联赛的id 在 ge_zq_matches 中
     */
    @TableField(value = "parent_id")
    private Object parent_id;

    /**
     * 是否显示 0显示 1后台控制不显示 2比赛到期不显示
     */
    @TableField(value = "is_show")
    private String is_show;

    /**
     * 是否结算过
0是未结算 1是已结
     */
    @TableField(value = "is_balance")
    private String is_balance;

    /**
     * 比赛结果
0是输 1是赢
     */
    @TableField(value = "is_result")
    private String is_result;

    /**
     * 编号 等级0 是联赛编号 等级1是玩法编号 等级2是队伍编号
     */
    @TableField(value = "win_code")
    private String win_code;

    /**
     * 游戏Id 可能是足球的冠军赛也可能是篮球的冠军赛 也可能是其它体育的冠军赛

     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 开赛时间
     */
    @TableField(value = "start_time")
    private LocalDateTime start_time;

    /**
     *  -- 是否可以投注 0可以投注 1不可以投注
     */
    @TableField(value = "is_bet_show")
    private String is_bet_show;

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
        GeTyChampion other = (GeTyChampion) that;
        return (this.getWin_id() == null ? other.getWin_id() == null : this.getWin_id().equals(other.getWin_id()))
            && (this.getT_name() == null ? other.getT_name() == null : this.getT_name().equals(other.getT_name()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getOdds() == null ? other.getOdds() == null : this.getOdds().equals(other.getOdds()))
            && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getIs_show() == null ? other.getIs_show() == null : this.getIs_show().equals(other.getIs_show()))
            && (this.getIs_balance() == null ? other.getIs_balance() == null : this.getIs_balance().equals(other.getIs_balance()))
            && (this.getIs_result() == null ? other.getIs_result() == null : this.getIs_result().equals(other.getIs_result()))
            && (this.getWin_code() == null ? other.getWin_code() == null : this.getWin_code().equals(other.getWin_code()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getIs_bet_show() == null ? other.getIs_bet_show() == null : this.getIs_bet_show().equals(other.getIs_bet_show()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWin_id() == null) ? 0 : getWin_id().hashCode());
        result = prime * result + ((getT_name() == null) ? 0 : getT_name().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getOdds() == null) ? 0 : getOdds().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getIs_show() == null) ? 0 : getIs_show().hashCode());
        result = prime * result + ((getIs_balance() == null) ? 0 : getIs_balance().hashCode());
        result = prime * result + ((getIs_result() == null) ? 0 : getIs_result().hashCode());
        result = prime * result + ((getWin_code() == null) ? 0 : getWin_code().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getIs_bet_show() == null) ? 0 : getIs_bet_show().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", win_id=").append(win_id);
        sb.append(", t_name=").append(t_name);
        sb.append(", create_date=").append(create_date);
        sb.append(", create_user=").append(create_user);
        sb.append(", odds=").append(odds);
        sb.append(", rank=").append(rank);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", is_show=").append(is_show);
        sb.append(", is_balance=").append(is_balance);
        sb.append(", is_result=").append(is_result);
        sb.append(", win_code=").append(win_code);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", start_time=").append(start_time);
        sb.append(", is_bet_show=").append(is_bet_show);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}