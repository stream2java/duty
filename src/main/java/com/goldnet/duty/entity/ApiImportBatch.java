package com.goldnet.duty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName api_import_batch
 */
@TableName(value ="api_import_batch")
@Data
public class ApiImportBatch implements Serializable {
    /**
     * 主键
     */
    @TableField(value = "id")
    private Object id;

    /**
     * 导入人员 
     */
    @TableField(value = "account")
    private String account;

    /**
     * 导入时间
     */
    @TableField(value = "import_date")
    private LocalDateTime import_date;

    /**
     * 导入数量
     */
    @TableField(value = "num")
    private Object num;

    /**
     * 导入状态：1 成功，0失败
     */
    @TableField(value = "status")
    private Object status;

    /**
     * 平台
     */
    @TableField(value = "platform")
    private String platform;

    /**
     * 
     */
    @TableField(value = "date")
    private LocalDateTime date;

    /**
     * 
     */
    @TableField(value = "log_type")
    private Object log_type;

    /**
     * 
     */
    @TableField(value = "station_durl")
    private String station_durl;

    /**
     * 
     */
    @TableField(value = "complete_date")
    private LocalDate complete_date;

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
        ApiImportBatch other = (ApiImportBatch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getImport_date() == null ? other.getImport_date() == null : this.getImport_date().equals(other.getImport_date()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getLog_type() == null ? other.getLog_type() == null : this.getLog_type().equals(other.getLog_type()))
            && (this.getStation_durl() == null ? other.getStation_durl() == null : this.getStation_durl().equals(other.getStation_durl()))
            && (this.getComplete_date() == null ? other.getComplete_date() == null : this.getComplete_date().equals(other.getComplete_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getImport_date() == null) ? 0 : getImport_date().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getLog_type() == null) ? 0 : getLog_type().hashCode());
        result = prime * result + ((getStation_durl() == null) ? 0 : getStation_durl().hashCode());
        result = prime * result + ((getComplete_date() == null) ? 0 : getComplete_date().hashCode());
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
        sb.append(", import_date=").append(import_date);
        sb.append(", num=").append(num);
        sb.append(", status=").append(status);
        sb.append(", platform=").append(platform);
        sb.append(", date=").append(date);
        sb.append(", log_type=").append(log_type);
        sb.append(", station_durl=").append(station_durl);
        sb.append(", complete_date=").append(complete_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}