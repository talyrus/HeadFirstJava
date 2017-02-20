class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5){
            //y = x - y;  //00 11 21 32 42

            //y = y + x;  //00 11 23 36 410

           // y = y + 2;  //02 14 25 36 47
            //if (y > 4) {
             //   y = y - 1;
            //}

            //x = x + 1; //11 34 59
            //y = y + x;

            if (y < 5) {    //02 14 36 48
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }

            }
            y = y + 2;

        System.out.print(x + "" + y + " ");
        x = x + 1;
        }
    }
}
