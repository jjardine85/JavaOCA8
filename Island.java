public class Island {
Island n;
public static void main(String[] args){
Island i2 = new Island();
Island i3 = new Island();
Island i4 = new Island();
i2.n = i3;
i3.n = i4;
i4.n = i2;
i2 = null;
i3 = null;

System.out.println(i4);
}



}