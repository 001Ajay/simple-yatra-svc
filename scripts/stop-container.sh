#!/bin/bash
set -e

docker stop $(docker ps -a -q)

# Stop the running container (if any)
echo "Container stopped successfully."