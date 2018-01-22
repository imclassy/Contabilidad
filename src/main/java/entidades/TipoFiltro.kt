package entidades

enum class TipoFiltro(val nombre: String) {
    ARTICULO("ART"),
    COSTO("CST"),
    PERSONA("PER"),
    IMPUESTO("IMP"),
    SERVICIO("SER"),
    TIPO_VENTA("VTA"),
    TIPO_PROVEEDOR("PRV"),
    DESCUENTO("DES");

    companion object {
        private val map = TipoFiltro.values().associateBy(TipoFiltro::nombre);
        fun porNombre(nombre: String) = map[nombre]
    }


}