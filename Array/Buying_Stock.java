public class Buying_Stock {

    public static int BuyAndSellStock(int prices []){

        int buyPrice = Integer.MAX_VALUE;
        
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++ ){

            if(buyPrice<prices[i]){ //profit
               int profit = prices[i]-buyPrice;
               
               maxProfit = Math.max(maxProfit, profit);//2.10.9

            }else{
                buyPrice = prices[i];
            }

        }
        return maxProfit;
    }


    public static void main(String args[]){
        
        int prices[] = {10, 12,19,21,2};



        System.out.println(BuyAndSellStock(prices));

    }
    
}