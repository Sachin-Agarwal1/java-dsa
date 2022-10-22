public class char_patern_1 {
    public static void main(String args[]){
     
        for (int line = 1; line <= 4; line++)
        {
            for (int chars = 1; chars <= line; chars++ )
             {
            System.out.print((char)('A'+(chars-1)));
           
             }
            System.out.println();
        }
    }
    
}
