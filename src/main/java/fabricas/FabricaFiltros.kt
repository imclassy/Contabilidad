package fabricas

import entidades.*

class FabricaFiltros {
    fun crear(articulo: Articulo) = Filtro(tipoFiltro = TipoFiltro.ARTICULO, articulo = articulo)
    fun crear(persona: Persona) = Filtro(tipoFiltro = TipoFiltro.PERSONA, persona = persona)
    fun crear(descuento: Descuento) = Filtro(tipoFiltro = TipoFiltro.DESCUENTO, descuento = descuento)
    fun crear(impuesto: Impuesto) = Filtro(tipoFiltro = TipoFiltro.IMPUESTO, impuesto = impuesto)
    fun crear(servicio: Servicio) = Filtro(tipoFiltro = TipoFiltro.SERVICIO, servicio = servicio)
    fun crear(tipoProveedor: TipoProveedor) = Filtro(tipoFiltro = TipoFiltro.TIPO_PROVEEDOR, tipoProveedor = tipoProveedor)
    fun crear(tipoVenta: TipoVenta) = Filtro(tipoFiltro = TipoFiltro.TIPO_VENTA, tipoVenta = tipoVenta)
    fun crear(centroCosto: CentroCosto) = Filtro(tipoFiltro = TipoFiltro.COSTO, centroCosto = centroCosto)

}