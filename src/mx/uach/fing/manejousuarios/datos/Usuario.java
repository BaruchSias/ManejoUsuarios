package mx.uach.fing.manejousuarios.datos;

/**
 * Clase que se encarga de manejar los usuarios del sistema
 * @author Eduardo Baruch Sias Espino
 * @version 1.0
 */
public class Usuario {
    private Integer id;
    private String nombre;
    private  String primerapellido;
    private  Integer edad;

    /**
     * Método que regresa el identificador único de cada usuario
     * @throws NullPointerException cuando no exista el usuario
     * en la base de datos
     * @return the id (número entero)
     */
    public Integer getId() throws NullPointerException {
     if(this.id==null){
      throw new NullPointerException(
       String.format("El usuario %s no existe", this.nombre));
        }
        return id;
    }

    /**
     * 
     * @param id que se asignará al usuario al ser guardado en la base de datos
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerapellido
     */
    public String getPrimerapellido() {
        return primerapellido;
    }

    /**
     * @param primerapellido the primerapellido to set
     */
    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
