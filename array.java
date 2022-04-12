public class array {
    public static void main(String[] args){
        String[] misc = {"A", "B", "C", "D", "E", "F"};
        
        for(int i = 0; i < misc.length-1; i ++){
            String temp = misc[i];
            misc[i] = misc[i+1];
            misc[i+1] = temp;
        }

        for(int x = 0; x < misc.length; x ++){
            System.out.println(misc[x]);
        }
    }
}