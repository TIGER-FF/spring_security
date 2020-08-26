package com.tigerff.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**自动建表的配置：
 * @MapperScan({"com.gitee.sunchenbin.mybatis.actable.dao.*"} )
 * @ComponentScan({"com.gitee.sunchenbin.mybatis.actable.manager.*","com.tigerff.security"})
 *
 * @MapperScan加上自己的mapper
 * @ComponentScan中加上自己项目包名
 *
 * 进行安全控制
 * 1、引入SpringSecurity；
 * <dependency>
 *    <groupId>org.springframework.boot</groupId>
 *    <artifactId>spring-boot-starter-security</artifactId>
 * </dependency>
 * 2、编写SpringSecurity的配置类；
 * 		@EnableWebSecurity   extends WebSecurityConfigurerAdapter
 * 3、控制请求的访问权限：
 * 		configure(HttpSecurity http) {
 * 		 	http.authorizeRequests().antMatchers("/").permitAll()
 * 		 		.antMatchers("/level1/**").hasRole("VIP1")
 * 		}
 * 4、定义认证规则：
 * 		configure(AuthenticationManagerBuilder auth){
 * 		 	auth.inMemoryAuthentication()
 * 		 		.withUser("zhangsan").password("123456").roles("VIP1","VIP2")
 * 		}
 * 5、开启自动配置的登陆功能：
 * 		configure(HttpSecurity http){
 * 		 	http.formLogin();
 * 		}
 * 6、注销：http.logout();
 * 7、记住我：Remeberme()；
 */
@MapperScan({"com.gitee.sunchenbin.mybatis.actable.dao.*","com.tigerff.security.mapper"})
@ComponentScan({"com.gitee.sunchenbin.mybatis.actable.manager.*","com.tigerff.security"})
@EnableWebSecurity
@EnableCaching//开启缓存
@SpringBootApplication
public class SpringbootSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurityApplication.class, args);
    }

}
