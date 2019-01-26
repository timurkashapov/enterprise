package app;

public class User {

	private int code;
	private String password;

	public User() {}

	public  int getCode() {
		return code;
	}
	public void setCode(final int code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(final String password) {
		this.password = password;
	}

	@Override
	public boolean equals(final Object obj) {
		User user = (User) obj;
		boolean res;
		res = this.getCode() == user.getCode();
		if (!res) return res;
		res = this.getPassword() == user.getPassword();
		if (!res) return res;
		return res;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
