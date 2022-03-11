package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sys_pay_system
 */
@TableName(value ="sys_pay_system")
@Data
public class SysPaySystem implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 支付系统名称
     */
    @TableField(value = "pay_name")
    private String pay_name;

    /**
     * 支付发送地址
     */
    @TableField(value = "pay_send_url")
    private String pay_send_url;

    /**
     * 发送模式:POST,GET
     */
    @TableField(value = "pay_send_method")
    private String pay_send_method;

    /**
     * 通知接收地址 已/开头
     */
    @TableField(value = "notice_received_url")
    private String notice_received_url;

    /**
     * 异步接收通知地址
     */
    @TableField(value = "asynch_notice_received_url")
    private String asynch_notice_received_url;

    /**
     * 支付类型,1:易宝,2:聚付通
     */
    @TableField(value = "pay_type")
    private Object pay_type;

    /**
     * 是否测试0:否,1:是
     */
    @TableField(value = "is_test")
    private Object is_test;

    /**
     * 测试发送地址
     */
    @TableField(value = "test_pay_send_url")
    private String test_pay_send_url;

    /**
     * 状态,0:启用,1:禁用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 
     */
    @TableField(value = "pay_path")
    private String pay_path;

    /**
     * 支付类型：0 为 银行，1 为 点卡 , 2 为 二维码支付 
     */
    @TableField(value = "banktype")
    private Object banktype;

    /**
     * 
     */
    @TableField(value = "is_outreach")
    private String is_outreach;

    /**
     * 
     */
    @TableField(value = "is_support_decimal")
    private Object is_support_decimal;

    /**
     * 
     */
    @TableField(value = "mer_console_alias")
    private String mer_console_alias;

    /**
     * 
     */
    @TableField(value = "mer_no_alias")
    private String mer_no_alias;

    /**
     * 
     */
    @TableField(value = "mer_key_alias")
    private String mer_key_alias;

    /**
     * 
     */
    @TableField(value = "mer_console_prompt")
    private String mer_console_prompt;

    /**
     * 查询订单网关
     */
    @TableField(value = "query_order_gateway")
    private String query_order_gateway;

    /**
     * 支付平台创建时间
     */
    @TableField(value = "create_time")
    private String create_time;

    /**
     * 支付平台更新时间
     */
    @TableField(value = "update_time")
    private String update_time;

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
        SysPaySystem other = (SysPaySystem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPay_name() == null ? other.getPay_name() == null : this.getPay_name().equals(other.getPay_name()))
            && (this.getPay_send_url() == null ? other.getPay_send_url() == null : this.getPay_send_url().equals(other.getPay_send_url()))
            && (this.getPay_send_method() == null ? other.getPay_send_method() == null : this.getPay_send_method().equals(other.getPay_send_method()))
            && (this.getNotice_received_url() == null ? other.getNotice_received_url() == null : this.getNotice_received_url().equals(other.getNotice_received_url()))
            && (this.getAsynch_notice_received_url() == null ? other.getAsynch_notice_received_url() == null : this.getAsynch_notice_received_url().equals(other.getAsynch_notice_received_url()))
            && (this.getPay_type() == null ? other.getPay_type() == null : this.getPay_type().equals(other.getPay_type()))
            && (this.getIs_test() == null ? other.getIs_test() == null : this.getIs_test().equals(other.getIs_test()))
            && (this.getTest_pay_send_url() == null ? other.getTest_pay_send_url() == null : this.getTest_pay_send_url().equals(other.getTest_pay_send_url()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPay_path() == null ? other.getPay_path() == null : this.getPay_path().equals(other.getPay_path()))
            && (this.getBanktype() == null ? other.getBanktype() == null : this.getBanktype().equals(other.getBanktype()))
            && (this.getIs_outreach() == null ? other.getIs_outreach() == null : this.getIs_outreach().equals(other.getIs_outreach()))
            && (this.getIs_support_decimal() == null ? other.getIs_support_decimal() == null : this.getIs_support_decimal().equals(other.getIs_support_decimal()))
            && (this.getMer_console_alias() == null ? other.getMer_console_alias() == null : this.getMer_console_alias().equals(other.getMer_console_alias()))
            && (this.getMer_no_alias() == null ? other.getMer_no_alias() == null : this.getMer_no_alias().equals(other.getMer_no_alias()))
            && (this.getMer_key_alias() == null ? other.getMer_key_alias() == null : this.getMer_key_alias().equals(other.getMer_key_alias()))
            && (this.getMer_console_prompt() == null ? other.getMer_console_prompt() == null : this.getMer_console_prompt().equals(other.getMer_console_prompt()))
            && (this.getQuery_order_gateway() == null ? other.getQuery_order_gateway() == null : this.getQuery_order_gateway().equals(other.getQuery_order_gateway()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPay_name() == null) ? 0 : getPay_name().hashCode());
        result = prime * result + ((getPay_send_url() == null) ? 0 : getPay_send_url().hashCode());
        result = prime * result + ((getPay_send_method() == null) ? 0 : getPay_send_method().hashCode());
        result = prime * result + ((getNotice_received_url() == null) ? 0 : getNotice_received_url().hashCode());
        result = prime * result + ((getAsynch_notice_received_url() == null) ? 0 : getAsynch_notice_received_url().hashCode());
        result = prime * result + ((getPay_type() == null) ? 0 : getPay_type().hashCode());
        result = prime * result + ((getIs_test() == null) ? 0 : getIs_test().hashCode());
        result = prime * result + ((getTest_pay_send_url() == null) ? 0 : getTest_pay_send_url().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPay_path() == null) ? 0 : getPay_path().hashCode());
        result = prime * result + ((getBanktype() == null) ? 0 : getBanktype().hashCode());
        result = prime * result + ((getIs_outreach() == null) ? 0 : getIs_outreach().hashCode());
        result = prime * result + ((getIs_support_decimal() == null) ? 0 : getIs_support_decimal().hashCode());
        result = prime * result + ((getMer_console_alias() == null) ? 0 : getMer_console_alias().hashCode());
        result = prime * result + ((getMer_no_alias() == null) ? 0 : getMer_no_alias().hashCode());
        result = prime * result + ((getMer_key_alias() == null) ? 0 : getMer_key_alias().hashCode());
        result = prime * result + ((getMer_console_prompt() == null) ? 0 : getMer_console_prompt().hashCode());
        result = prime * result + ((getQuery_order_gateway() == null) ? 0 : getQuery_order_gateway().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pay_name=").append(pay_name);
        sb.append(", pay_send_url=").append(pay_send_url);
        sb.append(", pay_send_method=").append(pay_send_method);
        sb.append(", notice_received_url=").append(notice_received_url);
        sb.append(", asynch_notice_received_url=").append(asynch_notice_received_url);
        sb.append(", pay_type=").append(pay_type);
        sb.append(", is_test=").append(is_test);
        sb.append(", test_pay_send_url=").append(test_pay_send_url);
        sb.append(", status=").append(status);
        sb.append(", pay_path=").append(pay_path);
        sb.append(", banktype=").append(banktype);
        sb.append(", is_outreach=").append(is_outreach);
        sb.append(", is_support_decimal=").append(is_support_decimal);
        sb.append(", mer_console_alias=").append(mer_console_alias);
        sb.append(", mer_no_alias=").append(mer_no_alias);
        sb.append(", mer_key_alias=").append(mer_key_alias);
        sb.append(", mer_console_prompt=").append(mer_console_prompt);
        sb.append(", query_order_gateway=").append(query_order_gateway);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}