package com.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioData {

    // Personal info
    private String name;
    private String title;
    private String tagline;
    private String location;
    private String email;
    private String phone;
    private String linkedinUrl;
    private String githubUrl;

    // Stats
    private String yearsExperience;
    private String microservicesBuilt;
    private String apiSpeedGain;
    private String testCoverage;

    // Content sections
    private List<Skill> skills;
    private List<Project> projects;
    private List<Certification> certifications;
}
