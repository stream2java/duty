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
 * @TableName at_current_total
 */
@TableName(value ="at_current_total")
@Data
public class AtCurrentTotal implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

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
    @TableField(value = "agent_account")
    private String agent_account;

    /**
     * 
     */
    @TableField(value = "member_account")
    private String member_account;

    /**
     * 
     */
    @TableField(value = "company_income")
    private BigDecimal company_income;

    /**
     * 
     */
    @TableField(value = "member_draw")
    private BigDecimal member_draw;

    /**
     * 
     */
    @TableField(value = "online_come")
    private BigDecimal online_come;

    /**
     * 
     */
    @TableField(value = "coupon")
    private BigDecimal coupon;

    /**
     * 
     */
    @TableField(value = "manual_income")
    private BigDecimal manual_income;

    /**
     * 
     */
    @TableField(value = "draw")
    private BigDecimal draw;

    /**
     * 
     */
    @TableField(value = "draw_fee")
    private BigDecimal draw_fee;

    /**
     * 
     */
    @TableField(value = "defect")
    private BigDecimal defect;

    /**
     * 
     */
    @TableField(value = "show_date")
    private LocalDate show_date;

    /**
     * 
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 公司入款人数
     */
    @TableField(value = "company_income_person_num")
    private Object company_income_person_num;

    /**
     * 会员出款人数
     */
    @TableField(value = "member_draw_person_num")
    private Object member_draw_person_num;

    /**
     * 线上存款人数
     */
    @TableField(value = "online_income_person_num")
    private Object online_income_person_num;

    /**
     * 优惠人数
     */
    @TableField(value = "coupon_person_num")
    private Object coupon_person_num;

    /**
     * 人工存入人数
     */
    @TableField(value = "manual_income_person_num")
    private Object manual_income_person_num;

    /**
     * 出款人数
     */
    @TableField(value = "draw_person_num")
    private Object draw_person_num;

    /**
     * 出款扣除的手续费人数
     */
    @TableField(value = "draw_fee_person_num")
    private Object draw_fee_person_num;

    /**
     * 反水人数
     */
    @TableField(value = "defect_person_num")
    private Object defect_person_num;

    /**
     * 会员类型:0-正式会员;98-测试会员;99-试玩会员
     */
    @TableField(value = "type")
    private String type;

    /**
     * 推广佣金
     */
    @TableField(value = "promotion_rebate")
    private BigDecimal promotion_rebate;

    /**
     * 推广佣金人数
     */
    @TableField(value = "promotion_rebate_person_num")
    private Object promotion_rebate_person_num;

    /**
     * 余额宝出款金额
     */
    @TableField(value = "yuebao_draw")
    private BigDecimal yuebao_draw;

    /**
     * 余额宝出款人数
     */
    @TableField(value = "yuebao_draw_person_num")
    private Object yuebao_draw_person_num;

    /**
     * 余额宝入款金额
     */
    @TableField(value = "yuebao_income")
    private BigDecimal yuebao_income;

    /**
     * 余额宝入款人数
     */
    @TableField(value = "yuebao_income_person_num")
    private Object yuebao_income_person_num;

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
        AtCurrentTotal other = (AtCurrentTotal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getAccount6() == null ? other.getAccount6() == null : this.getAccount6().equals(other.getAccount6()))
            && (this.getAgent_account() == null ? other.getAgent_account() == null : this.getAgent_account().equals(other.getAgent_account()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getCompany_income() == null ? other.getCompany_income() == null : this.getCompany_income().equals(other.getCompany_income()))
            && (this.getMember_draw() == null ? other.getMember_draw() == null : this.getMember_draw().equals(other.getMember_draw()))
            && (this.getOnline_come() == null ? other.getOnline_come() == null : this.getOnline_come().equals(other.getOnline_come()))
            && (this.getCoupon() == null ? other.getCoupon() == null : this.getCoupon().equals(other.getCoupon()))
            && (this.getManual_income() == null ? other.getManual_income() == null : this.getManual_income().equals(other.getManual_income()))
            && (this.getDraw() == null ? other.getDraw() == null : this.getDraw().equals(other.getDraw()))
            && (this.getDraw_fee() == null ? other.getDraw_fee() == null : this.getDraw_fee().equals(other.getDraw_fee()))
            && (this.getDefect() == null ? other.getDefect() == null : this.getDefect().equals(other.getDefect()))
            && (this.getShow_date() == null ? other.getShow_date() == null : this.getShow_date().equals(other.getShow_date()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getCompany_income_person_num() == null ? other.getCompany_income_person_num() == null : this.getCompany_income_person_num().equals(other.getCompany_income_person_num()))
            && (this.getMember_draw_person_num() == null ? other.getMember_draw_person_num() == null : this.getMember_draw_person_num().equals(other.getMember_draw_person_num()))
            && (this.getOnline_income_person_num() == null ? other.getOnline_income_person_num() == null : this.getOnline_income_person_num().equals(other.getOnline_income_person_num()))
            && (this.getCoupon_person_num() == null ? other.getCoupon_person_num() == null : this.getCoupon_person_num().equals(other.getCoupon_person_num()))
            && (this.getManual_income_person_num() == null ? other.getManual_income_person_num() == null : this.getManual_income_person_num().equals(other.getManual_income_person_num()))
            && (this.getDraw_person_num() == null ? other.getDraw_person_num() == null : this.getDraw_person_num().equals(other.getDraw_person_num()))
            && (this.getDraw_fee_person_num() == null ? other.getDraw_fee_person_num() == null : this.getDraw_fee_person_num().equals(other.getDraw_fee_person_num()))
            && (this.getDefect_person_num() == null ? other.getDefect_person_num() == null : this.getDefect_person_num().equals(other.getDefect_person_num()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPromotion_rebate() == null ? other.getPromotion_rebate() == null : this.getPromotion_rebate().equals(other.getPromotion_rebate()))
            && (this.getPromotion_rebate_person_num() == null ? other.getPromotion_rebate_person_num() == null : this.getPromotion_rebate_person_num().equals(other.getPromotion_rebate_person_num()))
            && (this.getYuebao_draw() == null ? other.getYuebao_draw() == null : this.getYuebao_draw().equals(other.getYuebao_draw()))
            && (this.getYuebao_draw_person_num() == null ? other.getYuebao_draw_person_num() == null : this.getYuebao_draw_person_num().equals(other.getYuebao_draw_person_num()))
            && (this.getYuebao_income() == null ? other.getYuebao_income() == null : this.getYuebao_income().equals(other.getYuebao_income()))
            && (this.getYuebao_income_person_num() == null ? other.getYuebao_income_person_num() == null : this.getYuebao_income_person_num().equals(other.getYuebao_income_person_num()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getAccount6() == null) ? 0 : getAccount6().hashCode());
        result = prime * result + ((getAgent_account() == null) ? 0 : getAgent_account().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getCompany_income() == null) ? 0 : getCompany_income().hashCode());
        result = prime * result + ((getMember_draw() == null) ? 0 : getMember_draw().hashCode());
        result = prime * result + ((getOnline_come() == null) ? 0 : getOnline_come().hashCode());
        result = prime * result + ((getCoupon() == null) ? 0 : getCoupon().hashCode());
        result = prime * result + ((getManual_income() == null) ? 0 : getManual_income().hashCode());
        result = prime * result + ((getDraw() == null) ? 0 : getDraw().hashCode());
        result = prime * result + ((getDraw_fee() == null) ? 0 : getDraw_fee().hashCode());
        result = prime * result + ((getDefect() == null) ? 0 : getDefect().hashCode());
        result = prime * result + ((getShow_date() == null) ? 0 : getShow_date().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getCompany_income_person_num() == null) ? 0 : getCompany_income_person_num().hashCode());
        result = prime * result + ((getMember_draw_person_num() == null) ? 0 : getMember_draw_person_num().hashCode());
        result = prime * result + ((getOnline_income_person_num() == null) ? 0 : getOnline_income_person_num().hashCode());
        result = prime * result + ((getCoupon_person_num() == null) ? 0 : getCoupon_person_num().hashCode());
        result = prime * result + ((getManual_income_person_num() == null) ? 0 : getManual_income_person_num().hashCode());
        result = prime * result + ((getDraw_person_num() == null) ? 0 : getDraw_person_num().hashCode());
        result = prime * result + ((getDraw_fee_person_num() == null) ? 0 : getDraw_fee_person_num().hashCode());
        result = prime * result + ((getDefect_person_num() == null) ? 0 : getDefect_person_num().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPromotion_rebate() == null) ? 0 : getPromotion_rebate().hashCode());
        result = prime * result + ((getPromotion_rebate_person_num() == null) ? 0 : getPromotion_rebate_person_num().hashCode());
        result = prime * result + ((getYuebao_draw() == null) ? 0 : getYuebao_draw().hashCode());
        result = prime * result + ((getYuebao_draw_person_num() == null) ? 0 : getYuebao_draw_person_num().hashCode());
        result = prime * result + ((getYuebao_income() == null) ? 0 : getYuebao_income().hashCode());
        result = prime * result + ((getYuebao_income_person_num() == null) ? 0 : getYuebao_income_person_num().hashCode());
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
        sb.append(", account5=").append(account5);
        sb.append(", account6=").append(account6);
        sb.append(", agent_account=").append(agent_account);
        sb.append(", member_account=").append(member_account);
        sb.append(", company_income=").append(company_income);
        sb.append(", member_draw=").append(member_draw);
        sb.append(", online_come=").append(online_come);
        sb.append(", coupon=").append(coupon);
        sb.append(", manual_income=").append(manual_income);
        sb.append(", draw=").append(draw);
        sb.append(", draw_fee=").append(draw_fee);
        sb.append(", defect=").append(defect);
        sb.append(", show_date=").append(show_date);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", company_income_person_num=").append(company_income_person_num);
        sb.append(", member_draw_person_num=").append(member_draw_person_num);
        sb.append(", online_income_person_num=").append(online_income_person_num);
        sb.append(", coupon_person_num=").append(coupon_person_num);
        sb.append(", manual_income_person_num=").append(manual_income_person_num);
        sb.append(", draw_person_num=").append(draw_person_num);
        sb.append(", draw_fee_person_num=").append(draw_fee_person_num);
        sb.append(", defect_person_num=").append(defect_person_num);
        sb.append(", type=").append(type);
        sb.append(", promotion_rebate=").append(promotion_rebate);
        sb.append(", promotion_rebate_person_num=").append(promotion_rebate_person_num);
        sb.append(", yuebao_draw=").append(yuebao_draw);
        sb.append(", yuebao_draw_person_num=").append(yuebao_draw_person_num);
        sb.append(", yuebao_income=").append(yuebao_income);
        sb.append(", yuebao_income_person_num=").append(yuebao_income_person_num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}