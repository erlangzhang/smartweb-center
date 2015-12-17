package com.iweb.smartweb.commons.constants;

import com.google.common.base.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User: zhangleimin
 * Date: 13-10-9
 * Time: 下午5:37
 */
@ToString
public enum RespCode {
    REFUND_FAIL("BS061000","支付失败"),
    OVERDUE_REFUND("BF071244","超期退款"),
    REFUND_ONLINE("BF062001","不支持线上退款"),
    REFUND_TUOJI("BF062002","只支持脱机退款"),
    AMOUNT_ERROR("BK071132", "交易金额异常"),
    PAY_LOST("BK071258","支付交易不存在"),
    TRADE_LOST("200100","交易不存在"),
    TRADE_ALR_SUC("200200","交易已成功"),
    RECHARGE_ALR_SUC("200201","充值已成功,不允许操作"),
    SYS_EXCEPTION("200999","系统异常，请稍后再试"),
    MERCHANT_ADDRESS_NOT_FIND("4029","商户地址找不到"),
    SEQ_CONF_ERR("BF070001","流水号配置错误"),
    BIZORG_CONF_ERR("BF070002","业务机构配置错误"),
    DB_UP_ERR("9989","数据库异常"),
    DB_ERR("9980","更新订单失败"),
    CREATE_ORDER_FAILED("201100","创建订单失败"),
    DUPLICATED("BK071059","重复通知"),
    /*@auther Jumping.Yen 前端相应成功*/
    CAPTCHA_SUCCESS("0000","验证码申请成功"),
    BIND_SUCCESS("0000","绑卡成功"),
    UNBIND_SUCCESS("0000","解绑成功"),
    UNBINDFILE_SUCCESS("0000","批量解绑成功"),
    CARDCHECK_SUCCESS("0000","身份验证成功"),
    QUERY_SUCCESS("0000","查卡成功"),
    BATCH_SUCCESS("0000","批量支付成功"),
    CREATE_SERIALNO_FAILED("210000","创建流水号失败"),
    /*@end*/
    BIND_WSCODENULL("4000","接口标识[WSCODE]不能为空"),
    BIND_MERCHANTIDNULL("4000","商户代码[MERCHANTID]不能为空"),
    BIND_ORDERSEQNULL("4000","订单号[ORDERSEQ]不能为空"),
    BIND_ORDERSEQ_REQ_NULL("4000","订单请求交易流水号[ORDERREQSEQ]不能为空"),
    BIND_CUSTOMERIDNULL("4000","客户标识[CUSTOMERID]不能为空"),
    BIND_VAILUSERACCOUNTNULL("4000","校验手机类型[VAILUSERACCOUNT]不能为空"),
    BIND_ACCEPTSEQNONULL("4000","你选择的是手机校验，所以受理流水号[ACCEPTSEQNO]不能为空"),
    BIND_VAILCODENULL("4000","你选择的是手机校验，所以手机验证码[VAILCODE]不能为空"),
    BIND_ACCEPTSEQNO_EPAY_NULL("4000","翼支付账户必须短信校验，所以受理流水号[ACCEPTSEQNO]不能为空"),
    BIND_VAILCODE_EPAY_NULL("4000","翼支付账户必须短信校验，所以手机验证码[VAILCODE]不能为空"),
    BIND_CARDVALIDITYNULL("4000","信用卡有效期[CARDVALIDITY]不能为空"),
    BIND_CVVNULL("4000","信用卡cvv码[CVV]不能为空"),
    BIND_BUSICODENULL("4000","业务类型[BUSICODE]不能为空"),
    BIND_EPAYACCOUNTNULL("4000","产品号[EPAYACCOUNT]不能为空"),
    BIND_BINDACCOUNTDESCNULL("4000","银行绑定，绑定的银行账户信息[BINDACCOUNTDESC]不能为空"),
    BIND_USERACCOUNTNULL("4000","银行绑定，银行卡预留手机号[USERACCOUNT]不能为空"),
    BIND_ORDERREQTIMENULL("4000","请求时间[ORDERREQTIME]不能为空"),
    BIND_AMOUNT_NULL("4000","订单金额[AMOUNT]不能为空"),
    BIND_AUTHCODE_NULL("4000","业务协议号[AUTHCODE]不能为空"),
    BIND_MACNULL("4000","MAC验证信息[MAC]不能为空"),
    BIND_FTPNULL("4000","FTP信息不存在"),
    BIND_INFONOEXIST("3101","无绑卡信息"),
    BIND_AMOUNT_ERROR("4000","订单金额不能为0"),
    BIND_BANK_PHONE_ERROR("999999","银行预留手机号码有误"),

    /*--非空错误码 --*/
    BIND_COMMCODEERROR("4000","商户号不存在"),
    BIND_ORDERSEQERROR("-802","订单号[ORDERSEQ]存在非法字符或字符太长，太短"),
    BIND_ORDERSEQ_REQ_ERROR("-802","订单请求交易流水号[ORDERREQTRANSEQ]存在非法字符或字符太长，太短"),
    BIND_ORDERDATE_REQ_ERROR("-802","订单日期[ORDERDATE]格式错误"),
    BIND_AMOUNT_REQ_ERROR("-802","金额[AMOUNT]格式错误"),
    BIND_BUSICODE_REQ_ERROR("4000","业务类型[BUSICODE]信息错误"),


    BIND_CUSTOMERIDERROR("-802","客户标识[CUSTOMERID]存在非法字符或字符区间10-32位"),
    BIND_AUTHCODENULL("4000","协议号码[AUTHCODE]不能为空"),
    BIND_AUTHCODEERROR("4000","协议号码[AUTHCODE]存在非法字符或字符区间不在10-20位之间"),
    BIND_VAILUSERACCOUNTERROR("4000","是否校验手机短信验证码[VAILUSERACCOUNT]类型错误"),
    BIND_ACCOUNTTYPEERROR("4000","翼支付账户必须短信校验"),
    BIND_ACCEPTSEQNOERROR("4000","受理流水号[ACCEPTSEQNO]格式错误或字符区间不在8-20位之间"),

    BIND_VAILCODEERROR("4000","手机验证码[VAILCODE]格式错误"),
    BIND_BUSICODEERROR("4000","业务类型[BUSICODE]错误"),
    BIND_ACCOUNTTYPE_NOMALERROR("4000","账户类型[ACCOUNTTYPE]错误"),
    BIND_EPAYACCOUNTERROR("4000","产品号[EPAYACCOUNT]格式错误"),
    BIND_USERACCOUNTERROR("4000","绑定银行卡时，银行卡预留手机号[USERACCOUNT]格式错误"),
    BIND_ORDERREQTIMEERROR("4000","绑卡请求时间[ORDERREQTIME]格式错误"),
    BIND_ISExeceptionERROR("4000","解析银行账户信息[BINDACCOUNTDESC]异常或参数值为空"),

    BIND_CARDNOERROR("4000","银行账号[CARDNO]格式错误"),
    BIND_USERNAMEERROR("4000","银行账号[USERNAME]格式错误"),
    BIND_USERIDERROR("4000","办理银行账户时的身份证号[USERID]格式错误"),
    BIND_CARDVALIDITYERROR("4000","信用卡有效期[CARDVALIDITY]格式错误"),
    BIND_CVVERROR("4000","信用卡cvv码[CVV]格式错误"),

    BIND_MCHNT_TRANSRIGHTERROR("1006","无此交易权限"),
    BIND_MCHNT_TRANSRIGHTEXPERROR("1006","商户交易权限验证有误"),

    BIND_MACERROR("4001","mac校验未通过"),
    BIND_AUTHCODE_EXISTSERROR("4000","订单号重复或协议号已存在"),
    BIND_cardType_NOEXISTSERRORBIN("4000","银行账户对应的银行未开通或不支持"),
    BIND_epayBankID_NOEXISTSERROR("4000","翼支付账户未开通"),
    /*--解绑错误码--*/
    BIND_RM_ORDERREQTIMEERROR("4000","业务关闭时间[ORDERREQTIME]不能为空"),
    BIND_RM_REPEAT_ERROR("4000","解绑订单号重复"),
    BIND_PRODUCTNULL("4000","手机号[PRODUCT]不能为空"),
    BIND_SEQNONULL("4000","受理流水号[ACCEPTSEQNO]不能为空"),
    BIND_INPUTTIMENULL("4000","操作时间[INPUTTIME]时间不能为空"),
    BIND_keyNULL("4000","商户[MERCHATNID]不存在"),
    BIND_PRODUCTNOERROR("4000","手机号[PRODUCTNO]格式错误"),
    BIND_INPUTTIMERROR("4000","操作时间[INPUTTIME]格式错误"),
    BIND_TIMEOUT("-856","绑卡超时"),
    /**-author:jumping date:2013-8-5 @capatity 解绑状态响应-**/
    BIND_RM_INFONOEXIST("3101","绑卡信息不存在"),
    BIND_RM_REMOVED("3100","已解绑"),
    BIND_RM_REMOVEFAIL("-802","解绑失败"),
    BIND_AUTHCODE_NOEXISTSERROR("4000","解绑订单号重复"),

    /*--认证接口--*/
    BIND_MCHNTPWD_NULL("4000","商户密码不能为空"),
    BIND_VALIDATETYPE_NULL("4000","验证类型不能为空"),
    BIND_IDCARDENC_NULL("4000","验证银行账户时，证件加密信息不能为空"),
    BIND_REQUESTTIME_NULL("4000","请求时间不能为空"),
    BIND_BANKACCOUNTENC_NULL("4000","验证银行账户时，银行账户加密信息不能为空"),
    BIND_EPAYACCOUNT_NULL("4000","验证翼支付账户时，翼支付账户信息不能为空"),
    BIND_TRACENO_NULL("4000","跟踪号不能为空"),
    BIND_MCHNTPWD_ERROR("4000","商户密码错误"),
    BIND_REQUESTTIME_ERROR("4000","验证类型错误"),
    BIND_REALNAME_NULL("4000","证件姓名不能为空"),
    BIND_IDENTITYNO_NULL("4000","证件号不能为空"),
    BIND_IDENTITYNO_ERROR("4000","证件号格式错误"),
    BIND_REQUESTTIME_Time_ERROR("4000","请求时间格式错误"),
    BIND_EPAYACCOUNT_ERROR("4000","翼支付账户格式错误"),
    BIND_CARDUSERNAME_NULL("4000","银行用户名不能为空"),
    BIND_CARDNO_NULL("4000","银行账户不能为空"),
    BIND_CARDNO_ERROR("4000","银行账户格式错误"),
    BIND_TRACENO_ERROR("4000","跟踪号格式错误"),
    BIND_BINDSTATUS_ERROR("4000","绑卡状态[BINDSTATUS]类型错误"),
    BIND_KEY_ERROR("4000","商户密钥[KEY]未配置"),
    /*--文件代扣--*/
    BIND_FileName_NULL("4000","文件名不能为空"),
    BIND_BackFileUrl_NULL("4000","后台返回处理地址[backFileUrl]不能为空"),
    BIND_OrderReqTime_NULL("4000","业务请求时间[orderReqTime]不能为空"),

    BIND_FileName_ERROR("4000","全文件名[FILENAME]格式只能包含字母，数字和/组成"),
    BIND_BatchSeq_ERROR("4000","全文件名[FILENAME]格式只能包含字母，数字和/组成"),
    BIND_OrderReqTime_ERROR("4000","业务请求时间[ORDERREQTIME]格式错误"),
    BIND_CountBatch_ERROR("4000","处理批次号重复"),
    BIND_MCHNTFTP_ERROR("-802","未配置FTP信息"),
    BIND_FILEACCEPT_SUCC("0000","受理成功"),
    BIND_FILEACCEPTFILE_ERROR("-803","该文件未上传ftp"),
    BIND_FILEACCEPT_ERROR("-802","受理失败"),

    BIND_FILEBACK_SUCC("0000","文件处理成功"),
    BIND_FILEBACK_ERROR("-802","文件处理失败"),

    /**批量文件解绑响应码**/
    BIND_RM_FILENAMENONULL("4000","处理文件名不为空"),
    BIND_RM_FILEBATCHSEQNONULL("4000","处理批次号不为空"),
    BIND_RM_FILEBACKFILEURLNONULL("4000","后台返回处理地址不为空"),
    BIND_RM_FILEORDERREQTIMENONULL("4000","业务请求时间不为空"),

    BIND_RM_FILENAMEERROR("4000","文件名[RMFILENAME]字符区间必须在10-30之间"),
    BIND_RM_FILEBATCHSEQERROR("4000","处理批次号[RMBATCHSEQ]长度不满足要求"),
    BIND_RM_FILEBACKFILEURLERROR("4000","商户后台返回地址[RMBACKFILEURL]格式不满足要求"),
    BIND_RM_FILEORDERREQTIMEERROR("4000","业务请求时间[RMORDERREQTIME]不是数字或长度不满足要求"),
    BIND_RM_FILEBATCHSEQISEXIST("4000","处理批次号[RMBATCHSEQ]重复"),

    BIND_RM_FILEFTPISNULL("-804","商户ftp信息为空"),
    BIND_RM_FILEUPLOADISNULL("-804","商户扣款文件未上传ftp或上传文件为空，请重新上传ftp"),
    BIND_REFUND_SUCCESS("0000","退款成功"),
    BIND_REFUND_EXCEPTION("BF9999","系统忙，请稍后重试"),
    BIN_REFUND_NOTFUND("BF9998","该银行卡暂不支持，请使用“现金”类型进行充值"),
    /**-end author:jumping-**/
    /*********************************** 页码错误码 *****************************************/
    BF999999("BF999999","系统繁忙，请稍后再试。"),
    RESSUCCESS("00000000","成功"),
    OLD_RESSUCCESS("0000","成功"),
    ACCEPT_RESSUCCESS("ACC0000","受理成功"),
    OLD_ERROR("9999","交易失败"),
    BF020000("BF020000","记录日志获取平台流水和清算日期失败"),
    BF021000("BF021000","交易请求报文转换失败"),
    BF022000("BF022000","交易响应报文转换失败"),
    BF022001("BF016XXX","商户未配置商户接口信息"),
    BF016XXX("BF016XXX","商户配置信息校验失败"),
    CARDBIN_QUERY("false|||","卡BIN查询失败是返回值"),

    ERR_1001("1001","商户未注册"),
    ERR_1002("1002","商户未配置密钥信息"),

    ERR_1003("1003","商户未开通银行"),
    ERR_1007("1007","暂不支持该银行"),
    ERR_10031("10031","老网关银行代码没有对应的新网关银行代码"),
    ERR_1101("1101","订单号或者流水号重复，请勿重复提交交易。"),

    ERR_100003("100003","商户外部交易类型校验失败"),

    ERR_301("-301","校验商户MAC校验域出错"),
    ERR_3011("-3011","U盾验签出错"),
    ERR_302("-302","校验订单出错"),
    ERR_3031("-3031","订单金额有误"),
    ERR_3032("-3032","产品金额有误"),
    ERR_3033("-3033","附加金额有误"),
    ERR_303("-303","校验订单金额、产品金额、附加金额出错"),
    ERR_304("-304","商户未配置此交易权限"),
    ERR_305("-305","校验商户域名出错"),
    ERR_306("-306","校验商户分账信息出错"),
    ERR_3061("-3061","分账商户不存在"),
    ERR_3062("-3062","分账金额有误"),
    ERR_3063("-3063","分账金额总和不等于订单金额"),
    ERR_3064("-3064","分账商户父商户有误"),
    ERR_3065("-3065","分账信息不允许有两个相同商户"),
    ERR_307("-307","校验商户ip出错"),
    ERR_308("-307","校验商户指定银行出错"),
    ERR_309("-309","校验商户调用密码出错"),
    ERR_310("-310","校验订单日期有误"),
    ERR_311("-311","未知的业务类型"),
    ERR_312("-312","暂不支持此银行"),
    ERR_313("-313","交易类型错误"),
	ERR_3042("-3042","商户暂不支持直跳银行"),

    ERR_401("-401","手机账户余额查询失败"),
    ERR_402("-402","查询手机最近三个月话费账单失败"),
    ERR_403("-403","手机鉴权失败"),
    ERR_404("-404","账户余额不足"),
    ERR_405("-405","手机风险控制判断失败"),

    ERR_504("-504","网关超时"),

    ERR_802("-802","参数错误"),
    ERR_809("-809","银行卡BIN错误"),
    ERR_833("-833","卡BIN错误"),
    ERR_849("-849",	"卡信息解密失败"),
    ERR_835("-835",	"CVV2格式错误"),
    ERR_834("-834",	"有效期格式错误"),

    ERR_806("-806",	"服务处理出错"),
    ERR_807("-807",	"加密信息错误"),
    /*-- handPay --*/
    ERR_802_MECHNTCODE("-802","商户代码[MERCHATNID]不能为空"),
    ERR_802_USERACCOUNT("-802","翼支付账户号[USERACCOUNT]不能为空"),
    ERR_802_CARDBINDINGID("-802","绑卡编号[USERACCOUNT]不能为空"),
    ERR_802_CARDNOSUFFIX("-802","卡号后四位[CARDNOSUFFIX]不能为空"),
    ERR_802_SIGNDATA("-802","签名[SIGNDATA]不能为空"),
    BIND_802_USERACCOUNT_ERROR("-802","翼支付账户号[USERACCOUNT]格式错误"),
    BIND_802_CARDBINDINGID_ERROR("-802","绑卡编号[CARDBINDINGID]格式错误"),
    BIND_802_CARDNOSUFFIX_ERROR("-802","卡号后四位[CARDNOSUFFIX]格式错误"),
    BIND_802_KEY_ERROR("-802","商户key不存在"),
    /** end @author:liuJianXiong **/
    /** begin @author HKL; @date:2013-09-02--**/
    ERR_802_ORDERSEQ("-802","商户订单流水号[ORDERSEQ]不能为空"),
    ERR_802_ORDERREQTIME("-802","订单请求时间[ORDERREQTIME]不能为空"),
    ERR_802_APPLYTYPE("-802","申请类型[APPLYTYPE]不能为空"),
    ERR_802_BANKCODE("-802","银行代码[BANKCODE]不能为空"),
    ERR_802_CURTYPE("-802","币种[CURTYPE]不能为空"),
    ERR_802_MOBILE("-802","用户手机号[MOBILE]不能为空"),
    ERR_802_ORDERAMOUNT("-802","订单金额[ORDERAMOUNT]不能为空"),
    ERR_802_TXNPASSWD("-802","支付密码[TXNPASSWD]不能为空"),
    BIND_802_APPLYTYPE_ERROR("-802","申请类型[APPLYTYPE]格式错误"),
    BIND_802_MOBILE_ERROR("-802","用户手机号[MOBILE]格式错误"),
    BIND_802_BANKCODE_ERROR("-802","银行代码[BANKCODE]格式错误"),
    BIND_802_ORDERAMOUNT_ERROR("-802","订单金额[ORDERAMOUNT]格式错误"),
    BIND_802_CURTYPE_ERROR("-802","币种[CURTYPE]格式错误"),

    /***********************************ivr支付响应 *****************************************/
    /** 商户号为空或不存在 验证不通过 **/
    BF866("-866","商户号为空或不存在 验证不通过"),
    /**其他错误**/
    BF874("-874","其他错误"),
    /**参数错误	请检查接口参数**/
    BF802("802","参数错误 请检查接口参数"),
    /**受理成功响应代码**/
    BF0000("0000","受理成功 "),
    /** 新平台：成功 */
    SUCCESS("00000000", "成功"),
    /**后台成功响应代码**/
    BF00("00","成功"),
    /**Mac校验域校验失败**/
    BF3007("3007","Mac校验域校验失败"),
    /**解卡密信息失败**/
    BF849("-849","解卡密信息失败"),
    /**CVV2无效**/
    BF865("-865","CVV2无效"),
    /**	商户已注册，但未开通此业务**/
    BF1006("1006","商户已注册，但未开通此业务"),
    /**无效卡号**/
    BF851("-851","无效卡号"),
    /**银行卡bin错误**/
    BF809("-809","银行卡bin错误"),
    /**订单号数据项格式错误**/
    BF203("-203","订单号数据项格式错误"),
    /**日期错误**/
    BF803("-803","日期错误"),
    /**交易超时**/
    BF856("-856","交易超时"),
    /** 卡有效期错误 */
    BF853("-853","卡有效期错误"),
    /**  无效证件类型 */
    BF2020("2020","无效证件类型 "),
    /**证件号码不符	身份证号码检查失败 */
    BF862("-862","证件号码不符	身份证号码检查失败"),
    /** 退款金额超出原始订单金额 */
    BF1119("1119","退款金额超出原始订单金额"),
    /** 手机客户端请求失败内部返回 **/
    BF9999("9999","解析报文异常"),
    BF999("999","远程通讯异常"),
    /***********************************ivr支付响应 *******************************/
    /***********************************3g流量卡  账单支付 *******************************/
    CS000000("000000","SUCCESS"),
    CS010021("010021","FAIL"),
    /********************************* Sp积分扣减接口 响应*************************/
    JF_802_MECHNTPWD("-802","商户代码[MECHNTPWD]不能为空"),
    JF_802_PROVINCEID ("-802","省份ID[PROVINCEID]不能为空"),
    JF_802_USERTYPE ("-802","认证类型[USERTYPE]不能为空"),
    JF_802_MOBCODE ("-802","验证码[MOBCODE]不能为空"),
    JF_802_OLDORDERPAYID("-802","原扣款订单请求流水号[OLDORDERPAYID]不能为空"),
    JF_802_ORDERREFUNDID("-802","当前交易号流水号[ORDERREFUNDID]不能为空"),
    JF_802_TRANSAMT("-802","订单交易金额[TRANSAMT]不能为空"),
    JF_802_MAC("-802","mac[MAC]不能为空"),
   /* JF_802_DIVDETAILS("-802","分账信息[TRANSAMT]不能为空"),
    JF_802_TYPE("-802","退款类型[TYPE(]不能为空"),*/
    /** 获取验证码成功 */
    JF("0000","获取验证码成功"),
    /** 获取验证码错误！ */
    JF0006("0006","获取验证码错误！"),
    /** 加密字符串错误 */
    JF0004("0004","加密字符串错误"),
    /** 验证验证码成功 */
    JF0005("0000","验证验证码成功"),
    /** 扣减失败 */
    JF0001("0001","扣减失败"),
    /** 扣减成功 */
    JF0003("0000","扣减成功"),
    /** 加密字符串错误*/
    JF0002("0002","加密字符串错误"),

    /**补单返回码*/
    QO0000("0000", "无需补单"),
    QO0001("0001", "补单查询银行订单状态错误"),
    QO0002("0002", "补单修改订单状态错误"),
    QO0003("0003", "请求参数错误"),
    QO0004("0004", "未能查询到相应数据"),

    /**商户查询接口返回码*/
    MCHNTQO00000("0", "成功查询到数据"),
    MCHNTQO00001("1", "未找到记录"),
    MCHNTQO00009("9", "MAC错误或系统忙，请稍后再试"),

    /**发送短信返回码*/
    SMS000000("000000", "参数检查成功"),
    SMS0000("0000", "短信下发成功"),
    SMS0001("0001", "部分下发成功"),
    SMS0002("0002", "短信下发失败"),
    SMS0003("0003", "参数不合法"),
    SMS0004("0004", "缺少必填参数"),
    SMS0005("0005", "发送内容为空"),
    SMS0006("0006", "验证签名失败"),
    SMS0007("0007", "域名校验错误"),
    SMS0008("0008", "手机号码校验错误"),
    SMS0009("0009", "校验超时，请重新获取"),
    SMS0010("0010", "输入次数超限，请重新获取"),
    SMS0011("0011", "输入的验证码不正确"),
    SMS9999("9999", "系统错误"),

    /**发送短信平台标识*/
    SMSF0001("SMSF0001", "管理平台"),

    /********************************* Sp积分扣减接口 响应*************************/
    /**---------------------------author:liuJianXiong date:20131016  esayMsg-----------------**/
    EASY_EASYUSER_NULL("4000","您的易信账户为空"),
    EASY_EASYUSER_EXP("9999","系统繁忙，请稍后再试。"),
    EASY_EASYUSER_BINDSUCCESS("0000","小翼将向您的手机发送一条验证码短信，只需要回复验证码就可以完成绑定哦！"),


    /********************************* 校验订单信息*************************/
    bankCallBackErr("3006","银行返回金额与实际金额不匹配") ,
    /******************************易信 响应***************************************/
    /**系统繁忙*/
    EASYMSG_BUSY_ERR("9999","系统繁忙，请稍后再试。"),
    /**系统繁忙*/
    EASYMSG_SUCCESS("000000","业务成功"),
    /** 业务：系统异常 */
    EASYMSG_BS081022("BS081022", "业务：系统异常"),
    /**验证码不正确*/
    EASYMSG_CHK_ERR("-802","您输入的验证码不正确。"),
    /**验证码格式不正确*/
    EASYMSGFORMAT_ERR("-802","您输入的验证码格式不正确。"),
    /**校验验证码成功*/
    EASYMSG_CHK_SUCCESS("0000","校验验证码成功。"),
    /**验证码失效*/
    EASYMSG_CHKCODE_INVALID("-802","您输入的验证码已失效，有效期为5分钟，请重新回复BD+手机号(如：BD18900000000)，绑定翼支付哦！"),
    /**易信账号为空,绑定翼支付账号*/
    EASYMSG_ACCOUNT_BD_NULL("4000","您的易信账户为空。"),
    /**易信账号为空,翼支付开户*/
    EASYMSG_ACCOUNT_KH_NULL("4000","您的易信账户为空，请重新回复KH+手机号(如：KH18900000000)，开通翼支付哦！"),
    /**输入手机号码不正确,绑定翼支付账号*/
    EASYMSG_PHONENUM_BD_ERR("4000","您输入的手机号码不正确，请重新回复BD+手机号(如：BD18900000000)，绑定翼支付哦！"),
    /**输入手机号码不正确,绑定翼支付账号*/
    EASYMSG_PHONENUM_KH_ERR("4000","您输入的手机号码不正确，请重新回复KH+手机号(如：KH18900000000)，开通翼支付哦！"),
    /**校验成功*/
    EASYMSG_VAIL_SUCCESS("0000","验证成功"),
    /**输入手机号码不正确,绑定翼支付账号*/
    EASYMSG_PHONE_BD_ERR_802("-802","您输入的手机号码不正确，请重新回复BD+手机号(如：BD18900000000)，绑定翼支付哦！"),
    /**输入手机号码不正确,绑定翼_支付账号*/
    EASYMSG_PHONE_KH_ERR_802("-802","您输入的手机号码不正确，请重新回复KH+手机号(如：KH18900000000)，开通翼支付哦！"),
    /**易信未绑定翼支付账户*/
    EASYMSG_UNBD_ERR("-301","对不起，您还未绑定翼支付，请回复BD+手机号(如：BD18900000000)，绑定翼支付。"),
    /**翼支付账号余额查询代码格式不正确*/
    EASYMSG_QUERY_FORMAT_ERR("-802","您输入的余额查询代码格式不正确，请回复CXYE或YECX。"),
    /**翼支付账号余额查询成功*/
    EASYMSG_QUERY_SUCCESS("0000","余额查询成功。"),
    /**翼支付账号未开通*/
    EASYMSG_ACCOUNT_UNOPEN_ERR("-802","您还没发起开户申请，请重新回复KH+手机号(如：KH18900000000)，开通翼支付哦！"),
    /**翼支付账号开通输入姓名不正确*/
    EASYMSG_INPUT_NAME_ERR("-802","您输入的姓名不正确。"),
    /**翼支付账号开通输入身份证不正确*/
    EASYMSG_INPUT_ID_ERR("-802","您输入的身份证不正确。"),
    /**易信充值金额不正确*/
    EASYMSG_PAYAMOUNT_ERR("-802","您输入的充值金额不正确。"),
    /**易信充值金额格式不正确*/
    EASYMSG_PAYAMOUNT_FORMAT_ERR("-802","您输入的充值金额格式不正确,必须为正整数哦！"),
    /**易信充值校验成功*/
    EASYMSG_PAY_CHK_SUCCESS("0000","充值校验成功"),
    /**手机开通翼支付账户*/
    EASYMSG__ISEPAYACCOUNT("0000","您的手机已经是翼支付账户哦！"),
    /**手机开通翼支付账户下发验证码短信*/
    EASYMSG__REG_EPAY_SMS("0000","小翼将向您的手机发送一条验证码短信：\r\n 【1】、如果是电信手机，则只需要回复验证码就可以完成开通哦！\r\n 【2】、如果是移动或联通手机，则需要回复格式：验证码,姓名,身份证（如：123456,张三,430224199009090909）。"),
    /**手机号码不存在，开通翼支付账号*/
    EASYMSG__NO_CRMINFO("200010","您的手机号不存在，请填写您的真实手机号，重新回复KH+手机号(如：KH18900000000)，开通翼支付哦！"),
    /**还没有注册翼支付账户*/
    EASYMSG__NO_EPAYACCOUNT("200010","您还没有注册翼支付账户，回复KH+手机号(如：KH18900000000)，开通翼支付；或请登录http://www.bestpay.com.cn 注册。"),
    /**还没有注册翼支付账户*/
    EASYMSG__NO_CHNNET("200010","您不是电信手机号，请重新回复KH+手机号(如：KH18900000000)，开通翼支付；或请登录http://www.bestpay.com.cn 注册。"),
    /**您输入的校验码不正确或已过期！*/
    EASYMSG__NO_PHONE("900003","您输入的校验码不正确或已过期，请重新回复验证码或回复KH+手机号(如：KH18900000000)，开通翼支付。"),
    /**您不是移动，联通号码*/
    EASYMSG__NO_UNIORMOBILE("200010","您不是移动，联通手机号，请重新回复KH+手机号(如：KH18900000000)，开通翼支付；或请登录http://www.bestpay.com.cn 注册。"),
    /**翼支付账号余额*/
    EASYMSG__EPAY_ACCOUNT_DESC("0000","您的翼支付账户余额为："),
    /**移动，联通手机号异常*/
    EASYMSG__UNIORMOBILE_PHONE_EXCEP("9999","您的移动，联通手机号状态异常，请联系移动客服10086，或者联通客服10010。"),
    /**手机号异常*/
    EASYMSG__PHONE_EXCEP802("802","您的手机号异常，请联系客服10000。"),
    /**翼支付账号余额单位*/
    EASYMSG__EPAY_ACCOUNT_UNITS("0000","元。"),
    /**翼支付账号异常*/
    EASYMSG__EPAY_ACCOUNT_EXCEPTION("9999","您的翼支付账户状态异常，请联系客服4008011888。"),
    /**手机号异常*/
    EASYMSG__PHONENUM_EXCEPTION("9999","您的手机号状态异常，请联系客服10000。"),
    /**开户信息入库处理成功*/
    EASYMSG__SAVEUSER_SUCCESS("0000","将开户信息入库处理"),
    /**您的易信账户已绑定翼支付*/
    EASYMSG__BIND_FONT_ERR("-802"," 您的易信账户已绑定翼支付哦 ， 绑定账户为【"),
    /**您的易信账户已绑定翼支付*/
    EASYMSG__BIND_END_ERR("-802","】。"),
    /**发起开户翼支付申请,没有短信下发*/
    EASYMSG__SMS_ERR("802","您已经发起开户翼支付申请，如果没有短信下发，则需1分钟后再请重新回复KH+手机号(如：KH18900000000)，开通翼支付哦！"),
    /**电信号码开通翼支付成功*/
    EASYMSG_CHANET_SUCCESS("0000","恭喜您，开通翼支付成功！"),
    EASY_BIND_CHESUCCESS("0000","绑定验证成功"),
    /**异网号码开通翼支付成功*/
    EASYMSG_OTHERNET_SUCCESS("0000","恭喜您，开通翼支付成功，登陆密码为身份证账号后6位。"),
    EASYMSG_GRADE_ERROR("4000","你的翼支付账户还没实名。请登录http://www.bestpay.com.cn进行实名，才能进行号码转账"),
    /******************************易信 响应***************************************/

    EASY_PHONE_NULL("4000","您输入的手机号码不正确，请重新回复BD+手机号(如：BD18900000000)，绑定翼支付哦！"),
    // two
    EASY_BIND_MONEY_ERROR("802","您输入的充值金额不正确,必须为正整数哦！"),
    EASY_CHECKCODE_ERROR("802","您输入的验证码格式不正确。"),
    EASY_CHECKCODE_NOTEFFECT("802","您输入的验证码已失效，有效期为5分钟，请重新回复BD+手机号(如：BD18900000000)，绑定翼支付哦！"),
    EASY_BIND_ISSUCCESS("0000","恭喜您，绑定成功！"),
    EASY_CONTROL_ERROE("802","您的请求消息正在处理中，请稍等，如果没有收到回复消息，请1分钟后再试。"),
    EASY_THK_SUCCESS("0000","谢谢您宝贵的反馈建议，我们一定在最短的时间完善全部的后续服务。"),
    EASY_INFO_ERROR("4002","您输入的指令不正确，请重新回复正确指令"),
    EASY_QUESTION_EXCEPTION("9999","系统异常，稍后再试!"),
    /**---------------------------end author:liuJianXiong -----------------------------------**/

    /***@author JumpingYen 水电煤账单业务***/
    BILL_SDM_MERCHNT_NOTNULL("4000","商户号不能为空"),
    BILL_SDM_ORDERSEQ_NOTNULL("4000","流水号不能为空"),
    BILL_SDM_PRODUCTNO_NOTNULL("4000","手机号不能为空"),
    BILL_SDM_BANKFOUR_NOTNULL("4000","绑定快捷银行后四位不能为空"),
    BILL_SDM_BILLORGID_NOTNULL("4000","收费单位代码不能为空"),
    BILL_SDM_ACCOUNTNO_NOTNULL("4000","水电煤用户号不能为空"),
    BILL_SDM_ORDERDATE_NOTNULL("4000","订单日期不能为空"),
    BILL_SDM_ACCOUNTPAYDATE_NOTNULL("4000","账单扣款时间不能为空"),
    BILL_SDM_MAC_NOTNULL("4000","MAC不能为空"),
    BILL_SDM_MERCHNT_NOTEXITS("4000","商户号不存在"),

    BILL_SDM_SUBMERCHANTID_ERROR("4000","子商户必须在10~30位之间"),
    BILL_SDM_ORDERSEQ_ERROR("4000","订单流水号必须在10~30位之间"),
    BILL_SDM_PRODUCTNO_ERROR("4000","手机号必须11位数字"),
    BILL_SDM_BANKFOUR_ERROR("4000","绑定快捷银行后四位必须4位数字"),
    BILL_SDM_BILLORGID_ERROR("4000","收费单位代码必须满足12~18位数字"),
    BILL_SDM_ACCOUNTNO_ERROR("4000","水电煤用户号必须小于40位字符"),
    BILL_SDM_ACCOUNTPWD_ERROR("4000","用户号密码必须6~50位字符"),
    BILL_SDM_FROMMONTH_ERROR("4000","开始账期必须6位日期格式"),
    BILL_SDM_ORDERDATE_ERROR("4000","订单日期格式有误"),
    BILL_SDM_ACCOUNTPAYDATE_ERROR("4000","账单扣款时间有误"),
    BILL_SDM_REMINDTYPE_PHONE_ERROR("4000","提醒手机号格式不正确，必须满足11位数字"),
    BILL_SDM_REMINDTYPE_EMAIL_ERROR("4000","提醒邮箱格式不正确"),
    BILL_SDM_REMINDTYPE_PHONEANDEMAIL_ERROR("4000","提醒手机/邮箱格式不正确"),
    BILL_SDM_SIGN_ISEXISTS("4006","已签约绑定过"),
    BILL_SDM_BIND_ISEXISTS("4008","绑卡信息不存在"),
    BILL_SEND_PHONE_NOTNULL("4000","手机号不能为空"),
    BILL_MCHNTCODE_NOTNULL("4000","商户号不能为空"),
    BILL_ACCEPTSEQNO_NOTNULL("4000","流水号不能为空"),
    BILL_INPUTTIME_NOTNULL("4000","操作时间不能为空"),
    BILL_SEND_PHONE_ERROR("4000","手机号格式不满足11位数字"),
    BILL_ACCEPTSEQNO_ERROR("4000","流水号必须小于20位字符"),
    BILL_MERCHANTID_ERROR("4000","商户号必须小于30位数字"),
    BILL_INPUTTIME_ERROR("4000","操作时间格式必须为[yyyyMMddHHmmss]"),
    BILL_SEND_PHONE_NOTEFFECT("403","您输入的验证码已失效,有效期为5分钟。请重新申请验证码!"),
    BILL_SEND_PHONE_MISMATCH("402","验证码校验失败!"),
    BILL_SEND_PHONE_FAIL("401","验证码下发出现异常!"),
    BILL_SEND_PHONE_SUCCESS("0000","验证码下发成功!"),
    BILL_MAC_ERROR("302","MAC校验失败!"),
    BILL_VAILCODE_NOTNULL("4000","验证码不能为空!"),
    BILL_PATPWD_NOTNULL("4000","支付密码不能为空!"),
    BILL_PATPWD_INPUTERROR("4000","支付密码输入有误!"),
    /*****end 水电煤账单业务***/
    /***JumpingYen 账单支付****/
    BILL_MERCHANT_ISNULL("-802", "商户号不能为空"),
    BILL_MERCHANTPWD_ISNULL("-802", "商户密码不能为空"),
    BILL_MERCHANTPHONE_ISNULL("-802", "商户客服号码不能为空"),
    BILL_ORDERSEQ_ISNULL("-802", "订单号不能为空"),
    BILL_ORDERREQTRANSEQ_ISNULL("-802", "请求流水号不能为空"),
    BILL_ORDERAMOUNT_ISNULL("-802", "订单总金额不能为空"),
    BILL_ORDERREQTIME_ISNULL("-802", "订单请求时间不能为空"),
    BILL_USERACCOUNT_ISNULL("-802", "用户账号不能为空"),
    BILL_PHONENUM_ISNULL("-802", "扣费号码不能为空"),
    BILL_VERIFYCODE_ISNULL("-802", "短信验证码不能为空"),
    BILL_GOODPAYTYPE_ISNULL("-802", "商品付费类型不能为空"),
    BILL_GOODSCODE_ISNULL("-802", "商品编码不能为空"),
    BILL_GOODSNAME_ISNULL("-802", "商品名称不能为空"),
    BILL_GOODSNUM_ISNULL("-802", "商品数量不能为空"),
    BILL_BACKMERCHANTURL_ISNULL("-802", "支付通知地址不能为空"),
    BILL_MAC_ISNULL("-802", "MAC不能为空"),
    BILL_MERCHNTANT_KEY_ISNULL("-802","商户key不存在"),
    BILL_MERCHANT_PWD_ISERROR("-802","商户密码错误"),
    BILL_MERCHANT_ISERROR("-802","商户[MERCHANTID]必须在10~30位之间"),
    BILL_MERCHANTPWD_ISERROR("-802","商户密码[MERCHANTPWD]必须在6~30位之间"),
    BILL_MERCHANTPHONE_ISERROR("-802","商户客服电话[MERCHNTPHONE]必须在10~30位之间"),
    BILL_ORDERSEQ_ISERROR("-802","订单号[ORDERSEQ]必须在10~30位之间"),
    BILL_ORDERREQTRANSEQ_ISERROR("-802","订单号[ORDERREQTRANSEQ]必须在10~30位之间"),
    BILL_ORDERAMOUNT_ISERROR("-802","订单金额[ORDERAMOUNT]不满足"),
    BILL_ORDERREQTIME_ISERROR("-802","订单请求时间[ORDERREQTIME]格式不正确"),
    BILL_USERIP_ISERROR("-802","用户IP[USERIP]格式不正确"),
    BILL_PHONENUM_ISERROR("-802","手机号码[PHONENUM]格式不正确"),
    BILL_VERIFYCODE_ISERROR("-802","短信验证码[VERIFYCODE]格式不正确"),
    BILL_GOODPAYTYPE_ISERROR("-802","商品付费类型[GOODPAYTYPE]格式不正确"),
    BILL_GOODSCODE_ISERROR("-802","商品编码[GOODSCODE]长度不能超过15"),
    BILL_GOODSNAME_ISERROR("-802","商品名称[GOODSNAME]长度不能超过20"),
    BILL_GOODSNUM_ISERROR("-802","商品数量[GOODSNUM]不能超过5位"),
    BILL_MAC_ISERROR("3007","MAC校验失败"),
    BILL_PAYPWD_ISNULL("-802","支付密码不能为空"),
    BILL_PAYPWD_ISERROR("-802","支付密码必须为6为数字"),
    Bill_PAYPWD_NOOPPEN("1006","支付密码支付未开通"),
    /***end 账单支付**/
    /**翼支付账户商户处理(账户鉴权，查询Key)**/
    EPAY_MCHNT_ISEXITS("0001","商户号不能为空"),
    EPAY_MCHNT_KEY_ISEXITS("0001","参数错误，查询不到该商户的key"),
    EPAY_KEY_FIND_SUCCESS("0000","Query SUCCESS!"),
    EPAY_KEY_FIND_FAUIL("0001","Query FAULT!"),
    EPAY_PHONTNO_ISNULL("4000","支付号不能为空"),
    EPAY_PHONTPWD_ISNULL("4000","支付密码不能为空"),
    EPAY_MAC_ISNULL("4000","Mac不能为空"),
    EPAY_MCHNT_ERROR("4000","商户号必须满足10~30位"),
    EPAY_PRODUCTNO_ERROR("4000","产品号必须满足10~30位"),
    EPAY_PRODUCTPWD_ERROR("4000","产品密码必须满足10~30位"),


    /**
     * 翼支付账户支付
     */
    EPAY_MERCHANT("-802","商户号不能为空"),
    EAPY_MERCHANTPWD("-802","商户密码不能为空"),
    EAPY_TYPE("-802","卡类型不能为空"),
    EAPY_ORDERNO("-802","订单号不能为空"),
    EAPY_ORDERREQNO("-802","订单请求流水号不能为空"),
    EAPY_TRANSAMT("-802","订单金额不能为空"),
    EAPY_BANKACCID("-802","卡号不能为空"),
    EAPY_BANKACCPWD("-802","卡密码不能为空"),
    EAPY_REQTIME("-802","订单请求时间不能为空"),
    EAPY_ORDERVALIDITYTIME("-802","订单有效截至时间不能为空"),
    EAPY_CLIENTIP("-802","客户IP地址不能为空"),
    EAPY_CUSTOMERID("-802","客户账号不能为空"),
    EAPY_BGURL("-802","后台通知地址不能为空"),
    EAPY_MAC("-802","Mac不能为空"),
    EAPY_MERCHANT_ERROR("-802","商户号必须在10~30位之间"),
    EAPY_MERCHANTPWD_ERROR("-802","商户密码必须在6~30位之间"),
    EAPY_ORDERSEQ_ERROR("-802","订单号必须在10~30位之间"),
    EAPY_ORDERREQTRANSEQ_ERROR("-802","订单请求流水号必须在10~30位之间"),
    EAPY_ORDERAMOUNT_ERROR("-802","订单金额格式不正确"),
    EAPY_ORDERREQTIME_ERROR("-802","订单请求时间格式不正确"),
    EAPY_ORDERVALIDITYTIME_ERROR("-802","订单有效截至时间格式不正确"),
    EAPY_CLIENTIP_ERROR("-802","客户IP地址格式不正确"),
    EAPY_CARDNO("-802","扣款账号不能为空"),
    EAPY_PASSWORD("-802","扣款密码不能为空"),
    EAPY_ORDERVALIDITYTIME_OVERTIME("-802","订单超时"),

    /**
     * chaiwenbo
     */
    /**---------------------------------------------------------------------**/
    REFUND_OLDPAY_200355("200355","原交易支付不成功，退款失败"),
    REFUND_BATCHPAY_200650("200650","批量支付不成功，退款失败"),
    REFUND_SIMPLEERROR_200651("200651","纯支付不成功，退款失败"),
    REFUND_BUSI_SUC_200652("200652","原交易业务成功,退款失败"),
    REFUND_ERROR_200275("200275","差错退款失败"),
    REFUND_REPEATERROR_200367("200367","此订单号不能重复退款"),
    REFUND_DATEERROR_200067("200067","支付日期不能晚于退款日期"),
    REFUND_AMONT_OVER_1119("1119","退款金额超出原始订单金额/支付时单笔金额超限"),
    REFUND_PART_ERROR_3005("3005","银行已注册，但未开通部分退款业务"),
    REFUND_ING("1101","此退款订单正在处理中"),
    REFUND_ERROR_1105("1105","订单请求记录不存在或状态不为请求中"),

//    REFUND_ONLINEERROR_200652("200652","不支持线上退款"),

//    REFUND_ERROR_31006("31006","机构退款失败"),
//    REFUND_ERROR_31009("31009","退款交易查找失败"),
//    REFUND_ERROR_31010("31010","跨日处理退款失败"),
//    PAY_ERROR_31013("31013","查找机构退款信息异常"),


    /**---------------------------------------------------------------------**/

    /**@author  JumpingYen -----end **/
    /**---------------------------------------------------------------------**/
    /** 永不停机错误码解释 */
    ERR_PARAM("1903","参数校验失败"),
    ERR_PARAM7("1907","参数校验失败"),
    ERR_REQ_XML("1902","报文解析错误(request_xml不符合规定)"),
    ERR_DATA_SIGN("1901","数据签名或验签错误"),
    ERR_ENC_DEC("1905","报文加密或解密错误"),
    ERR_SYSTEM("1900","系统错误"),
    ERR_SER_TYPE("1904","服务类型错误"),
    ERR_VALIDATE("1903","参数较验失败"),

    ERR_PREAUTH_21001("21001","商户号[MerchantID]为空"),
    ERR_PREAUTH_21007("21007","商户密码[commPwd]为空"),
    ERR_PREAUTH_21008("21008","银行卡后四位[bankAccId]为空"),
    ERR_PREAUTH_21009("21009","业务类型[busiType]为空"),
    ERR_PREAUTH_21010("21010","后处理流水号[POSTID]为空"),
    ERR_PREAUTH_21011("21011","MAC信息[MAC]为空"),
    ERR_PREAUTH_21012("21012","商户号[MerchantID]格式有误"),
    ERR_PREAUTH_21013("21013","商户密码[commPwd]不存在"),
    ERR_PREAUTH_21014("21014","商户密码[commPwd]不正确"),
    ERR_PREAUTH_21015("21015","银行卡号后四位[BankAccId]格式有误"),
    ERR_PREAUTH_21002("21002","订单号[orderNo]为空"),
    ERR_PREAUTH_21016("21016","订单号[orderNo]格式有误"),
    ERR_PREAUTH_21003("21003","子订单号[orderReqNo]为空"),
    ERR_PREAUTH_21017("21017","子订单号[orderReqNo]格式有误"),
    ERR_PREAUTH_21004("21004","订单日期[orderDate]为空"),
    ERR_PREAUTH_21018("21018","订单日期[orderDate]格式有误"),
    ERR_PREAUTH_21019("21019","原预授权订单号[oldOrderId]为空"),
    ERR_PREAUTH_21020("21020","原预授权订单号[oldOrderId]格式有误"),
    ERR_PREAUTH_21021("21021","原预授权请求支付号[oldOrderPayId]为空"),
    ERR_PREAUTH_21022("21022","原预授权请求支付号[oldOrderPayId]格式有误"),
    ERR_PREAUTH_21023("21023","預授权后处理请求流水号[orderPostId]为空"),
    ERR_PREAUTH_21024("21024","預授权后处理请求流水号[orderPostId]格式有误"),
    ERR_PREAUTH_21025("21025","卡号[CardNo]为空"),
    ERR_PREAUTH_21026("21026","银行卡有效期[Vaidate]为空"),
    ERR_PREAUTH_21027("21027","CVV2[Cvv2]为空"),
    ERR_PREAUTH_21028("21028","证件类型[CardType]为空"),
    ERR_PREAUTH_21029("21029","证件号码[CardNo]为空"),
    ERR_PREAUTH_21030("21030","开户姓名[CardName]为空"),
    ERR_PREAUTH_21031("21031","证件号码[CardNo]格式错误"),
    ERR_PREAUTH_21005("21005","处理类型[procType]为空"),
    ERR_PREAUTH_21006("21006","查询信息不正确或者原始订单不存在"),

    ORDER_ID_ERR("000012","输入的订单编码长度必须为16~20位"),
    ORDER_MOBILENO_FORMAT_ERR("000009","手机号格式不满足11位"),
    ORDER_MOBILENO_IS_NULL_ERR("000010","手机号码不能为空"),
    ORDER_START_TIME_ERR("000011","开始时间格式不满足14位数字"),
    ORDER_END_TIME_ERR("000013","结束时间格式不满足14位数字"),
    ORDER_START_END_NUM_ERR("000014","查询起始序号不能大于查询截止序号"),

    /**短信下发响应码**/
    ORDER_TIME_ERR("000015","开始时间不能大于结束时间"),
    ORDER_END_SYSTIME_ERR("000016","开始时间不能大于当前系统时间!"),
    ORDER_START_INDEX_ERR("000017","开始索引为正整数"),
    ORDER_END_INDEX_ERR("000018","结束索引为正整数"),
    ORDER_SUCCESS("000000","成功"),
    ORDER_QUERY_NULL_ERR("000000","成功"),
    ORDER_RECORD_NULL_ERR("4000","无订单记录"),
    ORDER_PER_ACCOUNT_ERR("9999","账单平台出现异常，请稍后重试!"),

    ORDER_IS_NULL_ERR("2009","订单号不能为空"),
    ORDER_MERCHANTID_ERR("-802","商户号格式不正确"),
    ORDER_TRANSEQ_ERR("-802","订单请求支付流水号不满足10~30位"),
    ORDER_PHONE_CODE("00","验证码下发成功"),
    /**短信下发响应码**/
    SMS_SEND_EXC("9999","短信下发手机异常!"),
    SMS_SEND_TYPE("9999","短信下发类型有误!"),
    SMS_CODE_TYPE("9999","短信验证码类型有误!"),
    SMS_SEND_PARAM("9999","短信下发参数有误!"),
    SMS_UPPER_COUNT("402","短信下发当天超过上限次数!"),
    SMS_CHECK_FAIL("402","验证码不存在或已失效，请重新获取。"),
    SMS_VALID_COUNT_lIMIT("402","短信验证码错误次数超限，请重新获取。"),
    SMS_FAIL("409","抱歉，因短信频繁发送，等待60分钟后可重新发送。"),

    /** dubbo 接入服务响应解释 */
    DUBBO_INVOKE_SUCCESS("0000","服务调用成功响应结果为空"),
    DUBBO_INVOKE_ERROR("9999","服务调用失败"),

    /**快捷支付错误返回码**/
    QUCIK_LIMIT_EXP("QLE_4000","快捷限额验证异常"),
    QUCIK_OVER_SUM("QOS_4001","超过当日支付金额"),
    QUCIK_OVER_TIMES("QOT_4002","超过当日支付次数"),
    QUCIK_BUSI_TYPE("QBT_4003","交易类型不能为空"),
    QUCIK_BUSI_TYPE_ERROR("4004","非法交易类型"),

    QUCIK_PARAMS_ERROR("100001",":参数异常"),
    QUCIK_ENCRYPT_ERROR("100002",":加密信息错误"),
    QUCIK_BINDINGINFO_ERROR("100003",":绑卡信息有误"),

    QUCIK_SMS_ERROR("200001",":短信发送失败"),
    QUCIK_VERIFYCODE_ERROR("200002",":验证码错误"),
    QUCIK_VERIFYCODE_INVALID("200003",":验证码已失效"),
    QUCIK_PLATFORM_SMS("200004","01:平台短信"),
    QUCIK_BANK_SMS("200005","02:银行短信"),

    QUCIK_QUERY_ERROR("300001",":查询信息失败"),
    QUCIK_QUERY_NOTEXIST("300002",":客户不存在"),

    QUCIK_SERVERTIMEOUT("900001",":服务响应超时"),
    AREA_CODE("ARE802","地区代码[areaCode]不能为空"),
    TXN_PASSWORD("TXN802","支付密码鉴权密码不能为空"),
    ACCEPT_ORGCODE("ORG802","受理机构不能为空"),
    MERCHANT_CODE("MER802","商户号不能为空"),
    TERMINAL_NO("TER802","终端号不能为空"),
    CITY_CODE("CIT802","城市代码[cityCode]不能为空"),
    BR9999("BR9999","翼支付账户充值失败"),
    MR9999("MR9999","通讯账户充值失败"),
    ID_NO("IDN802","身份证号不能为空"),
    PRODUCT_NO("PRO802","手机号码不能为空"),
    BANK_CARDNO("CAR802","银行卡号不能为空"),
    TXN_TYPE("TYP802","交易类型不能为空"),
    ERROR_PWD("9997","验证商户密码失败"),
    SYSTEM_ERROR("BF9999"," 系统异常，请稍后再试!"),
    ORDER_ERROR("OD9998","订单信息不存在"),
    ORDER_DATE_ERROR("OD9996","交易查询时间间隔不能超过半年"),
    ORDER_SUCC("000000","充值状态查询成功"),
    OLD_CHARGE_DATETIME("OD9997","原充值受理时间格式有误"),
    BALANCE_ERROR("OD9999","账户余额查询异常"),
    ACCOUNT_KEY("ACC802","账户号不能为空"),
    ACCOUNT_KEYTYPE("KEY802","账户类型不能为空"),
    ACCEPT_ORDER_REQ_NO("ORD802","受理请求流水号不能为空"),
    ERROR_IP("9917","IP无权限"),

    /**易信快捷错误码*/
    EASYPAY_SUCC("0000","成功"),
    EASYPAY_SYS_ERR("9999","系统忙,请稍后再试"),
    EASYPAY_PARAMS_ERR("1001","参数异常"),
    EASYPAY_SIGN_ERR("4006","签名错误"),
    EASYPAY_ACTION_NAME_ERR("1003","操作名称不匹配"),
    EASYPAY_QUERY_CARD_ERR("1004","开卡行信息不存在"),
    EASYPAY_BANK_LIST_INEXIST_ERR("1004","支付银行列表信息不存在"),
    EASYPAY_PAY_ORDER_ERR("1005","下单失败"),
    EASYPAY_AUTH_CODE_IS_NULL("4113","验证码为空"),
    EASYPAY_AUTH_CODE_ERROR("4114","验证码错误"),
    EASYPAY_BANK_ID_ERROR("1006","不支持该银行类型"),
    CHARGE_ID_IS_NULL("4120","第三方支付平台充值订单号为空"),
    NO_QUICK_PAY_INFO("4129","无此快捷信息"),
    AUTH_CODE_ERROR_TO_MUCH("5103","验证码错误次数太多"),
    ORDER_NOT_FOUND("5120","订单信息为空"),
    AMOUNT_EXCEED_PER_LIMIT("5161","金额超限"),
    AMOUNT_EXCEED_SUM_LIMIT("5161","次数超限"),
    CARD_IS_LOCKED_ERR("5149","此卡已经被锁"),
    BINDING_CARD_IS_NULL("5150","绑卡信息为空"),
    ACCOUNT_RISK_IS_NULL("5151","消费限额为空"),
    TRADE_TYPE_NOT_FOUND("5152","交易类型不支持"),
    ORDER_AMOUNT_ERROR("5153","订单金额错误"),
    CURRENCY_TYPE_ERROR("5154","货币类型错误"),
    EASYPAY_BINDING_ERROR("5156","绑定失败"),
    EASYPAY_UNBINDING_ERROR("5157","解绑失败"),
    EASYPAY_OPEN_ERROR("5158","开户失败"),
    EASYPAY_PAY_ERROR("5159","支付失败"),

    EASYPAY_SENDSMS_SUCC("2000","短信发送成功"),
    EASYPAY_SENDSMS_ERR("2001","短信发送失败"),
    EASYPAY_VALIDAUTHCODE_ERR("2001","短信验证失败"),

    EASYPAY_DRAWCASH_ERR("3001","提现失败"),
    EASYPAY_REPEATDRAWCASH_ERR("3002","提现订单流水号重复"),
    EASYPAY_DRAWCASHINSERT_ERR("3003","提现申请入库失败"),
    EASYPAY_OUTBANKID_ERR("3004","银行代码错误"),
    EASYPAY_OUTCITYID_ERR("3005","城市代码错误"),
    EASYPAY_REFUND_ERR("1000","退款失败"),

    //翼支付账户充值检查错误码
    ACCOUNT_CHARGE_CHECK_ERROR("BR9999","账户充值检查校验失败"),
    ACCOUNT_CHARGEAMOUNT_CHECK_ERROR("BR9999","翼支付账户充值金额超限"),
    ACCOUNT_PAYAMOUNT_CHECK_ERROR("BR9999","翼支付账户消费金额超限"),
    ACCOUNT_PAYNUMBER_CHECK_ERROR("BR9999","翼支付账户当天可交易次数超限"),
    /** 业务：第三方超时 */
    BS081010("BS081010", "业务：第三方超时"),

    //易信错误码
    BANK_CODE_MAPPING_ERROR("5145","银行类型错误"),
    QUERY_BIND_CARD_INFO_ERROR("5146","查询绑卡信息出错"),
    PHONE_APANAGE_ERROR("5147","手机归属地异常"),
    OPEN_ACCOUNT_ERROR("5148","翼支付开户异常"),
    BANK_VALIDATE_ERROR("4123","银行验证失败"),

    BF111199("111999","原始订单金额与退款金额不一致"),
    BF111198("111998","原交易扣款失败，不支持退款"),
    /**银行错误返回码 start**/
    BANK_SIGNATURE_ERROR("BK400001","签名失败"),

    BANK_SIGNATURE_VERIFICATION_ERROR("BK400002","验签失败"),

    BANK_SUCCESS("BK000000","交易成功"),
    BANK_ACCEPTED_SUCCESS("BK111111","受理成功"),
    BANK_ERROR("BK999999","交易异常"),
    /**银行错误返回码 end**/
    /**
     * 缴费助手t_order表 订单数据入库前验证是否存在
     */
    ORDER_ERR("CF9999","订单数据已存在"),
    ORDER_SUC("SU9999","订单数据验证通过"),
    ORDER_STATUS_REQUEST("RQ9999","交易请求"),

    SYNC_DESTROY_BILL_SUCCESS("0000", "同步销账成功"),
    SYNC_DESTROY_BILL_FAIL("0001", "同步销账失败"),
    CONN_HTTP_EXCEPTION("0011", "销账时HTTP异常"),
    CANCEL_REPEATERROR_ERROR("200367","此订单号不能重复撤销"),
    BS081011("BS081011", "调用远程服务异常"),
    BS081012("BS081012", "dubbo返回结果异常"),

    /**
     *账单中心
     */
    TRAUST_SUC("0000","开通成功"),
    TRAUST_ERR("0001","开通失败"),
    TRAST_ERR_NOTEXISIT("0004","数据不存在"),
    TRAUST_ERR_EXISIT("0002","已开通,请勿重复开通"),
    TRAUST_ERR_PARAM("0003","参数错误"),


    BARCODE_VALIDATE_ERROR("BARCODE_VALIDATE_ERROR","条形码验证异常"),
    BARCODE_STORE_CODE_IS_EMPTY("BARCODE_STORE_CODE_IS_EMPTY","条码门店号不能为空"),
    TRANS_PAYORG_EXCEPTION("1001","orgbank not find"),

    /**
     * 担保交易的错误码
     */
    MERCHT_STATUS_ERROR("0001","非担保商户或担保状态未开启"),
    PARAM_NULL_ERROR("0002","参数不能为空"),
    PARAM_VALIDATE_EXEPTION("0003","校验发生异常"),
    QUERY_DB_RECORD("0004","查询交易信息异常"),
    TRANS_STATUS_ERROR("0005","该笔交易不存在或者交易不成功"),
    TRANS_SETTLESTATUS_ERROR("0006","该笔交易清算状态异常，需为未清算状态"),
    TRANS_UP_EXEPTION("0007","担保确认更新库异常"),
    TRANS_RESETTLE("0008","请勿重复担保确认"),
    SERVICE_EXEPTION("0009","业务处理异常"),
    SERVER_EXEPTION("0010","服务器异常"),

    ORDER_STATUS_ERROR("0001","订单状态错误"),
    PAYER_INFO_ERROR("BE110046","付款方信息有误"),
    PAYEE_INFO_ERROR("BE110045","收款方信息有误"),

    /**
     * 客户端商户割接业务
     */
    CLIENT_MCHNT_CUT_BE120045("BE120045", "业务请求地址不能为空"),
    CLIENT_MCHNT_CUT_BE120046("BE120046", "业务请求流水不能为空"),

    /**
     * IVR交易网关返回码
     */
    IVR_PREAUTH_SUCCESS("000000","成功"),
    IVR_PAY_SUCCESS("000000","成功"),
    CARD_XY_ERR("999999","不支持信用卡代扣！！");

    @Getter
    @Setter
    // 响应码
    private String resCode;

    @Getter
    @Setter
    // 响应解释
    private String resDescription;

    private RespCode(String resCode, String resDescription) {
        this.resCode = resCode;
        this.resDescription = resDescription;
    }

    public static RespCode from(String code){
        for (RespCode respCode : RespCode.values()) {
            if(Objects.equal(respCode.getResCode(), code)){
                return respCode;
            }
        }
        return null;
    }

    public static String getRespCodeAndDesc(RespCode respCode){
        return respCode.getResCode()+respCode.getResDescription();
    }

    public static String getRespCodeAndDesc(RespCode respCode,String respDesc){
        return respCode.getResCode()+":"+respDesc;
    }
}
