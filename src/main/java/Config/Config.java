package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.Books;

@Configuration
public class Config {
@Bean(initMethod="init",destroyMethod="destory")
public Books Bk(){
	return new Books();
}
}
