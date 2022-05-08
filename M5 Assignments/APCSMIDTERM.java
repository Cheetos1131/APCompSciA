public class APCSMIDTERM {
    public static void main(String[] args) {
        int x;
        x = total(6, 0, 1);
        //System.out.println(x);
        //System.out.println((double)(9/2));
        //int i = 10;
        //while (i >= 0) {
            //if ((i%2)>0) {
                //System.out.print(i + " ");
            //}
            //i-=2;
        //}
        //Swapper L = new Swapper(10, 20);
        //L.swap();
        //L.test();
        //int i = 8;
        //while (i <= 25) {
            //System.out.println(i + " ");
            //if ((i%4)==0) {
                //i*=2;
            //}
            //else {
                //i-=2;
            //}
        //}
        //String str = "APCS Rocks!";
        //String str1 = str.substring(0,4);
        //String str2 = str1.substring(2);
        //String str3 = str2.substring(1);
        //System.out.println(str3);
        for (int k = 40; x>=1; x/=3) {
            System.out.println(k);
        }
    }

    public static int total(int r, int a, int b) {
        if (a==0){
            if (b==0) {
                return r*2;
            }
            return r/2;
        }
        else {
            return r*3;
        }
    }
    
}