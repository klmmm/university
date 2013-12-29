/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import MyCommands.Navigator;
import java.util.Scanner;

public class Command {

    public static void main(String[] args) {
        Navigator n = new Navigator();
        Scanner sc = new Scanner(System.in);
        String command;
        do {
            command = sc.next();
        } while (n.getCommand(command).execute() != 0);
    }
}
