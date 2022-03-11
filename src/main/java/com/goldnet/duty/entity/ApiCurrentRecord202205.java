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
 * @TableName api_current_record_202205
 */
@TableName(value ="api_current_record_202205")
@Data
public class ApiCurrentRecord202205 implements Serializable {
    /**
     * 
     */
    @TableId(value = "current_record_id")
    private Object current_record_id;

    /**
     * 
     */
    @TableField(value = "bet_start_date")
    private LocalDateTime bet_start_date;

    /**
     * 
     */
    @TableField(value = "api_id")
    private Object api_id;

    /**
     * 
     */
    @TableField(value = "bet_end_date")
    private LocalDateTime bet_end_date;

    /**
     * 
     */
    @TableField(value = "account_id6")
    private Object account_id6;

    /**
     * 
     */
    @TableField(value = "desk_name")
    private String desk_name;

    /**
     * 
     */
    @TableField(value = "bet_code")
    private String bet_code;

    /**
     * 
     */
    @TableField(value = "bet_amount")
    private BigDecimal bet_amount;

    /**
     * 
     */
    @TableField(value = "pay_out")
    private BigDecimal pay_out;

    /**
     * 
     */
    @TableField(value = "game_type")
    private String game_type;

    /**
     * 
     */
    @TableField(value = "bet_content")
    private String bet_content;

    /**
     * 
     */
    @TableField(value = "api_name")
    private String api_name;

    /**
     * 
     */
    @TableField(value = "account_id1")
    private Object account_id1;

    /**
     * 
     */
    @TableField(value = "account_id2")
    private Object account_id2;

    /**
     * 
     */
    @TableField(value = "account_id3")
    private Object account_id3;

    /**
     * 
     */
    @TableField(value = "account_id4")
    private Object account_id4;

    /**
     * 
     */
    @TableField(value = "account_id5")
    private Object account_id5;

    /**
     * 
     */
    @TableField(value = "account_id0")
    private Object account_id0;

    /**
     * 
     */
    @TableField(value = "gameid")
    private String gameid;

    /**
     * 
     */
    @TableField(value = "game_category")
    private String game_category;

    /**
     * 
     */
    @TableField(value = "valid_bet_amount")
    private BigDecimal valid_bet_amount;

    /**
     * 
     */
    @TableField(value = "award_result")
    private String award_result;

    /**
     * 
     */
    @TableField(value = "is_award")
    private Object is_award;

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
        ApiCurrentRecord202205 other = (ApiCurrentRecord202205) that;
        return (this.getCurrent_record_id() == null ? other.getCurrent_record_id() == null : this.getCurrent_record_id().equals(other.getCurrent_record_id()))
            && (this.getBet_start_date() == null ? other.getBet_start_date() == null : this.getBet_start_date().equals(other.getBet_start_date()))
            && (this.getApi_id() == null ? other.getApi_id() == null : this.getApi_id().equals(other.getApi_id()))
            && (this.getBet_end_date() == null ? other.getBet_end_date() == null : this.getBet_end_date().equals(other.getBet_end_date()))
            && (this.getAccount_id6() == null ? other.getAccount_id6() == null : this.getAccount_id6().equals(other.getAccount_id6()))
            && (this.getDesk_name() == null ? other.getDesk_name() == null : this.getDesk_name().equals(other.getDesk_name()))
            && (this.getBet_code() == null ? other.getBet_code() == null : this.getBet_code().equals(other.getBet_code()))
            && (this.getBet_amount() == null ? other.getBet_amount() == null : this.getBet_amount().equals(other.getBet_amount()))
            && (this.getPay_out() == null ? other.getPay_out() == null : this.getPay_out().equals(other.getPay_out()))
            && (this.getGame_type() == null ? other.getGame_type() == null : this.getGame_type().equals(other.getGame_type()))
            && (this.getBet_content() == null ? other.getBet_content() == null : this.getBet_content().equals(other.getBet_content()))
            && (this.getApi_name() == null ? other.getApi_name() == null : this.getApi_name().equals(other.getApi_name()))
            && (this.getAccount_id1() == null ? other.getAccount_id1() == null : this.getAccount_id1().equals(other.getAccount_id1()))
            && (this.getAccount_id2() == null ? other.getAccount_id2() == null : this.getAccount_id2().equals(other.getAccount_id2()))
            && (this.getAccount_id3() == null ? other.getAccount_id3() == null : this.getAccount_id3().equals(other.getAccount_id3()))
            && (this.getAccount_id4() == null ? other.getAccount_id4() == null : this.getAccount_id4().equals(other.getAccount_id4()))
            && (this.getAccount_id5() == null ? other.getAccount_id5() == null : this.getAccount_id5().equals(other.getAccount_id5()))
            && (this.getAccount_id0() == null ? other.getAccount_id0() == null : this.getAccount_id0().equals(other.getAccount_id0()))
            && (this.getGameid() == null ? other.getGameid() == null : this.getGameid().equals(other.getGameid()))
            && (this.getGame_category() == null ? other.getGame_category() == null : this.getGame_category().equals(other.getGame_category()))
            && (this.getValid_bet_amount() == null ? other.getValid_bet_amount() == null : this.getValid_bet_amount().equals(other.getValid_bet_amount()))
            && (this.getAward_result() == null ? other.getAward_result() == null : this.getAward_result().equals(other.getAward_result()))
            && (this.getIs_award() == null ? other.getIs_award() == null : this.getIs_award().equals(other.getIs_award()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCurrent_record_id() == null) ? 0 : getCurrent_record_id().hashCode());
        result = prime * result + ((getBet_start_date() == null) ? 0 : getBet_start_date().hashCode());
        result = prime * result + ((getApi_id() == null) ? 0 : getApi_id().hashCode());
        result = prime * result + ((getBet_end_date() == null) ? 0 : getBet_end_date().hashCode());
        result = prime * result + ((getAccount_id6() == null) ? 0 : getAccount_id6().hashCode());
        result = prime * result + ((getDesk_name() == null) ? 0 : getDesk_name().hashCode());
        result = prime * result + ((getBet_code() == null) ? 0 : getBet_code().hashCode());
        result = prime * result + ((getBet_amount() == null) ? 0 : getBet_amount().hashCode());
        result = prime * result + ((getPay_out() == null) ? 0 : getPay_out().hashCode());
        result = prime * result + ((getGame_type() == null) ? 0 : getGame_type().hashCode());
        result = prime * result + ((getBet_content() == null) ? 0 : getBet_content().hashCode());
        result = prime * result + ((getApi_name() == null) ? 0 : getApi_name().hashCode());
        result = prime * result + ((getAccount_id1() == null) ? 0 : getAccount_id1().hashCode());
        result = prime * result + ((getAccount_id2() == null) ? 0 : getAccount_id2().hashCode());
        result = prime * result + ((getAccount_id3() == null) ? 0 : getAccount_id3().hashCode());
        result = prime * result + ((getAccount_id4() == null) ? 0 : getAccount_id4().hashCode());
        result = prime * result + ((getAccount_id5() == null) ? 0 : getAccount_id5().hashCode());
        result = prime * result + ((getAccount_id0() == null) ? 0 : getAccount_id0().hashCode());
        result = prime * result + ((getGameid() == null) ? 0 : getGameid().hashCode());
        result = prime * result + ((getGame_category() == null) ? 0 : getGame_category().hashCode());
        result = prime * result + ((getValid_bet_amount() == null) ? 0 : getValid_bet_amount().hashCode());
        result = prime * result + ((getAward_result() == null) ? 0 : getAward_result().hashCode());
        result = prime * result + ((getIs_award() == null) ? 0 : getIs_award().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", current_record_id=").append(current_record_id);
        sb.append(", bet_start_date=").append(bet_start_date);
        sb.append(", api_id=").append(api_id);
        sb.append(", bet_end_date=").append(bet_end_date);
        sb.append(", account_id6=").append(account_id6);
        sb.append(", desk_name=").append(desk_name);
        sb.append(", bet_code=").append(bet_code);
        sb.append(", bet_amount=").append(bet_amount);
        sb.append(", pay_out=").append(pay_out);
        sb.append(", game_type=").append(game_type);
        sb.append(", bet_content=").append(bet_content);
        sb.append(", api_name=").append(api_name);
        sb.append(", account_id1=").append(account_id1);
        sb.append(", account_id2=").append(account_id2);
        sb.append(", account_id3=").append(account_id3);
        sb.append(", account_id4=").append(account_id4);
        sb.append(", account_id5=").append(account_id5);
        sb.append(", account_id0=").append(account_id0);
        sb.append(", gameid=").append(gameid);
        sb.append(", game_category=").append(game_category);
        sb.append(", valid_bet_amount=").append(valid_bet_amount);
        sb.append(", award_result=").append(award_result);
        sb.append(", is_award=").append(is_award);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}