public class Findthemissingletter_6kyu {

    public static char findMissingLetter(char[] array) {

        for (int i = 1; i < array.length; i++) {
            int diff = array[i] - array[i - 1];
            if (diff != 1) {
                return (char) (array[i] - 1);
            }
        }

        return 'x';
    }


    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'f'};
        System.out.println(findMissingLetter(chars));

        char[] chars1 = {'O', 'Q', 'R', 'S'};
        System.out.println(findMissingLetter(chars1));
    }
}
