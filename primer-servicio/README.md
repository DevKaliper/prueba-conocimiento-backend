# primer-servicio

---

## Primer servicio 

El primer servicio corre en el puerto 8080 y expone un endpoint GET cuya endpoint o ruta es la siguiente: /api/romano/{numero}. Donde {numero} es un PATH parameter y es digito entero. El servicio  devuelve en su body el string equivalente en numeración romana. Ejemplo: {numero} = 25, respuesta: XXV

Puede correr la aplicacion ejecutando el comando:
```shell script
./mvnw compile quarkus:dev
```


---

## Testeando el servico con PostMan
### Cuando se le pasa el valor 25 como parámetro -> devuelve XXV
![image](https://github.com/DevKaliper/prueba-conocimiento-backend/assets/122651755/b53f3e61-7f12-4722-ad75-df6165538db2)

---
### Cuando se le pasa el valor 10 como parámetro -> devuelve X
![image](https://github.com/DevKaliper/prueba-conocimiento-backend/assets/122651755/0714ee59-5823-433a-bf15-8208f2d65d14)

---

## Referencias 
<h3> Para el algoritmo conversor a número romano se consultó la pagina https://codingnconcepts.com/java/integer-to-roman/ en el apartado 2.2 "Improvement using Arrays" </h3>
<br>

![image](https://github.com/DevKaliper/prueba-conocimiento-backend/assets/122651755/16ad62ef-1444-4696-ac4e-db4bd1b6d73f)

