package test.srz.com.httpdemo.param;

/**
 *  项目描述:获取用户详情
 *  作者: shenrunzhou 
 *  创建时间  :2018-02-26  11:11
 */

public class getUserInfoDetailParam {


    /**
     * appCodes : 1
     * cType : 1
     * callName : SEL_INFOBYACCOUNTCODE
     * accountCode : 97507873705203257
     * accessToken : 038c365d35c22a77d03b070e8d096222e1595025
     */

    private String appCodes = "1";
    private String cType    = "1";
    private String callName;
    private String accountCode;
    private String accessToken;

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
}
