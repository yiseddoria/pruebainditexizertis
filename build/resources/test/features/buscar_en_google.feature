#language: es
#Author: yised-doria@hotmail.es

Característica: Realizar busqueda en google
  Como usuario
  Quiero buscar una palabra en google
  Para realizar validaciones en wikipedia

  Escenario: Validar en wikipedia el anio en que se hizo el primer proceso automatico
    Dado que el usuario accede a la pagina de google
    Cuando realiza la busqueda de la palabra automatizacion
    Entonces valida que el año en que se hizo el primer proceso automatico es 300 a. C.