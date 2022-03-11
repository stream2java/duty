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
 * 往来记录
 * @TableName at_current_record
 */
@TableName(value ="at_current_record")
@Data
public class AtCurrentRecord implements Serializable {
    /**
     * 
     */
    @TableId(value = "current_record_id")
    private Long current_record_id;

    /**
     * 金钱类型0信用1快开【默认1快开】
     */
    @TableField(value = "money_type")
    private Object money_type;

    /**
     * 会员id
     */
    @TableField(value = "account_id")
    private Object account_id;

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
     * 交易额度
     */
    @TableField(value = "trade_limit")
    private BigDecimal trade_limit;

    /**
     * 现有额度
     */
    @TableField(value = "existing_limit")
    private BigDecimal existing_limit;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 注单明细【手动申请出款类型0,0 0,1 1,0 1,1第一个是清除优惠稽核点，第二个是清除常态性稽核点 0代表不清楚，1代表清除】
     */
    @TableField(value = "priject")
    private String priject;

    /**
     * 1存入，2取出，3派彩，4下注，6取消注单（注销），7取消结算，8统算，12公司入款，13公司入款优惠，14公司汇款优惠，15线上存款，16线上存款手续费，17线上存款优惠，18系统取消出款，19入款其他，22重复出款，23手动申请出款，24放弃存款优惠，25公司入款误存，26会员负数回冲，27扣除非法下注派彩，28出款其他，31人工存入，32人工存入取消出款，33存款优惠，34人工存入汇款优惠，35退佣优惠，36负数额度归零，37其他，38人工存入存款优惠，51强制设定，53重建下注（重建），54重结派彩（重结），55回结派彩（回结），56手结派彩（手结），61视讯返点，62电子返点，63体育返点，64彩票返点，71视讯冲销，72机率冲销，73球类冲销，74彩票冲销，81下注失败，82重新结算，83未接受-BB体育，84重覆派彩扣回，85系统踢单-彩票，86彩金,91取消实际出款，92取消扣除手续费，93取消扣除存款优惠，95实际出款,96出款扣除手续费,97出款扣除存款优惠
     */
    @TableField(value = "trade_type")
    private String trade_type;

    /**
     * 预留字段
     */
    @TableField(value = "money")
    private BigDecimal money;

    /**
     * 彩票编号
     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 彩票编号
     */
    @TableField(value = "betting_code")
    private String betting_code;

    /**
     * 0有效（已处理状态），1被取消的实际出款状态（已处理状态），5未处理状态
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 状态0出入款交易1体育2彩票3视讯4电子
     */
    @TableField(value = "flag")
    private Object flag;

    /**
     * 币别【默认1为人民币】
     */
    @TableField(value = "currency_id")
    private Object currency_id;

    /**
     * 操作时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 
     */
    @TableField(value = "rate")
    private Object rate;

    /**
     * 
     */
    @TableField(value = "member_account")
    private String member_account;

    /**
     * 
     */
    @TableField(value = "account5")
    private Object account5;

    /**
     * 
     */
    @TableField(value = "agent_account")
    private String agent_account;

    /**
     * 大股东
     */
    @TableField(value = "account2")
    private Object account2;

    /**
     * 股东
     */
    @TableField(value = "account3")
    private Object account3;

    /**
     * 总代
     */
    @TableField(value = "account4")
    private Object account4;

    /**
     * 
     */
    @TableField(value = "weixin_temp")
    private String weixin_temp;

    /**
     * 
     */
    @TableField(value = "weixin_nickname")
    private String weixin_nickname;

    /**
     * 会员类型:0-正式会员;98-测试会员;99-试玩会员
     */
    @TableField(value = "type")
    private String type;

    /**
     * trade_type类型下的子类
     */
    @TableField(value = "trade_type_sub")
    private String trade_type_sub;

    /**
     * 前端备注
     */
    @TableField(value = "member_remark")
    private String member_remark;

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
        AtCurrentRecord other = (AtCurrentRecord) that;
        return (this.getCurrent_record_id() == null ? other.getCurrent_record_id() == null : this.getCurrent_record_id().equals(other.getCurrent_record_id()))
            && (this.getMoney_type() == null ? other.getMoney_type() == null : this.getMoney_type().equals(other.getMoney_type()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getTrade_limit() == null ? other.getTrade_limit() == null : this.getTrade_limit().equals(other.getTrade_limit()))
            && (this.getExisting_limit() == null ? other.getExisting_limit() == null : this.getExisting_limit().equals(other.getExisting_limit()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPriject() == null ? other.getPriject() == null : this.getPriject().equals(other.getPriject()))
            && (this.getTrade_type() == null ? other.getTrade_type() == null : this.getTrade_type().equals(other.getTrade_type()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getBetting_code() == null ? other.getBetting_code() == null : this.getBetting_code().equals(other.getBetting_code()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCurrency_id() == null ? other.getCurrency_id() == null : this.getCurrency_id().equals(other.getCurrency_id()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getMember_account() == null ? other.getMember_account() == null : this.getMember_account().equals(other.getMember_account()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getAgent_account() == null ? other.getAgent_account() == null : this.getAgent_account().equals(other.getAgent_account()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getWeixin_temp() == null ? other.getWeixin_temp() == null : this.getWeixin_temp().equals(other.getWeixin_temp()))
            && (this.getWeixin_nickname() == null ? other.getWeixin_nickname() == null : this.getWeixin_nickname().equals(other.getWeixin_nickname()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTrade_type_sub() == null ? other.getTrade_type_sub() == null : this.getTrade_type_sub().equals(other.getTrade_type_sub()))
            && (this.getMember_remark() == null ? other.getMember_remark() == null : this.getMember_remark().equals(other.getMember_remark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCurrent_record_id() == null) ? 0 : getCurrent_record_id().hashCode());
        result = prime * result + ((getMoney_type() == null) ? 0 : getMoney_type().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getTrade_limit() == null) ? 0 : getTrade_limit().hashCode());
        result = prime * result + ((getExisting_limit() == null) ? 0 : getExisting_limit().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPriject() == null) ? 0 : getPriject().hashCode());
        result = prime * result + ((getTrade_type() == null) ? 0 : getTrade_type().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getBetting_code() == null) ? 0 : getBetting_code().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCurrency_id() == null) ? 0 : getCurrency_id().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getMember_account() == null) ? 0 : getMember_account().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getAgent_account() == null) ? 0 : getAgent_account().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getWeixin_temp() == null) ? 0 : getWeixin_temp().hashCode());
        result = prime * result + ((getWeixin_nickname() == null) ? 0 : getWeixin_nickname().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTrade_type_sub() == null) ? 0 : getTrade_type_sub().hashCode());
        result = prime * result + ((getMember_remark() == null) ? 0 : getMember_remark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", current_record_id=").append(current_record_id);
        sb.append(", money_type=").append(money_type);
        sb.append(", account_id=").append(account_id);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", trade_limit=").append(trade_limit);
        sb.append(", existing_limit=").append(existing_limit);
        sb.append(", remark=").append(remark);
        sb.append(", priject=").append(priject);
        sb.append(", trade_type=").append(trade_type);
        sb.append(", money=").append(money);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", betting_code=").append(betting_code);
        sb.append(", status=").append(status);
        sb.append(", flag=").append(flag);
        sb.append(", currency_id=").append(currency_id);
        sb.append(", update_time=").append(update_time);
        sb.append(", account1=").append(account1);
        sb.append(", rate=").append(rate);
        sb.append(", member_account=").append(member_account);
        sb.append(", account5=").append(account5);
        sb.append(", agent_account=").append(agent_account);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", weixin_temp=").append(weixin_temp);
        sb.append(", weixin_nickname=").append(weixin_nickname);
        sb.append(", type=").append(type);
        sb.append(", trade_type_sub=").append(trade_type_sub);
        sb.append(", member_remark=").append(member_remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}