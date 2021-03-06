# retailscm-biz-suite
零售供应链中台基础系统，一共大约130万行代码，管理界面通过javascript高阶函数定制，Java后台主要通过增加方法或者重写已经存在的大量方法来灵活定制。

本系统目前大约有130万行代码，是用自研知识图谱和因果网络处理系统生成高可维护源代码。集成了阿里云OSS服务和短信服务。


概念和关系请请见：https://demo.doublechaintech.com/admin/retailscm/entities.html , 图比较大，需要拖动



[开发指南 ](/DEVELOP.md)

## 演示地址

https://demo.doublechaintech.com/admin/retailscm/#/home

下面为16种角色建立了演示账户，每种角色都可以登录，代表不同客户需要的不同资源。

| 角色        | 用户名                            | 密码                                |
| ------------- |:-------------------------------------------:|:-----------------------------------------:|
|双链小超全国运营中心|13900000001|DoubleChain!y1|
|双链小超省中心|13900000002|DoubleChain!y1|
|双链小超城市服务中心|13900000003|DoubleChain!y1|
|城市合伙人|13900000004|DoubleChain!y1|
|潜在的客户|13900000005|DoubleChain!y1|
|双链小超|13900000006|DoubleChain!y1|
|生超会员|13900000007|DoubleChain!y1|
|产品供应商|13900000009|DoubleChain!y1|
|仓库|13900000017|DoubleChain!y1|
|货架|13900000018|DoubleChain!y1|
|运输车队|13900000019|DoubleChain!y1|
|账套|13900000021|DoubleChain!y1|
|会计凭证|13900000022|DoubleChain!y1|
|工资等级|13900000023|DoubleChain!y1|
|员工|13900000024|DoubleChain!y1|
|用户域|13900000025|DoubleChain!y1|


## bizcore: 服务器端核心代码项目， Business Core

后端 Java/Spring/Redis/MySQL/ArrangoDB/Kafka
Java 源代码在bizcore/WEB-INF/ 下


![ScreenShot](/doc/backend.png)
````
caf_core_src: 通用框架库核心代码，包含技术框架，基础设施
caf_custom_src: 通用框架库，主要包含配置文件
retailscm_core_src: 零售业务核心代码
retailscm_custom_src: 零售业务定制代码，如果要定制，在此处增加类，继承retail_core_src的相应类，可以调用或者重写父类，core里面的类提供大量可以重用的方法。
````

## bizui：中台集成界面项目， Business UI，不是闭嘴！
前端 React/dvajs/antd/echarts/Redux


![ScreenShot](/doc/homescreen.png)
![ScreenShot](/doc/rootapp.png)

## 核心特性

* 高度可定制，增加、修改、屏蔽界面和后台功能不必更改生成代码，只是需要在custom层加入代码即可
* 模型完整，管理多个对象的整个生命周期

## 核心功能
* 平台管理，平台鸟瞰视图
* 业务开拓管理（CRM），管理联系，销售进度，完成合伙人转化
* 小超会员管理，会员管理订单，支付，邮寄地址等
* 人力资源管理（HRM），可以管理入职，绩效考核，工资发放，经验，教育经历，培训考试记录
