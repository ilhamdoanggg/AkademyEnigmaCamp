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

