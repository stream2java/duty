package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 问题表
 * @TableName ge_question
 */
@TableName(value ="ge_question")
@Data
public class GeQuestion implements Serializable {
    /**
     * 
     */
    @TableId(value = "question_id")
    private Object question_id;

    /**
     * 
     */
    @TableField(value = "question_name")
    private String question_name;

    /**
     * 问题编码
     */
    @TableField(value = "code")
    private String code;

    /**
     * 验证规则 1精确 2区间
     */
    @TableField(value = "verify_rule")
    private Object verify_rule;

    /**
     * 误差范围
     */
    @TableField(value = "error_range")
    private Object error_range;

    /**
     * 单位
     */
    @TableField(value = "unit")
    private String unit;

    /**
     * 排序值
     */
    @TableField(value = "sort")
    private Object sort;

    /**
     * 是否呈现 0不呈现 1呈现
     */
    @TableField(value = "display")
    private Object display;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 输入类型
     */
    @TableField(value = "input_type")
    private String input_type;

    /**
     * 最小长度
     */
    @TableField(value = "min_length")
    private Object min_length;

    /**
     * 最大长度
     */
    @TableField(value = "max_length")
    private Object max_length;

    /**
     * 最小值
     */
    @TableField(value = "min_val")
    private Object min_val;

    /**
     * 最大值
     */
    @TableField(value = "max_val")
    private Object max_val;

    /**
     * 问题图标
     */
    @TableField(value = "icon")
    private String icon;

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
        GeQuestion other = (GeQuestion) that;
        return (this.getQuestion_id() == null ? other.getQuestion_id() == null : this.getQuestion_id().equals(other.getQuestion_id()))
            && (this.getQuestion_name() == null ? other.getQuestion_name() == null : this.getQuestion_name().equals(other.getQuestion_name()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getVerify_rule() == null ? other.getVerify_rule() == null : this.getVerify_rule().equals(other.getVerify_rule()))
            && (this.getError_range() == null ? other.getError_range() == null : this.getError_range().equals(other.getError_range()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getDisplay() == null ? other.getDisplay() == null : this.getDisplay().equals(other.getDisplay()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getInput_type() == null ? other.getInput_type() == null : this.getInput_type().equals(other.getInput_type()))
            && (this.getMin_length() == null ? other.getMin_length() == null : this.getMin_length().equals(other.getMin_length()))
            && (this.getMax_length() == null ? other.getMax_length() == null : this.getMax_length().equals(other.getMax_length()))
            && (this.getMin_val() == null ? other.getMin_val() == null : this.getMin_val().equals(other.getMin_val()))
            && (this.getMax_val() == null ? other.getMax_val() == null : this.getMax_val().equals(other.getMax_val()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestion_id() == null) ? 0 : getQuestion_id().hashCode());
        result = prime * result + ((getQuestion_name() == null) ? 0 : getQuestion_name().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getVerify_rule() == null) ? 0 : getVerify_rule().hashCode());
        result = prime * result + ((getError_range() == null) ? 0 : getError_range().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getDisplay() == null) ? 0 : getDisplay().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getInput_type() == null) ? 0 : getInput_type().hashCode());
        result = prime * result + ((getMin_length() == null) ? 0 : getMin_length().hashCode());
        result = prime * result + ((getMax_length() == null) ? 0 : getMax_length().hashCode());
        result = prime * result + ((getMin_val() == null) ? 0 : getMin_val().hashCode());
        result = prime * result + ((getMax_val() == null) ? 0 : getMax_val().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", question_id=").append(question_id);
        sb.append(", question_name=").append(question_name);
        sb.append(", code=").append(code);
        sb.append(", verify_rule=").append(verify_rule);
        sb.append(", error_range=").append(error_range);
        sb.append(", unit=").append(unit);
        sb.append(", sort=").append(sort);
        sb.append(", display=").append(display);
        sb.append(", remark=").append(remark);
        sb.append(", input_type=").append(input_type);
        sb.append(", min_length=").append(min_length);
        sb.append(", max_length=").append(max_length);
        sb.append(", min_val=").append(min_val);
        sb.append(", max_val=").append(max_val);
        sb.append(", icon=").append(icon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}