package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 人工存入临时表
 * @TableName temp_man_deposit
 */
@TableName(value ="temp_man_deposit")
@Data
public class TempManDeposit implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 批号
     */
    @TableField(value = "batch_no")
    private String batch_no;

    /**
     * 状态
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 存款项目
     */
    @TableField(value = "deposit_project")
    private Object deposit_project;

    /**
     * 会员账号
     */
    @TableField(value = "account_name")
    private String account_name;

    /**
     * 存入金额
     */
    @TableField(value = "deposit_money")
    private BigDecimal deposit_money;

    /**
     * 存款优惠
     */
    @TableField(value = "deposit_pre_money")
    private BigDecimal deposit_pre_money;

    /**
     * 汇款优惠
     */
    @TableField(value = "other_pre_money")
    private BigDecimal other_pre_money;

    /**
     * 综合打码稽核
     */
    @TableField(value = "comp_bet")
    private BigDecimal comp_bet;

    /**
     * 常态性稽核
     */
    @TableField(value = "normal_check_status")
    private String normal_check_status;

    /**
     * 写入退佣费用
     */
    @TableField(value = "write_back_status")
    private String write_back_status;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 站点id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private LocalDateTime create_date;

    /**
     * 行数
     */
    @TableField(value = "rownum")
    private Object rownum;

    /**
     * 文件名
     */
    @TableField(value = "file_name")
    private String file_name;

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
        TempManDeposit other = (TempManDeposit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBatch_no() == null ? other.getBatch_no() == null : this.getBatch_no().equals(other.getBatch_no()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDeposit_project() == null ? other.getDeposit_project() == null : this.getDeposit_project().equals(other.getDeposit_project()))
            && (this.getAccount_name() == null ? other.getAccount_name() == null : this.getAccount_name().equals(other.getAccount_name()))
            && (this.getDeposit_money() == null ? other.getDeposit_money() == null : this.getDeposit_money().equals(other.getDeposit_money()))
            && (this.getDeposit_pre_money() == null ? other.getDeposit_pre_money() == null : this.getDeposit_pre_money().equals(other.getDeposit_pre_money()))
            && (this.getOther_pre_money() == null ? other.getOther_pre_money() == null : this.getOther_pre_money().equals(other.getOther_pre_money()))
            && (this.getComp_bet() == null ? other.getComp_bet() == null : this.getComp_bet().equals(other.getComp_bet()))
            && (this.getNormal_check_status() == null ? other.getNormal_check_status() == null : this.getNormal_check_status().equals(other.getNormal_check_status()))
            && (this.getWrite_back_status() == null ? other.getWrite_back_status() == null : this.getWrite_back_status().equals(other.getWrite_back_status()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getRownum() == null ? other.getRownum() == null : this.getRownum().equals(other.getRownum()))
            && (this.getFile_name() == null ? other.getFile_name() == null : this.getFile_name().equals(other.getFile_name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBatch_no() == null) ? 0 : getBatch_no().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDeposit_project() == null) ? 0 : getDeposit_project().hashCode());
        result = prime * result + ((getAccount_name() == null) ? 0 : getAccount_name().hashCode());
        result = prime * result + ((getDeposit_money() == null) ? 0 : getDeposit_money().hashCode());
        result = prime * result + ((getDeposit_pre_money() == null) ? 0 : getDeposit_pre_money().hashCode());
        result = prime * result + ((getOther_pre_money() == null) ? 0 : getOther_pre_money().hashCode());
        result = prime * result + ((getComp_bet() == null) ? 0 : getComp_bet().hashCode());
        result = prime * result + ((getNormal_check_status() == null) ? 0 : getNormal_check_status().hashCode());
        result = prime * result + ((getWrite_back_status() == null) ? 0 : getWrite_back_status().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getRownum() == null) ? 0 : getRownum().hashCode());
        result = prime * result + ((getFile_name() == null) ? 0 : getFile_name().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", batch_no=").append(batch_no);
        sb.append(", status=").append(status);
        sb.append(", deposit_project=").append(deposit_project);
        sb.append(", account_name=").append(account_name);
        sb.append(", deposit_money=").append(deposit_money);
        sb.append(", deposit_pre_money=").append(deposit_pre_money);
        sb.append(", other_pre_money=").append(other_pre_money);
        sb.append(", comp_bet=").append(comp_bet);
        sb.append(", normal_check_status=").append(normal_check_status);
        sb.append(", write_back_status=").append(write_back_status);
        sb.append(", remark=").append(remark);
        sb.append(", account1=").append(account1);
        sb.append(", create_date=").append(create_date);
        sb.append(", rownum=").append(rownum);
        sb.append(", file_name=").append(file_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}