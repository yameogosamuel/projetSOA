package jrs.tp.wmd.payment.business;

public class Password {
	private String login;
	private String passwd;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Password() {
		super();
	}
	public Password(String login, String passwd) {
		super();
		this.login = login;
		this.passwd = passwd;
	}
	
	
}
