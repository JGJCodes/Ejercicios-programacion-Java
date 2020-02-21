/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploargumento;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(args.length);

        for(int j=0;j<n;j++){
            for(int i=1;i<args.length;i++){
                System.out.print(args[i]+ " ");
            }
            System.out.println();
        }

    }

}
