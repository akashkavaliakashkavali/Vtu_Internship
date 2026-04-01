@Bean
public CorsConfigurationSource corsSource() {
    CorsConfiguration cfg = new CorsConfiguration();

    cfg.setAllowedOriginPatterns(List.of("*")); // 🔥 FIX
    cfg.setAllowedMethods(List.of("GET","POST","PUT","DELETE","OPTIONS"));
    cfg.setAllowedHeaders(List.of("*"));
    cfg.setAllowCredentials(true);

    UrlBasedCorsConfigurationSource src = new UrlBasedCorsConfigurationSource();
    src.registerCorsConfiguration("/**", cfg);
    return src;
}
