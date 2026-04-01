@Bean
public CorsConfigurationSource corsSource() {
    CorsConfiguration cfg = new CorsConfiguration();

    cfg.setAllowedOrigins(List.of(
        "http://localhost:3000",
        "http://localhost:5173",
        "https://vtu-internship.vercel.app"   // ✅ YOUR REAL FRONTEND URL
    ));

    cfg.setAllowedMethods(List.of("GET","POST","PUT","DELETE","OPTIONS"));
    cfg.setAllowedHeaders(List.of("*"));
    cfg.setAllowCredentials(true);

    UrlBasedCorsConfigurationSource src = new UrlBasedCorsConfigurationSource();
    src.registerCorsConfiguration("/api/**", cfg);

    return src;
}
