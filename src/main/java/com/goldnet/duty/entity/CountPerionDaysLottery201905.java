package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName count_perion_days_lottery_201905
 */
@TableName(value ="count_perion_days_lottery_201905")
@Data
public class CountPerionDaysLottery201905 implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

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
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDate create_time;

    /**
     * 
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 
     */
    @TableField(value = "count_num")
    private Object count_num;

    /**
     * 
     */
    @TableField(value = "betting_money")
    private BigDecimal betting_money;

    /**
     * 
     */
    @TableField(value = "valid_money")
    private BigDecimal valid_money;

    /**
     * 
     */
    @TableField(value = "member_result")
    private BigDecimal member_result;

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
        CountPerionDaysLottery201905 other = (CountPerionDaysLottery201905) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount0() == null ? other.getAccount0() == null : this.getAccount0().equals(other.getAccount0()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getCount_num() == null ? other.getCount_num() == null : this.getCount_num().equals(other.getCount_num()))
            && (this.getBetting_money() == null ? other.getBetting_money() == null : this.getBetting_money().equals(other.getBetting_money()))
            && (this.getValid_money() == null ? other.getValid_money() == null : this.getValid_money().equals(other.getValid_money()))
            && (this.getMember_result() == null ? other.getMember_result() == null : this.getMember_result().equals(other.getMember_result()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount0() == null) ? 0 : getAccount0().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getCount_num() == null) ? 0 : getCount_num().hashCode());
        result = prime * result + ((getBetting_money() == null) ? 0 : getBetting_money().hashCode());
        result = prime * result + ((getValid_money() == null) ? 0 : getValid_money().hashCode());
        result = prime * result + ((getMember_result() == null) ? 0 : getMember_result().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account0=").append(account0);
        sb.append(", account1=").append(account1);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", account5=").append(account5);
        sb.append(", account_id=").append(account_id);
        sb.append(", account=").append(account);
        sb.append(", create_time=").append(create_time);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", count_num=").append(count_num);
        sb.append(", betting_money=").append(betting_money);
        sb.append(", valid_money=").append(valid_money);
        sb.append(", member_result=").append(member_result);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}