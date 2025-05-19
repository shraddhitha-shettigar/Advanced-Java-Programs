//Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.

package program_2;
public class PerformanceTestStringBufferStringBuilder {
    public static void main(String[] args) {
        // StringBuffer performance test
        StringBuffer stringBuffer = new StringBuffer();
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("AIET");
        }
        long endTime1 = System.nanoTime();
        long durationBuffer = endTime1 - startTime1;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // StringBuilder performance test
        StringBuilder stringBuilder = new StringBuilder();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("AIET");
        }
        long endTime2 = System.nanoTime();
        long durationBuilder = endTime2 - startTime2;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Comparison result
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}
