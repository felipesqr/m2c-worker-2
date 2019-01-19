# Sistema de Gestão de Erros do Mainframe2Cloud #





Start MySQL
docker run --network="host" --name mysql  -p 3306:3306 -e MYSQL_DATABASE=m2c -e MYSQL_USER=felipe -e MYSQL_PASSWORD=felipe -e MYSQL_ROOT_PASSWORD=root wangxian/alpine-mysql

Start ActiveMQ
docker run --name activemq -p 61616:61616 -p 8161:8161 rmohr/activemq
