package entidades

class Filtro(val id: Long?=null,
             val tipoFiltro: TipoFiltro,
             val articulo: Articulo?=null,
             val servicio: Servicio?=null,
             val impuesto: Impuesto?=null,
             val tipoVenta: TipoVenta?=null,
             val tipoProveedor: TipoProveedor?=null,
             val descuento: Descuento?=null,
             val persona: Persona?=null,
             val centroCosto: CentroCosto?=null,
             val version: Long?=null) {
}