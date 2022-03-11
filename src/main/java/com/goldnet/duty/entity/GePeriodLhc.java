package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 六合专用期数表
 * @TableName ge_period_lhc
 */
@TableName(value ="ge_period_lhc")
@Data
public class GePeriodLhc implements Serializable {
    /**
     * 期数Id
     */
    @TableId(value = "period_lhc_id")
    private Object period_lhc_id;

    /**
     * 游戏编号

     */
    @TableField(value = "lottery_code")
    private String lottery_code;

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
     * 游戏ID

     */
    @TableField(value = "lottery_id")
    private Object lottery_id;

    /**
     * 开奖时间

     */
    @TableField(value = "award_time")
    private String award_time;

    /**
     * 总自动封盘时间，控制页面操作，没有业务意义

     */
    @TableField(value = "auto_close_time")
    private String auto_close_time;

    /**
     * 总封盘状态 1:开盘 0:封盘
     */
    @TableField(value = "auto_close_status")
    private String auto_close_status;

    /**
     * 自动开盘时间

     */
    @TableField(value = "auto_open_time")
    private String auto_open_time;

    /**
     * 自动开盘状态

     */
    @TableField(value = "auto_open_status")
    private String auto_open_status;

    /**
     * 单双大小开封状态
     */
    @TableField(value = "abcd_status")
    private String abcd_status;

    /**
     * 单双大小自动封盘时间
     */
    @TableField(value = "abcd_time")
    private String abcd_time;

    /**
     * 特别号开封状态

     */
    @TableField(value = "tbh_status")
    private String tbh_status;

    /**
     * 特别号自动封盘时间

     */
    @TableField(value = "tbh_time")
    private String tbh_time;

    /**
     * 正特码开封状态

     */
    @TableField(value = "ztm_status")
    private String ztm_status;

    /**
     * 正特码自动封盘时间
     */
    @TableField(value = "ztm_time")
    private String ztm_time;

    /**
     * 正码开封状态

     */
    @TableField(value = "zm_status")
    private String zm_status;

    /**
     * 正码自动封盘时间

     */
    @TableField(value = "zm_time")
    private String zm_time;

    /**
     * 正码1-6开封状态
     */
    @TableField(value = "zmaf_status")
    private String zmaf_status;

    /**
     * 正码1-6自动封盘时间
     */
    @TableField(value = "zmaf_time")
    private String zmaf_time;

    /**
     * 连码开封状态

     */
    @TableField(value = "lm_status")
    private String lm_status;

    /**
     * 连码自动封盘时间

     */
    @TableField(value = "lm_time")
    private String lm_time;

    /**
     * 自选不中开封状态

     */
    @TableField(value = "zxbz_status")
    private String zxbz_status;

    /**
     * 自选不中自动封盘时间

     */
    @TableField(value = "zxbz_time")
    private String zxbz_time;

    /**
     * 正码过关开封状态

     */
    @TableField(value = "zmgg_status")
    private String zmgg_status;

    /**
     * 正码过关自动封盘时间

     */
    @TableField(value = "zmgg_time")
    private String zmgg_time;

    /**
     * 生肖色波头尾数开封状态

     */
    @TableField(value = "sxsbtw_status")
    private String sxsbtw_status;

    /**
     * 生肖色波头尾数自动封盘时间

     */
    @TableField(value = "sxsbtw_time")
    private String sxsbtw_time;

    /**
     * 一肖总肖正特尾数开封状态

     */
    @TableField(value = "yxzxzt_status")
    private String yxzxzt_status;

    /**
     * 一肖总肖正特尾数自动封盘时间

     */
    @TableField(value = "yxzxzt_time")
    private String yxzxzt_time;

    /**
     * 合肖开封状态

     */
    @TableField(value = "hx_status")
    private String hx_status;

    /**
     * 合肖自动封盘时间

     */
    @TableField(value = "hx_time")
    private String hx_time;

    /**
     * 连肖连尾开封状态

     */
    @TableField(value = "lxlw_status")
    private String lxlw_status;

    /**
     * 连肖连尾自动封盘时间

     */
    @TableField(value = "lxlw_time")
    private String lxlw_time;

    /**
     * 半波半半波开封状态

     */
    @TableField(value = "bbbbb_status")
    private String bbbbb_status;

    /**
     * 半波半半波自动封盘时间

     */
    @TableField(value = "bbbbb_time")
    private String bbbbb_time;

    /**
     * 正肖七色波开封状态

     */
    @TableField(value = "zxqsb_status")
    private String zxqsb_status;

    /**
     * 正肖七色波自动封盘时间

     */
    @TableField(value = "zxqsb_time")
    private String zxqsb_time;

    /**
     * 六合彩期数
     */
    @TableField(value = "period_code")
    private Object period_code;

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
        GePeriodLhc other = (GePeriodLhc) that;
        return (this.getPeriod_lhc_id() == null ? other.getPeriod_lhc_id() == null : this.getPeriod_lhc_id().equals(other.getPeriod_lhc_id()))
            && (this.getLottery_code() == null ? other.getLottery_code() == null : this.getLottery_code().equals(other.getLottery_code()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_date_time() == null ? other.getUpdate_date_time() == null : this.getUpdate_date_time().equals(other.getUpdate_date_time()))
            && (this.getLottery_id() == null ? other.getLottery_id() == null : this.getLottery_id().equals(other.getLottery_id()))
            && (this.getAward_time() == null ? other.getAward_time() == null : this.getAward_time().equals(other.getAward_time()))
            && (this.getAuto_close_time() == null ? other.getAuto_close_time() == null : this.getAuto_close_time().equals(other.getAuto_close_time()))
            && (this.getAuto_close_status() == null ? other.getAuto_close_status() == null : this.getAuto_close_status().equals(other.getAuto_close_status()))
            && (this.getAuto_open_time() == null ? other.getAuto_open_time() == null : this.getAuto_open_time().equals(other.getAuto_open_time()))
            && (this.getAuto_open_status() == null ? other.getAuto_open_status() == null : this.getAuto_open_status().equals(other.getAuto_open_status()))
            && (this.getAbcd_status() == null ? other.getAbcd_status() == null : this.getAbcd_status().equals(other.getAbcd_status()))
            && (this.getAbcd_time() == null ? other.getAbcd_time() == null : this.getAbcd_time().equals(other.getAbcd_time()))
            && (this.getTbh_status() == null ? other.getTbh_status() == null : this.getTbh_status().equals(other.getTbh_status()))
            && (this.getTbh_time() == null ? other.getTbh_time() == null : this.getTbh_time().equals(other.getTbh_time()))
            && (this.getZtm_status() == null ? other.getZtm_status() == null : this.getZtm_status().equals(other.getZtm_status()))
            && (this.getZtm_time() == null ? other.getZtm_time() == null : this.getZtm_time().equals(other.getZtm_time()))
            && (this.getZm_status() == null ? other.getZm_status() == null : this.getZm_status().equals(other.getZm_status()))
            && (this.getZm_time() == null ? other.getZm_time() == null : this.getZm_time().equals(other.getZm_time()))
            && (this.getZmaf_status() == null ? other.getZmaf_status() == null : this.getZmaf_status().equals(other.getZmaf_status()))
            && (this.getZmaf_time() == null ? other.getZmaf_time() == null : this.getZmaf_time().equals(other.getZmaf_time()))
            && (this.getLm_status() == null ? other.getLm_status() == null : this.getLm_status().equals(other.getLm_status()))
            && (this.getLm_time() == null ? other.getLm_time() == null : this.getLm_time().equals(other.getLm_time()))
            && (this.getZxbz_status() == null ? other.getZxbz_status() == null : this.getZxbz_status().equals(other.getZxbz_status()))
            && (this.getZxbz_time() == null ? other.getZxbz_time() == null : this.getZxbz_time().equals(other.getZxbz_time()))
            && (this.getZmgg_status() == null ? other.getZmgg_status() == null : this.getZmgg_status().equals(other.getZmgg_status()))
            && (this.getZmgg_time() == null ? other.getZmgg_time() == null : this.getZmgg_time().equals(other.getZmgg_time()))
            && (this.getSxsbtw_status() == null ? other.getSxsbtw_status() == null : this.getSxsbtw_status().equals(other.getSxsbtw_status()))
            && (this.getSxsbtw_time() == null ? other.getSxsbtw_time() == null : this.getSxsbtw_time().equals(other.getSxsbtw_time()))
            && (this.getYxzxzt_status() == null ? other.getYxzxzt_status() == null : this.getYxzxzt_status().equals(other.getYxzxzt_status()))
            && (this.getYxzxzt_time() == null ? other.getYxzxzt_time() == null : this.getYxzxzt_time().equals(other.getYxzxzt_time()))
            && (this.getHx_status() == null ? other.getHx_status() == null : this.getHx_status().equals(other.getHx_status()))
            && (this.getHx_time() == null ? other.getHx_time() == null : this.getHx_time().equals(other.getHx_time()))
            && (this.getLxlw_status() == null ? other.getLxlw_status() == null : this.getLxlw_status().equals(other.getLxlw_status()))
            && (this.getLxlw_time() == null ? other.getLxlw_time() == null : this.getLxlw_time().equals(other.getLxlw_time()))
            && (this.getBbbbb_status() == null ? other.getBbbbb_status() == null : this.getBbbbb_status().equals(other.getBbbbb_status()))
            && (this.getBbbbb_time() == null ? other.getBbbbb_time() == null : this.getBbbbb_time().equals(other.getBbbbb_time()))
            && (this.getZxqsb_status() == null ? other.getZxqsb_status() == null : this.getZxqsb_status().equals(other.getZxqsb_status()))
            && (this.getZxqsb_time() == null ? other.getZxqsb_time() == null : this.getZxqsb_time().equals(other.getZxqsb_time()))
            && (this.getPeriod_code() == null ? other.getPeriod_code() == null : this.getPeriod_code().equals(other.getPeriod_code()))
            && (this.getIs_award() == null ? other.getIs_award() == null : this.getIs_award().equals(other.getIs_award()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPeriod_lhc_id() == null) ? 0 : getPeriod_lhc_id().hashCode());
        result = prime * result + ((getLottery_code() == null) ? 0 : getLottery_code().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_date_time() == null) ? 0 : getUpdate_date_time().hashCode());
        result = prime * result + ((getLottery_id() == null) ? 0 : getLottery_id().hashCode());
        result = prime * result + ((getAward_time() == null) ? 0 : getAward_time().hashCode());
        result = prime * result + ((getAuto_close_time() == null) ? 0 : getAuto_close_time().hashCode());
        result = prime * result + ((getAuto_close_status() == null) ? 0 : getAuto_close_status().hashCode());
        result = prime * result + ((getAuto_open_time() == null) ? 0 : getAuto_open_time().hashCode());
        result = prime * result + ((getAuto_open_status() == null) ? 0 : getAuto_open_status().hashCode());
        result = prime * result + ((getAbcd_status() == null) ? 0 : getAbcd_status().hashCode());
        result = prime * result + ((getAbcd_time() == null) ? 0 : getAbcd_time().hashCode());
        result = prime * result + ((getTbh_status() == null) ? 0 : getTbh_status().hashCode());
        result = prime * result + ((getTbh_time() == null) ? 0 : getTbh_time().hashCode());
        result = prime * result + ((getZtm_status() == null) ? 0 : getZtm_status().hashCode());
        result = prime * result + ((getZtm_time() == null) ? 0 : getZtm_time().hashCode());
        result = prime * result + ((getZm_status() == null) ? 0 : getZm_status().hashCode());
        result = prime * result + ((getZm_time() == null) ? 0 : getZm_time().hashCode());
        result = prime * result + ((getZmaf_status() == null) ? 0 : getZmaf_status().hashCode());
        result = prime * result + ((getZmaf_time() == null) ? 0 : getZmaf_time().hashCode());
        result = prime * result + ((getLm_status() == null) ? 0 : getLm_status().hashCode());
        result = prime * result + ((getLm_time() == null) ? 0 : getLm_time().hashCode());
        result = prime * result + ((getZxbz_status() == null) ? 0 : getZxbz_status().hashCode());
        result = prime * result + ((getZxbz_time() == null) ? 0 : getZxbz_time().hashCode());
        result = prime * result + ((getZmgg_status() == null) ? 0 : getZmgg_status().hashCode());
        result = prime * result + ((getZmgg_time() == null) ? 0 : getZmgg_time().hashCode());
        result = prime * result + ((getSxsbtw_status() == null) ? 0 : getSxsbtw_status().hashCode());
        result = prime * result + ((getSxsbtw_time() == null) ? 0 : getSxsbtw_time().hashCode());
        result = prime * result + ((getYxzxzt_status() == null) ? 0 : getYxzxzt_status().hashCode());
        result = prime * result + ((getYxzxzt_time() == null) ? 0 : getYxzxzt_time().hashCode());
        result = prime * result + ((getHx_status() == null) ? 0 : getHx_status().hashCode());
        result = prime * result + ((getHx_time() == null) ? 0 : getHx_time().hashCode());
        result = prime * result + ((getLxlw_status() == null) ? 0 : getLxlw_status().hashCode());
        result = prime * result + ((getLxlw_time() == null) ? 0 : getLxlw_time().hashCode());
        result = prime * result + ((getBbbbb_status() == null) ? 0 : getBbbbb_status().hashCode());
        result = prime * result + ((getBbbbb_time() == null) ? 0 : getBbbbb_time().hashCode());
        result = prime * result + ((getZxqsb_status() == null) ? 0 : getZxqsb_status().hashCode());
        result = prime * result + ((getZxqsb_time() == null) ? 0 : getZxqsb_time().hashCode());
        result = prime * result + ((getPeriod_code() == null) ? 0 : getPeriod_code().hashCode());
        result = prime * result + ((getIs_award() == null) ? 0 : getIs_award().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", period_lhc_id=").append(period_lhc_id);
        sb.append(", lottery_code=").append(lottery_code);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_date_time=").append(update_date_time);
        sb.append(", lottery_id=").append(lottery_id);
        sb.append(", award_time=").append(award_time);
        sb.append(", auto_close_time=").append(auto_close_time);
        sb.append(", auto_close_status=").append(auto_close_status);
        sb.append(", auto_open_time=").append(auto_open_time);
        sb.append(", auto_open_status=").append(auto_open_status);
        sb.append(", abcd_status=").append(abcd_status);
        sb.append(", abcd_time=").append(abcd_time);
        sb.append(", tbh_status=").append(tbh_status);
        sb.append(", tbh_time=").append(tbh_time);
        sb.append(", ztm_status=").append(ztm_status);
        sb.append(", ztm_time=").append(ztm_time);
        sb.append(", zm_status=").append(zm_status);
        sb.append(", zm_time=").append(zm_time);
        sb.append(", zmaf_status=").append(zmaf_status);
        sb.append(", zmaf_time=").append(zmaf_time);
        sb.append(", lm_status=").append(lm_status);
        sb.append(", lm_time=").append(lm_time);
        sb.append(", zxbz_status=").append(zxbz_status);
        sb.append(", zxbz_time=").append(zxbz_time);
        sb.append(", zmgg_status=").append(zmgg_status);
        sb.append(", zmgg_time=").append(zmgg_time);
        sb.append(", sxsbtw_status=").append(sxsbtw_status);
        sb.append(", sxsbtw_time=").append(sxsbtw_time);
        sb.append(", yxzxzt_status=").append(yxzxzt_status);
        sb.append(", yxzxzt_time=").append(yxzxzt_time);
        sb.append(", hx_status=").append(hx_status);
        sb.append(", hx_time=").append(hx_time);
        sb.append(", lxlw_status=").append(lxlw_status);
        sb.append(", lxlw_time=").append(lxlw_time);
        sb.append(", bbbbb_status=").append(bbbbb_status);
        sb.append(", bbbbb_time=").append(bbbbb_time);
        sb.append(", zxqsb_status=").append(zxqsb_status);
        sb.append(", zxqsb_time=").append(zxqsb_time);
        sb.append(", period_code=").append(period_code);
        sb.append(", is_award=").append(is_award);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}