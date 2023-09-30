package com.example.myquizapplication;

public class QuestionAnswer {

    public static String question[]={
        "When an array is passed to a method, what does the method receive?",
        "Arrays in java are?"  ,
            "When is the object created with new keyword?"

    };
    public static String choices[][] = {
            {"The reference of the array" , "A copy of the array" , "Length of the array" , "Copy of first element"},
            {"Object references", "Objects", "Primitive data type", "None"},
            {"At run time","At compile time","Depends on the code","None"}

    };
    public static String correctAnswers[] = {
            "The reference of the array",
            "Objects",
            "At run time"
    };
}
