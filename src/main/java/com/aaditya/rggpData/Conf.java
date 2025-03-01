package com.aaditya.rggpData;


    import org.springframework.web.servlet.config.annotation.CorsRegistry;
     import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
     import org.springframework.context.annotation.Configuration;
    // ...other imports

    @Configuration
    public class Conf implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**") // Allow CORS for all paths
                    .allowedOrigins("http://localhost:5173")
                    .allowedMethods("GET", "POST", "PUT", "DELETE")
                    .allowedHeaders("*");
        }
    }
