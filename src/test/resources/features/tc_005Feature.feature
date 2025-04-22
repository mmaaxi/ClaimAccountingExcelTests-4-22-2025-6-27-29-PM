Feature: Validar nueva columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Verificar la nueva columna y la fórmula de cálculo
    Given el usuario está en la página de consulta de la tabla de reservas
    When el usuario identifica la columna 'Monto (reserva)'
    Then se observa la nueva columna titulada 'Monto acumulado Folio Reserva 5401'
    When el usuario verifica la fórmula de cálculo de la nueva columna
    Then la fórmula se calcula correctamente en los registros