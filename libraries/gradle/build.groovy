void call() {
node {
docker.image("gradle:latest").inside() {
	stage("Build"){
	 gradle clean build
	}
     }
}
}
