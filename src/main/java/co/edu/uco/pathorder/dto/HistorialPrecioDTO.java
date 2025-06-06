package co.edu.uco.pathorder.dto;

import co.edu.uco.pathorder.crosscutting.utilitarios.UtilFecha;
import co.edu.uco.pathorder.crosscutting.utilitarios.UtilObjeto;
import co.edu.uco.pathorder.crosscutting.utilitarios.UtilPrecio;
import co.edu.uco.pathorder.crosscutting.utilitarios.UtilUUID;

import java.util.Date;
import java.util.UUID;

public class HistorialPrecioDTO {

    private UUID id;
    private ProductoDTO producto;
    private int precio;
    private Date fechaDesde;
    private Date fechaHasta;


    public HistorialPrecioDTO() {
        setId(UtilUUID.obtenerValorDefecto());
        setProducto(ProductoDTO.obtenerValorDefecto());
        setPrecio(UtilPrecio.getInstance().obtenerValorDefecto());
        setFechaDesde(UtilFecha.getInstance().obtenerValorDefectoComoDate());
        setFechaHasta(UtilFecha.getInstance().obtenerValorDefectoComoDate());
    }

    public HistorialPrecioDTO(final UUID id) {
        setId(id);
        setProducto(ProductoDTO.obtenerValorDefecto());
        setPrecio(UtilPrecio.getInstance().obtenerValorDefecto());
        setFechaDesde(UtilFecha.getInstance().obtenerValorDefectoComoDate());
        setFechaHasta(UtilFecha.getInstance().obtenerValorDefectoComoDate());
    }

    public HistorialPrecioDTO(final UUID id, final ProductoDTO producto, final int precio, final Date fechaDesde, final Date fechaHasta) {
        setId(id);
        setProducto(producto);
        setPrecio(precio);
        setFechaDesde(fechaDesde);
        setFechaHasta(fechaHasta);
    }

    public static HistorialPrecioDTO obtenerValorDefecto() {
        return new HistorialPrecioDTO();
    }

    public static HistorialPrecioDTO obtenerValorDefecto (final HistorialPrecioDTO historialPrecio) {
        return UtilObjeto.getInstance().obtenerValorDefecto(historialPrecio, obtenerValorDefecto());
    }


    public UUID getId() {
        return id;
    }

    public HistorialPrecioDTO setId(final UUID id) {
        this.id = UtilUUID.obtenerValorDefecto(id);
        return this;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public HistorialPrecioDTO setProducto(final ProductoDTO producto) {
        this.producto = ProductoDTO.obtenerValorDefecto(producto);
        return this;
    }

    public int getPrecio() {
        return precio;
    }

    public HistorialPrecioDTO setPrecio(final int precio) {
        this.precio = UtilPrecio.getInstance().obtenerValorDefecto(precio);
        return this;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public HistorialPrecioDTO setFechaDesde(final Date fechaDesde) {
        this.fechaDesde = UtilFecha.getInstance().obtenerValorDefectoComoDate(fechaDesde);
        return this;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public HistorialPrecioDTO setFechaHasta(final Date fechaHasta) {
        this.fechaHasta = UtilFecha.getInstance().obtenerValorDefectoComoDate(fechaHasta);
        return this;
    }
}
