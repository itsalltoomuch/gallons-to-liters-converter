### This is a simple Java console app that convert gallons to liters

## Briefly introduction: 
Reference: https://www.calculatorful.com/gallons-to-liters 

In England, the gallon was the foundation of systems for measuring wine and beer. The gallon sizes employed in these two systems differed: the first was based on the wine gallon (equivalent to the US gallon), and the second on either the ale gallon or the bigger imperial gallon.

The litre or liter is a metric unit of volume. It is equal to 1 cubic decimetre, 1000 cubic centimetres or 0.001 cubic metre

### [How many liters in a gallon](https://www.calculatorful.com/gallons-to-liters)? 

There are 3.7854 liters in a gallon. Therefore, when converting from gallon to liters, we multiply the value in gallon with 3.7854 and change the unit from gallons to liters. For example, to convert 10 gallons to liters:
```
10 * 3.7854 = 37,854 (l)
```

## A simple Java program to generate a conversion table
```

public class GallonToLiterConverter {
    public static void main(String[] args) {
        double gallons, liters;

        // 1 liter equals 3.7854 gallons
        System.out.println("GALLONS\t\t\t\tLITERS");
        for (gallons = 1; gallons <= 10; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(String.format("%.2f", gallons) + "\t\t\t\t" + String.format("%.2f", liters));
        }
    }
}

```
- System.out.println() is a statement which prints the argument passed to it. The println() method display results on the monitor
- String.format(...) method returns the formatted string by given locale, format and arguments
- The Java for loop is used to iterate a part of the program several times. In this case, the code in the for block is run 10 times

The result of above function is as follow:
| GALLONS            | LITERS           |
| ------------------ | ------------------------------------------------------------ |
|1.00|3.79|
|2.00|7.57|
|3.00|11.36|
|4.00|15.14|
|5.00|18.93|
|6.00|22.71|
|7.00|26.50|
|8.00|30.28|
|9.00|34.07|
|10.00|37.85|