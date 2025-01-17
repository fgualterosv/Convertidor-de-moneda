                                                     Alura Latam / Challenge: Conversor de monedas

Proyecto: Conversor de Moneda en Java
Descripción
Este proyecto es una aplicación en Java que permite a los usuarios convertir entre diferentes monedas utilizando la API de ExchangeRate-API para obtener las tasas de cambio actualizadas. La aplicación proporciona una interfaz gráfica simple donde los usuarios pueden seleccionar la moneda de origen y la moneda de destino, e ingresar la cantidad a convertir. La aplicación luego muestra el monto convertido basado en la tasa de cambio actual.

Requerimientos
Entorno de Desarrollo:

Java Development Kit (JDK) 17
Un IDE ( IntelliJ IDEA).

Librerías:

Gson (para el procesamiento de JSON).
HttpClient (para realizar solicitudes HTTP).

Cuenta en ExchangeRate-API:

Necesitarás una clave API de ExchangeRate-API. Puedes obtener una registrándote en su sitio web.

Pasos para Desarrollar el Proyecto
Configurar el Proyecto:

Crear un nuevo proyecto Java en tu IDE.
Añadir las librerías necesarias al proyecto (Gson y HttpClient).
Obtener la Clave API:
Registrarse en ExchangeRate-API y obtener una clave API.
Desarrollar la Lógica del Conversor:
Crear una clase CurrencyConverter que manejará las conversiones.
Implementar un método fetchExchangeRate que realice una solicitud a la API y obtenga la tasa de cambio actual.
Implementar un método convertCurrency que use la tasa de cambio para convertir el monto ingresado.
Diseñar la Interfaz de Usuario.













                                                    
