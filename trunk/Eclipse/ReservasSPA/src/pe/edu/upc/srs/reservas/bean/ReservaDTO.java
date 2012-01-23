package pe.edu.upc.srs.reservas.bean;
/**
 * @author Victor Roncalla
 */
public class ReservaDTO {

    /* Atributos */
    private int id;
    private String codigo;
    private String dia;
    private String mes;
    private String anio;
    private String estado;
    private ServicioDTO servicio;
    private ClienteDTO cliente;
    private PersonalDTO empleado;
    private String horaInicio;
    private String horaFin;

    /* Métodos de acceso */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public ServicioDTO getServicio() {
		return servicio;
	}
	public void setServicio(ServicioDTO servicio) {
		this.servicio = servicio;
	}
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	public PersonalDTO getEmpleado() {
		return empleado;
	}
	public void setEmpleado(PersonalDTO empleado) {
		this.empleado = empleado;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
}
