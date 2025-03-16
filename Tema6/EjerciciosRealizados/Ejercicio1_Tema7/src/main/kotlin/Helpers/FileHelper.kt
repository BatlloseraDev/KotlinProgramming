package Helpers

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import kotlin.io.path.Path


object FileHelper {

    fun crearArchivo(pathName:String):Boolean{
        var codError= true
        var file= File(pathName)
        if(!file.exists()){
            file.createNewFile()
        }
        else{
            codError=false
        }
        return codError
    }

}