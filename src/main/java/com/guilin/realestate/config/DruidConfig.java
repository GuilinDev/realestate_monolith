package com.guilin.realestate.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.google.common.collect.Lists;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Druid连接池的配置文件
 */
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.druid")//同spring.datasource，将druid与application.properties文件绑定，可以写spring.druid的配置
    @Bean(initMethod = "init",destroyMethod = "close")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        //将慢日志加入到Druid连接池中
        dataSource.setProxyFilters(Lists.newArrayList(statFilter()));
        return dataSource;
    }

    /**
     * 慢日志配置
     * @return
     */
    @Bean
    public Filter statFilter() {
        StatFilter filter = new StatFilter();
        filter.setSlowSqlMillis(1);//慢日志的设定时间
        filter.setLogSlowSql(true);//需要打印慢日志
        filter.setMergeSql(true);//将慢日志合并
        return filter;
    }

    /**
     * 添加一个Druid监控
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    }
}
