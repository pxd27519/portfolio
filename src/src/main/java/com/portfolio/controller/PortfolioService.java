package com.portfolio.controller;

import com.portfolio.model.Certification;
import com.portfolio.model.PortfolioData;
import com.portfolio.model.Project;
import com.portfolio.model.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    /**
     * Returns the complete portfolio data model.
     * To update your portfolio, just edit the values here — no HTML changes needed.
     */
    public PortfolioData getPortfolioData() {
        return PortfolioData.builder()
                .name("Pooja Dixit")
                .title("Java Spring Boot Developer")
                .tagline("Java Spring Boot Developer· 2+ Years @ TCS")
                .location("Gandhinagar, Gujarat")
                .email("pooja.dixit1920@gmail.com")
                .phone("+91-9054445949")
                .linkedinUrl("https://www.linkedin.com/in/pooja-dixit-3065691b7")
                .githubUrl("https://github.com/pxd27519")

                // Stats
                .yearsExperience("2+")
                .microservicesBuilt("5+")
                .apiSpeedGain("30%")
                .testCoverage("90%+")

                // Skills
                .skills(buildSkills())

                // Projects
                .projects(buildProjects())

                // Certifications
                .certifications(buildCertifications())

                .build();
    }

    private List<Skill> buildSkills() {
        return List.of(
                Skill.builder()
                        .category("Backend")
                        .items(List.of("Java 17", "Spring Boot", "Spring Security",
                                "Hibernate/JPA", "REST APIs", "JWT", "OAuth 2.0"))
                        .build(),

                Skill.builder()
                        .category("Microservices")
                        .items(List.of("Docker", "API Gateway",
                                "Circuit Breaker", "Resilience4j"))
                        .build(),

                Skill.builder()
                        .category("Cloud")
                        .items(List.of("GCP (ACE Certified)", "AWS (Dev Certified)",
                                "Cloud Run", "GKE", "IAM"))
                        .build(),

                Skill.builder()
                        .category("Data & Testing")
                        .items(List.of("PostgreSQL", "MySQL",
                                "JUnit 5", "Mockito", "TDD"))
                        .build(),

                Skill.builder()
                        .category("CI/CD & Tools")
                        .items(List.of("Jenkins", "Git", "Maven",
                                "Postman", "Bruno", "JIRA", "IntelliJ"))
                        .build(),

                Skill.builder()
                        .category("Architecture")
                        .items(List.of("Microservices", "Agile/Scrum",
                                "RBAC Design", "System Design", "SAGA Pattern"))
                        .build()
        );
    }

    private List<Project> buildProjects() {
        return List.of(
                Project.builder()
                        .number("01")
                        .title("Employee Management System")
                        .description("Full-stack RBAC system with Admin, Manager, and Employee roles "
                                + "using Spring Security + JWT. Normalized MySQL schema with composite "
                                + "DB indexing achieving 25% faster data retrieval. RESTful APIs "
                                + "consumed by Angular frontend, documented via Swagger/OpenAPI.")
                        .techStack(List.of("Java", "Spring Boot", "Spring Security",
                                "JWT", "Angular", "MySQL", "Swagger"))
                        .githubUrl("https://github.com/pooja-dixit/employee-management-system")
                        .build(),

                Project.builder()
                        .number("02")
                        .title("Data Maintenance System")
                        .description("Modular microservices architecture for enterprise data management "
                                + "— each service independently deployable via Docker containers "
                                + "orchestrated on Kubernetes. Circuit breaker patterns for fault "
                                + "tolerance. Automated Postman & Bruno test suites integrated into CI pipeline.")
                        .techStack(List.of("Java", "Spring Boot", "PostgreSQL",
                                "Docker", "Kubernetes", "Angular", "Postman"))
                        .githubUrl("https://github.com/pooja-dixit/data-maintenance-system")
                        .build(),

                Project.builder()
                        .number("03")
                        .title("Portfolio Website")
                        .description("Personal developer portfolio built with Spring Boot + Thymeleaf. "
                                + "Server-side rendering with clean MVC architecture, animated frontend, "
                                + "and REST API endpoint for portfolio data. Deployed and hosted on GitHub.")
                        .techStack(List.of("Java 17", "Spring Boot", "Thymeleaf",
                                "REST API", "Maven", "HTML/CSS/JS"))
                        .githubUrl("https://github.com/pxd27519/portfolio")
                        .build()
        );
    }

    private List<Certification> buildCertifications() {
        return List.of(
                Certification.builder()
                        .icon("☁️")
                        .name("Associate Cloud Engineer")
                        .issuer("Google Cloud Platform")
                        .credentialId("GCP-ACE-VERIFIED")
                        .build(),

                Certification.builder()
                        .icon("⚡")
                        .name("Developer — Associate")
                        .issuer("Amazon Web Services")
                        .credentialId("AWS-DEV-VERIFIED")
                        .build(),

                Certification.builder()
                        .icon("🎓")
                        .name("B.E. Electronics & Communication Engg.")
                        .issuer("Gujarat Technological University · 2023")
                        .credentialId("GEC Bharuch")
                        .build()
        );
    }
}
