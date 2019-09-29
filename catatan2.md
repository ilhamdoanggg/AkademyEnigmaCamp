### Array static

Integer array type

``` java
public static void main(String[] args) {
	Integer a[] = {3,9,1,0};
	System.out.print(a[0]);
	System.out.print(a[1]);
	System.out.print(a[2]);
	System.out.print(a[3]);
	/*jika di tambah lebih dari index*/
	System.out.print(a[4]);
	a[3]=11;
	System.out.print(a[3]);
}

```

String array type

```java
public static void main(String[] args) {
	String teman []= new  String[5];
        teman[0]="angga";
        teman[1]="sczcxc asda";
        teman[2]="sadjasd";
        teman[3]="tesada";
        teman[4]="asad sadaqw";
        System.out.println(teman[3]);
        /*akan erro jika lebih dari leng*/
        teman[5]="aasdyere";
}
```

fucking looping
### for

 format penulisan

```java
for (declar; condition; Increment) {
	}
```

```java
for (int i = 0; i<=7; i++) {
    System.out.println(i);
}
```

jika kondisi bernilai false maka langsung rejected

```java
for (int i = 0; i>3||i<=7 ; i++) {
     System.out.println(i);
}
```

```java
for (int i = 0; i>3&&i<=7 ; i++) {
    System.out.println(i);
}
```

 -break

```java
for (int i = 0; i<=10 ; i++) {
    if (i==5) break;
    System.out.println(i);
}
```

```java
for (int i = 0; i<=10 ; i++) {
    if (i==5) continue;
    System.out.println(i);
}
```

```java
for (int i = 0; i<=10 ; i++) {
        if (i==5||i==6||i==8) continue;
    System.out.println(i);
}
```
- perulangan di dalam perulangan shit
```java
for (int i = 5; i<=10 ; i++) {
    System.out.print(i +":");
        for (int j = 0; j <10 ; j++) {
            System.out.print(j);
        }
    System.out.println();
}
```