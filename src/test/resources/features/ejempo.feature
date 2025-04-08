
Feature:  Abrir una pagina web

  Yo como alejandro
  Quiero realizar una prueba a la carta de elementos y las subFunciones
  Para comprobar la robuste y control de errores de la aplicacion o pagina web

  Background:
    Given "alejandro" abre el sitio web de pruebas

  @regression
  Scenario: validacion en la funcion del ID Card Elements
    And tengo usuario password validas
    When selecciona aleatoriamente alguna de las subfunciones
    Then visualizara en la cabecera el nombre de la opción elegida