#Autor: Kevin
#language:en

Feature: Perform validation with an automated test of a successful purchase in OpenCart.
  As a certification analyst,
  I want to validate the response from the purchasing service on the front end.
  To validate that the purchase message is successful.

  @Succesbuy
  Scenario Outline: Buy succes with two products
    Given The user open the page
      | url   |
      | <url> |
    When select the select almost two products
    And Complete the checkout
      | nombre   | apellido  |  email    | telefono  | direccion | ciudad | codigo  |
      | <nombre> | <apellido>|  <email> | <telefono>|<direccion>|<ciudad>| <codigo> |

    Then The message The record has been successfully created is displayed
      | mensajeExitoso   |
      | <mensajeExitoso> |

    Examples:
      | url                       | nombre   | apellido  |  email    | telefono  | direccion | ciudad | codigo   |mensajeExitoso |
      ##@externaldata@src/test/resources/datadriven/data.xlsx@usuarios
   |https://opencart.abstracta.us/index.php?route=checkout/cart   |Kevin   |Montes   |Kevin@Test.com   |300123456   |Calle 123   |Medellin   |5001   |Your order has been placed!|

