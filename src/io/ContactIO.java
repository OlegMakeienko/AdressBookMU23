package io;

public class ContactIO {
    private String data;
    String[] words = data.split(" ");

    public void witchDataInString(String data){
        for (String word : words) {
            System.out.println(word);
        }
    }
}
