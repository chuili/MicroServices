# MicroServices
## How to test Config Server
### Native Config Profile
{application}: Client's application name  
{profile}: Client's current active application profile  
{label}: Git branch

http://127.0.0.1:9090/{application}/{profile}  
E.g.: http://127.0.0.1:9090/employee-search-service/debug  
**Expected outcome:**  
{"name":"employee-search-service","profiles":["debug"],"label":null,"version":null,"state":null,"propertySources":[{"name":"file:C:/Project/Microservices/config-properties/employee-search-service-debug.properties","source":{"name":"Mason Home refresh"}},{"name":"file:C:/Project/Microservices/config-properties/application.properties","source":{"welcome.message":"Hello Spring Cloud"}}]}

http://127.0.0.1:9090/{properties_file}  
E.g.: http://127.0.0.1:9090/employee-serach-service-debug.properties  
**Expected outcome:**  
name: Mason Home refresh  
welcome.message: Hello Spring Cloud

### Git Config Profile
http://127.0.0.1:9090/{application}/{profile}  
E.g.: http://127.0.0.1:9090/employee-search-service/debug  
**Expected outcome:**  
{"name":"employee-search-service","profiles":["debug"],"label":null,"version":"925dbf055b10576cf08954d039920d74ab36d9e2","state":null,"propertySources":[{"name":"file:///C:/Project/MicroServices/config-properties-git/debug/employee-search-service.properties","source":{"name":"Mason Home Debug"}},{"name":"file:///C:/Project/MicroServices/config-properties-git/application.properties","source":{"welcome.message":"Hello Spring Cloud"}}]}

http://127.0.0.1:9090/{application}/{profile}/{label}  
E.g.: http:127.0.0.1:9090/employee-search-service/debug/master
