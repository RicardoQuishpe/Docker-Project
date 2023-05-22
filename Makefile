build-image:
	@ docker build -f devops/Dockerfile -t grupo5backend:1 .
volume:
	@ docker volume create pg_grupo5_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml grupo5
rm:
	@ docker stack rm grupo5