# Proyecto Final PAT
## Javier Jarauta y Juan Antonio Gil
***
### En que consiste:
En este proyecto se ha empezado a diseñar una web para poder crear, realizar y gestionar desafíos *Catch the flag*. A su vez hay un podio, en el cual se puede observar los usuarios con mayor puntuacion, la cual se obtiene por completar desafios.

***
### Funcionalidad realizad en el proyecto final:
#### **Todo lo que se menciona a continuacion a sido implementado, salvo que se indique lo contrario**
Según se accede a la pagina de inicio se pueden realizar las siguentes acciones:
- Acceder al podio
- Ver los desafíos creados por la comunidad
- Acceder a la página de Sobre nosotros
- Si no se esta logeado se puede:
    - Iniciar sesión
- Si se esta logeado se puede:
    - Acceder a tu perfil, haciendo click en la máscara
    - Cerrar sesion

En el apartado de los *Desafíos* se pueden ver todos los desafios se encuentran en la base de datos. Dicha vista se carga mediante el uso de una template de thymeleaf. De cada desafío se puede apreciar la siguiente informacíon:
- El nombre del desafío
- El nombre de usuario del creador del desafío
- El nivel de dificultad, el cual va desde 1, siendo el más sencillo a 5 siendo el más complejo
- La descripcíon del desafío
- Un boton para acceder a una preview del desafío

Si accedemos a una preview de un desafío podemos ver, aparte de la informacíon descrita antes, podemos ver:
- El número de archivos adjuntos a dicho desafio
- Un botón para empezar dicho desafio. 

**En este proyecto no se ha implementado la funcionalidad de realizar un desafio**

En el apartado de *Sobre nosotros* podemos acceder a:
- Sobre nosotros, donde estaria una descripcion del sitio web
- Contacto, donde se haya la informacion de contacto

En el apartado de *Iniciar Sesión* nos encontramos con una pantalla muy sencilla en la que se introducen los credenciales del usuario. Si los credenciales son correctos se redirige al usuario a su perfil. (En el correo de la entrega se adjuntan los usuarios y las contraseñas para poder logearse)

**En este proyecto se ha implementado una gestion de autenticacion y autorizacion mediante el uso de JwtTokens**

Estando en la página del perfil, se puede acceder a un menú lateral el cual contiene:
- Mi perfil, donde se podrán realizar acciones basicas, como consultar las puntuaciones, los retos creados y ajustes de su cuenta. **Esta funcionalidad no se ha implementado en este proyecto**
- Desafios, aqui se encuentran dos funcionalidades:
    - Crear un desafío, lo cual te redirige a la pantalla de creación de desafios
    - Ver desafios, te muestra los desafios creados por la comunidad

En la página de *Crear un desafío* nos encontramos con los siguentes campos:
- Nombre del desafio
- La dificultad
- La solucion de dicho desafio, la cual se pide dos veces, para garantizar que no se producen errores
- Una descripcion del desafio
- Un apartado para subir archivos necesarios para resolver el desafio, desde 1 hasta 5

**Los archivos subidos no se almacenan en la base de datos, sino que se almacenan en el servidor, en una carpeta llamada `/uploaded/{id}/`, siendo el id, el del desafio creado**