import java.util.*;
public class vowel_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char A = sc.next().charAt(0);

        boolean is_vowel = false;
        char vowel[] = {'a', 'e', 'i', 'o', 'u'};

        for(int i=0;i<vowel.length;i++)
        {
            if(Character.toLowerCase(A)==vowel[i])
            {
                is_vowel = true;
            }
        }
        if(is_vowel == true)
        {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Not Vowel");
        }
        sc.close();
    }
}
