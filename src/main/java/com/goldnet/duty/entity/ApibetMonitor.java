package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * api_betting_detail表的监控操作
 * @TableName apibet_monitor
 */
@TableName(value ="apibet_monitor")
@Data
public class ApibetMonitor implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 操作方式:0,update;1,insert;2,delete
     */
    @TableField(value = "action_int")
    private Integer action_int;

    /**
     * 创建时间
     */
    @TableField(value = "ctime")
    private LocalDateTime ctime;

    /**
     * 是否被消费,默认为0,被消费后置为1
     */
    @TableField(value = "is_use")
    private Integer is_use;

    /**
     * api_betting_detail表的主键id
     */
    @TableField(value = "apibet_id")
    private Object apibet_id;

    /**
     * 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 
     */
    @TableField(value = "account0")
    private Object account0;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 
     */
    @TableField(value = "account2")
    private Object account2;

    /**
     * 
     */
    @TableField(value = "account3")
    private Object account3;

    /**
     * 
     */
    @TableField(value = "account4")
    private Object account4;

    /**
     * 
     */
    @TableField(value = "account5")
    private Object account5;

    /**
     * 
     */
    @TableField(value = "account6")
    private Object account6;

    /**
     * 
     */
    @TableField(value = "betting_num")
    private Object betting_num;

    /**
     * 
     */
    @TableField(value = "betting_amount")
    private BigDecimal betting_amount;

    /**
     * 
     */
    @TableField(value = "profit_loss")
    private BigDecimal profit_loss;

    /**
     * 
     */
    @TableField(value = "real_betting_amount")
    private BigDecimal real_betting_amount;

    /**
     * 
     */
    @TableField(value = "import_batch_id")
    private Object import_batch_id;

    /**
     * 
     */
    @TableField(value = "betting_date")
    private LocalDate betting_date;

    /**
     * 
     */
    @TableField(value = "platform")
    private String platform;

    /**
     * 
     */
    @TableField(value = "progressive_amount")
    private BigDecimal progressive_amount;

    /**
     * 
     */
    @TableField(value = "progressive_pool")
    private BigDecimal progressive_pool;

    /**
     * 
     */
    @TableField(value = "station_durl")
    private String station_durl;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

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
        ApibetMonitor other = (ApibetMonitor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAction_int() == null ? other.getAction_int() == null : this.getAction_int().equals(other.getAction_int()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getIs_use() == null ? other.getIs_use() == null : this.getIs_use().equals(other.getIs_use()))
            && (this.getApibet_id() == null ? other.getApibet_id() == null : this.getApibet_id().equals(other.getApibet_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getAccount0() == null ? other.getAccount0() == null : this.getAccount0().equals(other.getAccount0()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getAccount6() == null ? other.getAccount6() == null : this.getAccount6().equals(other.getAccount6()))
            && (this.getBetting_num() == null ? other.getBetting_num() == null : this.getBetting_num().equals(other.getBetting_num()))
            && (this.getBetting_amount() == null ? other.getBetting_amount() == null : this.getBetting_amount().equals(other.getBetting_amount()))
            && (this.getProfit_loss() == null ? other.getProfit_loss() == null : this.getProfit_loss().equals(other.getProfit_loss()))
            && (this.getReal_betting_amount() == null ? other.getReal_betting_amount() == null : this.getReal_betting_amount().equals(other.getReal_betting_amount()))
            && (this.getImport_batch_id() == null ? other.getImport_batch_id() == null : this.getImport_batch_id().equals(other.getImport_batch_id()))
            && (this.getBetting_date() == null ? other.getBetting_date() == null : this.getBetting_date().equals(other.getBetting_date()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getProgressive_amount() == null ? other.getProgressive_amount() == null : this.getProgressive_amount().equals(other.getProgressive_amount()))
            && (this.getProgressive_pool() == null ? other.getProgressive_pool() == null : this.getProgressive_pool().equals(other.getProgressive_pool()))
            && (this.getStation_durl() == null ? other.getStation_durl() == null : this.getStation_durl().equals(other.getStation_durl()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAction_int() == null) ? 0 : getAction_int().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getIs_use() == null) ? 0 : getIs_use().hashCode());
        result = prime * result + ((getApibet_id() == null) ? 0 : getApibet_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getAccount0() == null) ? 0 : getAccount0().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getAccount6() == null) ? 0 : getAccount6().hashCode());
        result = prime * result + ((getBetting_num() == null) ? 0 : getBetting_num().hashCode());
        result = prime * result + ((getBetting_amount() == null) ? 0 : getBetting_amount().hashCode());
        result = prime * result + ((getProfit_loss() == null) ? 0 : getProfit_loss().hashCode());
        result = prime * result + ((getReal_betting_amount() == null) ? 0 : getReal_betting_amount().hashCode());
        result = prime * result + ((getImport_batch_id() == null) ? 0 : getImport_batch_id().hashCode());
        result = prime * result + ((getBetting_date() == null) ? 0 : getBetting_date().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getProgressive_amount() == null) ? 0 : getProgressive_amount().hashCode());
        result = prime * result + ((getProgressive_pool() == null) ? 0 : getProgressive_pool().hashCode());
        result = prime * result + ((getStation_durl() == null) ? 0 : getStation_durl().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", action_int=").append(action_int);
        sb.append(", ctime=").append(ctime);
        sb.append(", is_use=").append(is_use);
        sb.append(", apibet_id=").append(apibet_id);
        sb.append(", account=").append(account);
        sb.append(", account0=").append(account0);
        sb.append(", account1=").append(account1);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", account5=").append(account5);
        sb.append(", account6=").append(account6);
        sb.append(", betting_num=").append(betting_num);
        sb.append(", betting_amount=").append(betting_amount);
        sb.append(", profit_loss=").append(profit_loss);
        sb.append(", real_betting_amount=").append(real_betting_amount);
        sb.append(", import_batch_id=").append(import_batch_id);
        sb.append(", betting_date=").append(betting_date);
        sb.append(", platform=").append(platform);
        sb.append(", progressive_amount=").append(progressive_amount);
        sb.append(", progressive_pool=").append(progressive_pool);
        sb.append(", station_durl=").append(station_durl);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}