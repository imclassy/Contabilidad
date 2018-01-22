package entidades

interface CentroCosto {
    val codigo: String
    val padre: CentroCosto
}