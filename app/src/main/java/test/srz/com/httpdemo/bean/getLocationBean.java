package test.srz.com.httpdemo.bean;

import java.util.List;

/**
 *  项目描述:获取地区列表bean类
 *  作者: shenrunzhou 
 *  创建时间  :2018-02-27  16:10
 */

public class getLocationBean {


    /**
     * errorCode : null
     * errorMsg : null
     * totalCount : null
     * result : [{"id":"97188592","code":"110000","pcode":"100000","pcodePath":"100000;110000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,北京","regionName":"北京","regionShortname":"北京","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Beijing","regionPinyinFirstchar":"B","regionLng":"116.405285","regionLat":"39.904989","regionSort":11,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97188610","code":"120000","pcode":"100000","pcodePath":"100000;120000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,天津","regionName":"天津","regionShortname":"天津","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Tianjin","regionPinyinFirstchar":"T","regionLng":"117.190182","regionLat":"39.125596","regionSort":29,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97188628","code":"130000","pcode":"100000","pcodePath":"100000;130000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,河北省","regionName":"河北省","regionShortname":"河北","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Hebei","regionPinyinFirstchar":"H","regionLng":"114.502461","regionLat":"38.045474","regionSort":47,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97188811","code":"140000","pcode":"100000","pcodePath":"100000;140000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,山西省","regionName":"山西省","regionShortname":"山西","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Shanxi","regionPinyinFirstchar":"S","regionLng":"112.549248","regionLat":"37.857014","regionSort":230,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97188942","code":"150000","pcode":"100000","pcodePath":"100000;150000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,内蒙古自治区","regionName":"内蒙古自治区","regionShortname":"内蒙古","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Inner Mongolia","regionPinyinFirstchar":"I","regionLng":"111.670801","regionLat":"40.818311","regionSort":361,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189057","code":"210000","pcode":"100000","pcodePath":"100000;210000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,辽宁省","regionName":"辽宁省","regionShortname":"辽宁","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Liaoning","regionPinyinFirstchar":"L","regionLng":"123.429096","regionLat":"41.796767","regionSort":476,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189176","code":"220000","pcode":"100000","pcodePath":"100000;220000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,吉林省","regionName":"吉林省","regionShortname":"吉林","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Jilin","regionPinyinFirstchar":"J","regionLng":"125.3245","regionLat":"43.886841","regionSort":595,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189246","code":"230000","pcode":"100000","pcodePath":"100000;230000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,黑龙江省","regionName":"黑龙江省","regionShortname":"黑龙江","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Heilongjiang","regionPinyinFirstchar":"H","regionLng":"126.642464","regionLat":"45.756967","regionSort":665,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189392","code":"310000","pcode":"100000","pcodePath":"100000;310000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,上海","regionName":"上海","regionShortname":"上海","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Shanghai","regionPinyinFirstchar":"S","regionLng":"121.472644","regionLat":"31.231706","regionSort":811,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189411","code":"320000","pcode":"100000","pcodePath":"100000;320000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,江苏省","regionName":"江苏省","regionShortname":"江苏","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Jiangsu","regionPinyinFirstchar":"J","regionLng":"118.767413","regionLat":"32.041544","regionSort":830,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189524","code":"330000","pcode":"100000","pcodePath":"100000;330000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,浙江省","regionName":"浙江省","regionShortname":"浙江","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Zhejiang","regionPinyinFirstchar":"Z","regionLng":"120.153576","regionLat":"30.287459","regionSort":943,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189637","code":"340000","pcode":"100000","pcodePath":"100000;340000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,安徽省","regionName":"安徽省","regionShortname":"安徽","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Anhui","regionPinyinFirstchar":"A","regionLng":"117.283042","regionLat":"31.86119","regionSort":1056,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189759","code":"350000","pcode":"100000","pcodePath":"100000;350000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,福建省","regionName":"福建省","regionShortname":"福建","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Fujian","regionPinyinFirstchar":"F","regionLng":"119.306239","regionLat":"26.075302","regionSort":1178,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189854","code":"360000","pcode":"100000","pcodePath":"100000;360000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,江西省","regionName":"江西省","regionShortname":"江西","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Jiangxi","regionPinyinFirstchar":"J","regionLng":"115.892151","regionLat":"28.676493","regionSort":1273,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97189966","code":"370000","pcode":"100000","pcodePath":"100000;370000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,山东省","regionName":"山东省","regionShortname":"山东","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Shandong","regionPinyinFirstchar":"S","regionLng":"117.000923","regionLat":"36.675807","regionSort":1385,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97190123","code":"410000","pcode":"100000","pcodePath":"100000;410000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,河南省","regionName":"河南省","regionShortname":"河南","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Henan","regionPinyinFirstchar":"H","regionLng":"113.665412","regionLat":"34.757975","regionSort":1542,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97190300","code":"420000","pcode":"100000","pcodePath":"100000;420000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,湖北省","regionName":"湖北省","regionShortname":"湖北","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Hubei","regionPinyinFirstchar":"H","regionLng":"114.298572","regionLat":"30.584355","regionSort":1719,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97190418","code":"430000","pcode":"100000","pcodePath":"100000;430000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,湖南省","regionName":"湖南省","regionShortname":"湖南","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Hunan","regionPinyinFirstchar":"H","regionLng":"112.982279","regionLat":"28.19409","regionSort":1837,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97190555","code":"440000","pcode":"100000","pcodePath":"100000;440000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,广东省","regionName":"广东省","regionShortname":"广东","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Guangdong","regionPinyinFirstchar":"G","regionLng":"113.280637","regionLat":"23.125178","regionSort":1974,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97190753","code":"450000","pcode":"100000","pcodePath":"100000;450000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,广西壮族自治区","regionName":"广西壮族自治区","regionShortname":"广西","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Guangxi","regionPinyinFirstchar":"G","regionLng":"108.320004","regionLat":"22.82402","regionSort":2172,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97190882","code":"460000","pcode":"100000","pcodePath":"100000;460000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,海南省","regionName":"海南省","regionShortname":"海南","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Hainan","regionPinyinFirstchar":"H","regionLng":"110.33119","regionLat":"20.031971","regionSort":2301,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97190914","code":"500000","pcode":"100000","pcodePath":"100000;500000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,重庆","regionName":"重庆","regionShortname":"重庆","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Chongqing","regionPinyinFirstchar":"C","regionLng":"106.504962","regionLat":"29.533155","regionSort":2333,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97190958","code":"510000","pcode":"100000","pcodePath":"100000;510000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,四川省","regionName":"四川省","regionShortname":"四川","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Sichuan","regionPinyinFirstchar":"S","regionLng":"104.065735","regionLat":"30.659462","regionSort":2377,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191163","code":"520000","pcode":"100000","pcodePath":"100000;520000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,贵州省","regionName":"贵州省","regionShortname":"贵州","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Guizhou","regionPinyinFirstchar":"G","regionLng":"106.713478","regionLat":"26.578343","regionSort":2582,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191261","code":"530000","pcode":"100000","pcodePath":"100000;530000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,云南省","regionName":"云南省","regionShortname":"云南","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Yunnan","regionPinyinFirstchar":"Y","regionLng":"102.712251","regionLat":"25.040609","regionSort":2680,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191407","code":"540000","pcode":"100000","pcodePath":"100000;540000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,西藏自治区","regionName":"西藏自治区","regionShortname":"西藏","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Tibet","regionPinyinFirstchar":"T","regionLng":"91.132212","regionLat":"29.660361","regionSort":2826,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191489","code":"610000","pcode":"100000","pcodePath":"100000;610000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,陕西省","regionName":"陕西省","regionShortname":"陕西","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Shaanxi","regionPinyinFirstchar":"S","regionLng":"108.948024","regionLat":"34.263161","regionSort":2908,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191613","code":"620000","pcode":"100000","pcodePath":"100000;620000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,甘肃省","regionName":"甘肃省","regionShortname":"甘肃","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Gansu","regionPinyinFirstchar":"G","regionLng":"103.823557","regionLat":"36.058039","regionSort":3032,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191717","code":"630000","pcode":"100000","pcodePath":"100000;630000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,青海省","regionName":"青海省","regionShortname":"青海","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Qinghai","regionPinyinFirstchar":"Q","regionLng":"101.778916","regionLat":"36.623178","regionSort":3136,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191769","code":"640000","pcode":"100000","pcodePath":"100000;640000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,宁夏回族自治区","regionName":"宁夏回族自治区","regionShortname":"宁夏","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Ningxia","regionPinyinFirstchar":"N","regionLng":"106.278179","regionLat":"38.46637","regionSort":3188,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191797","code":"650000","pcode":"100000","pcodePath":"100000;650000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,新疆维吾尔自治区","regionName":"新疆维吾尔自治区","regionShortname":"新疆","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Xinjiang","regionPinyinFirstchar":"X","regionLng":"87.617733","regionLat":"43.792818","regionSort":3216,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97191916","code":"710000","pcode":"100000","pcodePath":"100000;710000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,台湾","regionName":"台湾","regionShortname":"台湾","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Taiwan","regionPinyinFirstchar":"T","regionLng":"121.509062","regionLat":"25.044332","regionSort":3335,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97192307","code":"810000","pcode":"100000","pcodePath":"100000;810000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,香港特别行政区","regionName":"香港特别行政区","regionShortname":"香港","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Hong Kong","regionPinyinFirstchar":"H","regionLng":"114.173355","regionLat":"22.320048","regionSort":3726,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97192329","code":"820000","pcode":"100000","pcodePath":"100000;820000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,澳门特别行政区","regionName":"澳门特别行政区","regionShortname":"澳门","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"Macau","regionPinyinFirstchar":"M","regionLng":"113.54909","regionLat":"22.198951","regionSort":3748,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""},{"id":"97192340","code":"900000","pcode":"100000","pcodePath":"100000;900000","regionLevel":1,"regionType":"","regionOffcialCode":"","regionFullName":"中国,钓鱼岛","regionName":"钓鱼岛","regionShortname":"钓鱼岛","regionOffcialshortname":"","regionName1":"","regionName2":"","regionCitycode":"","regionZipcode":"","regionPinyin":"DiaoyuDao","regionPinyinFirstchar":"D","regionLng":"123.478088","regionLat":"25.742385","regionSort":3759,"regionRemark":"","regionAttr1":"","regionAttr2":"","regionAttr3":"","dataStatus":"1","version":1,"createTime":1505106420000,"creatorAccountcode":"","creatorName":"","updateTime":1505106420000,"updaterAccountcode":"","updaterName":""}]
     * retCode : SUCCESS
     */

    private Object           errorCode;
    private Object           errorMsg;
    private Object           totalCount;
    private String           retCode;
    private List<ResultBean> result;

    public Object getErrorCode() { return errorCode;}

    public void setErrorCode(Object errorCode) { this.errorCode = errorCode;}

    public Object getErrorMsg() { return errorMsg;}

    public void setErrorMsg(Object errorMsg) { this.errorMsg = errorMsg;}

    public Object getTotalCount() { return totalCount;}

    public void setTotalCount(Object totalCount) { this.totalCount = totalCount;}

    public String getRetCode() { return retCode;}

    public void setRetCode(String retCode) { this.retCode = retCode;}

    public List<ResultBean> getResult() { return result;}

    public void setResult(List<ResultBean> result) { this.result = result;}

    public static class ResultBean {
        /**
         * id : 97188592
         * code : 110000
         * pcode : 100000
         * pcodePath : 100000;110000
         * regionLevel : 1
         * regionType :
         * regionOffcialCode :
         * regionFullName : 中国,北京
         * regionName : 北京
         * regionShortname : 北京
         * regionOffcialshortname :
         * regionName1 :
         * regionName2 :
         * regionCitycode :
         * regionZipcode :
         * regionPinyin : Beijing
         * regionPinyinFirstchar : B
         * regionLng : 116.405285
         * regionLat : 39.904989
         * regionSort : 11
         * regionRemark :
         * regionAttr1 :
         * regionAttr2 :
         * regionAttr3 :
         * dataStatus : 1
         * version : 1
         * createTime : 1505106420000
         * creatorAccountcode :
         * creatorName :
         * updateTime : 1505106420000
         * updaterAccountcode :
         * updaterName :
         */

        private String id;
        private String code;
        private String pcode;
        private String pcodePath;
        private int    regionLevel;
        private String regionType;
        private String regionOffcialCode;
        private String regionFullName;
        private String regionName;
        private String regionShortname;
        private String regionOffcialshortname;
        private String regionName1;
        private String regionName2;
        private String regionCitycode;
        private String regionZipcode;
        private String regionPinyin;
        private String regionPinyinFirstchar;
        private String regionLng;
        private String regionLat;
        private int    regionSort;
        private String regionRemark;
        private String regionAttr1;
        private String regionAttr2;
        private String regionAttr3;
        private String dataStatus;
        private int    version;
        private long   createTime;
        private String creatorAccountcode;
        private String creatorName;
        private long   updateTime;
        private String updaterAccountcode;
        private String updaterName;

        public String getId() { return id;}

        public void setId(String id) { this.id = id;}

        public String getCode() { return code;}

        public void setCode(String code) { this.code = code;}

        public String getPcode() { return pcode;}

        public void setPcode(String pcode) { this.pcode = pcode;}

        public String getPcodePath() { return pcodePath;}

        public void setPcodePath(String pcodePath) { this.pcodePath = pcodePath;}

        public int getRegionLevel() { return regionLevel;}

        public void setRegionLevel(int regionLevel) { this.regionLevel = regionLevel;}

        public String getRegionType() { return regionType;}

        public void setRegionType(String regionType) { this.regionType = regionType;}

        public String getRegionOffcialCode() { return regionOffcialCode;}

        public void setRegionOffcialCode(String regionOffcialCode) { this.regionOffcialCode = regionOffcialCode;}

        public String getRegionFullName() { return regionFullName;}

        public void setRegionFullName(String regionFullName) { this.regionFullName = regionFullName;}

        public String getRegionName() { return regionName;}

        public void setRegionName(String regionName) { this.regionName = regionName;}

        public String getRegionShortname() { return regionShortname;}

        public void setRegionShortname(String regionShortname) { this.regionShortname = regionShortname;}

        public String getRegionOffcialshortname() { return regionOffcialshortname;}

        public void setRegionOffcialshortname(String regionOffcialshortname) { this.regionOffcialshortname = regionOffcialshortname;}

        public String getRegionName1() { return regionName1;}

        public void setRegionName1(String regionName1) { this.regionName1 = regionName1;}

        public String getRegionName2() { return regionName2;}

        public void setRegionName2(String regionName2) { this.regionName2 = regionName2;}

        public String getRegionCitycode() { return regionCitycode;}

        public void setRegionCitycode(String regionCitycode) { this.regionCitycode = regionCitycode;}

        public String getRegionZipcode() { return regionZipcode;}

        public void setRegionZipcode(String regionZipcode) { this.regionZipcode = regionZipcode;}

        public String getRegionPinyin() { return regionPinyin;}

        public void setRegionPinyin(String regionPinyin) { this.regionPinyin = regionPinyin;}

        public String getRegionPinyinFirstchar() { return regionPinyinFirstchar;}

        public void setRegionPinyinFirstchar(String regionPinyinFirstchar) { this.regionPinyinFirstchar = regionPinyinFirstchar;}

        public String getRegionLng() { return regionLng;}

        public void setRegionLng(String regionLng) { this.regionLng = regionLng;}

        public String getRegionLat() { return regionLat;}

        public void setRegionLat(String regionLat) { this.regionLat = regionLat;}

        public int getRegionSort() { return regionSort;}

        public void setRegionSort(int regionSort) { this.regionSort = regionSort;}

        public String getRegionRemark() { return regionRemark;}

        public void setRegionRemark(String regionRemark) { this.regionRemark = regionRemark;}

        public String getRegionAttr1() { return regionAttr1;}

        public void setRegionAttr1(String regionAttr1) { this.regionAttr1 = regionAttr1;}

        public String getRegionAttr2() { return regionAttr2;}

        public void setRegionAttr2(String regionAttr2) { this.regionAttr2 = regionAttr2;}

        public String getRegionAttr3() { return regionAttr3;}

        public void setRegionAttr3(String regionAttr3) { this.regionAttr3 = regionAttr3;}

        public String getDataStatus() { return dataStatus;}

        public void setDataStatus(String dataStatus) { this.dataStatus = dataStatus;}

        public int getVersion() { return version;}

        public void setVersion(int version) { this.version = version;}

        public long getCreateTime() { return createTime;}

        public void setCreateTime(long createTime) { this.createTime = createTime;}

        public String getCreatorAccountcode() { return creatorAccountcode;}

        public void setCreatorAccountcode(String creatorAccountcode) { this.creatorAccountcode = creatorAccountcode;}

        public String getCreatorName() { return creatorName;}

        public void setCreatorName(String creatorName) { this.creatorName = creatorName;}

        public long getUpdateTime() { return updateTime;}

        public void setUpdateTime(long updateTime) { this.updateTime = updateTime;}

        public String getUpdaterAccountcode() { return updaterAccountcode;}

        public void setUpdaterAccountcode(String updaterAccountcode) { this.updaterAccountcode = updaterAccountcode;}

        public String getUpdaterName() { return updaterName;}

        public void setUpdaterName(String updaterName) { this.updaterName = updaterName;}
    }
}
