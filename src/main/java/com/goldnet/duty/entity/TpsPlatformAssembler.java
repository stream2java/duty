package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName tps_platform_assembler
 */
@TableName(value ="tps_platform_assembler")
@Data
public class TpsPlatformAssembler implements Serializable {
    /**
     * 
     */
    @TableId(value = "id")
    private Object id;

    /**
     * 平台编码
     */
    @TableField(value = "platform_code")
    private String platform_code;

    /**
     * 平台编码名称(如:NMG对应name为新MG)
     */
    @TableField(value = "code_name")
    private String code_name;

    /**
     * 与tps_type 中的ID相关联
     */
    @TableField(value = "type_id")
    private Object type_id;

    /**
     * 别名
     */
    @TableField(value = "alias")
    private String alias;

    /**
     * 排序字段
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 组ID-生成不同的jsp页面时,由于很多情况下不同的jsp会对应后台不同的VO于是by_name需要做不同的配置。2.相同的平台，VO也相同,但可能排序也不一定会相同也需要通过分组做区分。
0-返水优惠设定
1-新线上付款设定
2-新线上付款设定-新增,新线上付款设定-修改
3-代理佣金设定,退佣统计,退佣查询
4-优惠统计
5-优惠查询
     */
    @TableField(value = "group_id")
    private Object group_id;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDate create_time;

    /**
     * 备注,预留字段
     */
    @TableField(value = "remark")
    private String remark;

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
        TpsPlatformAssembler other = (TpsPlatformAssembler) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlatform_code() == null ? other.getPlatform_code() == null : this.getPlatform_code().equals(other.getPlatform_code()))
            && (this.getCode_name() == null ? other.getCode_name() == null : this.getCode_name().equals(other.getCode_name()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getGroup_id() == null ? other.getGroup_id() == null : this.getGroup_id().equals(other.getGroup_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlatform_code() == null) ? 0 : getPlatform_code().hashCode());
        result = prime * result + ((getCode_name() == null) ? 0 : getCode_name().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getGroup_id() == null) ? 0 : getGroup_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platform_code=").append(platform_code);
        sb.append(", code_name=").append(code_name);
        sb.append(", type_id=").append(type_id);
        sb.append(", alias=").append(alias);
        sb.append(", sort=").append(sort);
        sb.append(", group_id=").append(group_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}