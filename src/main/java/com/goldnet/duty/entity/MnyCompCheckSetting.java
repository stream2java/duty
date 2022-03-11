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
 * 公司入款，存放第三方不相关的设定，临时表，可在生成mny_check数据后删除
 * @TableName mny_comp_check_setting
 */
@TableName(value ="mny_comp_check_setting")
@Data
public class MnyCompCheckSetting implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 公司入款mny_com_record表id
     */
    @TableField(value = "comp_record_id")
    private Object comp_record_id;

    /**
     * 存款金额
     */
    @TableField(value = "deposit_money")
    private BigDecimal deposit_money;

    /**
     * 优惠
     */
    @TableField(value = "preferential")
    private BigDecimal preferential;

    /**
     * 公司入款时综合额度稽核状态：0-不需稽核1-需稽核
     */
    @TableField(value = "comp_check_status")
    private Object comp_check_status;

    /**
     * 公司入款时综合额度稽核倍数
     */
    @TableField(value = "comp_check_num")
    private Object comp_check_num;

    /**
     * 公司入款时常态性稽核状态数据：0-不需稽核1-需稽核
     */
    @TableField(value = "normal_check_status")
    private Object normal_check_status;

    /**
     * 常态性稽核百分比数据
     */
    @TableField(value = "normal_per")
    private Object normal_per;

    /**
     * 常态性稽核放宽额度数据
     */
    @TableField(value = "normal_relax")
    private BigDecimal normal_relax;

    /**
     * 常态性稽核行政费率数据
     */
    @TableField(value = "normal_adm_per")
    private Object normal_adm_per;

    /**
     * 人工存入综合打码量
     */
    @TableField(value = "comp_bet")
    private BigDecimal comp_bet;

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
        MnyCompCheckSetting other = (MnyCompCheckSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getComp_record_id() == null ? other.getComp_record_id() == null : this.getComp_record_id().equals(other.getComp_record_id()))
            && (this.getDeposit_money() == null ? other.getDeposit_money() == null : this.getDeposit_money().equals(other.getDeposit_money()))
            && (this.getPreferential() == null ? other.getPreferential() == null : this.getPreferential().equals(other.getPreferential()))
            && (this.getComp_check_status() == null ? other.getComp_check_status() == null : this.getComp_check_status().equals(other.getComp_check_status()))
            && (this.getComp_check_num() == null ? other.getComp_check_num() == null : this.getComp_check_num().equals(other.getComp_check_num()))
            && (this.getNormal_check_status() == null ? other.getNormal_check_status() == null : this.getNormal_check_status().equals(other.getNormal_check_status()))
            && (this.getNormal_per() == null ? other.getNormal_per() == null : this.getNormal_per().equals(other.getNormal_per()))
            && (this.getNormal_relax() == null ? other.getNormal_relax() == null : this.getNormal_relax().equals(other.getNormal_relax()))
            && (this.getNormal_adm_per() == null ? other.getNormal_adm_per() == null : this.getNormal_adm_per().equals(other.getNormal_adm_per()))
            && (this.getComp_bet() == null ? other.getComp_bet() == null : this.getComp_bet().equals(other.getComp_bet()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getComp_record_id() == null) ? 0 : getComp_record_id().hashCode());
        result = prime * result + ((getDeposit_money() == null) ? 0 : getDeposit_money().hashCode());
        result = prime * result + ((getPreferential() == null) ? 0 : getPreferential().hashCode());
        result = prime * result + ((getComp_check_status() == null) ? 0 : getComp_check_status().hashCode());
        result = prime * result + ((getComp_check_num() == null) ? 0 : getComp_check_num().hashCode());
        result = prime * result + ((getNormal_check_status() == null) ? 0 : getNormal_check_status().hashCode());
        result = prime * result + ((getNormal_per() == null) ? 0 : getNormal_per().hashCode());
        result = prime * result + ((getNormal_relax() == null) ? 0 : getNormal_relax().hashCode());
        result = prime * result + ((getNormal_adm_per() == null) ? 0 : getNormal_adm_per().hashCode());
        result = prime * result + ((getComp_bet() == null) ? 0 : getComp_bet().hashCode());
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
        sb.append(", comp_record_id=").append(comp_record_id);
        sb.append(", deposit_money=").append(deposit_money);
        sb.append(", preferential=").append(preferential);
        sb.append(", comp_check_status=").append(comp_check_status);
        sb.append(", comp_check_num=").append(comp_check_num);
        sb.append(", normal_check_status=").append(normal_check_status);
        sb.append(", normal_per=").append(normal_per);
        sb.append(", normal_relax=").append(normal_relax);
        sb.append(", normal_adm_per=").append(normal_adm_per);
        sb.append(", comp_bet=").append(comp_bet);
        sb.append(", create_time=").append(create_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}