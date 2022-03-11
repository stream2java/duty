package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 开奖结果
 * @TableName ge_award_mmc
 */
@TableName(value ="ge_award_mmc")
@Data
public class GeAwardMmc implements Serializable {
    /**
     * 
     */
    @TableId(value = "award_id")
    private Object award_id;

    /**
     * 期数
     */
    @TableField(value = "period")
    private String period;

    /**
     * 开奖日期
     */
    @TableField(value = "award_date")
    private LocalDateTime award_date;

    /**
     * 第1位
     */
    @TableField(value = "number1")
    private String number1;

    /**
     * 第2位
     */
    @TableField(value = "number2")
    private String number2;

    /**
     * 第3位
     */
    @TableField(value = "number3")
    private String number3;

    /**
     * 第4位
     */
    @TableField(value = "number4")
    private String number4;

    /**
     * 第5位
     */
    @TableField(value = "number5")
    private String number5;

    /**
     * 第6位
     */
    @TableField(value = "number6")
    private String number6;

    /**
     * 第7位
     */
    @TableField(value = "number7")
    private String number7;

    /**
     * 第8位
     */
    @TableField(value = "number8")
    private String number8;

    /**
     * 第9位
     */
    @TableField(value = "number9")
    private String number9;

    /**
     * 第10位
     */
    @TableField(value = "number10")
    private String number10;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_date_time")
    private LocalDateTime create_date_time;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_date_time")
    private LocalDateTime update_date_time;

    /**
     * 彩票ID
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 状态，0为新建，1为修改过，2为结算过,3为模拟结果
     */
    @TableField(value = "status")
    private String status;

    /**
     * 代理可视状态 0为不可见 1为可见【六合专用】
     */
    @TableField(value = "agent_visual")
    private String agent_visual;

    /**
     * 
     */
    @TableField(value = "zodiac")
    private String zodiac;

    /**
     * 第20位
     */
    @TableField(value = "number11")
    private String number11;

    /**
     * 
     */
    @TableField(value = "number12")
    private String number12;

    /**
     * 
     */
    @TableField(value = "number13")
    private String number13;

    /**
     * 
     */
    @TableField(value = "number14")
    private String number14;

    /**
     * 
     */
    @TableField(value = "number15")
    private String number15;

    /**
     * 
     */
    @TableField(value = "number16")
    private String number16;

    /**
     * 
     */
    @TableField(value = "number17")
    private String number17;

    /**
     * 
     */
    @TableField(value = "number18")
    private String number18;

    /**
     * 
     */
    @TableField(value = "number19")
    private String number19;

    /**
     * 
     */
    @TableField(value = "number20")
    private String number20;

    /**
     * 当期六合彩对应的当年生肖
     */
    @TableField(value = "zodiac_year")
    private String zodiac_year;

    /**
     * 
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 
     */
    @TableField(value = "member_account")
    private String member_account;

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
        GeAwardMmc other = (GeAwardMmc) that;
        return (this.getAward_id() == null ? other.getAward_id() == null : this.getAward_id().equals(other.getAward_id()))
            && (this.getPeriod() == null ? other.getPeriod() == null : this.getPeriod().equals(other.getPeriod()))
            && (this.getAward_date() == null ? other.getAward_date() == null : this.getAward_date().equals(other.getAward_date()))
            && (this.getNumber1() == null ? other.getNumber1() == null : this.getNumber1().equals(other.getNumber1()))
            && (this.getNumber2() == null ? other.getNumber2() == null : this.getNumber2().equals(other.getNumber2()))
            && (this.getNumber3() == null ? other.getNumber3() == null : this.getNumber3().equals(other.getNumber3()))
            && (this.getNumber4() == null ? other.getNumber4() == null : this.getNumber4().equals(other.getNumber4()))
            && (this.getNumber5() == null ? other.getNumber5() == null : this.getNumber5().equals(other.getNumber5()))
            && (this.getNumber6() == null ? other.getNumber6() == null : this.getNumber6().equals(other.getNumber6()))
            && (this.getNumber7() == null ? other.getNumber7() == null : this.getNumber7().equals(other.getNumber7()))
            && (this.getNumber8() == null ? other.getNumber8() == null : this.getNumber8().equals(other.getNumber8()))
            && (this.getNumber9() == null ? other.getNumber9() == null : this.getNumber9().equals(other.getNumber9()))
            && (this.getNumber10() == null ? other.getNumber10() == null : this.getNumber10().equals(other.getNumber10()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAgent_visual() == null ? other.getAgent_visual() == null : this.getAgent_visual().equals(other.getAgent_visual()))
            && (this.getZodiac() == null ? other.getZodiac() == null : this.getZodiac().equals(other.getZodiac()))
            && (this.getNumber11() == null ? other.getNumber11() == null : this.getNumber11().equals(other.getNumber11()))
            && (this.getNumber12() == null ? other.getNumber12() == null : this.getNumber12().equals(other.getNumber12()))
            && (this.getNumber13() == null ? other.getNumber13() == null : this.getNumber13().equals(other.getNumber13()))
            && (this.getNumber14() == null ? other.getNumber14() == null : this.getNumber14().equals(other.getNumber14()))
            && (this.getNumber15() == null ? other.getNumber15() == null : this.getNumber15().equals(other.getNumber15()))
            && (this.getNumber16() == null ? other.getNumber16() == null : this.getNumber16().equals(other.getNumber16()))
            && (this.getNumber17() == null ? other.getNumber17() == null : this.getNumber17().equals(other.getNumber17()))
            && (this.getNumber18() == null ? other.getNumber18() == null : this.getNumber18().equals(other.getNumber18()))
            && (this.getNumber19() == null ? other.getNumber19() == null : this.getNumber19().equals(other.getNumber19()))
            && (this.getNumber20() == null ? other.getNumber20() == null : this.getNumber20().equals(other.getNumber20()))
            && (this.getZodiac_year() == null ? other.getZodiac_year() == null : this.getZodiac_year().equals(other.getZodiac_year()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAward_id() == null) ? 0 : getAward_id().hashCode());
        result = prime * result + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        result = prime * result + ((getAward_date() == null) ? 0 : getAward_date().hashCode());
        result = prime * result + ((getNumber1() == null) ? 0 : getNumber1().hashCode());
        result = prime * result + ((getNumber2() == null) ? 0 : getNumber2().hashCode());
        result = prime * result + ((getNumber3() == null) ? 0 : getNumber3().hashCode());
        result = prime * result + ((getNumber4() == null) ? 0 : getNumber4().hashCode());
        result = prime * result + ((getNumber5() == null) ? 0 : getNumber5().hashCode());
        result = prime * result + ((getNumber6() == null) ? 0 : getNumber6().hashCode());
        result = prime * result + ((getNumber7() == null) ? 0 : getNumber7().hashCode());
        result = prime * result + ((getNumber8() == null) ? 0 : getNumber8().hashCode());
        result = prime * result + ((getNumber9() == null) ? 0 : getNumber9().hashCode());
        result = prime * result + ((getNumber10() == null) ? 0 : getNumber10().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAgent_visual() == null) ? 0 : getAgent_visual().hashCode());
        result = prime * result + ((getZodiac() == null) ? 0 : getZodiac().hashCode());
        result = prime * result + ((getNumber11() == null) ? 0 : getNumber11().hashCode());
        result = prime * result + ((getNumber12() == null) ? 0 : getNumber12().hashCode());
        result = prime * result + ((getNumber13() == null) ? 0 : getNumber13().hashCode());
        result = prime * result + ((getNumber14() == null) ? 0 : getNumber14().hashCode());
        result = prime * result + ((getNumber15() == null) ? 0 : getNumber15().hashCode());
        result = prime * result + ((getNumber16() == null) ? 0 : getNumber16().hashCode());
        result = prime * result + ((getNumber17() == null) ? 0 : getNumber17().hashCode());
        result = prime * result + ((getNumber18() == null) ? 0 : getNumber18().hashCode());
        result = prime * result + ((getNumber19() == null) ? 0 : getNumber19().hashCode());
        result = prime * result + ((getNumber20() == null) ? 0 : getNumber20().hashCode());
        result = prime * result + ((getZodiac_year() == null) ? 0 : getZodiac_year().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", award_id=").append(award_id);
        sb.append(", period=").append(period);
        sb.append(", award_date=").append(award_date);
        sb.append(", number1=").append(number1);
        sb.append(", number2=").append(number2);
        sb.append(", number3=").append(number3);
        sb.append(", number4=").append(number4);
        sb.append(", number5=").append(number5);
        sb.append(", number6=").append(number6);
        sb.append(", number7=").append(number7);
        sb.append(", number8=").append(number8);
        sb.append(", number9=").append(number9);
        sb.append(", number10=").append(number10);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", status=").append(status);
        sb.append(", agent_visual=").append(agent_visual);
        sb.append(", zodiac=").append(zodiac);
        sb.append(", number11=").append(number11);
        sb.append(", number12=").append(number12);
        sb.append(", number13=").append(number13);
        sb.append(", number14=").append(number14);
        sb.append(", number15=").append(number15);
        sb.append(", number16=").append(number16);
        sb.append(", number17=").append(number17);
        sb.append(", number18=").append(number18);
        sb.append(", number19=").append(number19);
        sb.append(", number20=").append(number20);
        sb.append(", zodiac_year=").append(zodiac_year);
        sb.append(", member_id=").append(member_id);
        sb.append(", member_account=").append(member_account);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}