package SQL;

public class SQL {
    /**
     *  Distinct ----> count the distinct countries in the customers table
     *
     *  SELECT COUNT(*) AS DistinctCountries FROM (SELECT DISTINCT Country FROM Customers);
     *
     *  Where ------> query all the mexican customer in the customers table
     *
     *  SELECT * FROM Customers WHERE Country='Mexico';
     *
     *  AND -----> query all the customer from berlin german from Customers table.
     *
     *  SELECT * FROM Customers WHERE Country='German' AND City='Berlin';
     *
     *  
     */
}
