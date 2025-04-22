Feature: Validar concatenación de llave en Columna C

  Scenario: Verificar concatenación correcta en la Columna C del Excel exportado
    Given el usuario ha abierto el archivo Excel exportado
    When el usuario localiza la Columna C
    Then se observa la fórmula =CONCATENATE(D2,'_','H2','_','U2','_','O2','_','E2') aplicada
    And la llave se forma concatenando No. Siniestro, No. De autorización, status, tipo de mov, no. De movimiento
    And la llave se muestra correctamente en cada registro