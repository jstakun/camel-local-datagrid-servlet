Camel Servlet and JBoss Data Grid example
=======================================

An example which shows how to use the Camel Servlet with JBoss Data Grid.

This project depends on cdm project: https://github.com/jstakun/cdm.

To run the example deploy it to JBoss EAP using mvn jboss-as:deploy.

POST http://localhost:8080/transaction-loader/camel/datagrid

POST http://192.168.122.78:8080/transaction-loader/camel/datagrid

putXml=<customerTransaction>
    <transactionid>29</transactionid>
    <customerid>CST01010</customerid> 
    <amount>523.45</amount>
</customerTransaction>

putJson={"transactionid":"30","customerid":"CST01010","amount":523.45,"transactionDate":1433313993}

GET http://localhost:8080/transaction-loader/camel/datagrid?getXml=29

GET http://localhost:8080/transaction-loader/camel/datagrid?getJson=29

------------------------




