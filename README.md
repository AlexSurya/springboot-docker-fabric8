# springboot-docker-fabric8
This project is build with springboot and fabric8 maven plugin

clone the project and update the project

open the root of the project folder on terminal
run the command to build the image => mvn clean package docker:build
note: change the image name if you dont want to push into dockerhub

command to build and push => mvn clean package docker:build docker:push
