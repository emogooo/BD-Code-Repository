package istisnason;

public class IstisnaSon {

    public static void main(String[] args) {
        try {
            islemYap(15, 0, 4);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getLocalizedMessage());
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("islem bitti");
    }
 
    static void islemYap(int a, int b, int c) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        
        if (b==0) {
            throw new ArithmeticException("Sıfıra bölünmez.");
        }
        else{
            System.out.println(a/b);
        }
        
        int dizi[]= new int[5];
        
        if (c>dizi.length) {
            throw new ArrayIndexOutOfBoundsException("Dizi sınırı aşıldı.");
        }
        else{
            System.out.println(dizi[c]);
        }
        
    }
}
