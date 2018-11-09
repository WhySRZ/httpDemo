package test.srz.com.httpdemo.bean;

/**
 *  项目描述:更新用户信息Bean类
 *  作者: shenrunzhou 
 *  创建时间  :2018-02-26  17:39
 */

public class upDataUserInfoBean {


    /**
     * errorCode : null
     * errorMsg : null
     * totalCount : null
     * result : null
     * retCode : SUCCESS
     */

    private Object errorCode;
    private Object errorMsg;
    private Object totalCount;
    private Object result;
    private String retCode;

    public Object getErrorCode() { return errorCode;}

    public void setErrorCode(Object errorCode) { this.errorCode = errorCode;}

    public Object getErrorMsg() { return errorMsg;}

    public void setErrorMsg(Object errorMsg) { this.errorMsg = errorMsg;}

    public Object getTotalCount() { return totalCount;}

    public void setTotalCount(Object totalCount) { this.totalCount = totalCount;}

    public Object getResult() { return result;}

    public void setResult(Object result) { this.result = result;}

    public String getRetCode() { return retCode;}

    public void setRetCode(String retCode) { this.retCode = retCode;}
}
