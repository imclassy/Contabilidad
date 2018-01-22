package repositorios

import entidades.Configuracion
import entidades.Empresa
import entidades.Proceso

interface RepositorioConfiguraciones  {
    fun insertar(configuracion: Configuracion):Long
    fun actualizar(configuracion: Configuracion)
    fun borrar(id: Long)
    fun bucarPorId(id: Long): Configuracion?
    fun listarTodos():List<Configuracion>
    fun listarPorProceso(empresa: Empresa, proceso: Proceso):List<Configuracion>
}