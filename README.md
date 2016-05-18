# dubbo-api
dubbo-api 按e服务方式创建gralde项目

按最近公司的架构，自己搭建这样个样例。主要是将服务API层进行了区分，解耦接口与模型层.

其中pojo层与vo层都是用来传递参数用法,API-facade层与service是两个概念。API-facade层有统一的规范，可以返回统一结果:

Result {

     int statecode;

     int stateText;

     T data;

}

建议把vo与model及pojo层分开，用不同名称如 UserInfoVo,UserInfo,UserInfoPo

如果使用dubbo来构建。从分包层次来说。应该有：

model
对应持久化对象。mybatis的对象或是hibernate对象
dao 
对应数据库访问层。一般是mapper或是dao或是repository
bus
facade实现层
service 层
pojo层
facade
API service层 
API vo层 （可以看成model型层复制）
controller
提供web服务
common
定义通用的util
定义通用的api -result
一般来说可以有这层次。还可以多一层。将facade再包装一层。叫整合api层。

如何使用：

创建数据库test,创建用户 。可修改application.properties
准备好zookeeper,默认地址：localhost:2181
sample-app下有个deployer/dubbo-admin-2.5.4.war.在tomcat中部署
启动提供者：sample-app中com/tdu/app/run/Application.java
启动消费者:   sample-app2中fcom/run/Application.java
测试：http://localhost:9081/dubboapp2/test/call
如何下载：

https://github.com/tangdu/dubbo-api.git

如何初始化：

执行sample-master下的init_eclipse.sh 或是在项目下执行 gradle eclipse

-------关于-----------

关于面向SOA 我理解是：项目无状态、提供API。权限等再包装上层，所谓网关。

由这层可以做权限 、验证、加密、限流、统计。

对于完整项目来说，应该还要集成缓存 、job、UI、中间件、message

分享几个框架：redis、ehcache、quartz或Elastic-job、zookeeper、RocketMQ、bootstrap、sui3
