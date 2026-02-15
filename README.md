# Ad Auction Platform

A full-stack auction platform application built with Spring Boot and React.

## Project Structure

```
├── backend/          # Spring Boot REST API
├── frontend/         # React + TypeScript + Vite frontend
├── infra/           # Docker and infrastructure configs
└── docs/            # Architecture and design documentation
```

## Tech Stack

### Backend
- **Framework**: Spring Boot 4.0.2
- **Build Tool**: Gradle
- **Database**: JPA/Hibernate
- **Messaging**: Apache Kafka
- **Language**: Java

### Frontend
- **Framework**: React 18+ with TypeScript
- **Build Tool**: Vite
- **Styling**: CSS
- **Linting**: ESLint

## Getting Started

### Prerequisites
- Java 17+ (for backend)
- Node.js 18+ (for frontend)
- Docker & Docker Compose (for containerized deployment)

### Running Locally

#### Backend
```bash
cd backend
./gradlew bootRun
```

#### Frontend
```bash
cd frontend
npm install
npm run dev
```

#### Docker
```bash
docker-compose up
```

## Development

### Backend Development
- Run tests: `./gradlew test`
- Build: `./gradlew build`
- Build Docker image: `./gradlew bootBuildImage`

### Frontend Development
- Install dependencies: `npm install`
- Start dev server: `npm run dev`
- Build for production: `npm run build`
- Lint: `npm run lint`

## Documentation

See the [docs/](docs/) directory for:
- [Architecture](docs/architecture.md)
- [System Design](docs/system-design.md)
- [Performance Report](docs/performance-report.md)

## Configuration

Copy `.env.example` files and rename to `.env` to configure environment variables:

- `backend/.env.example` → `backend/.env`
- `frontend/.env.example` → `frontend/.env`
- `infra/.env.example` → `infra/.env`

## Contributing

1. Create a feature branch
2. Make your changes
3. Test thoroughly
4. Submit a pull request

## License

See LICENSE file for details.
