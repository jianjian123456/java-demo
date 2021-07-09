
    java -jar xxx.jar --server.port=8888 --spring.profiles.active=test
    主类Application.java在默认情况下就无法扫描到com.example.myproject.web中的Controller定义，就无法初始化Controller中定义的接口。
    在命令行方式启动Spring Boot应用时，连续的两个减号--就是对application.properties中的属性值进行赋值的标识。所以，java -jar xxx.jar --server.port=8888命令，等价于我们在application.properties中添加属性server.port=8888。
    很多将配置内容外部化的框架和工具，如Spring Cloud Config就是其中之一，为了安全配置内容不对开发人员可见。

####Spring Boot为了能够更合理的重写各属性的值，使用了下面这种较为特别的属性加载顺序：

	命令行中传入的参数。
	SPRING_APPLICATION_JSON中的属性。SPRING_APPLICATION_JSON是以JSON格式配置在系统环境变量中的内容。
	java:comp/env中的JNDI属性。
	Java的系统属性，可以通过System.getProperties()获得的内容。
	操作系统的环境变量
	通过random.*配置的随机属性
	位于当前应用jar包之外，针对不同{profile}环境的配置文件内容，例如：application-{profile}.properties或是YAML定义的配置文件
	位于当前应用jar包之内，针对不同{profile}环境的配置文件内容，例如：application-{profile}.properties或是YAML定义的配置文件
	位于当前应用jar包之外的application.properties和YAML配置内容
	位于当前应用jar包之内的application.properties和YAML配置内容
	在@Configuration注解修改的类中，通过@PropertySource注解定义的属性
	应用默认属性，使用SpringApplication.setDefaultProperties定义的内容

####配置文件绑定

	简单类型
	    spring.jpa.database-platform=mysql
	List #或者逗号分隔也行
	    spring.my-example.url[0]=http://example.com
	    spring.my-example.url[1]=http://spring.io
	Map
	    spring.my-example.foo=bar
	    spring.my-example.hello=world

#swagger
    通过@Api，@ApiOperation注解来给API增加说明、通过@ApiImplicitParam、@ApiModel、@ApiModelProperty注解来给参数增加说明。
    swagger地址：http://localhost:8088/swagger-ui.html#/