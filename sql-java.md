
```java
try {
    /* test koneksi ke database*/
    Connection connection = DriverManager.getConnection
        (/*server*/"jdbc:postgresql://127.0.0.1:5432/school",
        /*username*/ "postgres",
        /*password*/"");
    
    Statement statement = connection.createStatement();
    ResultSet res =  statement.executeQuery("select * from students");

    for (int i = 0; true; i++) {
        if (res.next()){
            System.out.println(res.getString("student_name")+ ","
                    + res.getString("gender"));
        }else{
            break;
        }
    }
```