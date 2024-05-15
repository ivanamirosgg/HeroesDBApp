# HeroesDB App

La aplicación HeroesDB App permite a los usuarios visualizar un listado de héroes de Marvel y DC. Utiliza Clean Architecture para una estructura organizada y fácil de mantener. Se emplea Room para gestionar la persistencia de datos en una tabla "Hero" con campos para Id, nombre e imagen. La inyección de dependencias se realiza con Dagger Hilt, y la interfaz de usuario utiliza RecyclerView para mostrar los héroes de manera eficiente y ordenada. Los datos se insertan inicialmente desde una clase estática a la base de datos, y se utilizan Flows para una gestión reactiva de los datos.
## Estructura del proyecto

app: Contiene la lógica de la interfaz de usuario y ViewModels.
data: Contiene la capa de acceso a datos, DAOs y Repositorios.
domain: Contiene casos de uso (Use Cases) que interactúan con los repositorios.
di: Contiene los módulos de Dagger Hilt para la inyección de dependencias.

## Implementaciones clave

Clean Architecture: Separación clara de responsabilidades y encapsulación en capas (UI, Use Cases, Repositorios).
Dagger Hilt: Gestión eficiente de dependencias para todo el proyecto.
Room: Persistencia de datos en la tabla "Hero" con inserción inicial de datos.
Interfaz de Usuario: Utiliza RecyclerView para mostrar la lista de héroes de forma limpia y funcional.
Flows: Empleados para una programación reactiva y actualización en tiempo real de los héroes.

## Lista de Heroes
Batman
Superman
Spiderman
Black Panther
Dr. Strange
Green Lantern
Robin
Thor
Ironman
Flash

