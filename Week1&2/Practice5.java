public class Practice5{
    public static void main(String[] args){
        int pen=14;
        int student=3;
        int perstd=(pen/student);
        int rem=(pen%student);
        System.out.println(String.format("The Pen Per Student is %d and the remaining pen not distributed is %d",perstd,rem));
    }
}