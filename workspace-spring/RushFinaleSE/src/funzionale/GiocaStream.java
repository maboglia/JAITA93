package funzionale;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class GiocaStream {

	public static void main(String[] args) {
		
		int[] numeri = IntStream
			.range(1, 101)
			.skip(60)
			.map(n -> n*2)
			.filter(n -> n%3==0)
//			.average()
			.toArray();
		
		IntSummaryStatistics summaryStatistics = IntStream.of(23,25,24,27,30,28,28,27,30,21).summaryStatistics();
		
		System.out.println(summaryStatistics);
		

	}

}
