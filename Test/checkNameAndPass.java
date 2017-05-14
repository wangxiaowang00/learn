public class checkNameAndPass {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("input error");
			System.exit(1);
		}
		if (null == args[0] || null == args[1] || "".equals(args[0])
				|| "".equals(args[1])) {
			System.exit(1);
		}

		String usrName = args[0];
		String usrPass = args[1];

		checkNameAndPass(usrName, usrPass);
	}

	public static void checkNameAndPass(String usrName, String usrPass) {

		if ((usrName.contains("-")) || (usrName.contains("@"))
				|| (usrName.contains("|"))) {
			System.out.println("validate failure");
			System.exit(1);
		}

		if ((usrPass.length() < 6) || (usrPass.length() > 12)) {
			System.out.println("validate failure");
			System.exit(1);
		}

		System.out.println("validate success");

	}
}
