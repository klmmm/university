/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCommands;

/**
 *
 * @author eskimo
 */
public class First implements INumber{

    @Override
    public int execute() {
        System.out.println("number 1");
        return 1;
    }
    
}
