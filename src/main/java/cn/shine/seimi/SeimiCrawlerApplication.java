package cn.shine.seimi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.shine.seimi.dao")
public class SeimiCrawlerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeimiCrawlerApplication.class, args);
	}
}
