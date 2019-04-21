# MicroServices
## How to test Config Server
http://127.0.0.1:9090/{application}/{profile}  
E.g.: http://127.0.0.1:9090/employee-search-service/debug  
**Expected outcome:**  
{"name":"employee-search-service","profiles":["debug"],"label":null,"version":null,"state":null,"propertySources":[{"name":"file:C:/Project/Microservices/config-properties/employee-search-service-debug.properties","source":{"name":"Mason Home refresh"}},{"name":"file:C:/Project/Microservices/config-properties/application.properties","source":{"welcome.message":"Hello Spring Cloud"}}]}

http://127.0.0.1:9090/{properties_file}
E.g.: http://127.0.0.1:9090/employee-serach-service-debug.properties
**Expected outcome:**  
name: Mason Home refresh  
welcome.message: Hello Spring Cloud
