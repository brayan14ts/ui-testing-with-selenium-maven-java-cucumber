Feature: Inicio de sesión en la web de la tienda Newsan

  @login @happyPath @positive
  Scenario: Usuario inicia sesión exitosamente
    Given que el usuario está en la página de inicio de sesión
    When el usuario ingresa el nombre de usuario y la contrasenia
    And hace clic en el botón de inicio sesión
    Then el usuario debería ser redirigido al home del cliente
    And visualiza un mensaje de bienvenida que incluye la palabra "¡HOLA"