package entidades

class Detalle(val cuenta: Cuenta,
              val valorDebito: Long,
              val valorCredito: Long,
              val persona: Persona?,
              val centroCosto: CentroCosto?,
              val articulo: Articulo?
              ) {
}