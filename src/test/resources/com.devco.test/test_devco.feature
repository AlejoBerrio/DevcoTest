Feature: Customer do login and he finish to buy

  @CustomerPay
  Scenario Outline: Usuario ingresa texto en letra negrilla
    Given que el usuario hace clic en notas
      | tipoNota   |
      | <tipoNota> |
    When el usuario haga clic el icono de negrilla
    And y el usuario ingresa el texto
      | nota   |
      | <nota> |
    Then el usuario puede guardar y descargar la nota


    Examples:
      | tipoNota    | nota                                              |
      | enriquecido | Prueba de automatización Devco. Texto en negrilla |
