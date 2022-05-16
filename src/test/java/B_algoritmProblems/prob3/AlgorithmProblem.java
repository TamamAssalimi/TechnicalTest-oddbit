package B_algoritmProblems.prob3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class AlgorithmProblem {
    @Test
    void prob_3() {
        assertThat(
                solution(
                        Arrays.asList("frown", "front", "frost", "frozen", "frame", "flag"),
                        Arrays.asList("fro??", "fr???", "fro???", "pro?")
                )
                , is(
                        Arrays.asList(3, 4, 1, 0)
                )
        );
    }

    static class Trie {
        char data;
        private int count;
        boolean isEnd;
        private final LinkedList<Trie> child;

        Trie(char c) {
            child = new LinkedList();
            isEnd = false;
            data = c;
            count = 0;
        }

        public Trie getChild(char c) {
            for (Trie eachChild : child)
                if (eachChild.data == c)
                    return eachChild;
            return null;
        }

        public void insert(String str) {
            if (find(str))
                return;
            Trie curr = this;
            for (char c : str.toCharArray()) {
                Trie child = getChild(c);
                if (null != child) curr = child;
                else {
                    curr.child.add(new Trie(c));
                    curr = curr.getChild(c);
                }
                curr.count++;
            }
            curr.isEnd = true;
        }

        public boolean find(String word) {
            Trie current = this;
            for (char ch : word.toCharArray())
                if (current.getChild(ch) == null)
                    return false;
                else current = current.getChild(ch);
            return current.isEnd;
        }

        public int search(String str) {
            Trie curr = this;
            String[] split = str.split("\\?");
            int regexSize = str.length() - split[0].length();
            int total = 0;
            for (char c : str.toCharArray()) {
                if (c == '?')
                    break;
                if (curr.getChild(c) == null)
                    return 0;
                else {
                    curr = curr.getChild(c);
                    total = curr.count;
                }
            }
            if (regexSize > 0)
                total = getFinalCount(curr, regexSize - 1, 0);
            return total;
        }

//        Arrays.asList("frown", "front", "frost", "frozen", "frame", "flag"),
//         Arrays.asList("fro??", "fr???", "fro???", "pro?")

        public int getFinalCount(Trie input, int size, int total) {
            Trie tmp = new Trie(' ');
            int index = 0;
            for (Trie t : input.child) {
                if (t.data == tmp.data) {
                    index++;
                    t = tmp;
                } else
                    index = 0;
                total = getLastChild(t, size, total, index);
                tmp = t;
            }
            return total;
        }

        public int getLastChild(Trie input, int size, int total, int index) {
            if (size == 0 && input.isEnd) {
                total = total + 1;
                return total;
            }
            if (input.isEnd)
                return total;
            Trie t = input.child.get(index);
            size--;
            return getLastChild(t, size, total, 0);
        }
    }


    private List<Integer> solution(List<String> words, List<String> queries) {
        Trie t = new Trie(' ');
        words.forEach(t::insert);
        List<Integer> answer = queries
                .stream().map(t::search)
                .collect(Collectors.toList());
        int ansIdx = 0;
        return answer;
    }
}
