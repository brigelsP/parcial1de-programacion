# parcial1de-programacion
Generalidades:
  1. Componentes:
    A. FORMULARIO DE ENTRADA:
      El formulario de entrada setea una imagen en el background desde el constructor. Se crearon paquetes de externos que validan
      y comprueban los registros. Ver "Paquetes adicionales". Este formulario conduce a los tres otros de forma independiente.
      
    B. FORMULARIO PARA REGISTRO:
      El formulario de registro ingresa informacion de un usuario y lo agrega a una lista de usuarios, que se comprueba en el
      formulario de entrada para pasar a la pagina de bienvenida.
      
    C. FORMULARIO PARA CAMBIAR CONTRASEÑA:
      En este se accede a la lista de usuarios para cambiar una contraseña.
      
    D. PAGINA DE BIENVENIDA:
      Muestra una imagen y el nombre del usuario con el que se ingreso una vez en el.
      
  2. Paquetes adicionales:
    A. Validar:
      Email:
        Valida si es un email. Debe cumplir con estos requerimientos:
          a. No posee caracteres especiales
          b. Posee solo un arroba, y al menos un punto despues del arroba.
          c. Despues de el ultimo punto, solo aparecen letras.
          d. es valido usar (A-Z), (0-9), "_" , "." , "-" . 
          e. no es case sensitive. *
     Password:
        Valida que tenga al menos 1 de los siguientes componentes: 
          a. 1 numero.
          b. 1 letra.
          c. 1 caracter especial (ni numero, ni letra).
  
  B. Usuarios:
    Contiene el algoritmo necesario para agregar un usuario. 
    Agrega el usuario nuevo, edita la informacion del usuario en un .txt
