package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 注单导入汇总表
 * @TableName api_import_total_detail
 */
@TableName(value ="api_import_total_detail")
@Data
public class ApiImportTotalDetail implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 导入批次id
     */
    @TableField(value = "batch_id")
    private Object batch_id;

    /**
     * 游戏分类
     */
    @TableField(value = "type_code")
    private String type_code;

    /**
     * 导入平台
     */
    @TableField(value = "platform")
    private String platform;

    /**
     * 投注日期
     */
    @TableField(value = "betting_date")
    private LocalDate betting_date;

    /**
     * 投注总额
     */
    @TableField(value = "betting_amount")
    private Integer betting_amount;

    /**
     * 损益总计
     */
    @TableField(value = "profit_loss_amount")
    private Integer profit_loss_amount;

    /**
     * 投注单量
     */
    @TableField(value = "betting_num")
    private Object betting_num;

    /**
     * 投注人数
     */
    @TableField(value = "betting_member_num")
    private Object betting_member_num;

    /**
     * 创建时间
     */
    @TableField(value = "start_time")
    private LocalDateTime start_time;

    /**
     * 创建时间
     */
    @TableField(value = "end_time")
    private LocalDateTime end_time;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

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
        ApiImportTotalDetail other = (ApiImportTotalDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getBatch_id() == null ? other.getBatch_id() == null : this.getBatch_id().equals(other.getBatch_id()))
            && (this.getType_code() == null ? other.getType_code() == null : this.getType_code().equals(other.getType_code()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getBetting_date() == null ? other.getBetting_date() == null : this.getBetting_date().equals(other.getBetting_date()))
            && (this.getBetting_amount() == null ? other.getBetting_amount() == null : this.getBetting_amount().equals(other.getBetting_amount()))
            && (this.getProfit_loss_amount() == null ? other.getProfit_loss_amount() == null : this.getProfit_loss_amount().equals(other.getProfit_loss_amount()))
            && (this.getBetting_num() == null ? other.getBetting_num() == null : this.getBetting_num().equals(other.getBetting_num()))
            && (this.getBetting_member_num() == null ? other.getBetting_member_num() == null : this.getBetting_member_num().equals(other.getBetting_member_num()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getBatch_id() == null) ? 0 : getBatch_id().hashCode());
        result = prime * result + ((getType_code() == null) ? 0 : getType_code().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getBetting_date() == null) ? 0 : getBetting_date().hashCode());
        result = prime * result + ((getBetting_amount() == null) ? 0 : getBetting_amount().hashCode());
        result = prime * result + ((getProfit_loss_amount() == null) ? 0 : getProfit_loss_amount().hashCode());
        result = prime * result + ((getBetting_num() == null) ? 0 : getBetting_num().hashCode());
        result = prime * result + ((getBetting_member_num() == null) ? 0 : getBetting_member_num().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account1=").append(account1);
        sb.append(", batch_id=").append(batch_id);
        sb.append(", type_code=").append(type_code);
        sb.append(", platform=").append(platform);
        sb.append(", betting_date=").append(betting_date);
        sb.append(", betting_amount=").append(betting_amount);
        sb.append(", profit_loss_amount=").append(profit_loss_amount);
        sb.append(", betting_num=").append(betting_num);
        sb.append(", betting_member_num=").append(betting_member_num);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", create_time=").append(create_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}