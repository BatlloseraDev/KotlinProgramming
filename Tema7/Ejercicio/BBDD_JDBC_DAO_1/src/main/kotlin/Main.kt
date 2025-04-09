fun main() {

  /*  val categoriaDAO =CategoriaDAOImpl_1()

    var categorias= categoriaDAO.getAllCategorias()
    categorias.forEach { println(it) }


    var id = 5
    var categoria=categoriaDAO.getCategoriaByCodigo(id)
    if(categoria != null){
        println("Categoria $id")
        println(categoria)
    }else {
        println("No se encontró el empleado")
    }

    val nuevaCategoria= Categoria(8,"beru")
    if(categoriaDAO.insertCategoria(nuevaCategoria)){
        println("Se insertó correctamente $nuevaCategoria")
    }else {
        println("No se pudo insertar la categoria")
    }


    val categoriaExistente =Categoria(3, "el no")
    if(categoriaDAO.updateCategoria(categoriaExistente)){
        println("Categoria $categoriaExistente actualizada correctamente")
    } else {
        println("No se pudo actualizar el categoria")
    }

    val categoriaAEliminar = 7
    if(categoriaDAO.deleteCategoria(categoriaAEliminar)){
        println("Categoria con id $categoriaAEliminar eliminada")
    } else {
        println("No se pudo eliminar el categoria")
    }*/
    /*
    val empleadoDAO = EmpleadoDAOImpl()

    val empleados = empleadoDAO.getAllEmpleados()
    println("Lista de empleados:")
    empleados.forEach { println(it) }

    val empleadoExistente = Empleado(3333, "Isabelle", 3)
    if(empleadoDAO.updateEmpleado(empleadoExistente)){
        println("Empleado $empleadoExistente actualizado correctamente")
    } else {
        println("No se pudo actualizar el empleado")
    }*/

    /*
val dni = 1111
val empleado= empleadoDAO.getEmpleadoPorDNI(dni)
if(empleado != null){
    println("Empleado con dni $dni")
    println(empleado)
}else {
    println("No se encontró el empleado")
}


val nuevoEmpleado = Empleado(5555,"Tototototomas", 1)
if(empleadoDAO.insertEmpleado(nuevoEmpleado)){
    println("Se insertó correctamente $nuevoEmpleado")
}else {
    println("No se insertar el empleado")
}

val empleadoExistente = Empleado(3333, "Isabelle", 3)
if(empleadoDAO.updateEmpleado(empleadoExistente)){
    println("Empleado $empleadoExistente actualizado correctamente")
} else {
    println("No se pudo actualizar el empleado")
}


val dniAeliminar = 4444
if(empleadoDAO.deleteEmpleado(dniAeliminar)){
    println("Empleado con dni $dniAeliminar eliminado")
} else {
    println("No se pudo eliminar el empleado")
}*/


     val categoriaDAO = CategoriaDAOImpl()

    // Obtener todas las categorias
    val categorias = categoriaDAO.getAllCategorias()
    println("Lista de categorias:")
    categorias.forEach { println(it) }

    // Obtener una categoria por codigo
    val codigo = 1
    val categoria = categoriaDAO.getCategoriaByCodigo(codigo)
    if (categoria != null) {
        println("Categoria con codigo $codigo:")
        println(categoria)
    } else {
        println("No se encontró la categoria con codigo $codigo")
    }


    // Insertar una nueva categoria
    val nuevaCategoria = Categoria(6, "Frutas")
    if (categoriaDAO.insertCategoria(nuevaCategoria)) {
        println("Se insertó correctamente la categoria $nuevaCategoria")
    } else {
        println("No se pudo insertar la categoria $nuevaCategoria")
    }

    // Actualizar una categoria existente
    val categoriaExistente = Categoria(1, "Hogar y electrodomésticos")
    if (categoriaDAO.updateCategoria(categoriaExistente)) {
        println("Se actualizó correctamente la categoria $categoriaExistente")
    } else {
        println("No se pudo actualizar la categoria $categoriaExistente")
    }

    // Eliminar una categoria existente NO ES POSIBLE PUES ES CLAVE EXTTERNA, DARA ERROR
    val codigoAEliminar = 3
    if (categoriaDAO.deleteCategoria(codigoAEliminar)) {
        println("Se eliminó correctamente la categoria con codigo $codigoAEliminar")
    } else {
        println("No se pudo eliminar la categoria con codigo $codigoAEliminar")
    }






}
