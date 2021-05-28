# Proyecto Final PAT
## Javier Jarauta y Juan Antonio Gil
***
### En que consiste:
En este proyecto se ha empezado a diseñar una web para poder crear, realizar y gestionar desafíos *Catch the flag*. A su vez hay un podio, en el cual se puede observar los usuarios con mayor puntuación, la cual se obtiene al completar un desafio.

***
### Funcionalidad realizada en el proyecto final:
#### **Todo lo que se menciona a continuación ha sido implementado, salvo que se indique lo contrario**
Según se accede a la página de inicio se pueden realizar las siguentes acciones:
- Acceder al podio
- Ver los desafíos creados por la comunidad
- Acceder a la página de *Sobre nosotros*
- Si no se está logeado se puede:
    - *Iniciar sesión*
- Si se está logeado se puede:
    - Acceder a tu perfil, haciendo click en la máscara
    - *Cerrar sesion*

En el apartado de los *Desafíos* se pueden ver todos los desafios se encuentran en la base de datos. Dicha vista se carga mediante el uso de una template de thymeleaf. De cada desafío se puede apreciar la siguiente información:
- El nombre del desafío
- El nombre de usuario del creador del desafío
- El nivel de dificultad, el cual va desde 1, siendo el más sencillo a 5 siendo el más complejo
- La descripción del desafío
- Un botón para acceder a una preview del desafío

Si accedemos a una preview de un desafío podemos observar, aparte de la información descrita antes:
- El número de archivos adjuntos a dicho desafío
- Un botón para empezar dicho desafío. 

**En este proyecto no se ha implementado la funcionalidad de participar un desafío**

En el apartado de *Sobre nosotros* podemos acceder a:
- *Sobre nosotros*, donde estaría una descripción del sitio web
- *Contacto*, donde se haya la información de contacto

En el apartado de *Iniciar Sesión* nos encontramos con una pantalla muy sencilla en la que se introducen los credenciales del usuario. Si los credenciales son correctos se redirige al usuario a su perfil. (En el correo de la entrega se adjuntan los usuarios y las contraseñas para poder logearse)

**En este proyecto se ha implementado una gestión de autenticación y autorización mediante el uso de JwtTokens**

Estando en la página del perfil, se puede acceder a un menú lateral el cual contiene:
- *Mi perfil*, donde se podrán realizar acciones básicas, como consultar las puntuaciones, los retos creados y ajustes de su cuenta. **Esta funcionalidad no se ha implementado en este proyecto**
- *Desafíos*, aquí se encuentran dos funcionalidades:
    - *Crear un desafío*, lo cual te redirige a la pantalla de creación de desafíos
    - *Ver desafios*, te muestra los desafíos creados por la comunidad

En la página de *Crear un desafío* nos encontramos con los siguentes campos:
- Nombre del desafío
- La dificultad
- La solución de dicho desafío, la cual se pide dos veces, para garantizar que no se producen errores
- Una descripción del desafío
- Un apartado para subir archivos necesarios para resolver el desafío, desde 1 hasta 5

**Los archivos subidos no se almacenan en la base de datos, sino que se almacenan en el servidor, en una carpeta llamada `/uploaded/{id}/`, siendo el id, el del desafío creado**