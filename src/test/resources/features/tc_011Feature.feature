Feature: Validar actualización en fórmula de 'Monto Acumulado Folio OPC (2121)' para movimientos de pago

  Scenario: Verificar fórmula correcta en celda de pago
    Given El usuario ha iniciado sesión y accede a la hoja de movimientos de pago
    When El usuario revisa la celda correspondiente en la columna 'Monto Acumulado Folio OPC (2121)' del registro de pago
    Then La celda contiene la fórmula actualizada correctamente
    And La fórmula =Z4+AD5+AE5+AH5+AC5+AB5+AM5 incluye los elementos requeridos
    And La fórmula funciona conforme a la modificación especificada y los cálculos son correctos