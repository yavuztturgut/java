import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] titles = new String[99];
    static String[] notes = new String[99];
    static int x = 0;

    public static void main(String[] args) {
        while (true){
            System.out.println("1 for adding a note\n2 for viewing a note\n3 for deleting a note");
            int input = sc.nextInt();
            sc.nextLine();

            if(input == 1){
                add();
            }
            else if(input == 2){
                print();
            }
            else if(input == 3){
                delete();
            }
            else{
                System.out.println("Invalid input! Please try again.");
            }
        }
    }

    public static void add(){
        System.out.println("Enter title: ");
        titles[x] = sc.nextLine();
        System.out.println("Enter note: ");
        notes[x] = sc.nextLine();
        System.out.println("Note added successfully!");
        x++;
    }

    public static void print(){
        System.out.println("Enter the index of the note: ");
        int index = sc.nextInt();
        sc.nextLine(); 

        if(index >= 0 && index < x){ 
            System.out.println("Title: " + titles[index]);
            System.out.println("Note: " + notes[index]);
        }
        else{
            System.out.println("Invalid index! Please try again.");
        }
    }

    public static void delete(){
        System.out.println("Enter the index of the note you want to delete: ");
        int index = sc.nextInt();
        sc.nextLine(); 

        if(index >= 0 && index < x){ 
            for(int i = index; i < x - 1; i++){
                titles[i] = titles[i + 1];
                notes[i] = notes[i + 1];
            }
            x--; 
            System.out.println("Note deleted successfully!");
        }
        else{
            System.out.println("Invalid index! Please try again.");
        }
    }
}
