

public class prob744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int h = letters.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (letters[mid] <= target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return letters[l % letters.length];
    }
    public static void main(String[] args) {
        prob744 obj = new prob744();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(obj.nextGreatestLetter(letters, target));
    }
}
