package jrs.tp.wmd.restauration;

public class Password {
private String login;
private String password;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public Password(String login, String password) {
	super();
	this.login = login;
	this.password = password;
}
public Password() {
	super();
}

}
