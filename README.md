Cambios realizados en el proyecto

Antes tenia la clase Ordenar que servia para limpiar la cocina, pero se elimino porque el examen pedia una clase Orden que sirviera para guardar los pedidos de pizza de los clientes, asi que se creo esa clase nueva.

En la clase Pizza los atributos daban problemas porque no habia forma de guardar varios ingredientes, asi que se cambio a un arreglo de toppings. Tambien se borraron unos metodos vacios que daban error y se crearon dos funciones para agregar ingredientes y cumplir con la sobrecarga de metodos que pedia el examen.

En la clase Cocina no habia forma de guardar las ordenes, por lo que se agrego un arreglo estatico de 5 espacios que era requerido y una funcion para ir metiendo ahi los pedidos hasta que se llene.

Las clases ChefHombre y ChefMujer daban error en el codigo porque intentaban heredar de Chef y Chef no tenia un constructor vacio para recibirlos. Para solucionarlo solo se agrego el constructor vacio en Chef y se les puso a los hijos su constructor para que dejaran de marcar error.

Por ultimo, no habia donde correr el programa ni probar si funcionaba, asi que se creo el archivo Main para crear la cocina, la pizza, meter la pizza a la orden y comprobar que todo el codigo compilara bien y sin errores.
