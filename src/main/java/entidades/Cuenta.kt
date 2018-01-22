package entidades

interface Cuenta {
    val codigo: String
    val nombre: String
    val padre: Cuenta
    val naturaleza: Naturaleza
    val requiereNit: Boolean
    val requiereCentroDeCosto: Boolean
    val requiereDocumento: Boolean
    val requiereBase: Boolean
}