# Сервис управления правилами обработки данных

**Проект:** Реализация централизованного RESTful сервиса для управления конфигурацией распределенной системы обработки данных.

## Основная функциональность
- Централизованное управление правилами:
  - Фильтрации сообщений
  - Дедубликации данных
  - Обогащения информации
- Полноценное CRUD API для всех типов правил
- Автоматическая генерация документации API через OpenAPI
- Мониторинг состояния системы через метрики
- Валидация входных данных
- Интеграция с PostgreSQL для хранения конфигурации

## Технологический стек
- **Фреймворк:** Spring Boot 3
- **Документация:** Springdoc OpenAPI
- **Метрики:** Micrometer + Prometheus
- **Работа с БД:** Spring Data JPA
- **Валидация:** Bean Validation 3.0
- **Логирование:** SLF4J + Logback
- **Утилиты:** Lombok, Jackson

## Архитектура решения
```mermaid
graph TD
A[Admin UI] -->|API calls| B[Rule Management Service]
B --> C[PostgreSQL: Filter Rules]
B --> D[PostgreSQL: Deduplication Rules]
B --> E[PostgreSQL: Enrichment Rules]
B --> F[Monitoring: Metrics]




