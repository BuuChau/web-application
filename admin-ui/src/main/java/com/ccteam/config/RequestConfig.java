package com.ccteam.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * Created by cuongnv on 11/17/16.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RequestConfig {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    EmbeddedServletContainerCustomizer containerCustomizer() throws Exception {
        logger.info("=== Start containerCustomizer() of RequestConfig ===");
        return (ConfigurableEmbeddedServletContainer container) -> {
            if (container instanceof TomcatEmbeddedServletContainerFactory) {
                TomcatEmbeddedServletContainerFactory tomcat = (TomcatEmbeddedServletContainerFactory) container;
                tomcat.addConnectorCustomizers(
                        (connector) -> {
                            connector.setMaxPostSize(10000000); // 10 MB
                        }
                );
                logger.info("=== End containerCustomizer() of RequestConfig ===");
            }
        };
    }

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        logger.info("=== Start multipartConfigElement() of RequestConfig ===");
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("10MB");
        factory.setMaxRequestSize("10MB");
        MultipartConfigElement configElement = factory.createMultipartConfig();
        logger.info("=== End multipartConfigElement() of RequestConfig ===");
        return configElement;
    }

}
