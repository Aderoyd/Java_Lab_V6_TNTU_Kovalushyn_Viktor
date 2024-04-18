import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("ua", "UA"));
        String result = generateString(33);
        String result2 = generateString();
        System.out.println("Згенерована стрічка: " + result);
        System.out.println("Згенерована стрічка 2: " + result2);
    }
    public static String generateString() {
        return generateString(10);
    }
    public static String generateString(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = new char[]{'\u0404', '\u0406', '\u0407', '\u0410', '\u0411', '\u0412', '\u0413', '\u0414', '\u0415', '\u0416', '\u0417', '\u0418', '\u0419',
                '\u041a', '\u041b', '\u041c', '\u041d', '\u041e', '\u041f', '\u0420', '\u0421', '\u0422', '\u0423', '\u0424', '\u0425', '\u0426', '\u0427', '\u0428',
                '\u0429', '\u042c', '\u042e', '\u042f', '\u0430', '\u0431', '\u0432', '\u0433', '\u0434', '\u0435', '\u0436', '\u0437', '\u0438', '\u0439', '\u043a',
                '\u043b', '\u043c', '\u043d', '\u043e', '\u043f', '\u0440', '\u0441', '\u0442', '\u0443', '\u0444', '\u0445', '\u0446', '\u0447', '\u0448', '\u0449',
                '\u044c', '\u044e', '\u044f', '\u0454', '\u0456', '\u0457', '\u0490', '\u0491'};

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(array[random.nextInt(66)]);
        }
        return stringBuilder.toString();
    }
}