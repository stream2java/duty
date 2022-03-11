package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 子站信息
 * @TableName ge_station
 */
public class GeStation implements Serializable {
    /**
     * 
     */
    private Object id;

    /**
     * 子站名称
     */
    private String name;

    /**
     * 子站网址
     */
    private String url;

    /**
     * 所属大大股东
     */
    private Object parentPartner;

    /**
     * ftp路径
     */
    private String ftp;

    /**
     * 服务器相关
     */
    private String remark;

    /**
     * 状态:0启用，1禁用
     */
    private String status;

    /**
     * 站点标题
     */
    private String keys;

    /**
     * 
     */
    private String durl;

    /**
     * ftp帐号
     */
    private String ftpname;

    /**
     * ftp密码
     */
    private String ftppwd;

    /**
     * ftp端口
     */
    private String ftppost;

    /**
     * 
     */
    private Object account0;

    /**
     * 
     */
    private Object account1;

    /**
     * 
     */
    private Object account2;

    /**
     * 
     */
    private Object account3;

    /**
     * 
     */
    private Object account4;

    /**
     * 
     */
    private Object account5;

    /**
     * 星期几
     */
    private String week;

    /**
     * 关闭时间
     */
    private String closeTime;

    /**
     * 开启时间
     */
    private String openTime;

    /**
     * 平台类型
     */
    private String platformType;

    /**
     * 浮动图状态：0-关闭1-开启
     */
    private Object floatStatus;

    /**
     * 
     */
    private Object loginValidcode;

    /**
     * 站点keywords
     */
    private String keywords;

    /**
     * 站点会员中心背景颜色
     */
    private String colorStyle;

    /**
     * Mongo服务器Id
     */
    private Object mongoServerId;

    /**
     * 统计试玩会员总数
     */
    private Object trialAccountNum;

    /**
     * 试玩会员初始金额
     */
    private BigDecimal trialAccountMoney;

    /**
     * 新皮肤文件夹
     */
    private String newDurl;

    /**
     * 是否开启宝付微信支付（0-未开启 1-开启）
     */
    private Object baofooWechatStatus;

    /**
     * 月结对账系统模板ID
     */
    private Object templateId;

    /**
     * 动静分离URL
     */
    private String staticDomain;

    /**
     * 娴嬭瘯浼氬憳鍒濆閲戦
     */
    private BigDecimal testAccountMoney;

    /**
     * 站点所属平台
     */
    private String platformName;

    /**
     * APP应用审核状态(0:未审核,1:已审核通过,2:未审核通过)
     */
    private String appStatus;

    /**
     * APP标识
     */
    private String appCode;

    /**
     * 站点标识，用于手机端皮肤和其他用处
     */
    private String stationCode;

    /**
     * ip注册限制状态;1:未开启.2:开启
     */
    private Object ipRegStatus;

    /**
     * 修改ip注册限制的时间
     */
    private Date updateIpRegTime;

    /**
     * 修改ip注册限制的次数
     */
    private Object ipRegNum;

    /**
     * APP使用域名
     */
    private String appDomain;

    /**
     * 特殊登录验证状态：0表示关闭，1表示开启
     */
    private Object specialLoginStatus;

    /**
     * 商家多通道状态，0表示未开启，1表示开启
     */
    private Object multiChannelStatus;

    /**
     * 推广会员最大层级,默认为15
     */
    private Object promotionStoreyNum;

    /**
     * 推广会员最大投注返点金额
     */
    private BigDecimal promotionBettingMaxRebate;

    /**
     * 会员损益额
     */
    private BigDecimal memberProfitLoss;

    /**
     * 是否启用原生支付 1-启用 0-不启用
     */
    private Integer enableNativePay;

    /**
     * 站点注单数据源类型  1:mongoDb  2:ElascticSearch
     */
    private Integer dataSourceType;

    /**
     * 是否开启今日报表，0：关闭，1：开启
     */
    private Integer todayReportSearch;

    /**
     * 是否推送至ES  1:是  0:否
     */
    private Integer sendToEs;

    /**
     * 同ip最多注册人数
     */
    private Object ipRegMaxNum;

    /**
     * 会员关闭时间
     */
    private String closeMbrTime;

    /**
     * 会员开启时间
     */
    private String openMbrTime;

    /**
     * 站点数据源细分项 k:细分项的code,v:es或mongoDb的code
     */
    private String dataSourceMap;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Object getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 子站名称
     */
    public String getName() {
        return name;
    }

    /**
     * 子站名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 子站网址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 子站网址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 所属大大股东
     */
    public Object getParentPartner() {
        return parentPartner;
    }

    /**
     * 所属大大股东
     */
    public void setParentPartner(Object parentPartner) {
        this.parentPartner = parentPartner;
    }

    /**
     * ftp路径
     */
    public String getFtp() {
        return ftp;
    }

    /**
     * ftp路径
     */
    public void setFtp(String ftp) {
        this.ftp = ftp;
    }

    /**
     * 服务器相关
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 服务器相关
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 状态:0启用，1禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态:0启用，1禁用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 站点标题
     */
    public String getKeys() {
        return keys;
    }

    /**
     * 站点标题
     */
    public void setKeys(String keys) {
        this.keys = keys;
    }

    /**
     * 
     */
    public String getDurl() {
        return durl;
    }

    /**
     * 
     */
    public void setDurl(String durl) {
        this.durl = durl;
    }

    /**
     * ftp帐号
     */
    public String getFtpname() {
        return ftpname;
    }

    /**
     * ftp帐号
     */
    public void setFtpname(String ftpname) {
        this.ftpname = ftpname;
    }

    /**
     * ftp密码
     */
    public String getFtppwd() {
        return ftppwd;
    }

    /**
     * ftp密码
     */
    public void setFtppwd(String ftppwd) {
        this.ftppwd = ftppwd;
    }

    /**
     * ftp端口
     */
    public String getFtppost() {
        return ftppost;
    }

    /**
     * ftp端口
     */
    public void setFtppost(String ftppost) {
        this.ftppost = ftppost;
    }

    /**
     * 
     */
    public Object getAccount0() {
        return account0;
    }

    /**
     * 
     */
    public void setAccount0(Object account0) {
        this.account0 = account0;
    }

    /**
     * 
     */
    public Object getAccount1() {
        return account1;
    }

    /**
     * 
     */
    public void setAccount1(Object account1) {
        this.account1 = account1;
    }

    /**
     * 
     */
    public Object getAccount2() {
        return account2;
    }

    /**
     * 
     */
    public void setAccount2(Object account2) {
        this.account2 = account2;
    }

    /**
     * 
     */
    public Object getAccount3() {
        return account3;
    }

    /**
     * 
     */
    public void setAccount3(Object account3) {
        this.account3 = account3;
    }

    /**
     * 
     */
    public Object getAccount4() {
        return account4;
    }

    /**
     * 
     */
    public void setAccount4(Object account4) {
        this.account4 = account4;
    }

    /**
     * 
     */
    public Object getAccount5() {
        return account5;
    }

    /**
     * 
     */
    public void setAccount5(Object account5) {
        this.account5 = account5;
    }

    /**
     * 星期几
     */
    public String getWeek() {
        return week;
    }

    /**
     * 星期几
     */
    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * 关闭时间
     */
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * 关闭时间
     */
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 开启时间
     */
    public String getOpenTime() {
        return openTime;
    }

    /**
     * 开启时间
     */
    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    /**
     * 平台类型
     */
    public String getPlatformType() {
        return platformType;
    }

    /**
     * 平台类型
     */
    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    /**
     * 浮动图状态：0-关闭1-开启
     */
    public Object getFloatStatus() {
        return floatStatus;
    }

    /**
     * 浮动图状态：0-关闭1-开启
     */
    public void setFloatStatus(Object floatStatus) {
        this.floatStatus = floatStatus;
    }

    /**
     * 
     */
    public Object getLoginValidcode() {
        return loginValidcode;
    }

    /**
     * 
     */
    public void setLoginValidcode(Object loginValidcode) {
        this.loginValidcode = loginValidcode;
    }

    /**
     * 站点keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 站点keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 站点会员中心背景颜色
     */
    public String getColorStyle() {
        return colorStyle;
    }

    /**
     * 站点会员中心背景颜色
     */
    public void setColorStyle(String colorStyle) {
        this.colorStyle = colorStyle;
    }

    /**
     * Mongo服务器Id
     */
    public Object getMongoServerId() {
        return mongoServerId;
    }

    /**
     * Mongo服务器Id
     */
    public void setMongoServerId(Object mongoServerId) {
        this.mongoServerId = mongoServerId;
    }

    /**
     * 统计试玩会员总数
     */
    public Object getTrialAccountNum() {
        return trialAccountNum;
    }

    /**
     * 统计试玩会员总数
     */
    public void setTrialAccountNum(Object trialAccountNum) {
        this.trialAccountNum = trialAccountNum;
    }

    /**
     * 试玩会员初始金额
     */
    public BigDecimal getTrialAccountMoney() {
        return trialAccountMoney;
    }

    /**
     * 试玩会员初始金额
     */
    public void setTrialAccountMoney(BigDecimal trialAccountMoney) {
        this.trialAccountMoney = trialAccountMoney;
    }

    /**
     * 新皮肤文件夹
     */
    public String getNewDurl() {
        return newDurl;
    }

    /**
     * 新皮肤文件夹
     */
    public void setNewDurl(String newDurl) {
        this.newDurl = newDurl;
    }

    /**
     * 是否开启宝付微信支付（0-未开启 1-开启）
     */
    public Object getBaofooWechatStatus() {
        return baofooWechatStatus;
    }

    /**
     * 是否开启宝付微信支付（0-未开启 1-开启）
     */
    public void setBaofooWechatStatus(Object baofooWechatStatus) {
        this.baofooWechatStatus = baofooWechatStatus;
    }

    /**
     * 月结对账系统模板ID
     */
    public Object getTemplateId() {
        return templateId;
    }

    /**
     * 月结对账系统模板ID
     */
    public void setTemplateId(Object templateId) {
        this.templateId = templateId;
    }

    /**
     * 动静分离URL
     */
    public String getStaticDomain() {
        return staticDomain;
    }

    /**
     * 动静分离URL
     */
    public void setStaticDomain(String staticDomain) {
        this.staticDomain = staticDomain;
    }

    /**
     * 娴嬭瘯浼氬憳鍒濆閲戦
     */
    public BigDecimal getTestAccountMoney() {
        return testAccountMoney;
    }

    /**
     * 娴嬭瘯浼氬憳鍒濆閲戦
     */
    public void setTestAccountMoney(BigDecimal testAccountMoney) {
        this.testAccountMoney = testAccountMoney;
    }

    /**
     * 站点所属平台
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * 站点所属平台
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * APP应用审核状态(0:未审核,1:已审核通过,2:未审核通过)
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * APP应用审核状态(0:未审核,1:已审核通过,2:未审核通过)
     */
    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    /**
     * APP标识
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * APP标识
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * 站点标识，用于手机端皮肤和其他用处
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * 站点标识，用于手机端皮肤和其他用处
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /**
     * ip注册限制状态;1:未开启.2:开启
     */
    public Object getIpRegStatus() {
        return ipRegStatus;
    }

    /**
     * ip注册限制状态;1:未开启.2:开启
     */
    public void setIpRegStatus(Object ipRegStatus) {
        this.ipRegStatus = ipRegStatus;
    }

    /**
     * 修改ip注册限制的时间
     */
    public Date getUpdateIpRegTime() {
        return updateIpRegTime;
    }

    /**
     * 修改ip注册限制的时间
     */
    public void setUpdateIpRegTime(Date updateIpRegTime) {
        this.updateIpRegTime = updateIpRegTime;
    }

    /**
     * 修改ip注册限制的次数
     */
    public Object getIpRegNum() {
        return ipRegNum;
    }

    /**
     * 修改ip注册限制的次数
     */
    public void setIpRegNum(Object ipRegNum) {
        this.ipRegNum = ipRegNum;
    }

    /**
     * APP使用域名
     */
    public String getAppDomain() {
        return appDomain;
    }

    /**
     * APP使用域名
     */
    public void setAppDomain(String appDomain) {
        this.appDomain = appDomain;
    }

    /**
     * 特殊登录验证状态：0表示关闭，1表示开启
     */
    public Object getSpecialLoginStatus() {
        return specialLoginStatus;
    }

    /**
     * 特殊登录验证状态：0表示关闭，1表示开启
     */
    public void setSpecialLoginStatus(Object specialLoginStatus) {
        this.specialLoginStatus = specialLoginStatus;
    }

    /**
     * 商家多通道状态，0表示未开启，1表示开启
     */
    public Object getMultiChannelStatus() {
        return multiChannelStatus;
    }

    /**
     * 商家多通道状态，0表示未开启，1表示开启
     */
    public void setMultiChannelStatus(Object multiChannelStatus) {
        this.multiChannelStatus = multiChannelStatus;
    }

    /**
     * 推广会员最大层级,默认为15
     */
    public Object getPromotionStoreyNum() {
        return promotionStoreyNum;
    }

    /**
     * 推广会员最大层级,默认为15
     */
    public void setPromotionStoreyNum(Object promotionStoreyNum) {
        this.promotionStoreyNum = promotionStoreyNum;
    }

    /**
     * 推广会员最大投注返点金额
     */
    public BigDecimal getPromotionBettingMaxRebate() {
        return promotionBettingMaxRebate;
    }

    /**
     * 推广会员最大投注返点金额
     */
    public void setPromotionBettingMaxRebate(BigDecimal promotionBettingMaxRebate) {
        this.promotionBettingMaxRebate = promotionBettingMaxRebate;
    }

    /**
     * 会员损益额
     */
    public BigDecimal getMemberProfitLoss() {
        return memberProfitLoss;
    }

    /**
     * 会员损益额
     */
    public void setMemberProfitLoss(BigDecimal memberProfitLoss) {
        this.memberProfitLoss = memberProfitLoss;
    }

    /**
     * 是否启用原生支付 1-启用 0-不启用
     */
    public Integer getEnableNativePay() {
        return enableNativePay;
    }

    /**
     * 是否启用原生支付 1-启用 0-不启用
     */
    public void setEnableNativePay(Integer enableNativePay) {
        this.enableNativePay = enableNativePay;
    }

    /**
     * 站点注单数据源类型  1:mongoDb  2:ElascticSearch
     */
    public Integer getDataSourceType() {
        return dataSourceType;
    }

    /**
     * 站点注单数据源类型  1:mongoDb  2:ElascticSearch
     */
    public void setDataSourceType(Integer dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    /**
     * 是否开启今日报表，0：关闭，1：开启
     */
    public Integer getTodayReportSearch() {
        return todayReportSearch;
    }

    /**
     * 是否开启今日报表，0：关闭，1：开启
     */
    public void setTodayReportSearch(Integer todayReportSearch) {
        this.todayReportSearch = todayReportSearch;
    }

    /**
     * 是否推送至ES  1:是  0:否
     */
    public Integer getSendToEs() {
        return sendToEs;
    }

    /**
     * 是否推送至ES  1:是  0:否
     */
    public void setSendToEs(Integer sendToEs) {
        this.sendToEs = sendToEs;
    }

    /**
     * 同ip最多注册人数
     */
    public Object getIpRegMaxNum() {
        return ipRegMaxNum;
    }

    /**
     * 同ip最多注册人数
     */
    public void setIpRegMaxNum(Object ipRegMaxNum) {
        this.ipRegMaxNum = ipRegMaxNum;
    }

    /**
     * 会员关闭时间
     */
    public String getCloseMbrTime() {
        return closeMbrTime;
    }

    /**
     * 会员关闭时间
     */
    public void setCloseMbrTime(String closeMbrTime) {
        this.closeMbrTime = closeMbrTime;
    }

    /**
     * 会员开启时间
     */
    public String getOpenMbrTime() {
        return openMbrTime;
    }

    /**
     * 会员开启时间
     */
    public void setOpenMbrTime(String openMbrTime) {
        this.openMbrTime = openMbrTime;
    }

    /**
     * 站点数据源细分项 k:细分项的code,v:es或mongoDb的code
     */
    public String getDataSourceMap() {
        return dataSourceMap;
    }

    /**
     * 站点数据源细分项 k:细分项的code,v:es或mongoDb的code
     */
    public void setDataSourceMap(String dataSourceMap) {
        this.dataSourceMap = dataSourceMap;
    }

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
        GeStation other = (GeStation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getParentPartner() == null ? other.getParentPartner() == null : this.getParentPartner().equals(other.getParentPartner()))
            && (this.getFtp() == null ? other.getFtp() == null : this.getFtp().equals(other.getFtp()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getKeys() == null ? other.getKeys() == null : this.getKeys().equals(other.getKeys()))
            && (this.getDurl() == null ? other.getDurl() == null : this.getDurl().equals(other.getDurl()))
            && (this.getFtpname() == null ? other.getFtpname() == null : this.getFtpname().equals(other.getFtpname()))
            && (this.getFtppwd() == null ? other.getFtppwd() == null : this.getFtppwd().equals(other.getFtppwd()))
            && (this.getFtppost() == null ? other.getFtppost() == null : this.getFtppost().equals(other.getFtppost()))
            && (this.getAccount0() == null ? other.getAccount0() == null : this.getAccount0().equals(other.getAccount0()))
            && (this.getAccount1() == null ? other.getAccount1() == null : this.getAccount1().equals(other.getAccount1()))
            && (this.getAccount2() == null ? other.getAccount2() == null : this.getAccount2().equals(other.getAccount2()))
            && (this.getAccount3() == null ? other.getAccount3() == null : this.getAccount3().equals(other.getAccount3()))
            && (this.getAccount4() == null ? other.getAccount4() == null : this.getAccount4().equals(other.getAccount4()))
            && (this.getAccount5() == null ? other.getAccount5() == null : this.getAccount5().equals(other.getAccount5()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
            && (this.getCloseTime() == null ? other.getCloseTime() == null : this.getCloseTime().equals(other.getCloseTime()))
            && (this.getOpenTime() == null ? other.getOpenTime() == null : this.getOpenTime().equals(other.getOpenTime()))
            && (this.getPlatformType() == null ? other.getPlatformType() == null : this.getPlatformType().equals(other.getPlatformType()))
            && (this.getFloatStatus() == null ? other.getFloatStatus() == null : this.getFloatStatus().equals(other.getFloatStatus()))
            && (this.getLoginValidcode() == null ? other.getLoginValidcode() == null : this.getLoginValidcode().equals(other.getLoginValidcode()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getColorStyle() == null ? other.getColorStyle() == null : this.getColorStyle().equals(other.getColorStyle()))
            && (this.getMongoServerId() == null ? other.getMongoServerId() == null : this.getMongoServerId().equals(other.getMongoServerId()))
            && (this.getTrialAccountNum() == null ? other.getTrialAccountNum() == null : this.getTrialAccountNum().equals(other.getTrialAccountNum()))
            && (this.getTrialAccountMoney() == null ? other.getTrialAccountMoney() == null : this.getTrialAccountMoney().equals(other.getTrialAccountMoney()))
            && (this.getNewDurl() == null ? other.getNewDurl() == null : this.getNewDurl().equals(other.getNewDurl()))
            && (this.getBaofooWechatStatus() == null ? other.getBaofooWechatStatus() == null : this.getBaofooWechatStatus().equals(other.getBaofooWechatStatus()))
            && (this.getTemplateId() == null ? other.getTemplateId() == null : this.getTemplateId().equals(other.getTemplateId()))
            && (this.getStaticDomain() == null ? other.getStaticDomain() == null : this.getStaticDomain().equals(other.getStaticDomain()))
            && (this.getTestAccountMoney() == null ? other.getTestAccountMoney() == null : this.getTestAccountMoney().equals(other.getTestAccountMoney()))
            && (this.getPlatformName() == null ? other.getPlatformName() == null : this.getPlatformName().equals(other.getPlatformName()))
            && (this.getAppStatus() == null ? other.getAppStatus() == null : this.getAppStatus().equals(other.getAppStatus()))
            && (this.getAppCode() == null ? other.getAppCode() == null : this.getAppCode().equals(other.getAppCode()))
            && (this.getStationCode() == null ? other.getStationCode() == null : this.getStationCode().equals(other.getStationCode()))
            && (this.getIpRegStatus() == null ? other.getIpRegStatus() == null : this.getIpRegStatus().equals(other.getIpRegStatus()))
            && (this.getUpdateIpRegTime() == null ? other.getUpdateIpRegTime() == null : this.getUpdateIpRegTime().equals(other.getUpdateIpRegTime()))
            && (this.getIpRegNum() == null ? other.getIpRegNum() == null : this.getIpRegNum().equals(other.getIpRegNum()))
            && (this.getAppDomain() == null ? other.getAppDomain() == null : this.getAppDomain().equals(other.getAppDomain()))
            && (this.getSpecialLoginStatus() == null ? other.getSpecialLoginStatus() == null : this.getSpecialLoginStatus().equals(other.getSpecialLoginStatus()))
            && (this.getMultiChannelStatus() == null ? other.getMultiChannelStatus() == null : this.getMultiChannelStatus().equals(other.getMultiChannelStatus()))
            && (this.getPromotionStoreyNum() == null ? other.getPromotionStoreyNum() == null : this.getPromotionStoreyNum().equals(other.getPromotionStoreyNum()))
            && (this.getPromotionBettingMaxRebate() == null ? other.getPromotionBettingMaxRebate() == null : this.getPromotionBettingMaxRebate().equals(other.getPromotionBettingMaxRebate()))
            && (this.getMemberProfitLoss() == null ? other.getMemberProfitLoss() == null : this.getMemberProfitLoss().equals(other.getMemberProfitLoss()))
            && (this.getEnableNativePay() == null ? other.getEnableNativePay() == null : this.getEnableNativePay().equals(other.getEnableNativePay()))
            && (this.getDataSourceType() == null ? other.getDataSourceType() == null : this.getDataSourceType().equals(other.getDataSourceType()))
            && (this.getTodayReportSearch() == null ? other.getTodayReportSearch() == null : this.getTodayReportSearch().equals(other.getTodayReportSearch()))
            && (this.getSendToEs() == null ? other.getSendToEs() == null : this.getSendToEs().equals(other.getSendToEs()))
            && (this.getIpRegMaxNum() == null ? other.getIpRegMaxNum() == null : this.getIpRegMaxNum().equals(other.getIpRegMaxNum()))
            && (this.getCloseMbrTime() == null ? other.getCloseMbrTime() == null : this.getCloseMbrTime().equals(other.getCloseMbrTime()))
            && (this.getOpenMbrTime() == null ? other.getOpenMbrTime() == null : this.getOpenMbrTime().equals(other.getOpenMbrTime()))
            && (this.getDataSourceMap() == null ? other.getDataSourceMap() == null : this.getDataSourceMap().equals(other.getDataSourceMap()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getParentPartner() == null) ? 0 : getParentPartner().hashCode());
        result = prime * result + ((getFtp() == null) ? 0 : getFtp().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getKeys() == null) ? 0 : getKeys().hashCode());
        result = prime * result + ((getDurl() == null) ? 0 : getDurl().hashCode());
        result = prime * result + ((getFtpname() == null) ? 0 : getFtpname().hashCode());
        result = prime * result + ((getFtppwd() == null) ? 0 : getFtppwd().hashCode());
        result = prime * result + ((getFtppost() == null) ? 0 : getFtppost().hashCode());
        result = prime * result + ((getAccount0() == null) ? 0 : getAccount0().hashCode());
        result = prime * result + ((getAccount1() == null) ? 0 : getAccount1().hashCode());
        result = prime * result + ((getAccount2() == null) ? 0 : getAccount2().hashCode());
        result = prime * result + ((getAccount3() == null) ? 0 : getAccount3().hashCode());
        result = prime * result + ((getAccount4() == null) ? 0 : getAccount4().hashCode());
        result = prime * result + ((getAccount5() == null) ? 0 : getAccount5().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getCloseTime() == null) ? 0 : getCloseTime().hashCode());
        result = prime * result + ((getOpenTime() == null) ? 0 : getOpenTime().hashCode());
        result = prime * result + ((getPlatformType() == null) ? 0 : getPlatformType().hashCode());
        result = prime * result + ((getFloatStatus() == null) ? 0 : getFloatStatus().hashCode());
        result = prime * result + ((getLoginValidcode() == null) ? 0 : getLoginValidcode().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getColorStyle() == null) ? 0 : getColorStyle().hashCode());
        result = prime * result + ((getMongoServerId() == null) ? 0 : getMongoServerId().hashCode());
        result = prime * result + ((getTrialAccountNum() == null) ? 0 : getTrialAccountNum().hashCode());
        result = prime * result + ((getTrialAccountMoney() == null) ? 0 : getTrialAccountMoney().hashCode());
        result = prime * result + ((getNewDurl() == null) ? 0 : getNewDurl().hashCode());
        result = prime * result + ((getBaofooWechatStatus() == null) ? 0 : getBaofooWechatStatus().hashCode());
        result = prime * result + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        result = prime * result + ((getStaticDomain() == null) ? 0 : getStaticDomain().hashCode());
        result = prime * result + ((getTestAccountMoney() == null) ? 0 : getTestAccountMoney().hashCode());
        result = prime * result + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        result = prime * result + ((getAppStatus() == null) ? 0 : getAppStatus().hashCode());
        result = prime * result + ((getAppCode() == null) ? 0 : getAppCode().hashCode());
        result = prime * result + ((getStationCode() == null) ? 0 : getStationCode().hashCode());
        result = prime * result + ((getIpRegStatus() == null) ? 0 : getIpRegStatus().hashCode());
        result = prime * result + ((getUpdateIpRegTime() == null) ? 0 : getUpdateIpRegTime().hashCode());
        result = prime * result + ((getIpRegNum() == null) ? 0 : getIpRegNum().hashCode());
        result = prime * result + ((getAppDomain() == null) ? 0 : getAppDomain().hashCode());
        result = prime * result + ((getSpecialLoginStatus() == null) ? 0 : getSpecialLoginStatus().hashCode());
        result = prime * result + ((getMultiChannelStatus() == null) ? 0 : getMultiChannelStatus().hashCode());
        result = prime * result + ((getPromotionStoreyNum() == null) ? 0 : getPromotionStoreyNum().hashCode());
        result = prime * result + ((getPromotionBettingMaxRebate() == null) ? 0 : getPromotionBettingMaxRebate().hashCode());
        result = prime * result + ((getMemberProfitLoss() == null) ? 0 : getMemberProfitLoss().hashCode());
        result = prime * result + ((getEnableNativePay() == null) ? 0 : getEnableNativePay().hashCode());
        result = prime * result + ((getDataSourceType() == null) ? 0 : getDataSourceType().hashCode());
        result = prime * result + ((getTodayReportSearch() == null) ? 0 : getTodayReportSearch().hashCode());
        result = prime * result + ((getSendToEs() == null) ? 0 : getSendToEs().hashCode());
        result = prime * result + ((getIpRegMaxNum() == null) ? 0 : getIpRegMaxNum().hashCode());
        result = prime * result + ((getCloseMbrTime() == null) ? 0 : getCloseMbrTime().hashCode());
        result = prime * result + ((getOpenMbrTime() == null) ? 0 : getOpenMbrTime().hashCode());
        result = prime * result + ((getDataSourceMap() == null) ? 0 : getDataSourceMap().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", parentPartner=").append(parentPartner);
        sb.append(", ftp=").append(ftp);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", keys=").append(keys);
        sb.append(", durl=").append(durl);
        sb.append(", ftpname=").append(ftpname);
        sb.append(", ftppwd=").append(ftppwd);
        sb.append(", ftppost=").append(ftppost);
        sb.append(", account0=").append(account0);
        sb.append(", account1=").append(account1);
        sb.append(", account2=").append(account2);
        sb.append(", account3=").append(account3);
        sb.append(", account4=").append(account4);
        sb.append(", account5=").append(account5);
        sb.append(", week=").append(week);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", openTime=").append(openTime);
        sb.append(", platformType=").append(platformType);
        sb.append(", floatStatus=").append(floatStatus);
        sb.append(", loginValidcode=").append(loginValidcode);
        sb.append(", keywords=").append(keywords);
        sb.append(", colorStyle=").append(colorStyle);
        sb.append(", mongoServerId=").append(mongoServerId);
        sb.append(", trialAccountNum=").append(trialAccountNum);
        sb.append(", trialAccountMoney=").append(trialAccountMoney);
        sb.append(", newDurl=").append(newDurl);
        sb.append(", baofooWechatStatus=").append(baofooWechatStatus);
        sb.append(", templateId=").append(templateId);
        sb.append(", staticDomain=").append(staticDomain);
        sb.append(", testAccountMoney=").append(testAccountMoney);
        sb.append(", platformName=").append(platformName);
        sb.append(", appStatus=").append(appStatus);
        sb.append(", appCode=").append(appCode);
        sb.append(", stationCode=").append(stationCode);
        sb.append(", ipRegStatus=").append(ipRegStatus);
        sb.append(", updateIpRegTime=").append(updateIpRegTime);
        sb.append(", ipRegNum=").append(ipRegNum);
        sb.append(", appDomain=").append(appDomain);
        sb.append(", specialLoginStatus=").append(specialLoginStatus);
        sb.append(", multiChannelStatus=").append(multiChannelStatus);
        sb.append(", promotionStoreyNum=").append(promotionStoreyNum);
        sb.append(", promotionBettingMaxRebate=").append(promotionBettingMaxRebate);
        sb.append(", memberProfitLoss=").append(memberProfitLoss);
        sb.append(", enableNativePay=").append(enableNativePay);
        sb.append(", dataSourceType=").append(dataSourceType);
        sb.append(", todayReportSearch=").append(todayReportSearch);
        sb.append(", sendToEs=").append(sendToEs);
        sb.append(", ipRegMaxNum=").append(ipRegMaxNum);
        sb.append(", closeMbrTime=").append(closeMbrTime);
        sb.append(", openMbrTime=").append(openMbrTime);
        sb.append(", dataSourceMap=").append(dataSourceMap);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}