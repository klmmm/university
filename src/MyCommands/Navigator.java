/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCommands;

import java.util.HashMap;

/**
 *
 * @author eskimo
 */
public class Navigator {

    private HashMap<String, INumber> hm;

    public Navigator() {
        hm = new HashMap<>();
        hm.put("1", new First());
        hm.put("2", new Second());
        hm.put("3", new Third());
        hm.put("4", new Fourth());
        hm.put("5", new Fifth());
        hm.put("close", new ExitCommand());
    }

    public INumber getCommand(String s) {
        INumber c = hm.get(s);
        if (c != null) {
            return c;
        }
        return new NoNumber();
    }
}
