#!/bin/sh

if [ -n "$1" ]; then
	cd ./v0.1.0
	echo "Running v0.1.0"
	./run-all.sh $1
	cd ..
	
else
	echo "Error, falta especificar nombre de la base de datos como parametro..."
fi

