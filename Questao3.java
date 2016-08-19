package Locacao_De_Veiculos;

public class Questao3 {

	private String nome;
	private String url;
	private String user;
	private String pass;

	private static Questao3 instance;

	private Questao3() {
		this.nome = "";
		this.url = "";
		this.user = "";
		this.pass = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public static Questao3 getInstance() {
		if (Questao3.instance == null) {
			Questao3.instance = new Questao3();
		}
		return Questao3.instance;
	}

	public static void setInstance(Questao3 instance) {
		Questao3.instance = instance;
	}

}