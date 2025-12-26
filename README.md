# AEMET Backend

Aplicación backend desarrollada con **Spring Boot**, encargada de consumir la API pública de AEMET y exponer servicios REST para:

- Búsqueda de municipios por nombre  
- Obtención de la predicción meteorológica del día siguiente para un municipio  
- Adaptación de los datos al formato requerido por el frontend  

---

## Ejecución en local

### Opción A – Con Docker

En la raíz del proyecto se encuentra un archivo `docker-compose.yml`.  
Al ejecutarlo mediante el comando:

```bash
docker-compose up
```

se descargarán automáticamente las imágenes Docker tanto del backend como del frontend complementario a este proyecto (https://github.com/dasanlo14/aemetFrontendTest), y se levantarán ambos servicios de forma conjunta.

**Importante**

Para que el backend pueda conectarse correctamente a la API de AEMET, es necesario configurar la variable de entorno AEMET_API_KEY.
Esta variable puede definirse de dos formas:

**1. Usando un archivo .env**

En el mismo directorio donde se encuentra el docker-compose.yml, crear un archivo .env con el siguiente contenido:

```bash
AEMET_API_KEY=TU_API_KEY_DE_AEMET
```
**2. Modificando directamente docker-compose.yml**
   
```bash
environment:
  AEMET_API_KEY: TU_API_KEY_DE_AEMET
```
La aplicación quedará accesible en los siguientes puertos:

 - Frontend: http://localhost:4200

 - Backend: http://localhost:8080

### Opción B – Sin Docker

Para ejecutar la aplicación sin utilizar contenedores, es necesario tener instalados:

- Java 21
- Gradle

Además, es necesario disponer de una **API Key de AEMET**, que debe configurarse como variable de entorno.

#### Configuración de la variable de entorno

El backend está configurado para leer la API Key desde el archivo application.properties, donde se define la siguiente propiedad:

```bash
aemet.api.key=${AEMET_API_KEY}
```

#### Arranque de la aplicación

Desde la raíz del proyecto backend, ejecutar el siguiente comando:

```bash
./gradlew bootRun
```
La aplicación quedará disponible en la siguiente URL:

```bash
http://localhost:8080
```
