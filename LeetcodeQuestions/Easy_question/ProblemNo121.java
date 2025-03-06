package main.java.shubham.Easy_question;

public class ProblemNo121 {

    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {7,6,4,3,1};
        int[] prices = {2,4,1};

        int ans = maxProfit(prices);

        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;

        for (int price : prices) {
            min = Math.min(price, min);
            max = Math.max(max, price - min);

        }
        return max;

    }

//    public static int maxProfit(int[] prices) {
//        int length = prices.length;
//
//        int buy = prices[0];
//        int sell = prices[0];
//
//        int maxProfit = sell-buy;
//
//        for (int i = 1; i<length; i++) {
//
//            if(prices[i] < prices[i-1] && prices[i] < buy) {
//                buy = prices[i];
//            }
//            else {
//                sell = prices[i];
//                int profit = sell - buy;
//
//                if (profit > maxProfit)
//                    maxProfit = profit;
//            }
//        }
//
//        if (maxProfit == 0)
//            return maxProfit;
//
//        return maxProfit;
//    }


//    public static int maxProfit(int[] prices) {
//        int length = prices.length;
//
//        int buy = prices[0];
//        int sell = 0;
//
//        int maxProfit = 0;
//
//        for (int i = 1; i<length; i++) {
//
//            if(prices[i] < prices[i-1]) {
//                buy = Math.min(buy, prices[i]);
//            }
//            else{
//                sell = prices[i];
//
//                maxProfit = Math.max(maxProfit, sell-buy);
//            }
//        }
//
//        if (maxProfit == 0)
//            return 0;
//        return maxProfit;
//    }
}
