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
 * 仪表板数据汇总表
 * @TableName ge_dashboard_total
 */
@TableName(value ="ge_dashboard_total")
@Data
public class GeDashboardTotal implements Serializable {
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
     * 统计的日期
     */
    @TableField(value = "collect_date")
    private LocalDate collect_date;

    /**
     * 新进代理数
     */
    @TableField(value = "new_agent_num")
    private Object new_agent_num;

    /**
     * 首存人数
     */
    @TableField(value = "first_deposit_num")
    private Object first_deposit_num;

    /**
     * 注册人数
     */
    @TableField(value = "register_num")
    private Object register_num;

    /**
     * 取款金额总计
     */
    @TableField(value = "draw_amount")
    private Integer draw_amount;

    /**
     * 存款金额总计
     */
    @TableField(value = "deposit_amount")
    private Integer deposit_amount;

    /**
     * 优惠成本
     */
    @TableField(value = "preferential_cost")
    private Integer preferential_cost;

    /**
     * 收集注单数据时间
     */
    @TableField(value = "collect_betting_time")
    private LocalDateTime collect_betting_time;

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
     * 取款人数
     */
    @TableField(value = "draw_num")
    private Object draw_num;

    /**
     * 存款人数
     */
    @TableField(value = "deposit_num")
    private Object deposit_num;

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
        GeDashboardTotal other = (GeDashboardTotal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getCollect_date() == null ? other.getCollect_date() == null : this.getCollect_date().equals(other.getCollect_date()))
            && (this.getNew_agent_num() == null ? other.getNew_agent_num() == null : this.getNew_agent_num().equals(other.getNew_agent_num()))
            && (this.getFirst_deposit_num() == null ? other.getFirst_deposit_num() == null : this.getFirst_deposit_num().equals(other.getFirst_deposit_num()))
            && (this.getRegister_num() == null ? other.getRegister_num() == null : this.getRegister_num().equals(other.getRegister_num()))
            && (this.getDraw_amount() == null ? other.getDraw_amount() == null : this.getDraw_amount().equals(other.getDraw_amount()))
            && (this.getDeposit_amount() == null ? other.getDeposit_amount() == null : this.getDeposit_amount().equals(other.getDeposit_amount()))
            && (this.getPreferential_cost() == null ? other.getPreferential_cost() == null : this.getPreferential_cost().equals(other.getPreferential_cost()))
            && (this.getCollect_betting_time() == null ? other.getCollect_betting_time() == null : this.getCollect_betting_time().equals(other.getCollect_betting_time()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDraw_num() == null ? other.getDraw_num() == null : this.getDraw_num().equals(other.getDraw_num()))
            && (this.getDeposit_num() == null ? other.getDeposit_num() == null : this.getDeposit_num().equals(other.getDeposit_num()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getCollect_date() == null) ? 0 : getCollect_date().hashCode());
        result = prime * result + ((getNew_agent_num() == null) ? 0 : getNew_agent_num().hashCode());
        result = prime * result + ((getFirst_deposit_num() == null) ? 0 : getFirst_deposit_num().hashCode());
        result = prime * result + ((getRegister_num() == null) ? 0 : getRegister_num().hashCode());
        result = prime * result + ((getDraw_amount() == null) ? 0 : getDraw_amount().hashCode());
        result = prime * result + ((getDeposit_amount() == null) ? 0 : getDeposit_amount().hashCode());
        result = prime * result + ((getPreferential_cost() == null) ? 0 : getPreferential_cost().hashCode());
        result = prime * result + ((getCollect_betting_time() == null) ? 0 : getCollect_betting_time().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDraw_num() == null) ? 0 : getDraw_num().hashCode());
        result = prime * result + ((getDeposit_num() == null) ? 0 : getDeposit_num().hashCode());
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
        sb.append(", collect_date=").append(collect_date);
        sb.append(", new_agent_num=").append(new_agent_num);
        sb.append(", first_deposit_num=").append(first_deposit_num);
        sb.append(", register_num=").append(register_num);
        sb.append(", draw_amount=").append(draw_amount);
        sb.append(", deposit_amount=").append(deposit_amount);
        sb.append(", preferential_cost=").append(preferential_cost);
        sb.append(", collect_betting_time=").append(collect_betting_time);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", draw_num=").append(draw_num);
        sb.append(", deposit_num=").append(deposit_num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}