package modelos;

public class Usuario {
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String toString() {
		return "Usuario [usuario=" + usuario + ", pwd=" + pwd + "]";
	}

	public Usuario(String usuario, String pwd) {
		
		this.usuario = usuario;
		this.pwd = pwd;
	}

	private String usuario;
	private String pwd;
	

}
