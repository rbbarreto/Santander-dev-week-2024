# Santander DEV Week 2024
Java RESFull API Criando para santander dev Week 

## Diagrama de classes 
´´´
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

    User --> Account
    User --> Feature
    User --> Car
    User --> New
   ´´´
