# Catálogo de Teléfonos

Este proyecto Java implementa un catálogo de teléfonos con las siguientes funcionalidades:

## Contenido

1. [Estructura del Proyecto](#estructura-del-proyecto)
2. [Funcionalidades](#funcionalidades)
3. [Instrucciones de Uso](#instrucciones-de-uso)
4. [Notas Adicionales](#notas-adicionales)

## Estructura del Proyecto

El proyecto está organizado en varios paquetes:

- **aplicacion**: Contiene las clases relacionadas con la lógica de la aplicación.
- **dominio**: Contiene las clases que representan los objetos de dominio, como la clase abstracta `Telefono` y sus subclases `TelefonoApple`, `TelefonoHuawei`, `TelefonoSamsung` y `TelefonoXiaomi`.
- **presentacion**: Contiene la clase `InterfazUsuario` que maneja la interacción con el usuario.
- **resources**: Puede contener recursos adicionales, como archivos CSV.

## Funcionalidades

1. **GestorTelefonos**: La clase `GestorTelefonos` maneja la gestión de teléfonos, permitiendo agregar, eliminar y modificar teléfonos, así como obtener la lista de teléfonos existentes.

2. **ManejadorCSV**: La clase `ManejadorCSV` se encarga de la lectura y escritura de teléfonos en formato CSV. Permite cargar teléfonos desde un archivo CSV y guardar teléfonos en un archivo CSV.

3. **Main**: La clase `Main` inicia la aplicación, creando un gestor de teléfonos, cargando teléfonos existentes desde un archivo CSV (si existe), mostrando la interfaz de usuario y guardando los teléfonos al salir.

4. **InterfazUsuario**: La clase `InterfazUsuario` presenta un menú interactivo al usuario, permitiéndole agregar, eliminar, modificar y mostrar teléfonos.

## Instrucciones de Uso

1. **Ejecución del Programa**:
   - Ejecute la clase `Main` para iniciar la aplicación.
   - Siga las instrucciones en la consola para interactuar con el catálogo de teléfonos.

2. **Formato del Archivo CSV**:
   - El archivo CSV debe contener líneas que representan teléfonos en el formato siguiente: `tipo,peso,pantalla,bateria,camara,memoria,precio,marca,modelo`.

3. **Tipo de Teléfonos**:
   - Los tipos de teléfonos permitidos son: Apple, Huawei, Samsung y Xiaomi.

## Notas Adicionales

- Las clases `TelefonoApple`, `TelefonoHuawei`, `TelefonoSamsung` y `TelefonoXiaomi` heredan de la clase abstracta `Telefono`, proporcionando así una estructura jerárquica para los diferentes tipos de teléfonos.
- Se utiliza el formato CSV para almacenar y recuperar información de los teléfonos, facilitando la persistencia de datos.
- El proyecto sigue una estructura modular y utiliza herencia para mejorar la organización y reutilización del código.
- Se recomienda proporcionar un archivo CSV existente para cargar datos previos al iniciar la aplicación, y se guardará automáticamente al salir.