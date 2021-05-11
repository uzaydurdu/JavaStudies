
public class Ders015StringBirlestirme {
	public static void main(String[] args) {
		// String assimbling
		// String str2,str3
		// String assimbling with + operant
		String str2 = "Malatya";
		String str3 = "İstanbul";
		String result = str2 + " " + str3;
		System.out.println(result);

		// concat = String assimbling
		String str6 = "Merhaba";
		System.out.println(str6.concat((" " + str2)));

		// StringBuilder
		String beginning = "Uzay Durdu";
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" ").append(" HTML5 ").append(" CSS3 ").append(" JS ").append(" Bootstrap ");
		String turningString = stringBuilder.toString();
		System.out.println(turningString);
	}
}
