package app;

public class UserView {

	public UserView() {}

	public static void welcome(final User user) {
		System.out.printf("Привет пользак! введи кодовое слово %d и пароль %s", user.getCode(), user.getPassword());
	}
}
