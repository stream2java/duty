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
 * 体育 - 足球游戏赔率表(已无用)
 * @TableName ge_zq_odds
 */
@TableName(value ="ge_zq_odds")
@Data
public class GeZqOdds implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "odds_id")
    private Object odds_id;

    /**
     * 哪一场比赛 具体比赛
     */
    @TableField(value = "matches_id")
    private Object matches_id;

    /**
     * 游戏类型 玩法 与game_type 关联
     */
    @TableField(value = "bet_type")
    private Object bet_type;

    /**
     * 具体玩法 
波胆: 
1:0 oneozero
2:0 twoozero
2:1 twooone
3:0 threeozero
3:1 threeoone
3:2 threeotwo
4:0 fourozero
4:1 fouroone
4:2 fourotwo
4:3 fourothree
0:0 zeroozero
1:1 oneoone
2:2 twootwo
3:3 threeothree
4:4 fourofour
other
入球数: 
0~1 zerotoone
2~3 twotothree
4~6 fourtosix
7up sevenup
半/全场:
主主:hh
主和:hd
主客:hg
和主:dh
和和:dd
和客:dg
客主:gh
客和:gd
客客:gg
其它参照 who_odds 字段的注释
     */
    @TableField(value = "bet_type_detail")
    private String bet_type_detail;

    /**
     * 赔率
     */
    @TableField(value = "odds")
    private BigDecimal odds;

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
     * 独赢 0是主队 1是客队 2是和局
让球： 
0是主让 主的赔率 1是主让 客的赔率 
2是客让 主的赔率 3是客让 客的赔率
在detail 中保存让球数 x-x
大小球 0是大球 1是小球
单双 1是单 0是双的赔率
波胆 0是主 1是客 2是和 
波胆 1:1 的话这个字段肯定就是2了 具体玩法1:0的话就看这个字段
     */
    @TableField(value = "who_odds")
    private String who_odds;

    /**
     * 是否混合过关的赔率
0不是 1是
     */
    @TableField(value = "is_mix")
    private String is_mix;

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
        GeZqOdds other = (GeZqOdds) that;
        return (this.getOdds_id() == null ? other.getOdds_id() == null : this.getOdds_id().equals(other.getOdds_id()))
            && (this.getMatches_id() == null ? other.getMatches_id() == null : this.getMatches_id().equals(other.getMatches_id()))
            && (this.getBet_type() == null ? other.getBet_type() == null : this.getBet_type().equals(other.getBet_type()))
            && (this.getBet_type_detail() == null ? other.getBet_type_detail() == null : this.getBet_type_detail().equals(other.getBet_type_detail()))
            && (this.getOdds() == null ? other.getOdds() == null : this.getOdds().equals(other.getOdds()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getWho_odds() == null ? other.getWho_odds() == null : this.getWho_odds().equals(other.getWho_odds()))
            && (this.getIs_mix() == null ? other.getIs_mix() == null : this.getIs_mix().equals(other.getIs_mix()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOdds_id() == null) ? 0 : getOdds_id().hashCode());
        result = prime * result + ((getMatches_id() == null) ? 0 : getMatches_id().hashCode());
        result = prime * result + ((getBet_type() == null) ? 0 : getBet_type().hashCode());
        result = prime * result + ((getBet_type_detail() == null) ? 0 : getBet_type_detail().hashCode());
        result = prime * result + ((getOdds() == null) ? 0 : getOdds().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getWho_odds() == null) ? 0 : getWho_odds().hashCode());
        result = prime * result + ((getIs_mix() == null) ? 0 : getIs_mix().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", odds_id=").append(odds_id);
        sb.append(", matches_id=").append(matches_id);
        sb.append(", bet_type=").append(bet_type);
        sb.append(", bet_type_detail=").append(bet_type_detail);
        sb.append(", odds=").append(odds);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", who_odds=").append(who_odds);
        sb.append(", is_mix=").append(is_mix);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}