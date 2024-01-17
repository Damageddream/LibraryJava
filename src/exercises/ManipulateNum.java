package exercises;

public class ManipulateNum {
    int manipulateNum(int num){
        if(num > 999){
            return  num;
        } else if (num == 0) {
            return 0;
        } else {
            if(num < 10){
                return num * 1000;
            } else if (num < 100) {
                return num * 100;
            } else  {
                return num * 10;
            }

        }
    }
}
