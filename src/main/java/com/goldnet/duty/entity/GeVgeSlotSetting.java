package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 电子游艺 - 具体设置
 * @TableName ge_vge_slot_setting
 */
@TableName(value ="ge_vge_slot_setting")
@Data
public class GeVgeSlotSetting implements Serializable {
    /**
     * 
     */
    @TableId(value = "slot_set_id")
    private Object slot_set_id;

    /**
     * 游戏类型
     */
    @TableField(value = "slot_type")
    private Object slot_type;

    /**
     * 数量
     */
    @TableField(value = "slot_num")
    private Object slot_num;

    /**
     * 类型总损益
     */
    @TableField(value = "profit")
    private BigDecimal profit;

    /**
     * 哪一个大大股东的配置
     */
    @TableField(value = "agent")
    private Object agent;

    /**
     * 一倍注
     */
    @TableField(value = "bet_one")
    private BigDecimal bet_one;

    /**
     * 二倍注
     */
    @TableField(value = "bet_two")
    private BigDecimal bet_two;

    /**
     * 三倍注
     */
    @TableField(value = "bet_three")
    private BigDecimal bet_three;

    /**
     * 总彩池
     */
    @TableField(value = "pot")
    private BigDecimal pot;

    /**
     * 可派彩彩池
     */
    @TableField(value = "pot_free")
    private BigDecimal pot_free;

    /**
     * 已派彩彩池
     */
    @TableField(value = "pot_payout")
    private BigDecimal pot_payout;

    /**
     * 转发服务器IP地址
     */
    @TableField(value = "ip")
    private String ip;

    /**
     * 转发服务器端口
     */
    @TableField(value = "port")
    private String port;

    /**
     * 是否启用游戏 0开发 1禁用
     */
    @TableField(value = "is_enabled")
    private String is_enabled;

    /**
     * 是否开放投注 0开放 1禁用
     */
    @TableField(value = "is_enabled_bet")
    private String is_enabled_bet;

    /**
     * 公告 繁体
     */
    @TableField(value = "big5_content")
    private String big5_content;

    /**
     * 公告 简体
     */
    @TableField(value = "gbk_content")
    private String gbk_content;

    /**
     * 公告 英文
     */
    @TableField(value = "en_content")
    private String en_content;

    /**
     * 彩池补偿 --预留字段
     */
    @TableField(value = "pot_make")
    private BigDecimal pot_make;

    /**
     * 中奖几率组
     */
    @TableField(value = "chance_group")
    private String chance_group;

    /**
     * 当前走的是那一个机率 （在几率组中）
     */
    @TableField(value = "chance_group_num")
    private Object chance_group_num;

    /**
     * 还需要多少投注额就切换到下一个机率
     */
    @TableField(value = "chance_group_pot")
    private BigDecimal chance_group_pot;

    /**
     * 当前走的是哪一个单点赔率几率 在ge_vge_odds中
     */
    @TableField(value = "odds")
    private Object odds;

    /**
     * 积分兑换比例
     */
    @TableField(value = "int_ratio_group")
    private String int_ratio_group;

    /**
     * 默认的兑换比例
     */
    @TableField(value = "int_ratio_default")
    private String int_ratio_default;

    /**
     * 当前彩池
     */
    @TableField(value = "current_pot")
    private BigDecimal current_pot;

    /**
     * 当前彩池排彩
     */
    @TableField(value = "current_pot_payout")
    private BigDecimal current_pot_payout;

    /**
     * 新会员彩池
     */
    @TableField(value = "newmem_pot")
    private BigDecimal newmem_pot;

    /**
     * 新会员彩池排彩
     */
    @TableField(value = "newmem_pot_payout")
    private BigDecimal newmem_pot_payout;

    /**
     * 归属于哪个分组
     */
    @TableField(value = "group_id")
    private Object group_id;

    /**
     * “0”走组设置
“1” 走自身设置
     */
    @TableField(value = "choose")
    private String choose;

    /**
     * 
     */
    @TableField(value = "versions")
    private Object versions;

    /**
     * 
     */
    @TableField(value = "game_name")
    private String game_name;

    /**
     * 默认中奖机率
     */
    @TableField(value = "chance")
    private BigDecimal chance;

    /**
     * 
     */
    @TableField(value = "shared_profit")
    private BigDecimal shared_profit;

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
        GeVgeSlotSetting other = (GeVgeSlotSetting) that;
        return (this.getSlot_set_id() == null ? other.getSlot_set_id() == null : this.getSlot_set_id().equals(other.getSlot_set_id()))
            && (this.getSlot_type() == null ? other.getSlot_type() == null : this.getSlot_type().equals(other.getSlot_type()))
            && (this.getSlot_num() == null ? other.getSlot_num() == null : this.getSlot_num().equals(other.getSlot_num()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getBet_one() == null ? other.getBet_one() == null : this.getBet_one().equals(other.getBet_one()))
            && (this.getBet_two() == null ? other.getBet_two() == null : this.getBet_two().equals(other.getBet_two()))
            && (this.getBet_three() == null ? other.getBet_three() == null : this.getBet_three().equals(other.getBet_three()))
            && (this.getPot() == null ? other.getPot() == null : this.getPot().equals(other.getPot()))
            && (this.getPot_free() == null ? other.getPot_free() == null : this.getPot_free().equals(other.getPot_free()))
            && (this.getPot_payout() == null ? other.getPot_payout() == null : this.getPot_payout().equals(other.getPot_payout()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getIs_enabled() == null ? other.getIs_enabled() == null : this.getIs_enabled().equals(other.getIs_enabled()))
            && (this.getIs_enabled_bet() == null ? other.getIs_enabled_bet() == null : this.getIs_enabled_bet().equals(other.getIs_enabled_bet()))
            && (this.getBig5_content() == null ? other.getBig5_content() == null : this.getBig5_content().equals(other.getBig5_content()))
            && (this.getGbk_content() == null ? other.getGbk_content() == null : this.getGbk_content().equals(other.getGbk_content()))
            && (this.getEn_content() == null ? other.getEn_content() == null : this.getEn_content().equals(other.getEn_content()))
            && (this.getPot_make() == null ? other.getPot_make() == null : this.getPot_make().equals(other.getPot_make()))
            && (this.getChance_group() == null ? other.getChance_group() == null : this.getChance_group().equals(other.getChance_group()))
            && (this.getChance_group_num() == null ? other.getChance_group_num() == null : this.getChance_group_num().equals(other.getChance_group_num()))
            && (this.getChance_group_pot() == null ? other.getChance_group_pot() == null : this.getChance_group_pot().equals(other.getChance_group_pot()))
            && (this.getOdds() == null ? other.getOdds() == null : this.getOdds().equals(other.getOdds()))
            && (this.getInt_ratio_group() == null ? other.getInt_ratio_group() == null : this.getInt_ratio_group().equals(other.getInt_ratio_group()))
            && (this.getInt_ratio_default() == null ? other.getInt_ratio_default() == null : this.getInt_ratio_default().equals(other.getInt_ratio_default()))
            && (this.getCurrent_pot() == null ? other.getCurrent_pot() == null : this.getCurrent_pot().equals(other.getCurrent_pot()))
            && (this.getCurrent_pot_payout() == null ? other.getCurrent_pot_payout() == null : this.getCurrent_pot_payout().equals(other.getCurrent_pot_payout()))
            && (this.getNewmem_pot() == null ? other.getNewmem_pot() == null : this.getNewmem_pot().equals(other.getNewmem_pot()))
            && (this.getNewmem_pot_payout() == null ? other.getNewmem_pot_payout() == null : this.getNewmem_pot_payout().equals(other.getNewmem_pot_payout()))
            && (this.getGroup_id() == null ? other.getGroup_id() == null : this.getGroup_id().equals(other.getGroup_id()))
            && (this.getChoose() == null ? other.getChoose() == null : this.getChoose().equals(other.getChoose()))
            && (this.getVersions() == null ? other.getVersions() == null : this.getVersions().equals(other.getVersions()))
            && (this.getGame_name() == null ? other.getGame_name() == null : this.getGame_name().equals(other.getGame_name()))
            && (this.getChance() == null ? other.getChance() == null : this.getChance().equals(other.getChance()))
            && (this.getShared_profit() == null ? other.getShared_profit() == null : this.getShared_profit().equals(other.getShared_profit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSlot_set_id() == null) ? 0 : getSlot_set_id().hashCode());
        result = prime * result + ((getSlot_type() == null) ? 0 : getSlot_type().hashCode());
        result = prime * result + ((getSlot_num() == null) ? 0 : getSlot_num().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getBet_one() == null) ? 0 : getBet_one().hashCode());
        result = prime * result + ((getBet_two() == null) ? 0 : getBet_two().hashCode());
        result = prime * result + ((getBet_three() == null) ? 0 : getBet_three().hashCode());
        result = prime * result + ((getPot() == null) ? 0 : getPot().hashCode());
        result = prime * result + ((getPot_free() == null) ? 0 : getPot_free().hashCode());
        result = prime * result + ((getPot_payout() == null) ? 0 : getPot_payout().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getIs_enabled() == null) ? 0 : getIs_enabled().hashCode());
        result = prime * result + ((getIs_enabled_bet() == null) ? 0 : getIs_enabled_bet().hashCode());
        result = prime * result + ((getBig5_content() == null) ? 0 : getBig5_content().hashCode());
        result = prime * result + ((getGbk_content() == null) ? 0 : getGbk_content().hashCode());
        result = prime * result + ((getEn_content() == null) ? 0 : getEn_content().hashCode());
        result = prime * result + ((getPot_make() == null) ? 0 : getPot_make().hashCode());
        result = prime * result + ((getChance_group() == null) ? 0 : getChance_group().hashCode());
        result = prime * result + ((getChance_group_num() == null) ? 0 : getChance_group_num().hashCode());
        result = prime * result + ((getChance_group_pot() == null) ? 0 : getChance_group_pot().hashCode());
        result = prime * result + ((getOdds() == null) ? 0 : getOdds().hashCode());
        result = prime * result + ((getInt_ratio_group() == null) ? 0 : getInt_ratio_group().hashCode());
        result = prime * result + ((getInt_ratio_default() == null) ? 0 : getInt_ratio_default().hashCode());
        result = prime * result + ((getCurrent_pot() == null) ? 0 : getCurrent_pot().hashCode());
        result = prime * result + ((getCurrent_pot_payout() == null) ? 0 : getCurrent_pot_payout().hashCode());
        result = prime * result + ((getNewmem_pot() == null) ? 0 : getNewmem_pot().hashCode());
        result = prime * result + ((getNewmem_pot_payout() == null) ? 0 : getNewmem_pot_payout().hashCode());
        result = prime * result + ((getGroup_id() == null) ? 0 : getGroup_id().hashCode());
        result = prime * result + ((getChoose() == null) ? 0 : getChoose().hashCode());
        result = prime * result + ((getVersions() == null) ? 0 : getVersions().hashCode());
        result = prime * result + ((getGame_name() == null) ? 0 : getGame_name().hashCode());
        result = prime * result + ((getChance() == null) ? 0 : getChance().hashCode());
        result = prime * result + ((getShared_profit() == null) ? 0 : getShared_profit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slot_set_id=").append(slot_set_id);
        sb.append(", slot_type=").append(slot_type);
        sb.append(", slot_num=").append(slot_num);
        sb.append(", profit=").append(profit);
        sb.append(", agent=").append(agent);
        sb.append(", bet_one=").append(bet_one);
        sb.append(", bet_two=").append(bet_two);
        sb.append(", bet_three=").append(bet_three);
        sb.append(", pot=").append(pot);
        sb.append(", pot_free=").append(pot_free);
        sb.append(", pot_payout=").append(pot_payout);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", is_enabled=").append(is_enabled);
        sb.append(", is_enabled_bet=").append(is_enabled_bet);
        sb.append(", big5_content=").append(big5_content);
        sb.append(", gbk_content=").append(gbk_content);
        sb.append(", en_content=").append(en_content);
        sb.append(", pot_make=").append(pot_make);
        sb.append(", chance_group=").append(chance_group);
        sb.append(", chance_group_num=").append(chance_group_num);
        sb.append(", chance_group_pot=").append(chance_group_pot);
        sb.append(", odds=").append(odds);
        sb.append(", int_ratio_group=").append(int_ratio_group);
        sb.append(", int_ratio_default=").append(int_ratio_default);
        sb.append(", current_pot=").append(current_pot);
        sb.append(", current_pot_payout=").append(current_pot_payout);
        sb.append(", newmem_pot=").append(newmem_pot);
        sb.append(", newmem_pot_payout=").append(newmem_pot_payout);
        sb.append(", group_id=").append(group_id);
        sb.append(", choose=").append(choose);
        sb.append(", versions=").append(versions);
        sb.append(", game_name=").append(game_name);
        sb.append(", chance=").append(chance);
        sb.append(", shared_profit=").append(shared_profit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}