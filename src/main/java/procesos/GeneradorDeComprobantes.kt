package procesos

import entidades.Comprobante
import entidades.Interfaz
import repositorios.RepositorioConfiguraciones

class GeneradorDeComprobantes(val repositorioConfiguraciones: RepositorioConfiguraciones) {
    fun generar(interfaz: Interfaz):Comprobante{
        //TODO
        return Comprobante()
    }
}