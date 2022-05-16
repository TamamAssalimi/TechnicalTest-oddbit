package B_algoritmProblems.prob2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class AlgorithmProblem {
    @Test
    void prob_2() {
        assertThat(
                solution1(
                        Arrays.asList(20, 2, 3, 10, 5), 3, 20
                )
                , is(
                        18
                )
        );

        assertThat(
                solution1(
                        Arrays.asList(-5, 8, 7, 2, 10, 1, 20, -4, 6, 9),
                        5, 30
                )
                , is(
                        29
                )
        );


    }

    private Integer solution1(List<Integer> inputs, Integer K, Integer X) {
        int Max_Sum = 0;
        for (int i = 0; i < K; i++) {
            Max_Sum += inputs.get(i);
        }
        int curr_sum = Max_Sum;
        for (int i = K; i < inputs.size(); i++) {
            curr_sum += inputs.get(i) - inputs.get(i - K);
            if (curr_sum < X) {
                Max_Sum = curr_sum;
            }
        }
        return Max_Sum;
    }

//    private Integer solution1(List<Integer> inputs, Integer K, Integer X) {
//        int Max_Sum = 0;
//        List<Integer> integerList = new ArrayList<>();
//        for (Integer i: inputs) {
//            Max_Sum += i;
//        }
//
//        int curr_sum = Max_Sum;
//        int result;
//        int tmp = 0;
//        for (Integer i : inputs) {
//            for (int j = K; j > 0; j--) {
//                result = curr_sum - i - inputs.get(j);
//                if (result < X) {
//                    if (result > tmp) {
//                        Max_Sum = result;
//                        tmp = result;
//                    }
//                }
//            }
//        }
//        return Max_Sum;
//    }
}
