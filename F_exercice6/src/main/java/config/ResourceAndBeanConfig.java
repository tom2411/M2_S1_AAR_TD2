package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import services.*;

import javax.faces.view.facelets.FaceletsAttachedObjectHandler;

@Configuration
public class ResourceAndBeanConfig {

    @Bean
    public Compteur compteur(){return new Compteur();}

    @Bean Facade facade(){
        Facade facade = new Facade();
        facade.setCompteur(compteur());
        return facade;
    }
}
