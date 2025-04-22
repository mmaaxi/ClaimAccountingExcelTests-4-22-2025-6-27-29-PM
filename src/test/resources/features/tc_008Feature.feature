Feature: Validar creación de la columna 'IVA exento'

  Scenario: Verificar la columna 'IVA exento' en el Excel
    Given La aplicación se encuentra abierta
    When Localizo la columna 'IVA exento' en el Excel
    Then La columna 'IVA exento' se encuentra correctamente insertada
    When Verifico que los montos aplicables al IVA exento se registran de acuerdo a la especificación
    Then Los datos de la columna cumplen con los criterios del IVA exento