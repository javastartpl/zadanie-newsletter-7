package pl.pawsaj.home.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pl.pawsaj.home.bll.config.SpringConfigBll;

import javax.annotation.PostConstruct;

/**
 * Created by Paweł Sajnóg on 18 mar 2019.
 */
@Configuration
@ComponentScan({"pl.pawsaj.home.api.controllers"})
@Import({SpringConfigBll.class})
public class SpringConfig {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    protected void init() {
        logger.info("INITIALIZE SpringConfig");
    }
}
