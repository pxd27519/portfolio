package com.portfolio.controller;

import com.portfolio.model.PortfolioData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Portfolio Controller
 *
 * GET /          → renders Thymeleaf HTML portfolio page
 * GET /api/data  → returns portfolio data as JSON (bonus REST endpoint)
 * GET /health    → simple health check
 */
@Controller
public class PortfolioController {

    private final PortfolioService portfolioService;

    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    /**
     * Main portfolio page — server-side rendered with Thymeleaf.
     */
    @GetMapping("/")
    public String index(Model model) {
        PortfolioData data = portfolioService.getPortfolioData();
        model.addAttribute("portfolio", data);
        return "index"; // maps to templates/index.html
    }

    /**
     * REST endpoint — returns full portfolio data as JSON.
     * Useful for anyone who wants to consume your data programmatically.
     * Example: GET http://localhost:8080/api/data
     */
    @GetMapping("/api/data")
    @ResponseBody
    public ResponseEntity<PortfolioData> getPortfolioJson() {
        return ResponseEntity.ok(portfolioService.getPortfolioData());
    }

    /**
     * Simple health check endpoint.
     * Example: GET http://localhost:8080/health
     */
    @GetMapping("/health")
    @ResponseBody
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("{ \"status\": \"UP\", \"service\": \"portfolio\" }");
    }
}
