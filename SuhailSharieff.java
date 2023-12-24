import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class demo {
    private int num;
    private String name;

    public demo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("ROLL no: " + (num+1) + " NAME: " + name);
        return super.toString();
    }
}

public class SuhailSharieff {

    public static void main(String[] args) {
        List<demo> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of candidates:");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of student with roll no " + (i + 1) + ":");
            String na = sc.nextLine();
            li.add(new demo(i, na));
        }

        Comparator<demo> c = new Comparator<demo>() {
            public int compare(demo x, demo y) {
                if (x.getName().charAt(0) > y.getName().charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(li, c);
        System.out.println("Sorting as per alphabets:");
        System.out.println(li.toString());

        Comparator<demo> d = new Comparator<demo>() {
            public int compare(demo x, demo y) {
                if (x.getNum() > y.getNum()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(li, d);
        System.out.println("Sorting as per number:");
        System.out.println(li.toString());
    }
}
