package hastaneplus;

public class Doktor {
    
    int no;
    String isim;
    String uzmanlikAlani;
    int tecrube;
    static int noa=0;
    
    public Doktor(){

        no=++noa;
        isim="";
        uzmanlikAlani="";
        tecrube=0;
        System.out.println("Yeni doktor sisteme eklendi!");
    }
    
    public Doktor(int no, String isim, String uzmanlikAlani, int tecrube){
    
        this();
        this.no=no;
        this.isim=isim;
        this.uzmanlikAlani=uzmanlikAlani;
        this.tecrube=tecrube;
        
    }
    
}
