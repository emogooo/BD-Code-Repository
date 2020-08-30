package deneme3;

public class Deneme3 {

    public static void main(String[] args) {

        String a = "me2rhaba";
        
        String x="3";
        
        x+=x;
        
        int y = Integer.parseInt(x);
        
        System.out.println(y+4);
        
        String b = "a";
        
        b+=b;
        System.out.println(b);
        String fonk = "12";
        int sayac = 2;
        String s="";
        for (int j = 0; j < sayac; j++) {
                char sa=fonk.charAt(j);
                s+=String.valueOf(sa);
                
            }

        y=Integer.parseInt(s);
        
        System.out.println(y+1);

    }

}
