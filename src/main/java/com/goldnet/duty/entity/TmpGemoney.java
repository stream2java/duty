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
 * @TableName tmp_gemoney
 */
@TableName(value ="tmp_gemoney")
@Data
public class TmpGemoney implements Serializable {
    /**
     * 
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 
     */
    @TableField(value = "money")
    private BigDecimal money;

    /**
     * 
     */
    @TableField(value = "init_money")
    private BigDecimal init_money;

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

    /**
     * 
     */
    @TableField(value = "account_id")
    private Object account_id;

    /**
     * 
     */
    @TableField(value = "money_type")
    private String money_type;

    /**
     * 
     */
    @TableField(value = "currency_money")
    private Object currency_money;

    /**
     * 
     */
    @TableField(value = "hg_money")
    private BigDecimal hg_money;

    /**
     * 
     */
    @TableField(value = "ea_money")
    private BigDecimal ea_money;

    /**
     * 
     */
    @TableField(value = "bb_money")
    private BigDecimal bb_money;

    /**
     * 
     */
    @TableField(value = "hg_update_time")
    private String hg_update_time;

    /**
     * 
     */
    @TableField(value = "ea_update_time")
    private String ea_update_time;

    /**
     * 
     */
    @TableField(value = "bb_update_time")
    private String bb_update_time;

    /**
     * 
     */
    @TableField(value = "ag_money")
    private BigDecimal ag_money;

    /**
     * 
     */
    @TableField(value = "ag_update_time")
    private String ag_update_time;

    /**
     * 
     */
    @TableField(value = "mg_money")
    private BigDecimal mg_money;

    /**
     * 
     */
    @TableField(value = "og_money")
    private BigDecimal og_money;

    /**
     * 
     */
    @TableField(value = "mg_update_time")
    private String mg_update_time;

    /**
     * 
     */
    @TableField(value = "og_update_time")
    private String og_update_time;

    /**
     * 
     */
    @TableField(value = "opus_money")
    private BigDecimal opus_money;

    /**
     * 
     */
    @TableField(value = "opus_update_time")
    private String opus_update_time;

    /**
     * 
     */
    @TableField(value = "ibc_money")
    private BigDecimal ibc_money;

    /**
     * 
     */
    @TableField(value = "ibc_update_time")
    private String ibc_update_time;

    /**
     * 
     */
    @TableField(value = "dios_money")
    private BigDecimal dios_money;

    /**
     * 
     */
    @TableField(value = "dios_update_time")
    private String dios_update_time;

    /**
     * 
     */
    @TableField(value = "pt_money")
    private BigDecimal pt_money;

    /**
     * 
     */
    @TableField(value = "pt_update_time")
    private String pt_update_time;

    /**
     * 
     */
    @TableField(value = "lebo_money")
    private BigDecimal lebo_money;

    /**
     * 
     */
    @TableField(value = "lebo_update_time")
    private String lebo_update_time;

    /**
     * 
     */
    @TableField(value = "ogs_money")
    private BigDecimal ogs_money;

    /**
     * 
     */
    @TableField(value = "ogs_update_time")
    private String ogs_update_time;

    /**
     * 
     */
    @TableField(value = "ab_money")
    private BigDecimal ab_money;

    /**
     * 
     */
    @TableField(value = "ab_update_time")
    private String ab_update_time;

    /**
     * 
     */
    @TableField(value = "ogg_money")
    private BigDecimal ogg_money;

    /**
     * 
     */
    @TableField(value = "ogg_update_time")
    private String ogg_update_time;

    /**
     * 
     */
    @TableField(value = "ds_money")
    private BigDecimal ds_money;

    /**
     * 
     */
    @TableField(value = "ds_update_time")
    private String ds_update_time;

    /**
     * 
     */
    @TableField(value = "mwg_money")
    private BigDecimal mwg_money;

    /**
     * 
     */
    @TableField(value = "mwg_update_time")
    private String mwg_update_time;

    /**
     * 
     */
    @TableField(value = "cp_money")
    private BigDecimal cp_money;

    /**
     * 
     */
    @TableField(value = "cp_update_time")
    private String cp_update_time;

    /**
     * 
     */
    @TableField(value = "ty_money")
    private BigDecimal ty_money;

    /**
     * 
     */
    @TableField(value = "ty_update_time")
    private String ty_update_time;

    /**
     * 
     */
    @TableField(value = "nmg_money")
    private BigDecimal nmg_money;

    /**
     * 
     */
    @TableField(value = "nmg_update_time")
    private String nmg_update_time;

    /**
     * 
     */
    @TableField(value = "cmd_money")
    private BigDecimal cmd_money;

    /**
     * 
     */
    @TableField(value = "cmd_update_time")
    private String cmd_update_time;

    /**
     * 
     */
    @TableField(value = "vg_money")
    private BigDecimal vg_money;

    /**
     * 
     */
    @TableField(value = "vg_update_time")
    private String vg_update_time;

    /**
     * 
     */
    @TableField(value = "pp_money")
    private BigDecimal pp_money;

    /**
     * 
     */
    @TableField(value = "pp_update_time")
    private String pp_update_time;

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
        TmpGemoney other = (TmpGemoney) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getInit_money() == null ? other.getInit_money() == null : this.getInit_money().equals(other.getInit_money()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_user() == null ? other.getUpdate_user() == null : this.getUpdate_user().equals(other.getUpdate_user()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getAccount_id() == null ? other.getAccount_id() == null : this.getAccount_id().equals(other.getAccount_id()))
            && (this.getMoney_type() == null ? other.getMoney_type() == null : this.getMoney_type().equals(other.getMoney_type()))
            && (this.getCurrency_money() == null ? other.getCurrency_money() == null : this.getCurrency_money().equals(other.getCurrency_money()))
            && (this.getHg_money() == null ? other.getHg_money() == null : this.getHg_money().equals(other.getHg_money()))
            && (this.getEa_money() == null ? other.getEa_money() == null : this.getEa_money().equals(other.getEa_money()))
            && (this.getBb_money() == null ? other.getBb_money() == null : this.getBb_money().equals(other.getBb_money()))
            && (this.getHg_update_time() == null ? other.getHg_update_time() == null : this.getHg_update_time().equals(other.getHg_update_time()))
            && (this.getEa_update_time() == null ? other.getEa_update_time() == null : this.getEa_update_time().equals(other.getEa_update_time()))
            && (this.getBb_update_time() == null ? other.getBb_update_time() == null : this.getBb_update_time().equals(other.getBb_update_time()))
            && (this.getAg_money() == null ? other.getAg_money() == null : this.getAg_money().equals(other.getAg_money()))
            && (this.getAg_update_time() == null ? other.getAg_update_time() == null : this.getAg_update_time().equals(other.getAg_update_time()))
            && (this.getMg_money() == null ? other.getMg_money() == null : this.getMg_money().equals(other.getMg_money()))
            && (this.getOg_money() == null ? other.getOg_money() == null : this.getOg_money().equals(other.getOg_money()))
            && (this.getMg_update_time() == null ? other.getMg_update_time() == null : this.getMg_update_time().equals(other.getMg_update_time()))
            && (this.getOg_update_time() == null ? other.getOg_update_time() == null : this.getOg_update_time().equals(other.getOg_update_time()))
            && (this.getOpus_money() == null ? other.getOpus_money() == null : this.getOpus_money().equals(other.getOpus_money()))
            && (this.getOpus_update_time() == null ? other.getOpus_update_time() == null : this.getOpus_update_time().equals(other.getOpus_update_time()))
            && (this.getIbc_money() == null ? other.getIbc_money() == null : this.getIbc_money().equals(other.getIbc_money()))
            && (this.getIbc_update_time() == null ? other.getIbc_update_time() == null : this.getIbc_update_time().equals(other.getIbc_update_time()))
            && (this.getDios_money() == null ? other.getDios_money() == null : this.getDios_money().equals(other.getDios_money()))
            && (this.getDios_update_time() == null ? other.getDios_update_time() == null : this.getDios_update_time().equals(other.getDios_update_time()))
            && (this.getPt_money() == null ? other.getPt_money() == null : this.getPt_money().equals(other.getPt_money()))
            && (this.getPt_update_time() == null ? other.getPt_update_time() == null : this.getPt_update_time().equals(other.getPt_update_time()))
            && (this.getLebo_money() == null ? other.getLebo_money() == null : this.getLebo_money().equals(other.getLebo_money()))
            && (this.getLebo_update_time() == null ? other.getLebo_update_time() == null : this.getLebo_update_time().equals(other.getLebo_update_time()))
            && (this.getOgs_money() == null ? other.getOgs_money() == null : this.getOgs_money().equals(other.getOgs_money()))
            && (this.getOgs_update_time() == null ? other.getOgs_update_time() == null : this.getOgs_update_time().equals(other.getOgs_update_time()))
            && (this.getAb_money() == null ? other.getAb_money() == null : this.getAb_money().equals(other.getAb_money()))
            && (this.getAb_update_time() == null ? other.getAb_update_time() == null : this.getAb_update_time().equals(other.getAb_update_time()))
            && (this.getOgg_money() == null ? other.getOgg_money() == null : this.getOgg_money().equals(other.getOgg_money()))
            && (this.getOgg_update_time() == null ? other.getOgg_update_time() == null : this.getOgg_update_time().equals(other.getOgg_update_time()))
            && (this.getDs_money() == null ? other.getDs_money() == null : this.getDs_money().equals(other.getDs_money()))
            && (this.getDs_update_time() == null ? other.getDs_update_time() == null : this.getDs_update_time().equals(other.getDs_update_time()))
            && (this.getMwg_money() == null ? other.getMwg_money() == null : this.getMwg_money().equals(other.getMwg_money()))
            && (this.getMwg_update_time() == null ? other.getMwg_update_time() == null : this.getMwg_update_time().equals(other.getMwg_update_time()))
            && (this.getCp_money() == null ? other.getCp_money() == null : this.getCp_money().equals(other.getCp_money()))
            && (this.getCp_update_time() == null ? other.getCp_update_time() == null : this.getCp_update_time().equals(other.getCp_update_time()))
            && (this.getTy_money() == null ? other.getTy_money() == null : this.getTy_money().equals(other.getTy_money()))
            && (this.getTy_update_time() == null ? other.getTy_update_time() == null : this.getTy_update_time().equals(other.getTy_update_time()))
            && (this.getNmg_money() == null ? other.getNmg_money() == null : this.getNmg_money().equals(other.getNmg_money()))
            && (this.getNmg_update_time() == null ? other.getNmg_update_time() == null : this.getNmg_update_time().equals(other.getNmg_update_time()))
            && (this.getCmd_money() == null ? other.getCmd_money() == null : this.getCmd_money().equals(other.getCmd_money()))
            && (this.getCmd_update_time() == null ? other.getCmd_update_time() == null : this.getCmd_update_time().equals(other.getCmd_update_time()))
            && (this.getVg_money() == null ? other.getVg_money() == null : this.getVg_money().equals(other.getVg_money()))
            && (this.getVg_update_time() == null ? other.getVg_update_time() == null : this.getVg_update_time().equals(other.getVg_update_time()))
            && (this.getPp_money() == null ? other.getPp_money() == null : this.getPp_money().equals(other.getPp_money()))
            && (this.getPp_update_time() == null ? other.getPp_update_time() == null : this.getPp_update_time().equals(other.getPp_update_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getInit_money() == null) ? 0 : getInit_money().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_user() == null) ? 0 : getUpdate_user().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getAccount_id() == null) ? 0 : getAccount_id().hashCode());
        result = prime * result + ((getMoney_type() == null) ? 0 : getMoney_type().hashCode());
        result = prime * result + ((getCurrency_money() == null) ? 0 : getCurrency_money().hashCode());
        result = prime * result + ((getHg_money() == null) ? 0 : getHg_money().hashCode());
        result = prime * result + ((getEa_money() == null) ? 0 : getEa_money().hashCode());
        result = prime * result + ((getBb_money() == null) ? 0 : getBb_money().hashCode());
        result = prime * result + ((getHg_update_time() == null) ? 0 : getHg_update_time().hashCode());
        result = prime * result + ((getEa_update_time() == null) ? 0 : getEa_update_time().hashCode());
        result = prime * result + ((getBb_update_time() == null) ? 0 : getBb_update_time().hashCode());
        result = prime * result + ((getAg_money() == null) ? 0 : getAg_money().hashCode());
        result = prime * result + ((getAg_update_time() == null) ? 0 : getAg_update_time().hashCode());
        result = prime * result + ((getMg_money() == null) ? 0 : getMg_money().hashCode());
        result = prime * result + ((getOg_money() == null) ? 0 : getOg_money().hashCode());
        result = prime * result + ((getMg_update_time() == null) ? 0 : getMg_update_time().hashCode());
        result = prime * result + ((getOg_update_time() == null) ? 0 : getOg_update_time().hashCode());
        result = prime * result + ((getOpus_money() == null) ? 0 : getOpus_money().hashCode());
        result = prime * result + ((getOpus_update_time() == null) ? 0 : getOpus_update_time().hashCode());
        result = prime * result + ((getIbc_money() == null) ? 0 : getIbc_money().hashCode());
        result = prime * result + ((getIbc_update_time() == null) ? 0 : getIbc_update_time().hashCode());
        result = prime * result + ((getDios_money() == null) ? 0 : getDios_money().hashCode());
        result = prime * result + ((getDios_update_time() == null) ? 0 : getDios_update_time().hashCode());
        result = prime * result + ((getPt_money() == null) ? 0 : getPt_money().hashCode());
        result = prime * result + ((getPt_update_time() == null) ? 0 : getPt_update_time().hashCode());
        result = prime * result + ((getLebo_money() == null) ? 0 : getLebo_money().hashCode());
        result = prime * result + ((getLebo_update_time() == null) ? 0 : getLebo_update_time().hashCode());
        result = prime * result + ((getOgs_money() == null) ? 0 : getOgs_money().hashCode());
        result = prime * result + ((getOgs_update_time() == null) ? 0 : getOgs_update_time().hashCode());
        result = prime * result + ((getAb_money() == null) ? 0 : getAb_money().hashCode());
        result = prime * result + ((getAb_update_time() == null) ? 0 : getAb_update_time().hashCode());
        result = prime * result + ((getOgg_money() == null) ? 0 : getOgg_money().hashCode());
        result = prime * result + ((getOgg_update_time() == null) ? 0 : getOgg_update_time().hashCode());
        result = prime * result + ((getDs_money() == null) ? 0 : getDs_money().hashCode());
        result = prime * result + ((getDs_update_time() == null) ? 0 : getDs_update_time().hashCode());
        result = prime * result + ((getMwg_money() == null) ? 0 : getMwg_money().hashCode());
        result = prime * result + ((getMwg_update_time() == null) ? 0 : getMwg_update_time().hashCode());
        result = prime * result + ((getCp_money() == null) ? 0 : getCp_money().hashCode());
        result = prime * result + ((getCp_update_time() == null) ? 0 : getCp_update_time().hashCode());
        result = prime * result + ((getTy_money() == null) ? 0 : getTy_money().hashCode());
        result = prime * result + ((getTy_update_time() == null) ? 0 : getTy_update_time().hashCode());
        result = prime * result + ((getNmg_money() == null) ? 0 : getNmg_money().hashCode());
        result = prime * result + ((getNmg_update_time() == null) ? 0 : getNmg_update_time().hashCode());
        result = prime * result + ((getCmd_money() == null) ? 0 : getCmd_money().hashCode());
        result = prime * result + ((getCmd_update_time() == null) ? 0 : getCmd_update_time().hashCode());
        result = prime * result + ((getVg_money() == null) ? 0 : getVg_money().hashCode());
        result = prime * result + ((getVg_update_time() == null) ? 0 : getVg_update_time().hashCode());
        result = prime * result + ((getPp_money() == null) ? 0 : getPp_money().hashCode());
        result = prime * result + ((getPp_update_time() == null) ? 0 : getPp_update_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", money=").append(money);
        sb.append(", init_money=").append(init_money);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_user=").append(update_user);
        sb.append(", update_time=").append(update_time);
        sb.append(", account_id=").append(account_id);
        sb.append(", money_type=").append(money_type);
        sb.append(", currency_money=").append(currency_money);
        sb.append(", hg_money=").append(hg_money);
        sb.append(", ea_money=").append(ea_money);
        sb.append(", bb_money=").append(bb_money);
        sb.append(", hg_update_time=").append(hg_update_time);
        sb.append(", ea_update_time=").append(ea_update_time);
        sb.append(", bb_update_time=").append(bb_update_time);
        sb.append(", ag_money=").append(ag_money);
        sb.append(", ag_update_time=").append(ag_update_time);
        sb.append(", mg_money=").append(mg_money);
        sb.append(", og_money=").append(og_money);
        sb.append(", mg_update_time=").append(mg_update_time);
        sb.append(", og_update_time=").append(og_update_time);
        sb.append(", opus_money=").append(opus_money);
        sb.append(", opus_update_time=").append(opus_update_time);
        sb.append(", ibc_money=").append(ibc_money);
        sb.append(", ibc_update_time=").append(ibc_update_time);
        sb.append(", dios_money=").append(dios_money);
        sb.append(", dios_update_time=").append(dios_update_time);
        sb.append(", pt_money=").append(pt_money);
        sb.append(", pt_update_time=").append(pt_update_time);
        sb.append(", lebo_money=").append(lebo_money);
        sb.append(", lebo_update_time=").append(lebo_update_time);
        sb.append(", ogs_money=").append(ogs_money);
        sb.append(", ogs_update_time=").append(ogs_update_time);
        sb.append(", ab_money=").append(ab_money);
        sb.append(", ab_update_time=").append(ab_update_time);
        sb.append(", ogg_money=").append(ogg_money);
        sb.append(", ogg_update_time=").append(ogg_update_time);
        sb.append(", ds_money=").append(ds_money);
        sb.append(", ds_update_time=").append(ds_update_time);
        sb.append(", mwg_money=").append(mwg_money);
        sb.append(", mwg_update_time=").append(mwg_update_time);
        sb.append(", cp_money=").append(cp_money);
        sb.append(", cp_update_time=").append(cp_update_time);
        sb.append(", ty_money=").append(ty_money);
        sb.append(", ty_update_time=").append(ty_update_time);
        sb.append(", nmg_money=").append(nmg_money);
        sb.append(", nmg_update_time=").append(nmg_update_time);
        sb.append(", cmd_money=").append(cmd_money);
        sb.append(", cmd_update_time=").append(cmd_update_time);
        sb.append(", vg_money=").append(vg_money);
        sb.append(", vg_update_time=").append(vg_update_time);
        sb.append(", pp_money=").append(pp_money);
        sb.append(", pp_update_time=").append(pp_update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}