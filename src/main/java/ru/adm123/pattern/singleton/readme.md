**Паттерн "SINGLETON"**
***
Используется для того, чтобы можно было создать только один объект класса.
***
Нет смысла плодить объекты классов сервисов или репозиториев. Один и тот же объект сервиса может использоваться
в любом месте приложения.

Синглтон предполагает создание такого класса, у которого можно создать только один инстанс.

По большому счету, использование синглтона не требуется при Dependency Injection,
но если инжектить синглтон хуже точно не будет. 
***
