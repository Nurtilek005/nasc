import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


             News n1 =   new Gadjet("ASUS TUF","risunok");
             News n2 =  new Gadjet("Naushnik","risunok");
             News n3 =  new MAgazine("Naushnik","risunok");
             News n4 = new MAgazine("Naushnik","risunok");
             News n5 =  new Newspaper("Naushnik","risunok");
             News n6 = new Newspaper("Naushnik","risunok");
             News [] newss = {n1,n2,n3,n4,n5,n6,};


        for (News news: newss) {
            news.rr();
            System.out.println("");

        }






    }

}



