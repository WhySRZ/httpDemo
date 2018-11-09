package test.srz.com.httpdemo.param;

/**
 *  项目描述:更新用户信息参数
 *  作者: shenrunzhou 
 *  创建时间  :2018-02-26  17:35
 */

public class upDateUserInfoParam {


    /**
     * appCodes : 1
     * cType : 1
     * callName : UPDATE_INFOBYACCOUNTCODE
     * accountCode : 97507873705203257
     * accessToken : 1e8065cd955807704d0b01fc4229b708e468551c
     * sysUserBiz : {"userName":"","accountNickname":"","userAddress":"","userIdcard":"","userGender":"","userOriginPlace":"","dataStatus":""}
     */

    private String appCodes = "1";
    private String cType    = "1";
    private String callName = "UPDATE_INFOBYACCOUNTCODE";
    private String         accountCode;
    private String         accessToken;
    private SysUserBizBean sysUserBiz;

    public String getAppCodes() { return appCodes;}

    public void setAppCodes(String appCodes) { this.appCodes = appCodes;}

    public String getCType() { return cType;}

    public void setCType(String cType) { this.cType = cType;}

    public String getCallName() { return callName;}

    public void setCallName(String callName) { this.callName = callName;}

    public String getAccountCode() { return accountCode;}

    public void setAccountCode(String accountCode) { this.accountCode = accountCode;}

    public String getAccessToken() { return accessToken;}

    public void setAccessToken(String accessToken) { this.accessToken = accessToken;}

    public SysUserBizBean getSysUserBiz() { return sysUserBiz;}

    public void setSysUserBiz(SysUserBizBean sysUserBiz) { this.sysUserBiz = sysUserBiz;}

    public static class SysUserBizBean {
        /**
         * userName :
         * accountNickname :
         * userAddress :
         * userIdcard :
         * userGender :
         * userOriginPlace :
         * dataStatus :
         */

        private String userName;
        private String accountNickname;
        private String userAddress;
        private String userIdcard;
        private String userGender;
        private String userOriginPlace;
        private String dataStatus;

        public String getUserName() { return userName;}

        public void setUserName(String userName) { this.userName = userName;}

        public String getAccountNickname() { return accountNickname;}

        public void setAccountNickname(String accountNickname) { this.accountNickname = accountNickname;}

        public String getUserAddress() { return userAddress;}

        public void setUserAddress(String userAddress) { this.userAddress = userAddress;}

        public String getUserIdcard() { return userIdcard;}

        public void setUserIdcard(String userIdcard) { this.userIdcard = userIdcard;}

        public String getUserGender() { return userGender;}

        public void setUserGender(String userGender) { this.userGender = userGender;}

        public String getUserOriginPlace() { return userOriginPlace;}

        public void setUserOriginPlace(String userOriginPlace) { this.userOriginPlace = userOriginPlace;}

        public String getDataStatus() { return dataStatus;}

        public void setDataStatus(String dataStatus) { this.dataStatus = dataStatus;}
    }
}
