package exercises.stringex.bilder;

public class Loading {
    public static void main(String[] args) {

        int index = 1;
        double loader = 0;
        StringBuilder sb=new StringBuilder("(          )");
        StringBuilder sb2 = new StringBuilder("/");
        while(loader < 100){
            sb2.setCharAt(0,'/');
            String format = "Wczytywanie %s %.2f %s\r";
            System.out.print(format.formatted(sb2,loader, sb.toString()));
            try{
                Thread.sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            loader+=0.5;
            sb2.setCharAt(0,'\\');
            if(loader%10==0){
                sb.setCharAt(index, '#');
                index++;
            }

            String format2 = "Wczytywanie %s %.2f %s\r";
            System.out.print(format2.formatted(sb2,loader, sb.toString()));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
