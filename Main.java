import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Just a simple list to hold our stuff
        ArrayList<String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String cmd;

        System.out.println("--- TO DO LIST ---");
        System.out.println("Commands: add, list, delete, quit");

        while (true) {
            System.out.print("> ");
            cmd = s.nextLine().trim().toLowerCase();

            if (cmd.equals("quit")) {
                System.out.println("See ya later!");
                break;
            }

            if (cmd.equals("add")) {
                System.out.print("What's the task? ");
                String task = s.nextLine();
                list.add(task);
                System.out.println("Added it.");

            } else if (cmd.equals("list")) {
                if (list.size() == 0) {
                    System.out.println("Nothing to do. Go take a nap.");
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                }

            } else if (cmd.equals("delete")) {
                System.out.print("Which number? ");
                try {
                    int num = Integer.parseInt(s.nextLine());
                    list.remove(num - 1);
                    System.out.println("Deleted.");
                } catch (Exception e) {
                    System.out.println("Oops, that didn't work. Use a valid number.");
                }

            } else {
                System.out.println("Unknown command. Try again.");
            }
        }
        s.close();
    }
}