
public class Sandbox {

    public static void main(String[] args) {

        String value = "kodlamayiSeviyorum";
        String newValue = "";

        for (int i = value.length() - 1; i >= 0; i--) {
            newValue += value.charAt(i);
        }

        System.out.println(newValue);
    }
}
