package com.niuzj.springbootsession;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 开启session共享
 * @author niuzj
 * @date 2019/4/25 14:39
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
