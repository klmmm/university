/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCommands;

/**
 *
 * @author eskimo
 */
public class ExitCommand implements INumber{
    @Override
    public int execute() {
        System.out.println("Выход");
        return 0;
    }
    
}
