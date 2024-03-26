package priv.jesse.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 程序启动入口
 *
 * @ServletComponentScan 设置启动时spring能够扫描到我们自己编写的servlet和filter, 用于Druid监控
 * @MapperScan("com.imlaidian.springbootdemo.dao") 扫描mybatis Mapper接口
 * @EnableScheduling 启用定时任务
 * @EnableTransactionManagement 开启事务
 *
 * @author zk
 * @date 2023/9/18 11:13
 */
@ServletComponentScan
@EnableConfigurationProperties
@EnableTransactionManagement
@SpringBootApplication
public class MallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
		System.out.println("启动成功！访问地址：http://127.0.0.1:8081/mall");
	}
}
