package test.srz.com.httpdemo.param;

/**
 *  项目描述:获取地区列表参数
 *  作者: shenrunzhou 
 *  创建时间  :2018-02-27  16:09
 */

public class getLocationParam {

    /**
     * appCodes : 1
     * cType : 1
     * callName : SEL_REGIONLISTBYCODE
     * accountCode : 97507873705201901
     * accessToken : a3a557d3e6a5e11950b4d8868f67a9004235e7ff
     * region : {"code":"130000"}
     */

    private String appCodes = "1";
    private String cType    = "1";
    private String callName = "SEL_REGIONLISTBYCODE";
    private String     accountCode;
    private String     accessToken;
    private RegionBean region;

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

    public RegionBean getRegion() { return region;}

    public void setRegion(RegionBean region) { this.region = region;}

    public static class RegionBean {
        /**
         * code : 130000
         */

        private String code;

        public String getCode() { return code;}

        public void setCode(String code) { this.code = code;}
    }
}
