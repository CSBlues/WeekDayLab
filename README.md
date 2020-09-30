# DayOfWeek Lab

Write a program that outputs the day of 
the week for a given date! You program has just the main method and 
the `dayOfWeek` method below.  
Given the month, m, day, d and year y, the day (D) of the week(Sunday = 
0, Monday = 1, …, Saturday = 6) D is given by:

y_0 = y - (14 - m)/12

x_0 = y_0 + y_0/4 - y_0/100 + y_0/400

m_0 = m + 12 * ((14-m)/12)-2

D = (d + x_0 + 31 * m_0/12) % 7

```
public static String dayOfWeek(int m, int d, int y){
	// fill in code
}
```

