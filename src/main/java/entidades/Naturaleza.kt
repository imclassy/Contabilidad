package entidades

enum class Naturaleza(val nombre: String) {
    DEBITO("DEB"),
    CREDITO("CRE");

    companion object {
        private val map = Naturaleza.values().associateBy(Naturaleza::nombre);
        fun porNombre(nombre: String) = map[nombre]
    }
}