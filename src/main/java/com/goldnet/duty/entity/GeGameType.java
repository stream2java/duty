package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 游戏
 * @TableName ge_game_type
 */
@TableName(value ="ge_game_type")
@Data
public class GeGameType implements Serializable {
    /**
     * 游戏id
     */
    @TableId(value = "type_id")
    private Object type_id;

    /**
     * 游戏编号
     */
    @TableField(value = "type_code")
    private String type_code;

    /**
     * 游戏名称
     */
    @TableField(value = "type_name")
    private String type_name;

    /**
     * 状态 默认0为有效，1为无效
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 等级
     */
    @TableField(value = "rating")
    private Object rating;

    /**
     * 父级
     */
    @TableField(value = "parent")
    private Object parent;

    /**
     * 是否玩法
     */
    @TableField(value = "game")
    private String game;

    /**
     * 对应数据字典,定位/组合/跨度
     */
    @TableField(value = "game_type")
    private String game_type;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 创建用户
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 修改用户
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 彩票种类
     */
    @TableField(value = "lottery_type")
    private String lottery_type;

    /**
     * 是否在前台游戏时显示(大游戏)
     */
    @TableField(value = "betting")
    private Object betting;

    /**
     * 用于查询赔率差等
     */
    @TableField(value = "betting_code")
    private String betting_code;

    /**
     * 是否在详细设置里面显示,只有前三需要保存
     */
    @TableField(value = "detail")
    private Object detail;

    /**
     * 
     */
    @TableField(value = "detail_name")
    private String detail_name;

    /**
     * 对应的前三ID,用于校验时用,限额等只保存前三
     */
    @TableField(value = "front_id")
    private Object front_id;

    /**
     * 详细设定排序
     */
    @TableField(value = "order_detail")
    private String order_detail;

    /**
     * [typeid][typeid]从顶级到当前级别
     */
    @TableField(value = "type_path")
    private String type_path;

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
        GeGameType other = (GeGameType) that;
        return (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getType_code() == null ? other.getType_code() == null : this.getType_code().equals(other.getType_code()))
            && (this.getType_name() == null ? other.getType_name() == null : this.getType_name().equals(other.getType_name()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRating() == null ? other.getRating() == null : this.getRating().equals(other.getRating()))
            && (this.getParent() == null ? other.getParent() == null : this.getParent().equals(other.getParent()))
            && (this.getGame() == null ? other.getGame() == null : this.getGame().equals(other.getGame()))
            && (this.getGame_type() == null ? other.getGame_type() == null : this.getGame_type().equals(other.getGame_type()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getLottery_type() == null ? other.getLottery_type() == null : this.getLottery_type().equals(other.getLottery_type()))
            && (this.getBetting() == null ? other.getBetting() == null : this.getBetting().equals(other.getBetting()))
            && (this.getBetting_code() == null ? other.getBetting_code() == null : this.getBetting_code().equals(other.getBetting_code()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getDetail_name() == null ? other.getDetail_name() == null : this.getDetail_name().equals(other.getDetail_name()))
            && (this.getFront_id() == null ? other.getFront_id() == null : this.getFront_id().equals(other.getFront_id()))
            && (this.getOrder_detail() == null ? other.getOrder_detail() == null : this.getOrder_detail().equals(other.getOrder_detail()))
            && (this.getType_path() == null ? other.getType_path() == null : this.getType_path().equals(other.getType_path()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getType_code() == null) ? 0 : getType_code().hashCode());
        result = prime * result + ((getType_name() == null) ? 0 : getType_name().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRating() == null) ? 0 : getRating().hashCode());
        result = prime * result + ((getParent() == null) ? 0 : getParent().hashCode());
        result = prime * result + ((getGame() == null) ? 0 : getGame().hashCode());
        result = prime * result + ((getGame_type() == null) ? 0 : getGame_type().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getLottery_type() == null) ? 0 : getLottery_type().hashCode());
        result = prime * result + ((getBetting() == null) ? 0 : getBetting().hashCode());
        result = prime * result + ((getBetting_code() == null) ? 0 : getBetting_code().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getDetail_name() == null) ? 0 : getDetail_name().hashCode());
        result = prime * result + ((getFront_id() == null) ? 0 : getFront_id().hashCode());
        result = prime * result + ((getOrder_detail() == null) ? 0 : getOrder_detail().hashCode());
        result = prime * result + ((getType_path() == null) ? 0 : getType_path().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", type_id=").append(type_id);
        sb.append(", type_code=").append(type_code);
        sb.append(", type_name=").append(type_name);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", rating=").append(rating);
        sb.append(", parent=").append(parent);
        sb.append(", game=").append(game);
        sb.append(", game_type=").append(game_type);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", update_user=").append(update_user);
        sb.append(", lottery_type=").append(lottery_type);
        sb.append(", betting=").append(betting);
        sb.append(", betting_code=").append(betting_code);
        sb.append(", detail=").append(detail);
        sb.append(", detail_name=").append(detail_name);
        sb.append(", front_id=").append(front_id);
        sb.append(", order_detail=").append(order_detail);
        sb.append(", type_path=").append(type_path);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}