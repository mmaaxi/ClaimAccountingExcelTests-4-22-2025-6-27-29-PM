Feature: Validar creación de la columna 'IVA 0%'

  Scenario: Verificar la existencia y corrección de la columna 'IVA 0%'
    Given estoy en la hoja de cálculo con la información de impuestos
    When reviso el Excel para localizar la columna titulada 'IVA 0%'
    Then la columna 'IVA 0%' aparece en la ubicación especificada según el documento
    And los valores en la columna 'IVA 0%' son representativos de la tasa 0% de IVA