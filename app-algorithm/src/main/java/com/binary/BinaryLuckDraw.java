package com.binary;

import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * 二分法抽奖
 */
public class BinaryLuckDraw {

    Map<Integer, ScoreBean> map = new HashMap<>();

    List<Map<String, Integer>> list = new ArrayList<>();

    public static int binarySearch(Integer[] srcArray, int des) {
        int low = 0;
        int high = srcArray.length - 1;
        while ((low <= high) && (low <= srcArray.length - 1) && (high <= srcArray.length - 1)) {
            int middle = (high + low) >> 1;
            if (des == srcArray[middle]) {
                return middle;
            } else if (des < srcArray[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    @Before
    public void setUp() throws Exception {
        // 概率
//        10,24,6,34,26
        Integer[] chances = {10, 20, 10, 40, 20};
        int aMin = 0;
        for (int i = 0; i < chances.length; i++) {
            //1二分法计算
            ScoreBean scoreBean = new ScoreBean();
            scoreBean.setaMin(aMin + 1);
            aMin += chances[i];
            scoreBean.setMax(aMin);
            map.put(i, scoreBean);

            //2相加法计算
            Map<String, Integer> tempMap = new HashMap<>();
            tempMap.put("HTTP", chances[i]);
            list.add(tempMap);
        }
    }

    /**
     * 二分法抽奖
     */
    @Test
    public void test1() throws Exception {
        for (int i = 1; i <= 100; i++) {
//            Integer des = getRandDigital(100);
            int low = 0;
            int high = map.keySet().size();
            int middle = 0;
            while ((low <= high) && (low <= map.keySet().size()) && (high <= map.keySet().size())) {
                middle = (high + low) >> 1;
                if (map.get(middle).getaMin() <= i && i <= map.get(middle).getMax()) {
                    break;
                } else if (i > map.get(middle).getMax()) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
            System.out.println("des:" + String.format("%03d", i) + ",middle:" + middle + "," + JSON.toJSONString(map.get(middle)));
        }
    }

    @Test
    public void test2() throws Exception {
		for (int rand = 1; rand <= 100; rand++) {
			int weight = 0;
			int temp = 0;
			for (int j = 0; j < list.size(); j++) {
				weight += list.get(j).get("HTTP");
				if (rand <= weight) {
					temp = j;
					break;
				}
			}
			System.out.println(rand + ":" + JSON.toJSONString(list.get(temp)));
		}
	}

    private int getRandDigital(int num) throws Exception {
        Random random = new Random();
        int rand = random.nextInt(num) + 1;
        return rand;
    }
}
