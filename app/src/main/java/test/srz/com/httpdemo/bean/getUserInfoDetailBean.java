package test.srz.com.httpdemo.bean;

import java.io.Serializable;

/**
 *  项目描述:获取用户详情bean类
 *  作者: shenrunzhou 
 *  创建时间  :2018-02-26  11:20
 */

public class getUserInfoDetailBean implements Serializable {


    /**
     * errorCode : null
     * errorMsg : null
     * totalCount : null
     * result : {"userAddress":null,"code":"97507873705203257","userOriginPlace":"北京北京市东城区","userMobile":"18070505103","accountNickname":"USER-97507873705203257","accountavatar":"","userGender":"男","userIdcard":null,"userName":"18070505103","userCode":"97507873705203258","authenticationStatus":""}
     * retCode : SUCCESS
     */

    private Object     errorCode;
    private Object     errorMsg;
    private Object     totalCount;
    private ResultBean result;
    private String     retCode;

    public Object getErrorCode() { return errorCode;}

    public void setErrorCode(Object errorCode) { this.errorCode = errorCode;}

    public Object getErrorMsg() { return errorMsg;}

    public void setErrorMsg(Object errorMsg) { this.errorMsg = errorMsg;}

    public Object getTotalCount() { return totalCount;}

    public void setTotalCount(Object totalCount) { this.totalCount = totalCount;}

    public ResultBean getResult() { return result;}

    public void setResult(ResultBean result) { this.result = result;}

    public String getRetCode() { return retCode;}

    public void setRetCode(String retCode) { this.retCode = retCode;}

    public static class ResultBean implements Serializable {
        /**
         * userAddress : null
         * code : 97507873705203257
         * userOriginPlace : 北京北京市东城区
         * userMobile : 18070505103
         * accountNickname : USER-97507873705203257
         * accountavatar :
         * userGender : 男
         * userIdcard : null
         * userName : 18070505103
         * userCode : 97507873705203258
         * authenticationStatus :
         */

        private String userAddress;
        private String code;
        private String userOriginPlace;
        private String userMobile;
        private String accountNickname;
        private String accountavatar;
        private String userGender;
        private String userIdcard;
        private String userName;
        private String userCode;
        private String authenticationStatus;

        public String getUserAddress() { return userAddress;}

        public void setUserAddress(String userAddress) { this.userAddress = userAddress;}

        public String getCode() { return code;}

        public void setCode(String code) { this.code = code;}

        public String getUserOriginPlace() { return userOriginPlace;}

        public void setUserOriginPlace(String userOriginPlace) { this.userOriginPlace = userOriginPlace;}

        public String getUserMobile() { return userMobile;}

        public void setUserMobile(String userMobile) { this.userMobile = userMobile;}

        public String getAccountNickname() { return accountNickname;}

        public void setAccountNickname(String accountNickname) { this.accountNickname = accountNickname;}

        public String getAccountavatar() { return accountavatar;}

        public void setAccountavatar(String accountavatar) { this.accountavatar = accountavatar;}

        public String getUserGender() { return userGender;}

        public void setUserGender(String userGender) { this.userGender = userGender;}

        public String getUserIdcard() { return userIdcard;}

        public void setUserIdcard(String userIdcard) { this.userIdcard = userIdcard;}

        public String getUserName() { return userName;}

        public void setUserName(String userName) { this.userName = userName;}

        public String getUserCode() { return userCode;}

        public void setUserCode(String userCode) { this.userCode = userCode;}

        public String getAuthenticationStatus() { return authenticationStatus;}

        public void setAuthenticationStatus(String authenticationStatus) { this.authenticationStatus = authenticationStatus;}
    }
}
