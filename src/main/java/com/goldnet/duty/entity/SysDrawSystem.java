package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 出款平台设定
 * @TableName sys_draw_system
 */
@TableName(value ="sys_draw_system")
@Data
public class SysDrawSystem implements Serializable {
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
     * 结算网关地址
     */
    @TableField(value = "remit_gateway")
    private String remit_gateway;

    /**
     * 结算地址
     */
    @TableField(value = "remit_path")
    private String remit_path;

    /**
     * 余额网关地址
     */
    @TableField(value = "balance_gateway")
    private String balance_gateway;

    /**
     * 请求余额地址
     */
    @TableField(value = "balance_path")
    private String balance_path;

    /**
     * 状态,0:启用,1:禁用
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 支付类型：0:在线网银
     */
    @TableField(value = "banktype")
    private Object banktype;

    /**
     * Spring注入的出款BeanName
     */
    @TableField(value = "bean_name")
    private String bean_name;

    /**
     * 终端号别名
     */
    @TableField(value = "mer_console_alias")
    private String mer_console_alias;

    /**
     * 商号别名
     */
    @TableField(value = "mer_no_alias")
    private String mer_no_alias;

    /**
     * 秘钥别名
     */
    @TableField(value = "mer_key_alias")
    private String mer_key_alias;

    /**
     * 终端号提示语
     */
    @TableField(value = "mer_console_prompt")
    private String mer_console_prompt;

    /**
     * 出款平台创建时间
     */
    @TableField(value = "create_time")
    private String create_time;

    /**
     * 出款平台更新时间
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
        SysDrawSystem other = (SysDrawSystem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPay_name() == null ? other.getPay_name() == null : this.getPay_name().equals(other.getPay_name()))
            && (this.getRemit_gateway() == null ? other.getRemit_gateway() == null : this.getRemit_gateway().equals(other.getRemit_gateway()))
            && (this.getRemit_path() == null ? other.getRemit_path() == null : this.getRemit_path().equals(other.getRemit_path()))
            && (this.getBalance_gateway() == null ? other.getBalance_gateway() == null : this.getBalance_gateway().equals(other.getBalance_gateway()))
            && (this.getBalance_path() == null ? other.getBalance_path() == null : this.getBalance_path().equals(other.getBalance_path()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBanktype() == null ? other.getBanktype() == null : this.getBanktype().equals(other.getBanktype()))
            && (this.getBean_name() == null ? other.getBean_name() == null : this.getBean_name().equals(other.getBean_name()))
            && (this.getMer_console_alias() == null ? other.getMer_console_alias() == null : this.getMer_console_alias().equals(other.getMer_console_alias()))
            && (this.getMer_no_alias() == null ? other.getMer_no_alias() == null : this.getMer_no_alias().equals(other.getMer_no_alias()))
            && (this.getMer_key_alias() == null ? other.getMer_key_alias() == null : this.getMer_key_alias().equals(other.getMer_key_alias()))
            && (this.getMer_console_prompt() == null ? other.getMer_console_prompt() == null : this.getMer_console_prompt().equals(other.getMer_console_prompt()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPay_name() == null) ? 0 : getPay_name().hashCode());
        result = prime * result + ((getRemit_gateway() == null) ? 0 : getRemit_gateway().hashCode());
        result = prime * result + ((getRemit_path() == null) ? 0 : getRemit_path().hashCode());
        result = prime * result + ((getBalance_gateway() == null) ? 0 : getBalance_gateway().hashCode());
        result = prime * result + ((getBalance_path() == null) ? 0 : getBalance_path().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBanktype() == null) ? 0 : getBanktype().hashCode());
        result = prime * result + ((getBean_name() == null) ? 0 : getBean_name().hashCode());
        result = prime * result + ((getMer_console_alias() == null) ? 0 : getMer_console_alias().hashCode());
        result = prime * result + ((getMer_no_alias() == null) ? 0 : getMer_no_alias().hashCode());
        result = prime * result + ((getMer_key_alias() == null) ? 0 : getMer_key_alias().hashCode());
        result = prime * result + ((getMer_console_prompt() == null) ? 0 : getMer_console_prompt().hashCode());
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
        sb.append(", remit_gateway=").append(remit_gateway);
        sb.append(", remit_path=").append(remit_path);
        sb.append(", balance_gateway=").append(balance_gateway);
        sb.append(", balance_path=").append(balance_path);
        sb.append(", status=").append(status);
        sb.append(", banktype=").append(banktype);
        sb.append(", bean_name=").append(bean_name);
        sb.append(", mer_console_alias=").append(mer_console_alias);
        sb.append(", mer_no_alias=").append(mer_no_alias);
        sb.append(", mer_key_alias=").append(mer_key_alias);
        sb.append(", mer_console_prompt=").append(mer_console_prompt);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}