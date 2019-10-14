package jrs.tp.wmd.restauration;


public class ClientRegistration {
	
		private String firstname;
		private String password;
		private String address;
		
		public ClientRegistration(String firstname, String password,
		String address) {
		super();
		this.setFirstname(firstname);
		this.setPassword(password);
		this.setAddress(address);
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	

}
