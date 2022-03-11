package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 公司入款，存放第三方相关的设定，临时表，可在生成mny_check数据后删除
 * @TableName tps_comp_check_setting
 */
@TableName(value ="tps_comp_check_setting")
@Data
public class TpsCompCheckSetting implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * mny_comp_check_setting表的id
     */
    @TableField(value = "comp_setting_id")
    private Object comp_setting_id;

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
     * 打码量控制：0-稽核时打码量不加或为0;1-稽核时打码量累加
     */
    @TableField(value = "bet_status")
    private Object bet_status;

    /**
     * 公司入款稽核是否开启：0-否1-是
     */
    @TableField(value = "check_status")
    private Object check_status;

    /**
     * 公司入款额度稽核倍数
     */
    @TableField(value = "check_num")
    private Object check_num;

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
        TpsCompCheckSetting other = (TpsCompCheckSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getComp_setting_id() == null ? other.getComp_setting_id() == null : this.getComp_setting_id().equals(other.getComp_setting_id()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getPlatform_game_type() == null ? other.getPlatform_game_type() == null : this.getPlatform_game_type().equals(other.getPlatform_game_type()))
            && (this.getBet_status() == null ? other.getBet_status() == null : this.getBet_status().equals(other.getBet_status()))
            && (this.getCheck_status() == null ? other.getCheck_status() == null : this.getCheck_status().equals(other.getCheck_status()))
            && (this.getCheck_num() == null ? other.getCheck_num() == null : this.getCheck_num().equals(other.getCheck_num()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getComp_setting_id() == null) ? 0 : getComp_setting_id().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getPlatform_game_type() == null) ? 0 : getPlatform_game_type().hashCode());
        result = prime * result + ((getBet_status() == null) ? 0 : getBet_status().hashCode());
        result = prime * result + ((getCheck_status() == null) ? 0 : getCheck_status().hashCode());
        result = prime * result + ((getCheck_num() == null) ? 0 : getCheck_num().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", comp_setting_id=").append(comp_setting_id);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", platform_game_type=").append(platform_game_type);
        sb.append(", bet_status=").append(bet_status);
        sb.append(", check_status=").append(check_status);
        sb.append(", check_num=").append(check_num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}