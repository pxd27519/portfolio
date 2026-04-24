💼 Pooja Dixit — Developer Portfolio
A personal portfolio website built with Java 17 + Spring Boot + Thymeleaf, showcasing my skills, experience, and projects as a Java Developer.

🚀 Tech Stack
Layer	Technology
Backend	Java 17, Spring Boot 3.2
Templating	Thymeleaf
Build Tool	Maven
Testing	JUnit 5, Mockito, MockMvc
Frontend	HTML5, CSS3, Vanilla JS
Monitoring	Spring Boot Actuator
📁 Project Structure
src/
├── main/
│   ├── java/com/pooja/portfolio/
│   │   ├── PortfolioApplication.java       # Main entry point
│   │   ├── controller/
│   │   │   ├── PortfolioController.java    # MVC + REST controller
│   │   │   └── PortfolioService.java       # Business logic / data layer
│   │   └── model/
│   │       ├── PortfolioData.java          # Root data model
│   │       ├── Skill.java                  # Skill category model
│   │       ├── Project.java                # Project model
│   │       └── Certification.java          # Certification model
│   └── resources/
│       ├── templates/index.html            # Thymeleaf template
│       ├── static/css/style.css            # Stylesheet
│       ├── static/js/main.js              # Animations & interactions
│       └── application.properties
└── test/
    └── java/com/pooja/portfolio/
        └── PortfolioControllerTest.java    # Unit + integration tests
▶️ Running Locally
Prerequisites
Java 17+
Maven 3.8+
Steps
# 1. Clone the repo
git clone https://github.com/pooja-dixit/portfolio.git
cd portfolio

# 2. Run the app
mvn spring-boot:run

# 3. Open in browser
http://localhost:8080
🔌 API Endpoints
Method	Endpoint	Description
GET	/	Portfolio HTML page
GET	/api/data	Portfolio data as JSON
GET	/health	Health check
GET	/actuator/health	Spring Actuator health
🧪 Running Tests
mvn test

📦 Build JAR
mvn clean package
java -jar target/portfolio-1.0.0.jar
🌐 Deploying
Option 1 — Render (Free)
Push to GitHub
Go to render.com → New Web Service
Connect your GitHub repo
Set build command: mvn clean package
Set start command: java -jar target/portfolio-1.0.0.jar
Option 2 — Railway (Free tier)
Go to railway.app
Deploy from GitHub → auto-detects Spring Boot
Option 3 — Docker
# Build image
docker build -t portfolio .

# Run container
docker run -p 8080:8080 portfolio
👩‍💻 About
Built by Pooja Dixit — Java Spring Boot Developer with 2+ years at TCS. Certified: GCP Associate Cloud Engineer | AWS Developer Associate

📧 pooja.dixit1920@gmail.com 🔗 linkedin.com/in/pooja-dixit