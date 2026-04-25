package com.portfolio;

import com.portfolio.controller.PortfolioController;
import com.portfolio.controller.PortfolioService;
import com.portfolio.model.PortfolioData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PortfolioController.class)
class PortfolioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PortfolioService portfolioService;

    private PortfolioData mockData() {
        return PortfolioData.builder()
                .name("Pooja Dixit")
                .title("Java Spring Boot Developer")
                .email("pooja.dixit1920@gmail.com")
                .skills(List.of())
                .projects(List.of())
                .certifications(List.of())
                .build();
    }

    @Test
    @DisplayName("GET / should return 200 and render index template")
    void indexPageLoads() throws Exception {
        when(portfolioService.getPortfolioData()).thenReturn(mockData());

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attributeExists("portfolio"));
    }

    @Test
    @DisplayName("GET /api/data should return 200 with JSON body")
    void apiDataReturnsJson() throws Exception {
        when(portfolioService.getPortfolioData()).thenReturn(mockData());

        mockMvc.perform(get("/api/data"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Pooja Dixit"))
                .andExpect(jsonPath("$.title").value("Java Spring Boot Developer"));
    }

    @Test
    @DisplayName("GET /health should return UP status")
    void healthCheckReturnsUp() throws Exception {
        mockMvc.perform(get("/health"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("UP")));
    }
}
