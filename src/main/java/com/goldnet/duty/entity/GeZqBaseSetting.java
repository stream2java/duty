package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 体育 - 基本设置表
 * @TableName ge_zq_base_setting
 */
@TableName(value ="ge_zq_base_setting")
@Data
public class GeZqBaseSetting implements Serializable {
    /**
     * 基本设置id
     */
    @TableId(value = "base_set_id")
    private Object base_set_id;

    /**
     * 混合过关最少选几个
     */
    @TableField(value = "mix_min")
    private Object mix_min;

    /**
     * 混合过关最多选几个
     */
    @TableField(value = "mix_max")
    private Object mix_max;

    /**
     * 是否自动结算
0 自动 1不自动
     */
    @TableField(value = "is_auto_settlement")
    private String is_auto_settlement;

    /**
     * 是否开放足球游戏
0开放 1不开放
     */
    @TableField(value = "is_open")
    private String is_open;

    /**
     * 查看联赛时只查看此时间点以前的联赛
     */
    @TableField(value = "league_time")
    private LocalDateTime league_time;

    /**
     * 最新的赔率是什么时候的
     */
    @TableField(value = "odds_time")
    private LocalDateTime odds_time;

    /**
     * 是否自动接收新联盟
0是自动接收 1是不自动接收
     */
    @TableField(value = "is_auto_accept_lea")
    private String is_auto_accept_lea;

    /**
     * 
     */
    @TableField(value = "lottery")
    private Object lottery;

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
        GeZqBaseSetting other = (GeZqBaseSetting) that;
        return (this.getBase_set_id() == null ? other.getBase_set_id() == null : this.getBase_set_id().equals(other.getBase_set_id()))
            && (this.getMix_min() == null ? other.getMix_min() == null : this.getMix_min().equals(other.getMix_min()))
            && (this.getMix_max() == null ? other.getMix_max() == null : this.getMix_max().equals(other.getMix_max()))
            && (this.getIs_auto_settlement() == null ? other.getIs_auto_settlement() == null : this.getIs_auto_settlement().equals(other.getIs_auto_settlement()))
            && (this.getIs_open() == null ? other.getIs_open() == null : this.getIs_open().equals(other.getIs_open()))
            && (this.getLeague_time() == null ? other.getLeague_time() == null : this.getLeague_time().equals(other.getLeague_time()))
            && (this.getOdds_time() == null ? other.getOdds_time() == null : this.getOdds_time().equals(other.getOdds_time()))
            && (this.getIs_auto_accept_lea() == null ? other.getIs_auto_accept_lea() == null : this.getIs_auto_accept_lea().equals(other.getIs_auto_accept_lea()))
            && (this.getLottery() == null ? other.getLottery() == null : this.getLottery().equals(other.getLottery()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBase_set_id() == null) ? 0 : getBase_set_id().hashCode());
        result = prime * result + ((getMix_min() == null) ? 0 : getMix_min().hashCode());
        result = prime * result + ((getMix_max() == null) ? 0 : getMix_max().hashCode());
        result = prime * result + ((getIs_auto_settlement() == null) ? 0 : getIs_auto_settlement().hashCode());
        result = prime * result + ((getIs_open() == null) ? 0 : getIs_open().hashCode());
        result = prime * result + ((getLeague_time() == null) ? 0 : getLeague_time().hashCode());
        result = prime * result + ((getOdds_time() == null) ? 0 : getOdds_time().hashCode());
        result = prime * result + ((getIs_auto_accept_lea() == null) ? 0 : getIs_auto_accept_lea().hashCode());
        result = prime * result + ((getLottery() == null) ? 0 : getLottery().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", base_set_id=").append(base_set_id);
        sb.append(", mix_min=").append(mix_min);
        sb.append(", mix_max=").append(mix_max);
        sb.append(", is_auto_settlement=").append(is_auto_settlement);
        sb.append(", is_open=").append(is_open);
        sb.append(", league_time=").append(league_time);
        sb.append(", odds_time=").append(odds_time);
        sb.append(", is_auto_accept_lea=").append(is_auto_accept_lea);
        sb.append(", lottery=").append(lottery);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}