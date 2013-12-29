/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCommands;

/**
 *
 * @author eskimo
 */
public class NoNumber implements INumber{

    @Override
    public int execute() {
        System.out.println("Что-то не то ты, парень, ввел");
        return 1;
    }
    
}
