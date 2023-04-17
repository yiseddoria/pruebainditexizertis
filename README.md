#Introduccion a BDD, Gherkin y Cucumber

#BDD
Se utiliza BDD como una estrategia de desarrollo dirigido por comportamiento para la automatizacion de los escenarios de prueba,
lo que haremos sera escribir pruebas basadas en el comportamiento desde el punto de vista de negocio.
Partimos de historias de usuario, siguiendo el modelo Como [rol ] quiero [ caracteristica ] para que [los beneficios].

#Gherkin
Se utiliza Gherkin como lenguaje de desarrollo de las funcionalidades dado que es un lenguaje comprensible
por humanos y por ordenadores, con el vamos a definir el comportamiento de la pagina que vamos a automatizar.

#Cucumber
Se utiliza cucumber como herramienta para automatizar las pruebas en BDD. Cucumber nos va permitir ejecutar
descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el lenguaje
Gherkin.

#Serenity
Serenity es una biblioteca de codigo abierto que le ayuda a redactar pruebas de aceptacion automatizadas de mayor
calidad de forma mas rapida. Se utiliza para generar informes ilustrativos sobre las pruebas.

#Compilador
Se crea el proyecto sobre Gradle, es una herramienta de automatizacion de la construccion de nuestro codigo.

#Build and Test
Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la version 6.8.1

#Recomendaciones
Tener el chrome driver actualizado con la version del navegador chrome

#Comando gradle para ejecutar desde consola
#limpiar, ejecutar, agregar reporte
gradle clean test --tests BuscarEnGoogleRunner aggregate -i

