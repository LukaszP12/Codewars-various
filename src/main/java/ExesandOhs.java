public class ExesandOhs {

    public static boolean getXO(String str) {
        int x_counter = 0;
        int o_counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if ("o".equals("" + Character.toLowerCase(str.charAt(i)))) {
                o_counter++;
            } else if ("x".equals("" + Character.toLowerCase(str.charAt(i)))) {
                x_counter++;
            }
        }

        return (o_counter == x_counter);
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }
}
