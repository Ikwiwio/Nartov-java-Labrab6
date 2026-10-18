# nartov-lab6-rest-h2 — лабораторная работа №6

REST CRUD-сервис на Spring Boot 3.1.5, Java 17, Maven, Spring Data JPA и H2 file database. Реализованы две сущности: студенты и учебные дисциплины; для обеих доступны Create/Read/Update/Delete, валидация и success/failure JSON envelope.

## Запуск
1. Распакуйте архив и откройте папку `nartov-lab6` (в ней `pom.xml`) в IntelliJ IDEA.
2. Выберите JDK 17 и дождитесь импорта Maven.
3. Запустите `ru.nartov.lab6.NartovLab6Application` или выполните `mvn spring-boot:run`.
4. H2 создаст файловую БД `./testdb/students`; JPA создаст таблицы. При первом старте добавляются демонстрационные данные.
5. Health check: `GET http://localhost:8080/api/health`.
6. Импортируйте `Postman/nartov-lab6.postman_collection.json` и отправьте тестовые запросы.
7. Тесты: `mvn test`.

## H2 Console и DBeaver
H2 Console: `http://localhost:8080/h2-console`.
- JDBC URL: `jdbc:h2:file:./testdb/students`
- User: `sa`; Password: пустой.
Для DBeaver укажите тот же файл, указав абсолютный путь от корня проекта до `testdb/students`, без суффикса `.mv.db`. SQL DDL включён в `sql/01-create-tables.sql`. Не выполняйте CREATE поверх уже существующих таблиц; в проекте таблицы автоматически создаёт Hibernate.

## API студентов
| HTTP | URL | Операция |
|---|---|---|
| GET | `/api/students` | Все студенты |
| GET | `/api/students/{id}` | Один студент |
| POST | `/api/students` | Создание |
| PUT | `/api/students/{id}` | Обновление |
| DELETE | `/api/students/{id}` | Удаление |

Пример: `{"name":"Мария","surname":"Сидорова","faculty":"РТФ","age":19}`.

## API учебных дисциплин
CRUD endpoints: `GET/POST /api/subjects`, `GET/PUT/DELETE /api/subjects/{id}`. Поля дисциплины: name, hours, semester. Пример: `{"name":"Основы REST API","hours":48,"semester":5}`.

Успех возвращает `success: true`, `message` и `data`. Ошибка возвращает `success: false` и `message`; статусы: 201 — создание, 200 — успех, 400 — валидация, 404 — не найдена запись, 409 — конфликт уникальности.

Отчёт: `report/Отчет_ЛР6_nartov.docx`. Заполните ФИО/группу и добавьте настоящую ссылку GitHub. В методичке также требуется прикрепить скриншоты ручных проверок Postman. Коллекция подготовлена, но реальные скриншоты нужно сделать после запуска приложения на вашем компьютере; они не подменены вымышленными.
