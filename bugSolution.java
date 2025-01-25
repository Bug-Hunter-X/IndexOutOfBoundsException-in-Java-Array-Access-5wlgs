public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            int index = 5; 
            if(index >= 0 && index < arr.length){
                System.out.println(arr[index]);
            } else {
                System.out.println("Index out of bounds");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}