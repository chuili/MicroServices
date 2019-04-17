# MicroServices
## How to test Config Server
http://127.0.0.1:9090/config/default/master  
**Expected outcome:**  
{"name":"config","profiles":["default"],"label":"master","version":null,"state":null,"propertySources":[{"name":"file:C:/Project/Microservices/config-properties/global/default/application.properties","source":{"welcome.message":"Hello Spring Cloud"}}]}
