package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 游戏平台表
 * @TableName ms_game
 */
@TableName(value ="ms_game")
@Data
public class MsGame implements Serializable {
    /**
     * ID
     */
    @TableId(value = "game_id")
    private Object game_id;

    /**
     * 平台名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 平台编码
     */
    @TableField(value = "code")
    private String code;

    /**
     * 平台类型集合对应api_betting_detail表
     */
    @TableField(value = "types")
    private String types;

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
        MsGame other = (MsGame) that;
        return (this.getGame_id() == null ? other.getGame_id() == null : this.getGame_id().equals(other.getGame_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getTypes() == null ? other.getTypes() == null : this.getTypes().equals(other.getTypes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGame_id() == null) ? 0 : getGame_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getTypes() == null) ? 0 : getTypes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", game_id=").append(game_id);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", types=").append(types);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}