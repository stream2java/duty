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
 * 
 * @TableName mny_code_quantity_set
 */
@TableName(value ="mny_code_quantity_set")
@Data
public class MnyCodeQuantitySet implements Serializable {
    /**
     * 基本设定表id
     */
    @TableId(value = "code_quantity_id")
    private Object code_quantity_id;

    /**
     * 支付平台手续费
     */
    @TableField(value = "pay_platform_fees_draw")
    private BigDecimal pay_platform_fees_draw;

    /**
     * 出款手续费的重复出款时数
     */
    @TableField(value = "repeat_time_num_draw")
    private Object repeat_time_num_draw;

    /**
     * 出款手续费 的免费次数
     */
    @TableField(value = "free_times_draw")
    private Object free_times_draw;

    /**
     * 出款手续费金额
     */
    @TableField(value = "money_draw")
    private BigDecimal money_draw;

    /**
     * 取款审核时间是否提示:0-禁用,1-启用
     */
    @TableField(value = "cue_draw_check")
    private Object cue_draw_check;

    /**
     * 取款金额超过此数需审核
     */
    @TableField(value = "money_draw_check")
    private BigDecimal money_draw_check;

    /**
     * 审核等待时数
     */
    @TableField(value = "time_num_draw_check")
    private Object time_num_draw_check;

    /**
     * 关联币别表id
     */
    @TableField(value = "relation_currency_id")
    private Object relation_currency_id;

    /**
     * 关联厅主自定设定表id
     */
    @TableField(value = "relation_customize_id")
    private Object relation_customize_id;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 线上存款方式存款优惠次数:0-首次,1-每次
     */
    @TableField(value = "pre_deposit_times_online")
    private Object pre_deposit_times_online;

    /**
     * 线上存款方式可放弃存款优惠:0-放弃,1-放弃
     */
    @TableField(value = "pre_deposit_status_online")
    private Object pre_deposit_status_online;

    /**
     * 公司入款方式存款优惠次数:0-首次,1-每次
     */
    @TableField(value = "pre_deposit_times_company")
    private Object pre_deposit_times_company;

    /**
     * 公司入款方式可放弃存款优惠:0-放弃,1-放弃
     */
    @TableField(value = "pre_deposit_status_company")
    private Object pre_deposit_status_company;

    /**
     * 线上存款方式优惠标准
     */
    @TableField(value = "pre_standard_online")
    private BigDecimal pre_standard_online;

    /**
     * 公司入款方式优惠标准
     */
    @TableField(value = "pre_standard_company")
    private BigDecimal pre_standard_company;

    /**
     * 线上存款方式优惠百分比
     */
    @TableField(value = "pre_per_online")
    private BigDecimal pre_per_online;

    /**
     * 公司入款方式优惠百分比
     */
    @TableField(value = "pre_per_company")
    private BigDecimal pre_per_company;

    /**
     * 线上存款方式优惠系数
     */
    @TableField(value = "pre_ratio_online")
    private Object pre_ratio_online;

    /**
     * 公司入款方式优惠系数
     */
    @TableField(value = "pre_ratio_company")
    private Object pre_ratio_company;

    /**
     * 线上存款方式最高存款金额
     */
    @TableField(value = "high_deposit_online")
    private BigDecimal high_deposit_online;

    /**
     * 公司入款方式最低存款金额
     */
    @TableField(value = "high_deposit_company")
    private BigDecimal high_deposit_company;

    /**
     * 线上存款方式最高存款金额
     */
    @TableField(value = "min_deposit_online")
    private BigDecimal min_deposit_online;

    /**
     * 公司入款方式最低存款金额
     */
    @TableField(value = "min_deposit_company")
    private BigDecimal min_deposit_company;

    /**
     * 线上存款方式优惠上限金额
     */
    @TableField(value = "pre_up_online")
    private BigDecimal pre_up_online;

    /**
     * 公司入款方式优惠上限金额
     */
    @TableField(value = "pre_up_company")
    private BigDecimal pre_up_company;

    /**
     * 公司入款方式其他优惠标准
     */
    @TableField(value = "opre_standard_company")
    private BigDecimal opre_standard_company;

    /**
     * 公司入款方式其他优惠百分比
     */
    @TableField(value = "opre_per_company")
    private Integer opre_per_company;

    /**
     * 公司入款方式其他优惠上限
     */
    @TableField(value = "opre_up_company")
    private BigDecimal opre_up_company;

    /**
     * 线上存款方式出款上限
     */
    @TableField(value = "draw_up_online")
    private BigDecimal draw_up_online;

    /**
     * 线上存款方式出款下限
     */
    @TableField(value = "draw_low_online")
    private BigDecimal draw_low_online;

    /**
     * 线上存款方式综合额度稽核是否开启:0-否,1-是
     */
    @TableField(value = "status_comp_online")
    private Object status_comp_online;

    /**
     * 线上存款方式综合额度稽核倍数
     */
    @TableField(value = "num_comp_online")
    private Object num_comp_online;

    /**
     * 公司入款方式综合额度稽核是否开启:0-否,1-是
     */
    @TableField(value = "status_comp_company")
    private Object status_comp_company;

    /**
     * 公司入款方式综合额度稽核倍数
     */
    @TableField(value = "num_comp_company")
    private Object num_comp_company;

    /**
     * 线上存款方式常态性额度稽核是否开启:0-否,1-是
     */
    @TableField(value = "status_normal_online")
    private Object status_normal_online;

    /**
     * 线上存款方式常态性额度稽核倍数
     */
    @TableField(value = "num_normal_online")
    private Object num_normal_online;

    /**
     * 公司入款方式常态性额度稽核是否开启:0-否,1-是
     */
    @TableField(value = "status_normal_company")
    private Object status_normal_company;

    /**
     * 公司入款方式常态性额度稽核倍数
     */
    @TableField(value = "num_normal_company")
    private Object num_normal_company;

    /**
     * 线上存款方式优惠余额百分比
     */
    @TableField(value = "pre_rem_per_online")
    private Object pre_rem_per_online;

    /**
     * 公司入款方式优惠余额百分比
     */
    @TableField(value = "pre_rem_per_company")
    private Object pre_rem_per_company;

    /**
     * 线上存款方式常态性稽核放宽额度
     */
    @TableField(value = "normal_relax_online")
    private BigDecimal normal_relax_online;

    /**
     * 公司入款方式常态性稽核放宽额度
     */
    @TableField(value = "normal_relax_company")
    private BigDecimal normal_relax_company;

    /**
     * 线上存款方式常态性稽核行政费率
     */
    @TableField(value = "normal_adm_per_online")
    private Object normal_adm_per_online;

    /**
     * 公司入款方式常态性稽核行政费率
     */
    @TableField(value = "normal_adm_per_company")
    private Object normal_adm_per_company;

    /**
     * 大大股东ID
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 0：优惠比例  1：充值类型比例
     */
    @TableField(value = "discounts_type")
    private Object discounts_type;

    /**
     * 余额宝入款方式：0-首次,1-每次, 2-不优惠, 3-前N次，4-每天前N次
     */
    @TableField(value = "pre_deposit_times_yuebao")
    private Object pre_deposit_times_yuebao;

    /**
     * 余额宝方式优惠次数
     */
    @TableField(value = "pre_ratio_yuebao")
    private Object pre_ratio_yuebao;

    /**
     * 余额宝用户是否可放弃优惠
     */
    @TableField(value = "pre_deposit_status_yuebao")
    private Object pre_deposit_status_yuebao;

    /**
     * 余额宝存款方式优惠标准
     */
    @TableField(value = "pre_standard_yuebao")
    private BigDecimal pre_standard_yuebao;

    /**
     * 余额宝存款方式上限金额
     */
    @TableField(value = "pre_up_yuebao")
    private BigDecimal pre_up_yuebao;

    /**
     * 余额宝存款方式优惠百分比
     */
    @TableField(value = "pre_per_yuebao")
    private BigDecimal pre_per_yuebao;

    /**
     * 余额宝存款方式综合额度稽核是否开启:0-否,1-是
     */
    @TableField(value = "status_comp_yuebao")
    private Object status_comp_yuebao;

    /**
     * 余额宝存款方式综合额度稽核倍数
     */
    @TableField(value = "num_comp_yuebao")
    private Object num_comp_yuebao;

    /**
     * 余额宝存款方式常态性额度稽核是否开启:0-否,1-是
     */
    @TableField(value = "status_normal_yuebao")
    private Object status_normal_yuebao;

    /**
     * 余额宝存款方式常态性额度稽核倍数
     */
    @TableField(value = "num_normal_yuebao")
    private Object num_normal_yuebao;

    /**
     * 余额宝存款方式常态性稽核放宽额度
     */
    @TableField(value = "normal_relax_yuebao")
    private BigDecimal normal_relax_yuebao;

    /**
     * 余额宝存款方式常态性稽核行政费率
     */
    @TableField(value = "normal_adm_per_yuebao")
    private Object normal_adm_per_yuebao;

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
        MnyCodeQuantitySet other = (MnyCodeQuantitySet) that;
        return (this.getCode_quantity_id() == null ? other.getCode_quantity_id() == null : this.getCode_quantity_id().equals(other.getCode_quantity_id()))
            && (this.getPay_platform_fees_draw() == null ? other.getPay_platform_fees_draw() == null : this.getPay_platform_fees_draw().equals(other.getPay_platform_fees_draw()))
            && (this.getRepeat_time_num_draw() == null ? other.getRepeat_time_num_draw() == null : this.getRepeat_time_num_draw().equals(other.getRepeat_time_num_draw()))
            && (this.getFree_times_draw() == null ? other.getFree_times_draw() == null : this.getFree_times_draw().equals(other.getFree_times_draw()))
            && (this.getMoney_draw() == null ? other.getMoney_draw() == null : this.getMoney_draw().equals(other.getMoney_draw()))
            && (this.getCue_draw_check() == null ? other.getCue_draw_check() == null : this.getCue_draw_check().equals(other.getCue_draw_check()))
            && (this.getMoney_draw_check() == null ? other.getMoney_draw_check() == null : this.getMoney_draw_check().equals(other.getMoney_draw_check()))
            && (this.getTime_num_draw_check() == null ? other.getTime_num_draw_check() == null : this.getTime_num_draw_check().equals(other.getTime_num_draw_check()))
            && (this.getRelation_currency_id() == null ? other.getRelation_currency_id() == null : this.getRelation_currency_id().equals(other.getRelation_currency_id()))
            && (this.getRelation_customize_id() == null ? other.getRelation_customize_id() == null : this.getRelation_customize_id().equals(other.getRelation_customize_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getPre_deposit_times_online() == null ? other.getPre_deposit_times_online() == null : this.getPre_deposit_times_online().equals(other.getPre_deposit_times_online()))
            && (this.getPre_deposit_status_online() == null ? other.getPre_deposit_status_online() == null : this.getPre_deposit_status_online().equals(other.getPre_deposit_status_online()))
            && (this.getPre_deposit_times_company() == null ? other.getPre_deposit_times_company() == null : this.getPre_deposit_times_company().equals(other.getPre_deposit_times_company()))
            && (this.getPre_deposit_status_company() == null ? other.getPre_deposit_status_company() == null : this.getPre_deposit_status_company().equals(other.getPre_deposit_status_company()))
            && (this.getPre_standard_online() == null ? other.getPre_standard_online() == null : this.getPre_standard_online().equals(other.getPre_standard_online()))
            && (this.getPre_standard_company() == null ? other.getPre_standard_company() == null : this.getPre_standard_company().equals(other.getPre_standard_company()))
            && (this.getPre_per_online() == null ? other.getPre_per_online() == null : this.getPre_per_online().equals(other.getPre_per_online()))
            && (this.getPre_per_company() == null ? other.getPre_per_company() == null : this.getPre_per_company().equals(other.getPre_per_company()))
            && (this.getPre_ratio_online() == null ? other.getPre_ratio_online() == null : this.getPre_ratio_online().equals(other.getPre_ratio_online()))
            && (this.getPre_ratio_company() == null ? other.getPre_ratio_company() == null : this.getPre_ratio_company().equals(other.getPre_ratio_company()))
            && (this.getHigh_deposit_online() == null ? other.getHigh_deposit_online() == null : this.getHigh_deposit_online().equals(other.getHigh_deposit_online()))
            && (this.getHigh_deposit_company() == null ? other.getHigh_deposit_company() == null : this.getHigh_deposit_company().equals(other.getHigh_deposit_company()))
            && (this.getMin_deposit_online() == null ? other.getMin_deposit_online() == null : this.getMin_deposit_online().equals(other.getMin_deposit_online()))
            && (this.getMin_deposit_company() == null ? other.getMin_deposit_company() == null : this.getMin_deposit_company().equals(other.getMin_deposit_company()))
            && (this.getPre_up_online() == null ? other.getPre_up_online() == null : this.getPre_up_online().equals(other.getPre_up_online()))
            && (this.getPre_up_company() == null ? other.getPre_up_company() == null : this.getPre_up_company().equals(other.getPre_up_company()))
            && (this.getOpre_standard_company() == null ? other.getOpre_standard_company() == null : this.getOpre_standard_company().equals(other.getOpre_standard_company()))
            && (this.getOpre_per_company() == null ? other.getOpre_per_company() == null : this.getOpre_per_company().equals(other.getOpre_per_company()))
            && (this.getOpre_up_company() == null ? other.getOpre_up_company() == null : this.getOpre_up_company().equals(other.getOpre_up_company()))
            && (this.getDraw_up_online() == null ? other.getDraw_up_online() == null : this.getDraw_up_online().equals(other.getDraw_up_online()))
            && (this.getDraw_low_online() == null ? other.getDraw_low_online() == null : this.getDraw_low_online().equals(other.getDraw_low_online()))
            && (this.getStatus_comp_online() == null ? other.getStatus_comp_online() == null : this.getStatus_comp_online().equals(other.getStatus_comp_online()))
            && (this.getNum_comp_online() == null ? other.getNum_comp_online() == null : this.getNum_comp_online().equals(other.getNum_comp_online()))
            && (this.getStatus_comp_company() == null ? other.getStatus_comp_company() == null : this.getStatus_comp_company().equals(other.getStatus_comp_company()))
            && (this.getNum_comp_company() == null ? other.getNum_comp_company() == null : this.getNum_comp_company().equals(other.getNum_comp_company()))
            && (this.getStatus_normal_online() == null ? other.getStatus_normal_online() == null : this.getStatus_normal_online().equals(other.getStatus_normal_online()))
            && (this.getNum_normal_online() == null ? other.getNum_normal_online() == null : this.getNum_normal_online().equals(other.getNum_normal_online()))
            && (this.getStatus_normal_company() == null ? other.getStatus_normal_company() == null : this.getStatus_normal_company().equals(other.getStatus_normal_company()))
            && (this.getNum_normal_company() == null ? other.getNum_normal_company() == null : this.getNum_normal_company().equals(other.getNum_normal_company()))
            && (this.getPre_rem_per_online() == null ? other.getPre_rem_per_online() == null : this.getPre_rem_per_online().equals(other.getPre_rem_per_online()))
            && (this.getPre_rem_per_company() == null ? other.getPre_rem_per_company() == null : this.getPre_rem_per_company().equals(other.getPre_rem_per_company()))
            && (this.getNormal_relax_online() == null ? other.getNormal_relax_online() == null : this.getNormal_relax_online().equals(other.getNormal_relax_online()))
            && (this.getNormal_relax_company() == null ? other.getNormal_relax_company() == null : this.getNormal_relax_company().equals(other.getNormal_relax_company()))
            && (this.getNormal_adm_per_online() == null ? other.getNormal_adm_per_online() == null : this.getNormal_adm_per_online().equals(other.getNormal_adm_per_online()))
            && (this.getNormal_adm_per_company() == null ? other.getNormal_adm_per_company() == null : this.getNormal_adm_per_company().equals(other.getNormal_adm_per_company()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getDiscounts_type() == null ? other.getDiscounts_type() == null : this.getDiscounts_type().equals(other.getDiscounts_type()))
            && (this.getPre_deposit_times_yuebao() == null ? other.getPre_deposit_times_yuebao() == null : this.getPre_deposit_times_yuebao().equals(other.getPre_deposit_times_yuebao()))
            && (this.getPre_ratio_yuebao() == null ? other.getPre_ratio_yuebao() == null : this.getPre_ratio_yuebao().equals(other.getPre_ratio_yuebao()))
            && (this.getPre_deposit_status_yuebao() == null ? other.getPre_deposit_status_yuebao() == null : this.getPre_deposit_status_yuebao().equals(other.getPre_deposit_status_yuebao()))
            && (this.getPre_standard_yuebao() == null ? other.getPre_standard_yuebao() == null : this.getPre_standard_yuebao().equals(other.getPre_standard_yuebao()))
            && (this.getPre_up_yuebao() == null ? other.getPre_up_yuebao() == null : this.getPre_up_yuebao().equals(other.getPre_up_yuebao()))
            && (this.getPre_per_yuebao() == null ? other.getPre_per_yuebao() == null : this.getPre_per_yuebao().equals(other.getPre_per_yuebao()))
            && (this.getStatus_comp_yuebao() == null ? other.getStatus_comp_yuebao() == null : this.getStatus_comp_yuebao().equals(other.getStatus_comp_yuebao()))
            && (this.getNum_comp_yuebao() == null ? other.getNum_comp_yuebao() == null : this.getNum_comp_yuebao().equals(other.getNum_comp_yuebao()))
            && (this.getStatus_normal_yuebao() == null ? other.getStatus_normal_yuebao() == null : this.getStatus_normal_yuebao().equals(other.getStatus_normal_yuebao()))
            && (this.getNum_normal_yuebao() == null ? other.getNum_normal_yuebao() == null : this.getNum_normal_yuebao().equals(other.getNum_normal_yuebao()))
            && (this.getNormal_relax_yuebao() == null ? other.getNormal_relax_yuebao() == null : this.getNormal_relax_yuebao().equals(other.getNormal_relax_yuebao()))
            && (this.getNormal_adm_per_yuebao() == null ? other.getNormal_adm_per_yuebao() == null : this.getNormal_adm_per_yuebao().equals(other.getNormal_adm_per_yuebao()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode_quantity_id() == null) ? 0 : getCode_quantity_id().hashCode());
        result = prime * result + ((getPay_platform_fees_draw() == null) ? 0 : getPay_platform_fees_draw().hashCode());
        result = prime * result + ((getRepeat_time_num_draw() == null) ? 0 : getRepeat_time_num_draw().hashCode());
        result = prime * result + ((getFree_times_draw() == null) ? 0 : getFree_times_draw().hashCode());
        result = prime * result + ((getMoney_draw() == null) ? 0 : getMoney_draw().hashCode());
        result = prime * result + ((getCue_draw_check() == null) ? 0 : getCue_draw_check().hashCode());
        result = prime * result + ((getMoney_draw_check() == null) ? 0 : getMoney_draw_check().hashCode());
        result = prime * result + ((getTime_num_draw_check() == null) ? 0 : getTime_num_draw_check().hashCode());
        result = prime * result + ((getRelation_currency_id() == null) ? 0 : getRelation_currency_id().hashCode());
        result = prime * result + ((getRelation_customize_id() == null) ? 0 : getRelation_customize_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getPre_deposit_times_online() == null) ? 0 : getPre_deposit_times_online().hashCode());
        result = prime * result + ((getPre_deposit_status_online() == null) ? 0 : getPre_deposit_status_online().hashCode());
        result = prime * result + ((getPre_deposit_times_company() == null) ? 0 : getPre_deposit_times_company().hashCode());
        result = prime * result + ((getPre_deposit_status_company() == null) ? 0 : getPre_deposit_status_company().hashCode());
        result = prime * result + ((getPre_standard_online() == null) ? 0 : getPre_standard_online().hashCode());
        result = prime * result + ((getPre_standard_company() == null) ? 0 : getPre_standard_company().hashCode());
        result = prime * result + ((getPre_per_online() == null) ? 0 : getPre_per_online().hashCode());
        result = prime * result + ((getPre_per_company() == null) ? 0 : getPre_per_company().hashCode());
        result = prime * result + ((getPre_ratio_online() == null) ? 0 : getPre_ratio_online().hashCode());
        result = prime * result + ((getPre_ratio_company() == null) ? 0 : getPre_ratio_company().hashCode());
        result = prime * result + ((getHigh_deposit_online() == null) ? 0 : getHigh_deposit_online().hashCode());
        result = prime * result + ((getHigh_deposit_company() == null) ? 0 : getHigh_deposit_company().hashCode());
        result = prime * result + ((getMin_deposit_online() == null) ? 0 : getMin_deposit_online().hashCode());
        result = prime * result + ((getMin_deposit_company() == null) ? 0 : getMin_deposit_company().hashCode());
        result = prime * result + ((getPre_up_online() == null) ? 0 : getPre_up_online().hashCode());
        result = prime * result + ((getPre_up_company() == null) ? 0 : getPre_up_company().hashCode());
        result = prime * result + ((getOpre_standard_company() == null) ? 0 : getOpre_standard_company().hashCode());
        result = prime * result + ((getOpre_per_company() == null) ? 0 : getOpre_per_company().hashCode());
        result = prime * result + ((getOpre_up_company() == null) ? 0 : getOpre_up_company().hashCode());
        result = prime * result + ((getDraw_up_online() == null) ? 0 : getDraw_up_online().hashCode());
        result = prime * result + ((getDraw_low_online() == null) ? 0 : getDraw_low_online().hashCode());
        result = prime * result + ((getStatus_comp_online() == null) ? 0 : getStatus_comp_online().hashCode());
        result = prime * result + ((getNum_comp_online() == null) ? 0 : getNum_comp_online().hashCode());
        result = prime * result + ((getStatus_comp_company() == null) ? 0 : getStatus_comp_company().hashCode());
        result = prime * result + ((getNum_comp_company() == null) ? 0 : getNum_comp_company().hashCode());
        result = prime * result + ((getStatus_normal_online() == null) ? 0 : getStatus_normal_online().hashCode());
        result = prime * result + ((getNum_normal_online() == null) ? 0 : getNum_normal_online().hashCode());
        result = prime * result + ((getStatus_normal_company() == null) ? 0 : getStatus_normal_company().hashCode());
        result = prime * result + ((getNum_normal_company() == null) ? 0 : getNum_normal_company().hashCode());
        result = prime * result + ((getPre_rem_per_online() == null) ? 0 : getPre_rem_per_online().hashCode());
        result = prime * result + ((getPre_rem_per_company() == null) ? 0 : getPre_rem_per_company().hashCode());
        result = prime * result + ((getNormal_relax_online() == null) ? 0 : getNormal_relax_online().hashCode());
        result = prime * result + ((getNormal_relax_company() == null) ? 0 : getNormal_relax_company().hashCode());
        result = prime * result + ((getNormal_adm_per_online() == null) ? 0 : getNormal_adm_per_online().hashCode());
        result = prime * result + ((getNormal_adm_per_company() == null) ? 0 : getNormal_adm_per_company().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getDiscounts_type() == null) ? 0 : getDiscounts_type().hashCode());
        result = prime * result + ((getPre_deposit_times_yuebao() == null) ? 0 : getPre_deposit_times_yuebao().hashCode());
        result = prime * result + ((getPre_ratio_yuebao() == null) ? 0 : getPre_ratio_yuebao().hashCode());
        result = prime * result + ((getPre_deposit_status_yuebao() == null) ? 0 : getPre_deposit_status_yuebao().hashCode());
        result = prime * result + ((getPre_standard_yuebao() == null) ? 0 : getPre_standard_yuebao().hashCode());
        result = prime * result + ((getPre_up_yuebao() == null) ? 0 : getPre_up_yuebao().hashCode());
        result = prime * result + ((getPre_per_yuebao() == null) ? 0 : getPre_per_yuebao().hashCode());
        result = prime * result + ((getStatus_comp_yuebao() == null) ? 0 : getStatus_comp_yuebao().hashCode());
        result = prime * result + ((getNum_comp_yuebao() == null) ? 0 : getNum_comp_yuebao().hashCode());
        result = prime * result + ((getStatus_normal_yuebao() == null) ? 0 : getStatus_normal_yuebao().hashCode());
        result = prime * result + ((getNum_normal_yuebao() == null) ? 0 : getNum_normal_yuebao().hashCode());
        result = prime * result + ((getNormal_relax_yuebao() == null) ? 0 : getNormal_relax_yuebao().hashCode());
        result = prime * result + ((getNormal_adm_per_yuebao() == null) ? 0 : getNormal_adm_per_yuebao().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code_quantity_id=").append(code_quantity_id);
        sb.append(", pay_platform_fees_draw=").append(pay_platform_fees_draw);
        sb.append(", repeat_time_num_draw=").append(repeat_time_num_draw);
        sb.append(", free_times_draw=").append(free_times_draw);
        sb.append(", money_draw=").append(money_draw);
        sb.append(", cue_draw_check=").append(cue_draw_check);
        sb.append(", money_draw_check=").append(money_draw_check);
        sb.append(", time_num_draw_check=").append(time_num_draw_check);
        sb.append(", relation_currency_id=").append(relation_currency_id);
        sb.append(", relation_customize_id=").append(relation_customize_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", pre_deposit_times_online=").append(pre_deposit_times_online);
        sb.append(", pre_deposit_status_online=").append(pre_deposit_status_online);
        sb.append(", pre_deposit_times_company=").append(pre_deposit_times_company);
        sb.append(", pre_deposit_status_company=").append(pre_deposit_status_company);
        sb.append(", pre_standard_online=").append(pre_standard_online);
        sb.append(", pre_standard_company=").append(pre_standard_company);
        sb.append(", pre_per_online=").append(pre_per_online);
        sb.append(", pre_per_company=").append(pre_per_company);
        sb.append(", pre_ratio_online=").append(pre_ratio_online);
        sb.append(", pre_ratio_company=").append(pre_ratio_company);
        sb.append(", high_deposit_online=").append(high_deposit_online);
        sb.append(", high_deposit_company=").append(high_deposit_company);
        sb.append(", min_deposit_online=").append(min_deposit_online);
        sb.append(", min_deposit_company=").append(min_deposit_company);
        sb.append(", pre_up_online=").append(pre_up_online);
        sb.append(", pre_up_company=").append(pre_up_company);
        sb.append(", opre_standard_company=").append(opre_standard_company);
        sb.append(", opre_per_company=").append(opre_per_company);
        sb.append(", opre_up_company=").append(opre_up_company);
        sb.append(", draw_up_online=").append(draw_up_online);
        sb.append(", draw_low_online=").append(draw_low_online);
        sb.append(", status_comp_online=").append(status_comp_online);
        sb.append(", num_comp_online=").append(num_comp_online);
        sb.append(", status_comp_company=").append(status_comp_company);
        sb.append(", num_comp_company=").append(num_comp_company);
        sb.append(", status_normal_online=").append(status_normal_online);
        sb.append(", num_normal_online=").append(num_normal_online);
        sb.append(", status_normal_company=").append(status_normal_company);
        sb.append(", num_normal_company=").append(num_normal_company);
        sb.append(", pre_rem_per_online=").append(pre_rem_per_online);
        sb.append(", pre_rem_per_company=").append(pre_rem_per_company);
        sb.append(", normal_relax_online=").append(normal_relax_online);
        sb.append(", normal_relax_company=").append(normal_relax_company);
        sb.append(", normal_adm_per_online=").append(normal_adm_per_online);
        sb.append(", normal_adm_per_company=").append(normal_adm_per_company);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", discounts_type=").append(discounts_type);
        sb.append(", pre_deposit_times_yuebao=").append(pre_deposit_times_yuebao);
        sb.append(", pre_ratio_yuebao=").append(pre_ratio_yuebao);
        sb.append(", pre_deposit_status_yuebao=").append(pre_deposit_status_yuebao);
        sb.append(", pre_standard_yuebao=").append(pre_standard_yuebao);
        sb.append(", pre_up_yuebao=").append(pre_up_yuebao);
        sb.append(", pre_per_yuebao=").append(pre_per_yuebao);
        sb.append(", status_comp_yuebao=").append(status_comp_yuebao);
        sb.append(", num_comp_yuebao=").append(num_comp_yuebao);
        sb.append(", status_normal_yuebao=").append(status_normal_yuebao);
        sb.append(", num_normal_yuebao=").append(num_normal_yuebao);
        sb.append(", normal_relax_yuebao=").append(normal_relax_yuebao);
        sb.append(", normal_adm_per_yuebao=").append(normal_adm_per_yuebao);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}