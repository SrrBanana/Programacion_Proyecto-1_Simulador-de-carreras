# Proyecto-Programacion-Fin-1-Trimestre-Simulador-de-carreras
Aplicación Java que simule carreras individuales y campeonatos completos, gestionando pilotos, resultados y clasificaciones. La aplicación deberá modelar el dominio de la carrera mediante clases bien estructuradas, implementar un sistema de puntuación para campeonatos y mostrar de forma clara los resultados de cada prueba.

1. Introducción
Una carrera de coches es una competición deportiva donde múltiples pilotos
compiten en una pista para alcanzar la meta. En esta práctica, desarrollaremos una
aplicación Java que simule carreras individuales y campeonatos completos,
gestionando pilotos, resultados y clasificaciones.

La aplicación deberá modelar el dominio de la carrera mediante clases bien
estructuradas, implementar un sistema de puntuación para campeonatos y mostrar
de forma clara los resultados de cada prueba.

2. Objetivo de la práctica
Se pide desarrollar un programa en Java que simule carreras de coches con las siguientes características:

• Crear clases para modelar coches, carrera y campeonato
• Simular el desarrollo de una carrera individua.
• Implementar un sistema de campeonato que acumule puntos en varias carreras.
• Mostrar resultados parciales y clasificación general del campeonato.
• Aplicar correctamente principios de programación orientada a objetos (POO).

3. Requisitos funcionales

1.1. Modelado del dominio
Crear las siguientes clases en el paquete model:
• Coche: Representará un vehículo con atributos como marca, modelo y km.
• Carrera: Representará una carrera individual, conteniendo una lista de coches participantes.
• Campeonato: Representará un conjunto de carreras con acumulación de puntos y clasificación general.

1.2. Controlador de lógica
En el paquete controller:
• Crear una clase CarreraController que gestione la lógica de simulación de carreras.
• Crear una clase CampeonatoController que coordine múltiples carreras y acumule puntos.
• Estos controladores realizarán las operaciones de cálculo y ordenamiento de resultados.

1.3. Entrada de datos
• El programa solicitará por teclado el número de coches a participar.
• Se crearán coches con datos ingresados por el usuario.
• Se configura el número de carreras que conforman el campeonato, donde cada carrera tendrá unos km marcados por el usuario

1.4. Simulación de una carrera
• Generar en cada vuelta se incrementa de forma aleatoria los km de cada coche.
• Cuando un coche alcanza los km de la carrera, esta termina y se ordenan los coches por km recorridos
• Calcular puntos según la posición (1o lugar: 10 puntos, 2o: 8 puntos, 3o: 6 puntos).
• Mostrar el podio (1o, 2o y 3o lugares) de cada carrera.

1.5. Gestión del campeonato
• Ejecutar múltiples carreras de forma automática.
• Acumular puntos para cada coche en cada carrera.
• Permitir consultar la clasificación provisional después de cada carrera.
• Mostrar la clasificación final del campeonato con coches ordenados por puntos totales.

1.6. Salida de resultados
El programa mostrará por pantalla:

• Resultados de cada carrera:
o Orden de llegada de los pilotos.
o Tiempo total de cada participante.
o Puntos otorgados en esa carrera.

• Clasificación del campeonato:
o Tabla con nombre del coche y puntos totales.
o Piloto líder del campeonato.

Ejemplo de salida:
=== CARRERA 1 ===
1o - Coche A [10 puntos]
2o - Coche B [8 puntos]
3o - Coche C [6 puntos]

=== CLASIFICACIÓN GENERAL ===

Posición Piloto Dorsal Puntos
1o Piloto A 1 10
2o Piloto B 2 8
3o Piloto C 3 6

4. Algoritmo de simulación
1. Crear coches: Instanciar objetos coche pidiendo valores

2. Crear carrera: Instanciar Carrera con lista de coches participantes

3. Simular carrera:
o Los coches incrementarán su número de km hasta que alguno alcance el número de km de la caerrera
o Ordenar pilotos según km recorridos
o Asignar puntos según posición.

4. Campeonato:
o Repetir el proceso de carrera n veces. Recordar resetear los km de cada coche al iniciar una carrera
o Acumular puntos en cada coche.
o Mostrar clasificación actualizada después de cada carrera.

5. Consideraciones técnicas
• Usar Random para generar km entre 20-50.
• Considerar la posibilidad de empates (mismos km) y definir criterios de desempate.
• Usar excepciones para validar datos de entrada (número válido de pilotos, carreras, etc.).


https://github.com/user-attachments/assets/c7a36eb4-0f46-43b7-bd05-244979e99467
