package login;

public class Usuario {
	
	private String usuario;
	private String senha;
	private String msg;
	
	
	public Usuario(String usuario, String senha){
		this.usuario = usuario;
		this.senha = senha;
		this.msg = "Olá";
		
	}
	
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	public  String getmsg() {
		return msg; 
	}

}
