package SQL;

public class SQL {
    /**
     * ------------- SELECT --------------
     *  Distinct ----> count the distinct countries in the customers table
     *
     *  SELECT COUNT(*) AS DistinctCountries FROM (SELECT DISTINCT Country FROM Customers);
     *
     *  Where ------> query all the mexican customers in the customers table
     *
     *  SELECT * FROM Customers WHERE Country='Mexico';
     *
     *  AND -----> query all the customers from berlin german from Customers table.
     *
     *  SELECT * FROM Customers WHERE Country='German' AND City='Berlin';
     *
     *  OR -------> query all the customers from german or spain from Customers table
     *
     *  SELECT * FROM Customers WHERE Country='German' OR Country='Spain';
     *
     *  NOT ------> Query all the customers who are not from german from Customers table
     *
     *  SELECT * FROM Customers WHERE NOT Country='German';
     *
     *  ORDER BY -------> It is the keyword to sort the result-set in ascending or descending order.
     *  Query the shortest city and length of city in ascending order( if there are three options, choose the top 1)
     *  SELECT CITY, LENGTH(CITY) FROM Customers GROUP BY CITY ORDER BY LENGTH(CITY) ASC, CITY LIMIT 1;
     *  
     *  SELECT * FROM Customers ORDER BY Country;
     *
     *  TOP-------> SELECT TOP clause is used to specify the number of records to return
     *  SELECT TOP 4 * FROM Customers;
     *  SELECT * FROM Customers LIMIT 3;
     *  SELECT TOP 50 PERCENT * FROM Customers;
     *  SELECT TOP 4 * FROM Customers WHERE Country='Germany';
     *
     *  MAX & MIN-----------------> MAX return the biggest value of the selected column,
     *  SELECT MIN(Price) AS SmallestPrice FROM Products;
     *
     *  DIFFERENCE------------------> 2-1
     *  SELECT COUNT(City)-COUNT(DISTINCT City) FROM STATION;
     *
     *  MOD(4,2)=2;-------------------> remainder
     *  SELECT DISTINCT City FROM Customers WHERE MOD(ID,2)=0;
     *
     *
     *  ------------------ INSERT ---------------------
     *  INSERT INTO -----------> Insert the new record into the table.
     *
     *  INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
     *  VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', '4066', 'Norway');
     *
     *  insert data only in specified columns
     *  INSERT INTO Customers (CustomerName, City, Country) VALUES ('Cardinal', 'Stavanger', 'Norway');
     *
     *  ------------------- IS NULL / IS NOT NULL --------------
     *  it is impossible to test for null values with comparison operations such as =, <, >
     *  SELECT CustomerName, ContactName, Address FROM Customers WHERE Address IS NULL
     *
     *  ----------------------UPDATE-------------------
     *  the update statement is used to modify the existing records in a table.
     *
     *  UPDATE Customers SET ContactName='Alfred Schmidt', City='Frankfurt' WHERE CustomerID=1;
     *
     *  UPDATE Customers SET ContactName='jian' WHERE Country='Mexico';
     *
     *  ---------------------DELETE--------------------
     *  The delete statement is used to delete existing record in a table.
     *
     *  DELETE FROM Customers WHERE CustomerName='Alfreds Futterkiste';
     *
     *  */
}
