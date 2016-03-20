# 开发规范
====

## 项目开发中涉及到相关主要的技术框架
项目管理:Maven
版本管理:Git
配置管理:AutoConfig
中间件:Zookeeper,RabbiMQ,Redis
框架:Spring,SpringMVC,Mybatis,Netty,Dubbo,Cxf,Axis2


## 项目介绍
    * 项目内部模块采用DUBBO进行服务通信,以jar包形式提供API给其他模块调用
    * 项目依赖关系及启动顺序:
         persistence -> gateway-bank-forwarding -> gateway-bank -> manager
         -> gateway-business -> notify -> service -> scheduledtasks(本地可不启动)
         -> entry-dubbo -> entry-http || entry-ws

## 模块介绍
    ##  commons 公共辅助
        *  及所谓的工具模块,提供公用辅助服务
        *  内部错误码和内部各业务类型的枚举值
    ##  persistence 数据访问层
        *  所有与数据库交互(CRUD)全部放在这一层
        *  所有数据处理类mapper不允许出现执行物理删除的delete方法，如果有delete方法，必须是执行逻辑删除的update语句；
        *  表名以T_*** 命名
        *  mapper配置中尽量避免多表大数据关联查询,逻辑尽量在JAVA代码中处理
    ##  gateway-bank-forwarding 银行报文转发
        *  银行接口日常开发中,有个别银行证书在同JVM造成冲突,新起项目进行报文转发
        *  银行接口开发时尤其注意各个接口的状态处理
    ##  gateway-bank 银行网关层
        *  与各个银行进行通讯,数据交互(支付,退款,订单查询等等)
    ##  gateway-manager 查询及管理服务层
        *  封装与外部各种查询服务,如账户信息,用户信息等等
    ##  gateway-business 业务网关层
        *  与各个业务方进行通讯,数据交互(手机充值,账户充值等等)
        *  业务接口开发时尤其注意各个接口的状态处理
    ##  notify 通知服务层
        *  提供商户通知处理服务
    ##  service 核心业务逻辑处理层
        * 所有和业务相关的逻辑都放在这一层
        * 统一交易引擎的所有产品及对外服务调用由service来处理各种业务逻辑,上层服务来驱动
    ##  scheduledtasks 定时任务层
        * 各种后台定时job业务处理(银行补单,补业务,托收业务等等)
        * 考虑到数据一致问题目前只部署一台提供服务
    ##  entry-dubbo 前置接入层(dubbo接口)
        * 提供服务给内部其他系统调用
        * 以dubbo服务方式提供API
        * 参数及基本业务规则校验
    ##  entry-http 前置接入层(http接口)
        * 提供服务给前端及外部商户调用
        * 以http协议提供API服务
        * 参数及基本业务规则校验
    ##  entry-ws 前置接入层(webservice接口)
        * 提供服务给前端及外部商户调用
        * 以webservice协议提供API服务
        * 参数及基本业务规则校验

## 编码及开发中注意事项
    * 所有你编写过的任何代码一定要有注释,注释要清晰明了,避免后期维护出问题,且无用代码及时清除
    * 代码过程中拒绝硬编码,通过常量或枚举来处理
    * 方法体尽量保持简洁,类名方法及变量取名尽量做到见名知意
    * 所有异常捕获均由最外层进行抓取,内部逻辑判断以异常形式进行抛出并设定错误代码
    * Response使用场景:提供dubbo服务时用来封装API返回值(跨模块),内部模块方法调用不建议使用Response来封装返回值
    * 在需要的地方使用new构造对象,非必要时不要提前构造对象
    * 防御式编程思想,尽早发现问题并返回错误编码
    * 日志打印,保证入参出参具有日志输出,方便后续问题协查及定位,敏感信息脱敏打印
    * 代码中和环境无关的相关配置尽量避免放到配置文件中
    * 接口调用时必须明确各个接口响应的状态(区分好状态[通信状态和最终业务实际状态],并做正确的业务逻辑处理)
    * 接口变动及升级请做好对应的文档变更并及时同步至Git上,保证对应接口和文档中的一致性

### 消除IDE的警告
    * 没有用到的变量、方法去掉
    * 没有用到注释请直接去掉
    * List,Map 请指定具体的类型,如List<String>,Map<String,Integer>
    * 序列化要求:通过接口传递的对象必须序列化,且务必加上serialVersionUID:
        （1）setting->Inspections->Serialization issues，将serialzable class without "serialVersionUID"打上勾
        （2）将光标放到类名上，按atl＋enter键，就会提示生成serialVersionUID了。

## 类注释模板
    * 类注释IDEA开发工具添加方式为：步骤：settings-->file and code Templates-->选择incudes 进行配置

```
/**
 * 类注释
 *
 * <ul>
 * <li>方法列表</li>
 * </ul>
 *
 * @author ${USER}
 * @version 1.0.0 createTime: ${DATE} ${TIME}
 * @see 链接到其他资源
 * @since 1.0
 */
 ```

