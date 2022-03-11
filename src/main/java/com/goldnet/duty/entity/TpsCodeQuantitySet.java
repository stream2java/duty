package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 新线上付款设定第三方相关的设定表
 * @TableName tps_code_quantity_set
 */
@TableName(value ="tps_code_quantity_set")
@Data
public class TpsCodeQuantitySet implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 新线上付款设定mny_code_quantity_set表id
     */
    @TableField(value = "code_set_id")
    private Object code_set_id;

    /**
     * 第三方游戏平台大类code，如ag, og, bg
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 第三方游戏平台大类+小类code，如agby, ogsx
     */
    @TableField(value = "platform_game_type")
    private String platform_game_type;

    /**
     * 线上存款稽核是否开启：0-否1-是
     */
    @TableField(value = "online_check_status")
    private Object online_check_status;

    /**
     * 线上存款额度稽核倍数
     */
    @TableField(value = "online_check_num")
    private Object online_check_num;

    /**
     * 公司入款稽核是否开启：0-否1-是
     */
    @TableField(value = "comp_check_status")
    private Object comp_check_status;

    /**
     * 公司入款额度稽核倍数
     */
    @TableField(value = "comp_check_num")
    private Object comp_check_num;

    /**
     * 打码量控制：0-稽核时打码量不加或为0;1-稽核时打码量累加
     */
    @TableField(value = "bet_status")
    private Object bet_status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 余额宝稽核是否开启：0-否1-是
     */
    @TableField(value = "yuebao_check_status")
    private Object yuebao_check_status;

    /**
     * 余额宝额度稽核倍数
     */
    @TableField(value = "yuebao_check_num")
    private Object yuebao_check_num;

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
        TpsCodeQuantitySet other = (TpsCodeQuantitySet) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode_set_id() == null ? other.getCode_set_id() == null : this.getCode_set_id().equals(other.getCode_set_id()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getPlatform_game_type() == null ? other.getPlatform_game_type() == null : this.getPlatform_game_type().equals(other.getPlatform_game_type()))
            && (this.getOnline_check_status() == null ? other.getOnline_check_status() == null : this.getOnline_check_status().equals(other.getOnline_check_status()))
            && (this.getOnline_check_num() == null ? other.getOnline_check_num() == null : this.getOnline_check_num().equals(other.getOnline_check_num()))
            && (this.getComp_check_status() == null ? other.getComp_check_status() == null : this.getComp_check_status().equals(other.getComp_check_status()))
            && (this.getComp_check_num() == null ? other.getComp_check_num() == null : this.getComp_check_num().equals(other.getComp_check_num()))
            && (this.getBet_status() == null ? other.getBet_status() == null : this.getBet_status().equals(other.getBet_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getYuebao_check_status() == null ? other.getYuebao_check_status() == null : this.getYuebao_check_status().equals(other.getYuebao_check_status()))
            && (this.getYuebao_check_num() == null ? other.getYuebao_check_num() == null : this.getYuebao_check_num().equals(other.getYuebao_check_num()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode_set_id() == null) ? 0 : getCode_set_id().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getPlatform_game_type() == null) ? 0 : getPlatform_game_type().hashCode());
        result = prime * result + ((getOnline_check_status() == null) ? 0 : getOnline_check_status().hashCode());
        result = prime * result + ((getOnline_check_num() == null) ? 0 : getOnline_check_num().hashCode());
        result = prime * result + ((getComp_check_status() == null) ? 0 : getComp_check_status().hashCode());
        result = prime * result + ((getComp_check_num() == null) ? 0 : getComp_check_num().hashCode());
        result = prime * result + ((getBet_status() == null) ? 0 : getBet_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getYuebao_check_status() == null) ? 0 : getYuebao_check_status().hashCode());
        result = prime * result + ((getYuebao_check_num() == null) ? 0 : getYuebao_check_num().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code_set_id=").append(code_set_id);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", platform_game_type=").append(platform_game_type);
        sb.append(", online_check_status=").append(online_check_status);
        sb.append(", online_check_num=").append(online_check_num);
        sb.append(", comp_check_status=").append(comp_check_status);
        sb.append(", comp_check_num=").append(comp_check_num);
        sb.append(", bet_status=").append(bet_status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", yuebao_check_status=").append(yuebao_check_status);
        sb.append(", yuebao_check_num=").append(yuebao_check_num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}