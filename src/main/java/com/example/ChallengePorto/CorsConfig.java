package com.example.ChallengePorto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    // Configuração do CORS para permitir chamadas de uma origem específica
    @Bean
    public CorsFilter corsFilter() {
        // Configuração de origens e permissões CORS
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        // Adiciona a origem permitida (pode ser ajustada para a necessidade específica)
        config.addAllowedOrigin("http://localhost:5173");
        // Permite todos os métodos HTTP (GET, POST, PUT, DELETE, etc.)
        config.addAllowedMethod("*");
        // Permite todos os cabeçalhos na solicitação
        config.addAllowedHeader("*");
        // Registra a configuração CORS para todas as URLs
        source.registerCorsConfiguration("/**", config);
        // Retorna um filtro CORS com a configuração definida
        return new CorsFilter(source);
    }
}
