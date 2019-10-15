# `SSM`
### ssm (Spring mvc + Spring + Mybatis),他是标准的MVC模式，将整个系统划分为表现层、控制层、业务逻辑层、数据库持久层。
MVC（Model view controller）
##   1） 使用spring mvc负责请求的转发和视图管理
- 1.客户端发送请求到DispacherServelt（分发器）
- 2.由DispacherServelt控制器查询HanderMapping，找到处理请求的Controller
- 3.Controller调用业务逻辑处理后，返回ModelAndView
- 4.DispacherServelt查询视图解析器,找到ModelAndeView指定的视图
- 5.视图负责将结果显示到客户端
   !(https://github.com/Jumpword/ssm_template/blob/master/Photoes/1.png)
##  2） spring实现对业务对象的管理
##  3） mybatis作为数据对象的持久化引擎
