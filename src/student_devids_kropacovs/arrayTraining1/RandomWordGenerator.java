package student_devids_kropacovs.arrayTraining1;

public class RandomWordGenerator {
    public static void main(String[] args) {
        String[] colors = {"Red","Blue","Orange","Black","Pink"};
        int numOfWords = colors.length;
        int random = (int) (Math.random() * numOfWords);
        String randomCarColor = colors[random];
        System.out.println("Random color for your car is: " + randomCarColor);
    }
}
