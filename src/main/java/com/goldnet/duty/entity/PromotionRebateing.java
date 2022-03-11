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
 * 待返佣记录表
 * @TableName promotion_rebateing
 */
@TableName(value ="promotion_rebateing")
@Data
public class PromotionRebateing implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 厅主ID
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 待返佣的会员ID
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 待返佣的会员账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 产生此数据的源会员Id
     */
    @TableField(value = "origin_account")
    private String origin_account;

    /**
     * 待返水金额，为负数则表示减少余额
     */
    @TableField(value = "rebate_amount")
    private BigDecimal rebate_amount;

    /**
     * 类型0：投注返佣1：损益返佣2：投注冲销3：损益冲销4：自身充值佣金5：下级充值佣金 6:自身投注返佣 7：自身损益返佣 8：自身投注冲销 9：自身损益冲销 10：新损益佣金 11：新损益冲销 12：新损益还原
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 返佣事件的ID, -1代表null
     */
    @TableField(value = "event_id")
    private Object event_id;

    /**
     * 返水事件的名称
     */
    @TableField(value = "event_name")
    private String event_name;

    /**
     * 其它备用的参数
     */
    @TableField(value = "other_args")
    private String other_args;

    /**
     * 状态0: 未处理 1：已处理
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 下级id
     */
    @TableField(value = "sub_id")
    private Object sub_id;

    /**
     * 下级账号
     */
    @TableField(value = "sub_account")
    private String sub_account;

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
        PromotionRebateing other = (PromotionRebateing) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getOrigin_account() == null ? other.getOrigin_account() == null : this.getOrigin_account().equals(other.getOrigin_account()))
            && (this.getRebate_amount() == null ? other.getRebate_amount() == null : this.getRebate_amount().equals(other.getRebate_amount()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getEvent_id() == null ? other.getEvent_id() == null : this.getEvent_id().equals(other.getEvent_id()))
            && (this.getEvent_name() == null ? other.getEvent_name() == null : this.getEvent_name().equals(other.getEvent_name()))
            && (this.getOther_args() == null ? other.getOther_args() == null : this.getOther_args().equals(other.getOther_args()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getSub_id() == null ? other.getSub_id() == null : this.getSub_id().equals(other.getSub_id()))
            && (this.getSub_account() == null ? other.getSub_account() == null : this.getSub_account().equals(other.getSub_account()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getOrigin_account() == null) ? 0 : getOrigin_account().hashCode());
        result = prime * result + ((getRebate_amount() == null) ? 0 : getRebate_amount().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getEvent_id() == null) ? 0 : getEvent_id().hashCode());
        result = prime * result + ((getEvent_name() == null) ? 0 : getEvent_name().hashCode());
        result = prime * result + ((getOther_args() == null) ? 0 : getOther_args().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getSub_id() == null) ? 0 : getSub_id().hashCode());
        result = prime * result + ((getSub_account() == null) ? 0 : getSub_account().hashCode());
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
        sb.append(", account_id=").append(account_id);
        sb.append(", account=").append(account);
        sb.append(", origin_account=").append(origin_account);
        sb.append(", rebate_amount=").append(rebate_amount);
        sb.append(", type=").append(type);
        sb.append(", event_id=").append(event_id);
        sb.append(", event_name=").append(event_name);
        sb.append(", other_args=").append(other_args);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", sub_id=").append(sub_id);
        sb.append(", sub_account=").append(sub_account);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}