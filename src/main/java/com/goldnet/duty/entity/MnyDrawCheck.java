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
 * 优惠稽核扣除金额
 * @TableName mny_draw_check
 */
@TableName(value ="mny_draw_check")
@Data
public class MnyDrawCheck implements Serializable {
    /**
     * 表id
     */
    @TableId(value = "check_id")
    private Object check_id;

    /**
     * 起始时间
     */
    @TableField(value = "time_start")
    private LocalDateTime time_start;

    /**
     * 结束时间
     */
    @TableField(value = "time_end")
    private LocalDateTime time_end;

    /**
     * 存款金额
     */
    @TableField(value = "deposit_money")
    private BigDecimal deposit_money;

    /**
     * 优惠
     */
    @TableField(value = "preferential")
    private BigDecimal preferential;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String create_user;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 修改者
     */
    @TableField(value = "update_user")
    private String update_user;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 会员ID
     */
    @TableField(value = "member_id")
    private Object member_id;

    /**
     * 视讯有效总投注
     */
    @TableField(value = "video_bet")
    private BigDecimal video_bet;

    /**
     * 机率有效总投注
     */
    @TableField(value = "probability_bet")
    private BigDecimal probability_bet;

    /**
     * BB体育有效总投注
     */
    @TableField(value = "bbsport_bet")
    private BigDecimal bbsport_bet;

    /**
     * 彩票有效总投注
     */
    @TableField(value = "lottery_bet")
    private BigDecimal lottery_bet;

    /**
     * 体育/球类有效总投注
     */
    @TableField(value = "sport_bet")
    private BigDecimal sport_bet;

    /**
     * 优惠稽核：视讯打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_video_status")
    private Object pre_check_video_status;

    /**
     * 优惠稽核：球类打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_ball_status")
    private Object pre_check_ball_status;

    /**
     * 优惠稽核：综合打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_comp_status")
    private Object pre_check_comp_status;

    /**
     * 优惠稽核是否扣除优惠：0-不需稽核1-通过2-是
     */
    @TableField(value = "pre_check_status")
    private Object pre_check_status;

    /**
     * 常态性稽核放宽额度
     */
    @TableField(value = "normal_check_relax")
    private BigDecimal normal_check_relax;

    /**
     * 常态性打码量稽核是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "normal_check_bet_status")
    private Object normal_check_bet_status;

    /**
     * 常态性稽核是否需要扣除行政费用：0-不需稽核1-通过2-是
     */
    @TableField(value = "normal_check_status")
    private Object normal_check_status;

    /**
     * 常态性稽核扣除行政费用
     */
    @TableField(value = "normal_check_deduct_money")
    private BigDecimal normal_check_deduct_money;

    /**
     * 取款类型：1-线上取款2-人工提款
     */
    @TableField(value = "draw_type")
    private Object draw_type;

    /**
     * 大大股东id
     */
    @TableField(value = "stockholder_id")
    private Object stockholder_id;

    /**
     * 
     */
    @TableField(value = "pre_check_deduct_money")
    private BigDecimal pre_check_deduct_money;

    /**
     * 出款稽核uuid
     */
    @TableField(value = "draw_check_uuid")
    private String draw_check_uuid;

    /**
     * 常态百分比
     */
    @TableField(value = "normal_per_check")
    private String normal_per_check;

    /**
     * 
     */
    @TableField(value = "normal_adm_per")
    private String normal_adm_per;

    /**
     * 稽核通过否
     */
    @TableField(value = "pre_check_pass_status")
    private Object pre_check_pass_status;

    /**
     * 临时结束时间
     */
    @TableField(value = "my_end_time")
    private LocalDateTime my_end_time;

    /**
     * 视讯打码量
     */
    @TableField(value = "remainder_real_bet")
    private String remainder_real_bet;

    /**
     * 球类打码量
     */
    @TableField(value = "remainder_ball_bet")
    private String remainder_ball_bet;

    /**
     * 综合打码量
     */
    @TableField(value = "remainder_comp_bet")
    private String remainder_comp_bet;

    /**
     * 
     */
    @TableField(value = "pre_check_lottery_status")
    private Object pre_check_lottery_status;

    /**
     * 
     */
    @TableField(value = "pre_check_electron_status")
    private Object pre_check_electron_status;

    /**
     * 
     */
    @TableField(value = "remainder_lottery_bet")
    private String remainder_lottery_bet;

    /**
     * 
     */
    @TableField(value = "remainder_electron_bet")
    private String remainder_electron_bet;

    /**
     * HG视讯有效总投注
     */
    @TableField(value = "hg_video_bet")
    private BigDecimal hg_video_bet;

    /**
     * EA视讯有效总投注
     */
    @TableField(value = "ea_video_bet")
    private BigDecimal ea_video_bet;

    /**
     * BB视讯有效总投注
     */
    @TableField(value = "bb_video_bet")
    private BigDecimal bb_video_bet;

    /**
     * 优惠稽核：HG视讯打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_hg_video_status")
    private Object pre_check_hg_video_status;

    /**
     * 优惠稽核：EA视讯打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_ea_video_status")
    private Object pre_check_ea_video_status;

    /**
     * 优惠稽核：BB视讯打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_bb_video_status")
    private Object pre_check_bb_video_status;

    /**
     * HG视讯打码量
     */
    @TableField(value = "remainder_hg_real_bet")
    private String remainder_hg_real_bet;

    /**
     * EA视讯打码量
     */
    @TableField(value = "remainder_ea_real_bet")
    private String remainder_ea_real_bet;

    /**
     * BB视讯打码量
     */
    @TableField(value = "remainder_bb_real_bet")
    private String remainder_bb_real_bet;

    /**
     * -- BB体育有效总投注
     */
    @TableField(value = "bb_sport_bet")
    private BigDecimal bb_sport_bet;

    /**
     * -- 优惠稽核：BB体育打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_bb_sport_status")
    private Object pre_check_bb_sport_status;

    /**
     * -- BB体育打码量
     */
    @TableField(value = "remainder_bb_sport_bet")
    private String remainder_bb_sport_bet;

    /**
     * -- BB彩票有效总投注
     */
    @TableField(value = "bb_lottery_bet")
    private BigDecimal bb_lottery_bet;

    /**
     * -- 优惠稽核：BB彩票打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_bb_lottery_status")
    private Object pre_check_bb_lottery_status;

    /**
     * -- BB彩票打码量
     */
    @TableField(value = "remainder_bb_lottery_bet")
    private String remainder_bb_lottery_bet;

    /**
     * -- BB电子有效总投注
     */
    @TableField(value = "bb_electron_bet")
    private BigDecimal bb_electron_bet;

    /**
     * -- 优惠稽核：BB电子打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_bb_electron_status")
    private Object pre_check_bb_electron_status;

    /**
     * 	-- BB电子打码量
     */
    @TableField(value = "remainder_bb_electron_bet")
    private String remainder_bb_electron_bet;

    /**
     * BB3D大厅有效总投注
     */
    @TableField(value = "bb_3d_bet")
    private BigDecimal bb_3d_bet;

    /**
     * 优惠稽核：BB3D大厅打码量是否通过：0-不需稽核1-V2-X
     */
    @TableField(value = "pre_check_bb_3d_status")
    private Object pre_check_bb_3d_status;

    /**
     * BB3D大厅打码量
     */
    @TableField(value = "remainder_bb_3d_bet")
    private String remainder_bb_3d_bet;

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
        MnyDrawCheck other = (MnyDrawCheck) that;
        return (this.getCheck_id() == null ? other.getCheck_id() == null : this.getCheck_id().equals(other.getCheck_id()))
            && (this.getTime_start() == null ? other.getTime_start() == null : this.getTime_start().equals(other.getTime_start()))
            && (this.getTime_end() == null ? other.getTime_end() == null : this.getTime_end().equals(other.getTime_end()))
            && (this.getDeposit_money() == null ? other.getDeposit_money() == null : this.getDeposit_money().equals(other.getDeposit_money()))
            && (this.getPreferential() == null ? other.getPreferential() == null : this.getPreferential().equals(other.getPreferential()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()))
            && (this.getVideo_bet() == null ? other.getVideo_bet() == null : this.getVideo_bet().equals(other.getVideo_bet()))
            && (this.getProbability_bet() == null ? other.getProbability_bet() == null : this.getProbability_bet().equals(other.getProbability_bet()))
            && (this.getBbsport_bet() == null ? other.getBbsport_bet() == null : this.getBbsport_bet().equals(other.getBbsport_bet()))
            && (this.getLottery_bet() == null ? other.getLottery_bet() == null : this.getLottery_bet().equals(other.getLottery_bet()))
            && (this.getSport_bet() == null ? other.getSport_bet() == null : this.getSport_bet().equals(other.getSport_bet()))
            && (this.getPre_check_video_status() == null ? other.getPre_check_video_status() == null : this.getPre_check_video_status().equals(other.getPre_check_video_status()))
            && (this.getPre_check_ball_status() == null ? other.getPre_check_ball_status() == null : this.getPre_check_ball_status().equals(other.getPre_check_ball_status()))
            && (this.getPre_check_comp_status() == null ? other.getPre_check_comp_status() == null : this.getPre_check_comp_status().equals(other.getPre_check_comp_status()))
            && (this.getPre_check_status() == null ? other.getPre_check_status() == null : this.getPre_check_status().equals(other.getPre_check_status()))
            && (this.getNormal_check_relax() == null ? other.getNormal_check_relax() == null : this.getNormal_check_relax().equals(other.getNormal_check_relax()))
            && (this.getNormal_check_bet_status() == null ? other.getNormal_check_bet_status() == null : this.getNormal_check_bet_status().equals(other.getNormal_check_bet_status()))
            && (this.getNormal_check_status() == null ? other.getNormal_check_status() == null : this.getNormal_check_status().equals(other.getNormal_check_status()))
            && (this.getNormal_check_deduct_money() == null ? other.getNormal_check_deduct_money() == null : this.getNormal_check_deduct_money().equals(other.getNormal_check_deduct_money()))
            && (this.getDraw_type() == null ? other.getDraw_type() == null : this.getDraw_type().equals(other.getDraw_type()))
            && (this.getStockholder_id() == null ? other.getStockholder_id() == null : this.getStockholder_id().equals(other.getStockholder_id()))
            && (this.getPre_check_deduct_money() == null ? other.getPre_check_deduct_money() == null : this.getPre_check_deduct_money().equals(other.getPre_check_deduct_money()))
            && (this.getDraw_check_uuid() == null ? other.getDraw_check_uuid() == null : this.getDraw_check_uuid().equals(other.getDraw_check_uuid()))
            && (this.getNormal_per_check() == null ? other.getNormal_per_check() == null : this.getNormal_per_check().equals(other.getNormal_per_check()))
            && (this.getNormal_adm_per() == null ? other.getNormal_adm_per() == null : this.getNormal_adm_per().equals(other.getNormal_adm_per()))
            && (this.getPre_check_pass_status() == null ? other.getPre_check_pass_status() == null : this.getPre_check_pass_status().equals(other.getPre_check_pass_status()))
            && (this.getMy_end_time() == null ? other.getMy_end_time() == null : this.getMy_end_time().equals(other.getMy_end_time()))
            && (this.getRemainder_real_bet() == null ? other.getRemainder_real_bet() == null : this.getRemainder_real_bet().equals(other.getRemainder_real_bet()))
            && (this.getRemainder_ball_bet() == null ? other.getRemainder_ball_bet() == null : this.getRemainder_ball_bet().equals(other.getRemainder_ball_bet()))
            && (this.getRemainder_comp_bet() == null ? other.getRemainder_comp_bet() == null : this.getRemainder_comp_bet().equals(other.getRemainder_comp_bet()))
            && (this.getPre_check_lottery_status() == null ? other.getPre_check_lottery_status() == null : this.getPre_check_lottery_status().equals(other.getPre_check_lottery_status()))
            && (this.getPre_check_electron_status() == null ? other.getPre_check_electron_status() == null : this.getPre_check_electron_status().equals(other.getPre_check_electron_status()))
            && (this.getRemainder_lottery_bet() == null ? other.getRemainder_lottery_bet() == null : this.getRemainder_lottery_bet().equals(other.getRemainder_lottery_bet()))
            && (this.getRemainder_electron_bet() == null ? other.getRemainder_electron_bet() == null : this.getRemainder_electron_bet().equals(other.getRemainder_electron_bet()))
            && (this.getHg_video_bet() == null ? other.getHg_video_bet() == null : this.getHg_video_bet().equals(other.getHg_video_bet()))
            && (this.getEa_video_bet() == null ? other.getEa_video_bet() == null : this.getEa_video_bet().equals(other.getEa_video_bet()))
            && (this.getBb_video_bet() == null ? other.getBb_video_bet() == null : this.getBb_video_bet().equals(other.getBb_video_bet()))
            && (this.getPre_check_hg_video_status() == null ? other.getPre_check_hg_video_status() == null : this.getPre_check_hg_video_status().equals(other.getPre_check_hg_video_status()))
            && (this.getPre_check_ea_video_status() == null ? other.getPre_check_ea_video_status() == null : this.getPre_check_ea_video_status().equals(other.getPre_check_ea_video_status()))
            && (this.getPre_check_bb_video_status() == null ? other.getPre_check_bb_video_status() == null : this.getPre_check_bb_video_status().equals(other.getPre_check_bb_video_status()))
            && (this.getRemainder_hg_real_bet() == null ? other.getRemainder_hg_real_bet() == null : this.getRemainder_hg_real_bet().equals(other.getRemainder_hg_real_bet()))
            && (this.getRemainder_ea_real_bet() == null ? other.getRemainder_ea_real_bet() == null : this.getRemainder_ea_real_bet().equals(other.getRemainder_ea_real_bet()))
            && (this.getRemainder_bb_real_bet() == null ? other.getRemainder_bb_real_bet() == null : this.getRemainder_bb_real_bet().equals(other.getRemainder_bb_real_bet()))
            && (this.getBb_sport_bet() == null ? other.getBb_sport_bet() == null : this.getBb_sport_bet().equals(other.getBb_sport_bet()))
            && (this.getPre_check_bb_sport_status() == null ? other.getPre_check_bb_sport_status() == null : this.getPre_check_bb_sport_status().equals(other.getPre_check_bb_sport_status()))
            && (this.getRemainder_bb_sport_bet() == null ? other.getRemainder_bb_sport_bet() == null : this.getRemainder_bb_sport_bet().equals(other.getRemainder_bb_sport_bet()))
            && (this.getBb_lottery_bet() == null ? other.getBb_lottery_bet() == null : this.getBb_lottery_bet().equals(other.getBb_lottery_bet()))
            && (this.getPre_check_bb_lottery_status() == null ? other.getPre_check_bb_lottery_status() == null : this.getPre_check_bb_lottery_status().equals(other.getPre_check_bb_lottery_status()))
            && (this.getRemainder_bb_lottery_bet() == null ? other.getRemainder_bb_lottery_bet() == null : this.getRemainder_bb_lottery_bet().equals(other.getRemainder_bb_lottery_bet()))
            && (this.getBb_electron_bet() == null ? other.getBb_electron_bet() == null : this.getBb_electron_bet().equals(other.getBb_electron_bet()))
            && (this.getPre_check_bb_electron_status() == null ? other.getPre_check_bb_electron_status() == null : this.getPre_check_bb_electron_status().equals(other.getPre_check_bb_electron_status()))
            && (this.getRemainder_bb_electron_bet() == null ? other.getRemainder_bb_electron_bet() == null : this.getRemainder_bb_electron_bet().equals(other.getRemainder_bb_electron_bet()))
            && (this.getBb_3d_bet() == null ? other.getBb_3d_bet() == null : this.getBb_3d_bet().equals(other.getBb_3d_bet()))
            && (this.getPre_check_bb_3d_status() == null ? other.getPre_check_bb_3d_status() == null : this.getPre_check_bb_3d_status().equals(other.getPre_check_bb_3d_status()))
            && (this.getRemainder_bb_3d_bet() == null ? other.getRemainder_bb_3d_bet() == null : this.getRemainder_bb_3d_bet().equals(other.getRemainder_bb_3d_bet()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheck_id() == null) ? 0 : getCheck_id().hashCode());
        result = prime * result + ((getTime_start() == null) ? 0 : getTime_start().hashCode());
        result = prime * result + ((getTime_end() == null) ? 0 : getTime_end().hashCode());
        result = prime * result + ((getDeposit_money() == null) ? 0 : getDeposit_money().hashCode());
        result = prime * result + ((getPreferential() == null) ? 0 : getPreferential().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        result = prime * result + ((getVideo_bet() == null) ? 0 : getVideo_bet().hashCode());
        result = prime * result + ((getProbability_bet() == null) ? 0 : getProbability_bet().hashCode());
        result = prime * result + ((getBbsport_bet() == null) ? 0 : getBbsport_bet().hashCode());
        result = prime * result + ((getLottery_bet() == null) ? 0 : getLottery_bet().hashCode());
        result = prime * result + ((getSport_bet() == null) ? 0 : getSport_bet().hashCode());
        result = prime * result + ((getPre_check_video_status() == null) ? 0 : getPre_check_video_status().hashCode());
        result = prime * result + ((getPre_check_ball_status() == null) ? 0 : getPre_check_ball_status().hashCode());
        result = prime * result + ((getPre_check_comp_status() == null) ? 0 : getPre_check_comp_status().hashCode());
        result = prime * result + ((getPre_check_status() == null) ? 0 : getPre_check_status().hashCode());
        result = prime * result + ((getNormal_check_relax() == null) ? 0 : getNormal_check_relax().hashCode());
        result = prime * result + ((getNormal_check_bet_status() == null) ? 0 : getNormal_check_bet_status().hashCode());
        result = prime * result + ((getNormal_check_status() == null) ? 0 : getNormal_check_status().hashCode());
        result = prime * result + ((getNormal_check_deduct_money() == null) ? 0 : getNormal_check_deduct_money().hashCode());
        result = prime * result + ((getDraw_type() == null) ? 0 : getDraw_type().hashCode());
        result = prime * result + ((getStockholder_id() == null) ? 0 : getStockholder_id().hashCode());
        result = prime * result + ((getPre_check_deduct_money() == null) ? 0 : getPre_check_deduct_money().hashCode());
        result = prime * result + ((getDraw_check_uuid() == null) ? 0 : getDraw_check_uuid().hashCode());
        result = prime * result + ((getNormal_per_check() == null) ? 0 : getNormal_per_check().hashCode());
        result = prime * result + ((getNormal_adm_per() == null) ? 0 : getNormal_adm_per().hashCode());
        result = prime * result + ((getPre_check_pass_status() == null) ? 0 : getPre_check_pass_status().hashCode());
        result = prime * result + ((getMy_end_time() == null) ? 0 : getMy_end_time().hashCode());
        result = prime * result + ((getRemainder_real_bet() == null) ? 0 : getRemainder_real_bet().hashCode());
        result = prime * result + ((getRemainder_ball_bet() == null) ? 0 : getRemainder_ball_bet().hashCode());
        result = prime * result + ((getRemainder_comp_bet() == null) ? 0 : getRemainder_comp_bet().hashCode());
        result = prime * result + ((getPre_check_lottery_status() == null) ? 0 : getPre_check_lottery_status().hashCode());
        result = prime * result + ((getPre_check_electron_status() == null) ? 0 : getPre_check_electron_status().hashCode());
        result = prime * result + ((getRemainder_lottery_bet() == null) ? 0 : getRemainder_lottery_bet().hashCode());
        result = prime * result + ((getRemainder_electron_bet() == null) ? 0 : getRemainder_electron_bet().hashCode());
        result = prime * result + ((getHg_video_bet() == null) ? 0 : getHg_video_bet().hashCode());
        result = prime * result + ((getEa_video_bet() == null) ? 0 : getEa_video_bet().hashCode());
        result = prime * result + ((getBb_video_bet() == null) ? 0 : getBb_video_bet().hashCode());
        result = prime * result + ((getPre_check_hg_video_status() == null) ? 0 : getPre_check_hg_video_status().hashCode());
        result = prime * result + ((getPre_check_ea_video_status() == null) ? 0 : getPre_check_ea_video_status().hashCode());
        result = prime * result + ((getPre_check_bb_video_status() == null) ? 0 : getPre_check_bb_video_status().hashCode());
        result = prime * result + ((getRemainder_hg_real_bet() == null) ? 0 : getRemainder_hg_real_bet().hashCode());
        result = prime * result + ((getRemainder_ea_real_bet() == null) ? 0 : getRemainder_ea_real_bet().hashCode());
        result = prime * result + ((getRemainder_bb_real_bet() == null) ? 0 : getRemainder_bb_real_bet().hashCode());
        result = prime * result + ((getBb_sport_bet() == null) ? 0 : getBb_sport_bet().hashCode());
        result = prime * result + ((getPre_check_bb_sport_status() == null) ? 0 : getPre_check_bb_sport_status().hashCode());
        result = prime * result + ((getRemainder_bb_sport_bet() == null) ? 0 : getRemainder_bb_sport_bet().hashCode());
        result = prime * result + ((getBb_lottery_bet() == null) ? 0 : getBb_lottery_bet().hashCode());
        result = prime * result + ((getPre_check_bb_lottery_status() == null) ? 0 : getPre_check_bb_lottery_status().hashCode());
        result = prime * result + ((getRemainder_bb_lottery_bet() == null) ? 0 : getRemainder_bb_lottery_bet().hashCode());
        result = prime * result + ((getBb_electron_bet() == null) ? 0 : getBb_electron_bet().hashCode());
        result = prime * result + ((getPre_check_bb_electron_status() == null) ? 0 : getPre_check_bb_electron_status().hashCode());
        result = prime * result + ((getRemainder_bb_electron_bet() == null) ? 0 : getRemainder_bb_electron_bet().hashCode());
        result = prime * result + ((getBb_3d_bet() == null) ? 0 : getBb_3d_bet().hashCode());
        result = prime * result + ((getPre_check_bb_3d_status() == null) ? 0 : getPre_check_bb_3d_status().hashCode());
        result = prime * result + ((getRemainder_bb_3d_bet() == null) ? 0 : getRemainder_bb_3d_bet().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", check_id=").append(check_id);
        sb.append(", time_start=").append(time_start);
        sb.append(", time_end=").append(time_end);
        sb.append(", deposit_money=").append(deposit_money);
        sb.append(", preferential=").append(preferential);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", member_id=").append(member_id);
        sb.append(", video_bet=").append(video_bet);
        sb.append(", probability_bet=").append(probability_bet);
        sb.append(", bbsport_bet=").append(bbsport_bet);
        sb.append(", lottery_bet=").append(lottery_bet);
        sb.append(", sport_bet=").append(sport_bet);
        sb.append(", pre_check_video_status=").append(pre_check_video_status);
        sb.append(", pre_check_ball_status=").append(pre_check_ball_status);
        sb.append(", pre_check_comp_status=").append(pre_check_comp_status);
        sb.append(", pre_check_status=").append(pre_check_status);
        sb.append(", normal_check_relax=").append(normal_check_relax);
        sb.append(", normal_check_bet_status=").append(normal_check_bet_status);
        sb.append(", normal_check_status=").append(normal_check_status);
        sb.append(", normal_check_deduct_money=").append(normal_check_deduct_money);
        sb.append(", draw_type=").append(draw_type);
        sb.append(", stockholder_id=").append(stockholder_id);
        sb.append(", pre_check_deduct_money=").append(pre_check_deduct_money);
        sb.append(", draw_check_uuid=").append(draw_check_uuid);
        sb.append(", normal_per_check=").append(normal_per_check);
        sb.append(", normal_adm_per=").append(normal_adm_per);
        sb.append(", pre_check_pass_status=").append(pre_check_pass_status);
        sb.append(", my_end_time=").append(my_end_time);
        sb.append(", remainder_real_bet=").append(remainder_real_bet);
        sb.append(", remainder_ball_bet=").append(remainder_ball_bet);
        sb.append(", remainder_comp_bet=").append(remainder_comp_bet);
        sb.append(", pre_check_lottery_status=").append(pre_check_lottery_status);
        sb.append(", pre_check_electron_status=").append(pre_check_electron_status);
        sb.append(", remainder_lottery_bet=").append(remainder_lottery_bet);
        sb.append(", remainder_electron_bet=").append(remainder_electron_bet);
        sb.append(", hg_video_bet=").append(hg_video_bet);
        sb.append(", ea_video_bet=").append(ea_video_bet);
        sb.append(", bb_video_bet=").append(bb_video_bet);
        sb.append(", pre_check_hg_video_status=").append(pre_check_hg_video_status);
        sb.append(", pre_check_ea_video_status=").append(pre_check_ea_video_status);
        sb.append(", pre_check_bb_video_status=").append(pre_check_bb_video_status);
        sb.append(", remainder_hg_real_bet=").append(remainder_hg_real_bet);
        sb.append(", remainder_ea_real_bet=").append(remainder_ea_real_bet);
        sb.append(", remainder_bb_real_bet=").append(remainder_bb_real_bet);
        sb.append(", bb_sport_bet=").append(bb_sport_bet);
        sb.append(", pre_check_bb_sport_status=").append(pre_check_bb_sport_status);
        sb.append(", remainder_bb_sport_bet=").append(remainder_bb_sport_bet);
        sb.append(", bb_lottery_bet=").append(bb_lottery_bet);
        sb.append(", pre_check_bb_lottery_status=").append(pre_check_bb_lottery_status);
        sb.append(", remainder_bb_lottery_bet=").append(remainder_bb_lottery_bet);
        sb.append(", bb_electron_bet=").append(bb_electron_bet);
        sb.append(", pre_check_bb_electron_status=").append(pre_check_bb_electron_status);
        sb.append(", remainder_bb_electron_bet=").append(remainder_bb_electron_bet);
        sb.append(", bb_3d_bet=").append(bb_3d_bet);
        sb.append(", pre_check_bb_3d_status=").append(pre_check_bb_3d_status);
        sb.append(", remainder_bb_3d_bet=").append(remainder_bb_3d_bet);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}