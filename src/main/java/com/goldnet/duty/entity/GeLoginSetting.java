package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 登陆安全设置
 * @TableName ge_login_setting
 */
@TableName(value ="ge_login_setting")
@Data
public class GeLoginSetting implements Serializable {
    /**
     * 
     */
    @TableId(value = "setting_id")
    private Object setting_id;

    /**
     * 厅主id
     */
    @TableField(value = "account1")
    private Object account1;

    /**
     * 验证码是否开启 0关闭 1开启
     */
    @TableField(value = "open_captcha")
    private Object open_captcha;

    /**
     * 密码输错几次显示验证码
     */
    @TableField(value = "pwd_error_num")
    private Object pwd_error_num;

    /**
     * 特殊验证 0关闭 1开启
     */
    @TableField(value = "special_verify")
    private Object special_verify;

    /**
     * 密码输错几次显示验证问题1
     */
    @TableField(value = "error_num1")
    private Object error_num1;

    /**
     * 验证问题1编码
     */
    @TableField(value = "question1")
    private String question1;

    /**
     * 密码输错几次显示验证问题2
     */
    @TableField(value = "error_num2")
    private Object error_num2;

    /**
     * 验证问题2编码
     */
    @TableField(value = "question2")
    private String question2;

    /**
     * 
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

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
        GeLoginSetting other = (GeLoginSetting) that;
        return (this.getSetting_id() == null ? other.getSetting_id() == null : this.getSetting_id().equals(other.getSetting_id()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getOpen_captcha() == null ? other.getOpen_captcha() == null : this.getOpen_captcha().equals(other.getOpen_captcha()))
            && (this.getPwd_error_num() == null ? other.getPwd_error_num() == null : this.getPwd_error_num().equals(other.getPwd_error_num()))
            && (this.getSpecial_verify() == null ? other.getSpecial_verify() == null : this.getSpecial_verify().equals(other.getSpecial_verify()))
            && (this.getError_num1() == null ? other.getError_num1() == null : this.getError_num1().equals(other.getError_num1()))
            && (this.getQuestion1() == null ? other.getQuestion1() == null : this.getQuestion1().equals(other.getQuestion1()))
            && (this.getError_num2() == null ? other.getError_num2() == null : this.getError_num2().equals(other.getError_num2()))
            && (this.getQuestion2() == null ? other.getQuestion2() == null : this.getQuestion2().equals(other.getQuestion2()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSetting_id() == null) ? 0 : getSetting_id().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getOpen_captcha() == null) ? 0 : getOpen_captcha().hashCode());
        result = prime * result + ((getPwd_error_num() == null) ? 0 : getPwd_error_num().hashCode());
        result = prime * result + ((getSpecial_verify() == null) ? 0 : getSpecial_verify().hashCode());
        result = prime * result + ((getError_num1() == null) ? 0 : getError_num1().hashCode());
        result = prime * result + ((getQuestion1() == null) ? 0 : getQuestion1().hashCode());
        result = prime * result + ((getError_num2() == null) ? 0 : getError_num2().hashCode());
        result = prime * result + ((getQuestion2() == null) ? 0 : getQuestion2().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", setting_id=").append(setting_id);
        sb.append(", account1=").append(account1);
        sb.append(", open_captcha=").append(open_captcha);
        sb.append(", pwd_error_num=").append(pwd_error_num);
        sb.append(", special_verify=").append(special_verify);
        sb.append(", error_num1=").append(error_num1);
        sb.append(", question1=").append(question1);
        sb.append(", error_num2=").append(error_num2);
        sb.append(", question2=").append(question2);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}