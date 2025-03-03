
class Main {
    public static void main(String[] args) {
        int value1 = 10, value2 = 4, diff = 0;
        
        if (value1 > value2) 
            diff = value1 - value2;
        


        else 
            diff = value2 - value1;
            System.out.println("Value 1 is not bigger than value 2, diff= " + diff);

        // if (value1 > value2) {
        //     diff = value1 - value2;
        // } else {
        //     diff = value2 - value1;
        //     System.out.println("Value 1 is not bigger than value 2, diff= " + diff);
        // }
    }
}