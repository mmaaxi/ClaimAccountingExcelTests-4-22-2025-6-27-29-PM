Feature: Validar creación de la columna 'IVA retenido'

  Scenario: Verificar la existencia y corrección de los montos en la columna 'IVA retenido'
    Given la aplicación está abierta y se ha accedido al módulo de Excel
    When identifico la existencia de la columna 'IVA retenido'
    Then la columna 'IVA retenido' está presente en el Excel
    And verifico que los montos en 'IVA retenido' son correctos