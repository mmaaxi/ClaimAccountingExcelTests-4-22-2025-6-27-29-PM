Feature: Validar cambio de nombre de 'Monto Acumulado Folio OPC' a 'Monto Acumulado Folio OPC (2121)'

  Scenario: Cambio de nombre de columna
    Given el usuario está en la página principal del sistema
    When el usuario busca la columna anteriormente denominada 'Monto Acumulado Folio OPC'
    Then la columna ha sido renombrada
    And el nombre de la columna se muestra correctamente como 'Monto Acumulado Folio OPC (2121)'