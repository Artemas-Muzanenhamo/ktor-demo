# KTOR DEMO

## Run the application

`./gradlew run`

## Examples

```json
POST http://127.0.0.1:8080/customer
Content-Type: application/json

{
  "id": "100",
  "firstName": "Jane",
  "lastName": "Smith",
  "email": "jane.smith@company.com"
}

###
GET http://localhost:8080/customer
Content-Type: application/json
```
