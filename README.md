# Santander DEV Week 2024
Java RESFull API Criando para santander dev Week 

## Diagrama de classes 

``` mermaid
classDiagram
    class User {
        - String name
        - Account account
        - Feature[] features
        - Car car
        - New[] news
    }

    class Account {
        - String number
        - String agency
        - float balance
        - float limit
    }

    class Feature {
        - String icon
        - String description
    }

    class Car {
        - String number
        - float limit
    }

    class New {
        - String icons
        - String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Car
    User "1" *-- "N" New
   ```
