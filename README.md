## ToDoList
Gerenciador de Tarefas: To-Do-List para o **Curso Criação de uma aplicação Java com Spring Boot** da empresa **Rocketseat**!

``` mermaid

classDiagram
    class User {
        -name: String
        -username: String
        -password: String
        -createdAt: Date
        -Task[] task
    }

    class Task {
        -title: String
        -description: String
        -startAt: Date
        -endAt: Date
        -priority: String
        -createdAt: Date
        -createdBy: User[]
    }

   User "1" *-- "N" Task

```
