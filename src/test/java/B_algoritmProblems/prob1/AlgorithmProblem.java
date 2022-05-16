package B_algoritmProblems.prob1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

class AlgorithmProblem {
    @Test
    void prob_1() {
        assertThat(solution1(Arrays.asList(10, 4, 5, 7, 6, 1, 9, 8), 14L),
                containsInAnyOrder(Arrays.asList("10 4", "9 5", "8 6").toArray()));

        assertThat(solution1(Arrays.asList(200, 20, 180, 170, 130, 10, 90, 80, 20, 10, 30, 40, 50), 220L),
                containsInAnyOrder(Arrays.asList("200 20", "130 90", "180 40", "170 50").toArray()));

        assertThat(solution1(Arrays.asList(0, 20, 40, 40, 30, 30, 50, 60, 70, 70, 0, 80, 10), 70L),
                containsInAnyOrder(Arrays.asList("40 30", "40 30", "50 20", "70 0", "70 0", "60 10").toArray()));
    }

    private List<String> solution1(List<Integer> inputs, Long checkSum) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < inputs.size(); i++) {
            int first = inputs.get(i);
            int j = i + 1;
            if (j < inputs.size()) do {
                int second = inputs.get(j);
                int sum = first + second;
                if (sum == checkSum && first != second) {
                    result.add(first > second ? first + " " + second : second + " " + first);
                    inputs.set(j, inputs.get(i + 1));
                    inputs.set(i + 1, second);
                    i++;
                    break;
                }
                j++;
            } while (j < inputs.size());
        }
        return result;
    }
}
