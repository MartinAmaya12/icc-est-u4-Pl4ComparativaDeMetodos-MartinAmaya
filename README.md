# Práctica 4: Comparación situacional de algoritmos de ordenamiento

**Nombre:** Renato Martin Amaya Siguenza
**Asignatura:** Estructura de Datos  

## RESULTADO(S) OBTENIDO(S)

### Tabla 1. Escenario 1: arreglo completamente desordenado
| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
| :--- | :--- | :--- | :--- | :--- |
| 10.000 | 258.46 ms | 3.32 ms | **QuickSort** | QuickSort es significativamente más veloz. |
| 50.000 | 3647.79 ms | 18.06 ms | **QuickSort** | El tiempo de Inserción se dispara al superar los 3 segundos, mientras que QuickSort se mantiene muy bajo. |
| 100.000 | 14881.08 ms | 25.10 ms | **QuickSort** | Brecha masiva: Inserción tardó casi 15 segundos frente a los 25 milisegundos de QuickSort. |

### Tabla 2. Escenario 2: arreglo ordenado más una nueva persona
| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
| :--- | :--- | :--- | :--- | :--- |
| 10.001 | 0.28 ms | 3.73 ms | **Inserción** | Inserción supera a QuickSort al aprovechar el orden preexistente. |
| 50.001 | 0.99 ms | 6.83 ms | **Inserción** | Inserción se mantiene por debajo de 1 milisegundo. |
| 100.001 | 1.86 ms | 11.23 ms | **Inserción** | QuickSort es casi 6 veces más lento en este escenario debido a las divisiones recursivas innecesarias. |

---

## Análisis requerido

**1. ¿Qué algoritmo fue más rápido en el escenario desordenado?**
En la practica se pudo observar que el quicksort fue mas rapido

**2. ¿Qué algoritmo fue más rápido en el escenario casi ordenado?**
En este caso, la practica de hoy se pudo observar que el Insercion fue mas rapido

**3. ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?**
Despues de haber realizado la practica se pudo observar que no afecta de la misma manera. En el insersion
como es de una complejidad $O(N^2)$, se observo que si la muestra crece un poco, el tiempo de ejecucion
se dispara exponencialmente. Por otro lado, el QuickSort permite manejar millones de datos sin que el tiempo 
aumente de forma tan drastica.

**4. ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?**
El inserion mejora , debido a que los arreglos estan casi ordenados, esto se debe a su ciclo while, se detiene 
casi de inmediato. Evalua la ultima persona que se agrego, no demas que no deberia, y baja su complejidad a : $O(N)$.

**5. ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?**
Se debe a que el QuickSort utiliza la estrategia de divide y venceras con el pivote. divide el arreglo en mitades cada vez
mas pequeñas, haciendo que la cantidad total de comparaciones e intercambios sea dramaticamente menor en datos random.

---

## CONCLUSIONES

* **Conclusión 1:** Para finalizar, se puede concluir que no existe un algoritmo definitivo, o ideal para todo, mas bien depende del estado inicial de los datos del problema o la situacion en la que se nos presenta para poder actuar con la mejor eleccion posible.

* **Conclusión 2:** A parte de la parte teorica, nos sirvio comparar para saber que el metodo insersion se volvio inutil en este caso y consumio un cantidad exagerada de recursos del procesador cuando los datos superan los 50.000 registrados desordenados, comprobo que solo sirve para datos pequeños. 

* **Conclusión 3:** Adicional a eso, en el escenario 2, tambien se puede demostrar lo anteriormente mencionado, el QuickSort se hizo mas lento que el insersion ya que, aunque el arreglo este ordenado, QuickSort sique gastando memoria tiempo haciendo llamadas recursivas para dividir el arreglo, lo cual en este trabajo especifico fue innecesario.