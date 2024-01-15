# segundo-servicio

Puede correr la aplicacion ejecutando el comando:
```shell script
./mvnw compile quarkus:dev
```

---

El segundo servicio corre en el puerto 8081 y expone un endpoint POST cuya entrada es la siguiente:
<ul>
  <li>nombre</li>
  <li>apellido</li>
  <li>fechaDeNacimiento (LocalDate)</li>
  <li> cedula Cedula con el formato panameño (ejemplo: 1-111-1111)</li>
  
---
## Reglas de valicación 
<ul>
  <li>
    El nombre y apellido solo puede incluir letras del alfabeto, mayúsculas y
minúsculas, espacio en blanco y tildes.
  </li>
  <li>
    Que la edad calculada en base a la fecha de nacimiento este dentro del rango de
18 a 50 años
  </li>
  <li>
    Que la cedula cumpla con el formato ##-####-#####, o sea solo dígitos y
separados con guiones
  </li>
  <li>
    En caso de que las validaciones de arriba no se cumplen debe devolver un error
con status 400 de Bad Request.
  </li>

  <li>
    Si de pasar las validaciones, debe de consumir al primer servicio a través de un cliente
REST al servicio de números romanos e enviarle la edad calculada para obtener su
numeración en romano
  </li>
 
</ul>

<hr>
  <h2>Debe devolver una estructura con dos campos </h2>
  <ul>
    <li>
     - Nombre completo: Primero nombre y segundo nombre.
      <br>
    - Edad: su edad es valor (ejemplo 21) años.
           <br>
    - Romano: su edad en número romano es: XXI.
    </li>
    <li>
      HTTP Status 200.
    </li>
  </ul>


---
## Testeando el servico con PostMan
### Pasandole los valores correspondientes 
![image](https://github.com/DevKaliper/prueba-conocimiento-backend/assets/122651755/8d9a90a4-6fbc-4a91-a7e2-6b9fbd710f2f)


---
### Pasandole el nombre vacío
![image](https://github.com/DevKaliper/prueba-conocimiento-backend/assets/122651755/1ecea755-3c71-413b-b16e-dd743d4b35e2)


---


### Pasandole el una fecha de nacimiento futura
![image](https://github.com/DevKaliper/prueba-conocimiento-backend/assets/122651755/f549d2cb-4155-41ff-9759-e5870790d6b8)



---


### Pasandole una cedula en otro formato
![image](https://github.com/DevKaliper/prueba-conocimiento-backend/assets/122651755/7f37f0f3-f2ea-4ba9-86e7-3ede5e5731dc)




---

### Si la edad no está entre 18 y 50 años
![image](https://github.com/DevKaliper/prueba-conocimiento-backend/assets/122651755/9c998d01-bf05-4ed3-ac7e-85bc6f1102f6)

---

