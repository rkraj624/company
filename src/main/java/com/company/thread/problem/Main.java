package com.company.thread.problem;

public class Main {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();

        new Thread(()->{
            try{
                for(int i = 0; i < 6; i++){
                    producerConsumer.produceItem(i);
                }
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                for(int i = 0; i < 6; i++)
                    producerConsumer.consumeItem();
            }catch (Exception ex){

            }
        }).start();
    }
}
