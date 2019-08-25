# Libreria CNYT


Este repositorio fue creado para la materia de Ciencias Naturales y Tecnologia, cuyo objetivo es crear una libreria que permita realizar operaciones entre números complejos desarrollada en Java. 


# Utilidades

### Version 1

- Suma de números complejos: La suma de dos números complejos es un número complejo cuya parte real es la suma de las partes reales y cuya parte imaginaria es la suma de las partes imaginarias.
- Producto de  números complejos: Para multiplicar números complejos se aplica la propiedad distributiva sobre la primera parte del primer número complejo sobre el otro número complejo, el resultado es otro número complejo.
- Resta de  números complejos: La diferencia de dos numeros complejos es otro número complejo tal que su parte real es la diferencia de las partes reales y la parte imaginaria es la diferencia de las partes imaginarias.
- Division de números complejos: Se define la división de dos números complejos a través de la multiplicación por el inverso. 
- Módulo de números complejos: Se define como la raíz cuadrada de la suma de los cuadrados de la parte entera y la parte imaginaria.
- Conjugado de números complejos: El conjugado de un número complejo se obtiene cambiando el signo de su componente imaginaria. 
- Conversión entre representaciones polar y cartesiano de números complejos: La forma polar de un número complejo es otra forma de representar un número complejo consta de dos componentes: módulo y argumento. La forma cartesiana de un número complejo esta conformada por una parte real y otra imaginaria.
- Retornar la fase de un número complejo la cual me indicará su posición o ángulo.

### Implementacion de la Version 1

Esta libreria de operaciones entre números complejos fue desarrollada en Java, desarrollamos dos clases principales una llamada Libreria la cual tiene las 4 operaciones básicas entre dos complejos y la clase Complejo en donde realizamos operaciones con un solo complejo.


### ¿Como se instala?

Para instalar esta libreria es necesario tener en cuenta los siguientes pasos:
- Entrar a la carpeta del ordenador donde deseamos descargar la libreria.
- Dar click derecho y dar el click en la opción "Git Bash".
- Utilizar el comando git clone, junto con el link de nuestra libreria (git clone https://github.com/camilavieda04/LibreriaCNYT.git)
- Una vez clonada la libreria, procedemos a abrir un editor de código.
- Finalmente hacemos uso de la libreria.

### ¿Como usar?

Al instalar la libreria encontraremos 3 tipos de clases principales, una llamada Libreria en donde encontramos las 4 operaciones básicas entre dos números complejos (Suma, Resta, Multiplicación y División) cada una de estas operaciones tiene una descripción de su función principal, parametros requeridos y la variable que retornara. 

En la clase Complejo encontramos las operaciones que se pueden realizar a partir de un solo número complejo, las cuales son las siguientes:
- getReal: Nos retorna la parte real del número complejo.
- setReal: Cambia la parte real del número complejo por una nueva que se le inserta.
- getImag: Retorna la parte imaginaria del número.
- setImag: Cambia la parte imaginaria del número complejo por una nueva que se le inserta. 
- getModulo: Retorna el módulo del número complejo, el cual es la distancia entre este número al origen de coordenadas.
- getConjugado: Retorna el conjugado del número complejo, el cual es el simétrico respecto del eje real.
- getFase: Retorna la fase del número complejo, que se define como el ángulo que forma el número conn el eje real. 
- conversionCaP: Retorna la conversión del número complejo de forma cartesiana a polar.
- conversionPaC: Retorna la conversión del numero complejo de forma polar a cartesiana.

Y por último esta la clase Pruebas que se explicara a continuación. 


### ¿Como probar?

Para probar esta libreria con diferentes casos es necesario tener en cuenta los siguientes pasos:
- Una vez instalada la libreria, encontramos 3 clases llamadas (Complejo,Libreria y Pruebas).
- Entramos en la clase Pruebas y decidimos que tipo de operación queremos probar. 
- Al escoger la operación debemos insertar el número a probar.
- En la variable resp insertar la respuesta que deberia dar nuestro programa con los números insertados anteriormente.
- Por último damos click en la opción correr de Eclipse y asi probaremos si el caso que insertamos es correcto o no.



