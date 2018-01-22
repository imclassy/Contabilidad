package entidades

class Configuracion(val id: Long?,
                    val proceso: Proceso,
                    val cuenta: Cuenta,
                    val naturaleza: Naturaleza,
                    val filtro: Filtro,
                    val filtrosAdicionales: List<Filtro>,
                    val version: Long?) {
}