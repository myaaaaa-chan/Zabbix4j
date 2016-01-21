#Zabbix4j

Zabbix4j is a Zabbix API library for the Java language.

Zabbix4j includes software from JSON.org to parse JSON response from the Zabbix API.
You can see the license term at http://www.JSON.org/license.html

Zabbix4j classes and methods structure is based on Zabbix API vsersion 2.2.
You should see [Zabbix API document](https://www.zabbix.com/documentation/2.2/manual/api)

## Usage

How to create new Host.

```
String user = "admin";
String password = "zabbix";

// login to zabbix
ZabbixApi zabbixApi = new ZabbixApi("http://localhost/zabbix/api_jsonrpc.php");
zabbixApi.login(user, password);

final Integer groupId = 25;
final Integer templateId = 10093;

HostCreateRequest request = new HostCreateRequest();
HostCreateRequest.Params params = request.getParams();
params.addTemplateId(templateId);
params.addGroupId(groupId);

// set macro
List<Macro> macros = new ArrayList<Macro>();
Macro macro1 = new Macro();
macro1.setMacro("{$MACRO1}");
macro1.setValue("value1");
macros.add(macro1);
params.setMacros(macros);

// set host interface
HostInterfaceObject hostInterface = new HostInterfaceObject();
hostInterface.setIp("192.168.255.255");
params.addHostInterfaceObject(hostInterface);

params.setHost("test host created1." + new Date().getTime());
params.setName("test host created1 name" + new Date().getTime());

HostCreateResponse response = zabbixApi.host().create(request);

int hostId = response.getResult().getHostids().get(0);

//set search
ItemGetRequest request = new ItemGetRequest();
ItemGetRequest.Params params = request.getParams();
String key = "web.test.in[f95b885a65,f95b885a65,bps]";
List<Integer> hostids = new ArrayList<>();
hostids.add(11785);
params.setHostids(hostids);
params.setWebitems(true);
Map<String, String> search = new HashMap<String,String>();
search.put("key_", key);
params.setSearch(search);
ItemGetResponse response = zabbixApi.item().get(request);

```


## How to release

$ ./gradlew build

## How to make jar

$ ./gradlew jar

## How to makr source.jar

$./gradlew task sourcesJar

## How to makr javadoc.jar

$./gradlew task javadocJar

## Use via Maven

```
<dependency>
	<groupId>com.github.0312birdzhang</groupId>
	<artifactId>zabbix4j</artifactId>
	<version>0.1.3</version>
</dependency>
```


## License

This software is distributed under the MIT License.
