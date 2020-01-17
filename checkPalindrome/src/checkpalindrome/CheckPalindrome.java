/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpalindrome;

/**
 *
 * @author gshimabuko
 */
public class CheckPalindrome {

    /**
     * @param args the command line arguments
     */
    public static boolean checkPalindrome(String inputString) {
    int i=inputString.length();
    int j = i;
    i=i-1;
    boolean result = true;
    int t=0;
    if (i==0)
    {
        result=true;
    }
    else
    {
        do
        {
            if (inputString.charAt(i)!=inputString.charAt(t))
            {
                result = false;
            }
            else
            {
                result=true;
            }
            i=i-1;
            t=t+1;
        }while((i>=j/2)&&(result==true));
    }
    
    return(result);
    

}

    
}
