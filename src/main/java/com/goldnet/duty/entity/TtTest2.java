package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName tt_test2
 */
@TableName(value ="tt_test2")
@Data
public class TtTest2 implements Serializable {
    /**
     * 
     */
    @TableId(value = "test_id")
    private Object test_id;

    /**
     * 
     */
    @TableField(value = "return_var")
    private String return_var;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
    @TableField(value = "num")
    private String num;

    /**
     * 
     */
    @TableField(value = "type_id")
    private String type_id;

    /**
     * 
     */
    @TableField(value = "award")
    private String award;

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
        TtTest2 other = (TtTest2) that;
        return (this.getTest_id() == null ? other.getTest_id() == null : this.getTest_id().equals(other.getTest_id()))
            && (this.getReturn_var() == null ? other.getReturn_var() == null : this.getReturn_var().equals(other.getReturn_var()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getAward() == null ? other.getAward() == null : this.getAward().equals(other.getAward()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTest_id() == null) ? 0 : getTest_id().hashCode());
        result = prime * result + ((getReturn_var() == null) ? 0 : getReturn_var().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getAward() == null) ? 0 : getAward().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", test_id=").append(test_id);
        sb.append(", return_var=").append(return_var);
        sb.append(", remark=").append(remark);
        sb.append(", num=").append(num);
        sb.append(", type_id=").append(type_id);
        sb.append(", award=").append(award);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}