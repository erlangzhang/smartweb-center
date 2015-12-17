package com.iweb.smartweb.commons.constants;

import lombok.ToString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类注释
 * <p/>
 * <ul>
 * <li>方法列表</li>
 * </ul>
 *
 * @author zhanglingsi
 * @version 1.0.0 createTime: 15/12/17 09:50
 * @see
 * @since 1.0
 */
@ToString
public class Regexp {
    public static final String merchantID = "[0-9]{1,30}";
    public static final String orderNo = "(\\w{1,50})";
    public static final String orderDate = "((20)[0-9]{2}[0-9]{4})|(20)[0-9]{2}[0-9]{4}[0-9]{6}";
    /**
     * 订单金额 可以为 0、正整数、带两位小数点的小数 最大10位数
     */
    public static final String orderAmt = "(0)|([1-9]{1}[0-9]{0,9})|((0)+\\.{1}[0-9]{2}$)|([1-9]{1}[0-9]{0,9}+\\.{1}[0-9]{2}$)";
    //验证是否为数字
    public static final String isNumber = "^[0-9]*$";

    public static final String curType = "(RMB)";
    public static final String encodeType = "(1)";
    public static final String bizCode = "(0001)|(0001000001)|(0001000002)|(0010000)|(0002000)";
    //分期数
    public static final String pedcnt = "(1)|(3)|(6)|(9)|(12)|(18)|(24)";

    //订单关闭时间:yyyy-mm-dd HH:MM:SS
    public static final String orderCloseTime = "[0-9]{4}(-)[0-9]{2}(-)[0-9]{2}( )[0-9]{2}(:)[0-9]{2}(:)[0-9]{2}";
    //日期正则表达式
    public static final String acceptDate="(?:19|20)[0-9][0-9](?:(?:0[1-9])|(?:1[0-2]))(?:(?:[0-2][1-9])|(?:[1-3][0-1]))";
    //时间正则表达式
    public static final String acceptTime="(?:(?:[0-2][0-3])|(?:[0-1][0-9]))[0-5][0-9][0-5][0-9]";
    //商户调用密码
    public static final String commPwd = "[0-9a-zA-Z]{6,20}";
    //接入的产品号码 翼支付账户号
    public static final String productNo = "[0-9]{11}";

    //缴费助手充值账户 账户格式
    public static final String rechargeAccout = "[0-9]{6,16}";


    //翼支付账户号
    public static final String bestpayAccount = "[0-9]{11}";

    public static final String proNo="^\\d*$";  //TODO 订单查询账号标识正则表达式校验
    public static final String txtChannel="\\d{2}";
    /** 易信用的校验*/
    public static final String openId = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
    public static final String platformId = "[0-9]{1,40}";
    public static final String mobilePhone = "^((13[0-9])|(15[^4,\\D])|(18[0-9])|(17[0-9]))\\d{8}$";
    public static final String ip = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b";
    public static final String cardType = "^[01]{1}$";
    public static final String cardNo = "[0-9]{1,40}";
    public static final String certType ="^[0]{1}$";
    //    public static final String certNo ="([0-9]{17}([0-9]|X))|([0-9]{15})";
    public static final String certNo ="[0-9a-zA-Z]{1,18}";
    public static final String platformTradeId ="[0-9a-zA-Z]{0,40}";
    public static final String platformTradeTime = "^((?:19|20)\\d\\d)(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])(0\\d|1\\d|2[0-3])(0\\d|[1-5]\\d)(0\\d|[1-5]\\d)$";
    public static final String orderId ="[0-9a-zA-Z]{0,35}";
    public static final String queryType ="^[012]{1}$";
    public static final String platformDate ="[2]\\d{3}[0|1][1-9][0-3]\\d";
    public static final String withDrawDate = "^((?:19|20)\\d\\d)(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])(0\\d|1\\d|2[0-3])(0\\d|[1-5]\\d)(0\\d|[1-5]\\d)$";

    //账号类型 0：翼支付账户   1：交费助手用户
    public static final String accountType = "^[0,1]{1}$";

    public static final String overTime = "^[0-9]*[1-9][0-9]*$";


    /**
     * @Description: 请求参数正则验证
     * @param value 需要验证的参数
     * @param regex  验证此参数的正则表达式
     * @return boolean
     */
    public static boolean doRegex(String value,String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return  matcher.matches();
    }

}

