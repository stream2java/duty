package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 登录用户记录表
 * @TableName ge_login
 */
@TableName(value ="ge_login")
@Data
public class GeLogin implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 登录帐号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 登录ip
     */
    @TableField(value = "login_ip")
    private String login_ip;

    /**
     * 登录浏览器
     */
    @TableField(value = "browser")
    private String browser;

    /**
     * 登录时间
     */
    @TableField(value = "login_time")
    private LocalDateTime login_time;

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
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 登录账户id
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 层级
     */
    @TableField(value = "rate")
    private String rate;

    /**
     * 登录情况
     */
    @TableField(value = "login_state")
    private String login_state;

    /**
     * 1:主域名登录,不被查询
0:其他域名登录,被查询
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 大大股东
     */
    @TableField(value = "account1")
    private Object account1;

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
     * 代理
     */
    @TableField(value = "account5")
    private Object account5;

    /**
     * 类型(0主帐号，1子帐号)
     */
    @TableField(value = "type")
    private String type;

    /**
     * 登录的终端,默认为null：1:PC;2:H5;3:竖版APP;4:横版APP
     */
    @TableField(value = "terminal")
    private Object terminal;

    /**
     * 登录位置
     */
    @TableField(value = "login_location")
    private String login_location;

    /**
     * 终端类型
     */
    @TableField(value = "device")
    private Object device;

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
        GeLogin other = (GeLogin) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getLogin_ip() == null ? other.getLogin_ip() == null : this.getLogin_ip().equals(other.getLogin_ip()))
            && (this.getBrowser() == null ? other.getBrowser() == null : this.getBrowser().equals(other.getBrowser()))
            && (this.getLogin_time() == null ? other.getLogin_time() == null : this.getLogin_time().equals(other.getLogin_time()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getLogin_state() == null ? other.getLogin_state() == null : this.getLogin_state().equals(other.getLogin_state()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTerminal() == null ? other.getTerminal() == null : this.getTerminal().equals(other.getTerminal()))
            && (this.getLogin_location() == null ? other.getLogin_location() == null : this.getLogin_location().equals(other.getLogin_location()))
            && (this.getDevice() == null ? other.getDevice() == null : this.getDevice().equals(other.getDevice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getLogin_ip() == null) ? 0 : getLogin_ip().hashCode());
        result = prime * result + ((getBrowser() == null) ? 0 : getBrowser().hashCode());
        result = prime * result + ((getLogin_time() == null) ? 0 : getLogin_time().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getLogin_state() == null) ? 0 : getLogin_state().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTerminal() == null) ? 0 : getTerminal().hashCode());
        result = prime * result + ((getLogin_location() == null) ? 0 : getLogin_location().hashCode());
        result = prime * result + ((getDevice() == null) ? 0 : getDevice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", login_ip=").append(login_ip);
        sb.append(", browser=").append(browser);
        sb.append(", login_time=").append(login_time);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", account_id=").append(account_id);
        sb.append(", rate=").append(rate);
        sb.append(", login_state=").append(login_state);
        sb.append(", status=").append(status);
        sb.append(", account1=").append(account1);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", account5=").append(account5);
        sb.append(", type=").append(type);
        sb.append(", terminal=").append(terminal);
        sb.append(", login_location=").append(login_location);
        sb.append(", device=").append(device);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}