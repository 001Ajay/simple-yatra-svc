#!/bin/bash
set -e

# Pull the Docker image from Docker Hub
docker pull ajaydas5478/simple-yatra-svc:latest

# Run the Docker image as a container
docker run -dit -p 9091:80 ajaydas5478/simple-yatra-svc