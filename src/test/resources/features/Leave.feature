Feature: buscar en listas desplegables encapsuladas

  @Regresion
    @hu003
  Scenario Outline: search leave
    Given abrir el navegador
    And the user fill out name <userName> and password <password>
    When the user search leave type <typeLeave>

    Examples:

      | userName | password | typeLeave     |
      | Admin    | admin123 | US - Vacation |