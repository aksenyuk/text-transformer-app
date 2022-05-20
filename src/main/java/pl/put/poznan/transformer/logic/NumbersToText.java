package pl.put.poznan.transformer.logic;

import java.util.Objects;

public class NumbersToText extends Decorator{

    public NumbersToText(TransformerInterface transformer){
        super(transformer);
    }

    public String transform(String text){
        return int_to_text(transformer.transform(text));
    }

    public static boolean isNumeric(String word) {
        try {
            Integer check_word = Integer.parseInt(word);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isDouble(String word) {
        try {
            Double check_word = Double.parseDouble(word);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String[] tens = {"", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};

    public static String[] nums = {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
            " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};

    public static String belowHundred(int number){
        String result = null;
        if (number < 20){
            result = nums[number % 100];
        }
        else if (number >= 20 && number < 100){
            result = nums[number % 10];
            number /= 10;

            result = tens[number % 10] + result;
        }
        return result;
    }

    public static String aboveHundred(int number, String code) {
        String output = null;
        if(Objects.equals(code, "int")){
            output = nums[number / 100] + " hundred" + belowHundred(number - 100 * (number / 100));
        }
        else{
            output = nums[number / 100] + belowHundred(number - 100 * (number / 100));
        }
        return output;
    }

    private String int_to_text(String text){
        String[] list_text = text.split(" ");
        for (int i = 0; i < list_text.length; i++){
            String result;
            if(isNumeric(list_text[i])){
                int number = Integer.parseInt(list_text[i]);

                if (number < 100){
                    result = belowHundred(number);
                }
                else{
                    result = aboveHundred(number, "int");
                }
                list_text[i] = result;
            }
            else{
                if(isDouble(list_text[i])){
                    String[] new_number = list_text[i].split("\\.");
                    int before_dot = Integer.parseInt(new_number[0]);
                    int after_dot = Integer.parseInt(new_number[1]);

                    if (before_dot < 100){
                        result = belowHundred(before_dot);
                    }
                    else{
                        result = aboveHundred(before_dot, "float");
                    }

                    if (after_dot % 10 < 10){
                        result += belowHundred(after_dot) + "tenth";
                    }
                    else{
                        result += aboveHundred(after_dot, "float") + "hundredth";
                    }
                    list_text[i] = result;
                }
            }
        }

        text = String.join(" ", list_text);
        return text;
    }

}
