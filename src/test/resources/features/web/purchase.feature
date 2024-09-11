@purchase
Feature: COMPRA DE PRODUCTO - Tienda Newsan

  Background: Login exitoso
    Given que el usuario está en la página de inicio de sesión
    When el usuario ingresa el nombre de usuario y la contrasenia
    And hace clic en el botón de inicio sesión


  Scenario: COMPRA DE PRODUCTO - Cliente existente - no tiene domicilio guardado
    And el usuario está en la pagina del "home"
    And agrega un producto al carrito
    And el usuario procede al checkout: datos personales: método de envío, método de pago
    #Then el usuario completa la compra exitosamente


  //Scenario: COMPRA DE PRODUCTO - Cliente existente - tiene un domicilio guardado
  // este caso se debe hacer en otra feature, porque no le sirve la precondicion
  // user:123456@gmail.com y pass:hola1234.

 //Scenario: COMPRA DE PRODUCTO - Cliente no registrado
  // este caso se debe hacer en otra feature, porque no le sirve la precondicion
