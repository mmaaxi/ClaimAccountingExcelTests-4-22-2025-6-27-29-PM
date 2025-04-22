Feature: Validar creación de la nueva columna 'Estado Código'

  Scenario: Verificar la posición y nombre de la columna 'Estado Código'
    Given Estoy en la hoja de Excel
    When Localizo la posición inmediatamente a la derecha de la columna 'i'
    Then Se identifica una nueva columna en la posición correcta
    And Verifico que el título de la columna sea 'Estado Código'
    Then La columna 'Estado Código' está correctamente nombrada y posicionada