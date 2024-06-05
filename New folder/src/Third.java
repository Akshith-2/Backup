import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
public class Third {
    public static void main(String[] args){
        Train.Ac b=new Train.Ac(3,"Akshith","Male");
        b.display();
        Train.NonAc q=new Train.NonAc(5,"Bot","Female");
        q.display();
        Train t=new Train();
        t.display();
    }
}
class Train{
    int TrainNo;
    static int i=0;

    static HashMap<Integer,String[]> commondetails=new HashMap<>();
    String name,gender;
    static class Ac extends Train{

        static ArrayList<String[]> ac=new ArrayList<>();
        Ac(int TN,String a,String g){

            this.TrainNo=TN;
            this.name=a;
            this.gender=g;
            String[] b=new String[3];
            b[0]=""+TrainNo;
            b[1]=name;
            b[2]=gender;
            commondetails.put(i,b);
            ac.add(b);
            i++;

        }
        void display(){
            Random r=new Random();
            System.out.println("id :"+r.nextInt(4000));
            System.out.println("Details of Ac Passengers:");
            for(String[] s:ac){
                System.out.println(Arrays.toString(s));
            }
        }
    }

       static class NonAc extends Train {

            static ArrayList<String[]> nonac = new ArrayList<>();

            NonAc(int TN, String a, String g) {
                this.i=i;

                this.TrainNo = TN;
                this.name = a;
                this.gender = g;
                String[] b = new String[3];
                b[0] = "" + TrainNo;
                b[1] = name;
                b[2] = gender;
                commondetails.put(i, b);
                nonac.add(b);
                i++;
            }

            void display() {
                Random r=new Random();

                System.out.println("id :"+r.nextInt(4000));
                System.out.println("Details of NonAc Passengers:");
                for (String[] s : nonac) {
                    System.out.println(Arrays.toString(s));
                }
            }
        }
    void display() {
        System.out.println("Details of All Passengers:");
        for (int e : commondetails.keySet()) {
            System.out.println(e + " " + Arrays.toString(commondetails.get(e)));
        }
    }
}