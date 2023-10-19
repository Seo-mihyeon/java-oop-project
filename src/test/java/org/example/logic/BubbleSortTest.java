package org.example.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void test(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(3,2,5,6,11,1));

        assertEquals(List.of(1,2,3,5,6,11), actual);

    }
}