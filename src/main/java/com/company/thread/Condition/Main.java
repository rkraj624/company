package com.company.thread.Condition;


public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        new Thread(()->{
            try{
                for(int i = 0; i < 6; i++){
                    sharedResource.produceItem(i);
                }
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                for(int i = 0; i < 6; i++)
                    sharedResource.consumeItem();
            }catch (Exception ex){

            }
        }).start();
    }
}
