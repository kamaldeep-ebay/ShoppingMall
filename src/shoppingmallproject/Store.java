/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingmallproject;

import javax.swing.JList;

/**
 *
 * @author 
 */
public interface Store 
{
    public void fill(int x[],JList k);
    public int calculate(int t1);
    public int deduct(int t2);
}
