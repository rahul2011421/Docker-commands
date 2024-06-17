# Docker Commands Guide

This guide provides an overview of commonly used Docker commands with explanations and examples. Use this guide to efficiently manage Docker images and containers.



## Basic Commands

### Display Help
```sh
docker run --help
```
### Clear Screen
```sh
cls
```
### Check Docker Version
```sh
docker -v
docker --version
```

## Managing Images

### Pull an Image
```sh
docker pull image_name
```
### List Available Images
```sh
docker images
```
### Pull a Specific Version of an Image
```sh
docker pull openjdk:18
```
### Search for Images
```sh
docker search image_name
```

## Running Containers

### Run an Image (foreground)
```sh
docker run image_name_OR_Id
```
### List Running Containers
```sh
docker ps
```
### List All Containers (including stopped)
```sh
docker ps -a
```
### Run an Image with a Custom Container Name (detached)
##### To run the docker image, provide container_name by yourself and in last how to use it in detach mode by using (-d) by this detach we will get a big ID but still it will run and stop the image
```sh
docker run --name container_name -d image_name_OR_Id
```
### Run an Image in Interactive Mode (detached)
##### To run the image and access it we have to run it in INTERACTIVE mode by using the shortcut (-it) & now it will not stop
```sh
docker run --name container_name -it -d image_name_OR_Id
```
### Access or execute a Running Container
##### To go inside the container so that we can use it we need to go in EXECUTE mode by using(exec) // COMMAND_name ---- we can get this name after running the image
```sh
docker exec -it container_name_OR_Id COMMAND_name
```
### Exit a Container
##### To get out of EXECUTE mode every image has different commands
```sh
exit  # For general exit
exit()  # For Python
/exit  # For Java
exit  # For servers like nginx or Apache
```

## Environment Variables

### Run MySQL with Environment Variables
##### here mysql:tag---> tag means the version of MySQL you want if you have more than one software   /// mysql:tag(here mysql is image_name
```sh
docker run --name container_name -e MYSQL_ROOT_PASSWORD=password -d mysql:tag
```
### Access or execute MySQL Container
```sh
docker exec -it container_name_OR_Id bash
```

## Run Server Software Images

### Run Server Software with Port Mapping 
##### (-p) Here p stands for port, 8080 is the port number for exposing the software to hit on the browser and 80 is also the port number in docker on which we have exposed our 8080 port.
```sh
docker run --name container_name -d -p 8080:80 image_name
```

## Managing Containers

### Stop a Container
```sh
docker stop container_name_OR_Id
```
### Remove a Container
##### ( & here we can use the starting value of ID after that also it will work docker it identifies itself)
```sh
docker rm container_name_OR_Id
```
### Remove an Image
##### (only image name not an ID)
```sh
docker rmi image_name
```

## Inspecting and Logging

### Check Logs of a Container
```sh
docker logs container_name_OR_ID
```
### To see all the history of any container use (inspect)
```sh
docker inspect container_name_OR_Id
```
### Restart a Container
```sh
docker restart container_name_OR_Id
```

## Docker Hub

### Login to Docker Hub
##### To upload our images on the docker hub we have to first log into that
```sh
docker login
```
### Commit a Container
##### To create or save the image of the edited container on the local system
```sh
docker commit container_name new_image_name
```
### Push an Image to Docker Hub
##### To upload or push a docker image on the repository or docker hub 
```sh
docker push image_name
```
### Copy Image from Docker to Local System
```sh
docker cp container_name:source_path destination_path
```
### Logout from Docker Hub
```sh
docker logout
```

## Volume Management

### If we want docker containers should store the data for that
```sh
docker volume
```
