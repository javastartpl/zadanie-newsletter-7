package pl.pawsaj.home.bll.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by Paweł Sajnóg on 18 mar 2019.
 */
@Configuration
@ComponentScan({"pl.pawsaj.home.bll.services"})
public class SpringConfigBll {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    protected void init() {
        logger.info("INITIALIZE ServiceConfig");
    }
}
