# springboot-docker-fabric8
This project is build with springboot and fabric8 maven plugin

clone the project and update the project

open the root of the project folder on terminal
run the command to build the image => mvn clean package docker:build

note: change the image name if you dont want to push into dockerhub

command to build and push => mvn clean package docker:build docker:push


then go to the terminal typing the => docker images; that will show the list of images

to run the image => docker run --name containerName -d -p 8080:8080 imageName;

check the container is running or not => docker ps;

stop the container => docker stop containerId or containerName;

start the container => docker start containerId or containerName;

delete the container => docker rm conatinerId or containerName;

Note: before delete you have to stop the conatiner;

remove the image => docker rmi imageName or id;

Note: you  have to delete all the container before delete the image;

go to browser typing localhost:8080/hello thats will return hello world
and localhost:8080/swagger-ui.html to access swagerUi

#Happy coding

