#
  Feature: Funcionalidad pim
    @Regresion
      @hu002
    Scenario Outline: agregar un nuevo empleado
      Given abrir el navegador
      And the user fill out name <userName> and password <password>
      And the user access to add emploeyee
      When the user fill out first name <firstName> middle <middleName> last name <lastName>

      Examples:

        | userName | password |firstName|middleName|lastName|
        | Admin    | admin123 |JHonatab |tatan     |medina  |