| Ejecución | Descarga más lenta | Tiempo real (ms) | Suma (ms) |
|---|---|---:|---:|
| 1 | mantras.mp3 | 4954 | 11469 |
| 2 | mantras.mp3 | 4733 | 14205 |
| 3 | meditacion.mp4 | 4603 | 13183 |

### Preguntas

**¿Por qué el tiempo real es mucho menor que la suma?**

El tiempo real es mucho menor porque las cuatro descargas se ejecutan a la vez, cada una en su propio hilo. Mientras una descarga está esperando, las otras pueden seguir avanzando. Por eso no tenemos que esperar a que termine una para empezar la siguiente. La suma de los tiempos sería lo que tardaríamos si descargásemos los archivos uno detrás de otro.

**¿Qué pasa si hacemos `start()` y `join()` dentro del mismo bucle?**

Si hacemos `start()` y `join()` dentro del mismo bucle, cada descarga tiene que terminar antes de empezar la siguiente. Esto hace que las descargas se ejecuten una detrás de otra y ya no al mismo tiempo. Por eso, el tiempo real aumenta y se parece mucho más a la suma de los tiempos de las cuatro descargas.

Al probarlo, el tiempo real que obtuve fue de **_____ ms**.