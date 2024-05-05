package com.kabin.config;

import com.kabin.Computer;
import com.kabin.Desktop;
import com.kabin.Devs;
import com.kabin.Laptop;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configurable
public class AppConfig {

    @Bean(name = "com2")
  //  @Scope("prototype")
    //can give multiple name as well
    //@Bean(name = {"com2", "desktop1", "Beast"})
    public Desktop desktop(){
        //by default method name is bean name
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }


    @Bean
    public Devs devs(Computer com) {  //also can be done through @Qualifier("bean_name") instead of @Primary
        Devs devs = new Devs();
        devs.setAge(33);
        devs.setCom(com);

        return devs;
    }



}
